package X;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.3XV */
public final class AnonymousClass3XV implements TextWatcher {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3Xa f42071B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3XE f42072C;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass3XV(AnonymousClass3Xa anonymousClass3Xa, AnonymousClass3XE anonymousClass3XE) {
        this.f42071B = anonymousClass3Xa;
        this.f42072C = anonymousClass3XE;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f42071B.m19888A(this.f42072C, AnonymousClass3XY.STARTED_TYPING);
    }
}
