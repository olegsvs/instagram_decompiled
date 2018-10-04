package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.4Kr */
public final class AnonymousClass4Kr extends AnonymousClass14I {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0eB f52853B;

    public AnonymousClass4Kr(AnonymousClass0eB anonymousClass0eB) {
        this.f52853B = anonymousClass0eB;
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float E = (float) anonymousClass0cN.E();
        int round = Math.round(255.0f * E);
        View[] viewArr = new View[]{this.f52853B.f7597K};
        if ((round > 0 ? 1 : null) != null) {
            AnonymousClass14H.H(false, viewArr);
        } else {
            AnonymousClass14H.E(false, viewArr);
        }
        this.f52853B.f7597K.getBackground().mutate().setAlpha(round);
        if (this.f52853B.f7631s) {
            ViewGroup viewGroup = this.f52853B.f7606T;
            float f = 1.0f;
            if (this.f52853B.f7596J != null) {
                if (this.f52853B.f7596J.mo5397Q()) {
                    f = (float) AnonymousClass0dh.C((double) (1.0f - E), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 0.5d, 1.0d);
                }
            }
            viewGroup.setAlpha(f);
        }
    }
}
