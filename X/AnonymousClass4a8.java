package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.4a8 */
public final class AnonymousClass4a8 implements AnonymousClass0Qc {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass18O f55470B;

    public AnonymousClass4a8(AnonymousClass18O anonymousClass18O) {
        this.f55470B = anonymousClass18O;
    }

    public final /* bridge */ /* synthetic */ boolean RB(AnonymousClass0F6 anonymousClass0F6) {
        AnonymousClass0RN anonymousClass0RN = (AnonymousClass0RN) anonymousClass0F6;
        return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(anonymousClass0RN.f4654B) && this.f55470B.f14942e.f1759C.equals(anonymousClass0RN.f4655C);
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, 1912814503);
        AnonymousClass0RN anonymousClass0RN = (AnonymousClass0RN) anonymousClass0F6;
        AnonymousClass0cQ.H(this, 790586238, AnonymousClass0cQ.I(this, -1162595042));
        AnonymousClass0cQ.H(this, 1674809346, I);
    }
}
