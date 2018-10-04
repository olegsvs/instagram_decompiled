package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.19s */
public final class AnonymousClass19s extends ClickableSpan {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0jy f15190B;
    /* renamed from: C */
    public final /* synthetic */ int f15191C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0P7 f15192D;
    /* renamed from: E */
    public final /* synthetic */ int f15193E;

    public AnonymousClass19s(AnonymousClass0jy anonymousClass0jy, AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        this.f15190B = anonymousClass0jy;
        this.f15192D = anonymousClass0P7;
        this.f15191C = i;
        this.f15193E = i2;
    }

    public final void onClick(View view) {
        if (this.f15190B == null) {
            return;
        }
        if (this.f15192D.WA() || this.f15192D.m3773c() == AnonymousClass0xx.Foursquare) {
            this.f15190B.Gg(this.f15192D);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (!this.f15192D.WA()) {
            if (this.f15192D.m3773c() != AnonymousClass0xx.Foursquare) {
                textPaint.setColor(this.f15193E);
                return;
            }
        }
        textPaint.setColor(this.f15191C);
    }
}
