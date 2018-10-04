package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.2GW */
public final class AnonymousClass2GW extends Drawable implements AnonymousClass0QP, Callback, OnTouchListener {
    /* renamed from: B */
    public final int f28310B;
    /* renamed from: C */
    public final int f28311C;
    /* renamed from: D */
    public final int f28312D;
    /* renamed from: E */
    public final AnonymousClass2GX f28313E;
    /* renamed from: F */
    public final AnonymousClass0cN f28314F;
    /* renamed from: G */
    public int f28315G;
    /* renamed from: H */
    public boolean f28316H;
    /* renamed from: I */
    public boolean f28317I;
    /* renamed from: J */
    public boolean f28318J;
    /* renamed from: K */
    public AnonymousClass5Cv f28319K;
    /* renamed from: L */
    public float f28320L;
    /* renamed from: M */
    public boolean f28321M;
    /* renamed from: N */
    public int f28322N;
    /* renamed from: O */
    public final Paint f28323O = new Paint(1);
    /* renamed from: P */
    public float f28324P;
    /* renamed from: Q */
    public int f28325Q;
    /* renamed from: R */
    public float f28326R;
    /* renamed from: S */
    public final Paint f28327S = new Paint(1);
    /* renamed from: T */
    public final RectF f28328T = new RectF();
    /* renamed from: U */
    public int f28329U;
    /* renamed from: V */
    public float f28330V;
    /* renamed from: W */
    public final AnonymousClass2Gc f28331W;
    /* renamed from: X */
    public final AnonymousClass0cN f28332X;
    /* renamed from: Y */
    private boolean f28333Y;
    /* renamed from: Z */
    private boolean f28334Z;
    /* renamed from: a */
    private final AnonymousClass0cN f28335a;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public AnonymousClass2GW(Context context) {
        AnonymousClass0e7 B = AnonymousClass0e6.B();
        AnonymousClass2GX anonymousClass2GX = new AnonymousClass2GX(context);
        this.f28313E = anonymousClass2GX;
        anonymousClass2GX.setCallback(this);
        this.f28314F = B.C().O(AnonymousClass0e5.B(10.0d, 20.0d)).L(1.0d).A(this);
        AnonymousClass2Gc anonymousClass2Gc = new AnonymousClass2Gc(context);
        this.f28331W = anonymousClass2Gc;
        anonymousClass2Gc.setCallback(this);
        this.f28335a = B.C().O(AnonymousClass0e5.B(10.0d, 20.0d)).L(1.0d).A(this);
        this.f28332X = B.C().A(this).L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED).O(AnonymousClass0e5.C(40.0d, 7.0d));
        this.f28310B = AnonymousClass0Ca.C(context, C0164R.color.slider_gradient_background);
        this.f28312D = AnonymousClass0Ca.C(context, C0164R.color.slider_gradient_start);
        this.f28311C = AnonymousClass0Ca.C(context, C0164R.color.slider_gradient_end);
        this.f28322N = this.f28310B;
        this.f28329U = this.f28312D;
        this.f28325Q = this.f28311C;
        this.f28323O.setColor(this.f28322N);
    }

    /* renamed from: A */
    public final void m14887A(boolean z) {
        this.f28317I = z;
        invalidateSelf();
    }

    /* renamed from: B */
    public final void m14888B(int i) {
        AnonymousClass2GX anonymousClass2GX = this.f28313E;
        anonymousClass2GX.f28340F = (float) i;
        anonymousClass2GX.f28337C.m16453K(anonymousClass2GX.f28340F);
        AnonymousClass2Gc anonymousClass2Gc = anonymousClass2GX.f28339E;
        anonymousClass2Gc.f28370D = anonymousClass2GX.f28340F / 2.0f;
        anonymousClass2Gc.invalidateSelf();
        AnonymousClass2Gf anonymousClass2Gf = anonymousClass2GX.f28342H;
        anonymousClass2Gf.f28395B = anonymousClass2GX.f28340F;
        anonymousClass2Gf.invalidateSelf();
        anonymousClass2GX.invalidateSelf();
    }

    /* renamed from: B */
    public static void m14885B(AnonymousClass2GW anonymousClass2GW, Rect rect) {
        anonymousClass2GW.f28327S.setShader(new LinearGradient(0.0f, rect.exactCenterY(), (float) rect.width(), rect.exactCenterY(), anonymousClass2GW.f28329U, anonymousClass2GW.f28325Q, TileMode.CLAMP));
    }

    /* renamed from: C */
    public final void m14889C(AnonymousClass2GY anonymousClass2GY) {
        this.f28313E.m14893A(anonymousClass2GY);
    }

    /* renamed from: C */
    private void m14886C(Canvas canvas) {
        if (this.f28318J) {
            float E;
            float width;
            int F = AnonymousClass26h.m14463F(this.f28329U, this.f28325Q, this.f28330V);
            AnonymousClass2Gc anonymousClass2Gc = this.f28331W;
            anonymousClass2Gc.f28369C = F;
            anonymousClass2Gc.invalidateSelf();
            if (this.f28321M) {
                E = (float) this.f28332X.E();
            } else {
                E = (float) this.f28335a.E();
            }
            Rect bounds = getBounds();
            float intrinsicWidth = (float) this.f28331W.getIntrinsicWidth();
            float intrinsicHeight = (float) this.f28331W.getIntrinsicHeight();
            if (this.f28317I) {
                width = (this.f28330V * (((float) bounds.width()) - intrinsicWidth)) + (intrinsicWidth / 2.0f);
            } else {
                width = this.f28330V * ((float) bounds.width());
            }
            float height = (float) (bounds.height() / 2);
            canvas.save();
            canvas.scale(E, E, width, height);
            intrinsicWidth /= 2.0f;
            intrinsicHeight /= 2.0f;
            this.f28331W.setBounds((int) (width - intrinsicWidth), (int) (height - intrinsicHeight), (int) (width + intrinsicWidth), (int) (height + intrinsicHeight));
            this.f28331W.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: D */
    public final void m14890D(float f) {
        this.f28320L = f;
        AnonymousClass2GX anonymousClass2GX = this.f28313E;
        int F = AnonymousClass26h.m14463F(this.f28329U, this.f28325Q, this.f28320L);
        AnonymousClass2Gc anonymousClass2Gc = anonymousClass2GX.f28339E;
        anonymousClass2Gc.f28369C = F;
        anonymousClass2Gc.invalidateSelf();
        anonymousClass2GX.invalidateSelf();
        invalidateSelf();
    }

    /* renamed from: E */
    public final void m14891E(int i) {
        float f = (float) i;
        this.f28324P = f / 2.0f;
        this.f28326R = f;
        invalidateSelf();
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float width;
        Rect bounds = getBounds();
        canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        Rect bounds2 = getBounds();
        float height = ((float) bounds2.height()) / 2.0f;
        this.f28328T.set(0.0f, height - (this.f28326R / 2.0f), (float) bounds2.width(), height + (this.f28326R / 2.0f));
        RectF rectF = this.f28328T;
        float f = this.f28324P;
        canvas.drawRoundRect(rectF, f, f, this.f28323O);
        bounds = getBounds();
        f = (float) this.f28313E.getIntrinsicWidth();
        float height2 = ((float) bounds.height()) / 2.0f;
        if (this.f28317I) {
            width = (this.f28320L * (((float) bounds.width()) - f)) + (f / 2.0f);
        } else {
            width = this.f28320L * ((float) bounds.width());
        }
        RectF rectF2 = this.f28328T;
        f = this.f28326R;
        rectF2.set(0.0f, height2 - (f / 2.0f), width, height2 + (f / 2.0f));
        rectF = this.f28328T;
        f = this.f28324P;
        canvas.drawRoundRect(rectF, f, f, this.f28327S);
        m14886C(canvas);
        Rect bounds3 = getBounds();
        float intrinsicWidth = (float) this.f28313E.getIntrinsicWidth();
        height2 = (float) this.f28313E.getIntrinsicHeight();
        float E = (float) this.f28314F.E();
        if (this.f28317I) {
            f = (this.f28320L * (((float) bounds3.width()) - intrinsicWidth)) + (intrinsicWidth / 2.0f);
        } else {
            f = this.f28320L * ((float) bounds3.width());
        }
        height = (float) (bounds3.height() / 2);
        canvas.save();
        canvas.scale(E, E, f, height);
        intrinsicWidth /= 2.0f;
        height2 /= 2.0f;
        this.f28313E.setBounds((int) (f - intrinsicWidth), (int) (height - height2), (int) (f + intrinsicWidth), (int) (height + height2));
        this.f28313E.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        int i = this.f28315G;
        return i > 0 ? i : this.f28313E.getIntrinsicHeight();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        AnonymousClass2GW.m14885B(this, rect);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Rect bounds = getBounds();
        int x = ((int) motionEvent.getX()) - bounds.left;
        int y = ((int) motionEvent.getY()) - bounds.top;
        switch (motionEvent.getActionMasked()) {
            case 0:
                boolean contains = this.f28313E.getBounds().contains(x, y);
                this.f28333Y = contains;
                if (contains) {
                    this.f28314F.N(0.8999999761581421d);
                }
                contains = this.f28331W.getBounds().contains(x, y);
                this.f28334Z = contains;
                if (contains) {
                    this.f28335a.N(0.8999999761581421d);
                }
                AnonymousClass5Cv anonymousClass5Cv = this.f28319K;
                if (anonymousClass5Cv != null) {
                    float f;
                    if (!this.f28316H || !this.f28333Y) {
                        AnonymousClass5Cv anonymousClass5Cv2 = this.f28319K;
                        boolean z = this.f28333Y;
                        f = this.f28320L;
                        anonymousClass5Cv2.f61189C.mAA();
                        if (z) {
                            AnonymousClass5Cv.C(anonymousClass5Cv2, f);
                            anonymousClass5Cv2.f61190D.f14268D.m14895A();
                            break;
                        }
                    }
                    f = this.f28320L;
                    anonymousClass5Cv.f61189C.oAA();
                    AnonymousClass5Cv.C(anonymousClass5Cv, f);
                    anonymousClass5Cv.f61190D.f14268D.m14895A();
                    break;
                }
                break;
            case 1:
            case 3:
                AnonymousClass5Cv anonymousClass5Cv3 = this.f28319K;
                if (anonymousClass5Cv3 != null) {
                    if (this.f28316H && this.f28333Y) {
                        float f2 = this.f28320L;
                        String NO = anonymousClass5Cv3.f61191E.f4134F.NO();
                        String str = anonymousClass5Cv3.f61192F.f15068E;
                        AnonymousClass1LB anonymousClass1LB = new AnonymousClass1LB(f2, anonymousClass5Cv3.f61193G.B());
                        anonymousClass5Cv3.f61189C.nAA(new AnonymousClass2GU(NO, str, anonymousClass1LB), anonymousClass5Cv3.f61190D);
                        anonymousClass5Cv3.f61190D.f14271G.f28376E.f28316H = false;
                        AnonymousClass2Gd anonymousClass2Gd = anonymousClass5Cv3.f61190D.f14271G;
                        anonymousClass2Gd.f28378G = anonymousClass1LB;
                        AnonymousClass2Gd.m14898B(anonymousClass2Gd);
                        AnonymousClass5Cv.C(anonymousClass5Cv3, f2);
                        AnonymousClass5Cv.B(anonymousClass5Cv3);
                    } else {
                        AnonymousClass5Cv anonymousClass5Cv4 = this.f28319K;
                        boolean z2 = this.f28333Y;
                        boolean z3 = this.f28334Z;
                        float f3 = this.f28320L;
                        anonymousClass5Cv4.f61189C.lAA(z3, anonymousClass5Cv4.f61190D);
                        if (z2) {
                            AnonymousClass5Cv.C(anonymousClass5Cv4, f3);
                            AnonymousClass5Cv.B(anonymousClass5Cv4);
                        }
                    }
                }
                this.f28333Y = false;
                this.f28334Z = false;
                this.f28314F.N(1.0d);
                this.f28335a.N(1.0d);
                break;
            case 2:
                if (this.f28316H && this.f28333Y) {
                    m14890D((float) AnonymousClass0dh.B((double) (((float) x) / ((float) bounds.width())), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d));
                    AnonymousClass5Cv anonymousClass5Cv5 = this.f28319K;
                    if (anonymousClass5Cv5 != null) {
                        AnonymousClass5Cv.C(anonymousClass5Cv5, this.f28320L);
                        break;
                    }
                }
                break;
            default:
                break;
        }
        return true;
    }

    public final void setAlpha(int i) {
        this.f28313E.setAlpha(i);
        this.f28323O.setAlpha(i);
        this.f28327S.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28313E.setColorFilter(colorFilter);
        this.f28323O.setColorFilter(colorFilter);
        this.f28327S.setColorFilter(colorFilter);
    }
}
