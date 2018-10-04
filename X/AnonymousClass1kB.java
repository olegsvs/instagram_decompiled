package X;

/* renamed from: X.1kB */
public final class AnonymousClass1kB implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1k7 f22073B;
    /* renamed from: C */
    public final /* synthetic */ int f22074C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1Fk f22075D;

    public AnonymousClass1kB(AnonymousClass1k7 anonymousClass1k7, int i, AnonymousClass1Fk anonymousClass1Fk) {
        this.f22073B = anonymousClass1k7;
        this.f22074C = i;
        this.f22075D = anonymousClass1Fk;
    }

    public final void run() {
        try {
            AnonymousClass1k7.m12810C(this.f22073B, this.f22074C, this.f22075D);
        } finally {
            AnonymousClass1k7.m12809B(this.f22073B);
        }
    }
}
