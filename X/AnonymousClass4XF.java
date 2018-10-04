package X;

import com.facebook.C0164R;

/* renamed from: X.4XF */
public final class AnonymousClass4XF implements AnonymousClass1DQ {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Uc f54958B;
    /* renamed from: C */
    private boolean f54959C;

    public AnonymousClass4XF(AnonymousClass5Uc anonymousClass5Uc) {
        this.f54958B = anonymousClass5Uc;
    }

    public final boolean XTA() {
        this.f54959C = AnonymousClass1Ba.I(this.f54958B.getActivity(), "android.permission.ACCESS_FINE_LOCATION");
        return true;
    }

    public final void Yt(AnonymousClass1Bb anonymousClass1Bb) {
        if (anonymousClass1Bb != AnonymousClass1Bb.GRANTED) {
            this.f54958B.f64978G.removeMessages(1);
            Object obj = (this.f54959C || anonymousClass1Bb != AnonymousClass1Bb.DENIED_DONT_ASK_AGAIN) ? null : 1;
            if (obj != null) {
                CharSequence string = this.f54958B.getResources().getString(C0164R.string.system_settings_permission_dialog_text, new Object[]{this.f54958B.getResources().getString(C0164R.string.location_permission_name)});
                AnonymousClass0IL anonymousClass0IL = this.f54958B;
                anonymousClass0IL.f64985N = new AnonymousClass0Sb(anonymousClass0IL.getContext()).I(string).E(false).O(C0164R.string.system_settings_permission_dialog_button_label, new AnonymousClass4XE(this)).L(C0164R.string.cancel, new AnonymousClass4XD(this)).N(new AnonymousClass4XC(this)).C();
                this.f54958B.f64985N.show();
                return;
            }
            this.f54958B.f64978G.sendEmptyMessage(1);
        }
    }
}
