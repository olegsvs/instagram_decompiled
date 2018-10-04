package X;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.02o */
public final class AnonymousClass02o {
    /* renamed from: B */
    public static String m162B(int i) {
        switch (i) {
            case 1:
                return "FRIENDING_LOCATION";
            case 2:
                return "FRIENDING_SEARCH";
            case 6:
                return "FRIENDING_FRIEND_REQUESTS_HARRISON_TAB_SWITCH_TTI";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "FRIENDING_NUX_ADD_FRIENDS_STEP_TTI";
            case 8:
                return "FRIENDING_FRIENDS_TAB_TTI_METRIC_NAME";
            case 9:
                return "FRIENDING_REQUESTS_TAB_TTI_METRIC_NAME";
            case 10:
                return "FRIENDING_SEARCH_TAB_TTI_METRIC_NAME";
            case 11:
                return "FRIENDING_SUGGESTIONS_TAB_TTI_METRIC_NAME";
            case 12:
                return "FRIENDING_FRIENDS_TAB_DISK_LOAD_METRIC_NAME";
            case ParserMinimalBase.INT_CR /*13*/:
                return "FRIENDING_FRIENDS_TAB_NETWORK_LOAD_METRIC_NAME";
            case 15:
                return "FRIENDING_FRIENDS_TAB_WITH_ACTIVE_TTI_METRIC_NAME";
            case 16:
                return "FRIENDING_SUGGESTIONS_TAB_SCROLLING_METRIC_FB4A";
            case 22:
                return "FRIENDING_TTRC_JEWEL_FB4A";
            case 23:
                return "FRIENDING_TTRC_NUX_FB4A";
            case 26:
                return "FRIENDING_DYNAMIC_FRIENDING_TAB_TTI_FB4A";
            case 27:
                return "FRIENDING_DYNAMIC_FRIENDING_TAB_TTRC_FB4A";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
