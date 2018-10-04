package org.webrtc.voiceengine;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.Arrays;
import java.util.List;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
import org.webrtc.audio.WebRtcAudioRecord;

public final class WebRtcAudioUtils {
    private static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    private static final String[] BLACKLISTED_NS_MODELS = new String[0];
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioUtils";
    private static int defaultSampleRateHz = DEFAULT_SAMPLE_RATE_HZ;
    private static boolean isDefaultSampleRateOverridden = false;
    private static boolean useWebRtcBasedAcousticEchoCanceler = false;
    private static boolean useWebRtcBasedNoiseSuppressor = false;

    private static String deviceTypeToString(int i) {
        switch (i) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case ParserMinimalBase.INT_CR /*13*/:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case Process.SIGCONT /*18*/:
                return "TYPE_TELEPHONY";
            case Process.SIGSTOP /*19*/:
                return "TYPE_AUX_LINE";
            case Process.SIGTSTP /*20*/:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static String modeToString(int i) {
        switch (i) {
            case 0:
                return "MODE_NORMAL";
            case 1:
                return "MODE_RINGTONE";
            case 2:
                return "MODE_IN_CALL";
            case 3:
                return "MODE_IN_COMMUNICATION";
            default:
                return "MODE_INVALID";
        }
    }

    private static String streamTypeToString(int i) {
        switch (i) {
            case 0:
                return "STREAM_VOICE_CALL";
            case 1:
                return "STREAM_SYSTEM";
            case 2:
                return "STREAM_RING";
            case 3:
                return "STREAM_MUSIC";
            case 4:
                return "STREAM_ALARM";
            case 5:
                return "STREAM_NOTIFICATION";
            default:
                return "STREAM_INVALID";
        }
    }

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    public static List getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        int i;
        synchronized (WebRtcAudioUtils.class) {
            i = defaultSampleRateHz;
        }
        return i;
    }

    public static String getThreadInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@[name=");
        stringBuilder.append(Thread.currentThread().getName());
        stringBuilder.append(", id=");
        stringBuilder.append(Thread.currentThread().getId());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            z = isDefaultSampleRateOverridden;
        }
        return z;
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        if (runningOnMarshmallowOrHigher()) {
            AudioDeviceInfo[] devices = audioManager.getDevices(3);
            if (devices.length != 0) {
                Logging.m29383d(str, "Audio Devices: ");
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("  ");
                    stringBuilder.append(deviceTypeToString(audioDeviceInfo.getType()));
                    stringBuilder.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
                    if (audioDeviceInfo.getChannelCounts().length > 0) {
                        stringBuilder.append("channels=");
                        stringBuilder.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                        stringBuilder.append(", ");
                    }
                    if (audioDeviceInfo.getEncodings().length > 0) {
                        stringBuilder.append("encodings=");
                        stringBuilder.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                        stringBuilder.append(", ");
                    }
                    if (audioDeviceInfo.getSampleRates().length > 0) {
                        stringBuilder.append("sample rates=");
                        stringBuilder.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append("id=");
                    stringBuilder.append(audioDeviceInfo.getId());
                    Logging.m29383d(str, stringBuilder.toString());
                }
            }
        }
    }

    public static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Audio State: audio mode: ");
        stringBuilder.append(modeToString(audioManager.getMode()));
        stringBuilder.append(", has mic: ");
        stringBuilder.append(hasMicrophone());
        stringBuilder.append(", mic muted: ");
        stringBuilder.append(audioManager.isMicrophoneMute());
        stringBuilder.append(", music active: ");
        stringBuilder.append(audioManager.isMusicActive());
        stringBuilder.append(", speakerphone: ");
        stringBuilder.append(audioManager.isSpeakerphoneOn());
        stringBuilder.append(", BT SCO: ");
        stringBuilder.append(audioManager.isBluetoothScoOn());
        Logging.m29383d(str, stringBuilder.toString());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        boolean isVolumeFixed;
        int[] iArr = new int[]{0, 3, 2, 4, 5, 1};
        Logging.m29383d(str, "Audio State: ");
        if (runningOnLollipopOrHigher()) {
            isVolumeFixed = audioManager.isVolumeFixed();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("  fixed volume=");
            stringBuilder.append(isVolumeFixed);
            Logging.m29383d(str, stringBuilder.toString());
        } else {
            isVolumeFixed = false;
        }
        if (!isVolumeFixed) {
            for (int i : iArr) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder = new StringBuilder();
                stringBuilder.append("  ");
                stringBuilder.append(streamTypeToString(i));
                stringBuilder.append(": ");
                stringBuilder2.append(stringBuilder.toString());
                stringBuilder2.append("volume=");
                stringBuilder2.append(audioManager.getStreamVolume(i));
                stringBuilder2.append(", max=");
                stringBuilder2.append(audioManager.getStreamMaxVolume(i));
                logIsStreamMute(str, audioManager, i, stringBuilder2);
                Logging.m29383d(str, stringBuilder2.toString());
            }
        }
    }

    public static void logDeviceInfo(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Android SDK: ");
        stringBuilder.append(VERSION.SDK_INT);
        stringBuilder.append(", Release: ");
        stringBuilder.append(VERSION.RELEASE);
        stringBuilder.append(", Brand: ");
        stringBuilder.append(Build.BRAND);
        stringBuilder.append(", Device: ");
        stringBuilder.append(Build.DEVICE);
        stringBuilder.append(", Id: ");
        stringBuilder.append(Build.ID);
        stringBuilder.append(", Hardware: ");
        stringBuilder.append(Build.HARDWARE);
        stringBuilder.append(", Manufacturer: ");
        stringBuilder.append(Build.MANUFACTURER);
        stringBuilder.append(", Model: ");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append(", Product: ");
        stringBuilder.append(Build.PRODUCT);
        Logging.m29383d(str, stringBuilder.toString());
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder stringBuilder) {
        if (runningOnMarshmallowOrHigher() != null) {
            stringBuilder.append(", muted=");
            stringBuilder.append(audioManager.isStreamMute(i));
        }
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static boolean runningOnJellyBeanMR1OrHigher() {
        return VERSION.SDK_INT >= 17;
    }

    public static boolean runningOnJellyBeanMR2OrHigher() {
        return VERSION.SDK_INT >= 18;
    }

    public static boolean runningOnLollipopOrHigher() {
        return VERSION.SDK_INT >= 21;
    }

    public static boolean runningOnMarshmallowOrHigher() {
        return VERSION.SDK_INT >= 23;
    }

    public static boolean runningOnNougatOrHigher() {
        return VERSION.SDK_INT >= 24;
    }

    public static boolean runningOnOreoMR1OrHigher() {
        return VERSION.SDK_INT >= 27;
    }

    public static boolean runningOnOreoOrHigher() {
        return VERSION.SDK_INT >= 26;
    }

    public static synchronized void setDefaultSampleRateHz(int i) {
        synchronized (WebRtcAudioUtils.class) {
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i;
        }
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedAcousticEchoCanceler = z;
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            Logging.m29387w(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedNoiseSuppressor = z;
        }
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedAcousticEchoCanceler) {
                Logging.m29387w(TAG, "Overriding default behavior; now using WebRTC AEC!");
            }
            z = useWebRtcBasedAcousticEchoCanceler;
        }
        return z;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (WebRtcAudioUtils.class) {
        }
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedNoiseSuppressor) {
                Logging.m29387w(TAG, "Overriding default behavior; now using WebRTC NS!");
            }
            z = useWebRtcBasedNoiseSuppressor;
        }
        return z;
    }
}
