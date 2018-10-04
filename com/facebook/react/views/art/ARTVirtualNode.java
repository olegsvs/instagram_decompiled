package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;

public abstract class ARTVirtualNode extends ReactShadowNodeImpl {
    private static final float[] sMatrixData = new float[9];
    private static final float[] sRawMatrix = new float[9];
    private Matrix mMatrix;
    public float mOpacity;
    public final float mScale;

    public abstract void draw(Canvas canvas, Paint paint, float f);

    public boolean isVirtual() {
        return true;
    }

    public ARTVirtualNode() {
        this.mOpacity = 1.0f;
        this.mMatrix = new Matrix();
        this.mScale = DisplayMetricsHolder.getWindowDisplayMetrics().density;
    }

    public ARTVirtualNode(ARTVirtualNode aRTVirtualNode) {
        super(aRTVirtualNode);
        this.mOpacity = 1.0f;
        this.mMatrix = new Matrix();
        this.mScale = aRTVirtualNode.mScale;
        this.mOpacity = aRTVirtualNode.mOpacity;
        this.mMatrix = new Matrix(aRTVirtualNode.mMatrix);
    }

    public static final void restoreCanvas(Canvas canvas) {
        canvas.restore();
    }

    public final void saveAndSetupCanvas(Canvas canvas) {
        canvas.save();
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            canvas.concat(matrix);
        }
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.mOpacity = f;
        markUpdated();
    }

    @ReactProp(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int toFloatArray = PropHelper.toFloatArray(readableArray, sMatrixData);
            if (toFloatArray == 6) {
                setupMatrix();
            } else if (toFloatArray != -1) {
                throw new JSApplicationIllegalArgumentException("Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix = null;
        }
        markUpdated();
    }

    public final void setupMatrix() {
        float[] fArr = sRawMatrix;
        float[] fArr2 = sMatrixData;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[2];
        float f = fArr2[4];
        float f2 = this.mScale;
        fArr[2] = f * f2;
        fArr[3] = fArr2[1];
        fArr[4] = fArr2[3];
        fArr[5] = fArr2[5] * f2;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        if (this.mMatrix == null) {
            this.mMatrix = new Matrix();
        }
        this.mMatrix.setValues(fArr);
    }
}
