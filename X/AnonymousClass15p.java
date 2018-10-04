package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.15p */
public final class AnonymousClass15p extends SurfaceTexture {
    public AnonymousClass15p() {
        super(0);
        detachFromGLContext();
    }

    public final void detachFromGLContext() {
        try {
            super.detachFromGLContext();
        } catch (Throwable e) {
            AnonymousClass0Dc.m1244G("AndroidV19SurfaceTexture", "Error in detachFromGLContext()", e);
        }
    }
}
