package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import android.view.View.MeasureSpec;

public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    /* renamed from: org.webrtc.RendererCommon$1 */
    public /* synthetic */ class C02291 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$RendererCommon$ScalingType = new int[ScalingType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = org.webrtc.RendererCommon.ScalingType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$org$webrtc$RendererCommon$ScalingType = r0;
            r2 = $SwitchMap$org$webrtc$RendererCommon$ScalingType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = $SwitchMap$org$webrtc$RendererCommon$ScalingType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = $SwitchMap$org$webrtc$RendererCommon$ScalingType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.RendererCommon.1.<clinit>():void");
        }
    }

    public interface GlDrawer {
        void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6);

        void release();
    }

    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i, int i2, int i3);
    }

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    public class VideoLayoutMeasure {
        private ScalingType scalingTypeMatchOrientation;
        private ScalingType scalingTypeMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType;
        }

        public Point measure(int i, int i2, int i3, int i4) {
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i2);
            if (!(i3 == 0 || i4 == 0 || defaultSize == 0)) {
                if (defaultSize2 != 0) {
                    ScalingType scalingType;
                    float f = ((float) i3) / ((float) i4);
                    float f2 = ((float) defaultSize) / ((float) defaultSize2);
                    Object obj = 1;
                    Object obj2 = f > 1.0f ? 1 : null;
                    if (f2 <= 1.0f) {
                        obj = null;
                    }
                    if (obj2 == obj) {
                        scalingType = this.scalingTypeMatchOrientation;
                    } else {
                        scalingType = this.scalingTypeMismatchOrientation;
                    }
                    Point displaySize = RendererCommon.getDisplaySize(scalingType, f, defaultSize, defaultSize2);
                    if (MeasureSpec.getMode(i) == 1073741824) {
                        displaySize.x = defaultSize;
                    }
                    if (MeasureSpec.getMode(i2) == 1073741824) {
                        displaySize.y = defaultSize2;
                    }
                    return displaySize;
                }
            }
            return new Point(defaultSize, defaultSize2);
        }

        public void setScalingType(ScalingType scalingType) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType2;
        }
    }

    private static void adjustOrigin(float[] fArr) {
        fArr[12] = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[13] = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[12] = fArr[12] + 0.5f;
        fArr[13] = fArr[13] + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        r5 = new float[9];
        matrix.getValues(r5);
        return new float[]{r5[0], r5[3], 0.0f, r5[6], r5[1], r5[4], 0.0f, r5[7], 0.0f, 0.0f, 1.0f, 0.0f, r5[2], r5[5], 0.0f, r5[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = new float[]{fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    private static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        switch (scalingType.ordinal()) {
            case null:
                return 1.0f;
            case 1:
                return null;
            case 2:
                return BALANCED_VISIBLE_FRACTION;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static Point getDisplaySize(float f, float f2, int i, int i2) {
        if (f != 0.0f) {
            if (f2 != 0.0f) {
                return new Point(Math.min(i, Math.round((((float) i2) / f) * f2)), Math.min(i2, Math.round((((float) i) / f) / f2)));
            }
        }
        return new Point(i, i2);
    }

    public static Point getDisplaySize(ScalingType scalingType, float f, int i, int i2) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f, i, i2);
    }

    public static float[] getLayoutMatrix(boolean z, float f, float f2) {
        if (f2 > f) {
            f /= f2;
            f2 = 1.0f;
        } else {
            f2 /= f;
            f = 1.0f;
        }
        if (z) {
            f2 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f2, f, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static final float[] horizontalFlipMatrix() {
        return new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final float[] identityMatrix() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static float[] multiplyMatrices(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        android.opengl.Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        return fArr3;
    }

    public static float[] rotateTextureMatrix(float[] fArr, float f) {
        float[] fArr2 = new float[16];
        android.opengl.Matrix.setRotateM(fArr2, 0, f, 0.0f, 0.0f, 1.0f);
        adjustOrigin(fArr2);
        return multiplyMatrices(fArr, fArr2);
    }

    public static final float[] verticalFlipMatrix() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    }
}
