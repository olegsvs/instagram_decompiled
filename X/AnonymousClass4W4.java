package X;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: X.4W4 */
public final class AnonymousClass4W4 implements OnCheckedChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4WG f54799B;

    public AnonymousClass4W4(AnonymousClass4WG anonymousClass4WG) {
        this.f54799B = anonymousClass4WG;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f54799B.f54812E = z;
        AnonymousClass0F4.f2058E.C(new AnonymousClass4WC(this.f54799B.f54812E));
    }
}
