package X;

import android.os.SystemClock;

/* renamed from: X.05v */
public final class AnonymousClass05v implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass05w f209B;
    /* renamed from: C */
    private volatile long f210C;
    /* renamed from: D */
    private volatile long f211D = -1;
    /* renamed from: E */
    private final long f212E = SystemClock.uptimeMillis();
    /* renamed from: F */
    private final Runnable f213F;

    public AnonymousClass05v(AnonymousClass05w anonymousClass05w, Runnable runnable) {
        this.f209B = anonymousClass05w;
        this.f213F = runnable;
    }

    public final void run() {
        this.f211D = SystemClock.uptimeMillis();
        if (this.f209B.f215C != -1 && this.f211D - this.f212E > ((long) this.f209B.f215C)) {
            AnonymousClass0Dc.m1245H("SerialExecutor", "dispatch time exceeded limit: %s", this.f209B.f217E);
        }
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        this.f213F.run();
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f209B.f214B != -1 && currentThreadTimeMillis2 - currentThreadTimeMillis > ((long) this.f209B.f214B)) {
            AnonymousClass0Dc.m1245H("SerialExecutor", "compute time exceeded limit: %s", this.f209B.f217E);
        }
        if (this.f209B.f216D != -1 && uptimeMillis - this.f211D > ((long) this.f209B.f216D)) {
            AnonymousClass0Dc.m1245H("SerialExecutor", "wall clock runtime exceeded limit: %s", this.f209B.f217E);
        }
        AnonymousClass05w.m350C(this.f209B);
    }
}
