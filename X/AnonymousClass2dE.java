package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.2dE */
public final class AnonymousClass2dE extends AnonymousClass2Pm implements AnonymousClass1sm {
    /* renamed from: B */
    private int f31764B;
    /* renamed from: C */
    private Surface f31765C;
    /* renamed from: D */
    private SurfaceTexture f31766D;
    /* renamed from: E */
    private AnonymousClass1uu f31767E;
    /* renamed from: F */
    private int f31768F;

    public final AnonymousClass1sn DN() {
        return null;
    }

    public final void TCA() {
    }

    public final boolean kD() {
        return false;
    }

    public final String qN() {
        return "OffscreenOutput";
    }

    public AnonymousClass2dE() {
        this(1, 1);
    }

    public AnonymousClass2dE(int i, int i2) {
        this.f31768F = i;
        this.f31764B = i2;
    }

    /* renamed from: B */
    public final Surface m16598B() {
        release();
        this.f31767E = new AnonymousClass1ut().m13709A();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f31767E.f24087C);
        this.f31766D = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.f31768F, this.f31764B);
        Surface surface = new Surface(this.f31766D);
        this.f31765C = surface;
        return surface;
    }

    public final AnonymousClass1xq CP() {
        return AnonymousClass1xq.PREVIEW;
    }

    public final void destroy() {
        release();
    }

    public final int getHeight() {
        return this.f31764B;
    }

    public final int getWidth() {
        return this.f31768F;
    }

    public final void release() {
        Surface surface = this.f31765C;
        if (surface != null) {
            surface.release();
            this.f31765C = null;
        }
        SurfaceTexture surfaceTexture = this.f31766D;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f31766D = null;
        }
        AnonymousClass1uu anonymousClass1uu = this.f31767E;
        if (anonymousClass1uu != null) {
            anonymousClass1uu.m13711A();
            this.f31767E = null;
        }
        super.release();
    }

    public final void vV(AnonymousClass2Ps anonymousClass2Ps, AnonymousClass2Pt anonymousClass2Pt) {
        anonymousClass2Ps.m15629A(this, m16598B());
    }
}
