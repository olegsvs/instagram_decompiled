package com.instagram.common.ui.widget.touchimageview;

import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dh;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0e7;
import X.AnonymousClass1wk;
import X.AnonymousClass4GF;
import X.AnonymousClass4GG;
import X.AnonymousClass4GH;
import X.AnonymousClass5SG;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import com.facebook.common.dextricks.StartupQEsConfig;

public class TouchImageView extends View implements OnGestureListener, AnonymousClass1wk, OnScaleGestureListener {
    /* renamed from: e */
    private static final AnonymousClass0e5 f52120e = AnonymousClass0e5.C(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.5d);
    /* renamed from: f */
    private static final AnonymousClass0e5 f52121f = AnonymousClass0e5.C(30.0d, 8.0d);
    /* renamed from: B */
    public final RectF f52122B;
    /* renamed from: C */
    private boolean f52123C;
    /* renamed from: D */
    private Bitmap f52124D;
    /* renamed from: E */
    private final Rect f52125E;
    /* renamed from: F */
    private AnonymousClass4GF f52126F;
    /* renamed from: G */
    private AnonymousClass4GG f52127G;
    /* renamed from: H */
    private boolean f52128H;
    /* renamed from: I */
    private boolean f52129I;
    /* renamed from: J */
    private boolean f52130J;
    /* renamed from: K */
    private float f52131K;
    /* renamed from: L */
    private float f52132L;
    /* renamed from: M */
    private boolean f52133M;
    /* renamed from: N */
    private final GestureDetector f52134N;
    /* renamed from: O */
    private boolean f52135O;
    /* renamed from: P */
    private final Paint f52136P;
    /* renamed from: Q */
    private final PointF f52137Q;
    /* renamed from: R */
    private final PointF f52138R;
    /* renamed from: S */
    private final RectF f52139S;
    /* renamed from: T */
    private final RectF f52140T;
    /* renamed from: U */
    private final ScaleGestureDetector f52141U;
    /* renamed from: V */
    private final AnonymousClass0cN f52142V;
    /* renamed from: W */
    private boolean f52143W;
    /* renamed from: X */
    private final RectF f52144X;
    /* renamed from: Y */
    private boolean f52145Y;
    /* renamed from: Z */
    private boolean f52146Z;
    /* renamed from: a */
    private float f52147a;
    /* renamed from: b */
    private float f52148b;
    /* renamed from: c */
    private final AnonymousClass0cN f52149c;
    /* renamed from: d */
    private final AnonymousClass0cN f52150d;

    public final void Oe(AnonymousClass0e7 anonymousClass0e7) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public TouchImageView(Context context) {
        this(context, null);
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52134N = new GestureDetector(context, this);
        this.f52141U = new ScaleGestureDetector(context, this);
        this.f52136P = new Paint(2);
        this.f52144X = new RectF();
        this.f52140T = new RectF();
        this.f52139S = new RectF();
        this.f52125E = new Rect();
        this.f52122B = new RectF();
        this.f52137Q = new PointF();
        this.f52138R = new PointF();
        this.f52126F = new AnonymousClass4GF();
        AnonymousClass0e7 B = AnonymousClass0e6.B();
        B.B(this);
        AnonymousClass0cN C = B.C();
        AnonymousClass0e5 anonymousClass0e5 = f52120e;
        AnonymousClass0cN O = C.O(anonymousClass0e5);
        O.f7110H = 0.5d;
        O.f7105C = 0.5d;
        this.f52149c = O;
        O = B.C();
        O.f7110H = 0.5d;
        O.f7105C = 0.5d;
        this.f52150d = O.O(anonymousClass0e5);
        O = B.C().O(f52121f);
        O.f7110H = 0.01d;
        O.f7105C = 0.01d;
        this.f52142V = O;
        setBoundsDelegate(new AnonymousClass5SG());
    }

