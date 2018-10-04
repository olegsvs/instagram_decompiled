package com.instagram.common.ui.widget.recyclerview;

import X.AnonymousClass0Nm;
import X.AnonymousClass0OR;
import X.AnonymousClass0QP;
import X.AnonymousClass0cB;
import X.AnonymousClass0cN;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0e7;
import X.AnonymousClass0eA;
import X.AnonymousClass0la;
import X.AnonymousClass0nB;
import X.AnonymousClass0nJ;
import X.AnonymousClass0rr;
import X.AnonymousClass0rv;
import X.AnonymousClass10p;
import X.AnonymousClass1wk;
import X.AnonymousClass25o;
import X.AnonymousClass3BO;
import X.AnonymousClass3BP;
import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.facebook.common.dextricks.StartupQEsConfig;

public class HorizontalRefreshableRecyclerViewLayout extends FrameLayout implements AnonymousClass0QP, AnonymousClass0cB, AnonymousClass1wk {
    /* renamed from: B */
    public boolean f38771B;
    /* renamed from: C */
    public boolean f38772C;
    /* renamed from: D */
    public int f38773D;
    /* renamed from: E */
    public float f38774E;
    /* renamed from: F */
    public final RecyclerView f38775F;
    /* renamed from: G */
    public AnonymousClass25o f38776G;
    /* renamed from: H */
    public float f38777H;
    /* renamed from: I */
    public final ImageView f38778I;
    /* renamed from: J */
    public boolean f38779J;
    /* renamed from: K */
    private final Handler f38780K;
    /* renamed from: L */
    private final AnonymousClass0e5 f38781L;
    /* renamed from: M */
    private final AnonymousClass0cN f38782M;
    /* renamed from: N */
    private final Runnable f38783N;
    /* renamed from: O */
    private float f38784O;
    /* renamed from: P */
    private final float f38785P;
    /* renamed from: Q */
    private final float f38786Q;
    /* renamed from: R */
    private final AnonymousClass0eA f38787R;
    /* renamed from: S */
    private AnonymousClass10p f38788S;
    /* renamed from: T */
    private final AnonymousClass0cN f38789T;
    /* renamed from: U */
    private final AnonymousClass0e5 f38790U;
    /* renamed from: V */
    private long f38791V;
    /* renamed from: W */
    private AnonymousClass3BP f38792W;
    /* renamed from: X */
    private boolean f38793X;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Oe(AnonymousClass0e7 anonymousClass0e7) {
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public HorizontalRefreshableRecyclerViewLayout(Context context) {
        this(context, null);
    }

    public HorizontalRefreshableRecyclerViewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalRefreshableRecyclerViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38781L = AnonymousClass0e5.C(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.3499999940395355d);
        this.f38790U = AnonymousClass0e5.C(25.0d, 9.5d);
        this.f38780K = new Handler();
        this.f38783N = new AnonymousClass3BO(this);
        setClipChildren(false);
        setClipToPadding(false);
        this.f38787R = new AnonymousClass0eA(this);
        AnonymousClass0e7 B = AnonymousClass0e6.B();
        AnonymousClass0cN O = B.C().O(this.f38790U);
        O.f7105C = 0.5d;
        O.f7110H = 50.0d;
        this.f38789T = O.A(this);
        O = B.C().O(this.f38781L);
        O.f7105C = 0.5d;
        O.f7110H = 50.0d;
        this.f38782M = O.A(this);
        B.B(this);
        this.f38786Q = AnonymousClass0Nm.C(context, 2000);
        this.f38785P = AnonymousClass0Nm.C(context, 4000);
        View recyclerView = new RecyclerView(context);
        this.f38775F = recyclerView;
        addView(recyclerView);
        this.f38778I = new ImageView(context);
        this.f38778I.setVisibility(8);
        addView(this.f38778I);
        m18906J();
    }

    /* renamed from: A */
    public final void m18907A(AnonymousClass0rv anonymousClass0rv) {
        this.f38775F.A(anonymousClass0rv);
    }

    /* renamed from: B */
    public final void m18908B() {
        m18898B(this);
        this.f38776G.mo3230C();
        this.f38789T.N((double) getOverScrollRestTarget());
        setItemAnimationsEnabled(true);
    }

