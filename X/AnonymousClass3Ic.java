package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;
import com.instagram.creation.base.ui.ConstrainedTextureView;

/* renamed from: X.3Ic */
public final class AnonymousClass3Ic implements SurfaceTextureListener {
    /* renamed from: B */
    public AnonymousClass3IV f39952B;
    /* renamed from: C */
    public AnonymousClass38K f39953C;
    /* renamed from: D */
    public AnonymousClass5TW f39954D;
    /* renamed from: E */
    public AnonymousClass3oW f39955E;
    /* renamed from: F */
    private final Context f39956F;
    /* renamed from: G */
    private AnonymousClass42q f39957G;
    /* renamed from: H */
    private ConstrainedTextureView f39958H;

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public AnonymousClass3Ic(Context context) {
        this.f39956F = context;
    }

    /* renamed from: A */
    public final ConstrainedTextureView m19301A(Context context) {
        this.f39958H = new ConstrainedTextureView(context);
        return this.f39958H;
    }

    /* renamed from: B */
    private void m19299B(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f39955E = new AnonymousClass3oW(this.f39956F, surfaceTexture, i, i2);
        if (this.f39953C == null) {
            this.f39957G = new AnonymousClass42q(this.f39955E.f44792G, this.f39952B.NVA(), false);
        } else {
            this.f39957G = new AnonymousClass42q(this.f39956F, this.f39955E.f44792G, this.f39952B.NVA(), false);
            this.f39953C.f38214B = this.f39957G;
        }
        this.f39952B.hw(this.f39955E, this.f39957G);
        this.f39957G.f48870R = this.f39954D;
        new Thread(this.f39955E).start();
    }

    /* renamed from: C */
    private boolean m19300C(SurfaceTexture surfaceTexture) {
        AnonymousClass3IV anonymousClass3IV = this.f39952B;
        if (anonymousClass3IV != null) {
            AnonymousClass3oW anonymousClass3oW = this.f39955E;
            if (anonymousClass3oW != null) {
                anonymousClass3IV.iw(anonymousClass3oW);
                this.f39957G.f48870R = null;
                this.f39955E.m20752A();
                this.f39955E = null;
            }
        }
        return true;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        m19299B(surfaceTexture, i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return m19300C(surfaceTexture);
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        m19300C(surfaceTexture);
        m19299B(surfaceTexture, i, i2);
    }
}
