package org.webrtc;

import java.util.concurrent.Callable;
import org.webrtc.VideoFrame.TextureBuffer;

public final /* synthetic */ class -$$Lambda$SurfaceTextureHelper$QCHEWwLo2quFxn2HxtfyJ7yZoh0 implements Callable {
    private final /* synthetic */ SurfaceTextureHelper f$0;
    private final /* synthetic */ TextureBuffer f$1;

    public /* synthetic */ -$$Lambda$SurfaceTextureHelper$QCHEWwLo2quFxn2HxtfyJ7yZoh0(SurfaceTextureHelper surfaceTextureHelper, TextureBuffer textureBuffer) {
        this.f$0 = surfaceTextureHelper;
        this.f$1 = textureBuffer;
    }

    public final Object call() {
        return this.f$0.yuvConverter.convert(this.f$1);
    }
}
