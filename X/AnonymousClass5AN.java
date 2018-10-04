package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.facebook.C0164R;

/* renamed from: X.5AN */
public final class AnonymousClass5AN extends Drawable {
    /* renamed from: B */
    public final Paint f60784B = new Paint(1);
    /* renamed from: C */
    public final Rect f60785C = new Rect();
    /* renamed from: D */
    public final Context f60786D;
    /* renamed from: E */
    public Drawable f60787E;

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass5AN(Context context, int i) {
        this.f60786D = context;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.story_feedback_balloon_size);
        this.f60785C.set(0, 0, dimensionPixelSize, dimensionPixelSize);
        AnonymousClass16T.C(context, null, C0164R.style.GradientPatternStyle, new int[5]);
        Drawable E = AnonymousClass0Ca.E(this.f60786D, i);
        this.f60787E = E;
        E.setBounds(this.f60785C);
        invalidateSelf();
        this.f60784B.setShader(new LinearGradient(0.0f, (float) this.f60785C.height(), (float) this.f60785C.width(), 0.0f, new int[]{r2[1], r2[3]}, null, TileMode.CLAMP));
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float width = ((float) this.f60785C.width()) / 2.0f;
        canvas.drawCircle(width, ((float) this.f60785C.height()) / 2.0f, width, this.f60784B);
        Drawable drawable = this.f60787E;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final int getIntrinsicHeight() {
        return this.f60785C.height();
    }

    public final int getIntrinsicWidth() {
        return this.f60785C.width();
    }

    public final void onBoundsChange(Rect rect) {
        this.f60785C.set(rect);
        Drawable drawable = this.f60787E;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final void setAlpha(int i) {
        this.f60784B.setAlpha(i);
        Drawable drawable = this.f60787E;
        if (drawable != null) {
            drawable.mutate().setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f60784B.setColorFilter(colorFilter);
        Drawable drawable = this.f60787E;
        if (drawable != null) {
            drawable.mutate().setColorFilter(colorFilter);
        }
        invalidateSelf();
    }
}
