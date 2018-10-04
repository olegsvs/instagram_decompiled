package X;

import android.os.Build.VERSION;

/* renamed from: X.4KN */
public final class AnonymousClass4KN implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0eB f52819B;

    public AnonymousClass4KN(AnonymousClass0eB anonymousClass0eB) {
        this.f52819B = anonymousClass0eB;
    }

    public final void run() {
        AnonymousClass0Ea.f1980C.e(17629195);
        AnonymousClass36h H = this.f52819B.f7598L.m18690H();
        Object obj = (H == null || H.m18537C()) ? null : 1;
        if (obj != null) {
            H = this.f52819B.f7598L.m18690H();
            Object obj2 = 1;
            if (H == null || H.f37892V != 1) {
                obj2 = null;
            }
            if (obj2 == null) {
                if (!((Boolean) AnonymousClass0CC.dD.H(this.f52819B.fB)).booleanValue()) {
                    AnonymousClass0GA anonymousClass4Ku = new AnonymousClass4Ku(this.f52819B);
                    if (VERSION.SDK_INT >= 21) {
                        anonymousClass4Ku.f52864B.OB.schedule(anonymousClass4Ku);
                    } else {
                        AnonymousClass1cI.f20620B.schedule(anonymousClass4Ku);
                    }
                    return;
                }
            }
            AnonymousClass38H anonymousClass38H = this.f52819B.f7598L;
            AnonymousClass4Kt anonymousClass4Kt = new AnonymousClass4Kt(this.f52819B);
            AnonymousClass3y3 anonymousClass3y3 = anonymousClass38H.f38204C.f7645G;
            synchronized (anonymousClass3y3) {
                AnonymousClass389 anonymousClass389 = anonymousClass3y3.f47492C;
                anonymousClass389.f38170F.m16950J(new AnonymousClass1rc(anonymousClass389.f38175K, anonymousClass389.f38174J), null, anonymousClass4Kt, null, false, true);
            }
            return;
        }
        AnonymousClass0eB.f(this.f52819B);
    }
}
