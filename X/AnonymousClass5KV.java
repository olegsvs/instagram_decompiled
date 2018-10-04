package X;

/* renamed from: X.5KV */
public final class AnonymousClass5KV implements AnonymousClass1Ar {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Ka f62291B;

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public AnonymousClass5KV(AnonymousClass5Ka anonymousClass5Ka) {
        this.f62291B = anonymousClass5Ka;
    }

    public final void onPageSelected(int i) {
        AnonymousClass5KZ anonymousClass5KZ = (AnonymousClass5KZ) this.f62291B.f62306H.get(i);
        if (this.f62291B.isResumed() && anonymousClass5KZ != this.f62291B.f62300B) {
            AnonymousClass0Nm.N(this.f62291B.getView());
            AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            AnonymousClass1LN anonymousClass1LN = this.f62291B.f62302D;
            AnonymousClass5Ka anonymousClass5Ka = this.f62291B;
            anonymousClass0Iz.K((AnonymousClass5KU) anonymousClass1LN.K(anonymousClass5Ka.f62306H.indexOf(anonymousClass5Ka.f62300B)), this.f62291B.getFragmentManager().H(), this.f62291B.getModuleName());
            this.f62291B.f62300B = anonymousClass5KZ;
            anonymousClass0Iz.H(this.f62291B.m26261b());
            this.f62291B.hPA(i);
        }
    }
}
