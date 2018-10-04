package com.instagram.creation.base.ui.sliderview;

import X.AnonymousClass0cQ;
import X.AnonymousClass3DO;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

public class SliderView extends HorizontalScrollView {
    /* renamed from: B */
    public float f39259B = 1.0f;
    /* renamed from: C */
    public float f39260C = -1.0f;
    /* renamed from: D */
    public int f39261D;
    /* renamed from: E */
    public RulerView f39262E;
    /* renamed from: F */
    public float f39263F;
    /* renamed from: G */
    public boolean f39264G = false;
    /* renamed from: H */
    private float f39265H;
    /* renamed from: I */
    private boolean f39266I = false;
    /* renamed from: J */
    private float f39267J;
    /* renamed from: K */
    private float f39268K = Float.NaN;
    /* renamed from: L */
    private boolean f39269L;
    /* renamed from: M */
    private boolean f39270M;
    /* renamed from: N */
    private AnonymousClass3DO f39271N;
    /* renamed from: O */
    private float f39272O;
    /* renamed from: P */
    private boolean f39273P;
    /* renamed from: Q */
    private boolean f39274Q;

    public final void fling(int i) {
    }

    public SliderView(Context context) {
        super(context);
    }

    public SliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SliderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: A */
    public final void m19066A(float f, boolean z) {
        int max = (int) (this.f39263F * ((Math.max(this.f39260C, Math.min(this.f39259B, f)) + 1.0f) / 2.0f));
        if (z) {
            smoothScrollTo(max, 0);
        } else {
            scrollTo(max, 0);
        }
    }

    /* renamed from: B */
    private static float m19064B(float f) {
        return ((float) Math.round((f * 25.0f) * 10.0f)) / 10.0f;
    }

    /* renamed from: B */
    public final void m19067B(float f, boolean z) {
        if (this.f39266I) {
            m19066A(f / 25.0f, z);
            return;
        }
        this.f39269L = true;
        this.f39265H = f;
        this.f39270M = z;
    }

    /* renamed from: C */
    private float m19065C(int i) {
        double d = (double) i;
        double width = (double) getWidth();
        Double.isNaN(width);
        width /= 2.0d;
        Double.isNaN(d);
        return ((float) ((((int) (d + width)) - this.f39261D) * 2)) / this.f39263F;
    }

    private float getCurrentScrollPercent() {
        return m19065C(getScrollX());
    }

