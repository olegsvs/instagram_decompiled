package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.0iq */
public final class AnonymousClass0iq implements AnonymousClass0QP, OnAttachStateChangeListener, OnPreDrawListener {
    /* renamed from: f */
    private static final AnonymousClass0e5 f8921f = AnonymousClass0e5.m6189C(40.0d, 7.0d);
    /* renamed from: B */
    public final GestureDetector f8922B;
    /* renamed from: C */
    public final boolean f8923C;
    /* renamed from: D */
    public final AnonymousClass2Cn f8924D;
    /* renamed from: E */
    public boolean f8925E;
    /* renamed from: F */
    public final int f8926F;
    /* renamed from: G */
    public final boolean f8927G;
    /* renamed from: H */
    public final AnonymousClass0ui f8928H;
    /* renamed from: I */
    public final AnonymousClass177 f8929I;
    /* renamed from: J */
    public final Runnable f8930J = new AnonymousClass2Cd(this);
    /* renamed from: K */
    public final AnonymousClass0cN f8931K;
    /* renamed from: L */
    public AnonymousClass2Ck f8932L = AnonymousClass2Ck.f27460F;
    /* renamed from: M */
    public TouchInterceptorFrameLayout f8933M;
    /* renamed from: N */
    private final Rect f8934N = new Rect();
    /* renamed from: O */
    private int f8935O;
    /* renamed from: P */
    private int f8936P;
    /* renamed from: Q */
    private final Rect f8937Q = new Rect();
    /* renamed from: R */
    private final AnonymousClass2Co f8938R;
    /* renamed from: S */
    private ViewGroup f8939S;
    /* renamed from: T */
    private final Context f8940T;
    /* renamed from: U */
    private final int f8941U;
    /* renamed from: V */
    private final int f8942V;
    /* renamed from: W */
    private final ViewGroup f8943W;
    /* renamed from: X */
    private final Rect f8944X = new Rect();
    /* renamed from: Y */
    private float f8945Y;
    /* renamed from: Z */
    private float f8946Z;
    /* renamed from: a */
    private final GestureDetector f8947a;
    /* renamed from: b */
    private final AnonymousClass3Tp f8948b;
    /* renamed from: c */
    private final AnonymousClass178 f8949c;
    /* renamed from: d */
    private final AnonymousClass176 f8950d;
    /* renamed from: e */
    private AnonymousClass2Cp f8951e;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public AnonymousClass0iq(AnonymousClass173 anonymousClass173) {
        this.f8940T = anonymousClass173.f14641G;
        this.f8943W = anonymousClass173.f14643I;
        this.f8949c = anonymousClass173.f14648N;
        this.f8950d = anonymousClass173.f14649O;
        this.f8924D = anonymousClass173.f14637C;
        this.f8929I = anonymousClass173.f14642H;
        this.f8928H = anonymousClass173.f14640F;
        this.f8948b = anonymousClass173.f14647M;
        this.f8926F = anonymousClass173.f14638D;
        this.f8927G = anonymousClass173.f14639E;
        this.f8923C = anonymousClass173.f14636B;
        this.f8945Y = anonymousClass173.f14644J;
        this.f8946Z = anonymousClass173.f14645K;
        this.f8938R = new AnonymousClass2Co(this.f8940T, anonymousClass173.f14648N, anonymousClass173.f14646L);
        this.f8931K = AnonymousClass0e6.m6190B().m6193C().m5770O(f8921f);
        GestureDetector gestureDetector = new GestureDetector(this.f8940T, new AnonymousClass2Cj(this));
        this.f8947a = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        gestureDetector = new GestureDetector(this.f8940T, new AnonymousClass2Ci(this));
        this.f8922B = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f8944X.set(0, 0, this.f8943W.getWidth(), this.f8943W.getHeight());
        this.f8942V = this.f8940T.getResources().getDimensionPixelSize(C0164R.dimen.tooltip_padding);
        this.f8941U = AnonymousClass0Ca.m939E(this.f8940T, C0164R.drawable.tooltip_nub_bottom).getIntrinsicHeight();
    }

