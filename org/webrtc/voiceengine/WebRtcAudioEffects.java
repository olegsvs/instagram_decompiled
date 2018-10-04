package org.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AudioEffect.Descriptor;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.List;
import java.util.UUID;
import org.webrtc.Logging;

public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static Descriptor[] cachedEffects = null;
    private AcousticEchoCanceler aec = null;
    private NoiseSuppressor ns = null;
    private boolean shouldEnableAec = false;
    private boolean shouldEnableNs = false;

    private WebRtcAudioEffects() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ctor");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m29383d(str, stringBuilder.toString());
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z = (!isAcousticEchoCancelerEffectAvailable() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted() || isAcousticEchoCancelerExcludedByUUID()) ? false : true;
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("canUseAcousticEchoCanceler: ");
        stringBuilder.append(z);
        Logging.m29383d(str, stringBuilder.toString());
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z = (!isNoiseSuppressorEffectAvailable() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted() || isNoiseSuppressorExcludedByUUID()) ? false : true;
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("canUseNoiseSuppressor: ");
        stringBuilder.append(z);
        Logging.m29383d(str, stringBuilder.toString());
        return z;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if (!WebRtcAudioUtils.runningOnJellyBeanMR2OrHigher()) {
            return false;
        }
        if ((AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerEffectAvailable()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorEffectAvailable())) {
            return true;
        }
        return false;
    }

    public void enable(int i) {
        boolean z;
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("enable(audioSession=");
        stringBuilder.append(i);
        stringBuilder.append(")");
        Logging.m29383d(str, stringBuilder.toString());
        boolean z2 = true;
        assertTrue(this.aec == null);
        assertTrue(this.ns == null);
        if (isAcousticEchoCancelerEffectAvailable()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                z = this.shouldEnableAec && canUseAcousticEchoCanceler();
                if (this.aec.setEnabled(z) != 0) {
                    Logging.m29384e(str, "Failed to set the AcousticEchoCanceler state");
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("AcousticEchoCanceler: was ");
                stringBuilder.append(enabled ? "enabled" : "disabled");
                stringBuilder.append(", enable: ");
                stringBuilder.append(z);
                stringBuilder.append(", is now: ");
                stringBuilder.append(this.aec.getEnabled() ? "enabled" : "disabled");
                Logging.m29383d(str, stringBuilder.toString());
            } else {
                Logging.m29384e(str, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorEffectAvailable()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i);
            this.ns = create2;
            if (create2 != null) {
                z = create2.getEnabled();
                if (!this.shouldEnableNs || !canUseNoiseSuppressor()) {
                    z2 = false;
                }
                if (this.ns.setEnabled(z2) != 0) {
                    Logging.m29384e(str, "Failed to set the NoiseSuppressor state");
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("NoiseSuppressor: was ");
                stringBuilder.append(z ? "enabled" : "disabled");
                stringBuilder.append(", enable: ");
                stringBuilder.append(z2);
                stringBuilder.append(", is now: ");
                stringBuilder.append(this.ns.getEnabled() ? "enabled" : "disabled");
                Logging.m29383d(str, stringBuilder.toString());
                return;
            }
            Logging.m29384e(str, "Failed to create the NoiseSuppressor instance");
        }
    }

    private static Descriptor[] getAvailableEffects() {
        Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        descriptorArr = AudioEffect.queryEffects();
        cachedEffects = descriptorArr;
        return descriptorArr;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForAecUsage.contains(str);
        if (contains) {
            String str2 = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" is blacklisted for HW AEC usage!");
            Logging.m29387w(str2, stringBuilder.toString());
        }
        return contains;
    }

    public static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects != null) {
            for (Descriptor descriptor : availableEffects) {
                if (descriptor.type.equals(uuid)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForNsUsage.contains(str);
        if (contains) {
            String str2 = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" is blacklisted for HW NS usage!");
            Logging.m29387w(str2, stringBuilder.toString());
        }
        return contains;
    }

    public static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void release() {
        Logging.m29383d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setAEC(");
        stringBuilder.append(z);
        stringBuilder.append(")");
        Logging.m29383d(str, stringBuilder.toString());
        if (!canUseAcousticEchoCanceler()) {
            Logging.m29387w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        } else {
            Logging.m29384e(TAG, "Platform AEC state can't be modified while recording");
            return false;
        }
    }

    public boolean setNS(boolean z) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setNS(");
        stringBuilder.append(z);
        stringBuilder.append(")");
        Logging.m29383d(str, stringBuilder.toString());
        if (!canUseNoiseSuppressor()) {
            Logging.m29387w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        } else {
            Logging.m29384e(TAG, "Platform NS state can't be modified while recording");
            return false;
        }
    }
}
