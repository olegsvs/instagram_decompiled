package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.4z4 */
public final class AnonymousClass4z4 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4z9 f59070B;

    public AnonymousClass4z4(AnonymousClass4z9 anonymousClass4z9) {
        this.f59070B = anonymousClass4z9;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        i = this.f59070B;
        dialogInterface = AnonymousClass2DM.B(i.f59084K);
        dialogInterface.f2849B = new AnonymousClass4z2(i);
        i.schedule(dialogInterface);
    }
}
