package X;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.camera.capture.IgCameraFocusView;

/* renamed from: X.36f */
public final class AnonymousClass36f extends AnonymousClass14I {
    /* renamed from: B */
    public final /* synthetic */ IgCameraFocusView f37863B;

    public AnonymousClass36f(IgCameraFocusView igCameraFocusView) {
        this.f37863B = igCameraFocusView;
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        anonymousClass0cN = this.f37863B;
        anonymousClass0cN.f37864B = false;
        anonymousClass0cN.f37869G = false;
        anonymousClass0cN.f37865C.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        anonymousClass0cN.invalidate();
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        IgCameraFocusView igCameraFocusView = this.f37863B;
        igCameraFocusView.f37868F = (igCameraFocusView.f37867E * 2.0f) - (((float) anonymousClass0cN.E()) * this.f37863B.f37867E);
        this.f37863B.invalidate();
    }
}
