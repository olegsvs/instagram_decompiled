package X;

/* renamed from: X.0s7 */
public final class AnonymousClass0s7 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0IL f11337B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0s1 f11338C;

    public AnonymousClass0s7(AnonymousClass0IL anonymousClass0IL, AnonymousClass0s1 anonymousClass0s1) {
        this.f11337B = anonymousClass0IL;
        this.f11338C = anonymousClass0s1;
    }

    public final void run() {
        if (this.f11337B.isResumed()) {
            AnonymousClass0s0.m8049C(this.f11338C);
        } else {
            AnonymousClass0Gn.m1876C("AYSF_H_SCROLL_UNIT", "Fragment is not resumed in maybeAnimateNewBadge(...) method.");
        }
    }
}
