package X;

import com.fasterxml.jackson.databind.JsonMappingException;

/* renamed from: X.37h */
public final class AnonymousClass37h extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass37m f38097B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Iw f38098C;
    /* renamed from: D */
    public final /* synthetic */ int f38099D;

    public AnonymousClass37h(AnonymousClass37m anonymousClass37m, AnonymousClass0Iw anonymousClass0Iw, int i) {
        this.f38097B = anonymousClass37m;
        this.f38098C = anonymousClass0Iw;
        this.f38099D = i;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 696490235);
        if (this.f38097B.f38113B < 7) {
            this.f38097B.f38113B = this.f38097B.f38113B + 1;
            int pow = ((int) (Math.pow(2.0d, (double) (this.f38097B.f38113B - 1)) * 2.0d)) * JsonMappingException.MAX_REFS_TO_LIST;
            AnonymousClass0GA E = AnonymousClass37c.m18637E(this.f38099D);
            E.f2849B = this;
            AnonymousClass0Ix.E(E, pow);
        } else {
            this.f38098C.onFail(anonymousClass0Q6);
        }
        AnonymousClass0cQ.H(this, 2140032443, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -810789790);
        AnonymousClass37f anonymousClass37f = (AnonymousClass37f) obj;
        int I2 = AnonymousClass0cQ.I(this, 718452064);
        this.f38098C.onSuccess(anonymousClass37f);
        AnonymousClass0cQ.H(this, -349073345, I2);
        AnonymousClass0cQ.H(this, 1652126004, I);
    }
}
