package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.5n3 */
public final class AnonymousClass5n3 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1fo f68971B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Cm f68972C;

    public AnonymousClass5n3(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass1fo anonymousClass1fo) {
        this.f68972C = anonymousClass0Cm;
        this.f68971B = anonymousClass1fo;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 2027132268);
        if (((Boolean) AnonymousClass0CC.rZ.H(this.f68972C)).booleanValue()) {
            AnonymousClass1fo anonymousClass1fo = this.f68971B;
            String str = "profile";
            AnonymousClass0xr.D(str);
            AnonymousClass35o.B(anonymousClass1fo.f21252B, anonymousClass1fo.f21270T, str);
        } else {
            AnonymousClass1fo anonymousClass1fo2 = this.f68971B;
            AnonymousClass2NX.C();
            AnonymousClass0xr.F("profile_promote_button", AnonymousClass0a2.I(anonymousClass1fo2.f21270T), null);
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass1fo2.f21252B);
            anonymousClass0IZ.f2754D = AnonymousClass0Ir.f2848B.A().K("profile_promote_button");
            anonymousClass0IZ.B();
        }
        AnonymousClass0cQ.L(this, -651705720, M);
    }
}
