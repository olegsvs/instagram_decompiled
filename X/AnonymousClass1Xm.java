package X;

/* renamed from: X.1Xm */
public final class AnonymousClass1Xm implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0w5 f19867B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0m3 f19868C;

    public AnonymousClass1Xm(AnonymousClass0w5 anonymousClass0w5, AnonymousClass0m3 anonymousClass0m3) {
        this.f19867B = anonymousClass0w5;
        this.f19868C = anonymousClass0m3;
    }

    public final void run() {
        if (!this.f19868C.f9669D) {
            this.f19868C.m7459L(true, false);
            this.f19868C.f9670E = "dwell";
            this.f19868C.m7465R(true);
            this.f19867B.f12213B.remove(Integer.valueOf(this.f19868C.hashCode()));
        }
    }
}
