package org.webrtc.voiceengine;

import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_AUDIO_SOURCE;
    private static final String TAG = "WebRtcAudioRecord";
    public static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback = null;
    private static int audioSource;
    private static WebRtcAudioRecordErrorCallback errorCallback = null;
    public static volatile boolean microphoneMute = false;
    public AudioRecord audioRecord = null;
    private AudioRecordThread audioThread = null;
    public ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects = null;
    public byte[] emptyBytes;
    public final long nativeAudioRecord;

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive = true;

        public AudioRecordThread(String str) {
            super(str);
        }

        public void run() {
            Process.setThreadPriority(-19);
            String str = WebRtcAudioRecord.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioRecordThread");
            stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
            Logging.m29383d(str, stringBuilder.toString());
            WebRtcAudioRecord.assertTrue(WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("AudioRecord.read failed: ");
                    stringBuilder.append(read);
                    String stringBuilder2 = stringBuilder.toString();
                    Logging.m29384e(WebRtcAudioRecord.TAG, stringBuilder2);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.reportWebRtcAudioRecordError(WebRtcAudioRecord.this, stringBuilder2);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e) {
                str = WebRtcAudioRecord.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("AudioRecord.stop failed: ");
                stringBuilder.append(e.getMessage());
                Logging.m29384e(str, stringBuilder.toString());
            }
        }

        public void stopThread() {
            Logging.m29383d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    private native void nativeDataIsRecorded(int i, long j);

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    public WebRtcAudioRecord(long j) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ctor");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m29383d(str, stringBuilder.toString());
        this.nativeAudioRecord = j;
        this.effects = WebRtcAudioEffects.create();
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("enableBuiltInAEC(");
        stringBuilder.append(z);
        stringBuilder.append(')');
        Logging.m29383d(str, stringBuilder.toString());
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z);
        }
        Logging.m29384e(str, "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("enableBuiltInNS(");
        stringBuilder.append(z);
        stringBuilder.append(')');
        Logging.m29383d(str, stringBuilder.toString());
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z);
        }
        Logging.m29384e(str, "Built-in NS is not supported on this platform");
        return false;
    }

    private int initRecording(int i, int i2) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("initRecording(sampleRate=");
        int i3 = i;
        stringBuilder.append(i);
        stringBuilder.append(", channels=");
        stringBuilder.append(i2);
        stringBuilder.append(")");
        Logging.m29383d(str, stringBuilder.toString());
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i4 = i / BUFFERS_PER_SECOND;
        this.byteBuffer = ByteBuffer.allocateDirect((i2 * 2) * i4);
        String str2 = TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("byteBuffer.capacity: ");
        stringBuilder.append(this.byteBuffer.capacity());
        Logging.m29383d(str2, stringBuilder.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, 2);
        if (minBufferSize != -1) {
            if (minBufferSize != -2) {
                str2 = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("AudioRecord.getMinBufferSize: ");
                stringBuilder.append(minBufferSize);
                Logging.m29383d(str2, stringBuilder.toString());
                int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
                stringBuilder = new StringBuilder();
                stringBuilder.append("bufferSizeInBytes: ");
                stringBuilder.append(max);
                Logging.m29383d(str2, stringBuilder.toString());
                try {
                    this.audioRecord = new AudioRecord(audioSource, i3, channelCountToConfiguration, 2, max);
                    AudioRecord audioRecord = this.audioRecord;
                    if (audioRecord != null) {
                        if (audioRecord.getState() == 1) {
                            WebRtcAudioEffects webRtcAudioEffects = this.effects;
                            if (webRtcAudioEffects != null) {
                                webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
                            }
                            logMainParameters();
                            logMainParametersExtended();
                            return i4;
                        }
                    }
                    reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                    releaseAudioResources();
                    return -1;
                } catch (IllegalArgumentException e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("AudioRecord ctor error: ");
                    stringBuilder.append(e.getMessage());
                    reportWebRtcAudioRecordInitError(stringBuilder.toString());
                    releaseAudioResources();
                    return -1;
                }
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("AudioRecord.getMinBufferSize failed: ");
        stringBuilder.append(minBufferSize);
        reportWebRtcAudioRecordInitError(stringBuilder.toString());
        return -1;
    }

    private void logMainParameters() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioRecord: session ID: ");
        stringBuilder.append(this.audioRecord.getAudioSessionId());
        stringBuilder.append(", channels: ");
        stringBuilder.append(this.audioRecord.getChannelCount());
        stringBuilder.append(", sample rate: ");
        stringBuilder.append(this.audioRecord.getSampleRate());
        Logging.m29383d(str, stringBuilder.toString());
    }

    private void logMainParametersExtended() {
        if (WebRtcAudioUtils.runningOnMarshmallowOrHigher()) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioRecord: buffer size in frames: ");
            stringBuilder.append(this.audioRecord.getBufferSizeInFrames());
            Logging.m29383d(str, stringBuilder.toString());
        }
    }

    private void releaseAudioResources() {
        Logging.m29383d(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    public static void reportWebRtcAudioRecordError(WebRtcAudioRecord webRtcAudioRecord, String str) {
        webRtcAudioRecord = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Run-time recording error: ");
        stringBuilder.append(str);
        Logging.m29384e(webRtcAudioRecord, stringBuilder.toString());
        WebRtcAudioUtils.logAudioState(webRtcAudioRecord);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Init recording error: ");
        stringBuilder.append(str);
        Logging.m29384e(str2, stringBuilder.toString());
        WebRtcAudioUtils.logAudioState(str2);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Start recording error: ");
        stringBuilder.append(audioRecordStartErrorCode);
        stringBuilder.append(". ");
        stringBuilder.append(str);
        Logging.m29384e(str2, stringBuilder.toString());
        WebRtcAudioUtils.logAudioState(str2);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static synchronized void setAudioSource(int i) {
        synchronized (WebRtcAudioRecord.class) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Audio source is changed from: ");
            stringBuilder.append(audioSource);
            stringBuilder.append(" to ");
            stringBuilder.append(i);
            Logging.m29387w(str, stringBuilder.toString());
            audioSource = i;
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.m29383d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setMicrophoneMute(");
        stringBuilder.append(z);
        stringBuilder.append(")");
        Logging.m29387w(str, stringBuilder.toString());
        microphoneMute = z;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() {
        Logging.m29383d(TAG, "startRecording");
        assertTrue(this.audioRecord != null);
        assertTrue(this.audioThread == null);
        AudioRecordStartErrorCode audioRecordStartErrorCode;
        StringBuilder stringBuilder;
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                audioRecordStartErrorCode = AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
                stringBuilder = new StringBuilder();
                stringBuilder.append("AudioRecord.startRecording failed - incorrect state :");
                stringBuilder.append(this.audioRecord.getRecordingState());
                reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, stringBuilder.toString());
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e) {
            audioRecordStartErrorCode = AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
            stringBuilder = new StringBuilder();
            stringBuilder.append("AudioRecord.startRecording failed: ");
            stringBuilder.append(e.getMessage());
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, stringBuilder.toString());
            return false;
        }
    }

    private boolean stopRecording() {
        Logging.m29383d(TAG, "stopRecording");
        assertTrue(this.audioThread != null);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
            String str = TAG;
            Logging.m29384e(str, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(str);
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }
}
