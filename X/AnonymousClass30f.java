package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.30f */
public final class AnonymousClass30f implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass30j f36847B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass30i f36848C;
    /* renamed from: D */
    public final /* synthetic */ String f36849D;

    public AnonymousClass30f(AnonymousClass30j anonymousClass30j, String str, AnonymousClass30i anonymousClass30i) {
        this.f36847B = anonymousClass30j;
        this.f36849D = str;
        this.f36848C = anonymousClass30i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0Cn anonymousClass0Cn = this.f36847B.f36857E;
        String E = AnonymousClass0IE.E("highlights/%s/delete_reel/", new Object[]{this.f36849D});
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = E;
        AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass0Pv.class).N().H();
        H.f2849B = new AnonymousClass30h(this.f36847B, this.f36849D, this.f36848C);
        AnonymousClass114.E(this.f36847B.f36855C);
        AnonymousClass0Px.B(this.f36847B.f36854B, this.f36847B.f36856D, H);
    }
}
