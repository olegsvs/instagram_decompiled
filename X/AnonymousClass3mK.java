package X;

import android.view.View;
import com.instagram.share.facebook.widget.FindPeopleButton;

/* renamed from: X.3mK */
public final class AnonymousClass3mK {
    /* renamed from: B */
    public static void m20626B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3mJ anonymousClass3mJ, FindPeopleButton findPeopleButton, AnonymousClass3mM anonymousClass3mM) {
        int i = 8;
        findPeopleButton.setVisibility(8);
        View view = anonymousClass3mJ.f44296B;
        if (anonymousClass3mJ.f44298D.getVisibility() != 8 || anonymousClass3mJ.f44297C.getVisibility() != 8 || anonymousClass3mJ.f44299E.getVisibility() != 8) {
            i = 0;
        }
        view.setVisibility(i);
        if (anonymousClass3mM.f44304C == AnonymousClass3mL.FollowList && findPeopleButton == anonymousClass3mJ.f44297C) {
            anonymousClass3mJ = AnonymousClass0HV.D(anonymousClass0Cm);
            anonymousClass0Cm = "num_times_dismissed_ci_find_people_button_follow_list";
            anonymousClass3mJ.f2646B.edit().putInt(anonymousClass0Cm, anonymousClass3mJ.f2646B.getInt(anonymousClass0Cm, 0) + 1).apply();
            anonymousClass3mJ.f2646B.edit().putLong("last_time_dismissed_ci_find_people_button_follow_list", AnonymousClass0Gd.C()).apply();
        }
    }

    /* renamed from: C */
    public static boolean m20627C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3mM anonymousClass3mM) {
        int i = AnonymousClass3mH.f44295B[anonymousClass3mM.f44304C.ordinal()];
        anonymousClass3mM = true;
        if (i == 1) {
            AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass0Cm);
            if (D.f2646B.getInt("num_times_dismissed_ci_find_people_button_follow_list", 0) >= 3) {
                return false;
            }
            if (AnonymousClass0Gd.C() - D.f2646B.getLong("last_time_dismissed_ci_find_people_button_follow_list", 0) < 86400000) {
                anonymousClass3mM = null;
            }
        }
        return anonymousClass3mM;
    }
}
