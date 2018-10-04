package com.instagram.util.regiontracking;

import X.AnonymousClass0CF;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.nio.ByteBuffer;

public class RegionTracker {
    private final RectF mInitialRegion;
    private final float mInitialRotationDegrees;
    private final long mNativeTracker = nativeCreateRegionTracker();
    private final Matrix mTransformMatrix = new Matrix();

    private static native void nativeAddRegion(long j, float f, float f2, float f3, float f4);

    private static native long nativeCreateRegionTracker();

    private static native void nativeDispose(long j);

    private static native RectF nativeUpdate(long j, ByteBuffer byteBuffer, int i, int i2, float[] fArr, boolean z);

    static {
        AnonymousClass0CF.E("apps_instagram_instagram_jni_regiontracking_regiontracking");
    }

    public RegionTracker(RectF rectF, float f) {
        this.mInitialRegion = rectF;
        this.mInitialRotationDegrees = f;
    }

    public final void addRegion(RectF rectF) {
        nativeAddRegion(this.mNativeTracker, rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final void dispose() {
        nativeDispose(this.mNativeTracker);
    }

    public final RectF getInitialRegion() {
        return this.mInitialRegion;
    }

    public final float getInitialRotationDegrees() {
        return this.mInitialRotationDegrees;
    }

    public final Matrix getTransformMatrix() {
        return this.mTransformMatrix;
    }

    public final void setTransformMatrix(Matrix matrix) {
        this.mTransformMatrix.set(matrix);
    }

    public final RectF update(ByteBuffer byteBuffer, int i, int i2, float[] fArr, boolean z) {
        return nativeUpdate(this.mNativeTracker, byteBuffer, i, i2, fArr, z);
    }
}
