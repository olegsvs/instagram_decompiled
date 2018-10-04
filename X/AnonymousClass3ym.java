package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Animation;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.facebook.C0164R;

/* renamed from: X.3ym */
public final class AnonymousClass3ym extends RadioButton implements AnonymousClass3CS {
    /* renamed from: B */
    public AnonymousClass3Cs f47755B = AnonymousClass3Cs.f39113J;
    /* renamed from: C */
    public final Runnable f47756C = new AnonymousClass3D0(this);
    /* renamed from: D */
    public boolean f47757D;
    /* renamed from: E */
    public AnonymousClass3D4 f47758E;
    /* renamed from: F */
    public boolean f47759F = false;
    /* renamed from: G */
    public AnonymousClass3D1 f47760G = AnonymousClass3D1.NONE;
    /* renamed from: H */
    public AnonymousClass3Cv f47761H;
    /* renamed from: I */
    public int[] f47762I = new int[2];
    /* renamed from: J */
    public Rect f47763J = new Rect();
    /* renamed from: K */
    private int f47764K;
    /* renamed from: L */
    private String f47765L;
    /* renamed from: M */
    private final float f47766M;
    /* renamed from: N */
    private final Paint f47767N;
    /* renamed from: O */
    private final AnonymousClass3D2 f47768O;
    /* renamed from: P */
    private Drawable f47769P;
    /* renamed from: Q */
    private int f47770Q;
    /* renamed from: R */
    private final Rect f47771R = new Rect();
    /* renamed from: S */
    private int f47772S;
    /* renamed from: T */
    private float f47773T;
    /* renamed from: U */
    private float f47774U;
    /* renamed from: V */
    private boolean f47775V;
    /* renamed from: W */
    private String f47776W;
    /* renamed from: X */
    private final boolean f47777X;

    public AnonymousClass3ym(Context context) {
        super(context);
        setBackground(null);
        setClickable(true);
        setFocusable(true);
        this.f47766M = (float) getResources().getDimensionPixelSize(C0164R.dimen.effect_tile_highlight_width);
        Paint paint = new Paint(1);
        this.f47767N = paint;
        paint.setTextAlign(Align.CENTER);
        this.f47767N.setTypeface(Typeface.DEFAULT);
        this.f47767N.setFakeBoldText(true);
        this.f47768O = new AnonymousClass3D2(this);
        this.f47769P = AnonymousClass0Ca.E(getContext(), C0164R.drawable.filter_shadow);
        this.f47777X = AnonymousClass27D.m14492E(getContext());
    }

    /* renamed from: A */
    public final void m21827A() {
        AnonymousClass3D1 anonymousClass3D1 = this.f47760G;
        AnonymousClass3D1 anonymousClass3D12 = AnonymousClass3D1.COLLAPSED;
        if (anonymousClass3D1 != anonymousClass3D12) {
            AnonymousClass3ym.m21825E(this, 0);
            this.f47760G = anonymousClass3D12;
        }
    }

    /* renamed from: B */
    public final void m21828B() {
        AnonymousClass3D1 anonymousClass3D1 = this.f47760G;
        AnonymousClass3D1 anonymousClass3D12 = AnonymousClass3D1.EXPANDED;
        if (anonymousClass3D1 != anonymousClass3D12) {
            AnonymousClass3ym.m21825E(this, this.f47764K);
            this.f47760G = anonymousClass3D12;
        }
    }

    /* renamed from: B */
    public static void m21822B(AnonymousClass3ym anonymousClass3ym) {
        if (anonymousClass3ym.f47768O.f39142C != 1.0f) {
            anonymousClass3ym.f47768O.m19039B(1.0f);
        }
    }

    /* renamed from: C */
    public final void m21829C(AnonymousClass3Cv anonymousClass3Cv, boolean z) {
        this.f47775V = z;
        this.f47761H = anonymousClass3Cv;
        this.f47765L = anonymousClass3Cv.getName();
        this.f47758E = this.f47761H.vH(getResources(), null, this.f47755B);
        m21826F();
    }

    /* renamed from: C */
    public static void m21823C(AnonymousClass3ym anonymousClass3ym) {
        if (anonymousClass3ym.f47768O.f39142C != 0.0f) {
            anonymousClass3ym.f47768O.m19039B(0.0f);
        }
    }

