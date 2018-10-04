package X;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.0qK */
public final class AnonymousClass0qK extends Drawable implements AnimatorListener, AnimatorUpdateListener {
    /* renamed from: B */
    public final ValueAnimator f10906B = ValueAnimator.ofInt(new int[]{0, 255});
    /* renamed from: C */
    private AnonymousClass1L4 f10907C = AnonymousClass1L4.PRE_TRANSITION;
    /* renamed from: D */
    private int f10908D;
    /* renamed from: E */
    private int f10909E;
    /* renamed from: F */
    private final Matrix f10910F = new Matrix();
    /* renamed from: G */
    private Drawable f10911G;
    /* renamed from: H */
    private final Matrix f10912H = new Matrix();
    /* renamed from: I */
    private final Drawable f10913I;

    public final int getOpacity() {
        return -3;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass0qK(Drawable drawable, Drawable drawable2, int i, int i2) {
        this.f10911G = drawable;
        this.f10913I = drawable2;
        this.f10913I.setAlpha(0);
        this.f10909E = i;
        this.f10908D = i2;
        this.f10906B.addListener(this);
        this.f10906B.addUpdateListener(this);
        m7926B();
    }

    /* renamed from: B */
    private void m7926B() {
        Drawable drawable = this.f10911G;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f10911G.getIntrinsicHeight());
            m7927C(this.f10910F, this.f10911G);
        }
        drawable = this.f10913I;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f10913I.getIntrinsicHeight());
        m7927C(this.f10912H, this.f10913I);
        invalidateSelf();
    }

    /* renamed from: C */
    private void m7927C(Matrix matrix, Drawable drawable) {
        float f;
        float f2;
        matrix.reset();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i = this.f10908D;
        int i2 = intrinsicWidth * i;
        int i3 = this.f10909E;
        float f3 = 0.0f;
        if (i2 > i3 * intrinsicHeight) {
            f = ((float) i) / ((float) intrinsicHeight);
            f2 = (((float) i3) - (((float) intrinsicWidth) * f)) * 0.5f;
        } else {
            f = ((float) i3) / ((float) intrinsicWidth);
            f3 = (((float) i) - (((float) intrinsicHeight) * f)) * 0.5f;
            f2 = 0.0f;
        }
        matrix.setScale(f, f);
        matrix.postTranslate((float) ((int) (f2 + 0.5f)), (float) ((int) (f3 + 0.5f)));
    }

    public final void draw(Canvas canvas) {
        if (!(this.f10907C == AnonymousClass1L4.POST_TRANSITION || this.f10911G == null)) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.concat(this.f10910F);
            this.f10911G.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
        if (this.f10907C != AnonymousClass1L4.PRE_TRANSITION) {
            saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.concat(this.f10912H);
            this.f10913I.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
    }

    public final int getIntrinsicHeight() {
        return this.f10908D;
    }

    public final int getIntrinsicWidth() {
        return this.f10909E;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f10907C = AnonymousClass1L4.POST_TRANSITION;
        this.f10913I.setAlpha(255);
        this.f10911G = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.f10907C = AnonymousClass1L4.IN_TRANSITION;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10913I.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10911G;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        this.f10909E = rect.width();
        this.f10908D = rect.height();
        m7926B();
    }
}
