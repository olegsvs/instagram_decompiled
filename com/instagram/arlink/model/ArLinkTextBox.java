package com.instagram.arlink.model;

import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;

public class ArLinkTextBox {
    private final float mRotationDegree;
    private final Point mSize = new Point();
    private final RectF mTextRect = new RectF();

    public ArLinkTextBox(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        path.lineTo(f7, f8);
        path.lineTo(f5, f6);
        path.close();
        path.computeBounds(this.mTextRect, true);
        this.mSize.x = getDistance(f, f2, f3, f4);
        this.mSize.y = getDistance(f, f2, f5, f6);
        this.mRotationDegree = (float) Math.toDegrees(Math.atan2((double) (f2 - f4), (double) (f3 - f)));
    }

    private static int getDistance(float f, float f2, float f3, float f4) {
        f3 -= f;
        f4 -= f2;
        return (int) Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
    }

    public float getRotationDegree() {
        return this.mRotationDegree;
    }

    public Point getSize() {
        return this.mSize;
    }

    public RectF getTextRect() {
        return this.mTextRect;
    }
}
