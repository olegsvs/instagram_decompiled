package X;

/* renamed from: X.589 */
public final class AnonymousClass589 extends AnonymousClass0nF {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0IJ f60420B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Cn f60421C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass2Na f60422D;

    public AnonymousClass589(AnonymousClass0IJ anonymousClass0IJ, AnonymousClass0Cn anonymousClass0Cn, AnonymousClass2Na anonymousClass2Na) {
        this.f60420B = anonymousClass0IJ;
        this.f60421C = anonymousClass0Cn;
        this.f60422D = anonymousClass2Na;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m25810B(Object obj) {
        m25811C((AnonymousClass0GM) obj);
    }

    /* renamed from: C */
    public final void m25811C(AnonymousClass0GM anonymousClass0GM) {
        if (anonymousClass0GM.getShouldShowSmartLockForLogin()) {
            anonymousClass0GM.getSmartLockBroker(this.f60420B.getActivity(), new AnonymousClass588(this));
        }
    }
}
