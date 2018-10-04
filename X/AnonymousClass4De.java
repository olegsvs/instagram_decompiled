package X;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.4De */
public final class AnonymousClass4De implements TextWatcher {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Dn f51640B;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass4De(AnonymousClass4Dn anonymousClass4Dn) {
        this.f51640B = anonymousClass4Dn;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f51640B.f51663D != null) {
            this.f51640B.f51663D.setPrimaryButtonEnabled(false);
        }
        this.f51640B.f51669J.removeMessages(1);
        this.f51640B.f51669J.sendEmptyMessageDelayed(1, 1000);
    }
}
