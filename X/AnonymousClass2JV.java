package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.2JV */
public class AnonymousClass2JV extends ClickableSpan {
    /* renamed from: B */
    private final Integer f28825B;

    public void onClick(View view) {
    }

    public AnonymousClass2JV(int i) {
        this.f28825B = Integer.valueOf(i);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer num = this.f28825B;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
    }
}
