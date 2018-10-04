package com.facebook.shimmer;

import X.AnonymousClass0cQ;
import X.AnonymousClass1x3;
import X.AnonymousClass1x4;
import X.AnonymousClass1x5;
import X.AnonymousClass1x6;
import X.AnonymousClass1x7;
import X.AnonymousClass1x8;
import X.AnonymousClass1x9;
import X.AnonymousClass5eq;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import com.fasterxml.jackson.databind.JsonMappingException;

public class ShimmerFrameLayout extends FrameLayout {
    /* renamed from: S */
    private static final PorterDuffXfermode f24582S = new PorterDuffXfermode(Mode.DST_IN);
    /* renamed from: B */
    public boolean f24583B;
    /* renamed from: C */
    public ValueAnimator f24584C;
    /* renamed from: D */
    public boolean f24585D;
    /* renamed from: E */
    public AnonymousClass1x6 f24586E;
    /* renamed from: F */
    public Bitmap f24587F;
    /* renamed from: G */
    public AnonymousClass1x9 f24588G;
    /* renamed from: H */
    public Bitmap f24589H;
    /* renamed from: I */
    public Bitmap f24590I;
    /* renamed from: J */
    private Paint f24591J;
    /* renamed from: K */
    private int f24592K;
    /* renamed from: L */
    private OnGlobalLayoutListener f24593L;
    /* renamed from: M */
    private int f24594M;
    /* renamed from: N */
    private int f24595N;
    /* renamed from: O */
    private Paint f24596O;
    /* renamed from: P */
    private int f24597P;
    /* renamed from: Q */
    private int f24598Q;
    /* renamed from: R */
    private int f24599R;

