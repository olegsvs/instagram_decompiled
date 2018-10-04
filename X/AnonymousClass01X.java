package X;

import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.01X */
public final class AnonymousClass01X {
    /* renamed from: B */
    public static String m83B(int i) {
        switch (i) {
            case 1:
                return "AD_INTERFACES_LOAD_AD_INTERFACE";
            case 2:
                return "AD_INTERFACES_CREATE";
            case 3:
                return "AD_INTERFACES_PAUSE";
            case 4:
                return "AD_INTERFACES_DELETE";
            case 5:
                return "AD_INTERFACES_RESUME";
            case 6:
                return "AD_INTERFACES_ADD_BUDGET";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "AD_INTERFACES_UPDATE_AD_ACCOUNT";
            case 8:
                return "AD_INTERFACES_UPDATE_BUDGET";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
