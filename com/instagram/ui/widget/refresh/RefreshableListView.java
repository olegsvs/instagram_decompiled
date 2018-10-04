package com.instagram.ui.widget.refresh;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0QP;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0mE;
import X.AnonymousClass127;
import X.AnonymousClass2Ln;
import X.AnonymousClass2Lo;
import X.AnonymousClass2Lp;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
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

public class RefreshableListView extends ListView implements AnonymousClass0QP {
    /* renamed from: B */
    public final AlphaAnimation f8675B = new AlphaAnimation(0.0f, 1.0f);
    /* renamed from: C */
    public OnClickListener f8676C;
    /* renamed from: D */
    public Runnable f8677D;
    /* renamed from: E */
    public boolean f8678E;
    /* renamed from: F */
    public AnonymousClass127 f8679F = AnonymousClass127.PULLING_TO_REFRESH;
    /* renamed from: G */
    private Paint f8680G;
    /* renamed from: H */
    private final AnonymousClass0cN f8681H = AnonymousClass0e6.m6190B().m6193C();
    /* renamed from: I */
    private boolean f8682I;
    /* renamed from: J */
    private boolean f8683J = true;
    /* renamed from: K */
    private int f8684K;
    /* renamed from: L */
    private int f8685L;
    /* renamed from: M */
    private boolean f8686M;
    /* renamed from: N */
    private boolean f8687N = ((Boolean) AnonymousClass0CC.oP.m845G()).booleanValue();
    /* renamed from: O */
    private float f8688O = -1.0f;
    /* renamed from: P */
    private AnonymousClass2Lo f8689P;
    /* renamed from: Q */
    private OnScrollListener f8690Q;
    /* renamed from: R */
    private int f8691R;
    /* renamed from: S */
    private final ColorFilter f8692S = AnonymousClass0ca.m5921B(AnonymousClass0Ca.m937C(getContext(), C0164R.color.refreshable_progress_drawable_background));
    /* renamed from: T */
    private LayerDrawable f8693T;
    /* renamed from: U */
    private final ColorFilter f8694U = AnonymousClass0ca.m5921B(AnonymousClass0Ca.m937C(getContext(), C0164R.color.refreshable_progress_drawable_track));
    /* renamed from: V */
    private AnonymousClass2Lp f8695V;
    /* renamed from: W */
    private Paint f8696W;
    /* renamed from: X */
    private boolean f8697X;
    /* renamed from: Y */
    private final AlphaAnimation f8698Y = new AlphaAnimation(-0.2f, 0.2f);
    /* renamed from: Z */
    private Drawable f8699Z;
    /* renamed from: a */
    private final Transformation f8700a = new Transformation();

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public RefreshableListView(Context context) {
        super(context);
        mo1966E();
    }