    public ShimmerFrameLayout(Context context) {
        this(context, null, 0);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.f24586E = new AnonymousClass1x6();
        this.f24591J = new Paint();
        Paint paint = new Paint();
        this.f24596O = paint;
        paint.setAntiAlias(true);
        this.f24596O.setDither(true);
        this.f24596O.setFilterBitmap(true);
        this.f24596O.setXfermode(f24582S);
        setAutoStart(false);
        setDuration(JsonMappingException.MAX_REFS_TO_LIST);
        setRepeatCount(-1);
        setRepeatDelay(0);
        setRepeatMode(1);
        this.f24586E.f24561B = AnonymousClass1x7.CW_0;
        this.f24586E.f24568I = AnonymousClass1x8.LINEAR;
        AnonymousClass1x6 anonymousClass1x6 = this.f24586E;
        anonymousClass1x6.f24562C = 0.5f;
        anonymousClass1x6.f24564E = 0;
        anonymousClass1x6.f24563D = 0;
        anonymousClass1x6.f24565F = 0.0f;
        anonymousClass1x6.f24567H = 1.0f;
        anonymousClass1x6.f24566G = 1.0f;
        anonymousClass1x6.f24569J = 20.0f;
        this.f24588G = new AnonymousClass1x9();
        setBaseAlpha(0.3f);
        m13907C(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass5eq.ShimmerFrameLayout, 0, 0);
            try {
                if (obtainStyledAttributes.hasValue(1)) {
                    setAutoStart(obtainStyledAttributes.getBoolean(1, false));
                }
                if (obtainStyledAttributes.hasValue(2)) {
                    setBaseAlpha(obtainStyledAttributes.getFloat(2, 0.0f));
                }
                if (obtainStyledAttributes.hasValue(4)) {
                    setDuration(obtainStyledAttributes.getInt(4, 0));
                }
                if (obtainStyledAttributes.hasValue(10)) {
                    setRepeatCount(obtainStyledAttributes.getInt(10, 0));
                }
                if (obtainStyledAttributes.hasValue(11)) {
                    setRepeatDelay(obtainStyledAttributes.getInt(11, 0));
                }
                if (obtainStyledAttributes.hasValue(12)) {
                    setRepeatMode(obtainStyledAttributes.getInt(12, 0));
                }
                if (obtainStyledAttributes.hasValue(0)) {
                    int i2 = obtainStyledAttributes.getInt(0, 0);
                    if (i2 == 90) {
                        this.f24586E.f24561B = AnonymousClass1x7.CW_90;
                    } else if (i2 == 180) {
                        this.f24586E.f24561B = AnonymousClass1x7.CW_180;
                    } else if (i2 != 270) {
                        this.f24586E.f24561B = AnonymousClass1x7.CW_0;
                    } else {
                        this.f24586E.f24561B = AnonymousClass1x7.CW_270;
                    }
                }
                if (obtainStyledAttributes.hasValue(13)) {
                    if (obtainStyledAttributes.getInt(13, 0) != 1) {
                        this.f24586E.f24568I = AnonymousClass1x8.LINEAR;
                    } else {
                        this.f24586E.f24568I = AnonymousClass1x8.RADIAL;
                    }
                }
                if (obtainStyledAttributes.hasValue(3)) {
                    this.f24586E.f24562C = obtainStyledAttributes.getFloat(3, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(6)) {
                    this.f24586E.f24564E = obtainStyledAttributes.getDimensionPixelSize(6, 0);
                }
                if (obtainStyledAttributes.hasValue(5)) {
                    this.f24586E.f24563D = obtainStyledAttributes.getDimensionPixelSize(5, 0);
                }
                if (obtainStyledAttributes.hasValue(7)) {
                    this.f24586E.f24565F = obtainStyledAttributes.getFloat(7, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(9)) {
                    this.f24586E.f24567H = obtainStyledAttributes.getFloat(9, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(8)) {
                    this.f24586E.f24566G = obtainStyledAttributes.getFloat(8, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(14)) {
                    this.f24586E.f24569J = obtainStyledAttributes.getFloat(14, 0.0f);
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: A */
    public final void m13911A() {
        if (!this.f24583B) {
            getShimmerAnimation().start();
            this.f24583B = true;
        }
    }

    /* renamed from: B */
    public static android.graphics.Bitmap m13906B(int r1, int r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ OutOfMemoryError -> 0x0007 }
        r0 = android.graphics.Bitmap.createBitmap(r1, r2, r0);	 Catch:{ OutOfMemoryError -> 0x0007 }
        return r0;	 Catch:{ OutOfMemoryError -> 0x0007 }
    L_0x0007:
        java.lang.System.gc();
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
        r0 = android.graphics.Bitmap.createBitmap(r1, r2, r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.ShimmerFrameLayout.B(int, int):android.graphics.Bitmap");
    }

    /* renamed from: B */
    public final void m13912B() {
        ValueAnimator valueAnimator = this.f24584C;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f24584C.removeAllUpdateListeners();
            this.f24584C.cancel();
        }
        this.f24584C = null;
        this.f24583B = false;
    }

    /* renamed from: C */
    public static void m13907C(ShimmerFrameLayout shimmerFrameLayout) {
        shimmerFrameLayout.m13912B();
        Bitmap bitmap = shimmerFrameLayout.f24587F;
        if (bitmap != null) {
            bitmap.recycle();
            shimmerFrameLayout.f24587F = null;
        }
        bitmap = shimmerFrameLayout.f24590I;
        if (bitmap != null) {
            bitmap.recycle();
            shimmerFrameLayout.f24590I = null;
        }
        bitmap = shimmerFrameLayout.f24589H;
        if (bitmap != null) {
            bitmap.recycle();
            shimmerFrameLayout.f24589H = null;
        }
    }

    /* renamed from: D */
    public static android.graphics.Bitmap m13908D(com.facebook.shimmer.ShimmerFrameLayout r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = r4.getWidth();
        r1 = r4.getHeight();
        r0 = m13906B(r2, r1);	 Catch:{ OutOfMemoryError -> 0x000d }
        return r0;	 Catch:{ OutOfMemoryError -> 0x000d }
    L_0x000d:
        r0 = "ShimmerFrameLayout failed to create working bitmap";
        r4 = new java.lang.StringBuilder;
        r4.<init>(r0);
        r0 = " (width = ";
        r4.append(r0);
        r4.append(r2);
        r0 = ", height = ";
        r4.append(r0);
        r4.append(r1);
        r0 = ")\n\n";
        r4.append(r0);
        r0 = java.lang.Thread.currentThread();
        r3 = r0.getStackTrace();
        r2 = r3.length;
        r1 = 0;
    L_0x0033:
        if (r1 >= r2) goto L_0x0046;
    L_0x0035:
        r0 = r3[r1];
        r0 = r0.toString();
        r4.append(r0);
        r0 = "\n";
        r4.append(r0);
        r1 = r1 + 1;
        goto L_0x0033;
    L_0x0046:
        r4.toString();
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.ShimmerFrameLayout.D(com.facebook.shimmer.ShimmerFrameLayout):android.graphics.Bitmap");
    }

    /* renamed from: E */
    private boolean m13909E(Canvas canvas) {
        if (this.f24590I == null) {
            this.f24590I = m13908D(this);
        }
        Bitmap bitmap = this.f24590I;
        if (this.f24589H == null) {
            this.f24589H = m13908D(this);
        }
        Bitmap bitmap2 = this.f24589H;
        if (bitmap != null) {
            if (bitmap2 != null) {
                super.dispatchDraw(new Canvas(bitmap));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f24591J);
                m13910F(this, new Canvas(bitmap2));
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, null);
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    private static void m13910F(ShimmerFrameLayout shimmerFrameLayout, Canvas canvas) {
        Bitmap maskBitmap = shimmerFrameLayout.getMaskBitmap();
        if (maskBitmap != null) {
            int i = shimmerFrameLayout.f24594M;
            canvas.clipRect(i, shimmerFrameLayout.f24595N, maskBitmap.getWidth() + i, shimmerFrameLayout.f24595N + maskBitmap.getHeight());
            super.dispatchDraw(canvas);
            canvas.drawBitmap(maskBitmap, (float) shimmerFrameLayout.f24594M, (float) shimmerFrameLayout.f24595N, shimmerFrameLayout.f24596O);
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        if (this.f24583B && getWidth() > 0) {
            if (getHeight() > 0) {
                m13909E(canvas);
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    public AnonymousClass1x7 getAngle() {
        return this.f24586E.f24561B;
    }

    public float getBaseAlpha() {
        return ((float) this.f24591J.getAlpha()) / 255.0f;
    }

    public float getDropoff() {
        return this.f24586E.f24562C;
    }

    public int getDuration() {
        return this.f24592K;
    }

    public int getFixedHeight() {
        return this.f24586E.f24563D;
    }

    public int getFixedWidth() {
        return this.f24586E.f24564E;
    }

    public float getIntensity() {
        return this.f24586E.f24565F;
    }

    private OnGlobalLayoutListener getLayoutListener() {
        return new AnonymousClass1x3(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap getMaskBitmap() {
        /*
        r19 = this;
        r1 = r19;
        r0 = r1.f24587F;
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return r0;
    L_0x0007:
        r3 = r1.f24586E;
        r0 = r1.getWidth();
        r4 = r3.f24564E;
        if (r4 <= 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0017;
    L_0x0012:
        r2 = (float) r0;
        r0 = r3.f24567H;
        r2 = r2 * r0;
        r4 = (int) r2;
    L_0x0017:
        r3 = r1.f24586E;
        r2 = r1.getHeight();
        r0 = r3.f24563D;
        if (r0 <= 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0027;
    L_0x0022:
        r2 = (float) r2;
        r0 = r3.f24566G;
        r2 = r2 * r0;
        r0 = (int) r2;
    L_0x0027:
        r2 = m13906B(r4, r0);
        r1.f24587F = r2;
        r8 = new android.graphics.Canvas;
        r2 = r1.f24587F;
        r8.<init>(r2);
        r3 = X.AnonymousClass1x5.f24560C;
        r2 = r1.f24586E;
        r2 = r2.f24568I;
        r2 = r2.ordinal();
        r2 = r3[r2];
        r10 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r5 = 2;
        if (r2 == r5) goto L_0x007c;
    L_0x0045:
        r3 = X.AnonymousClass1x5.f24559B;
        r2 = r1.f24586E;
        r2 = r2.f24561B;
        r2 = r2.ordinal();
        r2 = r3[r2];
        r7 = 0;
        switch(r2) {
            case 2: goto L_0x005f;
            case 3: goto L_0x005b;
            case 4: goto L_0x0059;
            default: goto L_0x0055;
        };
    L_0x0055:
        r6 = r4;
        r3 = 0;
    L_0x0057:
        r2 = 0;
        goto L_0x0062;
    L_0x0059:
        r3 = r0;
        goto L_0x005d;
    L_0x005b:
        r7 = r4;
        r3 = 0;
    L_0x005d:
        r6 = 0;
        goto L_0x0057;
    L_0x005f:
        r2 = r0;
        r3 = 0;
        r6 = 0;
    L_0x0062:
        r12 = new android.graphics.LinearGradient;
        r13 = (float) r7;
        r14 = (float) r3;
        r15 = (float) r6;
        r3 = (float) r2;
        r2 = r1.f24586E;
        r17 = r2.m13903A();
        r2 = r1.f24586E;
        r18 = r2.m13904B();
        r19 = android.graphics.Shader.TileMode.REPEAT;
        r16 = r3;
        r12.<init>(r13, r14, r15, r16, r17, r18, r19);
        goto L_0x00a3;
    L_0x007c:
        r3 = r4 / 2;
        r2 = r0 / 2;
        r12 = new android.graphics.RadialGradient;
        r13 = (float) r3;
        r14 = (float) r2;
        r2 = java.lang.Math.max(r4, r0);
        r2 = (double) r2;
        r6 = java.lang.Math.sqrt(r10);
        java.lang.Double.isNaN(r2);
        r2 = r2 / r6;
        r15 = (float) r2;
        r2 = r1.f24586E;
        r16 = r2.m13903A();
        r2 = r1.f24586E;
        r17 = r2.m13904B();
        r18 = android.graphics.Shader.TileMode.REPEAT;
        r12.<init>(r13, r14, r15, r16, r17, r18);
    L_0x00a3:
        r2 = r1.f24586E;
        r6 = r2.f24569J;
        r2 = r4 / 2;
        r3 = (float) r2;
        r2 = r0 / 2;
        r2 = (float) r2;
        r8.rotate(r6, r3, r2);
        r9 = new android.graphics.Paint;
        r9.<init>();
        r9.setShader(r12);
        r6 = java.lang.Math.sqrt(r10);
        r2 = java.lang.Math.max(r4, r0);
        r2 = (double) r2;
        java.lang.Double.isNaN(r2);
        r6 = r6 * r2;
        r6 = (int) r6;
        r6 = r6 / r5;
        r2 = -r6;
        r3 = (float) r2;
        r4 = r4 + r6;
        r2 = (float) r4;
        r0 = r0 + r6;
        r0 = (float) r0;
        r4 = r8;
        r5 = r3;
        r6 = r3;
        r7 = r2;
        r8 = r0;
        r4.drawRect(r5, r6, r7, r8, r9);
        r0 = r1.f24587F;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.ShimmerFrameLayout.getMaskBitmap():android.graphics.Bitmap");
    }

    public AnonymousClass1x8 getMaskShape() {
        return this.f24586E.f24568I;
    }

    public float getRelativeHeight() {
        return this.f24586E.f24566G;
    }

    public float getRelativeWidth() {
        return this.f24586E.f24567H;
    }

    public int getRepeatCount() {
        return this.f24597P;
    }

    public int getRepeatDelay() {
        return this.f24598Q;
    }

    public int getRepeatMode() {
        return this.f24599R;
    }

    private Animator getShimmerAnimation() {
        Animator animator = this.f24584C;
        if (animator != null) {
            return animator;
        }
        int width = getWidth();
        int height = getHeight();
        this.f24586E.f24568I.ordinal();
        switch (AnonymousClass1x5.f24559B[this.f24586E.f24561B.ordinal()]) {
            case 2:
                this.f24588G.m13905A(0, -height, 0, height);
                break;
            case 3:
                this.f24588G.m13905A(width, 0, -width, 0);
                break;
            case 4:
                this.f24588G.m13905A(0, height, 0, -height);
                break;
            default:
                this.f24588G.m13905A(-width, 0, width, 0);
                break;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (((float) this.f24598Q) / ((float) this.f24592K)) + 1.0f});
        this.f24584C = ofFloat;
        ofFloat.setDuration((long) (this.f24592K + this.f24598Q));
        this.f24584C.setRepeatCount(this.f24597P);
        this.f24584C.setRepeatMode(this.f24599R);
        this.f24584C.addUpdateListener(new AnonymousClass1x4(this));
        return this.f24584C;
    }

    public float getTilt() {
        return this.f24586E.f24569J;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -1571718851);
        super.onAttachedToWindow();
        if (this.f24593L == null) {
            this.f24593L = getLayoutListener();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f24593L);
        AnonymousClass0cQ.O(this, 542711130, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 1986135573);
        m13912B();
        if (this.f24593L != null) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f24593L);
            this.f24593L = null;
        }
        super.onDetachedFromWindow();
        AnonymousClass0cQ.O(this, 1362900648, N);
    }

    public void setAngle(AnonymousClass1x7 anonymousClass1x7) {
        this.f24586E.f24561B = anonymousClass1x7;
        m13907C(this);
    }

    public void setAutoStart(boolean z) {
        this.f24585D = z;
        m13907C(this);
    }

    public void setBaseAlpha(float f) {
        this.f24591J.setAlpha((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f));
        m13907C(this);
    }

    public void setDropoff(float f) {
        this.f24586E.f24562C = f;
        m13907C(this);
    }

    public void setDuration(int i) {
        this.f24592K = i;
        m13907C(this);
    }

    public void setFixedHeight(int i) {
        this.f24586E.f24563D = i;
        m13907C(this);
    }

    public void setFixedWidth(int i) {
        this.f24586E.f24564E = i;
        m13907C(this);
    }

    public void setIntensity(float f) {
        this.f24586E.f24565F = f;
        m13907C(this);
    }

    public static void setMaskOffsetX(ShimmerFrameLayout shimmerFrameLayout, int i) {
        if (shimmerFrameLayout.f24594M != i) {
            shimmerFrameLayout.f24594M = i;
            shimmerFrameLayout.invalidate();
        }
    }

    public static void setMaskOffsetY(ShimmerFrameLayout shimmerFrameLayout, int i) {
        if (shimmerFrameLayout.f24595N != i) {
            shimmerFrameLayout.f24595N = i;
            shimmerFrameLayout.invalidate();
        }
    }

    public void setMaskShape(AnonymousClass1x8 anonymousClass1x8) {
        this.f24586E.f24568I = anonymousClass1x8;
        m13907C(this);
    }

    public void setRelativeHeight(int i) {
        this.f24586E.f24566G = (float) i;
        m13907C(this);
    }

    public void setRelativeWidth(int i) {
        this.f24586E.f24567H = (float) i;
        m13907C(this);
    }

    public void setRepeatCount(int i) {
        this.f24597P = i;
        m13907C(this);
    }

    public void setRepeatDelay(int i) {
        this.f24598Q = i;
        m13907C(this);
    }

    public void setRepeatMode(int i) {
        this.f24599R = i;
        m13907C(this);
    }

    public void setTilt(float f) {
        this.f24586E.f24569J = f;
        m13907C(this);
    }
}
