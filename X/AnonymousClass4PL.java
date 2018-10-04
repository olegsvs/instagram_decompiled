package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: X.4PL */
public final class AnonymousClass4PL implements TextWatcher {
    /* renamed from: B */
    public boolean f53726B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5cl f53727C;

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass4PL(AnonymousClass5cl anonymousClass5cl) {
        this.f53727C = anonymousClass5cl;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f53727C.f67423V == AnonymousClass4Pk.EDITING_TEXT) {
            this.f53727C.f67439l.m24355B(this.f53726B);
            if (((AnonymousClass4Pl[]) AnonymousClass2Jd.m15020E(editable, AnonymousClass4Pl.class)).length == 0) {
                editable.setSpan(new AnonymousClass4Pl(editable), 0, editable.length(), 18);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f53726B = TextUtils.isEmpty(charSequence);
    }
}
