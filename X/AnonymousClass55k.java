package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.55k */
public final class AnonymousClass55k extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass55n f60036B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass55m f60037C;

    public AnonymousClass55k(AnonymousClass55n anonymousClass55n, AnonymousClass55m anonymousClass55m) {
        this.f60036B = anonymousClass55n;
        this.f60037C = anonymousClass55m;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1602560911);
        this.f60036B.f60041D = new ArrayList();
        AnonymousClass0cQ.H(this, 702405433, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -2138640032);
        AnonymousClass2DV anonymousClass2DV = (AnonymousClass2DV) obj;
        int I2 = AnonymousClass0cQ.I(this, -1085362952);
        List<AnonymousClass2DW> list = anonymousClass2DV.f27599B;
        List arrayList = new ArrayList();
        for (AnonymousClass2DW anonymousClass2DW : list) {
            arrayList.add(new AnonymousClass5cC(anonymousClass2DW.f27601C, anonymousClass2DW.f27600B));
        }
        AnonymousClass55n anonymousClass55n = this.f60036B;
        anonymousClass55n.f60041D = arrayList;
        anonymousClass55n.m25715E(this.f60037C);
        AnonymousClass0cQ.H(this, -773839023, I2);
        AnonymousClass0cQ.H(this, 1629635723, I);
    }
}
