package X;

import android.os.SystemClock;

/* renamed from: X.64i */
public final class AnonymousClass64i implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass64j f71529B;
    /* renamed from: C */
    private long f71530C = SystemClock.elapsedRealtime();

    public AnonymousClass64i(AnonymousClass64j anonymousClass64j) {
        this.f71529B = anonymousClass64j;
    }

    public final void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass64j anonymousClass64j = this.f71529B;
        anonymousClass64j.f71531B += elapsedRealtime - this.f71530C;
        this.f71530C = elapsedRealtime;
        if (this.f71529B.f71533D != null) {
            AnonymousClass6GJ anonymousClass6GJ = this.f71529B.f71533D;
            long j = this.f71529B.f71531B;
            AnonymousClass68p anonymousClass68p = anonymousClass6GJ.f73698B;
            anonymousClass68p.f72200F = j;
            anonymousClass68p.f72199E.Fk();
        }
        AnonymousClass0OR.F(this.f71529B.f71532C, this, (long) this.f71529B.f71534E, 520707337);
    }
}