    /* renamed from: B */
    public static void m18898B(HorizontalRefreshableRecyclerViewLayout horizontalRefreshableRecyclerViewLayout) {
        if (horizontalRefreshableRecyclerViewLayout.f38779J) {
            long currentTimeMillis = System.currentTimeMillis() - horizontalRefreshableRecyclerViewLayout.f38791V;
            if (currentTimeMillis < 800) {
                long j = 800 - currentTimeMillis;
                AnonymousClass0OR.G(horizontalRefreshableRecyclerViewLayout.f38780K, horizontalRefreshableRecyclerViewLayout.f38783N, 1627869575);
                AnonymousClass0OR.F(horizontalRefreshableRecyclerViewLayout.f38780K, horizontalRefreshableRecyclerViewLayout.f38783N, j, -630109188);
                return;
            }
            horizontalRefreshableRecyclerViewLayout.f38779J = false;
            horizontalRefreshableRecyclerViewLayout.f38776G.mo3231D(false);
            AnonymousClass3BP anonymousClass3BP = horizontalRefreshableRecyclerViewLayout.f38792W;
            if (anonymousClass3BP != null) {
                anonymousClass3BP.fk();
            }
            horizontalRefreshableRecyclerViewLayout.setItemAnimationsEnabled(true);
            horizontalRefreshableRecyclerViewLayout.m18903G();
        }
    }

    /* renamed from: C */
    private void m18899C() {
        if (!this.f38779J) {
            this.f38791V = System.currentTimeMillis();
            setItemAnimationsEnabled(false);
            this.f38779J = true;
            AnonymousClass3BP anonymousClass3BP = this.f38792W;
            if (anonymousClass3BP != null) {
                anonymousClass3BP.Pe();
            }
            this.f38776G.mo3231D(true);
            this.f38789T.N((double) getOverScrollRestTarget());
            m18906J();
        }
    }

    /* renamed from: C */
    public final void m18909C(int i) {
        this.f38782M.K();
        this.f38789T.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        this.f38775F.FA(i);
    }

    /* renamed from: D */
    public final void m18910D(int i) {
        this.f38782M.K();
        this.f38789T.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        this.f38775F.LA(i);
    }

    /* renamed from: D */
    private boolean m18900D() {
        Object obj;
        AnonymousClass0rr anonymousClass0rr = (AnonymousClass0rr) this.f38775F.getLayoutManager();
        int aA = anonymousClass0rr.aA();
        int cA = anonymousClass0rr.cA();
        int B = this.f38775F.getAdapter().B() - 1;
        if (aA != 0) {
            if (cA != B) {
                obj = null;
                if (this.f38789T.C(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) || this.f38775F.getScrollState() == 0 || r3 == null) {
                    return false;
                }
                return true;
            }
        }
        obj = 1;
        if (!this.f38789T.C(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED)) {
        }
        return false;
    }

    /* renamed from: E */
    private void m18901E() {
        float E = (float) this.f38782M.E();
        int round = Math.round(this.f38784O - E);
        if (this.f38775F.canScrollHorizontally(round)) {
            this.f38775F.scrollBy(round, 0);
        } else if (!this.f38782M.G()) {
            float F = (float) this.f38782M.F();
            this.f38782M.K();
            this.f38789T.P((double) F).N((double) getOverScrollRestTarget());
        }
        this.f38784O = E;
    }

    /* renamed from: F */
    private void m18902F() {
        float E = (float) this.f38789T.E();
        if (this.f38793X && !this.f38779J && this.f38789T.f7106D == ((double) getOverScrollRestTarget()) && this.f38789T.H()) {
            this.f38793X = false;
            this.f38784O = 0.0f;
            this.f38782M.L((double) this.f38784O).P(this.f38789T.F());
            this.f38789T.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            E = 0.0f;
        }
        this.f38775F.setTranslationX(E);
        m18906J();
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        if (anonymousClass0cN == this.f38789T) {
            m18902F();
        } else if (anonymousClass0cN == this.f38782M) {
            m18901E();
        }
    }

    /* renamed from: G */
    private void m18903G() {
        this.f38789T.N((double) getOverScrollRestTarget());
        m18906J();
    }

    /* renamed from: H */
    private boolean m18904H() {
        return (this.f38792W == null || this.f38776G == null || this.f38775F.getChildCount() <= 0) ? false : true;
    }

    /* renamed from: I */
    private int m18905I(int i, boolean z) {
        Object obj;
        float f = 0.1f;
        if (this.f38774E > 0.0f && m18904H() && m18904H()) {
            f = AnonymousClass0nB.E(this.f38774E, 0.25f, 1.0f, 1.0f, 0.1f, true);
        }
        float min = Math.min(f, 1.0f);
        float E = (float) this.f38789T.E();
        if (E != 0.0f) {
            if (E / ((float) i) >= 0.0f) {
                obj = null;
                float f2 = obj == null ? ((float) i) * min : (float) i;
                if (z && obj == null) {
                    if (Math.abs(E) > ((float) Math.abs(i))) {
                        this.f38789T.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
                        return Math.round(E);
                    }
                }
                this.f38789T.L((double) (E - f2));
                return i;
            }
        }
        obj = 1;
        if (obj == null) {
        }
        if (Math.abs(E) > ((float) Math.abs(i))) {
            this.f38789T.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            return Math.round(E);
        }
        this.f38789T.L((double) (E - f2));
        return i;
    }

