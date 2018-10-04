package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.387 */
public final class AnonymousClass387 extends AnonymousClass2Pm implements AnonymousClass1sm {
    /* renamed from: B */
    private Surface f38160B;
    /* renamed from: C */
    private final SurfaceTexture f38161C;

    public final AnonymousClass1sn DN() {
        return null;
    }

    public final void TCA() {
    }

    public final int getHeight() {
        return 0;
    }

    public final int getWidth() {
        return 0;
    }

    public final boolean kD() {
        return false;
    }

    public final String qN() {
        return "FakeVideoOutput";
    }

    public AnonymousClass387(SurfaceTexture surfaceTexture) {
        this.f38161C = surfaceTexture;
    }

    public final AnonymousClass1xq CP() {
        return AnonymousClass1xq.PREVIEW;
    }

    public final void destroy() {
        release();
    }

    public final void release() {
        Surface surface = this.f38160B;
        if (surface != null) {
            surface.release();
            this.f38160B = null;
        }
        super.release();
    }

    public final void vV(AnonymousClass2Ps anonymousClass2Ps, AnonymousClass2Pt anonymousClass2Pt) {
        release();
        Surface surface = new Surface(this.f38161C);
        this.f38160B = surface;
        anonymousClass2Ps.m15629A(this, surface);
    }
}
