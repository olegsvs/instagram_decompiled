package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.30j */
public final class AnonymousClass30j {
    /* renamed from: B */
    public Context f36854B;
    /* renamed from: C */
    public AnonymousClass0IU f36855C;
    /* renamed from: D */
    public AnonymousClass0Fz f36856D;
    /* renamed from: E */
    public AnonymousClass0Cm f36857E;

    public AnonymousClass30j(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0IU anonymousClass0IU) {
        this.f36854B = context;
        this.f36857E = anonymousClass0Cm;
        this.f36856D = anonymousClass0Fz;
        this.f36855C = anonymousClass0IU;
    }

    /* renamed from: A */
    public final void m18185A(String str, AnonymousClass30i anonymousClass30i) {
        AnonymousClass0Cn anonymousClass0Cn = this.f36857E;
        String E = AnonymousClass0IE.E("highlights/suggestions/%s/delete/", new Object[]{str});
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = E;
        AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass0Pv.class).N().H();
        H.f2849B = new AnonymousClass30h(this, str, anonymousClass30i);
        AnonymousClass114.E(this.f36855C);
        AnonymousClass0Px.B(this.f36854B, this.f36856D, H);
    }

    /* renamed from: B */
    public final void m18186B(String str, AnonymousClass30i anonymousClass30i) {
        new AnonymousClass0P2(this.f36854B).K(C0164R.string.delete_highlight_reel_title).S(C0164R.string.delete, new AnonymousClass30f(this, str, anonymousClass30i)).N(C0164R.string.cancel, new AnonymousClass30e(this)).A().show();
    }
}
