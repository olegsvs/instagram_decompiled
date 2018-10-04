package com.instagram.ui.widget.pageindicator;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Nm;
import X.AnonymousClass0QP;
import X.AnonymousClass0QQ;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dh;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0e8;
import X.AnonymousClass0eS;
import X.AnonymousClass1Ar;
import X.AnonymousClass1Iw;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.forker.Process;

public class CirclePageIndicator extends View implements AnonymousClass1Ar, AnonymousClass0QP, AnonymousClass0QQ {
    /* renamed from: B */
    public int f15326B;
    /* renamed from: C */
    public boolean f15327C;
    /* renamed from: D */
    public int f15328D;
    /* renamed from: E */
    public final ArgbEvaluator f15329E;
    /* renamed from: F */
    public int f15330F;
    /* renamed from: G */
    public final Paint f15331G;
    /* renamed from: H */
    public float f15332H;
    /* renamed from: I */
    public final int f15333I;
    /* renamed from: J */
    private int f15334J;
    /* renamed from: K */
    private final int f15335K;
    /* renamed from: L */
    private final int f15336L;
    /* renamed from: M */
    private final AnonymousClass0cN f15337M;
    /* renamed from: N */
    private int f15338N;
    /* renamed from: O */
    private final int f15339O;

    public final void At(int i) {
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Bt(int i) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Kt(int i, int i2) {
    }

    public final void RGA(View view) {
    }

    public final void eCA(int i, int i2) {
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void uy(AnonymousClass1Iw anonymousClass1Iw, AnonymousClass1Iw anonymousClass1Iw2) {
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15331G = new Paint(1);
        this.f15329E = new ArgbEvaluator();
        int C = AnonymousClass0Ca.m937C(getContext(), C0164R.color.grey_5);
        int E = (int) AnonymousClass0Nm.m3426E(getResources().getDisplayMetrics(), 3);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.CirclePageIndicator, i, 0);
            this.f15326B = obtainStyledAttributes.getColor(0, C);
            this.f15330F = obtainStyledAttributes.getColor(3, C);
            this.f15336L = obtainStyledAttributes.getDimensionPixelSize(1, E);
            this.f15339O = obtainStyledAttributes.getDimensionPixelOffset(2, E);
            this.f15338N = obtainStyledAttributes.getInt(6, 5);
            this.f15335K = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.f15333I = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            obtainStyledAttributes.recycle();
        } else {
            this.f15326B = C;
            this.f15330F = C;
            this.f15336L = E;
            this.f15339O = E;
            this.f15335K = -1;
            this.f15333I = -1;
        }
        this.f15337M = AnonymousClass0e6.m6190B().m6193C().m5770O(AnonymousClass0e5.m6189C(30.0d, 7.0d));
    }

    /* renamed from: A */
    public final void m9762A(int i, int i2) {
        setCurrentPage(i);
        this.f15334J = i2;
        requestLayout();
    }

    /* renamed from: B */
    public final void m9763B(int i, boolean z) {
        setCurrentPage(i);
        if (z) {
            setScrollX(0);
            this.f15337M.m5767L((double) getTargetScrollPosition());
        }
    }

    /* renamed from: C */
    public final boolean m9764C() {
        return this.f15328D + 1 == this.f15334J;
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        if (this.f15334J > this.f15338N) {
            setScrollX((int) Math.round(anonymousClass0cN.m5760E()));
        } else {
            setScrollX(0);
        }
    }

    private int getTargetScrollPosition() {
        int i;
        int paddingLeft = getPaddingLeft();
        int i2 = 0;
        for (int i3 = 0; i3 < this.f15334J; i3++) {
            i = this.f15336L;
            paddingLeft += i;
            if (i3 == this.f15328D) {
                i2 = paddingLeft - i;
                i = i2 + (i * 2);
                break;
            }
            paddingLeft += i + this.f15339O;
        }
        i = 0;
        i2 -= getPaddingLeft();
        i = (i - getWidth()) + getPaddingRight();
        if (i > getScrollX()) {
            return i;
        }
        return i2 < getScrollX() ? i2 : getScrollX();
    }

