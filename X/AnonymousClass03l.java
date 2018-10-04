package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;

/* renamed from: X.03l */
public final class AnonymousClass03l {
    /* renamed from: B */
    public static String m221B(int i) {
        switch (i) {
            case 1:
                return "NewLogin";
            case 3:
                return "LoginToBeforeFeedFetch";
            case 4:
                return "LOGIN_FETCH_LOGIN_DATA_TTI";
            case 10:
                return "LOGIN_FETCH_LOGIN_COMPONENTS";
            case ParserMinimalBase.INT_CR /*13*/:
                return "LOGIN_SILENT_LOGIN";
            case 14:
                return "ColdStartNuxTTI";
            case 16:
                return "LOGIN_LOAD_PERSISTENT_COMPONENTS";
            case 17:
                return "LOGIN_FETCH_PERSISTENT_COMPONENTS";
            case Process.SIGCONT /*18*/:
                return "LOGIN_LOGOUT";
            case Process.SIGSTOP /*19*/:
                return "LoginToFeedStory";
            case Process.SIGTSTP /*20*/:
                return "Authentication";
            case 21:
                return "InterstitialPreparation";
            case 22:
                return "AppCreateToLoginActivityCreate";
            case 24:
                return "LOGIN_LOAD_ACTIVITY_AFTER_FETCH_IG_LINKED_FBID";
            case 25:
                return "Fb4aLoginTTI";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
