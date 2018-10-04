package com.instagram.ui.widget.refresh;

import X.AnonymousClass0QP;
import X.AnonymousClass0cB;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0e6;
import X.AnonymousClass0eA;
import X.AnonymousClass0ic;
import X.AnonymousClass12k;
import X.AnonymousClass2cU;
import X.AnonymousClass52x;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0164R;

public class RefreshableNestedScrollingParent extends FrameLayout implements AnonymousClass0QP, AnonymousClass0cB, AnonymousClass0ic {
    /* renamed from: B */
    public boolean f29420B;
    /* renamed from: C */
    private boolean f29421C;
    /* renamed from: D */
    private AnonymousClass52x f29422D;
    /* renamed from: E */
    private int f29423E;
    /* renamed from: F */
    private final AnonymousClass2cU f29424F;
    /* renamed from: G */
    private final int f29425G;
    /* renamed from: H */
    private final AnonymousClass12k f29426H;
    /* renamed from: I */
    private final AnonymousClass0eA f29427I;
    /* renamed from: J */
    private final AnonymousClass0cN f29428J;
    /* renamed from: K */
    private View f29429K;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public RefreshableNestedScrollingParent(Context context) {
        this(context, null);
    }

    public RefreshableNestedScrollingParent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RefreshableNestedScrollingParent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29427I = new AnonymousClass0eA(this);
        this.f29426H = new AnonymousClass12k(this);
        AnonymousClass0cN C = AnonymousClass0e6.B().C();
        C.f7108F = true;
        this.f29428J = C;
        this.f29425G = getResources().getDimensionPixelSize(C0164R.dimen.refreshable_drawable_size);
        this.f29424F = new AnonymousClass2cU(this);
    }

    /* renamed from: B */
    private void m15174B(boolean z, boolean z2) {
        if (this.f29420B != z) {
            this.f29420B = z;
            AnonymousClass2cU anonymousClass2cU = this.f29424F;
            if (this.f29420B) {
                anonymousClass2cU.f31687D.reset();
                anonymousClass2cU.f31687D.setStartTime(-1);
                anonymousClass2cU.f31687D.start();
                anonymousClass2cU.f31685B.reset();
                anonymousClass2cU.f31685B.setStartTime(-1);
                anonymousClass2cU.f31685B.start();
                anonymousClass2cU.f31686C.invalidate();
            } else {
                anonymousClass2cU.f31685B.cancel();
                anonymousClass2cU.f31687D.cancel();
            }
        }
        if (z2) {
            float f = z ? (float) this.f29425G : 0.0f;
            float E = (float) this.f29428J.E();
            this.f29428J.N((double) f);
            if (E != f) {
                View view = this.f29429K;
                if (view != null && (view instanceof AnonymousClass0ic) && !z) {
                    ((AnonymousClass0ic) view).stopNestedScroll();
                }
            }
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        if (this.f29429K != null) {
            float E = (float) anonymousClass0cN.E();
            this.f29429K.setTranslationY(E);
            invalidate(0, 0, getWidth(), (int) E);
            if (E >= ((float) this.f29425G) && !this.f29420B && this.f29422D != null && this.f29421C) {
                m15174B(true, false);
                this.f29422D.f59535B.run();
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this;
        View view = this.f29429K;
        Canvas canvas2 = canvas;
        if (view != null) {
            AnonymousClass2cU anonymousClass2cU = this.f29424F;
            int i = this.f29425G;
            double E = this.f29428J.E();
            double d = (double) this.f29425G;
            Double.isNaN(d);
            anonymousClass2cU.m16537A(frameLayout, view, canvas2, i, (float) (E / d), frameLayout.f29421C);
        }
        super.dispatchDraw(canvas2);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f29426H.A(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f29426H.B(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f29426H.C(i, i2, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f29426H.E(i, i2, i3, i4, iArr);
    }

    public int getNestedScrollAxes() {
        return this.f29427I.f7587B;
    }

    public final boolean hasNestedScrollingParent() {
        return this.f29426H.G();
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f29426H.f13610B;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -607004218);
        super.onAttachedToWindow();
        this.f29428J.A(this);
        AnonymousClass0cQ.O(this, -966360282, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -749896235);
        super.onDetachedFromWindow();
        this.f29428J.J(this);
        AnonymousClass2cU anonymousClass2cU = this.f29424F;
        anonymousClass2cU.f31685B.cancel();
        anonymousClass2cU.f31687D.cancel();
        AnonymousClass0cQ.O(this, 1851313911, N);
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        float E = (float) this.f29428J.E();
        if (E > 0.0f && i2 > 0) {
            float max = Math.max(0.0f, E - ((float) i2));
            this.f29428J.L((double) max);
            iArr[1] = (int) (E - max);
        }
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this;
        float E = (float) this.f29428J.E();
        float f = (float) i4;
        float f2 = E - f;
        float f3 = ((float) this.f29425G) * 1.4f;
        if (f2 > f3) {
            f2 = E + (E - ((float) Math.sqrt((double) Math.max(0.0f, (f * f3) + (E * E)))));
        }
        f2 = Math.max(0.0f, f2);
        this.f29428J.L((double) f2);
        int i5 = (int) (f2 - E);
        dispatchNestedScroll(i, i5, i3, i4 - i5, null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f29423E = (int) this.f29428J.E();
        this.f29429K = view2;
        this.f29427I.A(view, view2, i);
        startNestedScroll(2);
        this.f29421C = true;
    }

    public final void onStopNestedScroll(View view) {
        if (((double) this.f29423E) != this.f29428J.E() && this.f29428J.G()) {
            setRefreshing(this.f29428J.E() > ((double) this.f29425G));
        }
        this.f29427I.B(view);
        stopNestedScroll();
        this.f29421C = false;
    }

    public void setListener(AnonymousClass52x anonymousClass52x) {
        this.f29422D = anonymousClass52x;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f29426H.I(z);
    }

    public void setRefreshing(boolean z) {
        m15174B(z, true);
    }

    public final boolean startNestedScroll(int i) {
        return this.f29426H.J(i);
    }

    public final void stopNestedScroll() {
        this.f29426H.L();
    }
}