    /* renamed from: D */
    public static void m21824D(AnonymousClass3ym anonymousClass3ym) {
        if (anonymousClass3ym.getMeasuredWidth() != 0) {
            int max;
            int round;
            int i = anonymousClass3ym.f47764K - (anonymousClass3ym.f47770Q * 2);
            if (anonymousClass3ym.f47755B.f39119D > 0) {
                max = Math.max(i / anonymousClass3ym.f47755B.f39119D, anonymousClass3ym.getResources().getDimensionPixelOffset(C0164R.dimen.font_xsmall));
            } else {
                max = anonymousClass3ym.getResources().getDimensionPixelOffset(anonymousClass3ym.f47777X ? C0164R.dimen.font_xsmall : C0164R.dimen.font_small);
            }
            if (max != anonymousClass3ym.f47772S) {
                anonymousClass3ym.f47772S = max;
                anonymousClass3ym.f47767N.setTextSize((float) anonymousClass3ym.f47772S);
                anonymousClass3ym.m21826F();
            }
            int i2 = anonymousClass3ym.f47770Q * 2;
            int i3 = i2 * 3;
            int i4 = 0;
            if (anonymousClass3ym.f47777X && anonymousClass3ym.f47755B.f39118C == 3) {
                i4 = anonymousClass3ym.getResources().getDimensionPixelSize(C0164R.dimen.effect_tile_dot_radius) * 2;
            }
            int measuredHeight = (int) ((((float) ((anonymousClass3ym.getMeasuredHeight() - i3) - i)) + anonymousClass3ym.f47767N.ascent()) - ((float) i4));
            if (measuredHeight <= 0) {
                round = Math.round(((float) measuredHeight) / 3.0f);
            } else {
                round = Math.round(((float) measuredHeight) / 2.0f);
            }
            anonymousClass3ym.f47758E.setBounds(anonymousClass3ym.f47770Q, (((anonymousClass3ym.getMeasuredHeight() - i2) - round) - i) - i4, anonymousClass3ym.f47770Q + i, ((anonymousClass3ym.getMeasuredHeight() - i2) - round) - i4);
            anonymousClass3ym.f47774U = ((float) (i2 + round)) - anonymousClass3ym.f47767N.ascent();
            anonymousClass3ym.f47769P.getPadding(anonymousClass3ym.f47763J);
            Rect bounds = anonymousClass3ym.f47758E.getBounds();
            anonymousClass3ym.f47769P.setBounds(bounds.left - anonymousClass3ym.f47763J.left, bounds.top - anonymousClass3ym.f47763J.top, bounds.right + anonymousClass3ym.f47763J.right, bounds.bottom + anonymousClass3ym.f47763J.bottom);
            anonymousClass3ym.f47773T = ((float) anonymousClass3ym.f47770Q) + (((float) i) / 2.0f);
        }
    }

    /* renamed from: E */
    private static void m21825E(AnonymousClass3ym anonymousClass3ym, int i) {
        Animation anonymousClass3Cr = new AnonymousClass3Cr(anonymousClass3ym, anonymousClass3ym.getLayoutParams().width >= 0 ? anonymousClass3ym.getLayoutParams().width : anonymousClass3ym.f47764K, i);
        anonymousClass3Cr.setAnimationListener(new AnonymousClass3Cz(anonymousClass3ym, i));
        anonymousClass3Cr.setDuration(300);
        anonymousClass3Cr.setFillAfter(true);
        anonymousClass3ym.startAnimation(anonymousClass3Cr);
        ((View) anonymousClass3ym.getParent()).invalidate();
    }

    /* renamed from: F */
    private void m21826F() {
        if (this.f47775V) {
            this.f47776W = TextUtils.ellipsize(this.f47765L, new TextPaint(this.f47767N), (float) this.f47764K, TruncateAt.END).toString();
        } else {
            this.f47776W = this.f47765L;
        }
    }

    public final void Ue(int i, Bitmap bitmap) {
        this.f47758E = this.f47761H.vH(getResources(), new BitmapDrawable(getResources(), bitmap), this.f47755B);
        AnonymousClass3ym.m21824D(this);
        postInvalidate();
    }

    public AnonymousClass3D1 getAnimationState() {
        return this.f47760G;
    }

    public AnonymousClass3Cv getTileInfo() {
        return this.f47761H;
    }

