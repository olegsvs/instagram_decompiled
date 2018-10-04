package X;

/* renamed from: X.66F */
public final class AnonymousClass66F implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass66J f71731B;

    public AnonymousClass66F(AnonymousClass66J anonymousClass66J) {
        this.f71731B = anonymousClass66J;
    }

    public final void run() {
        AnonymousClass66J anonymousClass66J = this.f71731B;
        long j = anonymousClass66J.f71781N + 1;
        anonymousClass66J.f71781N = j;
        AnonymousClass66J.m28986C(anonymousClass66J, AnonymousClass66I.UPDATED).C("update_counter", j).R();
        AnonymousClass66J.m28989F(this.f71731B);
    }
}
