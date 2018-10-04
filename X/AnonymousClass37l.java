package X;

import com.fasterxml.jackson.databind.JsonMappingException;

/* renamed from: X.37l */
public final class AnonymousClass37l extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass37m f38111B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Iw f38112C;

    public AnonymousClass37l(AnonymousClass37m anonymousClass37m, AnonymousClass0Iw anonymousClass0Iw) {
        this.f38111B = anonymousClass37m;
        this.f38112C = anonymousClass0Iw;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 147028070);
        if (this.f38111B.f38113B < 7) {
            this.f38111B.f38113B = this.f38111B.f38113B + 1;
            int pow = ((int) (Math.pow(2.0d, (double) (this.f38111B.f38113B - 1)) * 2.0d)) * JsonMappingException.MAX_REFS_TO_LIST;
            AnonymousClass0GA B = AnonymousClass37c.m18634B();
            B.f2849B = this;
            AnonymousClass0Ix.E(B, pow);
        } else {
            this.f38112C.onFail(anonymousClass0Q6);
        }
        AnonymousClass0cQ.H(this, -44326716, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1753488048);
        AnonymousClass37d anonymousClass37d = (AnonymousClass37d) obj;
        int I2 = AnonymousClass0cQ.I(this, -1058054750);
        this.f38112C.onSuccess(anonymousClass37d);
        AnonymousClass0cQ.H(this, -931941261, I2);
        AnonymousClass0cQ.H(this, 853159714, I);
    }
}
