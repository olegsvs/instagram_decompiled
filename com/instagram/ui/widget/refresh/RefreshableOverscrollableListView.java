package com.instagram.ui.widget.refresh;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Nm;
import X.AnonymousClass0QP;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0mE;
import X.AnonymousClass1MV;
import X.AnonymousClass2Lq;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;

public class RefreshableOverscrollableListView extends ListView implements AnonymousClass0QP {
    /* renamed from: B */
    public final AlphaAnimation f29437B = new AlphaAnimation(0.0f, 1.0f);
    /* renamed from: C */
    public boolean f29438C;
    /* renamed from: D */
    public AnonymousClass1MV f29439D;
    /* renamed from: E */
    public AnonymousClass2Lq f29440E = AnonymousClass2Lq.IDLE;
    /* renamed from: F */
    private Paint f29441F;
    /* renamed from: G */
    private final AnonymousClass0cN f29442G = AnonymousClass0e6.B().C();
    /* renamed from: H */
    private boolean f29443H = true;
    /* renamed from: I */
    private int f29444I;
    /* renamed from: J */
    private int f29445J;
    /* renamed from: K */
    private boolean f29446K;
    /* renamed from: L */
    private boolean f29447L;
    /* renamed from: M */
    private boolean f29448M = ((Boolean) AnonymousClass0CC.oP.G()).booleanValue();
    /* renamed from: N */
    private float f29449N = -1.0f;
    /* renamed from: O */
    private OnScrollListener f29450O;
    /* renamed from: P */
    private int f29451P;
    /* renamed from: Q */
    private int f29452Q;
    /* renamed from: R */
    private Paint f29453R;
    /* renamed from: S */
    private LayerDrawable f29454S;
    /* renamed from: T */
    private Paint f29455T;
    /* renamed from: U */
    private boolean f29456U;
    /* renamed from: V */
    private OnClickListener f29457V;
    /* renamed from: W */
    private boolean f29458W;
    /* renamed from: X */
    private final AlphaAnimation f29459X = new AlphaAnimation(-0.2f, 0.2f);
    /* renamed from: Y */
    private Drawable f29460Y;
    /* renamed from: Z */
    private final Transformation f29461Z = new Transformation();

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public RefreshableOverscrollableListView(Context context) {
        super(context);
        m15180G();
    }

