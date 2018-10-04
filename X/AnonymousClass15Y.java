package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.15Y */
public final class AnonymousClass15Y extends ClickableSpan {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass14Z f14307B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Pj f14308C;

    public AnonymousClass15Y(AnonymousClass14Z anonymousClass14Z, AnonymousClass0Pj anonymousClass0Pj) {
        this.f14307B = anonymousClass14Z;
        this.f14308C = anonymousClass0Pj;
    }

    public final void onClick(View view) {
        this.f14307B.f13933W.zEA(this.f14307B.f13954r, this.f14308C, AnonymousClass5Dc.f61317E);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(-1);
    }
}
