package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.0mo */
public final class AnonymousClass0mo extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0j6 f9903B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0me f9904C;
    /* renamed from: D */
    public final /* synthetic */ Hashtag f9905D;

    public AnonymousClass0mo(AnonymousClass0j6 anonymousClass0j6, AnonymousClass0me anonymousClass0me, Hashtag hashtag) {
        this.f9903B = anonymousClass0j6;
        this.f9904C = anonymousClass0me;
        this.f9905D = hashtag;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, -821528793);
        AnonymousClass0mm.m7566D(this.f9905D, "destroy", anonymousClass0Q6.f4287B, this.f9903B.f9035B);
        this.f9904C.in(this.f9905D, anonymousClass0Q6);
        AnonymousClass0cQ.m5858H(this, -1617217462, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, -1604182502);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, -1839354279);
        this.f9904C.jn(this.f9905D, anonymousClass0Pn);
        AnonymousClass0cQ.m5858H(this, 875835539, I2);
        AnonymousClass0cQ.m5858H(this, 1246253292, I);
    }
}
