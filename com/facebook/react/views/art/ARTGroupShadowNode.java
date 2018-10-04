package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region.Op;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ARTGroupShadowNode extends ARTVirtualNode {
    public RectF mClipping;

    public final boolean isVirtual() {
        return true;
    }

    public ARTGroupShadowNode(ARTGroupShadowNode aRTGroupShadowNode) {
        super(aRTGroupShadowNode);
        this.mClipping = new RectF(aRTGroupShadowNode.mClipping);
    }

    public final ReactShadowNodeImpl copy() {
        return new ARTGroupShadowNode(this);
    }

    private static RectF createClipping(float[] fArr) {
        if (fArr.length == 4) {
            return new RectF(fArr[0], fArr[1], fArr[0] + fArr[2], fArr[1] + fArr[3]);
        }
        throw new JSApplicationIllegalArgumentException("Clipping should be array of length 4 (e.g. [x, y, width, height])");
    }

    public final void draw(Canvas canvas, Paint paint, float f) {
        f *= this.mOpacity;
        if (f > 0.01f) {
            Canvas canvas2 = canvas;
            saveAndSetupCanvas(canvas);
            RectF rectF = this.mClipping;
            if (rectF != null) {
                canvas2.clipRect(rectF.left * this.mScale, this.mClipping.top * this.mScale, this.mClipping.right * this.mScale, this.mClipping.bottom * this.mScale, Op.REPLACE);
            }
            for (int i = 0; i < getChildCount(); i++) {
                ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) getChildAt(i);
                aRTVirtualNode.draw(canvas, paint, f);
                aRTVirtualNode.markUpdateSeen();
            }
            ARTVirtualNode.restoreCanvas(canvas);
        }
    }

    @ReactProp(name = "clipping")
    public void setClipping(ReadableArray readableArray) {
        float[] toFloatArray = PropHelper.toFloatArray(readableArray);
        if (toFloatArray != null) {
            this.mClipping = createClipping(toFloatArray);
            markUpdated();
        }
    }
}
