package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: X.4wa */
public final class AnonymousClass4wa extends ImageSpan {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5c3 f58696B;
    /* renamed from: C */
    public final /* synthetic */ int f58697C;

    public AnonymousClass4wa(AnonymousClass5c3 anonymousClass5c3, Drawable drawable, int i, int i2) {
        this.f58696B = anonymousClass5c3;
        this.f58697C = i2;
        super(drawable, i);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(f, (float) (((i5 - this.f58696B.f67236B.getBounds().bottom) - paint.getFontMetricsInt().descent) + this.f58697C));
        this.f58696B.f67236B.draw(canvas);
        canvas.restore();
    }
}
