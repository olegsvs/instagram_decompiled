package X;

import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.4lX */
public final class AnonymousClass4lX implements AnonymousClass0QV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4lb f56951B;

    public AnonymousClass4lX(AnonymousClass4lb anonymousClass4lb) {
        this.f56951B = anonymousClass4lb;
    }

    public final boolean Hj(AnonymousClass2bz anonymousClass2bz, float f, float f2) {
        this.f56951B.f56958C.Gj(f);
        return anonymousClass2bz.B();
    }

    public final void Tj(AnonymousClass2bz anonymousClass2bz, float f, float f2, float f3, boolean z) {
        this.f56951B.f56960E.setTranslationY(0.5f * f2);
        float C = (float) AnonymousClass0dh.C(AnonymousClass0dh.B((double) Math.abs(f3), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) this.f56951B.f56960E.getHeight()), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) this.f56951B.f56960E.getHeight(), 0.0f, 0.0f);
        float C2 = (float) AnonymousClass0dh.C((double) C, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 0.0f, 0.0f);
        this.f56951B.f56960E.setPivotX((float) (this.f56951B.f56960E.getWidth() / 2));
        this.f56951B.f56960E.setPivotY((float) (this.f56951B.f56960E.getHeight() / 2));
        this.f56951B.f56960E.setScaleX(C2);
        this.f56951B.f56960E.setScaleY(C2);
        this.f56951B.f56958C.fj(C);
    }

    public final void bj(AnonymousClass2bz anonymousClass2bz, float f, float f2, float f3, float f4, float f5) {
        Object obj = 1;
        Object obj2 = f2 > 400.0f ? 1 : null;
        float f6 = f5;
        if (f2 <= 0.0f || f5 <= 1250.0f) {
            obj = null;
        }
        if (obj2 == null) {
            if (obj == null) {
                anonymousClass2bz.A(0.0f, 0.0f, f4, f6, AnonymousClass4lb.f56956F, true);
                return;
            }
        }
        this.f56951B.f56958C.Dr();
    }

    public final boolean eAA(AnonymousClass2bz anonymousClass2bz, float f, float f2) {
        return this.f56951B.f56958C.JDA(this.f56951B.f56960E, f, f2);
    }

    public final void jEA(AnonymousClass2bz anonymousClass2bz) {
        this.f56951B.f56958C.iEA();
    }

    public final boolean lj(AnonymousClass2bz anonymousClass2bz, float f, float f2, float f3, boolean z) {
        return f2 < 0.0f && this.f56951B.f56957B;
    }
}
