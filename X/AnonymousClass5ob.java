package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: X.5ob */
public final class AnonymousClass5ob extends CharacterStyle implements UpdateAppearance {
    /* renamed from: B */
    private final int f69119B;

    public AnonymousClass5ob(int i) {
        this.f69119B = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f69119B);
    }
}
