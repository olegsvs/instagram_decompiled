package X;

/* renamed from: X.143 */
public final class AnonymousClass143 implements AnonymousClass0aL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass141 f13820B;

    public AnonymousClass143(AnonymousClass0bL anonymousClass0bL, AnonymousClass141 anonymousClass141) {
        this.f13820B = anonymousClass141;
    }

    public final void DWA(AnonymousClass0Qw anonymousClass0Qw) {
        AnonymousClass141 anonymousClass141 = this.f13820B;
        AnonymousClass0aL anonymousClass0aL = anonymousClass141.f13815J;
        if (anonymousClass0aL != null) {
            anonymousClass0aL.DWA(anonymousClass0Qw);
        } else {
            anonymousClass141.f13807B = anonymousClass0Qw;
        }
    }

    public final void cancel() {
        AnonymousClass141 anonymousClass141 = this.f13820B;
        AnonymousClass0aL anonymousClass0aL = anonymousClass141.f13815J;
        if (anonymousClass0aL != null) {
            anonymousClass0aL.cancel();
        } else {
            anonymousClass141.f13809D = true;
        }
    }
}
