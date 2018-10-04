package com.instagram.common.ui.widget.textureview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MultiListenerTextureView extends TextureView implements SurfaceTextureListener {
    /* renamed from: B */
    public final List f26020B;

    public MultiListenerTextureView(Context context) {
        this(context, null);
    }

    public MultiListenerTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiListenerTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26020B = new CopyOnWriteArrayList();
        super.setSurfaceTextureListener(this);
    }

    /* renamed from: A */
    public final void m14434A(SurfaceTextureListener surfaceTextureListener) {
        if (!this.f26020B.contains(surfaceTextureListener)) {
            this.f26020B.add(surfaceTextureListener);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        for (int i3 = 0; i3 < this.f26020B.size(); i3++) {
            ((SurfaceTextureListener) this.f26020B.get(i3)).onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z = true;
        for (int i = 0; i < this.f26020B.size(); i++) {
            z = z && ((SurfaceTextureListener) this.f26020B.get(i)).onSurfaceTextureDestroyed(surfaceTexture);
        }
        return z;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        for (int i3 = 0; i3 < this.f26020B.size(); i3++) {
            ((SurfaceTextureListener) this.f26020B.get(i3)).onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        for (int i = 0; i < this.f26020B.size(); i++) {
            ((SurfaceTextureListener) this.f26020B.get(i)).onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Use addSurfaceTextureListener instead. If you only have one listener, you shouldn't be using this custom view.");
    }
}
