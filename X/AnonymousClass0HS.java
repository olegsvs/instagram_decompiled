package X;

import android.os.MessageQueue.IdleHandler;

/* renamed from: X.0HS */
public final class AnonymousClass0HS implements IdleHandler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Cn f2635B;
    /* renamed from: C */
    public final /* synthetic */ String f2636C;

    public AnonymousClass0HS(String str, AnonymousClass0Cn anonymousClass0Cn) {
        this.f2636C = str;
        this.f2635B = anonymousClass0Cn;
    }

    public final boolean queueIdle() {
        boolean L;
        AnonymousClass0aq B = AnonymousClass0ap.m5490B();
        String str = this.f2636C;
        if (this.f2635B.xX()) {
            L = AnonymousClass0a2.m5427L(AnonymousClass0FL.m1559B(this.f2635B));
        } else {
            L = AnonymousClass0FO.m1596T();
        }
        B.FW(str, L);
        if (!this.f2635B.xX() && AnonymousClass0FO.m1596T()) {
            AnonymousClass0Gn.m1876C("IgFamilyApplicationInitializer", "App not logged in but isEmployee is true");
        }
        return false;
    }
}
