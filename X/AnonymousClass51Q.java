package X;

import android.os.Bundle;
import com.facebook.C0164R;

/* renamed from: X.51Q */
public final class AnonymousClass51Q implements AnonymousClass0Se {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51U f59320B;
    /* renamed from: C */
    public final /* synthetic */ boolean f59321C;
    /* renamed from: D */
    public final /* synthetic */ boolean f59322D;

    public AnonymousClass51Q(AnonymousClass51U anonymousClass51U, boolean z, boolean z2) {
        this.f59320B = anonymousClass51U;
        this.f59321C = z;
        this.f59322D = z2;
    }

    public final boolean dDA(boolean z) {
        boolean H;
        if (z) {
            AnonymousClass0IL A;
            AnonymousClass0IL anonymousClass0IL = this.f59320B;
            boolean H2 = AnonymousClass0EF.H(anonymousClass0IL.getContext().getPackageManager(), "com.duosecurity.duomobile");
            H = AnonymousClass0EF.H(anonymousClass0IL.getContext().getPackageManager(), "com.google.android.apps.authenticator2");
            if (H2 && H) {
                A = AnonymousClass0GQ.f2360B.A().m27572A(anonymousClass0IL.getArguments(), AnonymousClass2Dv.GENERIC_APP.A());
            } else if (H2) {
                A = AnonymousClass0GQ.f2360B.A().m27572A(anonymousClass0IL.getArguments(), AnonymousClass2Dv.DUO.A());
            } else if (H) {
                A = AnonymousClass0GQ.f2360B.A().m27572A(anonymousClass0IL.getArguments(), AnonymousClass2Dv.GOOGLE_AUTHENTICATOR.A());
            } else {
                AnonymousClass0GQ.f2360B.A();
                Bundle arguments = anonymousClass0IL.getArguments();
                A = new AnonymousClass519();
                A.setArguments(arguments);
            }
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
            anonymousClass0IZ.f2754D = A;
            anonymousClass0IZ.B();
        } else {
            String string;
            CharSequence string2;
            z = this.f59320B;
            boolean z2 = this.f59321C;
            H = this.f59322D;
            if (z2 && H) {
                string = z.getString(C0164R.string.two_fac_3paa_off_dialog_title);
                string2 = z.getString(C0164R.string.two_fac_3paa_off_dialog_body);
            } else {
                string = z.getString(C0164R.string.two_fac_2fac_off_dialog_title);
                string2 = z.getString(C0164R.string.two_fac_2fac_off_dialog_body);
            }
            AnonymousClass0P2 anonymousClass0P2 = new AnonymousClass0P2(z.getContext());
            anonymousClass0P2.f3974H = string;
            anonymousClass0P2.L(string2).S(C0164R.string.remove, new AnonymousClass51K(z)).N(C0164R.string.cancel, new AnonymousClass51I(z)).A().show();
        }
        return true;
    }
}
