package com.facebook.react.views.art;

import X.AnonymousClass0Df;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ARTSurfaceViewShadowNode extends LayoutShadowNode implements SurfaceTextureListener {
    private Integer mBackgroundColor;
    private Surface mSurface;

    public final boolean isVirtual() {
        return false;
    }

    public final boolean isVirtualAnchor() {
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    private void drawOutput() {
        Surface surface = this.mSurface;
        if (surface != null) {
            if (surface.isValid()) {
                try {
                    Canvas lockCanvas = this.mSurface.lockCanvas(null);
                    int i = 0;
                    lockCanvas.drawColor(0, Mode.CLEAR);
                    if (this.mBackgroundColor != null) {
                        lockCanvas.drawColor(this.mBackgroundColor.intValue());
                    }
                    Paint paint = new Paint();
                    while (i < getChildCount()) {
                        ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) getChildAt(i);
                        aRTVirtualNode.draw(lockCanvas, paint, 1.0f);
                        aRTVirtualNode.markUpdateSeen();
                        i++;
                    }
                    if (this.mSurface != null) {
                        this.mSurface.unlockCanvasAndPost(lockCanvas);
                    }
                } catch (IllegalArgumentException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(e.getClass().getSimpleName());
                    stringBuilder.append(" in Surface.unlockCanvasAndPost");
                    AnonymousClass0Df.C("ReactNative", stringBuilder.toString());
                }
                return;
            }
        }
        markChildrenUpdatesSeen(this);
    }

    private void markChildrenUpdatesSeen(ReactShadowNode reactShadowNode) {
        for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
            ReactShadowNode childAt = reactShadowNode.getChildAt(i);
            childAt.markUpdateSeen();
            markChildrenUpdatesSeen(childAt);
        }
    }

    public final void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        drawOutput();
        uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), this);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mSurface = new Surface(surfaceTexture);
        drawOutput();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        this.mSurface = null;
        return true;
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        this.mBackgroundColor = num;
        markUpdated();
    }
}
