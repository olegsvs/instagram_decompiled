package X;

import java.util.List;

/* renamed from: X.4Fx */
public final class AnonymousClass4Fx extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Fy f52034B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5S6 f52035C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass28M f52036D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass28Q f52037E;

    public AnonymousClass4Fx(AnonymousClass4Fy anonymousClass4Fy, AnonymousClass28M anonymousClass28M, AnonymousClass28Q anonymousClass28Q, AnonymousClass5S6 anonymousClass5S6, AnonymousClass0SK anonymousClass0SK) {
        this.f52034B = anonymousClass4Fy;
        this.f52036D = anonymousClass28M;
        this.f52037E = anonymousClass28Q;
        this.f52035C = anonymousClass5S6;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1905498145);
        this.f52035C.f63765B.f63771B.m23621M();
        AnonymousClass0cQ.H(this, -1697512281, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -759991660);
        AnonymousClass4G3 anonymousClass4G3 = (AnonymousClass4G3) obj;
        int I2 = AnonymousClass0cQ.I(this, 818098602);
        List<AnonymousClass0SK> list = anonymousClass4G3.f52054B;
        for (AnonymousClass0SK K : list) {
            K.K(this.f52034B.f52038B);
        }
        switch (this.f52036D.ordinal()) {
            case 1:
                this.f52037E.f26512C = anonymousClass4G3.f52056D;
                this.f52037E.f26513D = anonymousClass4G3.f52057E;
                this.f52037E.f26516G = anonymousClass4G3.f52060H;
                break;
            case 2:
                this.f52037E.f26511B = anonymousClass4G3.f52055C;
                this.f52037E.f26514E = anonymousClass4G3.f52058F;
                this.f52037E.f26515F = anonymousClass4G3.f52059G;
                break;
            default:
                break;
        }
        this.f52037E.m14548A(list);
        AnonymousClass5S6 anonymousClass5S6 = this.f52035C;
        for (AnonymousClass0SK K2 : list) {
            anonymousClass5S6.f63765B.f63771B.m23615G(K2).f51792H = true;
        }
        anonymousClass5S6.f63765B.f63771B.m23621M();
        AnonymousClass0cQ.H(this, 989491838, I2);
        AnonymousClass0cQ.H(this, 153034843, I);
    }
}
