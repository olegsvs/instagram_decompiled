package org.webrtc.audio;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AudioEffect.Descriptor;
import android.media.audiofx.NoiseSuppressor;
import java.util.UUID;
import org.webrtc.Logging;

public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffectsExternal";
    private static Descriptor[] cachedEffects = null;
    private AcousticEchoCanceler aec = null;
    private NoiseSuppressor ns = null;
    private boolean shouldEnableAec = false;
    private boolean shouldEnableNs = false;

    public WebRtcAudioEffects() {
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

    private boolean effectTypeIsVoIP(UUID uuid) {
        if (!WebRtcAudioUtils.runningOnJellyBeanMR2OrHigher()) {
            return false;
        }
        if ((AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported())) {
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
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                z = this.shouldEnableAec && isAcousticEchoCancelerSupported();
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
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i);
            this.ns = create2;
            if (create2 != null) {
                z = create2.getEnabled();
                if (!this.shouldEnableNs || !isNoiseSuppressorSupported()) {
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

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    private static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects != null) {
            for (Descriptor descriptor : availableEffects) {
                if (descriptor.type.equals(uuid)) {
                    return descriptor.uuid.equals(uuid2) ^ 1;
                }
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
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
        if (!isAcousticEchoCancelerSupported()) {
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
        if (!isNoiseSuppressorSupported()) {
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
