package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.51H */
public final class AnonymousClass51H implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51U f59311B;

    public AnonymousClass51H(AnonymousClass51U anonymousClass51U) {
        this.f59311B = anonymousClass51U;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        i = new AnonymousClass51G(this);
        dialogInterface = this.f59311B;
        AnonymousClass0GA B = AnonymousClass2DM.B(dialogInterface.f59331G);
        B.f2849B = i;
        dialogInterface.schedule(B);
    }
}
