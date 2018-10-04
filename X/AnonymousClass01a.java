package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;

/* renamed from: X.01a */
public final class AnonymousClass01a {
    /* renamed from: B */
    public static String m86B(int i) {
        if (i == 11) {
            return "ADS_MANAGER_CREATION_FLOW_ENTERING_TTI";
        }
        switch (i) {
            case 3:
                return "ADS_MANAGER_COLD_START_MAIN";
            case 4:
                return "ADS_MANAGER_COLD_START_LOGIN";
            default:
                switch (i) {
                    case ParserMinimalBase.INT_CR /*13*/:
                        return "ADS_MANAGER_ENTER_CREATION_POST_ENGAGEMENT_TTI";
                    case 14:
                        return "ADS_MANAGER_ENTER_CREATION_LOCAL_AWARENESS_TTI";
                    case 15:
                        return "ADS_MANAGER_ENTER_CREATION_WEBSITE_CLICKS_TTI";
                    case 16:
                        return "ADS_MANAGER_ENTER_CREATION_PAGE_LIKES_TTI";
                    case 17:
                        return "ADS_MANAGER_ENTER_CREATION_VIDEO_VIEWS_TTI";
                    case Process.SIGCONT /*18*/:
                        return "ADS_MANAGER_ENTER_CREATION_EVENT_RESPONSES_TTI";
                    case Process.SIGSTOP /*19*/:
                        return "ADS_MANAGER_ENTER_CREATION_MESSAGES_TTI";
                    case Process.SIGTSTP /*20*/:
                        return "ADS_MANAGER_ENTER_CREATION_REACH_TTI";
                    case 21:
                        return "ADS_MANAGER_ENTER_CREATION_CONVERSIONS_TTI";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
