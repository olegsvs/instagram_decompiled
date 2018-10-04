package X;

import android.graphics.SurfaceTexture;
import android.view.WindowManager;

/* renamed from: X.386 */
public final class AnonymousClass386 {
    /* renamed from: B */
    public final AnonymousClass36d f38153B;
    /* renamed from: C */
    public final AnonymousClass2iH f38154C;
    /* renamed from: D */
    public final AnonymousClass3rf f38155D;
    /* renamed from: E */
    public final Object f38156E = new Object();
    /* renamed from: F */
    public SurfaceTexture f38157F;
    /* renamed from: G */
    public final AnonymousClass2iO f38158G;
    /* renamed from: H */
    private final WindowManager f38159H;

    public AnonymousClass386(AnonymousClass36d anonymousClass36d, WindowManager windowManager, AnonymousClass2iK anonymousClass2iK) {
        AnonymousClass386 anonymousClass386 = this;
        this.f38153B = anonymousClass36d;
        this.f38159H = windowManager;
        AnonymousClass2Q0 anonymousClass2Q0 = AnonymousClass2Q0.f30267D;
        AnonymousClass1rX anonymousClass1rX = AnonymousClass1rX.CAMERA1;
        anonymousClass386.f38158G = new AnonymousClass2iO(anonymousClass386, anonymousClass2Q0, anonymousClass1rX == anonymousClass1rX ? new AnonymousClass2Pb() : new AnonymousClass2Pc(), AnonymousClass1si.DISABLE, AnonymousClass1sn.CROP, true, true, "IgCameraVideoInput", null);
        if (anonymousClass2iK == null) {
            anonymousClass386.f38154C = null;
            anonymousClass386.f38155D = null;
            return;
        }
        anonymousClass386.f38154C = new AnonymousClass2iH(anonymousClass386.f38158G, anonymousClass2iK);
        AnonymousClass2nX anonymousClass3rf = new AnonymousClass3rf(anonymousClass386.f38154C, 17);
        anonymousClass386.f38155D = anonymousClass3rf;
        anonymousClass36d.sB(anonymousClass3rf, 3);
    }

    /* renamed from: A */
    public final AnonymousClass2SE m18660A() {
        if (!this.f38153B.gX()) {
            return null;
        }
        return new AnonymousClass2SE(this.f38153B.sW() ? AnonymousClass1yA.FRONT : AnonymousClass1yA.BACK);
    }

    /* renamed from: B */
    public final AnonymousClass2SI m18661B() {
        if (!this.f38153B.gX()) {
            return null;
        }
        return new AnonymousClass2SI(this.f38159H.getDefaultDisplay().getRotation(), this.f38153B.fD(this.f38153B.wO()));
    }
}
