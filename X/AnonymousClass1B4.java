package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.1B4 */
public final class AnonymousClass1B4 extends ClickableSpan {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0P7 f15361B;

    public final void updateDrawState(TextPaint textPaint) {
    }

    public AnonymousClass1B4(AnonymousClass0P7 anonymousClass0P7) {
        this.f15361B = anonymousClass0P7;
    }

    public final void onClick(View view) {
        AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0uK(this.f15361B));
    }
}
