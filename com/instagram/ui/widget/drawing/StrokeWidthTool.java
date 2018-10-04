package com.instagram.ui.widget.drawing;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass0dh;
import X.AnonymousClass0e6;
import X.AnonymousClass0e7;
import X.AnonymousClass0eS;
import X.AnonymousClass14I;
import X.AnonymousClass26h;
import X.AnonymousClass2Km;
import X.AnonymousClass2Kn;
import X.AnonymousClass2Ko;
import X.AnonymousClass2Kp;
import X.AnonymousClass2Kq;
import X.AnonymousClass2Kr;
import X.AnonymousClass2Ks;
import X.AnonymousClass2Kt;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;

public class StrokeWidthTool extends View {
    private static final int[] DB = new int[2];
    private final float AB;
    /* renamed from: B */
    public long f29128B;
    private final AnonymousClass14I BB;
    /* renamed from: C */
    public boolean f29129C;
    private final int CB;
    /* renamed from: D */
    public float f29130D;
    /* renamed from: E */
    public float f29131E;
    /* renamed from: F */
    public float f29132F;
    /* renamed from: G */
    public Drawable f29133G;
    /* renamed from: H */
    public float f29134H;
    /* renamed from: I */
    public Drawable f29135I;
    /* renamed from: J */
    public boolean f29136J;
    /* renamed from: K */
    public boolean f29137K;
    /* renamed from: L */
    public boolean f29138L;
    /* renamed from: M */
    public boolean f29139M;
    /* renamed from: N */
    public float f29140N;
    /* renamed from: O */
    public float f29141O;
    /* renamed from: P */
    public AnonymousClass2Kr f29142P;
    /* renamed from: Q */
    public AnonymousClass2Ks f29143Q;
    /* renamed from: R */
    public AnonymousClass0cN f29144R;
    /* renamed from: S */
    public final Paint f29145S;
    /* renamed from: T */
    public long f29146T;
    /* renamed from: U */
    public float f29147U;
    /* renamed from: V */
    public final ArrayList f29148V;
    /* renamed from: W */
    public float f29149W;
    /* renamed from: X */
    public float f29150X;
    /* renamed from: Y */
    public float f29151Y;
    /* renamed from: Z */
    public final Paint f29152Z;
    /* renamed from: a */
    public final float f29153a;
    /* renamed from: b */
    public float f29154b;
    /* renamed from: c */
    public float f29155c;
    /* renamed from: d */
    public final Paint f29156d;
    /* renamed from: e */
    public final Path f29157e;
    /* renamed from: f */
    public final ArrayList f29158f;
    /* renamed from: g */
    public float f29159g;
    /* renamed from: h */
    public AnonymousClass0cN f29160h;
    /* renamed from: i */
    public final float f29161i;
    /* renamed from: j */
    public float f29162j;
    /* renamed from: k */
    public AnonymousClass2Kt f29163k;
    /* renamed from: l */
    public final ArrayList f29164l;
    /* renamed from: m */
    public final float f29165m;
    /* renamed from: n */
    private final float f29166n;
    /* renamed from: o */
    private final Paint f29167o;
    /* renamed from: p */
    private final Paint f29168p;
    /* renamed from: q */
    private final Paint f29169q;
    /* renamed from: r */
    private final float f29170r;
    /* renamed from: s */
    private final float f29171s;
    /* renamed from: t */
    private final GestureDetector f29172t;
    /* renamed from: u */
    private float f29173u;
    /* renamed from: v */
    private boolean f29174v;
    /* renamed from: w */
    private final float f29175w;
    /* renamed from: x */
    private final AnonymousClass14I f29176x;
    /* renamed from: y */
    private final float f29177y;
    /* renamed from: z */
    private float f29178z;

    public StrokeWidthTool(Context context) {
        this(context, null);
    }