    public RefreshableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1966E();
    }

    public RefreshableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1966E();
    }

    /* renamed from: A */
    public final void m6885A() {
        this.f8678E = false;
    }

    /* renamed from: B */
    public static void m6879B(RefreshableListView refreshableListView) {
        refreshableListView.f8681H.m5770O(AnonymousClass0e5.m6189C(70.0d, 11.0d));
        refreshableListView.f8681H.f7110H = 1.0d;
        refreshableListView.f8681H.f7105C = 0.5d;
        refreshableListView.f8681H.m5756A(refreshableListView);
        refreshableListView.f8681H.m5767L((double) refreshableListView.getScrollY());
        refreshableListView.f8681H.m5769N(refreshableListView.f8679F == AnonymousClass127.REFRESHING ? (double) (-refreshableListView.f8684K) : StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    /* renamed from: B */
    public final boolean m6886B() {
        if (getFirstVisiblePosition() != 0 || getChildCount() == 0 || getChildAt(0).getTop() < getPaddingTop()) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public static void m6880C(RefreshableListView refreshableListView) {
        if (refreshableListView.f8679F != AnonymousClass127.PULLING_TO_REFRESH && refreshableListView.f8686M && refreshableListView.getVisibility() == 0 && refreshableListView.m6887C()) {
            refreshableListView.f8675B.setDuration(700);
            refreshableListView.f8675B.setInterpolator(new LinearInterpolator());
            refreshableListView.f8675B.setRepeatCount(-1);
            refreshableListView.f8675B.setStartTime(-1);
            refreshableListView.f8675B.start();
        }
    }

    /* renamed from: C */
    public final boolean m6887C() {
        return getScrollY() < 0;
    }

    /* renamed from: D */
    private int m6881D(float f) {
        float f2 = (float) (-getScrollY());
        int i = this.f8684K;
        if (f2 < ((float) i) * 1.4f) {
            return (int) (-(f2 + f));
        }
        return (int) (-Math.sqrt((double) Math.max(0.0f, ((f * ((float) i)) * 1.4f) + ((float) (getScrollY() * getScrollY())))));
    }

    /* renamed from: D */
    public final void m6888D() {
        if (this.f8677D == null) {
            Runnable anonymousClass2Ln = new AnonymousClass2Ln(this);
            this.f8677D = anonymousClass2Ln;
            post(anonymousClass2Ln);
        }
    }

    /* renamed from: E */
    private void mo1966E() {
        this.f8684K = getResources().getDimensionPixelSize(C0164R.dimen.refreshable_drawable_size);
        LayerDrawable layerDrawable = (LayerDrawable) AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.refreshable_progress_drawable);
        this.f8693T = layerDrawable;
        int i = this.f8684K;
        layerDrawable.setBounds(0, 0, i, i);
        Drawable E = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.refreshable_spinner_drawable);
        this.f8699Z = E;
        i = this.f8684K;
        E.setBounds(0, 0, i, i);
        Paint paint = new Paint();
        this.f8680G = paint;
        paint.setColor(AnonymousClass0Ca.m937C(getContext(), C0164R.color.grey_1));
        this.f8680G.setStrokeWidth(0.0f);
        this.f8691R = ViewConfiguration.get(getContext()).getScaledOverflingDistance();
    }

    /* renamed from: F */
    private void m6883F() {
        AnonymousClass2Lp anonymousClass2Lp = this.f8695V;
        if (anonymousClass2Lp != null) {
            anonymousClass2Lp.pullDownProgressPercent(getScrollAsFactorOfProgressDrawableSize());
        }
        OnScrollListener onScrollListener = this.f8690Q;
        if (onScrollListener != null) {
            onScrollListener.onScroll(this, getFirstVisiblePosition(), getChildCount(), getCount());
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        mo1967G();
        scrollTo(0, (int) anonymousClass0cN.m5760E());
        if (!m6887C() && this.f8679F == AnonymousClass127.COLLAPSING) {
            setState(AnonymousClass127.PULLING_TO_REFRESH);
        }
    }

    /* renamed from: G */
    private void mo1967G() {
        this.f8693T.setLevel((int) (Math.max(0.0f, getScrollAsFactorOfProgressDrawableSize()) * 10000.0f));
        if ((this.f8695V == null || this.f8682I) && this.f8679F == AnonymousClass127.PULLING_TO_REFRESH && this.f8693T.getLevel() >= 10000) {
            this.f8698Y.setDuration(300);
            this.f8698Y.setStartTime(-1);
            this.f8698Y.start();
            setState(AnonymousClass127.REFRESHING);
            this.f8676C.onClick(this);
        } else if (this.f8679F != AnonymousClass127.REFRESHING) {
        } else {
            if (!this.f8675B.hasStarted() || this.f8675B.hasEnded()) {
                m6880C(this);
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas);
        if (this.f8678E && m6887C()) {
            float abs;
            int i;
            canvas.save();
            canvas.translate(0.0f, (float) (this.f8685L + getScrollY()));
            if (this.f8696W != null) {
                canvas2.drawRect(0.0f, 0.0f, (float) getWidth(), (float) (-getScrollY()), this.f8696W);
            }
            if (this.f8683J && (-getScrollY()) > this.f8691R) {
                canvas2.drawLine(0.0f, (float) (-getScrollY()), (float) getWidth(), (float) (-getScrollY()), this.f8680G);
            }
            canvas.translate((float) ((getWidth() - this.f8684K) / 2), 0.0f);
            canvas.clipRect(0, 0, getWidth(), -getScrollY());
            if (this.f8698Y.getTransformation(getDrawingTime(), this.f8700a)) {
                abs = 1.2f - Math.abs(this.f8700a.getAlpha());
                i = this.f8684K;
                canvas.scale(abs, abs, (float) (i / 2), (float) (i / 2));
            }
            if (this.f8679F == AnonymousClass127.PULLING_TO_REFRESH) {
                this.f8693T.draw(canvas);
            } else if (this.f8675B.getTransformation(getDrawingTime(), this.f8700a)) {
                abs = Math.min(1.0f, (((float) (-getScrollY())) * 1.0f) / ((float) this.f8684K));
                i = this.f8684K;
                canvas.scale(abs, abs, (float) (i / 2), (float) (i / 2));
                this.f8699Z.setLevel((int) (this.f8700a.getAlpha() * 10000.0f));
                this.f8699Z.draw(canvas);
                AnonymousClass0mE.m7520J(this);
            }
            canvas.restore();
        }
    }

    private float getScrollAsFactorOfProgressDrawableSize() {
        float f = (float) (-getScrollY());
        int i = this.f8684K;
        return (f - (((float) i) * 0.4f)) / ((float) i);
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 72929578);
        super.onAttachedToWindow();
        this.f8686M = true;
        m6880C(this);
        AnonymousClass0cQ.m5865O(this, -1009905561, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -1521583130);
        super.onDetachedFromWindow();
        this.f8686M = false;
        this.f8675B.cancel();
        this.f8681H.m5765J(this).m5767L(this.f8681H.f7106D);
        AnonymousClass0cQ.m5865O(this, 977747204, N);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 0 && m6887C()) {
            this.f8697X = true;
        }
        Object obj = (this.f8679F == AnonymousClass127.REFRESHING && m6887C()) ? 1 : null;
        if (!this.f8687N || obj == null) {
            this.f8688O = motionEvent.getRawY();
            if (this.f8687N || obj == null) {
                if (!super.onInterceptTouchEvent(motionEvent)) {
                    z = false;
                }
            }
            return z;
        }
        if (this.f8688O == -1.0f) {
            this.f8688O = motionEvent.getRawY();
        }
        onTouchEvent(motionEvent);
        return false;
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (this.f8679F != AnonymousClass127.COLLAPSING && !z2) {
            super.onOverScrolled(i, i2, z, z2);
        }
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        AnonymousClass2Lo anonymousClass2Lo = this.f8689P;
        if (anonymousClass2Lo != null) {
            anonymousClass2Lo.onScrollStateChanged(i, i2, i3, i4);
        }
        if (m6887C() && !m6886B()) {
            setScrollY(0);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float rawY;
        int actionMasked;
        Object obj;
        int M = AnonymousClass0cQ.m5863M(this, 69097984);
        boolean z2 = true;
        if (motionEvent.getAction() != 3) {
            if (motionEvent.getAction() != 1) {
                z = false;
                this.f8682I = z;
                if (this.f8678E) {
                    z2 = super.onTouchEvent(motionEvent);
                    AnonymousClass0cQ.m5862L(this, -211447861, M);
                    return z2;
                }
                rawY = motionEvent.getRawY();
                if (this.f8679F != AnonymousClass127.COLLAPSING) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 2) {
                        if ((!m6886B() && rawY > this.f8688O) || m6887C()) {
                            scrollTo(0, Math.min(0, m6881D(rawY - this.f8688O)));
                            mo1967G();
                            obj = 1;
                            this.f8688O = rawY;
                            if (obj == null) {
                                if (super.onTouchEvent(motionEvent)) {
                                    z2 = false;
                                }
                            }
                            AnonymousClass0cQ.m5862L(this, -544755739, M);
                            return z2;
                        } else if (this.f8697X) {
                            this.f8697X = false;
                            motionEvent.setAction(0);
                        }
                    } else if ((actionMasked == 1 || actionMasked == 3) && m6887C()) {
                        m6879B(this);
                        motionEvent.setAction(3);
                    }
                }
                obj = null;
                this.f8688O = rawY;
                if (obj == null) {
                    if (super.onTouchEvent(motionEvent)) {
                        z2 = false;
                    }
                }
                AnonymousClass0cQ.m5862L(this, -544755739, M);
                return z2;
            }
        }
        z = true;
        this.f8682I = z;
        if (this.f8678E) {
            z2 = super.onTouchEvent(motionEvent);
            AnonymousClass0cQ.m5862L(this, -211447861, M);
            return z2;
        }
        rawY = motionEvent.getRawY();
        if (this.f8679F != AnonymousClass127.COLLAPSING) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 2) {
                m6879B(this);
                motionEvent.setAction(3);
            } else {
                if (!m6886B()) {
                }
                if (this.f8697X) {
                    this.f8697X = false;
                    motionEvent.setAction(0);
                }
            }
        }
        obj = null;
        this.f8688O = rawY;
        if (obj == null) {
            if (super.onTouchEvent(motionEvent)) {
                z2 = false;
            }
        }
        AnonymousClass0cQ.m5862L(this, -544755739, M);
        return z2;
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            m6880C(this);
        } else {
            this.f8675B.cancel();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        int N = AnonymousClass0cQ.m5864N(this, 550934797);
        int scrollY = getScrollY();
        super.onWindowFocusChanged(z);
        setScrollY(scrollY);
        AnonymousClass0cQ.m5865O(this, 1731029879, N);
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        m6883F();
    }

    public void setDrawBorder(boolean z) {
        this.f8683J = z;
    }

    public void setDrawableTopOffset(int i) {
        this.f8685L = i;
    }

    public void setInvertProgressDrawable(boolean z) {
        Drawable findDrawableByLayerId = this.f8693T.findDrawableByLayerId(C0164R.id.refreshable_progress_background);
        Drawable findDrawableByLayerId2 = this.f8693T.findDrawableByLayerId(C0164R.id.refreshable_progress_track);
        if (z) {
            findDrawableByLayerId.setColorFilter(this.f8694U);
            findDrawableByLayerId2.setColorFilter(this.f8692S);
            return;
        }
        findDrawableByLayerId.setColorFilter(this.f8692S);
        findDrawableByLayerId2.setColorFilter(this.f8694U);
    }

    public void setIsInteractiveDuringRefresh(boolean z) {
        this.f8687N = z;
    }

    public void setIsLoading(boolean z) {
        if (z) {
            setState(AnonymousClass127.REFRESHING);
            invalidate();
            return;
        }
        Runnable runnable = this.f8677D;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f8677D = null;
        }
        if (m6887C()) {
            setState(AnonymousClass127.COLLAPSING);
        } else {
            setState(AnonymousClass127.PULLING_TO_REFRESH);
        }
    }

    public void setOnScrollChangedListener(AnonymousClass2Lo anonymousClass2Lo) {
        this.f8689P = anonymousClass2Lo;
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
        this.f8690Q = onScrollListener;
    }

    public void setProgressDrawableAlpha(int i) {
        this.f8693T.setAlpha(i);
    }

    public void setPullDownProgressDelegate(AnonymousClass2Lp anonymousClass2Lp) {
        this.f8695V = anonymousClass2Lp;
    }

    public void setPullToRefreshBackgroundColor(int i) {
        Paint paint = new Paint();
        this.f8696W = paint;
        paint.setColor(i);
    }

    private void setState(AnonymousClass127 anonymousClass127) {
        this.f8679F = anonymousClass127;
        switch (this.f8679F.ordinal()) {
            case 0:
                this.f8675B.cancel();
                return;
            case 1:
                m6880C(this);
                return;
            case 2:
                m6879B(this);
                return;
            default:
                return;
        }
    }

    public void setupAndEnableRefresh(OnClickListener onClickListener) {
        this.f8678E = true;
        this.f8676C = onClickListener;
    }
}
