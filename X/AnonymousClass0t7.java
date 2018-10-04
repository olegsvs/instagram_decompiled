package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* renamed from: X.0t7 */
public abstract class AnonymousClass0t7 extends ClickableSpan {
    /* renamed from: B */
    private int f11596B;
    /* renamed from: C */
    private boolean f11597C;

    public AnonymousClass0t7(int i, int i2) {
        this.f11596B = i2;
        boolean z = true;
        if ((i & 1) != 1) {
            z = false;
        }
        this.f11597C = z;
    }

    public AnonymousClass0t7(boolean z, int i) {
        this.f11597C = z;
        this.f11596B = i;
    }

    public void updateDrawState(TextPaint textPaint) {
        int i = this.f11596B;
        if (i == 0) {
            textPaint.setColor(textPaint.linkColor);
        } else if (i != -1) {
            textPaint.setColor(i);
        }
        textPaint.setFakeBoldText(this.f11597C);
    }
}
