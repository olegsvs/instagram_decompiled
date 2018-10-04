package X;

import android.text.Editable;

/* renamed from: X.3WN */
public final class AnonymousClass3WN extends AnonymousClass2KI {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3WQ f41885B;

    public AnonymousClass3WN(AnonymousClass3WQ anonymousClass3WQ) {
        this.f41885B = anonymousClass3WQ;
    }

    public final void afterTextChanged(Editable editable) {
        this.f41885B.f41888B.setVisibility(editable.length() > 0 ? 0 : 8);
    }
}
