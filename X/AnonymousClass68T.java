package X;

/* renamed from: X.68T */
public final class AnonymousClass68T extends AnonymousClass3AL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass68U f72139B;

    public AnonymousClass68T(AnonymousClass68U anonymousClass68U) {
        this.f72139B = anonymousClass68U;
    }

    /* renamed from: A */
    public final void m29179A(Exception exception) {
        AnonymousClass68i anonymousClass68i = this.f72139B.f72140B;
        String exception2 = exception.toString();
        anonymousClass68i.f72166J.m28995D("endBroadcastSession", "mCurrentStreamingSession.release failed", exception2, true);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m29180B(Object obj) {
        AnonymousClass5OA anonymousClass5OA = (AnonymousClass5OA) obj;
        AnonymousClass0Sy.F(new AnonymousClass68S(this.f72139B.f72140B));
    }
}