    public final void onDraw(Canvas canvas) {
        if (getVisibility() == 0) {
            int i;
            Canvas canvas2;
            float f;
            Rect bounds = this.f47758E.getBounds();
            this.f47767N.setStyle(Style.FILL);
            float f2 = 1.0f - ((1.0f - this.f47768O.f39141B) * 0.050000012f);
            Paint paint = this.f47767N;
            Context context = getContext();
            if (!isChecked()) {
                if (!isPressed()) {
                    i = this.f47755B.f39122G;
                    paint.setColor(AnonymousClass0Ca.C(context, i));
                    this.f47767N.setTextSize(((float) this.f47772S) * f2);
                    canvas2 = canvas;
                    canvas2.drawText(this.f47776W, this.f47773T, this.f47774U, this.f47767N);
                    if (this.f47755B.f39118C != 1) {
                        if (isChecked()) {
                            this.f47767N.setStyle(Style.STROKE);
                            this.f47767N.setStrokeWidth(this.f47766M);
                            this.f47767N.setColor(AnonymousClass0Ca.C(getContext(), this.f47755B.f39117B));
                            canvas2.drawLine((float) bounds.left, (float) getHeight(), (float) bounds.right, (float) getHeight(), this.f47767N);
                        }
                    } else if (this.f47755B.f39118C != 2) {
                        this.f47758E.mo4789A(isChecked() ? AnonymousClass0Ca.C(getContext(), this.f47755B.f39117B) : 0);
                    } else if (this.f47755B.f39118C == 3 && isChecked()) {
                        this.f47767N.setStyle(Style.FILL);
                        this.f47767N.setColor(AnonymousClass0Ca.C(getContext(), this.f47755B.f39117B));
                        canvas2.drawCircle((float) bounds.centerX(), (float) ((bounds.bottom + getHeight()) / 2), (float) getResources().getDimensionPixelSize(C0164R.dimen.effect_tile_dot_radius), this.f47767N);
                    }
                    canvas2.save();
                    f = 1.0f - ((1.0f - this.f47768O.f39141B) * 0.07999998f);
                    canvas2.scale(f, f, (float) bounds.centerX(), (float) bounds.centerY());
                    if (this.f47755B.f39121F) {
                        this.f47769P.draw(canvas2);
                    }
                    this.f47758E.draw(canvas2);
                    if (this.f47759F) {
                        this.f47767N.setColor(this.f47765L.equals(AnonymousClass3Ox.m19525B().m19530E().f41615E) ? 0 : -1);
                        this.f47767N.setFakeBoldText(false);
                        this.f47767N.setTextSize((float) getResources().getDimensionPixelOffset(C0164R.dimen.font_xlarge));
                        this.f47767N.getTextBounds(this.f47765L, 0, 1, this.f47771R);
                        canvas2.drawText(String.valueOf(this.f47765L.charAt(0)), (float) bounds.centerX(), (float) (bounds.centerY() + (this.f47771R.height() / 2)), this.f47767N);
                        this.f47767N.setFakeBoldText(true);
                    }
                    canvas2.restore();
                }
            }
            i = this.f47755B.f39123H;
            paint.setColor(AnonymousClass0Ca.C(context, i));
            this.f47767N.setTextSize(((float) this.f47772S) * f2);
            canvas2 = canvas;
            canvas2.drawText(this.f47776W, this.f47773T, this.f47774U, this.f47767N);
            if (this.f47755B.f39118C != 1) {
                if (this.f47755B.f39118C != 2) {
                    this.f47767N.setStyle(Style.FILL);
                    this.f47767N.setColor(AnonymousClass0Ca.C(getContext(), this.f47755B.f39117B));
                    canvas2.drawCircle((float) bounds.centerX(), (float) ((bounds.bottom + getHeight()) / 2), (float) getResources().getDimensionPixelSize(C0164R.dimen.effect_tile_dot_radius), this.f47767N);
                } else {
                    if (isChecked()) {
                    }
                    this.f47758E.mo4789A(isChecked() ? AnonymousClass0Ca.C(getContext(), this.f47755B.f39117B) : 0);
                }
            } else if (isChecked()) {
                this.f47767N.setStyle(Style.STROKE);
                this.f47767N.setStrokeWidth(this.f47766M);
                this.f47767N.setColor(AnonymousClass0Ca.C(getContext(), this.f47755B.f39117B));
                canvas2.drawLine((float) bounds.left, (float) getHeight(), (float) bounds.right, (float) getHeight(), this.f47767N);
            }
            canvas2.save();
            f = 1.0f - ((1.0f - this.f47768O.f39141B) * 0.07999998f);
            canvas2.scale(f, f, (float) bounds.centerX(), (float) bounds.centerY());
            if (this.f47755B.f39121F) {
                this.f47769P.draw(canvas2);
            }
            this.f47758E.draw(canvas2);
            if (this.f47759F) {
                if (this.f47765L.equals(AnonymousClass3Ox.m19525B().m19530E().f41615E)) {
                }
                this.f47767N.setColor(this.f47765L.equals(AnonymousClass3Ox.m19525B().m19530E().f41615E) ? 0 : -1);
                this.f47767N.setFakeBoldText(false);
                this.f47767N.setTextSize((float) getResources().getDimensionPixelOffset(C0164R.dimen.font_xlarge));
                this.f47767N.getTextBounds(this.f47765L, 0, 1, this.f47771R);
                canvas2.drawText(String.valueOf(this.f47765L.charAt(0)), (float) bounds.centerX(), (float) (bounds.centerY() + (this.f47771R.height() / 2)), this.f47767N);
                this.f47767N.setFakeBoldText(true);
            }
            canvas2.restore();
        }
    }

