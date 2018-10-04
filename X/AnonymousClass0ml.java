package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.0ml */
public final class AnonymousClass0ml extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0j6 f9900B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0me f9901C;
    /* renamed from: D */
    public final /* synthetic */ Hashtag f9902D;

    public AnonymousClass0ml(AnonymousClass0j6 anonymousClass0j6, AnonymousClass0me anonymousClass0me, Hashtag hashtag) {
        this.f9900B = anonymousClass0j6;
        this.f9901C = anonymousClass0me;
        this.f9902D = hashtag;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, 1290985380);
        AnonymousClass0mm.m7566D(this.f9902D, "create", anonymousClass0Q6.f4287B, this.f9900B.f9035B);
        this.f9901C.fn(this.f9902D, anonymousClass0Q6);
        AnonymousClass0cQ.m5858H(this, 1292373420, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 1485382630);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, 989061710);
        this.f9901C.gn(this.f9902D, anonymousClass0Pn);
        AnonymousClass0cQ.m5858H(this, 1916874655, I2);
        AnonymousClass0cQ.m5858H(this, 651420072, I);
    }
}
