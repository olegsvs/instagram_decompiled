package X;

/* renamed from: X.32J */
public final class AnonymousClass32J extends AnonymousClass0Iw {
    /* renamed from: B */
    public boolean f37215B;

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -386180935);
        AnonymousClass0Dc.F("AddAvatarHelper", "Unable to fetch avatar info");
        AnonymousClass0cQ.H(this, 1898933980, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 145814597);
        AnonymousClass32W anonymousClass32W = (AnonymousClass32W) obj;
        int I2 = AnonymousClass0cQ.I(this, 558630709);
        AnonymousClass32V anonymousClass32V = anonymousClass32W.f37238B;
        boolean z = (anonymousClass32V == null || anonymousClass32V.f37237B == null || !anonymousClass32W.f37238B.f37237B.f37236B) ? false : true;
        this.f37215B = z;
        AnonymousClass0cQ.H(this, -288040221, I2);
        AnonymousClass0cQ.H(this, 1788997912, I);
    }
}
