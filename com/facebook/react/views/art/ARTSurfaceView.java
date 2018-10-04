package com.facebook.react.views.art;

import android.content.Context;
import android.view.TextureView;

public final class ARTSurfaceView extends TextureView {
    public ARTSurfaceView(Context context) {
        super(context);
        setOpaque(false);
    }
}
