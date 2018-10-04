package X;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;

/* renamed from: X.28d */
public final class AnonymousClass28d {
    /* renamed from: B */
    public final AnonymousClass28c f26577B;
    /* renamed from: C */
    private final SurfaceHolder f26578C;
    /* renamed from: D */
    private final SurfaceTexture f26579D;

    public AnonymousClass28d() {
        this.f26579D = null;
        this.f26578C = null;
        this.f26577B = AnonymousClass28c.PBUFFER;
    }

    public AnonymousClass28d(SurfaceTexture surfaceTexture) {
        this.f26579D = surfaceTexture;
        this.f26578C = null;
        this.f26577B = AnonymousClass28c.SURFACE_TEXTURE;
    }

    /* renamed from: A */
    public final Object m14570A() {
        switch (this.f26577B.ordinal()) {
            case 0:
                return this.f26579D;
            case 1:
                return this.f26578C;
            case 2:
                return null;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SurfaceType ");
                stringBuilder.append(this.f26577B);
                stringBuilder.append(" not handled");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