    /* renamed from: A */
    public final boolean m23700A(boolean z) {
        this.f52144X.set(this.f52122B);
        RectF yI = this.f52127G.yI(this);
        boolean z2 = false;
        if (this.f52144X.contains(yI)) {
            return false;
        }
        Object obj;
        Object obj2;
        if (Math.round(this.f52144X.height()) >= Math.round(yI.height())) {
            if (Math.round(this.f52144X.width()) >= Math.round(yI.width())) {
                obj = null;
                if (Math.round(this.f52144X.left) <= Math.round(yI.left)) {
                    this.f52144X.offset(yI.left - this.f52144X.left, 0.0f);
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (Math.round(this.f52144X.right) < Math.round(yI.right)) {
                    this.f52144X.offset(yI.right - this.f52144X.right, 0.0f);
                    obj2 = 1;
                }
                if (Math.round(this.f52144X.top) > Math.round(yI.top)) {
                    this.f52144X.offset(0.0f, yI.top - this.f52144X.top);
                    z2 = true;
                }
                if (Math.round(this.f52144X.bottom) < Math.round(yI.bottom)) {
                    this.f52144X.offset(0.0f, yI.bottom - this.f52144X.bottom);
                    z2 = true;
                }
                if (!z) {
                    this.f52122B.set(this.f52144X);
                } else if (!this.f52123C) {
                    if (obj == null) {
                        this.f52123C = true;
                        this.f52149c.K();
                        this.f52150d.K();
                        this.f52142V.K().L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED).N(1.0d);
                        this.f52140T.set(this.f52122B);
                        this.f52139S.set(this.f52144X);
                    } else {
                        if (obj2 != null) {
                            this.f52149c.O(f52121f).N((double) this.f52144X.left);
                        }
                        if (z2) {
                            this.f52150d.O(f52121f).N((double) this.f52144X.top);
                        }
                    }
                }
                return true;
            }
        }
        m23698H(this.f52125E, this.f52144X, m23695E(), this.f52137Q.x, this.f52137Q.y);
        obj = 1;
        if (Math.round(this.f52144X.left) <= Math.round(yI.left)) {
            obj2 = null;
        } else {
            this.f52144X.offset(yI.left - this.f52144X.left, 0.0f);
            obj2 = 1;
        }
        if (Math.round(this.f52144X.right) < Math.round(yI.right)) {
            this.f52144X.offset(yI.right - this.f52144X.right, 0.0f);
            obj2 = 1;
        }
        if (Math.round(this.f52144X.top) > Math.round(yI.top)) {
            this.f52144X.offset(0.0f, yI.top - this.f52144X.top);
            z2 = true;
        }
        if (Math.round(this.f52144X.bottom) < Math.round(yI.bottom)) {
            this.f52144X.offset(0.0f, yI.bottom - this.f52144X.bottom);
            z2 = true;
        }
        if (!z) {
            this.f52122B.set(this.f52144X);
        } else if (this.f52123C) {
            if (obj == null) {
                if (obj2 != null) {
                    this.f52149c.O(f52121f).N((double) this.f52144X.left);
                }
                if (z2) {
                    this.f52150d.O(f52121f).N((double) this.f52144X.top);
                }
            } else {
                this.f52123C = true;
                this.f52149c.K();
                this.f52150d.K();
                this.f52142V.K().L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED).N(1.0d);
                this.f52140T.set(this.f52122B);
                this.f52139S.set(this.f52144X);
            }
        }
        return true;
    }

    /* renamed from: B */
    public final void m23701B() {
        if (!this.f52128H) {
            if (m23692B()) {
                this.f52128H = true;
                this.f52122B.set(this.f52125E);
                m23693C(this.f52122B.centerX(), this.f52122B.centerY(), m23695E());
            }
        }
    }

    /* renamed from: B */
    private boolean m23692B() {
        return (this.f52124D == null || this.f52125E.isEmpty() || this.f52127G.yI(this).isEmpty()) ? false : true;
    }

    /* renamed from: C */
    private void m23693C(float f, float f2, float f3) {
        RectF yI = this.f52127G.yI(this);
        this.f52122B.offsetTo(yI.centerX() - f, yI.centerY() - f2);
        invalidate();
        m23697G(Math.max(m23695E(), f3), yI.centerX(), yI.centerY());
        if (!this.f52122B.contains(yI)) {
            float width = f / this.f52122B.width();
            float height = f2 / this.f52122B.height();
            float max = Math.round(this.f52122B.left) > Math.round(yI.left) ? Math.max((((float) (Math.round(this.f52122B.left) - Math.round(yI.left))) / width) / this.f52122B.width(), 1.0f) : 1.0f;
            if (Math.round(this.f52122B.right) < Math.round(yI.right)) {
                max = Math.max((((float) (Math.round(yI.right) - Math.round(this.f52122B.right))) / (1.0f - width)) / this.f52122B.width(), max);
            }
            if (Math.round(this.f52122B.top) > Math.round(yI.top)) {
                max = Math.max((((float) (Math.round(this.f52122B.top) - Math.round(yI.top))) / height) / this.f52122B.height(), max);
            }
            if (Math.round(this.f52122B.bottom) < Math.round(yI.bottom)) {
                max = Math.max(Math.max((((float) (Math.round(yI.bottom) - Math.round(this.f52122B.bottom))) / (1.0f - height)) / this.f52122B.height(), max), max);
            }
            m23696F(max, f, f2);
            m23700A(false);
        }
    }

    /* renamed from: D */
    private void m23694D() {
        this.f52146Z = false;
        this.f52143W = false;
        this.f52149c.O(f52120e).L((double) getContentTranslationX()).P((double) this.f52147a);
        this.f52150d.O(f52120e).L((double) getContentTranslationY()).P((double) this.f52148b);
        this.f52142V.L((double) getContentScale());
        m23700A(true);
    }

    /* renamed from: E */
    private float m23695E() {
        return Math.max(this.f52127G.yI(this).height() / ((float) this.f52125E.height()), this.f52127G.yI(this).width() / ((float) this.f52125E.width()));
    }

    /* renamed from: F */
    private void m23696F(float f, float f2, float f3) {
        m23697G(f * getContentScale(), f2, f3);
    }

    /* renamed from: G */
    private void m23697G(float f, float f2, float f3) {
        m23698H(this.f52125E, this.f52122B, f, f2, f3);
        invalidate();
    }

    /* renamed from: H */
    private static void m23698H(Rect rect, RectF rectF, float f, float f2, float f3) {
        float width = ((float) rect.width()) * f;
        float height = ((float) rect.height()) * f;
        f3 = (f3 - (rectF.top - ((float) rect.top))) / rectF.height();
        rectF.left -= ((f2 - (rectF.left - ((float) rect.left))) / rectF.width()) * (width - rectF.width());
        rectF.top -= f3 * (height - rectF.height());
        rectF.right = rectF.left + width;
        rectF.bottom = rectF.top + height;
    }

    /* renamed from: I */
    private void m23699I(MotionEvent motionEvent) {
        this.f52146Z = true;
        this.f52130J = false;
        this.f52131K = motionEvent.getRawX();
        this.f52132L = motionEvent.getRawY();
        this.f52147a = 0.0f;
        this.f52148b = 0.0f;
        this.f52123C = false;
        this.f52149c.L((double) getContentTranslationX());
        this.f52150d.L((double) getContentTranslationY());
        this.f52142V.L((double) getContentScale());
    }

    public final void Jd(AnonymousClass0e7 anonymousClass0e7) {
        if (this.f52123C) {
            float f = r4.f52140T.left;
            float f2 = r4.f52140T.top;
            float f3 = r4.f52140T.right;
            float f4 = r4.f52140T.bottom;
            float f5 = r4.f52139S.left;
            float f6 = r4.f52139S.top;
            float f7 = r4.f52139S.right;
            double E = (double) ((float) r4.f52142V.E());
            r4.f52122B.set((float) AnonymousClass0dh.C(E, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) f, (double) f5), (float) AnonymousClass0dh.C(E, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) f2, (double) f6), (float) AnonymousClass0dh.C(E, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) f3, (double) f7), (float) AnonymousClass0dh.C(E, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) f4, (double) r4.f52139S.bottom));
            invalidate();
        } else if (!r4.f52149c.G() || !r4.f52150d.G()) {
            r4.f52122B.offsetTo((float) r4.f52149c.E(), (float) r4.f52150d.E());
            invalidate();
            if (!r4.f52146Z) {
                m23700A(true);
            }
        }
    }

    private float getContentScale() {
        return this.f52122B.width() / ((float) this.f52125E.width());
    }

    private float getContentTranslationX() {
        return this.f52122B.left;
    }

    private float getContentTranslationY() {
        return this.f52122B.top;
    }

    public Rect getCropRect() {
        RectF rectF = new RectF(this.f52122B);
        RectF rectF2 = new RectF(this.f52127G.yI(this));
        float f = -rectF.left;
        float f2 = -rectF.top;
        rectF.offset(f, f2);
        rectF2.offset(f, f2);
        rectF.intersect(rectF2);
        float contentScale = getContentScale();
        return new Rect(Math.round(rectF.left / contentScale), Math.round(rectF.top / contentScale), Math.round(rectF.right / contentScale), Math.round(rectF.bottom / contentScale));
    }

    public Bitmap getImageBitmap() {
        return this.f52124D;
    }

    public AnonymousClass4GH getRenderState() {
        return new AnonymousClass4GH(this.f52122B, this.f52127G.yI(this), this.f52125E, this.f52124D, this.f52133M, this.f52135O);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (m23692B()) {
            float f = -1.0f;
            float f2 = this.f52135O ? -1.0f : 1.0f;
            if (!this.f52133M) {
                f = 1.0f;
            }
            canvas.scale(f2, f, this.f52122B.centerX(), this.f52122B.centerY());
            canvas.drawBitmap(this.f52124D, this.f52125E, this.f52122B, this.f52136P);
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f52147a = (float) AnonymousClass0dh.B((double) f, -3000.0d, 3000.0d);
        this.f52148b = (float) AnonymousClass0dh.B((double) f2, -3000.0d, 3000.0d);
        return true;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f52138R.x = this.f52137Q.x;
        this.f52138R.y = this.f52137Q.y;
        this.f52137Q.x = (float) ((int) scaleGestureDetector.getFocusX());
        this.f52137Q.y = (float) ((int) scaleGestureDetector.getFocusY());
        m23696F(scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan(), this.f52137Q.x, this.f52137Q.y);
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f52143W = true;
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f52138R.x = (float) ((int) scaleGestureDetector.getFocusX());
        this.f52138R.y = (float) ((int) scaleGestureDetector.getFocusY());
        this.f52137Q.x = (float) ((int) scaleGestureDetector.getFocusX());
        this.f52137Q.y = (float) ((int) scaleGestureDetector.getFocusY());
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        getParent().requestDisallowInterceptTouchEvent(true);
        if (this.f52141U.isInProgress()) {
            f = this.f52138R.x - this.f52137Q.x;
            f2 = this.f52138R.y - this.f52137Q.y;
        } else if (!this.f52130J) {
            this.f52130J = true;
            f -= this.f52131K - motionEvent2.getRawX();
            f2 -= this.f52132L - motionEvent2.getRawY();
        }
        if (!this.f52143W) {
            Object obj;
            AnonymousClass4GF anonymousClass4GF = this.f52126F;
            RectF yI = this.f52127G.yI(this);
            RectF rectF = this.f52122B;
            anonymousClass4GF.f52111C = Math.min(Math.max(rectF.left / yI.width(), 0.0f), 1.0f);
            anonymousClass4GF.f52113E = Math.min(Math.max(rectF.top / yI.height(), 0.0f), 1.0f);
            anonymousClass4GF.f52112D = Math.min(Math.max((yI.width() - rectF.right) / yI.width(), 0.0f), 1.0f);
            anonymousClass4GF.f52110B = Math.min(Math.max((yI.height() - rectF.bottom) / yI.height(), 0.0f), 1.0f);
            f *= this.f52126F.m23690A();
            f2 *= this.f52126F.m23691B();
            anonymousClass4GF = this.f52126F;
            if (anonymousClass4GF.m23690A() >= 0.25f) {
                if (anonymousClass4GF.m23691B() >= 0.25f) {
                    obj = null;
                    if (obj != null) {
                        if (!this.f52129I && this.f52146Z) {
                            this.f52129I = true;
                        }
                        this.f52122B.offset(-f, -f2);
                        invalidate();
                        return true;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                this.f52129I = true;
                this.f52122B.offset(-f, -f2);
                invalidate();
                return true;
            }
        }
        this.f52129I = false;
        this.f52122B.offset(-f, -f2);
        invalidate();
        return true;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -687530270);
        super.onSizeChanged(i, i2, i3, i4);
        this.f52142V.K();
        this.f52149c.K();
        this.f52150d.K();
        if (m23692B()) {
            float f = (((float) i) / 2.0f) - (((float) i3) / 2.0f);
            float f2 = (((float) i2) / 2.0f) - (((float) i4) / 2.0f);
            m23692B();
            this.f52122B.offset(f, f2);
            invalidate();
            m23700A(false);
            AnonymousClass0cQ.O(this, -1291197680, N);
            return;
        }
        AnonymousClass0cQ.O(this, 1575468891, N);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -1402862563);
        boolean z = false;
        if (this.f52145Y) {
            Object obj;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m23699I(motionEvent);
            }
            boolean onTouchEvent = this.f52141U.onTouchEvent(motionEvent);
            if (!this.f52134N.onTouchEvent(motionEvent)) {
                if (!onTouchEvent) {
                    obj = null;
                    if (obj != null || super.onTouchEvent(motionEvent)) {
                        z = true;
                    }
                    if (actionMasked == 1 || actionMasked == 3) {
                        m23694D();
                    }
                    AnonymousClass0cQ.L(this, 240419877, M);
                    return z;
                }
            }
            obj = 1;
            z = true;
            m23694D();
            AnonymousClass0cQ.L(this, 240419877, M);
            return z;
        }
        AnonymousClass0cQ.L(this, -941998414, M);
        return false;
    }

    public void setBoundsDelegate(AnonymousClass4GG anonymousClass4GG) {
        this.f52127G = anonymousClass4GG;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f52124D = bitmap;
        this.f52128H = false;
        this.f52133M = false;
        this.f52135O = false;
        if (bitmap == null) {
            this.f52122B.setEmpty();
        } else {
            this.f52125E.set(0, 0, this.f52124D.getWidth(), this.f52124D.getHeight());
        }
        this.f52122B.set(this.f52125E);
        m23692B();
    }

    public void setRenderState(AnonymousClass4GH anonymousClass4GH) {
        setImageBitmap(anonymousClass4GH.f52114B);
        this.f52149c.K();
        this.f52150d.K();
        this.f52142V.K();
        this.f52122B.set(anonymousClass4GH.f52116D);
        RectF yI = this.f52127G.yI(this);
        this.f52133M = anonymousClass4GH.f52117E;
        this.f52135O = anonymousClass4GH.f52118F;
        PointF pointF = new PointF(anonymousClass4GH.f52119G.centerX() - anonymousClass4GH.f52116D.left, anonymousClass4GH.f52119G.centerY() - anonymousClass4GH.f52116D.top);
        this.f52137Q.x = pointF.x;
        this.f52137Q.y = pointF.y;
        float width = anonymousClass4GH.f52116D.width() / ((float) anonymousClass4GH.f52115C.width());
        float width2 = ((float) getWidth()) / ((float) getHeight());
        if (Math.abs((anonymousClass4GH.f52119G.width() / anonymousClass4GH.f52119G.height()) - width2) / width2 < 0.1f) {
            width *= Math.min(yI.width() / anonymousClass4GH.f52119G.width(), yI.height() / anonymousClass4GH.f52119G.height());
        }
        m23693C(pointF.x, pointF.y, width);
        invalidate();
    }

    public void setTouchEnabled(boolean z) {
        this.f52145Y = z;
    }
}
