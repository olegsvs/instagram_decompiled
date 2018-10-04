package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.162 */
public final class AnonymousClass162 extends AnonymousClass163 implements AnonymousClass0QP, Callback, AnonymousClass164 {
    private static final AnonymousClass0e5 PB = AnonymousClass0e5.m6188B(5.0d, 10.0d);
    private float AB;
    /* renamed from: B */
    public final Context f14402B;
    private float BB = 1.0f;
    /* renamed from: C */
    public final int f14403C;
    private float CB = 1.0f;
    /* renamed from: D */
    public Runnable f14404D;
    private final float DB;
    /* renamed from: E */
    public final boolean f14405E;
    private AnonymousClass2bu EB;
    /* renamed from: F */
    public float f14406F = 1.0f;
    private int FB;
    /* renamed from: G */
    public final AnonymousClass2bu f14407G;
    private float GB;
    /* renamed from: H */
    public int f14408H;
    private float HB;
    /* renamed from: I */
    public int f14409I;
    private int IB;
    /* renamed from: J */
    public Shader f14410J;
    private final int JB;
    /* renamed from: K */
    public final int f14411K;
    private final Drawable KB;
    /* renamed from: L */
    public final int f14412L;
    private final int LB;
    /* renamed from: M */
    public final int f14413M;
    private final PorterDuffXfermode MB = new PorterDuffXfermode(Mode.SRC_IN);
    /* renamed from: N */
    public final String f14414N;
    private final float NB;
    /* renamed from: O */
    public final AnonymousClass27W f14415O;
    private final int OB;
    /* renamed from: P */
    public Shader f14416P;
    /* renamed from: Q */
    public float f14417Q = 1.0f;
    /* renamed from: R */
    public final AnonymousClass2bu f14418R;
    /* renamed from: S */
    public int f14419S;
    /* renamed from: T */
    public int f14420T;
    /* renamed from: U */
    public final boolean f14421U;
    /* renamed from: V */
    public final AnonymousClass0cN f14422V;
    /* renamed from: W */
    public Integer f14423W;
    /* renamed from: X */
    private final int f14424X;
    /* renamed from: Y */
    private final RectF f14425Y;
    /* renamed from: Z */
    private float f14426Z;
    /* renamed from: a */
    private final int f14427a;
    /* renamed from: b */
    private final int f14428b;
    /* renamed from: c */
    private float f14429c;
    /* renamed from: d */
    private float f14430d;
    /* renamed from: e */
    private float f14431e;
    /* renamed from: f */
    private float f14432f = 1.0f;
    /* renamed from: g */
    private float f14433g = 1.0f;
    /* renamed from: h */
    private final float f14434h;
    /* renamed from: i */
    private AnonymousClass2bu f14435i;
    /* renamed from: j */
    private int f14436j;
    /* renamed from: k */
    private float f14437k;
    /* renamed from: l */
    private float f14438l;
    /* renamed from: m */
    private int f14439m;
    /* renamed from: n */
    private final int f14440n;
    /* renamed from: o */
    private Bitmap f14441o;
    /* renamed from: p */
    private Canvas f14442p;
    /* renamed from: q */
    private final RectF f14443q;
    /* renamed from: r */
    private final int f14444r;
    /* renamed from: s */
    private final int f14445s;
    /* renamed from: t */
    private float f14446t;
    /* renamed from: u */
    private float f14447u;
    /* renamed from: v */
    private int[] f14448v;
    /* renamed from: w */
    private float f14449w;
    /* renamed from: x */
    private final int f14450x;
    /* renamed from: y */
    private final Paint f14451y;
    /* renamed from: z */
    private final AnonymousClass2bu f14452z;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public AnonymousClass162(AnonymousClass27V anonymousClass27V) {
        CharSequence charSequence;
        this.f14402B = anonymousClass27V.f26264B;
        AnonymousClass0cN C = AnonymousClass0e6.m6190B().m6193C();
        C.f7108F = true;
        this.f14422V = C.m5770O(PB).m5756A(this);
        this.f14414N = anonymousClass27V.f26268F;
        this.f14421U = anonymousClass27V.f26273K;
        this.f14405E = anonymousClass27V.f26265C;
        Resources resources = this.f14402B.getResources();
        this.f14424X = AnonymousClass0Ca.m937C(this.f14402B, C0164R.color.polling_background_color);
        this.JB = AnonymousClass0Ca.m937C(this.f14402B, C0164R.color.polling_background_selected_color);
        this.f14428b = AnonymousClass0Ca.m937C(this.f14402B, C0164R.color.polling_options_divider_color);
        this.f14450x = resources.getDimensionPixelSize(C0164R.dimen.polling_option_width);
        this.f14411K = resources.getDimensionPixelSize(C0164R.dimen.polling_option_height);
        this.f14413M = resources.getDimensionPixelSize(C0164R.dimen.polling_option_vertical_padding);
        this.f14444r = resources.getDimensionPixelSize(C0164R.dimen.polling_option_horizontal_padding);
        this.f14445s = resources.getDimensionPixelSize(C0164R.dimen.polling_option_minimum_horizontal_padding);
        this.f14412L = resources.getDimensionPixelSize(C0164R.dimen.polling_option_result_bottom_padding);
        this.f14403C = resources.getDimensionPixelSize(C0164R.dimen.polling_options_divider_width);
        this.f14427a = resources.getDimensionPixelSize(C0164R.dimen.polling_background_corner_radius);
        this.LB = resources.getDimensionPixelSize(C0164R.dimen.polling_shadow_width);
        this.NB = (((float) this.f14450x) * ((float) Math.sqrt(2.0d))) / 2.0f;
        this.f14407G = new AnonymousClass2bu(this.f14402B, m9357H());
        AnonymousClass27w.C(this.f14402B, this.f14407G, anonymousClass27V.f26267E, 0.0f, 0.0f);
        AnonymousClass2bu anonymousClass2bu = this.f14407G;
        if (this.f14421U) {
            charSequence = anonymousClass27V.f26266D;
        } else {
            charSequence = AnonymousClass162.m9354E(anonymousClass27V.f26266D, AnonymousClass27E.f26113C);
        }
        anonymousClass2bu.I(charSequence);
        this.f14407G.setCallback(this);
        this.f14439m = this.f14407G.getIntrinsicWidth();
        this.f14408H = this.f14407G.getIntrinsicHeight();
        this.f14434h = this.f14407G.f31510I.descent();
        this.f14418R = new AnonymousClass2bu(this.f14402B, m9357H());
        AnonymousClass27w.C(this.f14402B, this.f14418R, anonymousClass27V.f26271I, 0.0f, 0.0f);
        anonymousClass2bu = this.f14418R;
        if (this.f14421U) {
            charSequence = anonymousClass27V.f26270H;
        } else {
            charSequence = AnonymousClass162.m9354E(anonymousClass27V.f26270H, AnonymousClass27E.f26114D);
        }
        anonymousClass2bu.I(charSequence);
        this.f14418R.setCallback(this);
        this.IB = this.f14418R.getIntrinsicWidth();
        this.f14419S = this.f14418R.getIntrinsicHeight();
        this.DB = this.f14418R.f31510I.descent();
        AnonymousClass27W anonymousClass27W = anonymousClass27V.f26269G;
        this.f14415O = anonymousClass27W;
        if (anonymousClass27W != null) {
            this.f14452z = new AnonymousClass2bu(this.f14402B, anonymousClass27W.f26274B);
            AnonymousClass27w.D(this.f14402B, this.f14452z, this.f14415O.f26277E, 0.0f, 0.0f);
            this.f14452z.I(this.f14415O.f26276D);
        } else {
            this.f14452z = null;
        }
        if (anonymousClass27V.f26272J) {
            this.KB = AnonymousClass0Ca.m939E(this.f14402B, C0164R.drawable.question_background_shadow);
        } else {
            this.KB = null;
        }
        int intrinsicHeight = this.f14415O != null ? this.f14452z.getIntrinsicHeight() + this.f14415O.f26275C : 0;
        this.OB = (this.f14450x * 2) + this.f14403C;
        this.f14440n = intrinsicHeight + this.f14411K;
        Paint paint = new Paint(7);
        this.f14451y = paint;
        paint.setStyle(Style.FILL);
        this.f14425Y = new RectF(0.0f, 0.0f, (float) this.OB, (float) this.f14411K);
        this.f14443q = new RectF();
    }

