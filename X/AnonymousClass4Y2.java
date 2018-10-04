package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.4Y2 */
public class AnonymousClass4Y2 extends ImageView {
    /* renamed from: B */
    public boolean f55050B;
    /* renamed from: C */
    public final Matrix f55051C = new Matrix();
    /* renamed from: D */
    public final Matrix f55052D = new Matrix();
    /* renamed from: E */
    public AnonymousClass0e5 f55053E;
    /* renamed from: F */
    public AnonymousClass0cN f55054F;
    /* renamed from: G */
    public AnonymousClass0cN f55055G;
    /* renamed from: H */
    public AnonymousClass0e5 f55056H;
    /* renamed from: I */
    public float f55057I = 1.0f;
    /* renamed from: J */
    public PointF f55058J = null;
    /* renamed from: K */
    public float f55059K = 1.0f;
    /* renamed from: L */
    public AnonymousClass0cN f55060L;
    /* renamed from: M */
    public AnonymousClass0e6 f55061M;
    /* renamed from: N */
    public final AnonymousClass4Y7 f55062N = new AnonymousClass4Y7();
    /* renamed from: O */
    private final RectF f55063O = new RectF();
    /* renamed from: P */
    private float f55064P = 1.0f;
    /* renamed from: Q */
    private float f55065Q = 1.0f;
    /* renamed from: R */
    private Runnable f55066R = null;
    /* renamed from: S */
    private final AnonymousClass3HX f55067S = new AnonymousClass3HX(null);
    /* renamed from: T */
    private final Matrix f55068T = new Matrix();
    /* renamed from: U */
    private final float[] f55069U = new float[9];
    /* renamed from: V */
    private final RectF f55070V = new RectF();
    /* renamed from: W */
    private final RectF f55071W = new RectF();

