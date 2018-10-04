package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.text.style.LineBackgroundSpan;

/* renamed from: X.2GS */
public final class AnonymousClass2GS implements LineBackgroundSpan {
    /* renamed from: B */
    private int f28285B = -1;
    /* renamed from: C */
    private int f28286C = -1;

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        if (i != this.f28285B || i2 != this.f28286C) {
            float f = ((float) (i + i2)) / 2.0f;
            float measureText = paint.measureText(charSequence.toString()) / 2.0f;
            paint.setShader(new LinearGradient(f - measureText, 0.0f, f + measureText, 0.0f, AnonymousClass1IS.f16868I, null, TileMode.CLAMP));
            this.f28285B = i;
            this.f28286C = i2;
        }
    }
}
