package X;

import java.util.Collections;

/* renamed from: X.3U5 */
public final class AnonymousClass3U5 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3U7 f41574B;

    public AnonymousClass3U5(AnonymousClass3U7 anonymousClass3U7) {
        this.f41574B = anonymousClass3U7;
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -208233738);
        this.f41574B.f41576B.f17454C.A("feed_timeline_background_prefetch");
        AnonymousClass0cQ.H(this, 441814585, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1283977648);
        AnonymousClass3U3 anonymousClass3U3 = (AnonymousClass3U3) obj;
        int I2 = AnonymousClass0cQ.I(this, -122739914);
        int intValue = ((Integer) AnonymousClass0CC.sB.H(this.f41574B.f41576B.f17455D)).intValue();
        for (AnonymousClass0P7 anonymousClass0P7 : Collections.unmodifiableList(anonymousClass3U3.f41573B)) {
            if (anonymousClass0P7.eA()) {
                if (AnonymousClass1Yt.B(anonymousClass0P7)) {
                    int i = intValue - 1;
                    intValue = intValue > 0 ? i : i;
                }
                AnonymousClass1Yt.C(anonymousClass0P7, this.f41574B.f41576B.f17453B, this.f41574B.f41576B.f17455D);
            }
        }
        AnonymousClass0cQ.H(this, 1104642216, I2);
        AnonymousClass0cQ.H(this, -1430522866, I);
    }
}