    /* renamed from: J */
    private void m18906J() {
        if (!m18904H()) {
            this.f38778I.setVisibility(8);
        } else if (this.f38772C || this.f38777H > 0.0f) {
            int width = this.f38778I.getWidth();
            int height = this.f38778I.getHeight();
            int i = 0;
            View childAt = this.f38775F.getChildAt(0);
            int width2 = childAt.getWidth();
            int height2 = childAt.getHeight();
            this.f38776G.mo3229B(width2);
            if (!(width == this.f38776G.mo3228A() && height == height2)) {
                this.f38778I.setLayoutParams(new LayoutParams(this.f38776G.mo3228A(), height2));
                width = this.f38776G.mo3228A();
            }
            height2 = Math.round(this.f38775F.getTranslationX() - ((float) width));
            this.f38778I.setTranslationX((float) (this.f38773D + height2));
            float E = AnonymousClass0nB.E((float) height2, (float) (-width), 0.0f, 0.0f, 1.0f, false);
            this.f38777H = AnonymousClass0nB.B(E, 0.0f, 1.0f);
            this.f38774E = E;
            ImageView imageView = this.f38778I;
            if (E <= 0.0f) {
                i = 4;
            }
            imageView.setVisibility(i);
            this.f38776G.mo3232E(getRefreshProgress());
        }
    }

    public final void Jd(AnonymousClass0e7 anonymousClass0e7) {
        boolean z;
        if (this.f38789T.G()) {
            if (this.f38782M.G()) {
                z = false;
                setIsFreeScrolling(z);
            }
        }
        z = true;
        setIsFreeScrolling(z);
    }

    public int getNestedScrollAxes() {
        return this.f38787R.f7587B;
    }

    private float getOverScrollRestTarget() {
        return this.f38779J ? getRefreshingScrollPosition() : 0.0f;
    }

    public RecyclerView getRecyclerView() {
        return this.f38775F;
    }

    private float getRefreshProgress() {
        return this.f38777H;
    }

    private float getRefreshingScrollPosition() {
        return (float) (this.f38778I.getWidth() + this.f38773D);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m18906J();
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        this.f38784O = 0.0f;
        float f3 = m18900D() ? this.f38786Q : this.f38785P;
        if (Math.abs(f) > f3) {
            f = (f / Math.abs(f)) * f3;
        }
        if (m18900D()) {
            this.f38793X = true;
            this.f38782M.K();
            this.f38789T.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            this.f38789T.P((double) (-f));
        } else {
            this.f38782M.L((double) this.f38784O).P((double) (-f));
        }
        return true;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        requestDisallowInterceptTouchEvent(true);
        int I = m18900D() ? m18905I(i, true) : 0;
        if (iArr != null) {
            iArr[0] = I;
            iArr[1] = 0;
        }
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m18905I(i3, false);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f38787R.A(view, view2, i);
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        this.f38793X = false;
        this.f38782M.K();
        this.f38789T.K();
        this.f38772C = true;
        setItemAnimationsEnabled(false);
        return true;
    }

    public final void onStopNestedScroll(View view) {
        this.f38787R.B(view);
        this.f38772C = false;
        if (this.f38774E < 1.0f || !m18904H()) {
            m18898B(this);
        } else {
            m18899C();
        }
        m18903G();
    }

    public void setAdapter(AnonymousClass0nJ anonymousClass0nJ) {
        this.f38775F.setAdapter(anonymousClass0nJ);
    }

    private void setIsFreeScrolling(boolean z) {
        if (z != this.f38771B) {
            this.f38771B = z;
            if (z) {
                setItemAnimationsEnabled(false);
            } else {
                setItemAnimationsEnabled(true);
            }
        }
    }

    private void setItemAnimationsEnabled(boolean z) {
        this.f38775F.setItemAnimator(z ? this.f38788S : null);
    }

    public void setItemAnimator(AnonymousClass10p anonymousClass10p) {
        this.f38788S = anonymousClass10p;
        this.f38775F.setItemAnimator(anonymousClass10p);
    }

    public void setLayoutManager(AnonymousClass0la anonymousClass0la) {
        if (anonymousClass0la instanceof AnonymousClass0rr) {
            this.f38775F.setLayoutManager(anonymousClass0la);
            return;
        }
        throw new IllegalArgumentException("layoutManager must be an instanceof LinearLayoutManager");
    }

    public void setRefreshDelegate(AnonymousClass3BP anonymousClass3BP) {
        this.f38792W = anonymousClass3BP;
    }
}
