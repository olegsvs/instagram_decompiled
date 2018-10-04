package X;

/* renamed from: X.4Nu */
public final class AnonymousClass4Nu extends AnonymousClass0nF {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0dF f53489B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass4MO f53490C;

    public AnonymousClass4Nu(AnonymousClass0dF anonymousClass0dF, AnonymousClass4MO anonymousClass4MO) {
        this.f53489B = anonymousClass0dF;
        this.f53490C = anonymousClass4MO;
    }

    /* renamed from: A */
    public final void m24073A(Exception exception) {
        if (this.f53489B.f7409w != 1) {
            AnonymousClass0dF.O(this.f53489B, true);
        }
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m24074B(Object obj) {
        m24075C((AnonymousClass3nn) obj);
    }

    /* renamed from: C */
    public final void m24075C(AnonymousClass3nn anonymousClass3nn) {
        if (this.f53489B.f7409w != 1) {
            if (this.f53490C.cX()) {
                this.f53489B.f7368H.m18706X(anonymousClass3nn.f44628O);
                return;
            }
            if (this.f53489B.f7384X) {
                Object obj = (AnonymousClass3pG.m20808B(anonymousClass3nn.f44628O).f44939D < 15500 || !((Boolean) AnonymousClass0CC.Xf.H(this.f53489B.f7407u)).booleanValue()) ? null : 1;
                if (obj != null) {
                    AnonymousClass0dF.X(this.f53489B, anonymousClass3nn, AnonymousClass3FO.GALLERY);
                    return;
                }
            }
            AnonymousClass0dF.H(this.f53489B).m19116C();
            AnonymousClass0dF.C(this.f53489B, anonymousClass3nn);
            AnonymousClass0dF.N(this.f53489B, anonymousClass3nn);
            AnonymousClass0dF.O(this.f53489B, true);
        }
    }
}
