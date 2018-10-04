package X;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: X.4c4 */
public final class AnonymousClass4c4 implements OnCheckedChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5VR f55670B;

    public AnonymousClass4c4(AnonymousClass5VR anonymousClass5VR) {
        this.f55670B = anonymousClass5VR;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass0U4.C(this.f55670B.f65322M).B(new AnonymousClass4jx(this.f55670B.f65318I, z));
        AnonymousClass0EE anonymousClass0EE = this.f55670B;
        AnonymousClass0V1.N(anonymousClass0EE, "direct_thread_mute_button", anonymousClass0EE.f65319J.f5871C).H("to_mute", z).R();
    }
}
