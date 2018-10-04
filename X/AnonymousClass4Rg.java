package X;

import android.view.View;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.4Rg */
public final class AnonymousClass4Rg implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Rl f54127B;

    public AnonymousClass4Rg(AnonymousClass4Rl anonymousClass4Rl) {
        this.f54127B = anonymousClass4Rl;
    }

    public final void run() {
        this.f54127B.f54137G.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        AnonymousClass14H.H(true, new View[]{this.f54127B.f54132B});
    }
}
