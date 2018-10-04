package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.25p */
public final class AnonymousClass25p extends Drawable {
    /* renamed from: B */
    private final AnonymousClass25q f25849B;
    /* renamed from: C */
    private final Rect f25850C = new Rect();
    /* renamed from: D */
    private final int f25851D;
    /* renamed from: E */
    private final float f25852E;
    /* renamed from: F */
    private final AnonymousClass25q f25853F;
    /* renamed from: G */
    private final int f25854G;
    /* renamed from: H */
    private final float f25855H;
    /* renamed from: I */
    private final float f25856I;

    public final int getOpacity() {
        return -2;
    }

    public AnonymousClass25p(int i, float f, int i2, float f2, float f3) {
        AnonymousClass1mY.m13011B(f < f2);
        this.f25851D = i;
        this.f25854G = i2;
        this.f25856I = f2;
        this.f25852E = f;
        this.f25855H = f3;
        this.f25849B = new AnonymousClass25q(this.f25851D, this.f25852E, this.f25855H);
        this.f25853F = new AnonymousClass25q(this.f25854G, this.f25856I, this.f25855H);
    }

    /* renamed from: B */
    public static AnonymousClass25p m14385B(Context context, float f, float f2) {
        int alpha = Color.alpha(637534208);
        return new AnonymousClass25p(855638016, AnonymousClass0Nm.C(context, 1), Color.argb(Math.min(alpha, Math.round((f / AnonymousClass0Nm.C(context, 10)) * ((float) alpha))), Color.red(637534208), Color.green(637534208), Color.blue(637534208)), f, f2);
    }

    public final void draw(Canvas canvas) {
        this.f25853F.draw(canvas);
        this.f25849B.draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        this.f25850C.set(rect);
        this.f25850C.inset(Math.round(this.f25856I - this.f25852E), Math.round(this.f25856I - this.f25852E));
        this.f25849B.setBounds(this.f25850C);
        this.f25853F.setBounds(rect);
    }

    public final void setAlpha(int i) {
        this.f25849B.mutate().setAlpha(i);
        this.f25853F.mutate().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25849B.mutate().setColorFilter(colorFilter);
        this.f25853F.mutate().setColorFilter(colorFilter);
    }
}
