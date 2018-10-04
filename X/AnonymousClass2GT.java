package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.C0164R;

/* renamed from: X.2GT */
public final class AnonymousClass2GT extends Drawable {
    /* renamed from: B */
    public boolean f28287B;
    /* renamed from: C */
    private final RectF f28288C = new RectF();
    /* renamed from: D */
    private final RectF f28289D = new RectF();
    /* renamed from: E */
    private final int f28290E;
    /* renamed from: F */
    private final int f28291F;
    /* renamed from: G */
    private final int f28292G;
    /* renamed from: H */
    private final Paint f28293H;
    /* renamed from: I */
    private final Paint f28294I;
    /* renamed from: J */
    private final RectF f28295J = new RectF();
    /* renamed from: K */
    private final int f28296K;
    /* renamed from: L */
    private final int f28297L;
    /* renamed from: M */
    private final Paint f28298M;
    /* renamed from: N */
    private final Interpolator f28299N = new DecelerateInterpolator(2.0f);
    /* renamed from: O */
    private final AnonymousClass2bu f28300O;

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass2GT(Context context) {
        Resources resources = context.getResources();
        this.f28290E = resources.getDimensionPixelSize(C0164R.dimen.question_sticker_tray_background_corner_radius);
        this.f28291F = resources.getDimensionPixelSize(C0164R.dimen.question_sticker_tray_background_height);
        this.f28292G = resources.getDimensionPixelSize(C0164R.dimen.question_sticker_tray_background_margin);
        this.f28296K = resources.getDimensionPixelSize(C0164R.dimen.question_sticker_tray_foreground_corner_radius);
        this.f28297L = resources.getDimensionPixelSize(C0164R.dimen.question_sticker_tray_foreground_height);
        Paint paint = new Paint(1);
        this.f28293H = paint;
        paint.setColor(AnonymousClass0Ca.C(context, C0164R.color.question_sticker_tray_background_first));
        paint = new Paint(1);
        this.f28294I = paint;
        paint.setColor(AnonymousClass0Ca.C(context, C0164R.color.question_sticker_tray_background_second));
        paint = new Paint(1);
        this.f28298M = paint;
        paint.setColor(AnonymousClass0Ca.C(context, C0164R.color.question_sticker_tray_foreground));
        int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.question_sticker_tray_text_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0164R.dimen.question_sticker_tray_text_size);
        Object string = resources.getString(C0164R.string.question_sticker_tray_label);
        Spannable spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new AnonymousClass2GS(), 0, string.length(), 33);
        AnonymousClass2bu anonymousClass2bu = new AnonymousClass2bu(context, AnonymousClass0Nm.J(context));
        this.f28300O = anonymousClass2bu;
        anonymousClass2bu.m16447E(Alignment.ALIGN_CENTER);
        this.f28300O.m16450H(spannableStringBuilder);
        float f = (float) dimensionPixelSize;
        AnonymousClass27w.m14526C(context, this.f28300O, (float) dimensionPixelSize2, f, f);
    }

    public final void draw(Canvas canvas) {
        float interpolation;
        RectF rectF;
        int i;
        float f;
        if (this.f28287B) {
            long currentTimeMillis = System.currentTimeMillis() % 4200;
            if (currentTimeMillis < 350) {
                interpolation = this.f28299N.getInterpolation(AnonymousClass0nB.D((float) currentTimeMillis, 0.0f, 350.0f, 0.0f, 1.0f)) * ((float) this.f28291F);
            } else if (currentTimeMillis >= 2100) {
                if (currentTimeMillis < 2450) {
                    interpolation = ((float) this.f28291F) * (1.0f - this.f28299N.getInterpolation(AnonymousClass0nB.D((float) currentTimeMillis, 2100.0f, 2450.0f, 0.0f, 1.0f)));
                } else {
                    interpolation = 0.0f;
                }
            }
            canvas.save();
            canvas.translate(0.0f, ((float) this.f28291F) + interpolation);
            rectF = this.f28289D;
            i = this.f28290E;
            canvas.drawRoundRect(rectF, (float) i, (float) i, this.f28294I);
            f = -interpolation;
            canvas.translate(0.0f, f);
            rectF = this.f28288C;
            i = this.f28290E;
            canvas.drawRoundRect(rectF, (float) i, (float) i, this.f28293H);
            canvas.translate(0.0f, f);
            rectF = this.f28295J;
            i = this.f28296K;
            canvas.drawRoundRect(rectF, (float) i, (float) i, this.f28298M);
            this.f28300O.draw(canvas);
            canvas.restore();
            if (this.f28287B) {
                invalidateSelf();
            }
        }
        interpolation = (float) this.f28291F;
        canvas.save();
        canvas.translate(0.0f, ((float) this.f28291F) + interpolation);
        rectF = this.f28289D;
        i = this.f28290E;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f28294I);
        f = -interpolation;
        canvas.translate(0.0f, f);
        rectF = this.f28288C;
        i = this.f28290E;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f28293H);
        canvas.translate(0.0f, f);
        rectF = this.f28295J;
        i = this.f28296K;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f28298M);
        this.f28300O.draw(canvas);
        canvas.restore();
        if (this.f28287B) {
            invalidateSelf();
        }
    }

    public final int getIntrinsicHeight() {
        return this.f28297L + (this.f28291F * 2);
    }

    public final int getIntrinsicWidth() {
        return this.f28300O.getIntrinsicWidth();
    }

    public final void setAlpha(int i) {
        this.f28293H.setAlpha(i);
        this.f28294I.setAlpha(i);
        this.f28298M.setAlpha(i);
        this.f28300O.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float intrinsicWidth = ((float) getIntrinsicWidth()) / 2.0f;
        float f2 = f - intrinsicWidth;
        f += intrinsicWidth;
        float intrinsicHeight = (((float) (i2 + i4)) / 2.0f) - (((float) getIntrinsicHeight()) / 2.0f);
        RectF rectF = this.f28288C;
        int i5 = this.f28292G;
        rectF.set(((float) i5) + f2, intrinsicHeight, f - ((float) i5), ((float) this.f28297L) + intrinsicHeight);
        rectF = this.f28289D;
        int i6 = this.f28292G;
        rectF.set(((float) (i6 * 2)) + f2, intrinsicHeight, f - ((float) (i6 * 2)), ((float) this.f28297L) + intrinsicHeight);
        this.f28295J.set(f2, intrinsicHeight, f, ((float) this.f28297L) + intrinsicHeight);
        int i7 = (int) intrinsicHeight;
        this.f28300O.setBounds((int) f2, i7, (int) f, this.f28297L + i7);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28293H.setColorFilter(colorFilter);
        this.f28294I.setColorFilter(colorFilter);
        this.f28298M.setColorFilter(colorFilter);
        this.f28300O.setColorFilter(colorFilter);
    }
}
