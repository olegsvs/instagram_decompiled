package X;

import java.util.List;

/* renamed from: X.1PP */
public final class AnonymousClass1PP implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Gy f18159B;
    /* renamed from: C */
    public final /* synthetic */ List f18160C;

    public AnonymousClass1PP(AnonymousClass0Gy anonymousClass0Gy, List list) {
        this.f18159B = anonymousClass0Gy;
        this.f18160C = list;
    }

    public final void run() {
        AnonymousClass0Gy.m1936B(this.f18159B, this.f18160C);
        AnonymousClass1PC.m11247C(this.f18159B.f2517F, this.f18159B.f2513B);
        if (this.f18159B.f2516E.get() > 0) {
            AnonymousClass0NN.m3291B("ig_cache_report_loss", null).m3294B("count", this.f18159B.f2516E.get()).m3310R();
            this.f18159B.f2516E.set(0);
        }
    }
}
