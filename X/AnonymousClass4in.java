package X;

import android.os.Handler;

/* renamed from: X.4in */
public final class AnonymousClass4in implements Runnable {
    /* renamed from: B */
    public final AnonymousClass1SI f56494B;
    /* renamed from: C */
    public long f56495C = -1;
    /* renamed from: D */
    public int f56496D;
    /* renamed from: E */
    public final Handler f56497E;
    /* renamed from: F */
    private final AnonymousClass4ik f56498F;

    public AnonymousClass4in(Handler handler, AnonymousClass4ik anonymousClass4ik, AnonymousClass1SI anonymousClass1SI, int i) {
        this.f56497E = handler;
        this.f56498F = anonymousClass4ik;
        this.f56494B = anonymousClass1SI;
        this.f56496D = i;
    }

    /* renamed from: B */
    public static void m24858B(AnonymousClass4in anonymousClass4in) {
        anonymousClass4in.f56494B.HMA();
        anonymousClass4in.f56496D = 2;
        anonymousClass4in.f56498F.kz(anonymousClass4in.f56494B);
    }

    public final void run() {
        if (this.f56496D == 1) {
            AnonymousClass4in.m24858B(this);
        }
    }
}
