package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglRenderer;
import org.webrtc.ThreadUtils;

/* renamed from: X.6HO */
public final class AnonymousClass6HO extends EglRenderer implements SurfaceTextureListener {
    public AnonymousClass6HO(String str) {
        super(str);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        createEglSurface(surfaceTexture);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new AnonymousClass5im(this, countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Integer.valueOf(i);
        Integer.valueOf(i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
