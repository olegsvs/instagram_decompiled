package org.webrtc.voiceengine;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;

public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized = false;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final VolumeLogger volumeLogger;

    public class VolumeLogger {
        private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
        private static final int TIMER_PERIOD_IN_SECONDS = 30;
        public final AudioManager audioManager;
        private Timer timer;

        public class LogVolumeTask extends TimerTask {
            private final int maxRingVolume;
            private final int maxVoiceCallVolume;

            public LogVolumeTask(int i, int i2) {
                this.maxRingVolume = i;
                this.maxVoiceCallVolume = i2;
            }

            public void run() {
                int mode = VolumeLogger.this.audioManager.getMode();
                String str;
                StringBuilder stringBuilder;
                if (mode == 1) {
                    str = WebRtcAudioManager.TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("STREAM_RING stream volume: ");
                    stringBuilder.append(VolumeLogger.this.audioManager.getStreamVolume(2));
                    stringBuilder.append(" (max=");
                    stringBuilder.append(this.maxRingVolume);
                    stringBuilder.append(")");
                    Logging.m29383d(str, stringBuilder.toString());
                } else if (mode == 3) {
                    str = WebRtcAudioManager.TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("VOICE_CALL stream volume: ");
                    stringBuilder.append(VolumeLogger.this.audioManager.getStreamVolume(0));
                    stringBuilder.append(" (max=");
                    stringBuilder.append(this.maxVoiceCallVolume);
                    stringBuilder.append(")");
                    Logging.m29383d(str, stringBuilder.toString());
                }
            }
        }

        public VolumeLogger(AudioManager audioManager) {
            this.audioManager = audioManager;
        }

        public void start() {
            this.timer = new Timer(THREAD_NAME);
            this.timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0, 30000);
        }

        public static void stop(VolumeLogger volumeLogger) {
            Timer timer = volumeLogger.timer;
            if (timer != null) {
                timer.cancel();
                volumeLogger.timer = null;
            }
        }
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, int i5, long j);

    public WebRtcAudioManager(long j) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ctor");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m29383d(str, stringBuilder.toString());
        this.nativeAudioManager = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.volumeLogger = new VolumeLogger(this.audioManager);
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j);
        WebRtcAudioUtils.logAudioState(TAG);
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void dispose() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("dispose");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m29383d(str, stringBuilder.toString());
        if (this.initialized) {
            VolumeLogger.stop(this.volumeLogger);
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        if (!WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher()) {
            return 256;
        }
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 * 2);
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 * 2);
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.m29383d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        } else if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            r2 = TAG;
            r1 = new StringBuilder();
            r1.append("Default sample rate is overriden to ");
            r1.append(WebRtcAudioUtils.getDefaultSampleRateHz());
            r1.append(" Hz");
            Logging.m29383d(r2, r1.toString());
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        } else {
            int sampleRateOnJellyBeanMR10OrHigher;
            if (WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher()) {
                sampleRateOnJellyBeanMR10OrHigher = getSampleRateOnJellyBeanMR10OrHigher();
            } else {
                sampleRateOnJellyBeanMR10OrHigher = WebRtcAudioUtils.getDefaultSampleRateHz();
            }
            r2 = TAG;
            r1 = new StringBuilder();
            r1.append("Sample rate is set to ");
            r1.append(sampleRateOnJellyBeanMR10OrHigher);
            r1.append(" Hz");
            Logging.m29383d(r2, r1.toString());
            return sampleRateOnJellyBeanMR10OrHigher;
        }
    }

    private int getSampleRateOnJellyBeanMR10OrHigher() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        return Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoInput;
        }
        return z;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoOutput;
        }
        return z;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("init");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m29383d(str, stringBuilder.toString());
        if (this.initialized) {
            return true;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("audio mode is: ");
        stringBuilder.append(WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        Logging.m29383d(str, stringBuilder.toString());
        this.initialized = true;
        this.volumeLogger.start();
        return true;
    }

    private boolean isAAudioSupported() {
        Logging.m29387w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        return this.audioManager.getMode() == 3;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean z;
        if (blacklistDeviceForOpenSLESUsageIsOverridden) {
            z = blacklistDeviceForOpenSLESUsage;
        } else {
            z = WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        }
        if (z) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Build.MODEL);
            stringBuilder.append(" is blacklisted for OpenSL ES usage!");
            Logging.m29383d(str, stringBuilder.toString());
        }
        return z;
    }

    public boolean isLowLatencyInputSupported() {
        return WebRtcAudioUtils.runningOnLollipopOrHigher() && isLowLatencyOutputSupported();
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isProAudioSupported() {
        return WebRtcAudioUtils.runningOnMarshmallowOrHigher() && ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = true;
            blacklistDeviceForOpenSLESUsage = z;
        }
    }

    public static synchronized void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Overriding default input behavior: setStereoInput(");
            stringBuilder.append(z);
            stringBuilder.append(')');
            Logging.m29387w(str, stringBuilder.toString());
            useStereoInput = z;
        }
    }

    public static synchronized void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Overriding default output behavior: setStereoOutput(");
            stringBuilder.append(z);
            stringBuilder.append(')');
            Logging.m29387w(str, stringBuilder.toString());
            useStereoOutput = z;
        }
    }

    private void storeAudioParameters() {
        int lowLatencyOutputFramesPerBuffer;
        int i = 2;
        this.outputChannels = getStereoOutput() ? 2 : 1;
        if (!getStereoInput()) {
            i = 1;
        }
        this.inputChannels = i;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = WebRtcAudioEffects.canUseAcousticEchoCanceler();
        this.hardwareAGC = false;
        this.hardwareNS = WebRtcAudioEffects.canUseNoiseSuppressor();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        if (this.lowLatencyOutput) {
            lowLatencyOutputFramesPerBuffer = getLowLatencyOutputFramesPerBuffer();
        } else {
            lowLatencyOutputFramesPerBuffer = getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        }
        this.outputBufferSize = lowLatencyOutputFramesPerBuffer;
        if (this.lowLatencyInput) {
            lowLatencyOutputFramesPerBuffer = getLowLatencyInputFramesPerBuffer();
        } else {
            lowLatencyOutputFramesPerBuffer = getMinInputFrameSize(this.sampleRate, this.inputChannels);
        }
        this.inputBufferSize = lowLatencyOutputFramesPerBuffer;
    }
}