    public StrokeWidthTool(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StrokeWidthTool(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        Throwable th;
        super(context, attributeSet, i);
        this.f29157e = new Path();
        this.f29158f = new ArrayList();
        this.f29148V = new ArrayList();
        this.f29164l = new ArrayList();
        this.f29142P = AnonymousClass2Kr.COLLAPSED;
        this.f29163k = AnonymousClass2Kt.PARTIAL;
        int i2 = 0;
        this.f29174v = false;
        this.f29138L = true;
        this.f29129C = false;
        this.f29176x = new AnonymousClass2Kn(this);
        this.BB = new AnonymousClass2Ko(this);
        try {
            obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.StrokeWidthTool);
            try {
                this.f29177y = Math.max(0.0f, Math.min(obtainStyledAttributes.getFloat(8, -1.0f), 1.0f));
                this.f29149W = obtainStyledAttributes.getDimension(5, 5.0f);
                this.f29141O = obtainStyledAttributes.getDimension(7, 2.0f);
                this.f29140N = obtainStyledAttributes.getDimension(6, 100.0f);
                this.f29161i = obtainStyledAttributes.getDimension(14, 10.0f);
                this.f29165m = obtainStyledAttributes.getDimension(15, 60.0f);
                this.f29153a = obtainStyledAttributes.getDimension(11, 60.0f) / 2.0f;
                this.f29170r = obtainStyledAttributes.getDimension(1, 3.0f);
                int color = obtainStyledAttributes.getColor(13, -1);
                int color2 = obtainStyledAttributes.getColor(10, -1);
                this.AB = obtainStyledAttributes.getDimension(12, 0.0f);
                setCollapsedIcon(obtainStyledAttributes.getDrawable(2));
                this.f29135I = obtainStyledAttributes.getDrawable(3);
                this.f29173u = obtainStyledAttributes.getDimension(4, 0.0f);
                float dimension = obtainStyledAttributes.getDimension(9, 0.0f);
                this.f29166n = obtainStyledAttributes.getDimension(0, 0.0f);
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                this.f29171s = getResources().getDisplayMetrics().density;
                int i3 = (int) (((float) getResources().getDisplayMetrics().widthPixels) * this.f29177y);
                this.CB = i3;
                this.f29175w = (float) ((-(i3 / 2)) + getPaddingLeft());
                Paint paint = new Paint(1);
                this.f29169q = paint;
                paint.setColor(-1);
                this.f29169q.setStyle(Style.STROKE);
                this.f29169q.setStrokeWidth(this.f29170r);
                paint = new Paint(1);
                this.f29168p = paint;
                Style style = Style.FILL;
                paint.setStyle(style);
                paint = new Paint(1);
                this.f29167o = paint;
                paint.setStyle(style);
                this.f29167o.setColor(-1);
                paint = new Paint(1);
                this.f29156d = paint;
                paint.setStyle(style);
                this.f29156d.setColor(color);
                Paint paint2 = new Paint(1);
                this.f29145S = paint2;
                paint2.setStyle(style);
                this.f29145S.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.black_25_transparent));
                this.f29145S.setMaskFilter(new BlurMaskFilter(dimension, Blur.OUTER));
                paint2 = new Paint(1);
                this.f29152Z = paint2;
                paint2.setStyle(Style.FILL);
                this.f29152Z.setColor(color2);
                setLayerType(1, null);
                AnonymousClass0e7 B = AnonymousClass0e6.B();
                AnonymousClass0cN C = B.C();
                C.f7108F = true;
                this.f29144R = C.A(this.f29176x);
                C = B.C();
                C.f7108F = true;
                this.f29160h = C.A(this.BB);
                this.f29172t = new GestureDetector(context, new AnonymousClass2Kq(this));
                while (i2 < 4) {
                    this.f29148V.add(new PointF());
                    this.f29164l.add(new PointF());
                    this.f29158f.add(new PointF());
                    i2++;
                }
            } catch (Throwable th2) {
                th = th2;
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            obtainStyledAttributes = null;
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
            throw th;
        }
    }

    /* renamed from: A */
    public final void m15117A() {
        this.f29163k = AnonymousClass2Kt.FULL;
        this.f29129C = false;
        this.f29160h.L(1.0d);
        this.f29134H = 0.0f;
        invalidate();
        m15114G(JsonMappingException.MAX_REFS_TO_LIST);
    }

    /* renamed from: B */
    public static void m15109B(StrokeWidthTool strokeWidthTool) {
        if (strokeWidthTool.f29174v) {
            float f = strokeWidthTool.f29155c;
            float f2 = f - strokeWidthTool.f29159g;
            float f3 = strokeWidthTool.f29140N;
            float f4 = strokeWidthTool.f29141O;
            strokeWidthTool.f29154b = f - ((f2 / (f3 - f4)) * (strokeWidthTool.f29149W - f4));
            strokeWidthTool.invalidate();
        }
    }

    /* renamed from: B */
    public final boolean m15118B(float f, float f2) {
        float buttonRadius = getButtonRadius();
        if (f >= 0.0f && f <= ((float) getWidth())) {
            float f3 = this.f29132F;
            if (f2 >= f3 - buttonRadius && f2 <= f3 + buttonRadius) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public static void m15110C(StrokeWidthTool strokeWidthTool, float f) {
        int size = strokeWidthTool.f29148V.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) strokeWidthTool.f29148V.get(i);
            PointF pointF2 = (PointF) strokeWidthTool.f29164l.get(i);
            ((PointF) strokeWidthTool.f29158f.get(i)).set(AnonymousClass2Km.m15108C(f, pointF.x, pointF2.x), AnonymousClass2Km.m15108C(f, pointF.y, pointF2.y));
        }
    }

    /* renamed from: D */
    public static void m15111D(StrokeWidthTool strokeWidthTool) {
        if (strokeWidthTool.f29143Q != null) {
            strokeWidthTool.getLocationInWindow(DB);
            AnonymousClass2Ks anonymousClass2Ks = strokeWidthTool.f29143Q;
            int[] iArr = DB;
            anonymousClass2Ks.QDA(((float) iArr[0]) + strokeWidthTool.f29162j, ((float) iArr[1]) + strokeWidthTool.f29154b);
        }
    }

    /* renamed from: E */
    public static void m15112E(StrokeWidthTool strokeWidthTool, float f) {
        strokeWidthTool.f29154b = Math.min(strokeWidthTool.f29155c, Math.max(strokeWidthTool.f29159g, f));
        float f2 = strokeWidthTool.f29149W;
        float f3 = strokeWidthTool.f29155c;
        float f4 = f3 - strokeWidthTool.f29159g;
        float f5 = strokeWidthTool.f29140N;
        float f6 = strokeWidthTool.f29141O;
        strokeWidthTool.f29149W = f6 + (((f5 - f6) / f4) * (f3 - strokeWidthTool.f29154b));
        f6 = strokeWidthTool.f29149W;
        if (f6 != f2) {
            AnonymousClass2Ks anonymousClass2Ks = strokeWidthTool.f29143Q;
            if (anonymousClass2Ks != null) {
                anonymousClass2Ks.WFA(f2, f6);
            }
            m15111D(strokeWidthTool);
            strokeWidthTool.invalidate();
        }
    }

    /* renamed from: F */
    public static void m15113F(StrokeWidthTool strokeWidthTool) {
        float E = (float) strokeWidthTool.f29144R.E();
        float C = AnonymousClass2Km.m15108C(E, strokeWidthTool.f29132F, strokeWidthTool.f29159g);
        float C2 = AnonymousClass2Km.m15108C(E, strokeWidthTool.f29132F, strokeWidthTool.f29155c);
        ((PointF) strokeWidthTool.f29148V.get(0)).set(strokeWidthTool.f29162j - (strokeWidthTool.f29161i / 2.0f), C2);
        ((PointF) strokeWidthTool.f29148V.get(1)).set(strokeWidthTool.f29162j - (strokeWidthTool.f29161i / 2.0f), C);
        ((PointF) strokeWidthTool.f29148V.get(2)).set(strokeWidthTool.f29162j + (strokeWidthTool.f29161i / 2.0f), C);
        ((PointF) strokeWidthTool.f29148V.get(3)).set(strokeWidthTool.f29162j + (strokeWidthTool.f29161i / 2.0f), C2);
        ((PointF) strokeWidthTool.f29164l.get(0)).set(strokeWidthTool.f29162j, C2);
        ((PointF) strokeWidthTool.f29164l.get(1)).set(strokeWidthTool.f29162j - (strokeWidthTool.f29165m / 2.0f), C);
        ((PointF) strokeWidthTool.f29164l.get(2)).set(strokeWidthTool.f29162j + (strokeWidthTool.f29165m / 2.0f), C);
        ((PointF) strokeWidthTool.f29164l.get(3)).set(strokeWidthTool.f29162j, C2);
        strokeWidthTool.f29151Y = AnonymousClass2Km.m15108C(E, strokeWidthTool.f29132F - strokeWidthTool.f29154b, 0.0f);
    }

    /* renamed from: G */
    private void m15114G(int i) {
        this.f29163k = AnonymousClass2Kt.PARTIAL;
        this.f29129C = false;
        long j = (long) i;
        this.f29128B = j;
        this.f29150X = this.f29175w;
        this.f29147U = this.f29134H;
        this.f29146T = System.currentTimeMillis();
        postDelayed(new AnonymousClass2Kp(this), j);
    }

    /* renamed from: H */
    private void m15115H(Canvas canvas) {
        float buttonRadius = getButtonRadius() * this.f29131E;
        canvas.drawCircle(this.f29162j, this.f29132F, buttonRadius, this.f29145S);
        if (Color.alpha(this.f29168p.getColor()) < 255) {
            canvas.drawCircle(this.f29162j, this.f29132F, buttonRadius - (this.f29170r / 2.0f), this.f29167o);
        }
        canvas.drawCircle(this.f29162j, this.f29132F, buttonRadius - (this.f29170r / 2.0f), this.f29168p);
        canvas.drawCircle(this.f29162j, this.f29132F, buttonRadius - (this.f29170r / 2.0f), this.f29169q);
        float E = (float) this.f29144R.E();
        if (this.f29133G != null) {
            canvas.save();
            canvas.rotate(-45.0f * E, this.f29162j, this.f29132F);
            this.f29133G.setAlpha((int) ((1.0f - E) * 255.0f));
            this.f29133G.draw(canvas);
            canvas.restore();
        }
        Drawable drawable = this.f29135I;
        if (drawable != null) {
            drawable.setAlpha((int) (255.0f * E));
            canvas.save();
            canvas.rotate((1.0f - E) * 45.0f, this.f29162j, this.f29132F);
            this.f29135I.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: I */
    private void m15116I(Drawable drawable, float f) {
        f *= 2.0f;
        float min = Math.min(((float) Math.sqrt((double) ((f * f) / 2.0f))) - this.f29173u, ((float) drawable.getIntrinsicWidth()) / 2.0f);
        float f2 = this.f29162j;
        int i = (int) (f2 - min);
        float f3 = this.f29132F;
        drawable.setBounds(i, (int) (f3 - min), (int) (f2 + min), (int) (f3 + min));
    }

    private float getButtonRadius() {
        return (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) / 2.0f) + (this.f29170r / 2.0f);
    }

    public float getCurrentRatio() {
        return (float) AnonymousClass0dh.C((double) this.f29149W, (double) this.f29141O, (double) this.f29140N, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d);
    }

    public float getStrokeWidthDp() {
        return this.f29149W;
    }

    public float getStrokeWidthPx() {
        return this.f29149W * this.f29171s;
    }

    public final void onDraw(Canvas canvas) {
        if (this.f29138L) {
            setTranslationX(0.0f);
        } else {
            if (this.f29129C) {
                float max = Math.max(0.0f, Math.min((((float) (System.currentTimeMillis() - this.f29146T)) - ((float) this.f29128B)) / 300.0f, 1.0f));
                this.f29160h.L(this.f29163k == AnonymousClass2Kt.FULL ? (double) max : (double) (1.0f - max));
                if (max <= 0.0f || max >= 1.0f) {
                    this.f29129C = false;
                } else {
                    invalidate();
                }
                this.f29134H = (float) AnonymousClass0dh.C((double) max, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f29147U, (double) this.f29150X);
            }
            setTranslationX(this.f29134H);
        }
        if (this.f29142P == AnonymousClass2Kr.EXPANDED || !this.f29144R.G()) {
            this.f29157e.rewind();
            PointF pointF = (PointF) this.f29158f.get(0);
            this.f29157e.moveTo(pointF.x, pointF.y);
            int size = this.f29158f.size();
            for (int i = 1; i < size; i++) {
                pointF = (PointF) this.f29158f.get(i);
                this.f29157e.lineTo(pointF.x, pointF.y);
            }
            this.f29157e.close();
            this.f29157e.setFillType(FillType.WINDING);
            canvas.drawPath(this.f29157e, this.f29145S);
            canvas.drawPath(this.f29157e, this.f29156d);
            canvas.drawCircle(this.f29162j, this.f29154b + this.f29151Y, this.f29153a, this.f29145S);
            canvas.drawCircle(this.f29162j, this.f29154b + this.f29151Y, this.f29153a, this.f29152Z);
        }
        if (this.f29138L) {
            m15115H(canvas);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f29174v = true;
        float width = (float) ((getWidth() - getPaddingLeft()) - getPaddingRight());
        this.f29130D = (width - this.f29166n) / width;
        this.f29131E = this.f29130D;
        this.f29162j = ((float) getWidth()) / 2.0f;
        this.f29132F = (((float) getHeight()) - this.f29162j) - ((float) getPaddingBottom());
        this.f29159g = this.f29153a + ((float) getPaddingTop());
        this.f29155c = ((((float) (getHeight() - getWidth())) - this.f29153a) - this.AB) - ((float) getPaddingBottom());
        m15113F(this);
        if (this.f29138L) {
            m15110C(this, 0.0f);
        }
        m15109B(this);
        Drawable drawable = this.f29133G;
        if (drawable != null) {
            m15116I(drawable, getButtonRadius() * this.f29130D);
            this.f29133G.setAlpha(255);
        }
        Drawable drawable2 = this.f29135I;
        if (drawable2 != null) {
            m15116I(drawable2, getButtonRadius());
            this.f29135I.setAlpha(0);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(this.CB, 1073741824), i2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int M = AnonymousClass0cQ.M(this, -1257615662);
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 3) {
                if (action == 0) {
                    this.f29178z = motionEvent.getY();
                    if (!this.f29138L) {
                        this.f29163k = AnonymousClass2Kt.FULL;
                        this.f29129C = true;
                        this.f29128B = 0;
                        this.f29150X = 0.0f;
                        this.f29147U = this.f29134H;
                        this.f29146T = System.currentTimeMillis();
                        invalidate();
                    }
                } else if (action == 2 && (this.f29139M || this.f29136J)) {
                    float y = motionEvent.getY();
                    float f = this.f29178z - y;
                    this.f29178z = y;
                    m15112E(this, this.f29154b - f);
                    invalidate();
                }
                onTouchEvent = this.f29172t.onTouchEvent(motionEvent);
                AnonymousClass0cQ.L(this, 1305702311, M);
                return onTouchEvent;
            }
        }
        if (!this.f29138L) {
            m15114G(0);
        }
        this.f29160h.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        this.f29137K = false;
        this.f29139M = false;
        if (this.f29138L && this.f29136J) {
            setMode(this, AnonymousClass2Kr.COLLAPSED);
            this.f29136J = false;
        }
        AnonymousClass2Ks anonymousClass2Ks = this.f29143Q;
        if (anonymousClass2Ks != null) {
            anonymousClass2Ks.PDA();
        }
        onTouchEvent = this.f29172t.onTouchEvent(motionEvent);
        AnonymousClass0cQ.L(this, 1305702311, M);
        return onTouchEvent;
    }

    public void setCollapsedIcon(Drawable drawable) {
        this.f29133G = drawable;
        invalidate();
    }

    public void setColour(int i) {
        ColorFilter B = AnonymousClass0ca.B(AnonymousClass26h.m14460C(i));
        Drawable drawable = this.f29133G;
        if (drawable != null) {
            drawable.setColorFilter(B);
        }
        drawable = this.f29135I;
        if (drawable != null) {
            drawable.setColorFilter(B);
        }
        this.f29168p.setColor(i);
        invalidate();
    }

    public void setCurrentRatio(float f) {
        this.f29149W = (float) AnonymousClass0dh.C((double) f, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f29141O, (double) this.f29140N);
        m15109B(this);
    }

    public static void setMode(StrokeWidthTool strokeWidthTool, AnonymousClass2Kr anonymousClass2Kr) {
        if (strokeWidthTool.f29142P != anonymousClass2Kr) {
            strokeWidthTool.f29142P = anonymousClass2Kr;
            if (anonymousClass2Kr == AnonymousClass2Kr.COLLAPSED) {
                strokeWidthTool.f29144R.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            } else {
                strokeWidthTool.f29144R.N(1.0d);
            }
            strokeWidthTool.invalidate();
        }
    }

    public void setOnValueChangedListener(AnonymousClass2Ks anonymousClass2Ks) {
        this.f29143Q = anonymousClass2Ks;
    }

    public void setStrokeWidthButtonShowing(boolean z) {
        this.f29138L = z;
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.gravity = z ? 8388691 : 8388627;
        setLayoutParams(layoutParams);
        if (this.f29138L) {
            setMode(this, AnonymousClass2Kr.COLLAPSED);
        } else {
            setMode(this, AnonymousClass2Kr.EXPANDED);
        }
    }

    public void setStrokeWidthDp(float f) {
        this.f29149W = f;
        m15109B(this);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (!this.f29138L) {
            return;
        }
        if (i == 4 || i == 8) {
            setMode(this, AnonymousClass2Kr.COLLAPSED);
        }
    }
}
