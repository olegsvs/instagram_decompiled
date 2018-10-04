package X;

import com.fasterxml.jackson.databind.JsonMappingException;

/* renamed from: X.37i */
public final class AnonymousClass37i extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass37m f38100B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Iw f38101C;
    /* renamed from: D */
    public final /* synthetic */ int f38102D;

    public AnonymousClass37i(AnonymousClass37m anonymousClass37m, AnonymousClass0Iw anonymousClass0Iw, int i) {
        this.f38100B = anonymousClass37m;
        this.f38101C = anonymousClass0Iw;
        this.f38102D = i;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 72123906);
        if (this.f38100B.f38113B < 7) {
            this.f38100B.f38113B = this.f38100B.f38113B + 1;
            int pow = ((int) (Math.pow(2.0d, (double) (this.f38100B.f38113B - 1)) * 2.0d)) * JsonMappingException.MAX_REFS_TO_LIST;
            AnonymousClass0GA F = AnonymousClass37c.m18638F(this.f38102D);
            F.f2849B = this;
            AnonymousClass0Ix.E(F, pow);
        } else {
            this.f38101C.onFail(anonymousClass0Q6);
        }
        AnonymousClass0cQ.H(this, 814090391, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -574851758);
        AnonymousClass37f anonymousClass37f = (AnonymousClass37f) obj;
        int I2 = AnonymousClass0cQ.I(this, -2126765129);
        this.f38101C.onSuccess(anonymousClass37f);
        AnonymousClass0cQ.H(this, -1943774521, I2);
        AnonymousClass0cQ.H(this, 1874443671, I);
    }
}