    public final void ly(float f, float f2, AnonymousClass1Iw anonymousClass1Iw) {
        this.f15332H = (float) AnonymousClass0dh.m6102B((double) f, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) (this.f15334J - 1));
        invalidate();
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -913693523);
        super.onAttachedToWindow();
        this.f15337M.m5756A(this);
        AnonymousClass0cQ.m5865O(this, -658242455, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -1280897534);
        super.onDetachedFromWindow();
        this.f15337M.m5766K().m5765J(this);
        AnonymousClass0cQ.m5865O(this, -1263765291, N);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop() + (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
        int i = 0;
        while (true) {
            int i2 = r0.f15334J;
            if (i < i2) {
                int i3 = r0.f15336L;
                paddingLeft += i3;
                float f = (float) i3;
                if (i2 > r0.f15338N) {
                    if ((i3 + paddingLeft) - getScrollX() > getWidth() - getPaddingRight()) {
                        f = (float) AnonymousClass0dh.m6103C((double) ((r0.f15336L + paddingLeft) - getScrollX()), (double) (getWidth() - getPaddingRight()), (double) getWidth(), (double) r0.f15336L, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
                    } else if ((paddingLeft - r0.f15336L) - getScrollX() < getPaddingLeft()) {
                        f = (float) AnonymousClass0dh.m6103C((double) ((paddingLeft - r0.f15336L) - getScrollX()), (double) getPaddingLeft(), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) r0.f15336L, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
                    }
                }
                i3 = AnonymousClass0e8.m6200D(getContext()) ? (r0.f15334J - i) - 1 : i;
                if (r0.f15327C) {
                    float f2;
                    float f3;
                    int floor = (int) Math.floor((double) r0.f15332H);
                    int ceil = (int) Math.ceil((double) r0.f15332H);
                    if (floor == r0.f15328D) {
                        f2 = r0.f15332H;
                        f3 = (float) floor;
                    } else {
                        f2 = (float) ceil;
                        f3 = r0.f15332H;
                    }
                    f2 -= f3;
                    if (i3 == r0.f15328D) {
                        r0.f15331G.setColor(((Integer) r0.f15329E.evaluate(f2, Integer.valueOf(r0.f15326B), Integer.valueOf(r0.f15330F))).intValue());
                    } else {
                        if (i3 != floor) {
                            if (i3 != ceil) {
                                r0.f15331G.setColor(r0.f15330F);
                            }
                        }
                        r0.f15331G.setColor(((Integer) r0.f15329E.evaluate(f2, Integer.valueOf(r0.f15330F), Integer.valueOf(r0.f15326B))).intValue());
                    }
                    if (i3 == r0.f15328D) {
                        canvas2.drawCircle((float) paddingLeft, (float) paddingTop, (float) AnonymousClass0dh.m6103C((double) (1.0f - f2), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) (f * 0.8f), (double) f), r0.f15331G);
                    } else {
                        if (i3 != floor) {
                            if (i3 != ceil) {
                                canvas2.drawCircle((float) paddingLeft, (float) paddingTop, f * 0.8f, r0.f15331G);
                            }
                        }
                        canvas2.drawCircle((float) paddingLeft, (float) paddingTop, (float) AnonymousClass0dh.m6103C((double) f2, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) (f * 0.8f), (double) f), r0.f15331G);
                    }
                } else {
                    if (i3 != r0.f15328D) {
                        f *= 0.8f;
                    }
                    if (r0.f15333I != -1) {
                        Paint paint = new Paint(1);
                        paint.setColor(AnonymousClass0Ca.m937C(getContext(), C0164R.color.black_15_transparent));
                        paint.setMaskFilter(new BlurMaskFilter((float) r0.f15333I, Blur.NORMAL));
                        setLayerType(1, null);
                        canvas2.drawCircle((float) paddingLeft, (float) paddingTop, ((float) r0.f15333I) + f, paint);
                    }
                    r0.f15331G.setColor(i3 == r0.f15328D ? r0.f15326B : r0.f15330F);
                    canvas2.drawCircle((float) paddingLeft, (float) paddingTop, f, r0.f15331G);
                }
                paddingLeft += r0.f15336L + r0.f15339O;
                i++;
            } else {
                return;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int paddingLeft;
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int i5 = this.f15333I;
        if (i5 == -1) {
            i5 = 0;
        }
        if (mode != 1073741824) {
            paddingLeft = getPaddingLeft() + getPaddingRight();
            i3 = this.f15334J;
            paddingLeft = (paddingLeft + ((i3 * 2) * (this.f15336L + i5))) + ((i3 - 1) * this.f15339O);
            size = mode == Process.WAIT_RESULT_TIMEOUT ? Math.min(paddingLeft, size) : paddingLeft;
            i4 = this.f15335K;
            if (i4 != -1) {
                size = Math.min(i4, size);
            }
        }
        paddingLeft = MeasureSpec.getMode(i2);
        i3 = MeasureSpec.getSize(i2);
        if (paddingLeft != 1073741824) {
            i4 = getPaddingBottom() + (((this.f15336L + i5) * 2) + getPaddingTop());
            i3 = paddingLeft == Process.WAIT_RESULT_TIMEOUT ? Math.min(i4, i3) : i4;
        }
        setMeasuredDimension(size, i3);
    }

    public final void onPageSelected(int i) {
        m9763B(i, false);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.m5864N(this, -643988674);
        super.onSizeChanged(i, i2, i3, i4);
        setScrollX(0);
        this.f15337M.m5767L((double) getTargetScrollPosition());
        AnonymousClass0cQ.m5865O(this, 191314593, N);
    }

    public void setActiveColor(int i) {
        this.f15326B = i;
        invalidate();
    }

    public void setAnimatePageDotSelection(boolean z) {
        this.f15327C = z;
    }

    private void setCurrentPage(int i) {
        this.f15328D = i;
        double targetScrollPosition = (double) getTargetScrollPosition();
        if (targetScrollPosition != this.f15337M.f7106D) {
            this.f15337M.m5769N(targetScrollPosition);
        }
        invalidate();
    }

    public void setInactiveColor(int i) {
        this.f15330F = i;
        invalidate();
    }

    public final void ys(int i, int i2) {
        m9763B(i, false);
    }
}
