package com.instagram.ui.widget.triangleshape;

import X.AnonymousClass0Nm;
import X.AnonymousClass0eS;
import X.AnonymousClass3kV;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class TriangleShape extends View {
    /* renamed from: B */
    private AnonymousClass3kV f44008B = AnonymousClass3kV.NORTH;
    /* renamed from: C */
    private Paint f44009C;
    /* renamed from: D */
    private Path f44010D;
    /* renamed from: E */
    private int[] f44011E;
    /* renamed from: F */
    private View f44012F = this;
    /* renamed from: G */
    private int f44013G;
    /* renamed from: H */
    private Paint f44014H;
    /* renamed from: I */
    private Path f44015I;

    public TriangleShape(Context context) {
        super(context);
        m20559B(null);
    }

    public TriangleShape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20559B(attributeSet);
    }

    public TriangleShape(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20559B(attributeSet);
    }

    /* renamed from: B */
    private void m20559B(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.TriangleShape);
        int color = obtainStyledAttributes.getColor(1, -1);
        this.f44013G = obtainStyledAttributes.getColor(2, 0);
        if (!TextUtils.isEmpty(obtainStyledAttributes.getString(0))) {
            this.f44008B = AnonymousClass3kV.m20558B(obtainStyledAttributes.getInt(0, 0));
        }
        obtainStyledAttributes.recycle();
        this.f44011E = new int[2];
        Paint paint = new Paint(1);
        this.f44009C = paint;
        paint.setColor(color);
        this.f44009C.setStyle(Style.FILL_AND_STROKE);
        Paint paint2 = new Paint(1);
        this.f44014H = paint2;
        paint2.setColor(this.f44013G);
        this.f44014H.setStyle(Style.STROKE);
        this.f44014H.setStrokeWidth(1.0f);
        Path path = new Path();
        this.f44010D = path;
        FillType fillType = FillType.EVEN_ODD;
        path.setFillType(fillType);
        path = new Path();
        this.f44015I = path;
        path.setFillType(fillType);
    }

    public final void draw(Canvas canvas) {
        int height = getHeight();
        this.f44012F.getLocationInWindow(this.f44011E);
        int width = this.f44011E[0] + ((int) ((((float) this.f44012F.getWidth()) * this.f44012F.getScaleX()) / 2.0f));
        getLocationInWindow(this.f44011E);
        width -= this.f44011E[0];
        this.f44010D.reset();
        this.f44015I.reset();
        float f;
        float f2;
        float f3;
        float f4;
        if (this.f44008B == AnonymousClass3kV.SOUTH) {
            f = (float) (width - height);
            this.f44010D.moveTo(f, 0.0f);
            f2 = (float) (width + height);
            this.f44010D.lineTo(f2, 0.0f);
            f3 = (float) width;
            f4 = (float) height;
            this.f44010D.lineTo(f3, f4);
            if (this.f44013G != 0) {
                this.f44015I.moveTo(0.0f, 0.0f);
                this.f44015I.lineTo(f, 0.0f);
                this.f44015I.lineTo(f3, f4);
                this.f44015I.lineTo(f2, 0.0f);
                this.f44015I.lineTo((float) AnonymousClass0Nm.J(getContext()), 0.0f);
            }
        } else {
            f = (float) (width - height);
            f2 = (float) height;
            this.f44010D.moveTo(f, f2);
            f3 = (float) (height + width);
            this.f44010D.lineTo(f3, f2);
            f4 = (float) width;
            this.f44010D.lineTo(f4, 0.0f);
            if (this.f44013G != 0) {
                this.f44015I.moveTo(0.0f, f2);
                this.f44015I.lineTo(f, f2);
                this.f44015I.lineTo(f4, 0.0f);
                this.f44015I.lineTo(f3, f2);
                this.f44015I.lineTo((float) AnonymousClass0Nm.J(getContext()), f2);
            }
        }
        this.f44010D.close();
        canvas.drawPath(this.f44010D, this.f44009C);
        canvas.drawPath(this.f44015I, this.f44014H);
    }

    public void setDirection(AnonymousClass3kV anonymousClass3kV) {
        this.f44008B = anonymousClass3kV;
    }

    public void setNotchCenterXOn(View view) {
        this.f44012F = view;
    }
}
