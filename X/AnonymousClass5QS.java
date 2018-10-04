package X;

import com.facebook.C0164R;

/* renamed from: X.5QS */
public final class AnonymousClass5QS implements AnonymousClass0Se {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5QV f63250B;

    public AnonymousClass5QS(AnonymousClass5QV anonymousClass5QV) {
        this.f63250B = anonymousClass5QV;
    }

    public final boolean dDA(boolean z) {
        if (z) {
            AnonymousClass5QV.m26464B(this.f63250B, true);
            return z;
        }
        z = this.f63250B;
        new AnonymousClass0P2(z.getContext()).V(C0164R.string.primary_country_dialog_title).K(C0164R.string.primary_country_dialog_message).S(C0164R.string.primary_country_dialog_primary_button, new AnonymousClass5QU(z)).N(C0164R.string.cancel, new AnonymousClass5QT(z)).A().show();
        return false;
    }
}