    public final void onMeasure(int i, int i2) {
        int N = AnonymousClass0cQ.N(this, -545040465);
        if (this.f47760G != AnonymousClass3D1.NONE) {
            super.onMeasure(i, i2);
            AnonymousClass0cQ.O(this, 1368318676, N);
            return;
        }
        float size = (float) MeasureSpec.getSize(i2);
        this.f47764K = AnonymousClass3D3.m19041C(getContext(), this.f47755B);
        int min = Math.min(this.f47764K, Math.round(0.85f * size));
        this.f47764K = min;
        setMeasuredDimension(min, Math.round(size));
        AnonymousClass3ym.m21824D(this);
        AnonymousClass0cQ.O(this, 2052890340, N);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r0 = -943499770; // 0xffffffffc7c35606 float:-100012.05 double:NaN;
        r4 = X.AnonymousClass0cQ.M(r7, r0);
        r0 = r7.f47762I;
        r7.getLocationInWindow(r0);
        r6 = r7.f47763J;
        r2 = r7.f47762I;
        r0 = 0;
        r5 = r2[r0];
        r1 = 1;
        r3 = r2[r1];
        r2 = r2[r0];
        r0 = r7.getWidth();
        r2 = r2 + r0;
        r0 = r7.f47762I;
        r1 = r0[r1];
        r0 = r7.getHeight();
        r1 = r1 + r0;
        r6.set(r5, r3, r2, r1);
        r2 = r7.f47763J;
        r0 = r8.getRawX();
        r1 = (int) r0;
        r0 = r8.getRawY();
        r0 = (int) r0;
        r3 = r2.contains(r1, r0);
        r0 = r8.getAction();
        switch(r0) {
            case 0: goto L_0x0053;
            case 1: goto L_0x0041;
            case 2: goto L_0x005e;
            case 3: goto L_0x0046;
            default: goto L_0x0040;
        };
    L_0x0040:
        goto L_0x006f;
    L_0x0041:
        if (r3 == 0) goto L_0x0046;
    L_0x0043:
        r7.performClick();
    L_0x0046:
        r0 = r7.f47756C;
        r7.removeCallbacks(r0);
        X.AnonymousClass3ym.m21822B(r7);
        r0 = 0;
        r7.setPressed(r0);
        goto L_0x006f;
    L_0x0053:
        r0 = r7.f47757D;
        if (r0 == 0) goto L_0x005e;
    L_0x0057:
        r2 = r7.f47756C;
        r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r7.postDelayed(r2, r0);
    L_0x005e:
        if (r3 == 0) goto L_0x0064;
    L_0x0060:
        X.AnonymousClass3ym.m21823C(r7);
        goto L_0x006c;
    L_0x0064:
        r0 = r7.f47756C;
        r7.removeCallbacks(r0);
        X.AnonymousClass3ym.m21822B(r7);
    L_0x006c:
        r7.setPressed(r3);
    L_0x006f:
        r0 = -1091096907; // 0xffffffffbef72eb5 float:-0.48277822 double:NaN;
        X.AnonymousClass0cQ.L(r7, r0, r4);
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3ym.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setConfig(AnonymousClass3Cs anonymousClass3Cs) {
        this.f47755B = anonymousClass3Cs;
        this.f47770Q = getResources().getDimensionPixelSize(this.f47755B.f39120E);
    }

    public void setDraggable(boolean z) {
        this.f47757D = z;
    }

    public final void toggle() {
        if (getParent() instanceof RadioGroup) {
            super.toggle();
        }
    }
}
