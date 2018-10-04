package X;

/* renamed from: X.5S5 */
public final class AnonymousClass5S5 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5SC f63764B;

    public AnonymousClass5S5(AnonymousClass5SC anonymousClass5SC) {
        this.f63764B = anonymousClass5SC;
    }

    /* renamed from: A */
    public final void m26629A(AnonymousClass0SK anonymousClass0SK) {
        if (this.f63764B.isAdded() && !anonymousClass0SK.I()) {
            anonymousClass0SK.f4889I = System.currentTimeMillis();
            this.f63764B.f63792W.rB.A(anonymousClass0SK, false);
            if (this.f63764B.f63798c != null) {
                this.f63764B.f63798c.B(new AnonymousClass4FD(this, anonymousClass0SK));
            } else if (((Boolean) AnonymousClass0CC.Ga.H(this.f63764B.f63808m)).booleanValue()) {
                this.f63764B.Nu(anonymousClass0SK);
            }
        }
    }
}
