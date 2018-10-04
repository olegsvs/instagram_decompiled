package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.ThreadUtils.ThreadChecker;
import org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback;
import org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode;

public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_USAGE = getDefaultUsageAttribute();
    private static final String TAG = "WebRtcAudioTrackExternal";
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    private final Context context;
    public byte[] emptyBytes;
    private final AudioTrackErrorCallback errorCallback;
    public long nativeAudioTrack;
    public volatile boolean speakerMute;
    private final ThreadChecker threadChecker;
    private final VolumeLogger volumeLogger;

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
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.this.speakerMute) {
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
                        WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
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

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private static int getDefaultUsageAttributeOnLollipopOrHigher() {
        return 2;
    }

    private static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    private static native void nativeGetPlayoutData(long j, int i);

    public WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null);
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, AudioTrackErrorCallback audioTrackErrorCallback) {
        this.threadChecker = new ThreadChecker();
        this.audioTrack = null;
        this.audioThread = null;
        this.speakerMute = false;
        this.threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.errorCallback = audioTrackErrorCallback;
        this.volumeLogger = new VolumeLogger(audioManager);
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
        return new AudioTrack(new Builder().setUsage(DEFAULT_USAGE).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
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
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m29383d(TAG, "getStreamVolume");
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
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
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
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Run-time playback error: ");
        stringBuilder.append(str);
        Logging.m29384e(str2, stringBuilder.toString());
        WebRtcAudioUtils.logAudioState(str2, webRtcAudioTrack.context, webRtcAudioTrack.audioManager);
        AudioTrackErrorCallback audioTrackErrorCallback = webRtcAudioTrack.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Init playout error: ");
        stringBuilder.append(str);
        Logging.m29384e(str2, stringBuilder.toString());
        WebRtcAudioUtils.logAudioState(str2, this.context, this.audioManager);
        AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
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
        WebRtcAudioUtils.logAudioState(str2, this.context, this.audioManager);
        AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public void setNativeAudioTrack(long j) {
        this.nativeAudioTrack = j;
    }

    public void setSpeakerMute(boolean z) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setSpeakerMute(");
        stringBuilder.append(z);
        stringBuilder.append(")");
        Logging.m29387w(str, stringBuilder.toString());
        this.speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setStreamVolume(");
        stringBuilder.append(i);
        stringBuilder.append(")");
        Logging.m29383d(str, stringBuilder.toString());
        if (isVolumeFixed()) {
            Logging.m29384e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.start();
        Logging.m29383d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        AudioTrackStartErrorCode audioTrackStartErrorCode;
        StringBuilder stringBuilder;
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
        this.volumeLogger.stop();
        String str = TAG;
        Logging.m29383d(str, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m29383d(str, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS)) {
            String str2 = TAG;
            Logging.m29384e(str2, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(str2, this.context, this.audioManager);
        }
        Logging.m29383d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }
}
