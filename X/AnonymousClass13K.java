package X;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: X.13K */
public final class AnonymousClass13K implements AnonymousClass0QP, OnTouchListener {
    /* renamed from: S */
    public static final String f13688S = "BouncyPressStateOnTouchListener";
    /* renamed from: B */
    public boolean f13689B;
    /* renamed from: C */
    public boolean f13690C;
    /* renamed from: D */
    public final AnonymousClass15J f13691D;
    /* renamed from: E */
    public final float f13692E;
    /* renamed from: F */
    public final AnonymousClass0cN f13693F;
    /* renamed from: G */
    public final View f13694G;
    /* renamed from: H */
    public final boolean f13695H;
    /* renamed from: I */
    private final AnonymousClass16c f13696I = new AnonymousClass16c(this);
    /* renamed from: J */
    private final AnonymousClass15K f13697J;
    /* renamed from: K */
    private boolean f13698K;
    /* renamed from: L */
    private final GestureDetector f13699L;
    /* renamed from: M */
    private final boolean f13700M;
    /* renamed from: N */
    private final boolean f13701N;
    /* renamed from: O */
    private boolean f13702O;
    /* renamed from: P */
    private final Rect f13703P = new Rect();
    /* renamed from: Q */
    private final boolean f13704Q;
    /* renamed from: R */
    private final boolean f13705R;

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public AnonymousClass13K(AnonymousClass15z anonymousClass15z) {
        GestureDetector gestureDetector = new GestureDetector(anonymousClass15z.f14391K.getContext(), new AnonymousClass16b(this, anonymousClass15z));
        this.f13699L = gestureDetector;
        gestureDetector.setIsLongpressEnabled(anonymousClass15z.f14384D);
        this.f13692E = anonymousClass15z.f14389I;
        this.f13694G = anonymousClass15z.f14391K;
        this.f13697J = anonymousClass15z.f14382B;
        this.f13691D = anonymousClass15z.f14385E;
        this.f13695H = anonymousClass15z.f14394N;
        this.f13705R = anonymousClass15z.f14393M;
        this.f13700M = anonymousClass15z.f14386F;
        this.f13701N = anonymousClass15z.f14387G;
        this.f13704Q = anonymousClass15z.f14392L;
        AnonymousClass0cN O = AnonymousClass0e6.m6190B().m6193C().m5770O(anonymousClass15z.f14390J);
        O.f7110H = anonymousClass15z.f14388H;
        O.f7105C = anonymousClass15z.f14383C;
        this.f13693F = O.m5767L(1.0d).m5766K().m5756A(this);
        this.f13694G.addOnAttachStateChangeListener(new AnonymousClass16d(this));
        this.f13694G.setOnTouchListener(this);
        if (VERSION.SDK_INT > 25) {
            this.f13694G.setClickable(false);
            this.f13694G.setFocusable(true);
        }
    }

    /* renamed from: A */
    public final float m9099A() {
        return (float) this.f13693F.m5760E();
    }

    /* renamed from: B */
    public final void m9100B() {
        AnonymousClass0cN anonymousClass0cN = this.f13693F;
        anonymousClass0cN.f7108F = true;
        anonymousClass0cN.m5769N((double) this.f13692E);
    }

    /* renamed from: B */
    public static boolean m9097B(AnonymousClass13K anonymousClass13K, MotionEvent motionEvent) {
        boolean contains = anonymousClass13K.f13703P.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        switch (motionEvent.getAction()) {
            case 0:
                anonymousClass13K.f13703P.set(0, 0, anonymousClass13K.f13694G.getWidth(), anonymousClass13K.f13694G.getHeight());
                anonymousClass13K.f13689B = false;
                anonymousClass13K.f13702O = false;
                anonymousClass13K.f13690C = false;
                anonymousClass13K.m9100B();
                anonymousClass13K.f13699L.onTouchEvent(motionEvent);
                return true;
            case 1:
                if (!contains) {
                    break;
                }
                anonymousClass13K.f13699L.onTouchEvent(motionEvent);
                if (anonymousClass13K.f13690C) {
                    anonymousClass13K.m9101D();
                    return true;
                } else if (anonymousClass13K.f13700M) {
                    anonymousClass13K.f13702O = true;
                    if ((anonymousClass13K.m9099A() == anonymousClass13K.f13692E ? 1 : null) != null) {
                        anonymousClass13K.m9098C();
                    } else {
                        anonymousClass13K.m9100B();
                    }
                    return true;
                } else if (anonymousClass13K.f13704Q) {
                    anonymousClass13K.f13702O = true;
                    anonymousClass13K.m9101D();
                    return true;
                } else {
                    anonymousClass13K.m9101D();
                    return anonymousClass13K.f13691D.yCA(anonymousClass13K.f13694G);
                }
            case 2:
                if (contains) {
                    anonymousClass13K.m9100B();
                    anonymousClass13K.f13699L.onTouchEvent(motionEvent);
                    return true;
                }
                anonymousClass13K.m9101D();
                return false;
            case 3:
                anonymousClass13K.m9101D();
                anonymousClass13K.f13699L.onTouchEvent(motionEvent);
                return false;
        }
        return false;
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
        this.f13697J.Ye(this);
    }

    /* renamed from: C */
    private void m9098C() {
        this.f13691D.yCA(this.f13694G);
        this.f13702O = false;
        if (this.f13701N) {
            m9101D();
        }
    }

    /* renamed from: D */
    public final void m9101D() {
        AnonymousClass0cN anonymousClass0cN = this.f13693F;
        anonymousClass0cN.f7108F = false;
        anonymousClass0cN.m5769N(1.0d);
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        this.f13697J.Ze(this);
        if (this.f13702O) {
            m9098C();
        }
    }

    /* renamed from: E */
    public final void m9102E() {
        this.f13689B = false;
        this.f13702O = false;
        this.f13693F.m5767L(1.0d);
        this.f13697J.Ux(this);
    }

    /* renamed from: F */
    public final void m9103F(boolean z) {
        this.f13698K = z ^ 1;
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        this.f13697J.ae(this);
        float A = m9099A();
        if (this.f13689B && A <= this.f13692E) {
            this.f13693F.m5769N(1.0d);
            this.f13689B = false;
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f13698K) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        MotionEvent motionEvent2;
        switch (action) {
            case 0:
                AnonymousClass16c anonymousClass16c = this.f13696I;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                motionEvent2 = anonymousClass16c.f14562C;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                anonymousClass16c.f14562C = obtain;
                this.f13694G.removeCallbacks(this.f13696I);
                if (this.f13705R) {
                    this.f13694G.postOnAnimationDelayed(this.f13696I, 150);
                } else {
                    this.f13696I.run();
                }
                return true;
            case 1:
            case 3:
                this.f13694G.removeCallbacks(this.f13696I);
                if (this.f13705R && !this.f13696I.f14561B) {
                    if (action == 1) {
                        this.f13689B = true;
                        m9100B();
                    }
                    this.f13696I.run();
                }
                AnonymousClass16c anonymousClass16c2 = this.f13696I;
                anonymousClass16c2.f14561B = false;
                motionEvent2 = anonymousClass16c2.f14562C;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    anonymousClass16c2.f14562C = null;
                    break;
                }
                break;
            case 2:
                if (!this.f13696I.f14561B) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return AnonymousClass13K.m9097B(this, motionEvent);
    }
}
