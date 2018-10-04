package com.instagram.wellbeing.timespent.ui;

import X.AnonymousClass0Ca;
import X.AnonymousClass0NN;
import X.AnonymousClass0P3;
import X.AnonymousClass0cQ;
import X.AnonymousClass0iq;
import X.AnonymousClass173;
import X.AnonymousClass174;
import X.AnonymousClass177;
import X.AnonymousClass178;
import X.AnonymousClass5Qb;
import X.AnonymousClass5Qf;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TimeSpentBarChartView extends View {
    /* renamed from: B */
    public Paint f63334B;
    /* renamed from: C */
    public Paint f63335C;
    /* renamed from: D */
    public Paint f63336D;
    /* renamed from: E */
    public Paint f63337E;
    /* renamed from: F */
    public Paint f63338F;
    /* renamed from: G */
    public float f63339G;
    /* renamed from: H */
    public List f63340H;
    /* renamed from: I */
    public List f63341I;
    /* renamed from: J */
    public int f63342J;
    /* renamed from: K */
    public float f63343K;
    /* renamed from: L */
    public float f63344L;
    /* renamed from: M */
    public final Resources f63345M = getResources();
    /* renamed from: N */
    public float f63346N;
    /* renamed from: O */
    public Paint f63347O;
    /* renamed from: P */
    public Paint f63348P;
    /* renamed from: Q */
    public AnonymousClass0iq f63349Q;
    /* renamed from: R */
    private List f63350R;
    /* renamed from: S */
    private List f63351S;
    /* renamed from: T */
    private List f63352T;
    /* renamed from: U */
    private float f63353U;
    /* renamed from: V */
    private List f63354V;
    /* renamed from: W */
    private int f63355W;
    /* renamed from: X */
    private int f63356X;

    public TimeSpentBarChartView(Context context) {
        super(context);
        m26488C();
    }

    public TimeSpentBarChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26488C();
    }

    public TimeSpentBarChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26488C();
    }

    /* renamed from: B */
    private int m26487B(float f) {
        int i = 0;
        while (((long) i) < 7) {
            if (f >= ((Float) this.f63350R.get(i)).floatValue() && f <= ((Float) this.f63351S.get(i)).floatValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: C */
    private void m26488C() {
        this.f63346N = TypedValue.applyDimension(1, 4.0f, this.f63345M.getDisplayMetrics());
        this.f63339G = TypedValue.applyDimension(1, 2.0f, this.f63345M.getDisplayMetrics());
        this.f63343K = TypedValue.applyDimension(1, 30.0f, this.f63345M.getDisplayMetrics());
        this.f63344L = TypedValue.applyDimension(2, 10.0f, this.f63345M.getDisplayMetrics());
        Paint paint = new Paint(1);
        this.f63334B = paint;
        paint.setStyle(Style.FILL);
        this.f63334B.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.bar_color_0_percent));
        paint = new Paint(1);
        this.f63336D = paint;
        paint.setStyle(Style.FILL);
        this.f63336D.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.bar_color_25_percent));
        paint = new Paint(1);
        this.f63337E = paint;
        paint.setStyle(Style.FILL);
        this.f63337E.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.bar_color_50_percent));
        paint = new Paint(1);
        this.f63338F = paint;
        paint.setStyle(Style.FILL);
        this.f63338F.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.bar_color_75_percent));
        paint = new Paint(1);
        this.f63335C = paint;
        paint.setStyle(Style.FILL);
        this.f63335C.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.bar_color_100_percent));
        Paint paint2 = new Paint(1);
        this.f63347O = paint2;
        paint2.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5));
        this.f63347O.setTextAlign(Align.CENTER);
        this.f63347O.setTypeface(Typeface.SANS_SERIF);
        this.f63347O.setTextSize(this.f63344L);
        paint2 = new Paint(1);
        this.f63348P = paint2;
        paint2.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.black));
        this.f63348P.setTextAlign(Align.CENTER);
        this.f63348P.setTypeface(Typeface.create("sans-serif", 1));
        this.f63348P.setTextSize(this.f63344L);
        this.f63350R = new ArrayList(Arrays.asList(new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)}));
        this.f63351S = new ArrayList(Arrays.asList(new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)}));
        this.f63352T = new ArrayList(Arrays.asList(new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)}));
        this.f63355W = -1;
    }

    /* renamed from: D */
    private Paint m26489D(float f) {
        if (f == 0.0f) {
            return this.f63334B;
        }
        if (f <= 0.25f) {
            return this.f63336D;
        }
        if (f <= 0.5f) {
            return this.f63337E;
        }
        if (f <= 0.75f) {
            return this.f63338F;
        }
        return this.f63335C;
    }

    /* renamed from: E */
    private void m26490E() {
        AnonymousClass173 B = new AnonymousClass173((Activity) getContext(), new AnonymousClass174(AnonymousClass0P3.C(getContext(), this.f63345M, false, ((Long) this.f63340H.get(this.f63355W)).longValue()))).B((int) ((((Float) this.f63350R.get(this.f63355W)).floatValue() + ((Float) this.f63351S.get(this.f63355W)).floatValue()) / 2.0f), ((Float) this.f63352T.get(this.f63355W)).intValue() - getContext().getResources().getDimensionPixelSize(C0164R.dimen.time_spent_bar_chart_tooltip_anchor_margin), false, this);
        B.f14642H = AnonymousClass177.ABOVE_ANCHOR;
        B.f14648N = AnonymousClass178.f14655F;
        this.f63349Q = B.A();
        int i = this.f63355W;
        AnonymousClass0NN.B("ig_ts_day_chart_bar_tap", null).B(AnonymousClass5Qb.BAR_IDX.m26475A(), i).C(AnonymousClass5Qb.USAGE_SECONDS.m26475A(), ((Long) this.f63340H.get(i)).longValue()).R();
        this.f63349Q.C();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        while (true) {
            long j = (long) i;
            if (j < 7) {
                RectF rectF = new RectF(((Float) this.f63350R.get(i)).floatValue(), ((Float) this.f63352T.get(i)).floatValue(), ((Float) this.f63351S.get(i)).floatValue(), ((float) this.f63342J) - this.f63343K);
                float f = this.f63339G;
                canvas.drawRoundRect(rectF, f, f, m26489D(((Float) this.f63341I.get(i)).floatValue()));
                canvas.drawText(this.f63345M.getString(((AnonymousClass5Qf) this.f63354V.get(i)).m26481A()), (((Float) this.f63350R.get(i)).floatValue() + ((Float) this.f63351S.get(i)).floatValue()) / 2.0f, (((float) this.f63342J) - (this.f63343K / 2.0f)) - ((this.f63347O.descent() + this.f63347O.ascent()) / 2.0f), j == 6 ? this.f63348P : this.f63347O);
                i++;
            } else {
                return;
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -24073034);
        super.onSizeChanged(i, i2, i3, i4);
        this.f63356X = i;
        this.f63342J = i2;
        float f = (((float) this.f63356X) - (this.f63346N * 6.0f)) / 7.0f;
        this.f63353U = f;
        float f2 = 0.0f;
        f += 0.0f;
        for (int i5 = 0; ((long) i5) < 7; i5++) {
            float f3;
            this.f63350R.set(i5, Float.valueOf(f2));
            this.f63351S.set(i5, Float.valueOf(f));
            List list = this.f63352T;
            if (((Long) this.f63340H.get(i5)).longValue() < 60) {
                f3 = 0.985f;
            } else {
                f3 = 1.0f - ((Float) this.f63341I.get(i5)).floatValue();
            }
            list.set(i5, Float.valueOf(f3 * (((float) this.f63342J) - this.f63343K)));
            f2 = this.f63346N + f;
            f = this.f63353U + f2;
        }
        AnonymousClass0cQ.O(this, -363849753, N);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = -228382756; // 0xfffffffff26327dc float:-4.4992822E30 double:NaN;
        r4 = X.AnonymousClass0cQ.M(r5, r0);
        r0 = r6.getPointerCount();
        r3 = 1;
        if (r0 <= r3) goto L_0x0015;
    L_0x000e:
        r0 = 1993239025; // 0x76ce69f1 float:2.093285E33 double:9.84790926E-315;
        X.AnonymousClass0cQ.L(r5, r0, r4);
        return r3;
    L_0x0015:
        r0 = 0;
        r0 = r6.getX(r0);
        r2 = r5.m26487B(r0);
        r0 = -1;
        if (r2 != r0) goto L_0x0032;
    L_0x0021:
        r1 = r5.f63349Q;
        if (r1 == 0) goto L_0x0029;
    L_0x0025:
        r0 = 1;
        r1.A(r0);
    L_0x0029:
        r5.f63355W = r2;
        r0 = -1716691053; // 0xffffffff99ad5f93 float:-1.7926383E-23 double:NaN;
        X.AnonymousClass0cQ.L(r5, r0, r4);
        return r3;
    L_0x0032:
        r0 = r6.getActionMasked();
        switch(r0) {
            case 0: goto L_0x0046;
            case 1: goto L_0x004c;
            case 2: goto L_0x003a;
            default: goto L_0x0039;
        };
    L_0x0039:
        goto L_0x0053;
    L_0x003a:
        r0 = r5.f63355W;
        if (r2 == r0) goto L_0x0053;
    L_0x003e:
        r1 = r5.f63349Q;
        if (r1 == 0) goto L_0x0046;
    L_0x0042:
        r0 = 1;
        r1.A(r0);
    L_0x0046:
        r5.f63355W = r2;
        r5.m26490E();
        goto L_0x0053;
    L_0x004c:
        r5.f63355W = r2;
        r0 = r5.f63349Q;
        r0.A(r3);
    L_0x0053:
        r0 = -178915477; // 0xfffffffff555f76b float:-2.7123473E32 double:NaN;
        X.AnonymousClass0cQ.L(r5, r0, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.timespent.ui.TimeSpentBarChartView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDailyUsageData(List list) {
        this.f63340H = list;
        long longValue = ((Long) Collections.max(list)).longValue();
        this.f63341I = new ArrayList();
        for (Long l : list) {
            if (longValue == 0) {
                this.f63341I.add(Float.valueOf(0.0f));
            } else {
                this.f63341I.add(Float.valueOf(l.floatValue() / ((float) longValue)));
            }
        }
        invalidate();
    }

    public void setLabels(List list) {
        this.f63354V = list;
        invalidate();
    }
}
