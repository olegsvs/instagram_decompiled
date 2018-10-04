package X;

import android.text.TextUtils;

/* renamed from: X.56b */
public final class AnonymousClass56b extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass56t f60173B;
    /* renamed from: C */
    public final /* synthetic */ String f60174C;

    public AnonymousClass56b(AnonymousClass56t anonymousClass56t, String str) {
        this.f60173B = anonymousClass56t;
        this.f60174C = str;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -132284255);
        if (anonymousClass0Q6.B()) {
            this.f60173B.f60210L = ((AnonymousClass2b3) anonymousClass0Q6.f4288C).f31387D;
            this.f60173B.f60209K = ((AnonymousClass2b3) anonymousClass0Q6.f4288C).f31386C;
        }
        AnonymousClass0Fr.FacebookAutoConfirmFailed.G(this.f60173B.IS(), this.f60173B.DM()).E();
        this.f60173B.f60200B.A(this.f60173B.getActivity(), this.f60174C, this.f60173B.f60228d);
        AnonymousClass0cQ.H(this, -572036289, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 479090413);
        AnonymousClass2b3 anonymousClass2b3 = (AnonymousClass2b3) obj;
        int I2 = AnonymousClass0cQ.I(this, -1710170381);
        this.f60173B.f60210L = anonymousClass2b3.f31387D;
        this.f60173B.f60209K = anonymousClass2b3.f31386C;
        this.f60173B.f60233i = anonymousClass2b3.f31388E;
        if (TextUtils.isEmpty(anonymousClass2b3.f31389F)) {
            AnonymousClass0Fr.FacebookAutoConfirmFailed.G(this.f60173B.IS(), this.f60173B.DM()).E();
            this.f60173B.f60200B.A(this.f60173B.getActivity(), this.f60174C, this.f60173B.f60228d);
        } else {
            AnonymousClass0Fr.FacebookAutoConfirmSuccess.G(this.f60173B.IS(), this.f60173B.DM()).E();
            AnonymousClass56t.m25760R(this.f60173B, anonymousClass2b3.f31389F, false);
        }
        AnonymousClass0cQ.H(this, 1591176523, I2);
        AnonymousClass0cQ.H(this, 1345093451, I);
    }
}