    public AnonymousClass4Y2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ScaleType.MATRIX);
        setCropToPadding(false);
        this.f55061M = AnonymousClass0e6.B();
        this.f55053E = AnonymousClass0e5.C(30.0d, 9.0d);
        this.f55056H = AnonymousClass0e5.C(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.5d);
        this.f55060L = this.f55061M.C().O(this.f55053E);
        this.f55054F = AnonymousClass4Y2.m24450C(this);
        this.f55055G = AnonymousClass4Y2.m24450C(this);
    }

    /* renamed from: A */
    public void m24454A() {
        m24455B(this.f55052D, this.f55062N);
        if (!this.f55062N.m24467B()) {
            this.f55062N.m24466A(this.f55052D);
            setImageMatrix(this.f55052D);
            this.f55058J = null;
        }
        this.f55061M.F();
    }

    /* renamed from: B */
    public static void m24449B(AnonymousClass4Y2 anonymousClass4Y2) {
        anonymousClass4Y2.m24455B(anonymousClass4Y2.f55052D, anonymousClass4Y2.f55062N);
        if (anonymousClass4Y2.f55062N.m24467B()) {
            anonymousClass4Y2.setImageMatrix(anonymousClass4Y2.f55052D);
            return;
        }
        Matrix matrix = anonymousClass4Y2.f55068T;
        matrix.set(anonymousClass4Y2.f55052D);
        AnonymousClass4Y7 anonymousClass4Y7 = anonymousClass4Y2.f55062N;
        anonymousClass4Y7.f55084D = (float) Math.sqrt((double) anonymousClass4Y7.f55084D);
        if (anonymousClass4Y2.f55062N.f55082B != 0.0f) {
            AnonymousClass4Y7 anonymousClass4Y72 = anonymousClass4Y2.f55062N;
            anonymousClass4Y72.f55082B = AnonymousClass2Mp.m15246E((double) anonymousClass4Y72.f55082B, (double) anonymousClass4Y2.f55071W.width());
        }
        if (anonymousClass4Y2.f55062N.f55083C != 0.0f) {
            anonymousClass4Y72 = anonymousClass4Y2.f55062N;
            anonymousClass4Y72.f55083C = AnonymousClass2Mp.m15246E((double) anonymousClass4Y72.f55083C, (double) anonymousClass4Y2.f55071W.height());
        }
        anonymousClass4Y2.f55062N.m24466A(matrix);
        anonymousClass4Y2.setImageMatrix(matrix);
    }

    /* renamed from: B */
    public final void m24455B(Matrix matrix, AnonymousClass4Y7 anonymousClass4Y7) {
        anonymousClass4Y7.f55084D = 1.0f;
        anonymousClass4Y7.f55083C = 0.0f;
        anonymousClass4Y7.f55082B = 0.0f;
        anonymousClass4Y7.f55086F = 0.0f;
        anonymousClass4Y7.f55085E = 0.0f;
        float D = AnonymousClass4Y2.m24451D(this, matrix) / AnonymousClass4Y2.m24451D(this, this.f55051C);
        Matrix matrix2 = this.f55068T;
        matrix2.set(matrix);
        PointF pointF = this.f55058J;
        if (pointF == null) {
            anonymousClass4Y7.f55085E = ((float) getWidth()) / 2.0f;
            anonymousClass4Y7.f55086F = ((float) getHeight()) / 2.0f;
        } else {
            anonymousClass4Y7.f55085E = pointF.x;
            anonymousClass4Y7.f55086F = this.f55058J.y;
        }
        if (D < this.f55059K || D > this.f55065Q) {
            float f = this.f55059K;
            if (D >= f) {
                f = this.f55065Q;
            }
            f /= D;
            matrix2.postScale(f, f, anonymousClass4Y7.f55085E, anonymousClass4Y7.f55086F);
            anonymousClass4Y7.f55084D = f;
        }
        RectF rectF = this.f55070V;
        rectF.set(0.0f, 0.0f, (float) this.f55067S.f39823B.getWidth(), (float) this.f55067S.f39823B.getHeight());
        matrix2.mapRect(rectF);
        float f2 = this.f55071W.left;
        D = this.f55071W.right;
        float width = this.f55071W.width() - rectF.width();
        if (width > 0.0f) {
            width /= 2.0f;
            f2 += width;
            D -= width;
        }
        if (this.f55064P < 1.0f) {
            f2 = (float) (((int) (this.f55071W.width() - (this.f55071W.height() * this.f55064P))) / 2);
            D = this.f55071W.right - f2;
        }
        if (rectF.left > f2) {
            anonymousClass4Y7.f55082B = f2 - rectF.left;
        } else if (rectF.right < D) {
            anonymousClass4Y7.f55082B = D - rectF.right;
        }
        f2 = this.f55071W.top;
        D = this.f55071W.bottom;
        width = this.f55071W.height() - rectF.height();
        if (width > 0.0f) {
            width /= 2.0f;
            f2 += width;
            D -= width;
        }
        if (this.f55064P > 1.0f) {
            f2 = (float) (((int) (this.f55071W.height() - (this.f55071W.width() / this.f55064P))) / 2);
            D = this.f55071W.bottom - f2;
        }
        if (rectF.top > f2) {
            anonymousClass4Y7.f55083C = f2 - rectF.top;
        } else if (rectF.bottom < D) {
            anonymousClass4Y7.f55083C = D - rectF.bottom;
        }
    }

    /* renamed from: C */
    public static AnonymousClass0cN m24450C(AnonymousClass4Y2 anonymousClass4Y2) {
        anonymousClass4Y2 = anonymousClass4Y2.f55061M.C();
        anonymousClass4Y2.f7105C = 1.0d;
        anonymousClass4Y2.f7110H = 10.0d;
        anonymousClass4Y2.f7108F = false;
        return anonymousClass4Y2;
    }

    /* renamed from: C */
    public void m24456C(boolean z) {
        setHighQuality(z);
    }

    /* renamed from: D */
    public static float m24451D(AnonymousClass4Y2 anonymousClass4Y2, Matrix matrix) {
        matrix.getValues(anonymousClass4Y2.f55069U);
        matrix = anonymousClass4Y2.f55069U;
        anonymousClass4Y2 = matrix[0];
        float f = matrix[3];
        return (float) Math.sqrt((double) ((anonymousClass4Y2 * anonymousClass4Y2) + (f * f)));
    }

    /* renamed from: D */
    public void m24457D(boolean z) {
        if (this.f55067S.f39823B != null) {
            m24453F();
            this.f55052D.set(this.f55051C);
            if (z) {
                Matrix matrix = this.f55052D;
                float f = this.f55059K;
                matrix.postScale(f, f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
            }
            setImageMatrix(this.f55052D);
            this.f55058J = null;
        }
    }

    /* renamed from: E */
    public void m24458E(AnonymousClass3HX anonymousClass3HX, float[] fArr) {
        if (getWidth() <= 0) {
            this.f55066R = new AnonymousClass4Y0(this, anonymousClass3HX, fArr);
            return;
        }
        if (anonymousClass3HX.f39823B != null) {
            m24452E(anonymousClass3HX.f39823B, anonymousClass3HX.f39824C);
            m24453F();
        } else {
            this.f55051C.reset();
            setImageBitmap(null);
        }
        if (fArr == null) {
            this.f55052D.set(this.f55051C);
        } else {
            this.f55052D.setValues(fArr);
        }
        setImageMatrix(this.f55052D);
    }

    /* renamed from: E */
    private void m24452E(Bitmap bitmap, int i) {
        super.setImageBitmap(bitmap);
        this.f55067S.f39823B = bitmap;
        this.f55067S.f39824C = i;
        setHighQuality(true);
    }

    /* renamed from: F */
    private void m24453F() {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float B = (float) this.f55067S.m19249B();
        float A = (float) this.f55067S.m19248A();
        float min = Math.min(width, height) / Math.min(B, A);
        AnonymousClass3HX anonymousClass3HX = this.f55067S;
        Matrix matrix = this.f55051C;
        matrix.reset();
        if (anonymousClass3HX.f39824C != 0) {
            matrix.postTranslate(((float) (-anonymousClass3HX.f39823B.getWidth())) / 2.0f, ((float) (-anonymousClass3HX.f39823B.getHeight())) / 2.0f);
            matrix.postRotate((float) anonymousClass3HX.f39824C);
            matrix.postTranslate(((float) anonymousClass3HX.m19249B()) / 2.0f, ((float) anonymousClass3HX.m19248A()) / 2.0f);
        }
        this.f55051C.postScale(min, min);
        this.f55051C.postTranslate((width - (B * min)) / 2.0f, (height - (A * min)) / 2.0f);
        this.f55051C.mapRect(this.f55071W, this.f55063O);
    }

    /* renamed from: F */
    public void m24459F(float f, float f2, RectF rectF) {
        this.f55057I = f;
        if (!this.f55050B) {
            this.f55050B = false;
            this.f55059K = this.f55057I;
        }
        this.f55065Q = f2;
        this.f55063O.set(rectF);
    }

    public Matrix getBaseMatrix() {
        return this.f55051C;
    }

    public float getCropAspectRatio() {
        return this.f55064P;
    }

    public Matrix getCropMatrix() {
        return this.f55052D;
    }

    public float[] getCropMatrixValues() {
        float[] fArr = new float[9];
        this.f55052D.getValues(fArr);
        return fArr;
    }

    public float getCurrentScale() {
        return AnonymousClass4Y2.m24451D(this, this.f55052D) / AnonymousClass4Y2.m24451D(this, this.f55051C);
    }

    public AnonymousClass3HX getRotateBitmap() {
        return this.f55067S;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.f55066R;
        if (runnable != null) {
            this.f55066R = null;
            runnable.run();
        }
        if (this.f55067S.f39823B != null) {
            m24453F();
        }
    }

    public void setCropAspectRatio(float f) {
        this.f55064P = f;
    }

    public void setForcedMinZoom(float f) {
        this.f55050B = true;
        this.f55059K = f;
    }

    private void setHighQuality(boolean z) {
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            bitmapDrawable.setDither(z);
            bitmapDrawable.setAntiAlias(z);
            bitmapDrawable.setFilterBitmap(z);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        m24452E(bitmap, 0);
    }
}
