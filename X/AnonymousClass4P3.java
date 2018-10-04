package X;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: X.4P3 */
public final class AnonymousClass4P3 implements OnFocusChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4PD f53651B;

    public AnonymousClass4P3(AnonymousClass4PD anonymousClass4PD) {
        this.f53651B = anonymousClass4PD;
    }

    public final void onFocusChange(View view, boolean z) {
        AnonymousClass4PD.m24124L(this.f53651B);
        AnonymousClass4PD.m24129Q(this.f53651B);
        if (z) {
            AnonymousClass4PD.m24122J(this.f53651B, AnonymousClass4PC.EDITING_TEXT);
        } else if (!AnonymousClass4PD.m24117E(this.f53651B)) {
            if (this.f53651B.f53675I != null) {
                this.f53651B.f53678L.m16529J(this.f53651B.f53675I);
                this.f53651B.f53675I = null;
            }
            AnonymousClass4PD.m24120H(this.f53651B);
        } else if (AnonymousClass0mE.I(this.f53651B.f53671E)) {
            AnonymousClass4PD.m24119G(this.f53651B);
        } else {
            this.f53651B.f53671E.addOnLayoutChangeListener(new AnonymousClass4P2(this));
        }
    }
}
