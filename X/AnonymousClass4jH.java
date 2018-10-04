package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;

/* renamed from: X.4jH */
public final class AnonymousClass4jH implements TextWatcher {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4jN f56566B;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass4jH(AnonymousClass4jN anonymousClass4jN) {
        this.f56566B = anonymousClass4jN;
    }

    public final void afterTextChanged(Editable editable) {
        this.f56566B.m24904H();
        if (this.f56566B.f56600f) {
            AnonymousClass4jN anonymousClass4jN = this.f56566B;
            String trim = anonymousClass4jN.f56607m.getText().toString().trim();
            if (TextUtils.isEmpty(trim)) {
                anonymousClass4jN.f56613s.setVisibility(0);
                anonymousClass4jN.f56613s.setImageDrawable(anonymousClass4jN.f56612r);
                return;
            }
            AnonymousClass4b3 B = AnonymousClass4b3.m24550B(anonymousClass4jN.f56620z);
            AnonymousClass0Sy.C();
            if ((B.m24555B(trim) != null ? 1 : null) != null) {
                AnonymousClass0LH.E(anonymousClass4jN.f56613s);
                if (anonymousClass4jN.f56613s.getDrawable() == anonymousClass4jN.f56612r) {
                    anonymousClass4jN.f56613s.setVisibility(0);
                    anonymousClass4jN.f56613s.setImageDrawable(anonymousClass4jN.f56611q);
                    AnonymousClass14H.C((View) AnonymousClass0LH.E(anonymousClass4jN.f56613s)).J().C(0.0f, 1.0f, -1.0f).D(0.0f, 1.0f, -1.0f).L(AnonymousClass0e5.C(60.0d, 5.0d)).N();
                    return;
                }
                return;
            }
            anonymousClass4jN.f56613s.setVisibility(8);
            anonymousClass4jN.f56613s.setImageDrawable(anonymousClass4jN.f56612r);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f56566B.f56577I.yr(charSequence, i, i2, i3, AnonymousClass4jN.m24886E(this.f56566B));
    }
}