    public RefreshableOverscrollableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15180G();
    }

    public RefreshableOverscrollableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15180G();
    }

    /* renamed from: A */
    public final boolean m15182A() {
        if (getFirstVisiblePosition() != 0 || getChildCount() == 0 || getChildAt(0).getTop() < getPaddingTop()) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public static int m15175B(RefreshableOverscrollableListView refreshableOverscrollableListView, float f) {
        float f2 = (float) (-refreshableOverscrollableListView.getScrollY());
        float f3 = ((float) refreshableOverscrollableListView.f29444I) * 1.4f;
        f -= refreshableOverscrollableListView.f29449N;
        if (f2 < f3) {
            return (int) (-(f2 + f));
        }
        return (int) (-Math.sqrt((double) Math.max(0.0f, (f * f3) + ((float) (refreshableOverscrollableListView.getScrollY() * refreshableOverscrollableListView.getScrollY())))));
    }

    /* renamed from: B */
    public final boolean m15183B() {
        return getScrollY() > 0;
    }

    /* renamed from: C */
    public static void m15176C(RefreshableOverscrollableListView refreshableOverscrollableListView) {
        refreshableOverscrollableListView.f29442G.A(refreshableOverscrollableListView);
        refreshableOverscrollableListView.f29442G.O(AnonymousClass0e5.C(70.0d, 11.0d));
        refreshableOverscrollableListView.f29442G.f7110H = 1.0d;
        refreshableOverscrollableListView.f29442G.f7105C = 0.5d;
        refreshableOverscrollableListView.f29442G.L((double) refreshableOverscrollableListView.getScrollY());
        refreshableOverscrollableListView.f29442G.N(refreshableOverscrollableListView.f29440E == AnonymousClass2Lq.REFRESHING ? (double) (-refreshableOverscrollableListView.f29444I) : StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    /* renamed from: C */
    public final boolean m15184C() {
        return getScrollY() < 0;
    }

    /* renamed from: D */
    public static void m15177D(RefreshableOverscrollableListView refreshableOverscrollableListView) {
        if (refreshableOverscrollableListView.f29440E != AnonymousClass2Lq.PULLING_TO_REFRESH && refreshableOverscrollableListView.f29447L && refreshableOverscrollableListView.getVisibility() == 0 && refreshableOverscrollableListView.m15184C()) {
            refreshableOverscrollableListView.f29437B.setDuration(700);
            refreshableOverscrollableListView.f29437B.setInterpolator(new LinearInterpolator());
            refreshableOverscrollableListView.f29437B.setRepeatCount(-1);
            refreshableOverscrollableListView.f29437B.setStartTime(-1);
            refreshableOverscrollableListView.f29437B.start();
        }
    }

    /* renamed from: E */
    private void m15178E(Canvas canvas) {
        if (this.f29438C && m15183B()) {
            if (this.f29453R != null) {
                canvas.drawRect(0.0f, (float) getHeight(), (float) getWidth(), (float) (getHeight() + getScrollY()), this.f29453R);
            }
        }
    }

    /* renamed from: F */
    private void m15179F(Canvas canvas) {
        if (this.f29456U) {
            if (m15184C()) {
                float abs;
                int i;
                Canvas canvas2 = canvas;
                canvas.save();
                canvas.translate((float) ((getWidth() - this.f29444I) / 2), (float) (this.f29445J + getScrollY()));
                if (this.f29455T != null) {
                    canvas2.drawRect(0.0f, 0.0f, (float) getWidth(), (float) (-getScrollY()), this.f29455T);
                }
                if (this.f29443H && (-getScrollY()) > this.f29452Q) {
                    canvas2.drawLine(0.0f, (float) (-getScrollY()), (float) getWidth(), (float) (-getScrollY()), this.f29441F);
                }
                canvas.clipRect(0, 0, getWidth(), -getScrollY());
                if (this.f29459X.getTransformation(getDrawingTime(), this.f29461Z)) {
                    abs = 1.2f - Math.abs(this.f29461Z.getAlpha());
                    i = this.f29444I;
                    canvas.scale(abs, abs, (float) (i / 2), (float) (i / 2));
                }
                if (this.f29440E == AnonymousClass2Lq.PULLING_TO_REFRESH) {
                    this.f29454S.draw(canvas);
                } else if (this.f29437B.getTransformation(getDrawingTime(), this.f29461Z)) {
                    abs = Math.min(1.0f, (((float) (-getScrollY())) * 1.0f) / ((float) this.f29444I));
                    i = this.f29444I;
                    canvas.scale(abs, abs, (float) (i / 2), (float) (i / 2));
                    this.f29460Y.setLevel((int) (this.f29461Z.getAlpha() * 10000.0f));
                    this.f29460Y.draw(canvas);
                    AnonymousClass0mE.J(this);
                }
                canvas.restore();
            }
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        m15181H();
        scrollTo(0, (int) anonymousClass0cN.E());
        if (!m15184C() && !m15183B()) {
            if (this.f29446K) {
                this.f29439D.A();
                this.f29446K = false;
            }
            setState(AnonymousClass2Lq.IDLE);
        }
    }

    /* renamed from: G */
    private void m15180G() {
        this.f29444I = getResources().getDimensionPixelSize(C0164R.dimen.refreshable_drawable_size);
        LayerDrawable layerDrawable = (LayerDrawable) AnonymousClass0Ca.E(getContext(), C0164R.drawable.refreshable_progress_drawable);
        this.f29454S = layerDrawable;
        int i = this.f29444I;
        layerDrawable.setBounds(0, 0, i, i);
        Drawable E = AnonymousClass0Ca.E(getContext(), C0164R.drawable.refreshable_spinner_drawable);
        this.f29460Y = E;
        i = this.f29444I;
        E.setBounds(0, 0, i, i);
        Paint paint = new Paint();
        this.f29441F = paint;
        paint.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_1));
        this.f29441F.setStrokeWidth(0.0f);
        this.f29452Q = ViewConfiguration.get(getContext()).getScaledOverflingDistance();
        this.f29451P = (int) (((float) AnonymousClass0Nm.J(getContext())) * 0.18f);
    }

    /* renamed from: H */
    private void m15181H() {
        this.f29454S.setLevel(getProgressDrawableLevel());
        if (this.f29440E == AnonymousClass2Lq.PULLING_TO_REFRESH && this.f29454S.getLevel() >= 10000) {
            this.f29459X.setDuration(300);
            this.f29459X.setStartTime(-1);
            this.f29459X.start();
            setState(AnonymousClass2Lq.REFRESHING);
            this.f29457V.onClick(this);
        } else if (this.f29440E != AnonymousClass2Lq.REFRESHING) {
        } else {
            if (!this.f29437B.hasStarted() || this.f29437B.hasEnded()) {
                m15177D(this);
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m15178E(canvas);
        m15179F(canvas);
    }

    private int getProgressDrawableLevel() {
        float f = (float) (-getScrollY());
        int i = this.f29444I;
        return (int) (Math.max(0.0f, (f - (((float) i) * 0.4f)) / ((float) i)) * 10000.0f);
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -860338165);
        super.onAttachedToWindow();
        this.f29447L = true;
        m15177D(this);
        AnonymousClass0cQ.O(this, 152380134, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 1960749504);
        super.onDetachedFromWindow();
        this.f29447L = false;
        this.f29437B.cancel();
        this.f29442G.J(this).L(this.f29442G.f7106D);
        AnonymousClass0cQ.O(this, -201817225, N);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 0 && (m15184C() || m15183B())) {
            this.f29458W = true;
        }
        Object obj = (this.f29440E == AnonymousClass2Lq.REFRESHING && m15184C()) ? 1 : null;
        if (!this.f29448M || obj == null) {
            this.f29449N = motionEvent.getRawY();
            if (this.f29448M || obj == null) {
                if (!super.onInterceptTouchEvent(motionEvent)) {
                    z = false;
                }
            }
            return z;
        }
        if (this.f29449N < 0.0f) {
            this.f29449N = motionEvent.getRawY();
        }
        onTouchEvent(motionEvent);
        return false;
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (this.f29440E != AnonymousClass2Lq.COLLAPSING && !z2) {
            super.onOverScrolled(i, i2, z, z2);
        }
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (m15184C() && !m15182A()) {
            setScrollY(0);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r0 = -1392415559; // 0xffffffffad016cb9 float:-7.356942E-12 double:NaN;
        r3 = X.AnonymousClass0cQ.M(r8, r0);
        r0 = r8.f29456U;
        if (r0 != 0) goto L_0x001a;
    L_0x000b:
        r0 = r8.f29438C;
        if (r0 != 0) goto L_0x001a;
    L_0x000f:
        r1 = super.onTouchEvent(r9);
        r0 = 9758581; // 0x94e775 float:1.3674685E-38 double:4.8213796E-317;
        X.AnonymousClass0cQ.L(r8, r0, r3);
        return r1;
    L_0x001a:
        r4 = r9.getRawY();
        r1 = r8.f29440E;
        r0 = X.AnonymousClass2Lq.COLLAPSING;
        if (r1 != r0) goto L_0x0031;
    L_0x0024:
        r8.f29449N = r4;
        r1 = super.onTouchEvent(r9);
        r0 = -1007009295; // 0xffffffffc3fa41f1 float:-500.51517 double:NaN;
        X.AnonymousClass0cQ.L(r8, r0, r3);
        return r1;
    L_0x0031:
        r0 = r8.f29449N;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        r2 = 1;
        r5 = 0;
        if (r0 <= 0) goto L_0x003b;
    L_0x0039:
        r1 = 1;
        goto L_0x003c;
    L_0x003b:
        r1 = 0;
    L_0x003c:
        r0 = r8.f29449N;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0044;
    L_0x0042:
        r7 = 1;
        goto L_0x0045;
    L_0x0044:
        r7 = 0;
    L_0x0045:
        r0 = r9.getActionMasked();
        switch(r0) {
            case 1: goto L_0x00df;
            case 2: goto L_0x004e;
            case 3: goto L_0x00df;
            default: goto L_0x004c;
        };
    L_0x004c:
        goto L_0x010c;
    L_0x004e:
        r0 = r8.f29456U;
        if (r0 == 0) goto L_0x007d;
    L_0x0052:
        r0 = r8.m15182A();
        if (r0 == 0) goto L_0x005a;
    L_0x0058:
        if (r1 != 0) goto L_0x0060;
    L_0x005a:
        r0 = r8.m15184C();
        if (r0 == 0) goto L_0x007d;
    L_0x0060:
        r1 = r8.f29440E;
        r0 = X.AnonymousClass2Lq.IDLE;
        if (r1 != r0) goto L_0x006b;
    L_0x0066:
        r0 = X.AnonymousClass2Lq.PULLING_TO_REFRESH;
        r8.setState(r0);
    L_0x006b:
        r1 = m15175B(r8, r4);
        r0 = 0;
        r0 = java.lang.Math.min(r0, r1);
        r8.scrollTo(r5, r0);
        r8.m15181H();
    L_0x007a:
        r0 = 1;
        goto L_0x010d;
    L_0x007d:
        r0 = r8.f29438C;
        if (r0 == 0) goto L_0x00d5;
    L_0x0081:
        r0 = r8.getAdapter();
        r6 = r0.getCount();
        r1 = 1;
        r6 = r6 - r1;
        if (r6 < 0) goto L_0x0094;
    L_0x008d:
        r0 = r8.getLastVisiblePosition();
        if (r0 != r6) goto L_0x0094;
    L_0x0093:
        goto L_0x0095;
    L_0x0094:
        r1 = 0;
    L_0x0095:
        if (r1 == 0) goto L_0x0099;
    L_0x0097:
        if (r7 != 0) goto L_0x009f;
    L_0x0099:
        r0 = r8.m15183B();
        if (r0 == 0) goto L_0x00d5;
    L_0x009f:
        r1 = m15175B(r8, r4);
        r0 = 0;
        r6 = java.lang.Math.max(r0, r1);
        r0 = r8.f29451P;
        if (r6 <= r0) goto L_0x00be;
    L_0x00ac:
        r0 = r8.f29440E;
        r7 = X.AnonymousClass2Lq.OVERSCROLLING;
        if (r0 == r7) goto L_0x00ba;
    L_0x00b2:
        r0 = r8.f29439D;
        r1 = r0.f17676C;
        r0 = 1;
        X.AnonymousClass4oO.B(r1, r0);
    L_0x00ba:
        r8.setState(r7);
        goto L_0x00d1;
    L_0x00be:
        r1 = r8.f29440E;
        r0 = X.AnonymousClass2Lq.OVERSCROLLING;
        if (r1 != r0) goto L_0x00cc;
    L_0x00c4:
        r0 = r8.f29439D;
        r1 = r0.f17676C;
        r0 = 0;
        X.AnonymousClass4oO.B(r1, r0);
    L_0x00cc:
        r0 = X.AnonymousClass2Lq.PULLING_TO_OVERSCROLL;
        r8.setState(r0);
    L_0x00d1:
        r8.scrollTo(r5, r6);
        goto L_0x007a;
    L_0x00d5:
        r0 = r8.f29458W;
        if (r0 == 0) goto L_0x010c;
    L_0x00d9:
        r8.f29458W = r5;
        r9.setAction(r5);
        goto L_0x010c;
    L_0x00df:
        r0 = r8.m15184C();
        if (r0 != 0) goto L_0x00fd;
    L_0x00e5:
        r0 = r8.m15183B();
        if (r0 == 0) goto L_0x00ec;
    L_0x00eb:
        goto L_0x00fd;
    L_0x00ec:
        r1 = r8.f29440E;
        r0 = X.AnonymousClass2Lq.OVERSCROLLING;
        if (r1 != r0) goto L_0x00f7;
    L_0x00f2:
        r0 = r8.f29439D;
        r0.A();
    L_0x00f7:
        r0 = X.AnonymousClass2Lq.IDLE;
        r8.setState(r0);
        goto L_0x010c;
    L_0x00fd:
        r1 = r8.f29440E;
        r0 = X.AnonymousClass2Lq.OVERSCROLLING;
        if (r1 != r0) goto L_0x0105;
    L_0x0103:
        r8.f29446K = r2;
    L_0x0105:
        m15176C(r8);
        r0 = 3;
        r9.setAction(r0);
    L_0x010c:
        r0 = 0;
    L_0x010d:
        r8.f29449N = r4;
        if (r0 != 0) goto L_0x0119;
    L_0x0111:
        r0 = super.onTouchEvent(r9);
        if (r0 == 0) goto L_0x0118;
    L_0x0117:
        goto L_0x0119;
    L_0x0118:
        r2 = 0;
    L_0x0119:
        r0 = 1666823489; // 0x6359b541 float:4.0160042E21 double:8.235202236E-315;
        X.AnonymousClass0cQ.L(r8, r0, r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.refresh.RefreshableOverscrollableListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            m15177D(this);
        } else {
            this.f29437B.cancel();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        int N = AnonymousClass0cQ.N(this, 248917124);
        int scrollY = getScrollY();
        super.onWindowFocusChanged(z);
        setScrollY(scrollY);
        AnonymousClass0cQ.O(this, -432791290, N);
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        OnScrollListener onScrollListener = this.f29450O;
        if (onScrollListener != null) {
            onScrollListener.onScroll(this, getFirstVisiblePosition(), getChildCount(), getCount());
        }
    }

    public void setDrawBorder(boolean z) {
        this.f29443H = z;
    }

    public void setDrawableTopOffset(int i) {
        this.f29445J = i;
    }

    public void setIsInteractiveDuringRefresh(boolean z) {
        this.f29448M = z;
    }

    public void setIsLoading(boolean z) {
        if (z) {
            setState(AnonymousClass2Lq.REFRESHING);
            invalidate();
            return;
        }
        if (!m15184C()) {
            if (!m15183B()) {
                setState(AnonymousClass2Lq.IDLE);
                return;
            }
        }
        setState(AnonymousClass2Lq.COLLAPSING);
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
        this.f29450O = onScrollListener;
    }

    public void setOverscrollBackgroundColor(int i) {
        Paint paint = new Paint();
        this.f29453R = paint;
        paint.setColor(i);
    }

    public void setPullToRefreshBackgroundColor(int i) {
        Paint paint = new Paint();
        this.f29455T = paint;
        paint.setColor(i);
    }

    private void setState(AnonymousClass2Lq anonymousClass2Lq) {
        this.f29440E = anonymousClass2Lq;
        switch (this.f29440E.ordinal()) {
            case 0:
                this.f29437B.cancel();
                return;
            case 3:
                m15177D(this);
                return;
            case 5:
                m15176C(this);
                return;
            default:
                return;
        }
    }

    public void setupAndEnableRefresh(OnClickListener onClickListener) {
        this.f29456U = true;
        this.f29457V = onClickListener;
    }
}
