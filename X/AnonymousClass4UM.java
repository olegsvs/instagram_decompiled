package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.4UM */
public final class AnonymousClass4UM extends AnonymousClass2KI {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5UT f54584B;
    /* renamed from: C */
    private CharSequence f54585C = JsonProperty.USE_DEFAULT_NAME;

    public AnonymousClass4UM(AnonymousClass5UT anonymousClass5UT) {
        this.f54584B = anonymousClass5UT;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f54584B.f64884Q.getLineCount() > 3) {
            this.f54584B.f64884Q.getText().replace(0, this.f54584B.f64884Q.getText().length(), this.f54585C);
        }
        if (editable.length() == 0) {
            this.f54584B.f64884Q.setGravity(8388611);
        } else {
            this.f54584B.f64884Q.setGravity(17);
        }
        this.f54585C = new SpannableStringBuilder(this.f54584B.f64884Q.getText());
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f54584B.f64879L = true;
            AnonymousClass5UT.I(this.f54584B);
        }
    }
}
