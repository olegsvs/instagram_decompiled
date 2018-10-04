package X;

import com.facebook.forker.Process;

/* renamed from: X.02X */
public final class AnonymousClass02X {
    /* renamed from: B */
    public static String m145B(int i) {
        if (i == 10) {
            return "EVENTS_PERMALINK";
        }
        if (i == 21) {
            return "EVENTS_EVENT_PERMALINK_TTI_MARKER";
        }
        if (i == 37) {
            return "EVENTS_EVENTS_DASHBOARD_LOAD_FIRST_PAGE_OF_FEED_UNITS";
        }
        if (i == 39) {
            return "EVENTS_CAMPAIGN_LANDING_TTI_ANDROID_MARKER";
        }
        switch (i) {
            case 16:
                return "EVENTS_EVENT_CREATE_TTI";
            case 17:
                return "EVENTS_EVENTS_COMPOSER_LAUNCH_TTI_MARKER";
            case Process.SIGCONT /*18*/:
                return "EVENTS_EVENTS_DASHBOARD_TTI_MARKER";
            default:
                switch (i) {
                    case 45:
                        return "EVENTS_EVENT_PERMALINK_TTRC";
                    case 46:
                        return "EVENTS_EVENTS_DASHBOARD_LOAD_TTRC";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
