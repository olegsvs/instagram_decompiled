package X;

import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.4MB */
public final class AnonymousClass4MB extends AnonymousClass14I {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Sy f53174B;

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public AnonymousClass4MB(AnonymousClass5Sy anonymousClass5Sy) {
        this.f53174B = anonymousClass5Sy;
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float max = (float) Math.max(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, anonymousClass0cN.E());
        AnonymousClass5Sy anonymousClass5Sy = this.f53174B;
        anonymousClass5Sy.f64183K = (max * (anonymousClass5Sy.f64184L - 1.0f)) + 1.0f;
        AnonymousClass5Sy.E(this.f53174B);
    }
}
