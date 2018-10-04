package X;

import android.net.LocalSocket;

/* renamed from: X.1f5 */
public final class AnonymousClass1f5 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Gj f21079B;
    /* renamed from: C */
    public final /* synthetic */ LocalSocket f21080C;

    public AnonymousClass1f5(AnonymousClass1Gj anonymousClass1Gj, LocalSocket localSocket) {
        this.f21079B = anonymousClass1Gj;
        this.f21080C = localSocket;
    }

    public final void run() {
        synchronized (this.f21079B.f16326B.f16308C) {
            try {
                this.f21079B.f16326B.f16309D.add(this.f21080C);
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    break;
                }
            }
        }
        AnonymousClass1Gg.m10513E(this.f21079B.f16326B, this.f21080C, this.f21079B.f16328D, this.f21079B.f16329E);
        synchronized (this.f21079B.f16326B.f16308C) {
            try {
                this.f21079B.f16326B.f16309D.remove(this.f21080C);
            } catch (Throwable th3) {
                th2 = th3;
                throw th2;
            }
        }
    }
}
