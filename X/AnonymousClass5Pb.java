package X;

import android.text.TextUtils;
import android.widget.EditText;

/* renamed from: X.5Pb */
public final class AnonymousClass5Pb extends AnonymousClass0zU {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5b4 f63147B;
    /* renamed from: C */
    public final /* synthetic */ EditText f63148C;

    public AnonymousClass5Pb(AnonymousClass5b4 anonymousClass5b4, EditText editText) {
        this.f63147B = anonymousClass5b4;
        this.f63148C = editText;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f63147B.f66803H != null) {
            i2 = this.f63147B.f66803H;
            i = charSequence.toString();
            charSequence = this.f63148C.hasFocus();
            i2.f73655I.m27782B(TextUtils.isEmpty(i) ^ 1);
            AnonymousClass6GC anonymousClass6GC = i2.f73650D;
            if (anonymousClass6GC != null) {
                anonymousClass6GC.mo6817C(i, charSequence);
            }
        }
    }
}
