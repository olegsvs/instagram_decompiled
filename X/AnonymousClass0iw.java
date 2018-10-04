package X;

import android.os.Bundle;
import com.facebook.C0164R;

/* renamed from: X.0iw */
public class AnonymousClass0iw implements AnonymousClass0ix {
    /* renamed from: B */
    public final AnonymousClass0IL f8990B;
    /* renamed from: C */
    public final AnonymousClass0iy f8991C;

    public final void wd() {
    }

    public AnonymousClass0iw(AnonymousClass0IL anonymousClass0IL, AnonymousClass0iy anonymousClass0iy) {
        this.f8990B = anonymousClass0IL;
        this.f8991C = anonymousClass0iy;
    }

    public void xd(String str, AnonymousClass0mR anonymousClass0mR) {
        if (anonymousClass0mR == AnonymousClass0mR.SUGGESTED_USERS_FEED_UNIT) {
            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass3NE(AnonymousClass3NF.f40591D));
            return;
        }
        if (!(anonymousClass0mR == AnonymousClass0mR.MEGAPHONE || anonymousClass0mR == AnonymousClass0mR.NUX_MAIN_SCREEN || anonymousClass0mR == AnonymousClass0mR.FOLLOW_PEOPLE || anonymousClass0mR == AnonymousClass0mR.OPTION_FOLLOW_PEOPLE)) {
            if (anonymousClass0mR != AnonymousClass0mR.DIRECT_INBOX_TAB) {
                String str2 = str;
                if (anonymousClass0mR == AnonymousClass0mR.OPTION_FB_CONNECT_FLOW) {
                    AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f8990B.getActivity());
                    AnonymousClass0Jp.f2944B.mo668A();
                    anonymousClass0IZ.f2754D = AnonymousClass0So.m4409B(AnonymousClass0Ik.Facebook, str2, this.f8990B.getString(C0164R.string.find_friends_item_facebook_friends), false, false, true, null, null);
                    anonymousClass0IZ.f2752B = "UserListWithSocialConnectFragment.USER_LIST_WITH_SOCIAL_CONNECT_BACKSTATE_NAME";
                    anonymousClass0IZ.m2308B();
                    return;
                } else if (anonymousClass0mR == AnonymousClass0mR.INVITE_FRIENDS) {
                    Bundle bundle = new Bundle();
                    this.f8991C.m7058A(bundle, str, AnonymousClass0FO.m1591O());
                    AnonymousClass0IZ anonymousClass0IZ2 = new AnonymousClass0IZ(this.f8990B.getActivity());
                    anonymousClass0IZ2.f2754D = AnonymousClass0IY.m2265B().m2283R(bundle);
                    anonymousClass0IZ2.m2308B();
                    return;
                } else {
                    return;
                }
            }
        }
        AnonymousClass0IL anonymousClass0IL = this.f8990B;
        if (anonymousClass0IL instanceof AnonymousClass4mV) {
            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0mT());
            return;
        }
        anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass3Ip.f39973B.A().A(1);
        anonymousClass0IZ.m2308B();
    }
}
