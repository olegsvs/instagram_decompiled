package X;

import java.util.Collections;

/* renamed from: X.5EG */
public final class AnonymousClass5EG extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5EH f61427B;

    public AnonymousClass5EG(AnonymousClass5EH anonymousClass5EH) {
        this.f61427B = anonymousClass5EH;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 586282814);
        this.f61427B.f61428B = Collections.emptyList();
        AnonymousClass0cQ.H(this, 229254546, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -491596630);
        AnonymousClass3dr anonymousClass3dr = (AnonymousClass3dr) obj;
        int I2 = AnonymousClass0cQ.I(this, -1533849837);
        this.f61427B.f61428B = anonymousClass3dr.f42932E;
        this.f61427B.f61430D.m27652A(this.f61427B.f61428B);
        AnonymousClass0cQ.H(this, -1214536781, I2);
        AnonymousClass0cQ.H(this, -770853557, I);
    }
}
