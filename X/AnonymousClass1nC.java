package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: X.1nC */
public final class AnonymousClass1nC extends OvalShape {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1nD f22656B;
    /* renamed from: C */
    private RadialGradient f22657C;
    /* renamed from: D */
    private Paint f22658D = new Paint();

    public AnonymousClass1nC(AnonymousClass1nD anonymousClass1nD, int i) {
        this.f22656B = anonymousClass1nD;
        anonymousClass1nD.f22660C = i;
        m13099B((int) rect().width());
    }

    /* renamed from: B */
    private void m13099B(int i) {
        float f = (float) (i / 2);
        this.f22657C = new RadialGradient(f, f, (float) this.f22656B.f22660C, new int[]{1023410176, 0}, null, TileMode.CLAMP);
        this.f22658D.setShader(this.f22657C);
    }

    public final void draw(Canvas canvas, Paint paint) {
        int width = this.f22656B.getWidth() / 2;
        float f = (float) width;
        float height = (float) (this.f22656B.getHeight() / 2);
        canvas.drawCircle(f, height, f, this.f22658D);
        canvas.drawCircle(f, height, (float) (width - this.f22656B.f22660C), paint);
    }

    public final void onResize(float f, float f2) {
        super.onResize(f, f2);
        m13099B((int) f);
    }
}
