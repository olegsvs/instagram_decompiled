package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.51I */
public final class AnonymousClass51I implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51U f59312B;

    public AnonymousClass51I(AnonymousClass51U anonymousClass51U) {
        this.f59312B = anonymousClass51U;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f59312B.f59326B.f18979C = true;
        AnonymousClass0rF.B((AnonymousClass2JC) this.f59312B.getListAdapter(), 336434881);
    }
}
