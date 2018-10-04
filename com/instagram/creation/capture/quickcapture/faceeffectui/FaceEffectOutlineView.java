package com.instagram.creation.capture.quickcapture.faceeffectui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.C0164R;

public class FaceEffectOutlineView extends View {
    /* renamed from: H */
    public static final Interpolator f39373H = new LinearInterpolator();
    /* renamed from: B */
    public ObjectAnimator f39374B;
    /* renamed from: C */
    public Path f39375C;
    /* renamed from: D */
    public int f39376D;
    /* renamed from: E */
    public Paint f39377E;
    /* renamed from: F */
    public float f39378F;
    /* renamed from: G */
    public int f39379G;

    public FaceEffectOutlineView(Context context) {
        this(context, null);
    }

    public FaceEffectOutlineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FaceEffectOutlineView(Context context, AttributeSet attributeSet, int i) {
        Context context2 = context;
        super(context2, attributeSet, i);
        this.f39379G = -1;
        this.f39376D = -1;
        Paint paint = new Paint(5);
        this.f39377E = paint;
        paint.setStyle(Style.STROKE);
        this.f39377E.setStrokeCap(Cap.ROUND);
        this.f39377E.setStrokeJoin(Join.ROUND);
        this.f39377E.setColor(-1);
        this.f39377E.setStrokeWidth((float) context2.getResources().getDimensionPixelSize(C0164R.dimen.face_effect_outline_stroke_width));
        Path path = new Path();
        this.f39375C = path;
        path.moveTo(66.88f, 83.56f);
        this.f39375C.cubicTo(73.08f, 75.33f, 76.72f, 65.39f, 78.07f, 55.23f);
        this.f39375C.cubicTo(79.95f, 41.14f, 78.51f, 23.46f, 68.41f, 12.52f);
        this.f39375C.cubicTo(61.42f, 4.96f, 50.76f, 1.5f, 40.14f, 1.5f);
        this.f39375C.cubicTo(29.52f, 1.5f, 18.85f, 4.96f, 11.87f, 12.52f);
        this.f39375C.cubicTo(1.76f, 23.46f, 0.33f, 41.14f, 2.2f, 55.23f);
        this.f39375C.cubicTo(3.56f, 65.39f, 7.2f, 75.33f, 13.4f, 83.56f);
        this.f39375C.cubicTo(19.82f, 92.09f, 28.29f, 100.5f, 40.14f, 100.5f);
        this.f39375C.cubicTo(51.99f, 100.5f, 60.45f, 92.09f, 66.88f, 83.56f);
        this.f39375C.close();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phase", new float[]{0.0f, 1.0f});
        this.f39374B = ofFloat;
        ofFloat.setInterpolator(f39373H);
        this.f39374B.setRepeatCount(-1);
        this.f39374B.setRepeatMode(1);
        this.f39374B.setDuration(5000);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f39375C, this.f39377E);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = this.f39379G;
        if (measuredWidth != i3 || measuredHeight != i3) {
            this.f39379G = measuredWidth;
            this.f39376D = measuredHeight;
            RectF rectF = new RectF();
            this.f39375C.computeBounds(rectF, true);
            Matrix matrix = new Matrix();
            matrix.setTranslate((((float) this.f39379G) - rectF.width()) / 2.0f, (((float) this.f39376D) - rectF.height()) / 2.0f);
            this.f39375C.transform(matrix);
            matrix = new Matrix();
            float height = (((float) this.f39376D) * 0.8f) / rectF.height();
            matrix.setScale(height, height, ((float) this.f39379G) / 2.0f, ((float) this.f39376D) / 2.0f);
            this.f39375C.transform(matrix);
            this.f39378F = new PathMeasure(this.f39375C, false).getLength() / 30.0f;
            Paint paint = this.f39377E;
            r1 = new float[2];
            float f = this.f39378F;
            r1[0] = f;
            r1[1] = f;
            paint.setPathEffect(new DashPathEffect(r1, 0.0f));
        }
    }

    public void setPhase(float f) {
        float[] fArr = new float[]{r4, this.f39378F};
        this.f39377E.setPathEffect(new DashPathEffect(fArr, Math.max(((f * this.f39378F) * 15.0f) * 2.0f, 0.0f)));
        invalidate();
    }
}
