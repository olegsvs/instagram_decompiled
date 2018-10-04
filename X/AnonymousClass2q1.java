package X;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;

/* renamed from: X.2q1 */
public final class AnonymousClass2q1 implements OnFrameAvailableListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3th f34672B;

    public AnonymousClass2q1(AnonymousClass3th anonymousClass3th) {
        this.f34672B = anonymousClass3th;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f34672B.f46116F.obtainMessage(3).sendToTarget();
    }
}
