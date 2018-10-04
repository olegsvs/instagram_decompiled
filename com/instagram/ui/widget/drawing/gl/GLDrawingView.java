package com.instagram.ui.widget.drawing.gl;

import X.AnonymousClass0OR;
import X.AnonymousClass0cQ;
import X.AnonymousClass2L3;
import X.AnonymousClass2L4;
import X.AnonymousClass2L6;
import X.AnonymousClass2L7;
import X.AnonymousClass2L9;
import X.AnonymousClass2LB;
import X.AnonymousClass2LC;
import X.AnonymousClass2LE;
import X.AnonymousClass2LN;
import X.AnonymousClass2V0;
import X.AnonymousClass2c9;
import X.AnonymousClass2cR;
import X.AnonymousClass2eB;
import X.AnonymousClass4Lk;
import X.AnonymousClass4Ll;
import X.AnonymousClass5Te;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class GLDrawingView extends AnonymousClass2V0 implements AnonymousClass2L3 {
    /* renamed from: B */
    public final GestureDetector f32096B;
    /* renamed from: C */
    public AnonymousClass4Ll f32097C;
    /* renamed from: D */
    public final AnonymousClass2L4 f32098D;
    /* renamed from: E */
    private AnonymousClass2LC f32099E;
    /* renamed from: F */
    private final Handler f32100F;
    /* renamed from: G */
    private final AnonymousClass2LE f32101G;
    /* renamed from: H */
    private boolean f32102H;
    /* renamed from: I */
    private float f32103I;
    /* renamed from: J */
    private Runnable f32104J;
    /* renamed from: K */
    private boolean f32105K;
    /* renamed from: L */
    private boolean f32106L;

    public View getView() {
        return this;
    }

    public GLDrawingView(Context context) {
        this(context, null);
    }

    public GLDrawingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32103I = -1.0f;
        this.f32100F = new Handler(Looper.getMainLooper());
        this.f32096B = new GestureDetector(getContext(), new AnonymousClass2L6(this));
        this.f32101G = new AnonymousClass2LE(context);
        setOpaque(false);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(new AnonymousClass2eB(this, 8, 8, 8, 8, 0, 0));
        setPreserveEGLContextOnPause(true);
        Renderer anonymousClass2c9 = new AnonymousClass2c9(this.f32101G, this);
        this.f32098D = anonymousClass2c9;
        setRenderer(anonymousClass2c9);
        setRenderMode(0);
        m16762I();
    }

    /* renamed from: C */
    public final void mo3601C() {
        AnonymousClass2L4 anonymousClass2L4 = this.f32098D;
        anonymousClass2L4.f29198B = true;
        anonymousClass2L4.f29203G.remove(anonymousClass2L4.f29201E);
        anonymousClass2L4.f29201E = null;
        super.mo3601C();
        this.f32102H = true;
    }

    /* renamed from: D */
    public final void mo3602D() {
        m16087F();
        super.mo3602D();
        this.f32098D.f29198B = false;
        this.f32102H = false;
    }

    /* renamed from: H */
    public final boolean m16761H() {
        return this.f32098D.m15129B();
    }

    /* renamed from: I */
    public final void m16762I() {
        m16086E(new AnonymousClass2L9(this, null));
    }

    /* renamed from: J */
    public final void m16763J(AnonymousClass2cR anonymousClass2cR, AnonymousClass5Te anonymousClass5Te) {
        if (anonymousClass2cR != null) {
            m16086E(new AnonymousClass2LB(this, anonymousClass2cR, anonymousClass5Te));
        }
    }

    public final void PCA(AnonymousClass2LE anonymousClass2LE) {
        this.f32105K = true;
        AnonymousClass2LC anonymousClass2LC = this.f32099E;
        if (anonymousClass2LC != null) {
            anonymousClass2LC.An(anonymousClass2LE, getGLThread());
        }
    }

    public AnonymousClass2LN getBrush() {
        AnonymousClass2LN anonymousClass2LN;
        AnonymousClass2L4 anonymousClass2L4 = this.f32098D;
        synchronized (anonymousClass2L4) {
            anonymousClass2LN = anonymousClass2L4.f29199C;
        }
        return anonymousClass2LN;
    }

    public Bitmap getDrawingBitmap() {
        return getBitmap();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 1525605555);
        boolean isEnabled = isEnabled();
        if (isEnabled) {
            this.f32096B.onTouchEvent(motionEvent);
            AnonymousClass2L4 anonymousClass2L4 = this.f32098D;
            anonymousClass2L4.f29202F.offer(MotionEvent.obtain(motionEvent));
            m16086E(this.f32098D);
            m16087F();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    switch (actionMasked) {
                        case 0:
                            float f = this.f32103I;
                            if (f != -1.0f) {
                                setBrushSize(f);
                            }
                            this.f32106L = true;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            break;
                        case 1:
                            break;
                        default:
                            break;
                    }
                } else if (this.f32097C != null) {
                    this.f32104J = new AnonymousClass2L7(this);
                    AnonymousClass0OR.F(this.f32100F, this.f32104J, 800, -1942831306);
                }
            }
            Runnable runnable = this.f32104J;
            if (runnable != null) {
                AnonymousClass0OR.G(this.f32100F, runnable, -750078688);
                this.f32104J = null;
            }
            this.f32106L = false;
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        AnonymousClass0cQ.L(this, -1857207591, M);
        return isEnabled;
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && this.f32102H) {
            mo3602D();
        }
    }

    public void setBrush(AnonymousClass2LN anonymousClass2LN) {
        AnonymousClass2L4 anonymousClass2L4 = this.f32098D;
        synchronized (anonymousClass2L4) {
            anonymousClass2L4.f29199C = anonymousClass2LN;
        }
    }

    public void setBrushSize(float f) {
        if (this.f32106L) {
            this.f32103I = f;
            return;
        }
        AnonymousClass2LN anonymousClass2LN;
        this.f32103I = -1.0f;
        AnonymousClass2L4 anonymousClass2L4 = this.f32098D;
        synchronized (anonymousClass2L4) {
            anonymousClass2LN = anonymousClass2L4.f29199C;
        }
        anonymousClass2LN.eRA(f);
    }

    public void setGLThreadListener(AnonymousClass2LC anonymousClass2LC) {
        this.f32099E = anonymousClass2LC;
        if (this.f32105K) {
            AnonymousClass2LC anonymousClass2LC2 = this.f32099E;
            if (anonymousClass2LC2 != null) {
                anonymousClass2LC2.An(this.f32101G, getGLThread());
            }
        }
    }

    public void setOnDrawListener(AnonymousClass4Lk anonymousClass4Lk) {
        this.f32098D.f29204H = anonymousClass4Lk;
    }

    public void setOnReloadBrushesListener(AnonymousClass4Ll anonymousClass4Ll) {
        this.f32097C = anonymousClass4Ll;
    }
}
