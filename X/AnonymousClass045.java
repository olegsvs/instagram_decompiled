package X;

import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.045 */
public final class AnonymousClass045 {
    /* renamed from: B */
    public static String m241B(int i) {
        switch (i) {
            case 1:
                return "MOBILECONFIG_NATIVE_MANAGER_CREATION";
            case 2:
                return "MOBILECONFIG_JAVA_MANAGER_CREATION";
            case 3:
                return "MOBILECONFIG_SESSION_BASED_INIT";
            case 4:
                return "MOBILECONFIG_SESSIONLESS_INIT";
            case 6:
                return "MOBILECONFIG_NULL_BUFFER";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "MOBILECONFIG_BUFFER_PATH_MIGRATION";
            case 8:
                return "MOBILECONFIG_FACTORY_IMPL_INIT_MANAGER";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
