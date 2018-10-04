package X;

/* renamed from: X.67e */
public final class AnonymousClass67e extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6GB f72006B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5ag f72007C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass5ag f72008D;

    public AnonymousClass67e(AnonymousClass6GB anonymousClass6GB, AnonymousClass5ag anonymousClass5ag, AnonymousClass5ag anonymousClass5ag2) {
        this.f72006B = anonymousClass6GB;
        this.f72008D = anonymousClass5ag;
        this.f72007C = anonymousClass5ag2;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 2075223906);
        this.f72006B.m29082N(this.f72008D);
        AnonymousClass0cQ.H(this, 73690576, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -606380528);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, 1298544114);
        if (this.f72006B.f73629I != null) {
            AnonymousClass5aa anonymousClass5aa = this.f72006B.f73629I;
            String XP = this.f72007C.XP();
            AnonymousClass5aa.m27728B(anonymousClass5aa, AnonymousClass5MJ.BROADCAST_PIN_COMMENT).F("c_pk", XP).F("ca_pk", this.f72007C.pT().getId()).R();
        }
        AnonymousClass0cQ.H(this, 1998885369, I2);
        AnonymousClass0cQ.H(this, -1934560556, I);
    }
}
