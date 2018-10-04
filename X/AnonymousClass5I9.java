package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.5I9 */
public final class AnonymousClass5I9 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5IH f61823B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ci f61824C;

    public AnonymousClass5I9(AnonymousClass5IH anonymousClass5IH, AnonymousClass0Ci anonymousClass0Ci) {
        this.f61823B = anonymousClass5IH;
        this.f61824C = anonymousClass0Ci;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass5IH.m26173C(this.f61823B, true);
        this.f61824C.qB = AnonymousClass0Lo.PrivacyStatusPrivate;
        AnonymousClass5IH.m26172B(this.f61823B, this.f61824C);
    }
}