    public final void onFinishInflate() {
        int N = AnonymousClass0cQ.N(this, -1882591759);
        super.onFinishInflate();
        RulerView rulerView = (RulerView) getChildAt(0);
        this.f39262E = rulerView;
        rulerView.setPaddingTopRatio(0.05f);
        this.f39262E.setPaddingBottomRatio(0.2f);
        this.f39262E.setSmallLineRatio(0.85f);
        this.f39262E.setLeftRightMarginRatio(0.5f);
        this.f39262E.setNumIncrements(50);
        AnonymousClass0cQ.O(this, -1695533085, N);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f39266I) {
            this.f39264G = false;
            scrollTo(((this.f39262E.getLeft() + this.f39262E.getRight()) - getWidth()) / 2, getScrollY());
            this.f39261D = getScrollX() + (getWidth() / 2);
            this.f39264G = true;
            this.f39263F = (float) (this.f39262E.getWidth() - getWidth());
            this.f39260C = -1.0f;
            this.f39259B = 1.0f;
            this.f39266I = true;
        }
        if (this.f39269L) {
            m19066A(this.f39265H / 25.0f, this.f39270M);
            this.f39269L = false;
            this.f39265H = 0.0f;
            this.f39270M = false;
        }
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f39264G) {
            float currentScrollPercent = getCurrentScrollPercent();
            float f = this.f39259B;
            if (currentScrollPercent > f) {
                m19066A(f, false);
                currentScrollPercent = this.f39259B;
            } else {
                f = this.f39260C;
                if (currentScrollPercent < f) {
                    m19066A(f, false);
                    currentScrollPercent = this.f39260C;
                }
            }
            if (this.f39271N != null) {
                f = m19064B(currentScrollPercent);
                if (this.f39268K != f) {
                    this.f39271N.Gy(f);
                    this.f39268K = f;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r0 = 1383463963; // 0x5275fc1b float:2.64124154E11 double:6.835220164E-315;
        r2 = X.AnonymousClass0cQ.M(r8, r0);
        r3 = r9.getAction();
        r0 = r9.getActionMasked();
        r6 = 1;
        r5 = 0;
        r4 = 0;
        switch(r0) {
            case 0: goto L_0x00cc;
            case 1: goto L_0x006e;
            case 2: goto L_0x0017;
            case 3: goto L_0x00c9;
            default: goto L_0x0015;
        };
    L_0x0015:
        goto L_0x00d6;
    L_0x0017:
        r8.f39274Q = r4;
        r0 = r8.getCurrentScrollPercent();
        r7 = m19064B(r0);
        r1 = r8.getScrollX();
        r0 = r8.f39272O;
        r0 = (int) r0;
        r1 = r1 + r0;
        r0 = r8.m19065C(r1);
        r1 = m19064B(r0);
        r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r0 != 0) goto L_0x005d;
    L_0x0035:
        r1 = java.lang.Math.abs(r1);
        r0 = 1061158912; // 0x3f400000 float:0.75 double:5.24282163E-315;
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x005d;
    L_0x003f:
        r8.m19066A(r5, r4);
        r8.f39273P = r4;
        r3 = r8.f39272O;
        r1 = r8.f39267J;
        r0 = r9.getX();
        r1 = r1 - r0;
        r3 = r3 + r1;
        r8.f39272O = r3;
        r0 = r9.getX();
        r8.f39267J = r0;
        r0 = 1906045351; // 0x719bf1a7 float:1.5443941E30 double:9.417115273E-315;
        X.AnonymousClass0cQ.L(r8, r0, r2);
        return r6;
    L_0x005d:
        r0 = r8.f39273P;
        if (r0 != 0) goto L_0x0067;
    L_0x0061:
        r9.setAction(r4);
        r8.f39273P = r6;
        goto L_0x00d8;
    L_0x0067:
        r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r0 == 0) goto L_0x00d8;
    L_0x006b:
        r8.f39272O = r5;
        goto L_0x00d8;
    L_0x006e:
        r0 = r8.f39271N;
        if (r0 == 0) goto L_0x0075;
    L_0x0072:
        r0.hAA();
    L_0x0075:
        r0 = r8.f39274Q;
        if (r0 == 0) goto L_0x00c7;
    L_0x0079:
        r6 = r9.getX();
        r0 = r8.getWidth();
        r1 = (float) r0;
        r0 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r1 = r1 * r0;
        r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x008b;
    L_0x0089:
        r0 = 1;
        goto L_0x008c;
    L_0x008b:
        r0 = 0;
    L_0x008c:
        if (r0 == 0) goto L_0x00a1;
    L_0x008e:
        r0 = r8.f39271N;
        if (r0 == 0) goto L_0x00c7;
    L_0x0092:
        r1 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r0 = 1112014848; // 0x42480000 float:50.0 double:5.49408334E-315;
        r1 = r1 / r0;
        r0 = r8.f39263F;
        r1 = r1 * r0;
        r0 = (int) r1;
        r0 = -r0;
        r8.scrollBy(r0, r4);
        goto L_0x00c7;
    L_0x00a1:
        r6 = r9.getX();
        r0 = r8.getWidth();
        r1 = (float) r0;
        r0 = 1061158912; // 0x3f400000 float:0.75 double:5.24282163E-315;
        r1 = r1 * r0;
        r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x00b3;
    L_0x00b1:
        r0 = 1;
        goto L_0x00b4;
    L_0x00b3:
        r0 = 0;
    L_0x00b4:
        if (r0 == 0) goto L_0x00c7;
    L_0x00b6:
        r0 = r8.f39271N;
        if (r0 == 0) goto L_0x00c7;
    L_0x00ba:
        r1 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r0 = 1112014848; // 0x42480000 float:50.0 double:5.49408334E-315;
        r1 = r1 / r0;
        r0 = r8.f39263F;
        r1 = r1 * r0;
        r0 = (int) r1;
        r8.scrollBy(r0, r4);
    L_0x00c7:
        r8.f39274Q = r4;
    L_0x00c9:
        r8.f39267J = r5;
        goto L_0x00d6;
    L_0x00cc:
        r0 = r8.f39271N;
        if (r0 == 0) goto L_0x00d3;
    L_0x00d0:
        r0.jAA();
    L_0x00d3:
        r8.f39274Q = r6;
        goto L_0x00d8;
    L_0x00d6:
        r8.f39274Q = r4;
    L_0x00d8:
        r0 = r9.getX();
        r8.f39267J = r0;
        r1 = super.onTouchEvent(r9);
        r9.setAction(r3);
        r0 = -1988790495; // 0xffffffff89757721 float:-2.9546816E-33 double:NaN;
        X.AnonymousClass0cQ.L(r8, r0, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.ui.sliderview.SliderView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnSlideListener(AnonymousClass3DO anonymousClass3DO) {
        this.f39271N = anonymousClass3DO;
    }
}
