package X;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: X.5w5 */
public final class AnonymousClass5w5 implements OnCheckedChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5w7 f70136B;

    public AnonymousClass5w5(AnonymousClass5w7 anonymousClass5w7) {
        this.f70136B = anonymousClass5w7;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        compoundButton = this.f70136B;
        compoundButton.f70143D.f18979C = z;
        AnonymousClass2MX.K(z, compoundButton);
    }
}
