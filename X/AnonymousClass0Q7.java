package X;

/* renamed from: X.0Q7 */
public final class AnonymousClass0Q7 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0PX f4293B;

    public AnonymousClass0Q7(AnonymousClass0PX anonymousClass0PX) {
        this.f4293B = anonymousClass0PX;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, 460466573);
        this.f4293B.f4075B = anonymousClass0Q6;
        if (this.f4293B.f4076C != null) {
            AnonymousClass68O.F(this.f4293B.f4076C.f4251B.f18589B, anonymousClass0Q6);
        }
        AnonymousClass0cQ.m5858H(this, -1542629067, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 39392982);
        AnonymousClass0Q5 anonymousClass0Q5 = (AnonymousClass0Q5) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, -1977024485);
        this.f4293B.f4077D = anonymousClass0Q5;
        if (this.f4293B.f4076C != null) {
            AnonymousClass1RL anonymousClass1RL = this.f4293B.f4076C.f4251B;
            anonymousClass0Q5 = anonymousClass0Q5;
            if (anonymousClass0Q5.f4284b != anonymousClass1RL.f18590C) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Stream width != Video width :: stream_width=");
                stringBuilder.append(anonymousClass0Q5.f4284b);
                stringBuilder.append(" video_width=");
                stringBuilder.append(anonymousClass1RL.f18590C);
                AnonymousClass0Gn.m1876C("IgLiveStreamingController#apiInitBroadcast", stringBuilder.toString());
            }
            AnonymousClass68O.G(anonymousClass1RL.f18589B, anonymousClass0Q5);
        }
        AnonymousClass0cQ.m5858H(this, -397740265, I2);
        AnonymousClass0cQ.m5858H(this, -27338418, I);
    }
}
