package X;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.5As */
public final class AnonymousClass5As implements TextWatcher {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5At f60865B;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass5As(AnonymousClass5At anonymousClass5At) {
        this.f60865B = anonymousClass5At;
    }

    public final void afterTextChanged(Editable editable) {
        this.f60865B.f60872H.f28148C = editable.toString();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AnonymousClass5At.m25912B(this.f60865B);
    }
}
