package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.5Dr */
public final class AnonymousClass5Dr extends ClickableSpan {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0QM f61353B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Pj f61354C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass14s f61355D;

    public AnonymousClass5Dr(AnonymousClass14s anonymousClass14s, AnonymousClass0QM anonymousClass0QM, AnonymousClass0Pj anonymousClass0Pj) {
        this.f61355D = anonymousClass14s;
        this.f61353B = anonymousClass0QM;
        this.f61354C = anonymousClass0Pj;
    }

    public final void onClick(View view) {
        if (!this.f61355D.f14096X) {
            this.f61355D.f14096X = true;
            this.f61353B.nGA(this.f61354C);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
