package X;

import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.1No */
public final class AnonymousClass1No implements AnonymousClass1Nj {
    public final void bKA(AnonymousClass1Nl anonymousClass1Nl, AnonymousClass1Nz anonymousClass1Nz) {
        AnonymousClass1Nn anonymousClass1Nn = (AnonymousClass1Nn) anonymousClass1Nl;
        if (anonymousClass1Nn.f17826E != StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            anonymousClass1Nz.m11087A("cpu_user_time_s", anonymousClass1Nn.f17826E);
        }
        if (anonymousClass1Nn.f17825D != StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            anonymousClass1Nz.m11087A("cpu_system_time_s", anonymousClass1Nn.f17825D);
        }
        if (anonymousClass1Nn.f17824C != StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            anonymousClass1Nz.m11087A("child_cpu_user_time_s", anonymousClass1Nn.f17824C);
        }
        if (anonymousClass1Nn.f17823B != StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            anonymousClass1Nz.m11087A("child_cpu_system_time_s", anonymousClass1Nn.f17823B);
        }
    }
}
