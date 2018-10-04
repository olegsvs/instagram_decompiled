package X;

/* renamed from: X.45C */
public final class AnonymousClass45C extends AnonymousClass43B {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2lI f49736B;

    public AnonymousClass45C(AnonymousClass2lI anonymousClass2lI, AnonymousClass2te anonymousClass2te, AnonymousClass3ue anonymousClass3ue) {
        this.f49736B = anonymousClass2lI;
        super(anonymousClass2te, anonymousClass3ue);
    }

    /* renamed from: A */
    public final void mo5336A(AnonymousClass2tT anonymousClass2tT) {
        if (anonymousClass2tT.f35446F > 0 && anonymousClass2tT.f35449I > 0 && anonymousClass2tT.f35447G > 0) {
            AnonymousClass2lI anonymousClass2lI = this.f49736B;
            synchronized (anonymousClass2lI) {
                AnonymousClass2lF anonymousClass2lF = anonymousClass2lI.f33511K;
                AnonymousClass2lE anonymousClass2lE = anonymousClass2lF.f33448G;
                int i = anonymousClass2lE.f33442D;
                Object[] objArr = anonymousClass2lE.f33441C;
                if (i == objArr.length) {
                    int i2 = anonymousClass2lE.f33440B;
                    objArr[i2] = anonymousClass2tT;
                    anonymousClass2lE.f33440B = (i2 + 1) % objArr.length;
                } else {
                    objArr[(anonymousClass2lE.f33440B + i) % objArr.length] = anonymousClass2tT;
                    anonymousClass2lE.f33442D = i + 1;
                }
                if (anonymousClass2lF.f33448G.f33442D >= 10 && anonymousClass2lF.f33447F) {
                    anonymousClass2lF.m17077A(null);
                }
                if (anonymousClass2lI.f33513M != null) {
                    anonymousClass2lI.f33513M.m17078A(anonymousClass2tT);
                }
            }
        }
    }
}
