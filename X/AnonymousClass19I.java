package X;

/* renamed from: X.19I */
public final class AnonymousClass19I implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0T7 f15124B;

    public AnonymousClass19I(AnonymousClass0T7 anonymousClass0T7) {
        this.f15124B = anonymousClass0T7;
    }

    public final void run() {
        AnonymousClass0T8 anonymousClass0T8;
        AnonymousClass0T7 anonymousClass0T7 = this.f15124B;
        synchronized (anonymousClass0T7.f5093B) {
            anonymousClass0T8 = (AnonymousClass0T8) anonymousClass0T7.f5093B.m6427A("state-v1", false);
        }
        anonymousClass0T7.f5094C.m4474B(anonymousClass0T8);
    }
}
