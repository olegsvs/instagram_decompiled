package X;

import android.content.Context;

/* renamed from: X.3lc */
public final class AnonymousClass3lc extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3le f44201B;
    /* renamed from: C */
    public final /* synthetic */ Context f44202C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ci f44203D;
    /* renamed from: E */
    public final /* synthetic */ boolean f44204E;

    public AnonymousClass3lc(AnonymousClass3le anonymousClass3le, AnonymousClass0Ci anonymousClass0Ci, boolean z, Context context) {
        this.f44201B = anonymousClass3le;
        this.f44203D = anonymousClass0Ci;
        this.f44204E = z;
        this.f44202C = context;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1944458306);
        AnonymousClass3nj.m20682F(this.f44202C, this.f44201B.f44206C.f1759C, anonymousClass0Q6);
        AnonymousClass0cQ.H(this, 1876904331, I);
    }

    public final void onFailInBackground(AnonymousClass0fq anonymousClass0fq) {
        int I = AnonymousClass0cQ.I(this, 161890562);
        this.f44203D.f1722Q = this.f44204E;
        AnonymousClass0cQ.H(this, -895400175, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int I = AnonymousClass0cQ.I(this, 230095359);
        AnonymousClass3lT anonymousClass3lT = (AnonymousClass3lT) obj;
        int I2 = AnonymousClass0cQ.I(this, -1001280178);
        AnonymousClass0x5.C(this.f44201B.f44206C).H(this.f44203D, anonymousClass3lT.f44178C, null);
        AnonymousClass0cQ.H(this, -1750943505, I2);
        AnonymousClass0cQ.H(this, 22320050, I);
    }
}
