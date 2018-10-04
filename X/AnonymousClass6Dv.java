package X;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.instagram.profile.intf.AutoLaunchReelParams;

/* renamed from: X.6Dv */
public final class AnonymousClass6Dv implements AnonymousClass5k1 {
    public AnonymousClass6Dv(AnonymousClass0dC anonymousClass0dC) {
    }

    public final void PHA(FragmentActivity fragmentActivity, AnonymousClass0Cm anonymousClass0Cm, Bundle bundle) {
        String string = bundle.getString("UserDetailFragment.EXTRA_PUSH_NOTIFICATION_TYPE");
        if (string != null) {
            Object obj = -1;
            int hashCode = string.hashCode();
            if (hashCode != -1307214883) {
                if (hashCode == 1316977209) {
                    if (string.equals("private_user_follow_request")) {
                        obj = null;
                    }
                }
            } else if (string.equals("new_follower")) {
                obj = 1;
            }
            switch (obj) {
                case null:
                    AnonymousClass0dC.G(fragmentActivity, bundle);
                    return;
                case 1:
                    AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(fragmentActivity);
                    anonymousClass0IZ.f2754D = AnonymousClass0IY.B().S(anonymousClass0Cm.f1759C, bundle.getString("id"));
                    anonymousClass0IZ.B();
                    return;
                default:
                    break;
            }
        }
        boolean z = bundle.getBoolean("UserDetailFragment.EXTRA_SHOULD_LAUNCH_REEL");
        String string2 = bundle.getString("UserDetailFragment.EXTRA_PUSH_NOTIFICATION_TYPE");
        boolean z2 = bundle.getBoolean("UserDetailFragment.EXTRA_REEL_SHOW_DASHBOARD");
        String string3 = bundle.getString("UserDetailFragment.EXTRA_REEL_MEDIA_ID");
        AnonymousClass0bx D = AnonymousClass0bx.D(anonymousClass0Cm, bundle.getString("id"), "app_startup");
        if (z) {
            AnonymousClass0hc anonymousClass0hc = new AnonymousClass0hc(AnonymousClass0hd.USER_STORY, null);
            anonymousClass0hc.f8444F = z2;
            anonymousClass0hc.f8442D = string2;
            anonymousClass0hc.f8441C = string3;
            D.f6903C = new AutoLaunchReelParams(anonymousClass0hc);
        }
        AnonymousClass0IZ anonymousClass0IZ2 = new AnonymousClass0IZ(fragmentActivity);
        anonymousClass0IZ2.f2754D = AnonymousClass0Jj.f2938B.B().D(D.A());
        anonymousClass0IZ2.B();
    }
}
