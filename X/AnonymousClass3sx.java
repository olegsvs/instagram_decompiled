package X;

import android.graphics.SurfaceTexture;
import java.lang.ref.WeakReference;

/* renamed from: X.3sx */
public final class AnonymousClass3sx implements AnonymousClass2no {
    /* renamed from: B */
    private WeakReference f45932B;

    public final void MJA(boolean z, SurfaceTexture surfaceTexture) {
    }

    public final void gy(int i, int i2) {
    }

    public final void iy(SurfaceTexture surfaceTexture) {
    }

    public final void we(int i, int i2, int i3) {
    }

    public AnonymousClass3sx(SurfaceTexture surfaceTexture) {
        this.f45932B = new WeakReference(surfaceTexture);
    }

    public final SurfaceTexture dS() {
        return (SurfaceTexture) this.f45932B.get();
    }

    public final SurfaceTexture eS() {
        return (SurfaceTexture) this.f45932B.get();
    }

    public final void hy(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f45932B = new WeakReference(surfaceTexture);
    }

    public final AnonymousClass2np zT() {
        return new AnonymousClass3sy();
    }
}
