package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.facebook.C0164R;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.2cU */
public final class AnonymousClass2cU {
    /* renamed from: B */
    public final AlphaAnimation f31685B = new AlphaAnimation(0.0f, 1.0f);
    /* renamed from: C */
    public final RefreshableNestedScrollingParent f31686C;
    /* renamed from: D */
    public final AlphaAnimation f31687D = new AlphaAnimation(-0.2f, 0.2f);
    /* renamed from: E */
    private final Paint f31688E;
    /* renamed from: F */
    private final LayerDrawable f31689F;
    /* renamed from: G */
    private final Drawable f31690G;
    /* renamed from: H */
    private final Transformation f31691H = new Transformation();

    public AnonymousClass2cU(RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        Context context = refreshableNestedScrollingParent.getContext();
        this.f31686C = refreshableNestedScrollingParent;
        Paint paint = new Paint();
        this.f31688E = paint;
        paint.setColor(AnonymousClass0Ca.C(context, C0164R.color.grey_1));
        this.f31688E.setStrokeWidth(1.0f);
        this.f31689F = (LayerDrawable) AnonymousClass0Ca.E(context, C0164R.drawable.refreshable_progress_drawable);
        this.f31690G = AnonymousClass0Ca.E(context, C0164R.drawable.refreshable_spinner_drawable);
        this.f31687D.setDuration(300);
        this.f31685B.setDuration(700);
        this.f31685B.setInterpolator(new LinearInterpolator());
        this.f31685B.setRepeatCount(-1);
    }

    /* renamed from: A */
    public final void m16537A(RefreshableNestedScrollingParent refreshableNestedScrollingParent, View view, Canvas canvas, int i, float f, boolean z) {
        float f2 = f;
        if (f <= 0.0f) {
            this.f31685B.cancel();
            this.f31687D.cancel();
            return;
        }
        Canvas canvas2 = canvas;
        canvas2.save();
        try {
            canvas2.translate(0.0f, (float) (view.getTop() + view.getPaddingTop()));
            float width = (float) canvas2.getWidth();
            int i2 = i;
            float f3 = (float) i2;
            float f4 = f * f3;
            canvas2.clipRect(0.0f, 0.0f, width, 1.0f + f4);
            canvas2.drawLine(0.0f, f4, width, f4, this.f31688E);
            int i3 = (int) ((width - f3) / 2.0f);
            if (this.f31686C.f29420B) {
                if (this.f31687D.getTransformation(refreshableNestedScrollingParent.getDrawingTime(), this.f31691H)) {
                    f3 = 1.2f - Math.abs(this.f31691H.getAlpha());
                    canvas2.scale(f3, f3, width / 2.0f, (float) (i / 2));
                }
                if (this.f31685B.getTransformation(refreshableNestedScrollingParent.getDrawingTime(), this.f31691H)) {
                    float alpha = this.f31691H.getAlpha();
                    this.f31690G.setBounds(i3, 0, i3 + i, i2);
                    this.f31690G.setLevel((int) (alpha * 10000.0f));
                    this.f31690G.draw(canvas2);
                    AnonymousClass0mE.J(refreshableNestedScrollingParent);
                }
            } else {
                this.f31689F.setBounds(i3, 0, i3 + i, i2);
                this.f31689F.setLevel((int) (Math.max(0.0f, f2) * 10000.0f));
                this.f31689F.draw(canvas2);
            }
            canvas2.restore();
        } catch (Throwable th) {
            canvas2.restore();
        }
    }
}
