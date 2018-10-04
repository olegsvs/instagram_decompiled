package X;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.03m */
public final class AnonymousClass03m {
    /* renamed from: B */
    public static String m222B(int i) {
        switch (i) {
            case 1:
                return "LOGOUT_HANDLE_LOGOUT";
            case 2:
                return "LOGOUT_BEFORE_LOGOUT";
            case 3:
                return "LOGOUT_BEFORE_LOGOUT_COMPONENT";
            case 4:
                return "LOGOUT_UNREGISTER_PUSH_TOKEN";
            case 5:
                return "LOGOUT_UNREGISTER_PUSH_TOKEN_COMPONENT";
            case 6:
                return "LOGOUT_EXPIRE_SESSION";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "LOGOUT_LOGOUT_HELPER";
            case 8:
                return "LOGOUT_AFTER_LOGOUT";
            case 9:
                return "LOGOUT_AFTER_LOGOUT_COMPONENT";
            case 10:
                return "LOGOUT_LOGOUT_COMPLETE";
            case 11:
                return "LOGOUT_LOGOUT_COMPLETE_COMPONENT";
            case 12:
                return "LOGOUT_CLEAR_PRIVACY_CRITICAL_KEYS";
            case ParserMinimalBase.INT_CR /*13*/:
                return "LOGOUT_CLEAR_PRIVACY_CRITICAL_KEYS_COMPONENT";
            case 14:
                return "LOGOUT_CLEAR_USER_DATA";
            case 15:
                return "LOGOUT_CLEAR_USER_DATA_COMPONENT";
            case 16:
                return "LOGOUT_CLEAR_USER_AUTH_DATA";
            default:
                switch (i) {
                    case 23:
                        return "LOGOUT_UNREGISTER_PUSH_TOKEN_ASYNC";
                    case 24:
                        return "LOGOUT_UNREGISTER_PUSH_TOKEN_COMPONENT_ASYNC";
                    case 25:
                        return "LOGOUT_EXPIRE_SESSION_ASYNC";
                    case 26:
                        return "LOGOUT_CLEAR_FB_APP_USER_DATA_COMPONENT";
                    case 27:
                        return "LOGOUT_UNREGISTER_PUSH_TOKEN_ASYNC_TAG";
                    case 28:
                        return "LOGOUT_HANDLE_DITTO_LOGOUT";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