    /* renamed from: A */
    public final boolean mo2134A() {
        return this.f14421U ^ 1;
    }

    /* renamed from: B */
    public static void m9351B(AnonymousClass162 anonymousClass162, Context context, AnonymousClass2bu anonymousClass2bu) {
        Spannable spannableStringBuilder = new SpannableStringBuilder(anonymousClass2bu.f31514M);
        int length = spannableStringBuilder.length();
        Drawable mutate = AnonymousClass0Ca.m939E(context, C0164R.drawable.circle_check).mutate();
        mutate.setColorFilter(AnonymousClass0ca.m5921B(-1));
        float B = anonymousClass2bu.B() / ((float) context.getResources().getDimensionPixelSize(C0164R.dimen.polling_option_text_size));
        int round = Math.round(((float) mutate.getIntrinsicWidth()) * B);
        mutate.setBounds(0, 0, round, Math.round(((float) mutate.getIntrinsicHeight()) * B));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.polling_option_checkbox_margin);
        AnonymousClass2JU anonymousClass2JU = new AnonymousClass2JU(mutate);
        anonymousClass2JU.f28821B = AnonymousClass2JT.f28820E;
        anonymousClass2JU.f28822C = dimensionPixelSize;
        spannableStringBuilder.append(" ");
        spannableStringBuilder.setSpan(anonymousClass2JU, length, length + 1, 33);
        anonymousClass2bu.F((anonymousClass162.m9357H() + round) + (dimensionPixelSize * 2));
        anonymousClass2bu.H(spannableStringBuilder);
    }

    /* renamed from: B */
    public final void m9359B(int[] iArr) {
        this.f14448v = iArr;
        AnonymousClass2bu F = m9355F(iArr[0]);
        this.f14435i = F;
        F.setCallback(this);
        this.f14436j = this.f14435i.getIntrinsicWidth();
        this.f14409I = this.f14435i.getIntrinsicHeight();
        F = m9355F(iArr[1]);
        this.EB = F;
        F.setCallback(this);
        this.FB = this.EB.getIntrinsicWidth();
        this.f14420T = this.EB.getIntrinsicHeight();
        if (iArr[0] != 0 || iArr[1] != 0) {
            int i = this.f14450x * 2;
            int round = Math.round((((float) iArr[0]) / 100.0f) * ((float) i));
            int i2 = i - round;
            int max = i - (round > 0 ? Math.max(round, Math.max(this.f14439m, this.f14436j) + (this.f14445s * 2)) : round);
            if (max > 0) {
                max = Math.max(max, Math.max(this.IB, this.FB) + (this.f14445s * 2));
            }
            i -= max;
            float f = (float) round;
            int i3 = this.f14450x;
            this.f14433g = f / ((float) i3);
            this.CB = ((float) i2) / ((float) i3);
            this.f14429c = (float) (round - i3);
            this.f14437k = (((float) i) / 2.0f) - (((float) i3) / 2.0f);
            int i4 = this.OB;
            this.GB = (((float) i4) - (((float) max) / 2.0f)) - (((float) i4) - (((float) i3) / 2.0f));
            if (iArr[0] == 0) {
                this.f14429c = (float) ((-this.f14403C) - i3);
                f = ((float) (-Math.max(this.f14439m, this.f14436j))) / 2.0f;
                i = this.f14450x;
                this.f14437k = f - (((float) i) / 2.0f);
                this.CB = ((float) (this.f14403C + i2)) / ((float) i);
            } else if (iArr[1] == 0) {
                this.f14429c = (float) (i4 - i3);
                float max2 = ((float) i4) + (((float) Math.max(this.IB, this.FB)) / 2.0f);
                f = (float) this.OB;
                i = this.f14450x;
                this.GB = max2 - (f - (((float) i) / 2.0f));
                this.f14433g = ((float) (this.f14403C + round)) / ((float) i);
            }
            if (this.f14421U) {
                int C = AnonymousClass0Ca.m937C(this.f14402B, C0164R.color.polling_result_highlighted_option_text_color);
                int C2 = AnonymousClass0Ca.m937C(this.f14402B, C0164R.color.polling_result_unhighlighted_option_text_color);
                float f2 = (float) round;
                float f3 = (float) this.f14411K;
                int[] iArr2 = AnonymousClass27E.f26113C;
                float[] fArr = AnonymousClass27E.f26112B;
                TileMode tileMode = TileMode.CLAMP;
                this.f14410J = new LinearGradient(0.0f, 0.0f, f2, f3, iArr2, fArr, tileMode);
                round += this.f14403C;
                this.f14416P = new LinearGradient((float) round, 0.0f, (float) (round + i2), (float) this.f14411K, AnonymousClass27E.f26114D, fArr, tileMode);
                switch (AnonymousClass162.m9352C(this).ordinal()) {
                    case 3:
                        AnonymousClass162.m9353D(this, C, C2);
                        if (this.f14405E) {
                            AnonymousClass162.m9351B(this, this.f14402B, this.f14407G);
                            break;
                        }
                        break;
                    case 4:
                        AnonymousClass162.m9353D(this, C2, C);
                        if (this.f14405E) {
                            AnonymousClass162.m9351B(this, this.f14402B, this.f14418R);
                            break;
                        }
                        break;
                    case 5:
                        AnonymousClass162.m9353D(this, C, C);
                        break;
                    default:
                        break;
                }
            }
            invalidateSelf();
        }
    }

    /* renamed from: C */
    public static AnonymousClass27U m9352C(AnonymousClass162 anonymousClass162) {
        if (anonymousClass162.f14421U) {
            anonymousClass162 = anonymousClass162.f14448v;
            if (anonymousClass162[0] > anonymousClass162[1]) {
                return AnonymousClass27U.f26259F;
            }
            if (anonymousClass162[0] < anonymousClass162[1]) {
                return AnonymousClass27U.f26261H;
            }
            return AnonymousClass27U.f26257D;
        }
        Integer num = anonymousClass162.f14423W;
        if (num == null) {
            return AnonymousClass27U.f26258E;
        }
        return num.intValue() == 0 ? AnonymousClass27U.f26260G : AnonymousClass27U.f26262I;
    }

    /* renamed from: D */
    public static void m9353D(AnonymousClass162 anonymousClass162, int i, int i2) {
        anonymousClass162.f14407G.J(i);
        AnonymousClass2bu anonymousClass2bu = anonymousClass162.f14435i;
        if (anonymousClass2bu != null) {
            anonymousClass2bu.J(i);
        }
        anonymousClass162.f14418R.J(i2);
        anonymousClass2bu = anonymousClass162.EB;
        if (anonymousClass2bu != null) {
            anonymousClass2bu.J(i2);
        }
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        if (anonymousClass0cN.f7106D == 1.0d) {
            anonymousClass0cN.m5769N(2.0d);
        } else if (anonymousClass0cN.f7106D == 2.0d) {
            Runnable runnable = this.f14404D;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: E */
    private static Spannable m9354E(String str, int[] iArr) {
        AnonymousClass2JS anonymousClass2JS = new AnonymousClass2JS(iArr, AnonymousClass27E.f26112B);
        Spannable spannableString = new SpannableString(str);
        spannableString.setSpan(anonymousClass2JS, 0, spannableString.length(), 33);
        return spannableString;
    }

    /* renamed from: F */
    private AnonymousClass2bu m9355F(int i) {
        Resources resources = this.f14402B.getResources();
        float dimensionPixelSize = (float) resources.getDimensionPixelSize(C0164R.dimen.polling_option_result_text_size);
        AnonymousClass2bu anonymousClass2bu = new AnonymousClass2bu(this.f14402B, m9357H());
        AnonymousClass27w.C(this.f14402B, anonymousClass2bu, dimensionPixelSize, 0.0f, 0.0f);
        anonymousClass2bu.J(AnonymousClass0Ca.m937C(this.f14402B, C0164R.color.grey_9));
        anonymousClass2bu.I(resources.getString(C0164R.string.polling_option_result, new Object[]{Integer.valueOf(i)}));
        return anonymousClass2bu;
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float E = (float) anonymousClass0cN.m5760E();
        float min = Math.min(E, 1.0f);
        double d = (double) min;
        this.f14431e = ((float) AnonymousClass0dh.m6103C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f14406F, (double) (((float) (((this.f14411K - this.f14412L) - this.f14409I) - (this.f14413M * 2))) / ((float) this.f14408H)))) - this.f14406F;
        this.AB = ((float) AnonymousClass0dh.m6103C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f14417Q, (double) (((float) (((this.f14411K - this.f14412L) - this.f14420T) - (this.f14413M * 2))) / ((float) this.f14419S)))) - this.f14417Q;
        int i = this.f14411K;
        this.f14449w = (float) AnonymousClass0dh.m6103C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) ((((float) ((i - this.f14412L) - this.f14409I)) / 2.0f) - (((float) i) / 2.0f)));
        i = this.f14411K;
        this.f14447u = (float) AnonymousClass0dh.m6103C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) ((((float) (i - this.f14412L)) - (((float) this.f14409I) / 2.0f)) - (((float) i) / 2.0f)));
        this.f14446t = min;
        this.f14426Z = min * this.NB;
        if (E > 1.0f) {
            double d2 = (double) (E - 1.0f);
            r0.f14432f = (float) AnonymousClass0dh.m6103C(d2, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 1.0d, (double) r0.f14433g);
            r0.BB = (float) AnonymousClass0dh.m6103C(d2, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 1.0d, (double) r0.CB);
            r0.f14438l = (float) AnonymousClass0dh.m6103C(d2, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) r0.f14437k);
            r0.HB = (float) AnonymousClass0dh.m6103C(d2, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) r0.GB);
            r0.f14430d = (float) AnonymousClass0dh.m6103C(d2, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) r0.f14429c);
        }
        invalidateSelf();
    }

    /* renamed from: G */
    private void m9356G(Canvas canvas, int i) {
        canvas.save();
        float f = AnonymousClass162.m9352C(this).f26263B ? 0.0f : (((float) this.f14403C) / 2.0f) + 1.0f;
        if (i == 0) {
            this.f14443q.set(0.0f, 0.0f, (((float) this.f14450x) * this.f14432f) + f, (float) this.f14411K);
        } else {
            RectF rectF = this.f14443q;
            int i2 = this.OB;
            rectF.set((((float) i2) - (((float) this.f14450x) * this.BB)) - f, 0.0f, (float) i2, (float) this.f14411K);
        }
        canvas.clipRect(this.f14443q);
        if (this.f14426Z < this.NB) {
            canvas.drawCircle(this.f14443q.centerX(), this.f14443q.centerY(), this.f14426Z, this.f14451y);
        } else {
            canvas.drawRect(this.f14443q, this.f14451y);
        }
        canvas.restore();
    }

    /* renamed from: H */
    private int m9357H() {
        return this.f14450x - (this.f14444r * 2);
    }

    public final Rect MN() {
        Rect rect = new Rect(getBounds());
        if (this.f14415O != null) {
            rect.top += this.f14452z.getIntrinsicHeight() + this.f14415O.f26275C;
        }
        return rect;
    }

    public final void draw(Canvas canvas) {
        float f;
        float f2;
        AnonymousClass162 anonymousClass162 = this;
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        int save = canvas2.save();
        canvas2.translate((float) bounds.left, (float) bounds.top);
        if (this.f14415O != null) {
            canvas2.save();
            canvas2.translate((float) ((this.OB - this.f14452z.getIntrinsicWidth()) / 2), 0.0f);
            this.f14452z.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, (float) (this.f14452z.getIntrinsicHeight() + this.f14415O.f26275C));
        }
        Drawable drawable = this.KB;
        if (drawable != null) {
            drawable.setBounds(((int) this.f14425Y.left) - this.LB, ((int) this.f14425Y.top) - this.LB, ((int) this.f14425Y.right) + this.LB, ((int) this.f14425Y.bottom) + this.LB);
            this.KB.draw(canvas2);
        }
        canvas2.clipRect(this.f14425Y);
        AnonymousClass27U C = AnonymousClass162.m9352C(this);
        int i;
        int i2;
        if (C == AnonymousClass27U.f26258E) {
            this.f14451y.setColor(this.f14424X);
            RectF rectF = this.f14425Y;
            i = this.f14427a;
            canvas2.drawRoundRect(rectF, (float) i, (float) i, this.f14451y);
            this.f14451y.setColor(this.f14428b);
            i2 = this.f14450x;
            float f3 = (float) i2;
            f = this.f14430d;
            canvas2.drawRect(f3 + f, 0.0f, (((float) i2) + f) + ((float) this.f14403C), (float) this.f14411K, this.f14451y);
        } else {
            if (this.f14441o == null) {
                this.f14441o = Bitmap.createBitmap(this.OB, this.f14411K, Config.ARGB_8888);
                this.f14442p = new Canvas(this.f14441o);
            }
            this.f14441o.eraseColor(0);
            this.f14442p.save();
            this.f14451y.setColor(this.f14424X);
            Canvas canvas3 = this.f14442p;
            RectF rectF2 = this.f14425Y;
            i = this.f14427a;
            canvas3.drawRoundRect(rectF2, (float) i, (float) i, this.f14451y);
            this.f14451y.setXfermode(this.MB);
            if (C.f26263B) {
                this.f14451y.setColor(this.f14428b);
                Canvas canvas4 = this.f14442p;
                i2 = this.f14450x;
                float f4 = (float) i2;
                f = this.f14430d;
                canvas4.drawRect(f4 + f, 0.0f, (((float) i2) + f) + ((float) this.f14403C), (float) this.f14411K, anonymousClass162.f14451y);
            }
            switch (AnonymousClass27T.f26255B[C.ordinal()]) {
                case 1:
                    anonymousClass162.f14451y.setShader(anonymousClass162.f14410J);
                    m9356G(anonymousClass162.f14442p, 0);
                    break;
                case 2:
                    anonymousClass162.f14451y.setShader(anonymousClass162.f14416P);
                    m9356G(anonymousClass162.f14442p, 1);
                    break;
                case 3:
                    anonymousClass162.f14451y.setShader(anonymousClass162.f14410J);
                    m9356G(anonymousClass162.f14442p, 0);
                    anonymousClass162.f14451y.setShader(anonymousClass162.f14416P);
                    m9356G(anonymousClass162.f14442p, 1);
                    break;
                case 4:
                    anonymousClass162.f14451y.setColor(anonymousClass162.JB);
                    m9356G(anonymousClass162.f14442p, 0);
                    break;
                case 5:
                    anonymousClass162.f14451y.setColor(anonymousClass162.JB);
                    m9356G(anonymousClass162.f14442p, 1);
                    break;
                default:
                    break;
            }
            anonymousClass162.f14451y.setShader(null);
            anonymousClass162.f14451y.setXfermode(null);
            anonymousClass162.f14442p.restore();
            canvas2.drawBitmap(anonymousClass162.f14441o, 0.0f, 0.0f, anonymousClass162.f14451y);
        }
        if (anonymousClass162.f14435i != null) {
            canvas2.save();
            canvas2.translate(((float) (anonymousClass162.f14450x - anonymousClass162.f14436j)) / 2.0f, ((float) (anonymousClass162.f14411K - anonymousClass162.f14409I)) / 2.0f);
            canvas2.translate(anonymousClass162.f14438l, anonymousClass162.f14447u);
            f2 = anonymousClass162.f14446t;
            canvas2.scale(f2, f2, ((float) anonymousClass162.f14436j) / 2.0f, ((float) anonymousClass162.f14409I) / 2.0f);
            anonymousClass162.f14435i.draw(canvas2);
            canvas2.restore();
        }
        canvas2.save();
        canvas2.translate(((float) (anonymousClass162.f14450x - anonymousClass162.f14439m)) / 2.0f, (((float) (anonymousClass162.f14411K - anonymousClass162.f14408H)) + anonymousClass162.f14434h) / 2.0f);
        canvas2.translate(anonymousClass162.f14438l, anonymousClass162.f14449w);
        float f5 = anonymousClass162.f14406F;
        f = anonymousClass162.f14431e;
        canvas2.scale(f5 + f, f5 + f, ((float) anonymousClass162.f14439m) / 2.0f, ((float) anonymousClass162.f14408H) / 2.0f);
        anonymousClass162.f14407G.draw(canvas2);
        canvas2.restore();
        if (anonymousClass162.EB != null) {
            canvas2.save();
            canvas2.translate((float) (anonymousClass162.f14450x + anonymousClass162.f14403C), 0.0f);
            canvas2.translate(((float) (anonymousClass162.f14450x - anonymousClass162.FB)) / 2.0f, ((float) (anonymousClass162.f14411K - anonymousClass162.f14420T)) / 2.0f);
            canvas2.translate(anonymousClass162.HB, anonymousClass162.f14447u);
            f2 = anonymousClass162.f14446t;
            canvas2.scale(f2, f2, ((float) anonymousClass162.FB) / 2.0f, ((float) anonymousClass162.f14420T) / 2.0f);
            anonymousClass162.EB.draw(canvas2);
            canvas2.restore();
        }
        canvas2.save();
        canvas2.translate((float) (anonymousClass162.f14450x + anonymousClass162.f14403C), 0.0f);
        canvas2.translate(((float) (anonymousClass162.f14450x - anonymousClass162.IB)) / 2.0f, (((float) (anonymousClass162.f14411K - anonymousClass162.f14419S)) + anonymousClass162.DB) / 2.0f);
        canvas2.translate(anonymousClass162.HB, anonymousClass162.f14449w);
        f2 = anonymousClass162.f14417Q;
        f = anonymousClass162.AB;
        canvas2.scale(f2 + f, f2 + f, ((float) anonymousClass162.IB) / 2.0f, ((float) anonymousClass162.f14419S) / 2.0f);
        anonymousClass162.f14418R.draw(canvas2);
        canvas2.restore();
        canvas2.restoreToCount(save);
    }

    public final int getIntrinsicHeight() {
        return this.f14440n;
    }

    public final int getIntrinsicWidth() {
        return this.OB;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14407G;
        if (drawable == drawable2) {
            this.f14439m = drawable2.getIntrinsicWidth();
            this.f14408H = this.f14407G.getIntrinsicHeight();
            return;
        }
        drawable2 = this.f14418R;
        if (drawable == drawable2) {
            this.IB = drawable2.getIntrinsicWidth();
            this.f14419S = this.f14418R.getIntrinsicHeight();
            return;
        }
        drawable2 = this.f14435i;
        if (drawable == drawable2) {
            this.f14436j = drawable2.getIntrinsicWidth();
            this.f14409I = this.f14435i.getIntrinsicHeight();
            return;
        }
        drawable2 = this.EB;
        if (drawable == drawable2) {
            this.FB = drawable2.getIntrinsicWidth();
            this.f14420T = this.EB.getIntrinsicHeight();
        }
    }
}