    /* renamed from: A */
    public final void m7042A(boolean z) {
        if (this.f8932L != AnonymousClass2Ck.f27460F) {
            this.f8932L = AnonymousClass2Ck.f27457C;
            this.f8933M.removeCallbacks(this.f8930J);
            if (!z || this.f8931K.m5760E() == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
                this.f8931K.m5767L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
                return;
            }
            AnonymousClass0cN anonymousClass0cN = this.f8931K;
            anonymousClass0cN.f7108F = true;
            anonymousClass0cN.m5769N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        }
    }

    /* renamed from: B */
    public final boolean m7043B() {
        return this.f8932L == AnonymousClass2Ck.f27459E;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static boolean m7032B(X.AnonymousClass0iq r3, X.AnonymousClass177 r4) {
        /*
        r1 = X.AnonymousClass2Ch.f27453B;
        r0 = r4.ordinal();
        r1 = r1[r0];
        r2 = 0;
        r0 = 1;
        switch(r1) {
            case 1: goto L_0x0030;
            case 2: goto L_0x0029;
            case 3: goto L_0x0015;
            default: goto L_0x000d;
        };
    L_0x000d:
        r1 = new java.lang.UnsupportedOperationException;
        r0 = "Unknown position value";
        r1.<init>(r0);
        throw r1;
    L_0x0015:
        r1 = X.AnonymousClass0iq.m7038H(r3, r4);
        r0 = r3.f8941U;
        r1 = r1 + r0;
        r0 = X.AnonymousClass0iq.m7039I(r3);
        r1 = r1 + r0;
        r0 = r3.f8944X;
        r0 = r0.bottom;
        if (r1 > r0) goto L_0x0028;
    L_0x0027:
        r2 = 1;
    L_0x0028:
        return r2;
    L_0x0029:
        r0 = X.AnonymousClass0iq.m7038H(r3, r4);
        if (r0 < 0) goto L_0x0028;
    L_0x002f:
        goto L_0x0027;
    L_0x0030:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0iq.B(X.0iq, X.177):boolean");
    }

    /* renamed from: C */
    public final void m7044C() {
        if (this.f8932L == AnonymousClass2Ck.f27460F) {
            AnonymousClass0ui anonymousClass0ui;
            if (this.f8924D.TU(this.f8937Q)) {
                this.f8932L = AnonymousClass2Ck.f27459E;
                ViewGroup frameLayout = new FrameLayout(this.f8940T);
                this.f8939S = frameLayout;
                frameLayout.setLayoutParams(new LayoutParams(-1, -1));
                this.f8939S.setOnTouchListener(new AnonymousClass2Ce(this));
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = new TouchInterceptorFrameLayout(this.f8940T);
                this.f8933M = touchInterceptorFrameLayout;
                touchInterceptorFrameLayout.setLayoutParams(new LayoutParams(-2, -2));
                this.f8933M.setBackground(this.f8938R);
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.f8933M;
                int i = this.f8942V;
                touchInterceptorFrameLayout2.setPadding(i, i, i, i);
                this.f8933M.setKeepObservingAfterRequestDisallowTouchEvent(true);
                this.f8933M.m6301B(new AnonymousClass2Cl(this), new AnonymousClass2Cm(this));
                this.f8951e = this.f8950d.AG(LayoutInflater.from(this.f8940T), this.f8933M);
                this.f8950d.sC(this.f8951e, this.f8949c);
                this.f8933M.addView(this.f8951e.f27475B);
                this.f8939S.addView(this.f8933M);
                this.f8939S.setClipChildren(false);
                this.f8943W.addView(this.f8939S);
                this.f8931K.m5756A(this);
                this.f8924D.dI().addOnAttachStateChangeListener(this);
                this.f8924D.dI().setHasTransientState(true);
                AnonymousClass0Nm.m3442U(this.f8933M, new AnonymousClass2Cf(this));
                anonymousClass0ui = this.f8928H;
                if (anonymousClass0ui != null) {
                    anonymousClass0ui.qDA(this);
                    return;
                }
                return;
            }
            anonymousClass0ui = this.f8928H;
            if (anonymousClass0ui != null) {
                anonymousClass0ui.pDA(this);
            }
        }
    }

    /* renamed from: C */
    public static void m7033C(AnonymousClass0iq anonymousClass0iq, MotionEvent motionEvent) {
        anonymousClass0iq.f8947a.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            AnonymousClass0iq.m7035E(anonymousClass0iq);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public static boolean m7034D(X.AnonymousClass0iq r7) {
        /*
        r1 = r7.f8924D;
        r0 = r7.f8937Q;
        r0 = r1.TU(r0);
        r4 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r4;
    L_0x000c:
        r0 = r7.f8937Q;
        r5 = r0.centerX();
        r0 = r7.f8933M;
        r0 = r0.getWidth();
        r0 = r0 / 2;
        r0 = r5 - r0;
        r2 = java.lang.Math.max(r0, r4);
        r0 = r7.f8944X;
        r1 = r0.right;
        r0 = r7.f8933M;
        r0 = r0.getWidth();
        r1 = r1 - r0;
        r6 = java.lang.Math.min(r2, r1);
        r3 = r7.f8929I;
        r0 = X.AnonymousClass0iq.m7032B(r7, r3);
        if (r0 != 0) goto L_0x0062;
    L_0x0037:
        r0 = r3.ordinal();
        switch(r0) {
            case 0: goto L_0x005a;
            case 1: goto L_0x0051;
            case 2: goto L_0x0046;
            default: goto L_0x003e;
        };
    L_0x003e:
        r1 = new java.lang.UnsupportedOperationException;
        r0 = "Unknown position value";
        r1.<init>(r0);
        throw r1;
    L_0x0046:
        r3 = X.AnonymousClass177.ABOVE_ANCHOR;
        r0 = X.AnonymousClass0iq.m7032B(r7, r3);
        if (r0 != 0) goto L_0x0062;
    L_0x004e:
        r3 = X.AnonymousClass177.CENTER_OF_ANCHOR;
        goto L_0x0062;
    L_0x0051:
        r3 = X.AnonymousClass177.BELOW_ANCHOR;
        r0 = X.AnonymousClass0iq.m7032B(r7, r3);
        if (r0 != 0) goto L_0x0062;
    L_0x0059:
        goto L_0x004e;
    L_0x005a:
        r1 = new java.lang.IllegalStateException;
        r0 = "CENTER_OF_ANCHOR should always be accepted";
        r1.<init>(r0);
        throw r1;
    L_0x0062:
        r2 = X.AnonymousClass0iq.m7038H(r7, r3);
        r1 = r7.f8933M;
        r0 = (float) r6;
        r1.setX(r0);
        r1 = r7.f8933M;
        r0 = (float) r2;
        r1.setY(r0);
        r1 = X.AnonymousClass2Ch.f27453B;
        r0 = r3.ordinal();
        r0 = r1[r0];
        r3 = 1;
        switch(r0) {
            case 1: goto L_0x0081;
            case 2: goto L_0x0090;
            case 3: goto L_0x007f;
            default: goto L_0x007e;
        };
    L_0x007e:
        goto L_0x003e;
    L_0x007f:
        r4 = 1;
        goto L_0x0090;
    L_0x0081:
        r0 = r7.f8941U;
        r2 = r2 + r0;
        r0 = X.AnonymousClass0iq.m7039I(r7);
        r2 = r2 + r0;
        r0 = r7.f8944X;
        r0 = r0.bottom;
        if (r2 > r0) goto L_0x0090;
    L_0x008f:
        goto L_0x007f;
    L_0x0090:
        r5 = r5 - r6;
        r2 = r7.f8933M;
        r1 = (float) r5;
        r0 = r7.f8945Y;
        r1 = r1 + r0;
        r2.setPivotX(r1);
        r1 = r7.f8938R;
        r1.f27463B = r5;
        r0 = r1.getBounds();
        X.AnonymousClass2Co.B(r1, r0);
        r1 = r7.f8938R;
        r1.f27464C = r4;
        r0 = r1.getBounds();
        X.AnonymousClass2Co.B(r1, r0);
        if (r4 == 0) goto L_0x00c8;
    L_0x00b2:
        r1 = r7.f8933M;
        r0 = r7.f8946Z;
        r1.setPivotY(r0);
        r1 = r7.f8933M;
        r0 = r7.f8941U;
        X.AnonymousClass0Nm.m3453f(r1, r0);
        r1 = r7.f8933M;
        r0 = r7.f8942V;
        X.AnonymousClass0Nm.m3448a(r1, r0);
        goto L_0x00e9;
    L_0x00c8:
        r2 = r7.f8933M;
        r1 = r7.f8942V;
        r0 = X.AnonymousClass0iq.m7039I(r7);
        r1 = r1 + r0;
        r0 = r7.f8941U;
        r1 = r1 + r0;
        r1 = (float) r1;
        r0 = r7.f8946Z;
        r1 = r1 + r0;
        r2.setPivotY(r1);
        r1 = r7.f8933M;
        r0 = r7.f8942V;
        X.AnonymousClass0Nm.m3453f(r1, r0);
        r1 = r7.f8933M;
        r0 = r7.f8941U;
        X.AnonymousClass0Nm.m3448a(r1, r0);
    L_0x00e9:
        r1 = r7.f8924D;
        r0 = r7.f8934N;
        r1.zI(r0);
        r0 = r7.f8934N;
        r0 = r0.centerX();
        r7.f8935O = r0;
        r0 = r7.f8934N;
        r0 = r0.centerY();
        r7.f8936P = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0iq.D(X.0iq):boolean");
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        if (anonymousClass0cN.f7106D == 1.0d) {
            if (this.f8932L == AnonymousClass2Ck.f27459E) {
                AnonymousClass0ui anonymousClass0ui = this.f8928H;
                if (anonymousClass0ui != null) {
                    anonymousClass0ui.sDA(this);
                    return;
                }
            }
            if (this.f8932L == AnonymousClass2Ck.f27458D) {
                this.f8932L = AnonymousClass2Ck.f27459E;
            }
        }
    }

    /* renamed from: E */
    public static void m7035E(AnonymousClass0iq anonymousClass0iq) {
        if (anonymousClass0iq.f8932L == AnonymousClass2Ck.f27458D) {
            anonymousClass0iq = anonymousClass0iq.f8931K;
            anonymousClass0iq.f7108F = false;
            anonymousClass0iq.m5769N(1.0d);
        }
    }

    /* renamed from: F */
    public static void m7036F(AnonymousClass0iq anonymousClass0iq) {
        anonymousClass0iq.f8932L = AnonymousClass2Ck.f27460F;
        anonymousClass0iq.f8924D.dI().removeOnAttachStateChangeListener(anonymousClass0iq);
        anonymousClass0iq.f8924D.dI().getViewTreeObserver().removeOnPreDrawListener(anonymousClass0iq);
        anonymousClass0iq.f8924D.dI().setHasTransientState(false);
        anonymousClass0iq.f8931K.m5765J(anonymousClass0iq);
        anonymousClass0iq.f8943W.removeView(anonymousClass0iq.f8939S);
        anonymousClass0iq.f8951e = null;
        anonymousClass0iq.f8933M = null;
        anonymousClass0iq.f8939S = null;
        AnonymousClass0ui anonymousClass0ui = anonymousClass0iq.f8928H;
        if (anonymousClass0ui != null) {
            anonymousClass0ui.pDA(anonymousClass0iq);
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float E = (float) anonymousClass0cN.m5760E();
        AnonymousClass3Tp anonymousClass3Tp = this.f8948b;
        if (anonymousClass3Tp != null) {
            AnonymousClass2Ck anonymousClass2Ck = this.f8932L;
            double d = (double) E;
            if (d < 0.5d && anonymousClass2Ck == AnonymousClass2Ck.f27457C) {
                anonymousClass3Tp.f41548B.f41551C.setAlpha(1.0f);
            } else if (d > 0.5d && anonymousClass2Ck == AnonymousClass2Ck.f27459E) {
                anonymousClass3Tp.f41548B.f41551C.setAlpha(0.0f);
            }
        }
        this.f8933M.setScaleX(Math.max(E, 0.0f));
        this.f8933M.setScaleY(Math.max(E, 0.0f));
        if (this.f8932L != AnonymousClass2Ck.f27458D) {
            this.f8933M.setAlpha((float) AnonymousClass0dh.m6102B((double) E, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d));
        }
        if (E != 0.0f || this.f8932L != AnonymousClass2Ck.f27457C) {
            return;
        }
        if (this.f8925E) {
            this.f8925E = false;
            AnonymousClass0Sy.m4438G(new AnonymousClass2Cg(this));
            return;
        }
        AnonymousClass0iq.m7036F(this);
    }

    /* renamed from: G */
    public static void m7037G(AnonymousClass0iq anonymousClass0iq) {
        if (anonymousClass0iq.f8932L == AnonymousClass2Ck.f27459E) {
            anonymousClass0iq.f8932L = AnonymousClass2Ck.f27458D;
            anonymousClass0iq = anonymousClass0iq.f8931K;
            anonymousClass0iq.f7108F = true;
            anonymousClass0iq.m5769N(0.8999999761581421d);
        }
    }

    /* renamed from: H */
    private static int m7038H(AnonymousClass0iq anonymousClass0iq, AnonymousClass177 anonymousClass177) {
        switch (anonymousClass177.ordinal()) {
            case 0:
                return anonymousClass0iq.m7041K(anonymousClass0iq.f8937Q.centerY());
            case 1:
                return anonymousClass0iq.m7041K(((anonymousClass0iq.f8937Q.top - anonymousClass0iq.f8941U) - AnonymousClass0iq.m7039I(anonymousClass0iq)) - anonymousClass0iq.f8942V);
            case 2:
                return anonymousClass0iq.m7041K(anonymousClass0iq.f8937Q.bottom);
            default:
                throw new UnsupportedOperationException("Unknown position value");
        }
    }

    /* renamed from: I */
    private static int m7039I(AnonymousClass0iq anonymousClass0iq) {
        return anonymousClass0iq.f8951e.f27475B.getHeight();
    }

    /* renamed from: J */
    private void m7040J() {
        if (this.f8932L != AnonymousClass2Ck.f27460F) {
            this.f8924D.zI(this.f8934N);
            int centerX = this.f8934N.centerX();
            int centerY = this.f8934N.centerY();
            int i = centerX - this.f8935O;
            int i2 = centerY - this.f8936P;
            if (!(i == 0 && i2 == 0)) {
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.f8933M;
                touchInterceptorFrameLayout.setX(touchInterceptorFrameLayout.getX() + ((float) i));
                touchInterceptorFrameLayout = this.f8933M;
                touchInterceptorFrameLayout.setY(touchInterceptorFrameLayout.getY() + ((float) i2));
            }
            this.f8935O = centerX;
            this.f8936P = centerY;
        }
    }

    /* renamed from: K */
    private int m7041K(int i) {
        return Math.min(Math.max(i, 0), this.f8944X.bottom);
    }

    public final boolean onPreDraw() {
        if (this.f8924D.TU(this.f8937Q)) {
            m7040J();
        } else {
            m7042A(true);
        }
        return true;
    }

    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.f8925E = true;
        m7042A(true);
    }
}
