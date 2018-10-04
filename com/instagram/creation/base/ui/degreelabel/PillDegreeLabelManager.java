package com.instagram.creation.base.ui.degreelabel;

import X.AnonymousClass0Ca;
import X.AnonymousClass0G5;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass3Cm;
import X.AnonymousClass3Cn;
import X.AnonymousClass3Co;
import X.AnonymousClass3Cp;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PillDegreeLabelManager extends View implements AnonymousClass3Cm {
    /* renamed from: B */
    public boolean f47710B = true;
    /* renamed from: C */
    public float f47711C = Float.NaN;
    /* renamed from: D */
    public boolean f47712D;
    /* renamed from: E */
    private String f47713E = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: F */
    private final Handler f47714F = new AnonymousClass3Cn(this);
    /* renamed from: G */
    private final ShapeDrawable f47715G = new ShapeDrawable();
    /* renamed from: H */
    private AnonymousClass0cN f47716H;
    /* renamed from: I */
    private float f47717I;
    /* renamed from: J */
    private float f47718J;
    /* renamed from: K */
    private float f47719K;
    /* renamed from: L */
    private AnonymousClass0cN f47720L;
    /* renamed from: M */
    private AnonymousClass0cN f47721M;
    /* renamed from: N */
    private Drawable f47722N;
    /* renamed from: O */
    private AnonymousClass0cN f47723O;
    /* renamed from: P */
    private AnonymousClass0cN f47724P;
    /* renamed from: Q */
    private boolean f47725Q;
    /* renamed from: R */
    private int f47726R;
    /* renamed from: S */
    private float f47727S;
    /* renamed from: T */
    private AnonymousClass0e6 f47728T;
    /* renamed from: U */
    private AnonymousClass0cN f47729U;
    /* renamed from: V */
    private float f47730V;
    /* renamed from: W */
    private final Paint f47731W = new Paint();
    /* renamed from: X */
    private float f47732X;
    /* renamed from: Y */
    private float f47733Y;
    /* renamed from: Z */
    private DrawableContainer f47734Z;
    /* renamed from: a */
    private AnonymousClass0cN f47735a;
    /* renamed from: b */
    private AnonymousClass0cN f47736b;
    /* renamed from: c */
    private int f47737c;

    public PillDegreeLabelManager(Context context) {
        super(AnonymousClass0G5.C(context, C0164R.attr.pillLabelStyle));
        m21815F();
    }

    public PillDegreeLabelManager(Context context, AttributeSet attributeSet) {
        super(AnonymousClass0G5.C(context, C0164R.attr.pillLabelStyle), attributeSet);
        m21815F();
    }

    public PillDegreeLabelManager(Context context, AttributeSet attributeSet, int i) {
        super(AnonymousClass0G5.C(context, C0164R.attr.pillLabelStyle), attributeSet, i);
        m21815F();
    }

    /* renamed from: B */
    public static void m21811B(PillDegreeLabelManager pillDegreeLabelManager) {
        float height = ((float) pillDegreeLabelManager.getHeight()) / 2.0f;
        float E = (float) pillDegreeLabelManager.f47735a.E();
        float E2 = (float) pillDegreeLabelManager.f47736b.E();
        float E3 = (float) pillDegreeLabelManager.f47720L.E();
        float E4 = (float) pillDegreeLabelManager.f47721M.E();
        int D = m21813D(pillDegreeLabelManager.f47716H);
        float E5 = (float) pillDegreeLabelManager.f47724P.E();
        int D2 = m21813D(pillDegreeLabelManager.f47723O);
        if (D2 < 255 && pillDegreeLabelManager.f47724P.f7106D != -1000.0d) {
            E5 -= ((float) pillDegreeLabelManager.f47722N.getIntrinsicHeight()) * (((float) (255 - D2)) / 255.0f);
        }
        float f = height - (E2 / 2.0f);
        pillDegreeLabelManager.f47734Z.setBounds((int) E, (int) f, Math.round(E + E2), Math.round(f + E2));
        E2 = height - (pillDegreeLabelManager.f47717I / 2.0f);
        pillDegreeLabelManager.f47715G.setBounds((int) E3, (int) E2, Math.round(E3 + E4), Math.round(E2 + pillDegreeLabelManager.f47717I));
        pillDegreeLabelManager.f47715G.setAlpha(D);
        pillDegreeLabelManager.f47731W.setAlpha(D);
        int round = Math.round(height) - (pillDegreeLabelManager.f47722N.getIntrinsicHeight() / 2);
        Drawable drawable = pillDegreeLabelManager.f47722N;
        drawable.setBounds((int) E5, round, Math.round(E5 + ((float) drawable.getIntrinsicWidth())), pillDegreeLabelManager.f47722N.getIntrinsicHeight() + round);
        pillDegreeLabelManager.f47722N.setAlpha(D2);
        pillDegreeLabelManager.invalidate();
    }

    /* renamed from: C */
    public static void m21812C(PillDegreeLabelManager pillDegreeLabelManager) {
        if (pillDegreeLabelManager.f47712D) {
            float width = ((float) pillDegreeLabelManager.getWidth()) / 2.0f;
            boolean z = pillDegreeLabelManager.f47710B;
            double d = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
            float intrinsicWidth;
            if (z) {
                intrinsicWidth = (float) pillDegreeLabelManager.f47734Z.getIntrinsicWidth();
                double d2 = (double) intrinsicWidth;
                m21816G(pillDegreeLabelManager.f47736b, d2);
                double d3 = (double) (width - (intrinsicWidth / 2.0f));
                m21816G(pillDegreeLabelManager.f47735a, d3);
                m21816G(pillDegreeLabelManager.f47729U, (double) width);
                m21816G(pillDegreeLabelManager.f47724P, -1000.0d);
                m21816G(pillDegreeLabelManager.f47723O, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
                m21816G(pillDegreeLabelManager.f47721M, d2);
                m21816G(pillDegreeLabelManager.f47716H, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
                m21816G(pillDegreeLabelManager.f47720L, d3);
            } else {
                float f = pillDegreeLabelManager.f47733Y;
                float f2 = pillDegreeLabelManager.f47727S;
                m21816G(pillDegreeLabelManager.f47736b, (double) f2);
                intrinsicWidth = pillDegreeLabelManager.f47730V;
                f += intrinsicWidth + f2;
                if (pillDegreeLabelManager.f47725Q) {
                    f += intrinsicWidth + ((float) pillDegreeLabelManager.f47722N.getIntrinsicWidth());
                }
                f += pillDegreeLabelManager.f47718J + pillDegreeLabelManager.f47719K;
                m21816G(pillDegreeLabelManager.f47721M, (double) f);
                m21816G(pillDegreeLabelManager.f47716H, 255.0d);
                width -= f / 2.0f;
                m21816G(pillDegreeLabelManager.f47720L, (double) width);
                width += pillDegreeLabelManager.f47718J;
                m21816G(pillDegreeLabelManager.f47735a, (double) width);
                width += f2 + pillDegreeLabelManager.f47730V;
                m21816G(pillDegreeLabelManager.f47729U, (double) ((pillDegreeLabelManager.f47733Y / 2.0f) + width));
                m21816G(pillDegreeLabelManager.f47724P, (double) ((width + pillDegreeLabelManager.f47733Y) + pillDegreeLabelManager.f47730V));
                AnonymousClass0cN anonymousClass0cN = pillDegreeLabelManager.f47723O;
                if (pillDegreeLabelManager.f47725Q) {
                    d = 255.0d;
                }
                m21816G(anonymousClass0cN, d);
            }
            m21811B(pillDegreeLabelManager);
        }
    }

    /* renamed from: D */
    private static int m21813D(AnonymousClass0cN anonymousClass0cN) {
        return Math.max(Math.min((int) Math.round(anonymousClass0cN.E()), 255), 0);
    }

    /* renamed from: E */
    private AnonymousClass0cN m21814E(AnonymousClass0e5 anonymousClass0e5) {
        AnonymousClass0cN M = this.f47728T.C().O(anonymousClass0e5).M(-1000.0d, true);
        M.f7105C = 1.0d;
        M.f7110H = 60.0d;
        M.f7108F = true;
        return M;
    }

    /* renamed from: F */
    private void m21815F() {
        this.f47728T = AnonymousClass0e6.B();
        AnonymousClass0e5 C = AnonymousClass0e5.C(20.0d, 4.0d);
        this.f47735a = m21814E(C);
        this.f47736b = m21814E(C);
        this.f47721M = m21814E(C);
        this.f47720L = m21814E(C);
        this.f47716H = m21814E(C);
        this.f47729U = m21814E(C);
        this.f47724P = m21814E(C);
        this.f47723O = m21814E(C);
        Resources resources = getResources();
        this.f47726R = AnonymousClass0G5.D(getContext(), C0164R.attr.pillSelectedColor);
        this.f47737c = AnonymousClass0G5.D(getContext(), C0164R.attr.pillUnselectedColor);
        float dimension = resources.getDimension(C0164R.dimen.pill_degree_label_border_width);
        Drawable drawable = resources.getDrawable(C0164R.drawable.adjust_reset_off);
        this.f47722N = drawable;
        drawable.mutate();
        this.f47717I = resources.getDimension(C0164R.dimen.pill_degree_label_height);
        this.f47718J = resources.getDimension(C0164R.dimen.pill_degree_label_padding_left);
        this.f47719K = resources.getDimension(C0164R.dimen.pill_degree_label_padding_right);
        this.f47730V = resources.getDimension(C0164R.dimen.pill_degree_label_text_padding);
        this.f47727S = resources.getDimension(C0164R.dimen.pill_degree_label_shrunk_icon_size);
        float f = this.f47717I / 2.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = f;
        }
        this.f47715G.setShape(new RoundRectShape(fArr, null, null));
        this.f47715G.getPaint().setStyle(Style.STROKE);
        this.f47715G.getPaint().setStrokeWidth(dimension);
        this.f47731W.setTextSize(resources.getDimension(C0164R.dimen.pill_degree_label_text_size));
        this.f47731W.setAntiAlias(true);
        FontMetrics fontMetrics = this.f47731W.getFontMetrics();
        this.f47732X = (fontMetrics.ascent + fontMetrics.descent) / 2.0f;
        addOnLayoutChangeListener(new AnonymousClass3Co(this));
    }

    /* renamed from: G */
    private static void m21816G(AnonymousClass0cN anonymousClass0cN, double d) {
        if (d != -1000.0d) {
            if (anonymousClass0cN.E() != -1000.0d) {
                anonymousClass0cN.N(d);
                return;
            }
        }
        anonymousClass0cN.M(d, true);
    }

    public final void dV() {
        if (this.f47714F.hasMessages(1)) {
            this.f47710B = true;
            this.f47714F.removeMessages(1);
        }
        for (AnonymousClass0cN anonymousClass0cN : this.f47728T.D()) {
            anonymousClass0cN.M(anonymousClass0cN.E(), true);
        }
        this.f47728T.F();
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 738023877);
        super.onDetachedFromWindow();
        this.f47714F.removeMessages(1);
        AnonymousClass0cQ.O(this, -1439474659, N);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f47734Z.draw(canvas);
        Object obj = this.f47716H.E() >= 1.0d ? 1 : null;
        if (obj != null) {
            String str = this.f47713E;
            double E = this.f47729U.E();
            double d = (double) (this.f47733Y / 2.0f);
            Double.isNaN(d);
            canvas.drawText(str, (float) Math.round(E - d), (float) Math.round((((float) getHeight()) / 2.0f) - this.f47732X), this.f47731W);
        }
        if (this.f47724P.f7106D != -1000.0d && this.f47723O.E() >= 1.0d) {
            this.f47722N.draw(canvas);
        }
        if (obj != null && this.f47721M.E() > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            this.f47715G.draw(canvas);
        }
    }

    public void setDegree(float f) {
        if (this.f47712D) {
            if (!(f == 0.0f && this.f47710B)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(String.valueOf(f));
                stringBuilder.append('°');
                this.f47713E = stringBuilder.toString();
                this.f47714F.removeMessages(1);
                float measureText = this.f47731W.measureText(this.f47713E);
                if (this.f47710B || Math.abs(this.f47733Y - measureText) >= 2.0f) {
                    this.f47710B = false;
                    this.f47733Y = measureText;
                    m21812C(this);
                } else {
                    invalidate();
                }
                if (f == 0.0f) {
                    this.f47714F.sendEmptyMessageDelayed(1, 750);
                }
            }
            return;
        }
        this.f47711C = f;
    }

    public void setDegreeLabelResource(int i) {
        this.f47734Z = (DrawableContainer) AnonymousClass0Ca.E(getContext(), i);
    }

    public void setSelected(boolean z) {
        this.f47725Q = z;
        this.f47734Z.selectDrawable(this.f47725Q ^ 1);
        int i = this.f47725Q ? this.f47726R : this.f47737c;
        this.f47722N.setColorFilter(AnonymousClass0ca.B(i));
        this.f47734Z.setColorFilter(AnonymousClass0ca.B(i));
        this.f47715G.getPaint().setColor(i);
        this.f47731W.setColor(i);
        m21812C(this);
    }

    public final void vTA() {
        this.f47728T.B(new AnonymousClass3Cp(this));
    }
}
