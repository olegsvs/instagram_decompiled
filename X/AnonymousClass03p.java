package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.03p */
public final class AnonymousClass03p {
    /* renamed from: B */
    public static String m225B(int i) {
        switch (i) {
            case 1:
                return "MARKETPLACE_RELAY";
            case 3:
                return "MARKETPLACE_SURFACE_ROOT";
            case 5:
                return "MARKETPLACE_RELAY_MUTATION";
            case 6:
                return "MARKETPLACE_FEED_LOAD";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "MARKETPLACE_PRODUCT_DETAILS";
            case 8:
                return "MARKETPLACE_FEED_IMAGE_LOAD";
            case 9:
                return "MARKETPLACE_HOME_TTI";
            case 11:
                return "MARKETPLACE_SEARCH_RESULT_TTI";
            case 12:
                return "MARKETPLACE_TAB_TTI";
            case ParserMinimalBase.INT_CR /*13*/:
                return "MARKETPLACE_SHOPS_TTI";
            case 14:
                return "MARKETPLACE_HOME_LOAD";
            case 15:
                return "MARKETPLACE_DAILY_DEALS_TTI";
            case 16:
                return "MARKETPLACE_SEARCH_NULLSTATE_TTI";
            case Process.SIGCONT /*18*/:
                return "MARKETPLACE_FEED_AFTER_TTI_FIRST_PAGINATION_DELAY";
            case Process.SIGTSTP /*20*/:
                return "MARKETPLACE_COMPOSER_POST_TTI";
            case 21:
                return "MARKETPLACE_B2C_PRODUCT_DETAILS";
            case 23:
                return "MARKETPLACE_RENTAL_MAP_VIEW_TTI_MOBILE";
            case 24:
                return "Marketplace - Native loading shimmers";
            case 25:
                return "MARKETPLACE_COMPOSER_EDIT_TTI";
            case 26:
                return "MARKETPLACE_INDIA_HOME_LOAD";
            case 27:
                return "MARKETPLACE_MARKETPLACE_HOME_PREFETCH";
            case 28:
                return "MARKETPLACE_AUTOS_TTI";
            case 29:
                return "PRODUCT_DETAILS_LOAD";
            case 30:
                return "MARKETPLACE_PDP_ANIMATION_TAP_LATENCY";
            case 31:
                return "MARKETPLACE_MARKETPLACE_NOTIFICATIONS_TTI";
            case 32:
                return "MARKETPLACE_FEED_ITEM_PDP_MEASURE";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
