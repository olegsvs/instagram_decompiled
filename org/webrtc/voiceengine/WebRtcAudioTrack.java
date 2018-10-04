package org.webrtc.voiceengine;

import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
import org.webrtc.ThreadUtils;
import org.webrtc.ThreadUtils.ThreadChecker;

public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE;
    private static final String TAG = "WebRtcAudioTrack";
    private static ErrorCallback errorCallback = null;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld = null;
    public static volatile boolean speakerMute = false;
    private static int usageAttribute;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread = null;
    public AudioTrack audioTrack = null;
    public ByteBuffer byteBuffer;
    public byte[] emptyBytes;
    public final long nativeAudioTrack;
    private final ThreadChecker threadChecker = new ThreadChecker();

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public class AudioTrackThread extends Thread {
        private volatile boolean keepAlive = true;

        public AudioTrackThread(String str) {
            super(str);
        }

        public void run() {
            Process.setThreadPriority(-19);
            String str = WebRtcAudioTrack.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrackThread");
            stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
            Logging.m29383d(str, stringBuilder.toString());
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                int writeOnLollipop;
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
                    writeOnLollipop = writeOnLollipop(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                } else {
                    writeOnLollipop = writePreLollipop(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                }
                if (writeOnLollipop != capacity) {
                    str = WebRtcAudioTrack.TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("AudioTrack.write played invalid number of bytes: ");
                    stringBuilder.append(writeOnLollipop);
                    Logging.m29384e(str, stringBuilder.toString());
                    if (writeOnLollipop < 0) {
                        this.keepAlive = false;
                        webRtcAudioTrack = WebRtcAudioTrack.this;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("AudioTrack.write failed: ");
                        stringBuilder.append(writeOnLollipop);
                        WebRtcAudioTrack.reportWebRtcAudioTrackError(webRtcAudioTrack, stringBuilder.toString());
                    }
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                String str2 = WebRtcAudioTrack.TAG;
                Logging.m29383d(str2, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.m29383d(str2, "AudioTrack.stop is done.");
                } catch (IllegalStateException e) {
                    str = WebRtcAudioTrack.TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("AudioTrack.stop failed: ");
                    stringBuilder.append(e.getMessage());
                    Logging.m29384e(str, stringBuilder.toString());
                }
            }
        }

        public void stopThread() {
            Logging.m29383d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }

        private int writeOnLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer, i, 0);
        }

        private int writePreLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i);
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private static int getDefaultUsageAttributeOnLollipopOrHigher() {
        return 2;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    private native void nativeGetPlayoutData(int i, long j);

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
    }

    public WebRtcAudioTrack(long j) {
        this.threadChecker.checkIsOnValidThread();
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ctor");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m29383d(str, stringBuilder.toString());
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        Logging.m29383d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("nativeOutputSampleRate: ");
        stringBuilder.append(nativeOutputSampleRate);
        Logging.m29383d(str, stringBuilder.toString());
        if (i != nativeOutputSampleRate) {
            Logging.m29387w(str, "Unable to use fast mode since requested sample rate is not native");
        }
        if (usageAttribute != DEFAULT_USAGE) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("A non default usage attribute is used: ");
            stringBuilder.append(usageAttribute);
            Logging.m29387w(str, stringBuilder.toString());
        }
        return new AudioTrack(new Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private static int getDefaultUsageAttribute() {
        return WebRtcAudioUtils.runningOnLollipopOrHigher() ? getDefaultUsageAttributeOnLollipopOrHigher() : 0;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m29383d(TAG, "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m29383d(TAG, "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(0);
    }

    private boolean initPlayout(int i, int i2) {
        this.threadChecker.checkIsOnValidThread();
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("initPlayout(sampleRate=");
        stringBuilder.append(i);
        stringBuilder.append(", channels=");
        stringBuilder.append(i2);
        stringBuilder.append(")");
        Logging.m29383d(str, stringBuilder.toString());
        this.byteBuffer = ByteBuffer.allocateDirect((i2 * 2) * (i / BUFFERS_PER_SECOND));
        stringBuilder = new StringBuilder();
        stringBuilder.append("byteBuffer.capacity: ");
        stringBuilder.append(this.byteBuffer.capacity());
        Logging.m29383d(str, stringBuilder.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2);
        str = TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("AudioTrack.getMinBufferSize: ");
        stringBuilder.append(minBufferSize);
        Logging.m29383d(str, stringBuilder.toString());
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return false;
        } else if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return false;
        } else {
            try {
                if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
                    this.audioTrack = createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, minBufferSize);
                } else {
                    this.audioTrack = createAudioTrackOnLowerThanLollipop(i, channelCountToConfiguration, minBufferSize);
                }
                AudioTrack audioTrack = this.audioTrack;
                if (audioTrack != null) {
                    if (audioTrack.getState() == 1) {
                        logMainParameters();
                        logMainParametersExtended();
                        return true;
                    }
                }
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return false;
            } catch (IllegalArgumentException e) {
                reportWebRtcAudioTrackInitError(e.getMessage());
                releaseAudioResources();
                return false;
            }
        }
    }

    private boolean isVolumeFixed() {
        if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return this.audioManager.isVolumeFixed();
        }
        return false;
    }

    private void logMainParameters() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioTrack: session ID: ");
        stringBuilder.append(this.audioTrack.getAudioSessionId());
        stringBuilder.append(", channels: ");
        stringBuilder.append(this.audioTrack.getChannelCount());
        stringBuilder.append(", sample rate: ");
        stringBuilder.append(this.audioTrack.getSampleRate());
        stringBuilder.append(", max gain: ");
        stringBuilder.append(AudioTrack.getMaxVolume());
        Logging.m29383d(str, stringBuilder.toString());
    }

    private void logMainParametersExtended() {
        if (WebRtcAudioUtils.runningOnMarshmallowOrHigher()) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrack: buffer size in frames: ");
            stringBuilder.append(this.audioTrack.getBufferSizeInFrames());
            Logging.m29383d(str, stringBuilder.toString());
        }
        if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            str = TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrack: buffer capacity in frames: ");
            stringBuilder.append(this.audioTrack.getBufferCapacityInFrames());
            Logging.m29383d(str, stringBuilder.toString());
        }
    }

    private void logUnderrunCount() {
        if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("underrun count: ");
            stringBuilder.append(this.audioTrack.getUnderrunCount());
            Logging.m29383d(str, stringBuilder.toString());
        }
    }

    private void releaseAudioResources() {
        Logging.m29383d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    public static void reportWebRtcAudioTrackError(WebRtcAudioTrack webRtcAudioTrack, String str) {
        webRtcAudioTrack = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Run-time playback error: ");
        stringBuilder.append(str);
        Logging.m29384e(webRtcAudioTrack, stringBuilder.toString());
        WebRtcAudioUtils.logAudioState(webRtcAudioTrack);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback = errorCallback;
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Init playout error: ");
        stringBuilder.append(str);
        Logging.m29384e(str2, stringBuilder.toString());
        WebRtcAudioUtils.logAudioState(str2);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback = errorCallback;
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Start playout error: ");
        stringBuilder.append(audioTrackStartErrorCode);
        stringBuilder.append(". ");
        stringBuilder.append(str);
        Logging.m29384e(str2, stringBuilder.toString());
        WebRtcAudioUtils.logAudioState(str2);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback = errorCallback;
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Default usage attribute is changed from: ");
            stringBuilder.append(DEFAULT_USAGE);
            stringBuilder.append(" to ");
            stringBuilder.append(i);
            Logging.m29387w(str, stringBuilder.toString());
            usageAttribute = i;
        }
    }

    public static void setErrorCallback(ErrorCallback errorCallback) {
        Logging.m29383d(TAG, "Set extended error callback");
        errorCallback = errorCallback;
    }

    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.m29383d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setSpeakerMute(");
        stringBuilder.append(z);
        stringBuilder.append(")");
        Logging.m29387w(str, stringBuilder.toString());
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setStreamVolume(");
        stringBuilder.append(i);
        stringBuilder.append(")");
        Logging.m29383d(str, stringBuilder.toString());
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.m29384e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        AudioTrackStartErrorCode audioTrackStartErrorCode;
        StringBuilder stringBuilder;
        this.threadChecker.checkIsOnValidThread();
        Logging.m29383d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                audioTrackStartErrorCode = AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                stringBuilder = new StringBuilder();
                stringBuilder.append("AudioTrack.play failed - incorrect state :");
                stringBuilder.append(this.audioTrack.getPlayState());
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, stringBuilder.toString());
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            audioTrackStartErrorCode = AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrack.play failed: ");
            stringBuilder.append(e.getMessage());
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, stringBuilder.toString());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        String str = TAG;
        Logging.m29383d(str, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m29383d(str, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS)) {
            str = TAG;
            Logging.m29384e(str, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(str);
        }
        Logging.m29383d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }
}
