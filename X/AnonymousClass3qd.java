package X;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.3qd */
public final class AnonymousClass3qd extends Drawable implements AnimatorUpdateListener {
    /* renamed from: B */
    public final ValueAnimator f45265B;
    /* renamed from: C */
    private float f45266C;
    /* renamed from: D */
    private final Bitmap f45267D;
    /* renamed from: E */
    private final Paint f45268E = new Paint();
    /* renamed from: F */
    private final Resources f45269F;
    /* renamed from: G */
    private final Bitmap f45270G;

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass3qd(Resources resources, int i, int i2) {
        this.f45269F = resources;
        this.f45270G = BitmapFactory.decodeResource(resources, i);
        this.f45267D = BitmapFactory.decodeResource(resources, i2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f45265B = ofFloat;
        ofFloat.setInterpolator(null);
        this.f45265B.setRepeatCount(-1);
        this.f45265B.addUpdateListener(this);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate((float) AnonymousClass0dh.C((double) this.f45266C, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) bounds.width(), (double) (-this.f45270G.getWidth())), 0.0f);
        canvas2.drawBitmap(this.f45270G, 0.0f, 0.0f, this.f45268E);
        canvas2.restore();
        canvas2.save();
        float f = this.f45266C;
        f = ((double) f) > 0.5d ? f - 0.5f : f + 0.5f;
        r3.f45266C = f;
        canvas2.translate((float) AnonymousClass0dh.C((double) f, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) bounds.width(), (double) (-r3.f45267D.getWidth())), 0.0f);
        canvas2.drawBitmap(r3.f45267D, 0.0f, r3.f45269F.getDimension(C0164R.dimen.zero_rating_video_settings_drawer_options_cloud_vertical_distance), r3.f45268E);
        canvas2.restore();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f45266C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f45268E.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f45268E.setColorFilter(colorFilter);
    }
}
