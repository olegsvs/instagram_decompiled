package com.instagram.ui.widget.shutterbutton;

import X.AnonymousClass0CC;
import X.AnonymousClass0Dc;
import X.AnonymousClass0Nm;
import X.AnonymousClass0OR;
import X.AnonymousClass0QP;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dh;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0eS;
import X.AnonymousClass0nB;
import X.AnonymousClass1wg;
import X.AnonymousClass1wh;
import X.AnonymousClass2MM;
import X.AnonymousClass2MN;
import X.AnonymousClass5JT;
import X.AnonymousClass5JU;
import X.AnonymousClass5JV;
import X.AnonymousClass5JW;
import X.AnonymousClass5JX;
import X.AnonymousClass5JY;
import X.AnonymousClass5JZ;
import X.AnonymousClass5Sg;
import X.AnonymousClass5Si;
import X.AnonymousClass5Sk;
import X.AnonymousClass5T9;
import X.AnonymousClass5Td;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.C0164R;
import java.util.UUID;

public class ShutterButton extends View implements AnonymousClass0QP {
    /* renamed from: B */
    public final RectF f62099B;
    /* renamed from: C */
    public final AnonymousClass1wh f62100C;
    /* renamed from: D */
    public int f62101D;
    /* renamed from: E */
    public boolean f62102E;
    /* renamed from: F */
    public boolean f62103F;
    /* renamed from: G */
    public int f62104G;
    /* renamed from: H */
    public long f62105H;
    /* renamed from: I */
    public AnonymousClass5JV f62106I;
    /* renamed from: J */
    public AnonymousClass5Sk f62107J;
    /* renamed from: K */
    public float f62108K;
    /* renamed from: L */
    public final Paint f62109L;
    /* renamed from: M */
    public final float f62110M;
    /* renamed from: N */
    public AnonymousClass5JX f62111N;
    /* renamed from: O */
    public boolean f62112O;
    /* renamed from: P */
    public float f62113P;
    /* renamed from: Q */
    public final AnonymousClass1wg f62114Q;
    /* renamed from: R */
    public long f62115R;
    /* renamed from: S */
    private AnonymousClass5Sg f62116S;
    /* renamed from: T */
    private final int f62117T;
    /* renamed from: U */
    private final Paint f62118U;
    /* renamed from: V */
    private boolean f62119V;
    /* renamed from: W */
    private int f62120W;
    /* renamed from: X */
    private final int f62121X;
    /* renamed from: Y */
    private final float f62122Y;
    /* renamed from: Z */
    private final Paint f62123Z;
    /* renamed from: a */
    private float f62124a;
    /* renamed from: b */
    private Float f62125b;
    /* renamed from: c */
    private final Runnable f62126c;
    /* renamed from: d */
    private AnonymousClass5JW f62127d;
    /* renamed from: e */
    private AnonymousClass5Si f62128e;
    /* renamed from: f */
    private final int f62129f;
    /* renamed from: g */
    private final Paint f62130g;
    /* renamed from: h */
    private LinearGradient f62131h;
    /* renamed from: i */
    private final Matrix f62132i;
    /* renamed from: j */
    private final int f62133j;
    /* renamed from: k */
    private AnonymousClass0cN f62134k;
    /* renamed from: l */
    private AnonymousClass5T9 f62135l;
    /* renamed from: m */
    private AnonymousClass5JZ f62136m;
    /* renamed from: n */
    private float f62137n;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public ShutterButton(Context context) {
        this(context, null);
    }

