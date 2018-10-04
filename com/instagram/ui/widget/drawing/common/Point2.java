package com.instagram.ui.widget.drawing.common;

import android.graphics.PointF;

public class Point2 extends PointF {
    public Point2() {
        super(0.0f, 0.0f);
    }

    public Point2(float f, float f2) {
        super(f, f2);
    }

    public Point2(PointF pointF) {
        super(pointF.x, pointF.y);
    }

    /* renamed from: A */
    public final void m15122A(PointF pointF) {
        this.x = this.x + pointF.x;
        this.y = this.y + pointF.y;
    }

    /* renamed from: B */
    public final void m15123B(PointF pointF, PointF pointF2) {
        this.x = pointF.x - pointF2.x;
        this.y = pointF.y - pointF2.y;
    }

    /* renamed from: C */
    public final float m15124C(PointF pointF) {
        float f = this.x - pointF.x;
        float f2 = this.y - pointF.y;
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: D */
    public final void m15125D(float f) {
        this.x = this.x * f;
        this.y = this.y * f;
    }
}
