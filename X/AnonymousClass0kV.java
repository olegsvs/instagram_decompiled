package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.creation.fragment.FollowersShareFragment;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0kV */
public final class AnonymousClass0kV {
    /* renamed from: D */
    public static boolean f9304D;
    /* renamed from: E */
    public static boolean f9305E;
    /* renamed from: B */
    public final Activity f9306B;
    /* renamed from: C */
    public final AnonymousClass0Cm f9307C;

    public AnonymousClass0kV(Activity activity, AnonymousClass0Cm anonymousClass0Cm) {
        this.f9306B = activity;
        this.f9307C = anonymousClass0Cm;
        if (AnonymousClass0x6.f12474B == null) {
            AnonymousClass0x6.f12474B = new AnonymousClass0x7();
        }
    }

    /* renamed from: A */
    public final void m7175A(AnonymousClass0IP anonymousClass0IP, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0EE anonymousClass0EE, AnonymousClass32F anonymousClass32F) {
        List arrayList = new ArrayList();
        arrayList.add(anonymousClass0Ci.getId());
        AnonymousClass0GA B = AnonymousClass1YE.m11830B(this.f9307C, anonymousClass0EE, anonymousClass32F, arrayList, new ArrayList());
        B.f2849B = new AnonymousClass31b(this, anonymousClass0Ci);
        anonymousClass0IP.schedule(B);
    }

    /* renamed from: B */
    public static void m7173B(AnonymousClass0Cm anonymousClass0Cm) {
        if (AnonymousClass0yJ.m8630C()) {
            if (!f9304D) {
                String E = AnonymousClass0IE.m2137E("users/%s/info/", anonymousClass0Cm.m1037B().getId());
                AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
                anonymousClass0Pt.f4229M = E;
                AnonymousClass0GA H = anonymousClass0Pt.m3944M(AnonymousClass1IX.class).m3939H();
                H.f2849B = new AnonymousClass1IY();
                AnonymousClass0Ix.m2384D(H);
            }
        }
    }

    /* renamed from: B */
    public final boolean m7176B() {
        return AnonymousClass0yJ.m8630C() && this.f9307C.m1037B().m1010a();
    }

    /* renamed from: C */
    public final void m7177C(AnonymousClass0xq anonymousClass0xq) {
        m7178D(anonymousClass0xq, AnonymousClass1Zf.MEMBERS);
    }

    /* renamed from: C */
    public static boolean m7174C() {
        if (!AnonymousClass0yJ.m8630C()) {
            if (!((Boolean) AnonymousClass0CC.XB.m845G()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public final void m7178D(AnonymousClass0xq anonymousClass0xq, AnonymousClass1Zf anonymousClass1Zf) {
        String str;
        Bundle bundle = new Bundle();
        if (!((Boolean) AnonymousClass0CC.WB.m846H(this.f9307C)).booleanValue() || (m7176B() && AnonymousClass0HV.m2008D(this.f9307C).f2646B.getBoolean("has_seen_favorites_integrated_nux", false))) {
            str = "favorites_home";
            bundle.putSerializable("entry_point", anonymousClass0xq);
            bundle.putSerializable("initial_tab", anonymousClass1Zf);
        } else {
            AnonymousClass0HV.m2008D(this.f9307C).f2646B.edit().putBoolean("has_seen_favorites_integrated_nux", true).apply();
            str = "favorites_nux";
        }
        new AnonymousClass0Sn(ModalActivity.class, str, bundle, this.f9306B, this.f9307C.f1759C).m4403B(this.f9306B);
    }

    /* renamed from: E */
    public final void m7179E(AnonymousClass0xq anonymousClass0xq, FollowersShareFragment followersShareFragment) {
        AnonymousClass0xH anonymousClass0xH = new AnonymousClass0xH(this.f9306B, this.f9307C);
        AnonymousClass2He G = new AnonymousClass2He(anonymousClass0xH.f12504B).D(AnonymousClass31T.E(anonymousClass0xH.f12504B, anonymousClass0xH.f12506D)).J(C0164R.string.setup_your_close_friends_title).E(AnonymousClass0yJ.m8636I(anonymousClass0xH.f12506D) ? C0164R.string.setup_your_close_friends_text_v4 : C0164R.string.setup_your_close_friends_text).H(C0164R.string.setup_your_close_friends_button_continue, new AnonymousClass31i(anonymousClass0xH, anonymousClass0xq)).G(C0164R.string.not_now, new AnonymousClass31h(anonymousClass0xH, followersShareFragment));
        G.f28559D.setOnCancelListener(new AnonymousClass31g(anonymousClass0xH, followersShareFragment));
        G.f28559D.show();
    }
}
