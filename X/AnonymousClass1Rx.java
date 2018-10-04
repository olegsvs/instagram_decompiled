package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.1Rx */
public final class AnonymousClass1Rx implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Sf f18669B;

    public AnonymousClass1Rx(AnonymousClass0Sf anonymousClass0Sf) {
        this.f18669B = anonymousClass0Sf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f18669B.f4976B.f4932C.dismiss();
        dialogInterface.dismiss();
        AnonymousClass0Cn anonymousClass0Cn = this.f18669B.f4976B.f4936G;
        String id = this.f18669B.f4977C.getId();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        AnonymousClass0GA H = anonymousClass0Pt.m3943L("usertags/%s/remove/", id).m3944M(AnonymousClass5mJ.class).m3945N().m3939H();
        H.f2849B = new AnonymousClass1Rw(this.f18669B.f4976B);
        AnonymousClass0Px.m3949B(this.f18669B.f4976B.f4931B, this.f18669B.f4976B.f4933D, H);
    }
}
