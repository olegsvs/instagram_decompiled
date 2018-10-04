package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.5G6 */
public final class AnonymousClass5G6 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5GA f61641B;

    public AnonymousClass5G6(AnonymousClass5GA anonymousClass5GA) {
        this.f61641B = anonymousClass5GA;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass33Z.T("setting", "switch_back", "confirm", AnonymousClass0a2.I(this.f61641B.f61650E));
        if (this.f61641B.f61650E.B().G()) {
            AnonymousClass5GA.m26089B(this.f61641B.f61649D, this.f61641B.f61650E);
        } else {
            this.f61641B.f61648C.A(AnonymousClass0mR.BUSINESS_BACK_TO_PERSONAL);
        }
        if (this.f61641B.f61649D instanceof AnonymousClass5IH) {
            ((AnonymousClass5IH) this.f61641B.f61649D).m26174A();
        }
    }
}
