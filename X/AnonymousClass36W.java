package X;

import android.text.TextUtils;

/* renamed from: X.36W */
public final class AnonymousClass36W extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass36X f37852B;
    /* renamed from: C */
    public final /* synthetic */ String f37853C;
    /* renamed from: D */
    public final /* synthetic */ String f37854D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Cm f37855E;

    public AnonymousClass36W(AnonymousClass36X anonymousClass36X, String str, AnonymousClass0Cm anonymousClass0Cm, String str2) {
        this.f37852B = anonymousClass36X;
        this.f37854D = str;
        this.f37855E = anonymousClass0Cm;
        this.f37853C = str2;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1964128363);
        String A = (!anonymousClass0Q6.B() || TextUtils.isEmpty(((AnonymousClass1Nf) anonymousClass0Q6.f4288C).A())) ? null : ((AnonymousClass1Nf) anonymousClass0Q6.f4288C).A();
        this.f37852B.Bx(A, this.f37853C);
        AnonymousClass0cQ.H(this, -1125357157, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1417906255);
        super.onFinish();
        this.f37852B.Ex();
        AnonymousClass0cQ.H(this, -129019182, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 1882059377);
        super.onStart();
        this.f37852B.Jx();
        AnonymousClass0cQ.H(this, 1580016315, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 888735317);
        AnonymousClass1Nf anonymousClass1Nf = (AnonymousClass1Nf) obj;
        int I2 = AnonymousClass0cQ.I(this, 715393835);
        super.onSuccess(anonymousClass1Nf);
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass1Nf.f17816C;
        AnonymousClass2H3.m14906C(this.f37855E, new AnonymousClass2HM(anonymousClass0Ci.lB, anonymousClass0Ci.mB, this.f37854D));
        anonymousClass1Nf.f17816C.D();
        this.f37852B.Px(this.f37853C);
        AnonymousClass0cQ.H(this, 113526971, I2);
        AnonymousClass0cQ.H(this, -1710818660, I);
    }
}