    public ShutterButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShutterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62132i = new Matrix();
        this.f62105H = 15000;
        this.f62112O = true;
        this.f62119V = true;
        this.f62108K = 1.0f;
        this.f62124a = 1.0f;
        this.f62099B = new RectF();
        this.f62120W = -1;
        this.f62106I = AnonymousClass5JV.READY_TO_SHOOT;
        this.f62100C = AnonymousClass1wh.f24541D;
        this.f62114Q = new AnonymousClass5JT(this);
        this.f62126c = new AnonymousClass5JU(this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass0eS.ShutterButton, 0, 0);
        try {
            this.f62121X = obtainStyledAttributes.getColor(2, -7829368);
            this.f62129f = obtainStyledAttributes.getColor(5, -1);
            this.f62117T = obtainStyledAttributes.getColor(0, -3355444);
            this.f62110M = obtainStyledAttributes.getDimension(6, 5.0f);
            this.f62122Y = obtainStyledAttributes.getDimension(3, 10.0f);
            this.f62105H = (long) obtainStyledAttributes.getInteger(4, 15000);
            this.f62133j = obtainStyledAttributes.getResourceId(7, C0164R.style.GradientPatternStyle);
            Paint paint = new Paint(1);
            this.f62123Z = paint;
            paint.setColor(this.f62121X);
            this.f62123Z.setStyle(Style.FILL);
            paint = new Paint(this.f62123Z);
            this.f62130g = paint;
            paint.setStyle(Style.STROKE);
            this.f62130g.setColor(this.f62129f);
            this.f62130g.setStrokeWidth(this.f62122Y);
            paint = new Paint(this.f62123Z);
            this.f62118U = paint;
            paint.setStyle(Style.FILL);
            paint = new Paint(1);
            this.f62109L = paint;
            paint.setStyle(Style.STROKE);
            this.f62109L.setStrokeCap(Cap.ROUND);
            this.f62109L.setStrokeWidth(this.f62110M);
            this.f62134k = AnonymousClass0e6.B().C().O(AnonymousClass0e5.C(80.0d, 7.0d));
            if (VERSION.SDK_INT > 25) {
                setClickable(false);
                setFocusable(true);
            } else {
                setClickable(true);
            }
            setLongClickable(true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: A */
    public final void m26239A() {
        AnonymousClass5JV anonymousClass5JV = this.f62106I;
        AnonymousClass5JV anonymousClass5JV2 = AnonymousClass5JV.READY_TO_SHOOT;
        if (anonymousClass5JV != anonymousClass5JV2) {
            m26237I(this);
            setMode(anonymousClass5JV2);
        }
    }

    /* renamed from: B */
    public final void m26240B() {
        if (m26235G(this)) {
            if (this.f62102E) {
                this.f62103F = true;
            }
            setMode(AnonymousClass5JV.RECORD_VIDEO_REQUESTED);
            this.f62134k.N(1.524999976158142d);
            AnonymousClass5Sk anonymousClass5Sk = this.f62107J;
            if (anonymousClass5Sk != null) {
                anonymousClass5Sk.m26774A();
            }
            return;
        }
        m26243E();
    }

    /* renamed from: B */
    public static void m26230B(ShutterButton shutterButton) {
        shutterButton.f62131h.getLocalMatrix(shutterButton.f62132i);
        shutterButton.f62132i.setRotate(((((float) (SystemClock.elapsedRealtime() - shutterButton.f62115R)) / (((float) shutterButton.f62105H) / 2.0f)) * 360.0f) % 360.0f, ((float) shutterButton.getWidth()) / 2.0f, ((float) shutterButton.getHeight()) / 2.0f);
        shutterButton.f62131h.setLocalMatrix(shutterButton.f62132i);
    }

    /* renamed from: C */
    public final void m26241C(AnonymousClass5JY anonymousClass5JY) {
        if (this.f62106I.equals(AnonymousClass5JV.RECORD_VIDEO_REQUESTED)) {
            Object obj;
            int i;
            AnonymousClass5JZ anonymousClass5JZ;
            AnonymousClass5T9 anonymousClass5T9;
            AnonymousClass5Td anonymousClass5Td;
            Bitmap A;
            boolean B;
            AnonymousClass5T9 anonymousClass5T92 = this.f62135l;
            Object obj2 = 1;
            if (anonymousClass5T92 != null) {
                Object obj3 = (anonymousClass5T92.f64313E && ((Boolean) AnonymousClass0CC.PF.H(anonymousClass5T92.f64320L)).booleanValue()) ? 1 : null;
                if (obj3 != null) {
                    obj = 1;
                    this.f62101D = 0;
                    if (obj != null) {
                        if (this.f62119V) {
                            i = 1;
                        } else {
                            i = 10 - this.f62135l.f64314F.size();
                        }
                        this.f62104G = i;
                        anonymousClass5JZ = new AnonymousClass5JZ(this.f62104G);
                        this.f62136m = anonymousClass5JZ;
                        anonymousClass5JZ.f62140D = this.f62131h;
                    }
                    setMode(AnonymousClass5JV.RECORDING_VIDEO);
                    if (anonymousClass5JY == AnonymousClass5JY.TIME_BASED) {
                        this.f62115R = SystemClock.elapsedRealtime();
                        this.f62100C.A(this.f62114Q);
                    }
                    if (this.f62107J != null) {
                        if (obj != null || !this.f62119V) {
                            obj2 = null;
                        }
                        anonymousClass5T9 = this.f62107J.f64111B.f7611Y.f7385Y;
                        if (!anonymousClass5T9.m26823B()) {
                            AnonymousClass5T9.m26819D(anonymousClass5T9);
                        }
                        if (obj2 != null || anonymousClass5T9.m26823B()) {
                            anonymousClass5Td = anonymousClass5T9.f64317I;
                            A = anonymousClass5T9.f64310B.A(anonymousClass5T9.f64318J, anonymousClass5T9.f64316H);
                            B = anonymousClass5T9.m26823B();
                            anonymousClass5Td.f64550J = UUID.randomUUID().toString();
                            anonymousClass5Td.f64548H.setEnabled(false);
                            if (B) {
                                anonymousClass5Td.m26915E();
                                if (A != null) {
                                    anonymousClass5Td.f64542B.P(A, anonymousClass5Td.f64550J);
                                }
                            } else {
                                anonymousClass5Td.m26912B(A);
                            }
                        }
                    }
                }
            }
            obj = null;
            this.f62101D = 0;
            if (obj != null) {
                if (this.f62119V) {
                    i = 1;
                } else {
                    i = 10 - this.f62135l.f64314F.size();
                }
                this.f62104G = i;
                anonymousClass5JZ = new AnonymousClass5JZ(this.f62104G);
                this.f62136m = anonymousClass5JZ;
                anonymousClass5JZ.f62140D = this.f62131h;
            }
            setMode(AnonymousClass5JV.RECORDING_VIDEO);
            if (anonymousClass5JY == AnonymousClass5JY.TIME_BASED) {
                this.f62115R = SystemClock.elapsedRealtime();
                this.f62100C.A(this.f62114Q);
            }
            if (this.f62107J != null) {
                if (obj != null) {
                }
                obj2 = null;
                anonymousClass5T9 = this.f62107J.f64111B.f7611Y.f7385Y;
                if (anonymousClass5T9.m26823B()) {
                    AnonymousClass5T9.m26819D(anonymousClass5T9);
                }
                anonymousClass5Td = anonymousClass5T9.f64317I;
                A = anonymousClass5T9.f64310B.A(anonymousClass5T9.f64318J, anonymousClass5T9.f64316H);
                B = anonymousClass5T9.m26823B();
                anonymousClass5Td.f64550J = UUID.randomUUID().toString();
                anonymousClass5Td.f64548H.setEnabled(false);
                if (B) {
                    anonymousClass5Td.m26915E();
                    if (A != null) {
                        anonymousClass5Td.f64542B.P(A, anonymousClass5Td.f64550J);
                    }
                } else {
                    anonymousClass5Td.m26912B(A);
                }
            }
        }
    }

    /* renamed from: C */
    private void m26231C(Canvas canvas) {
        if (this.f62136m != null) {
            float width = ((float) getWidth()) / 2.0f;
            float height = ((float) getHeight()) / 2.0f;
            float E = m26233E(this, this.f62108K);
            m26230B(this);
            AnonymousClass5JZ anonymousClass5JZ = this.f62136m;
            anonymousClass5JZ.f62142F.set(width - E, height - E, width + E, height + E);
            AnonymousClass2MN.B(AnonymousClass2MM.AspectFit, anonymousClass5JZ.f62141E, anonymousClass5JZ.f62142F, anonymousClass5JZ.f62143G);
            anonymousClass5JZ.invalidateSelf();
            AnonymousClass5JZ anonymousClass5JZ2 = this.f62136m;
            int i = this.f62101D;
            E = this.f62113P;
            anonymousClass5JZ2.f62138B = i;
            anonymousClass5JZ2.f62139C = E;
            anonymousClass5JZ2.invalidateSelf();
            this.f62136m.draw(canvas);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public final void m26242D() {
        /*
        r3 = this;
        r0 = r3.f62106I;
        r1 = X.AnonymousClass5JV.READY_TO_SHOOT;
        if (r0 != r1) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        m26237I(r3);
        r3.setMode(r1);
        r2 = r3.f62107J;
        if (r2 == 0) goto L_0x0006;
    L_0x0011:
        r0 = r2.f64111B;
        r0 = r0.f7598L;
        r3 = 0;
        r0.c(r3);
        r0 = r2.f64111B;
        r1 = r0.UB;
        r0 = new X.3Eh;
        r0.<init>();
        r1.C(r0);
        r0 = r2.f64111B;
        X.AnonymousClass0eB.I(r0);
        r0 = r2.f64111B;
        r0 = X.AnonymousClass0eB.J(r0);
        X.AnonymousClass0eB.L(r0);
        r1 = X.AnonymousClass4Ki.f52844C;
        r0 = r2.f64111B;
        r0 = X.AnonymousClass0eB.J(r0);
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 1;
        switch(r0) {
            case 1: goto L_0x00d3;
            case 2: goto L_0x0074;
            case 3: goto L_0x004c;
            case 4: goto L_0x0074;
            case 5: goto L_0x0074;
            case 6: goto L_0x0074;
            default: goto L_0x0045;
        };
    L_0x0045:
        r0 = r2.f64111B;
        X.AnonymousClass0eB.e(r0);
        goto L_0x00ee;
    L_0x004c:
        r0 = r2.f64111B;
        r0 = r0.f7608V;
        if (r0 != 0) goto L_0x00ee;
    L_0x0052:
        r0 = r2.f64111B;
        r0 = r0.f7602P;
        r0.setHandsFreeRecordingInProgress(r3);
        r0 = r2.f64111B;
        X.AnonymousClass0eB.R(r0);
        r0 = r2.f64111B;
        r0 = r0.f7626n;
        if (r0 == 0) goto L_0x0069;
    L_0x0064:
        r0 = r2.f64111B;
        X.AnonymousClass0eB.E(r0, r1);
    L_0x0069:
        r1 = r2.f64111B;
        r0 = 0;
        r1.f7635w = r0;
        r0 = r2.f64111B;
        X.AnonymousClass0eB.e(r0);
        goto L_0x00ee;
    L_0x0074:
        r0 = r2.f64111B;
        r0 = r0.f7602P;
        r0 = r0.f62103F;
        if (r0 == 0) goto L_0x0099;
    L_0x007c:
        r0 = r2.f64111B;
        r0 = r0.f7602P;
        r0.setHandsFreeRecordingInProgress(r3);
        r0 = r2.f64111B;
        X.AnonymousClass0eB.R(r0);
        r0 = r2.f64111B;
        r0 = r0.f7626n;
        if (r0 == 0) goto L_0x0093;
    L_0x008e:
        r0 = r2.f64111B;
        X.AnonymousClass0eB.E(r0, r1);
    L_0x0093:
        r1 = r2.f64111B;
        r0 = 0;
        r1.f7635w = r0;
        goto L_0x00a0;
    L_0x0099:
        r0 = r2.f64111B;
        r0 = r0.f7602P;
        r0.setHandsFreeModeEnabled(r1);
    L_0x00a0:
        r0 = r2.f64111B;
        r1 = X.AnonymousClass0eB.J(r0);
        r0 = X.AnonymousClass3DU.REVERSE;
        if (r1 != r0) goto L_0x0045;
    L_0x00aa:
        r0 = r2.f64111B;
        r2 = X.AnonymousClass0eB.M(r0);
        if (r2 == 0) goto L_0x00cb;
    L_0x00b2:
        monitor-enter(r2);
        r1 = r2.f53597D;	 Catch:{ all -> 0x00f0 }
        r0 = 0;
        r1.f(r0);	 Catch:{ all -> 0x00f0 }
        r0 = X.AnonymousClass4Ol.B();	 Catch:{ all -> 0x00f0 }
        if (r0 == 0) goto L_0x00c4;
    L_0x00bf:
        r0 = r2.f53597D;	 Catch:{ all -> 0x00f0 }
        r0.d();	 Catch:{ all -> 0x00f0 }
    L_0x00c4:
        r0 = r2.f53602I;	 Catch:{ all -> 0x00f0 }
        r0.m26269D();	 Catch:{ all -> 0x00f0 }
        monitor-exit(r2);
        goto L_0x00ee;
    L_0x00cb:
        r1 = new java.lang.IllegalStateException;
        r0 = "getReverseCaptureController() returns null when trying to finish reverse";
        r1.<init>(r0);
        throw r1;
    L_0x00d3:
        r0 = r2.f64111B;
        r0 = r0.f7602P;
        r0.setEnabled(r1);
        r0 = r2.f64111B;
        r0 = X.AnonymousClass0eB.H(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x00e2:
        r0.DVA();
        goto L_0x00ee;
    L_0x00e6:
        r1 = new java.lang.IllegalStateException;
        r0 = "getBoomerangCaptureController() returns null when trying to stop boomerang";
        r1.<init>(r0);
        throw r1;
    L_0x00ee:
        goto L_0x0006;
    L_0x00f0:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.shutterbutton.ShutterButton.D():void");
    }

    /* renamed from: D */
    private void m26232D(Canvas canvas) {
        float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
        float f = this.f62108K * min;
        min = (min - this.f62122Y) * this.f62124a;
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        canvas.drawCircle(width, height, 1.09f * f, this.f62118U);
        if (f != min) {
            this.f62130g.setStrokeWidth(f - min);
            canvas.drawCircle(width, height, f - (this.f62130g.getStrokeWidth() / 2.0f), this.f62130g);
        }
        canvas.drawCircle(width, height, min, this.f62123Z);
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        invalidate();
    }

    /* renamed from: E */
    private static float m26233E(ShutterButton shutterButton, float f) {
        return (((float) Math.min(shutterButton.getWidth(), shutterButton.getHeight())) / 2.0f) * f;
    }

    /* renamed from: E */
    public final void m26243E() {
        setMode(AnonymousClass5JV.READY_TO_SHOOT);
        this.f62134k.N(1.0d);
    }

    /* renamed from: F */
    private void m26234F(int i) {
        AnonymousClass0OR.G(getHandler(), this.f62126c, -1658851648);
        setPressedAlpha(false);
        if (i != 3) {
            AnonymousClass5JX anonymousClass5JX = this.f62111N;
            AnonymousClass5JX anonymousClass5JX2 = AnonymousClass5JX.CAPTURE_SINGLE_TAP;
            if (!(anonymousClass5JX == anonymousClass5JX2 && this.f62103F)) {
                if (this.f62111N == anonymousClass5JX2 && this.f62106I == AnonymousClass5JV.READY_TO_SHOOT && this.f62134k.G()) {
                    m26238J();
                    return;
                } else if (this.f62111N != AnonymousClass5JX.CAPTURE_LONG_PRESS) {
                    return;
                } else {
                    if (this.f62106I != AnonymousClass5JV.RECORDING_VIDEO && this.f62106I != AnonymousClass5JV.RECORD_VIDEO_REQUESTED) {
                        return;
                    }
                    if (this.f62102E) {
                        this.f62103F = true;
                        return;
                    }
                }
            }
            m26242D();
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        this.f62108K = (float) anonymousClass0cN.E();
        if (anonymousClass0cN.f7106D > anonymousClass0cN.f7112J) {
            this.f62124a = (float) AnonymousClass0dh.C((double) this.f62108K, 1.0d, 1.524999976158142d, 1.0d, 0.8726999759674072d);
        } else {
            this.f62124a = (float) AnonymousClass0dh.C((double) this.f62108K, 1.524999976158142d, 1.0d, 0.8726999759674072d, 1.0d);
        }
        invalidate();
        if (this.f62107J != null) {
            this.f62107J.f64111B.FB.f54379T.setTranslationY(-m26233E(this, this.f62108K - 1.0f));
        }
    }

    /* renamed from: G */
    private static boolean m26235G(ShutterButton shutterButton) {
        shutterButton = shutterButton.f62116S;
        if (shutterButton != null) {
            Object obj = (shutterButton.f64107B.f7596J == null || !shutterButton.f64107B.f7596J.gX()) ? null : 1;
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    private void m26236H(MotionEvent motionEvent) {
        if (m26235G(this)) {
            if (this.f62128e != null) {
                float floatValue = this.f62125b.floatValue() - motionEvent.getY();
                float scaledTouchSlop = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
                if (floatValue >= scaledTouchSlop) {
                    float max = Math.max(Math.min((floatValue - scaledTouchSlop) / getZoomDragAvailableHeight(), 1.0f), 0.0f);
                    this.f62128e.m26773A((max * max) * (3.0f - (max * 2.0f)));
                }
            }
        }
    }

    /* renamed from: I */
    private static void m26237I(ShutterButton shutterButton) {
        shutterButton.f62101D = 0;
        shutterButton.f62103F = false;
        shutterButton.f62100C.B(shutterButton.f62114Q);
        shutterButton.setVideoRecordingProgress(0.0f);
        shutterButton.f62134k.N(1.0d);
    }

    /* renamed from: J */
    private void m26238J() {
        if (m26235G(this)) {
            AnonymousClass5JW anonymousClass5JW = this.f62127d;
            if (anonymousClass5JW != null) {
                anonymousClass5JW.QAA();
            }
            return;
        }
        m26243E();
    }

    public int getOuterCircleColour() {
        return this.f62130g.getColor();
    }

    public float getZoomDragAvailableHeight() {
        if (this.f62137n == 0.0f) {
            this.f62137n = Math.min(((float) getRootView().getHeight()) * 0.7f, AnonymousClass0Nm.C(getContext(), 200));
        }
        return this.f62137n;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -887745157);
        super.onAttachedToWindow();
        this.f62134k.A(this);
        AnonymousClass0cQ.O(this, -370876623, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 588741068);
        super.onDetachedFromWindow();
        this.f62134k.J(this);
        AnonymousClass0cQ.O(this, 630395457, N);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        switch (this.f62106I.ordinal()) {
            case 0:
            case 1:
                m26232D(canvas);
                return;
            case 2:
                m26232D(canvas);
                if (this.f62136m != null) {
                    m26231C(canvas);
                    return;
                }
                float f = this.f62113P * 360.0f;
                float width = ((float) getWidth()) / 2.0f;
                float height = ((float) getHeight()) / 2.0f;
                float min = ((((float) Math.min(getWidth(), getHeight())) / 2.0f) * this.f62108K) - (this.f62110M / 2.0f);
                this.f62099B.set(width - min, height - min, width + min, height + min);
                m26230B(this);
                canvas2.drawArc(this.f62099B, 270.0f, f, false, this.f62109L);
                return;
            default:
                throw new RuntimeException("Encountered a mode without drawing instructions");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
        r6 = this;
        r3 = r6;
        r4 = r7;
        r5 = r8;
        r6 = r9;
        r7 = r10;
        r8 = r11;
        super.onLayout(r4, r5, r6, r7, r8);
        r0 = 5;
        r10 = new float[r0];
        r10 = {0, 1049247089, 1057132380, 1061158912, 1065353216};
        r9 = new int[r0];
        r2 = r3.getContext();
        r1 = r3.f62133j;
        r0 = 0;
        X.AnonymousClass16T.C(r2, r0, r1, r9);
        r4 = new android.graphics.LinearGradient;
        r0 = r3.getWidth();
        r7 = (float) r0;
        r0 = r3.getHeight();
        r8 = (float) r0;
        r11 = android.graphics.Shader.TileMode.CLAMP;
        r5 = 0;
        r6 = 0;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11);
        r3.f62131h = r4;
        r1 = r3.f62109L;
        r0 = r3.f62131h;
        r1.setShader(r0);
        r1 = r3.f62136m;
        if (r1 == 0) goto L_0x003f;
    L_0x003b:
        r0 = r3.f62131h;
        r1.f62140D = r0;
    L_0x003f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.shutterbutton.ShutterButton.onLayout(boolean, int, int, int, int):void");
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 1478185920);
        this.f62118U.setShader(new RadialGradient((float) (getWidth() / 2), (float) (getHeight() / 2), (this.f62108K * (((float) Math.min(getWidth(), getHeight())) / 2.0f)) * 1.09f, this.f62117T, 0, TileMode.CLAMP));
        AnonymousClass0cQ.O(this, -472642741, N);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -1078915541);
        if (isEnabled()) {
            int actionMasked = motionEvent.getActionMasked();
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            switch (actionMasked) {
                case 0:
                case 5:
                    int i = this.f62120W;
                    if (i == -1) {
                        this.f62120W = pointerId;
                        setPressedAlpha(true);
                        AnonymousClass0OR.F(getHandler(), this.f62126c, 350, -723656656);
                        if (this.f62106I == AnonymousClass5JV.READY_TO_SHOOT || this.f62103F) {
                            this.f62111N = AnonymousClass5JX.CAPTURE_SINGLE_TAP;
                        }
                        AnonymousClass0cQ.L(this, 674943181, M);
                        return true;
                    } else if (i == pointerId) {
                        AnonymousClass0Dc.R("ShutterButton", "The touch sequence shall not happen. Current pointer id: %s. Incoming: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(pointerId)});
                        AnonymousClass0cQ.L(this, 783744075, M);
                        return false;
                    } else {
                        AnonymousClass0cQ.L(this, -504961167, M);
                        return false;
                    }
                case 1:
                case 3:
                case 6:
                    if (pointerId == this.f62120W) {
                        m26234F(actionMasked);
                    }
                    if (actionMasked != 6) {
                        this.f62120W = -1;
                    }
                    AnonymousClass0cQ.L(this, -2035315795, M);
                    return true;
                case 2:
                    if (pointerId == this.f62120W) {
                        if (this.f62125b == null) {
                            this.f62125b = Float.valueOf(motionEvent.getY());
                        }
                        if (this.f62106I == AnonymousClass5JV.RECORDING_VIDEO) {
                            m26236H(motionEvent);
                        }
                        AnonymousClass0cQ.L(this, -187779123, M);
                        return true;
                    }
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
        AnonymousClass0cQ.L(this, 1899065004, M);
        return false;
    }

    public void setCameraInitialisedDelegate(AnonymousClass5Sg anonymousClass5Sg) {
        this.f62116S = anonymousClass5Sg;
    }

    public void setContinuousVideoCaptureEnabled(boolean z) {
        this.f62119V = z;
    }

    public void setHandsFreeModeEnabled(boolean z) {
        this.f62102E = z;
    }

    public void setHandsFreeRecordingInProgress(boolean z) {
        boolean z2 = this.f62102E && z;
        this.f62103F = z2;
    }

    public void setMaxVideoDurationMS(long j) {
        this.f62105H = j;
    }

    private void setMode(AnonymousClass5JV anonymousClass5JV) {
        if (!this.f62106I.equals(anonymousClass5JV)) {
            this.f62106I = anonymousClass5JV;
            invalidate();
        }
    }

    public void setOnRecordVideoListener(AnonymousClass5Sk anonymousClass5Sk) {
        this.f62107J = anonymousClass5Sk;
    }

    public void setOnSingleTapCaptureListener(AnonymousClass5JW anonymousClass5JW) {
        this.f62127d = anonymousClass5JW;
    }

    public void setOnZoomVideoListener(AnonymousClass5Si anonymousClass5Si) {
        this.f62128e = anonymousClass5Si;
    }

    private void setPressedAlpha(boolean z) {
        if (z) {
            this.f62123Z.setAlpha((int) (((float) Color.alpha(this.f62121X)) * 0.6f));
            this.f62130g.setAlpha((int) (((float) Color.alpha(this.f62129f)) * 0.6f));
        } else {
            this.f62123Z.setColor(this.f62121X);
            this.f62130g.setColor(this.f62129f);
        }
        invalidate();
    }

    public void setVideoCaptureDelegate(AnonymousClass5T9 anonymousClass5T9) {
        this.f62135l = anonymousClass5T9;
    }

    public void setVideoRecordingEnabled(boolean z) {
        this.f62112O = z;
    }

    public void setVideoRecordingProgress(float f) {
        this.f62113P = AnonymousClass0nB.B(f, 0.0f, 1.0f);
        invalidate();
        AnonymousClass5Sk anonymousClass5Sk = this.f62107J;
        if (anonymousClass5Sk != null) {
            anonymousClass5Sk.f64111B.f7611Y.f7385Y.f64317I.m26914D(this.f62113P);
        }
    }
}
