package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.2bb */
public final class AnonymousClass2bb extends Drawable implements AnonymousClass0RL, AnonymousClass2G7, Callback {
    /* renamed from: V */
    private static final CharSequence f31444V = "…";
    /* renamed from: B */
    private int f31445B = -1;
    /* renamed from: C */
    private final Paint f31446C = new Paint(1);
    /* renamed from: D */
    private final RectF f31447D = new RectF();
    /* renamed from: E */
    private AnonymousClass26H f31448E;
    /* renamed from: F */
    private final int f31449F;
    /* renamed from: G */
    private final int f31450G;
    /* renamed from: H */
    private final AnonymousClass2bu f31451H;
    /* renamed from: I */
    private final int f31452I;
    /* renamed from: J */
    private final Paint f31453J;
    /* renamed from: K */
    private final RectF f31454K;
    /* renamed from: L */
    private final Context f31455L;
    /* renamed from: M */
    private final int f31456M;
    /* renamed from: N */
    private final AnonymousClass2Fy f31457N;
    /* renamed from: O */
    private boolean f31458O;
    /* renamed from: P */
    private final AnonymousClass2G9 f31459P;
    /* renamed from: Q */
    private final AnonymousClass2G8 f31460Q;
    /* renamed from: R */
    private final int f31461R;
    /* renamed from: S */
    private final int f31462S;
    /* renamed from: T */
    private final AnonymousClass2bu f31463T;
    /* renamed from: U */
    private final int f31464U;

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass2bb(Context context, AnonymousClass2Fy anonymousClass2Fy, AnonymousClass2G8 anonymousClass2G8) {
        this.f31455L = context;
        this.f31457N = anonymousClass2Fy;
        this.f31460Q = anonymousClass2G8;
        Resources resources = context.getResources();
        this.f31452I = resources.getDimensionPixelSize(C0164R.dimen.music_sticker_corner_radius);
        Paint paint = new Paint();
        this.f31453J = paint;
        paint.setColor(AnonymousClass0Ca.C(this.f31455L, this.f31460Q.f28201B));
        this.f31450G = resources.getDimensionPixelSize(C0164R.dimen.music_sticker_album_art_size);
        this.f31449F = resources.getDimensionPixelSize(C0164R.dimen.music_sticker_album_art_padding);
        this.f31461R = resources.getDimensionPixelSize(C0164R.dimen.music_sticker_text_horizontal_padding);
        this.f31462S = resources.getDimensionPixelSize(C0164R.dimen.music_sticker_title_subtitle_gap);
        AnonymousClass2G9 anonymousClass2G9 = new AnonymousClass2G9(resources.getDimensionPixelSize(C0164R.dimen.music_sticker_sound_wave_bar_width), resources.getDimensionPixelSize(C0164R.dimen.music_sticker_sound_wave_bar_gap_width), resources.getDimensionPixelSize(C0164R.dimen.music_sticker_sound_wave_bar_max_height), resources.getDimensionPixelSize(C0164R.dimen.music_sticker_sound_wave_bar_min_height));
        this.f31459P = anonymousClass2G9;
        int i = this.f31450G;
        anonymousClass2G9.setBounds(0, 0, i, i);
        anonymousClass2G9 = this.f31459P;
        int i2 = this.f31452I;
        int C = AnonymousClass0Ca.C(this.f31455L, C0164R.color.black_30_transparent);
        anonymousClass2G9.f28204B = i2;
        anonymousClass2G9.f28205C.setColor(C);
        anonymousClass2G9.invalidateSelf();
        Object obj = this.f31457N.f28166E;
        if (TextUtils.isEmpty(obj)) {
            m16431C();
        } else {
            AnonymousClass0Gs.f2431j.D(obj).C(this).B();
        }
        int C2 = AnonymousClass0Ca.C(this.f31455L, this.f31460Q.f28203D);
        i2 = resources.getDimensionPixelSize(C0164R.dimen.music_sticker_text_max_width);
        AnonymousClass2bu anonymousClass2bu = new AnonymousClass2bu(this.f31455L, i2);
        this.f31463T = anonymousClass2bu;
        anonymousClass2bu.setCallback(this);
        this.f31463T.m16451I(this.f31457N.f28174M);
        this.f31463T.m16453K((float) resources.getDimensionPixelSize(C0164R.dimen.music_sticker_text_font_size));
        this.f31463T.m16452J(C2);
        this.f31463T.m16456N(Typeface.SANS_SERIF, 1);
        this.f31463T.m16454L(1, f31444V);
        anonymousClass2bu = new AnonymousClass2bu(this.f31455L, i2);
        this.f31451H = anonymousClass2bu;
        anonymousClass2bu.setCallback(this);
        this.f31451H.m16451I(this.f31457N.f28168G);
        this.f31451H.m16453K((float) resources.getDimensionPixelSize(C0164R.dimen.music_sticker_text_font_size));
        this.f31451H.m16452J(C2);
        this.f31451H.m16456N(Typeface.SANS_SERIF, 0);
        this.f31451H.m16454L(1, f31444V);
        this.f31464U = (((this.f31449F + this.f31450G) + this.f31461R) + Math.min(Math.max(this.f31463T.getIntrinsicWidth(), this.f31451H.getIntrinsicWidth()), i2)) + this.f31461R;
        this.f31456M = resources.getDimensionPixelSize(C0164R.dimen.music_sticker_height);
        this.f31454K = new RectF(0.0f, 0.0f, (float) this.f31464U, (float) this.f31456M);
    }

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
        m16431C();
    }

    /* renamed from: B */
    public static AnonymousClass26H m16430B(Bitmap bitmap, float f, int i, int i2) {
        Matrix matrix = new Matrix();
        matrix.setScale(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        AnonymousClass26H anonymousClass26H = new AnonymousClass26H(bitmap, f, matrix);
        anonymousClass26H.setBounds(0, 0, i, i2);
        return anonymousClass26H;
    }

    /* renamed from: C */
    private void m16431C() {
        this.f31445B = AnonymousClass0Ca.C(this.f31455L, C0164R.color.black_50_transparent);
        Bitmap bitmap = ((BitmapDrawable) AnonymousClass0Ca.E(this.f31455L, C0164R.drawable.music_album_art_default)).getBitmap();
        float f = (float) this.f31452I;
        int i = this.f31450G;
        AnonymousClass26H B = AnonymousClass2bb.m16430B(bitmap, f, i, i);
        this.f31448E = B;
        B.setCallback(this);
        invalidateSelf();
    }

    public final AnonymousClass2Fy KS() {
        return this.f31457N;
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        float f = (float) this.f31452I;
        int i = this.f31450G;
        AnonymousClass26H B = AnonymousClass2bb.m16430B(bitmap, f, i, i);
        this.f31448E = B;
        B.setCallback(this);
        invalidateSelf();
    }

    public final void TWA(boolean z) {
        this.f31458O = z;
        invalidateSelf();
    }

    public final String cO() {
        return this.f31460Q.f28202C;
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        Rect bounds = getBounds();
        canvas.translate((float) bounds.left, (float) bounds.top);
        RectF rectF = this.f31454K;
        int i = this.f31452I;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f31453J);
        if (this.f31448E != null) {
            canvas.save();
            i = this.f31449F;
            canvas.translate((float) i, (float) i);
            int i2 = this.f31445B;
            if (i2 != -1) {
                this.f31446C.setColor(i2);
                this.f31447D.set(this.f31448E.getBounds());
                rectF = this.f31447D;
                i = this.f31452I;
                canvas.drawRoundRect(rectF, (float) i, (float) i, this.f31446C);
            }
            this.f31448E.draw(canvas);
            if (this.f31458O) {
                this.f31459P.draw(canvas);
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate((float) ((this.f31449F + this.f31450G) + this.f31461R), ((float) (this.f31456M - ((this.f31463T.getIntrinsicHeight() + this.f31462S) + this.f31451H.getIntrinsicHeight()))) / 2.0f);
        this.f31463T.draw(canvas);
        canvas.translate(0.0f, (float) (this.f31463T.getIntrinsicHeight() + this.f31462S));
        this.f31451H.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (this.f31458O) {
            invalidateSelf();
        }
    }

    public final int getIntrinsicHeight() {
        return this.f31456M;
    }

    public final int getIntrinsicWidth() {
        return this.f31464U;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.f31453J.setAlpha(i);
        AnonymousClass26H anonymousClass26H = this.f31448E;
        if (anonymousClass26H != null) {
            anonymousClass26H.mutate().setAlpha(i);
        }
        this.f31463T.mutate().setAlpha(i);
        this.f31451H.mutate().setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31453J.setColorFilter(colorFilter);
        AnonymousClass26H anonymousClass26H = this.f31448E;
        if (anonymousClass26H != null) {
            anonymousClass26H.mutate().setColorFilter(colorFilter);
        }
        this.f31463T.mutate().setColorFilter(colorFilter);
        this.f31451H.mutate().setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
