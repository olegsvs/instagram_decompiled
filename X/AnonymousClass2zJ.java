package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.2zJ */
public final class AnonymousClass2zJ implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Cj f36649B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Cm f36650C;

    public AnonymousClass2zJ(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Cj anonymousClass0Cj) {
        this.f36650C = anonymousClass0Cm;
        this.f36649B = anonymousClass0Cj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        AnonymousClass0GA B = AnonymousClass2zC.m18131B(this.f36650C, this.f36649B.getId());
        B.f2849B = new AnonymousClass2zK(this.f36649B);
        AnonymousClass1YA.f19976C.schedule(B);
    }
}
