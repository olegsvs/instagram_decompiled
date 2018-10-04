package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.4z6 */
public final class AnonymousClass4z6 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4z9 f59072B;

    public AnonymousClass4z6(AnonymousClass4z9 anonymousClass4z9) {
        this.f59072B = anonymousClass4z9;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0IL anonymousClass0IL = this.f59072B;
        AnonymousClass0GA E = AnonymousClass2DM.E(anonymousClass0IL.getContext(), this.f59072B.f59084K, this.f59072B.f59081H);
        E.f2849B = this.f59072B.f59082I;
        anonymousClass0IL.schedule(E);
        this.f59072B.f59083J.f18979C = false;
    }
}
