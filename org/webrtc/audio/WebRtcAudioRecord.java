package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback;
import org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode;
import org.webrtc.audio.JavaAudioDeviceModule.AudioSamples;
import org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback;

public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final String TAG = "WebRtcAudioRecordExternal";
    private final AudioManager audioManager;
    public AudioRecord audioRecord;
    public final SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    private final Context context;
    private final WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    private final AudioRecordErrorCallback errorCallback;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    public volatile boolean microphoneMute;
    public long nativeAudioRecord;

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
                    if (WebRtcAudioRecord.this.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, read);
                    }
                    if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord.getAudioFormat(), WebRtcAudioRecord.this.audioRecord.getChannelCount(), WebRtcAudioRecord.this.audioRecord.getSampleRate(), Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.capacity() + WebRtcAudioRecord.this.byteBuffer.arrayOffset())));
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

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    private native void nativeDataIsRecorded(long j, int i);

    public WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, audioManager, 7, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported());
    }

    public WebRtcAudioRecord(Context context, AudioManager audioManager, int i, AudioRecordErrorCallback audioRecordErrorCallback, SamplesReadyCallback samplesReadyCallback, boolean z, boolean z2) {
        this.effects = new WebRtcAudioEffects();
        this.audioRecord = null;
        this.audioThread = null;
        this.microphoneMute = false;
        if (z) {
            if (!WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
                throw new IllegalArgumentException("HW AEC not supported");
            }
        }
        if (z2) {
            if (!WebRtcAudioEffects.isNoiseSuppressorSupported()) {
                throw new IllegalArgumentException("HW NS not supported");
            }
        }
        this.context = context;
        this.audioManager = audioManager;
        this.audioSource = i;
        this.errorCallback = audioRecordErrorCallback;
        this.audioSamplesReadyCallback = samplesReadyCallback;
        this.isAcousticEchoCancelerSupported = z;
        this.isNoiseSuppressorSupported = z2;
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
        stringBuilder.append(")");
        Logging.m29383d(str, stringBuilder.toString());
        return this.effects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("enableBuiltInNS(");
        stringBuilder.append(z);
        stringBuilder.append(")");
        Logging.m29383d(str, stringBuilder.toString());
        return this.effects.setNS(z);
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
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 * 2) * i4);
        this.byteBuffer = allocateDirect;
        if (allocateDirect.hasArray()) {
            String str2 = TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("byteBuffer.capacity: ");
            stringBuilder.append(this.byteBuffer.capacity());
            Logging.m29383d(str2, stringBuilder.toString());
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
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
                        this.audioRecord = new AudioRecord(this.audioSource, i3, channelCountToConfiguration, 2, max);
                        AudioRecord audioRecord = this.audioRecord;
                        if (audioRecord != null) {
                            if (audioRecord.getState() == 1) {
                                this.effects.enable(this.audioRecord.getAudioSessionId());
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
        reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
        return -1;
    }

    public boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
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
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Run-time recording error: ");
        stringBuilder.append(str);
        Logging.m29384e(str2, stringBuilder.toString());
        WebRtcAudioUtils.logAudioState(str2, webRtcAudioRecord.context, webRtcAudioRecord.audioManager);
        AudioRecordErrorCallback audioRecordErrorCallback = webRtcAudioRecord.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Init recording error: ");
        stringBuilder.append(str);
        Logging.m29384e(str2, stringBuilder.toString());
        WebRtcAudioUtils.logAudioState(str2, this.context, this.audioManager);
        AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
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
        WebRtcAudioUtils.logAudioState(str2, this.context, this.audioManager);
        AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public void setMicrophoneMute(boolean z) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setMicrophoneMute(");
        stringBuilder.append(z);
        stringBuilder.append(")");
        Logging.m29387w(str, stringBuilder.toString());
        this.microphoneMute = z;
    }

    public void setNativeAudioRecord(long j) {
        this.nativeAudioRecord = j;
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
            WebRtcAudioUtils.logAudioState(str, this.context, this.audioManager);
        }
        this.audioThread = null;
        this.effects.release();
        releaseAudioResources();
        return true;
    }
}
