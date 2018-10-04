package X;

import android.text.Editable;

/* renamed from: X.51Y */
public final class AnonymousClass51Y extends AnonymousClass2KI {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51g f59336B;

    public AnonymousClass51Y(AnonymousClass51g anonymousClass51g) {
        this.f59336B = anonymousClass51g;
    }

    public final void afterTextChanged(Editable editable) {
        if (editable.length() == this.f59336B.f59344B.getMaximumSize()) {
            this.f59336B.f59345C.setEnabled(true);
        } else {
            this.f59336B.f59345C.setEnabled(false);
        }
    }
}
