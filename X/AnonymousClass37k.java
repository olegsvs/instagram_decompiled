package X;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.List;

/* renamed from: X.37k */
public final class AnonymousClass37k extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass37m f38108B;
    /* renamed from: C */
    public final /* synthetic */ List f38109C;
    /* renamed from: D */
    public final /* synthetic */ List f38110D;

    public AnonymousClass37k(AnonymousClass37m anonymousClass37m, List list, List list2) {
        this.f38108B = anonymousClass37m;
        this.f38110D = list;
        this.f38109C = list2;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1675093098);
        if (this.f38108B.f38113B < 7) {
            this.f38108B.f38113B = this.f38108B.f38113B + 1;
            int pow = ((int) (Math.pow(2.0d, (double) (this.f38108B.f38113B - 1)) * 2.0d)) * JsonMappingException.MAX_REFS_TO_LIST;
            AnonymousClass0GA C = AnonymousClass37c.m18635C(this.f38110D, this.f38109C);
            C.f2849B = this;
            AnonymousClass0Ix.E(C, pow);
        }
        AnonymousClass0cQ.H(this, 638031857, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 327256691);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -1197512819);
        super.onSuccess(anonymousClass0Pn);
        AnonymousClass0cQ.H(this, 1650279671, I2);
        AnonymousClass0cQ.H(this, 987033386, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int I = AnonymousClass0cQ.I(this, -492353158);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -224578882);
        super.onSuccessInBackground(anonymousClass0Pn);
        AnonymousClass0cQ.H(this, 1470983221, I2);
        AnonymousClass0cQ.H(this, 1785321958, I);
    }
}
