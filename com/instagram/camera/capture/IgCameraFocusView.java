package com.instagram.camera.capture;

import X.AnonymousClass0QP;
import X.AnonymousClass0cN;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass36f;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

public class IgCameraFocusView extends View {
    /* renamed from: B */
    public boolean f37864B;
    /* renamed from: C */
    public AnonymousClass0cN f37865C;
    /* renamed from: D */
    public PointF f37866D;
    /* renamed from: E */
    public float f37867E;
    /* renamed from: F */
    public float f37868F;
    /* renamed from: G */
    public boolean f37869G;
    /* renamed from: H */
    private Paint f37870H;
    /* renamed from: I */
    private AnonymousClass0QP f37871I;

    public IgCameraFocusView(Context context) {
        this(context, null);
    }

    public IgCameraFocusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IgCameraFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37864B = false;
        setWillNotDraw(false);
        this.f37866D = new PointF();
        Paint paint = new Paint(1);
        this.f37870H = paint;
        paint.setColor(-1);
        this.f37870H.setStyle(Style.STROKE);
        this.f37870H.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.f37867E = TypedValue.applyDimension(1, 30.0f, getResources().getDisplayMetrics());
        this.f37871I = new AnonymousClass36f(this);
        this.f37865C = AnonymousClass0e6.B().C().O(AnonymousClass0e5.B(0.5d, 0.5d)).A(this.f37871I);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f37869G) {
            canvas.drawCircle(this.f37866D.x, this.f37866D.y, this.f37868F, this.f37870H);
        }
    }
}
