package X;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: X.5QR */
public final class AnonymousClass5QR implements OnCheckedChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5QV f63249B;

    public AnonymousClass5QR(AnonymousClass5QV anonymousClass5QV) {
        this.f63249B = anonymousClass5QV;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            compoundButton = new AnonymousClass0Pt(this.f63249B.f63254D);
            compoundButton.f4226J = AnonymousClass0Pu.f4247G;
            compoundButton.f4229M = "accounts/enable_primary_location/";
            AnonymousClass0Ix.D(compoundButton.M(AnonymousClass0Pv.class).N().H());
            return;
        }
        AnonymousClass5Px.m26449B(this.f63249B.f63254D);
    }
}
