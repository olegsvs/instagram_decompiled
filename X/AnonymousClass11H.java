package X;

import android.os.Bundle;

/* renamed from: X.11H */
public final class AnonymousClass11H implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0IU f13381B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0F8 f13382C;

    public AnonymousClass11H(AnonymousClass0IU anonymousClass0IU, AnonymousClass0F8 anonymousClass0F8) {
        this.f13381B = anonymousClass0IU;
        this.f13382C = anonymousClass0F8;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.m5859I(this, -1610612854);
        AnonymousClass3Oe anonymousClass3Oe = (AnonymousClass3Oe) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.m5859I(this, -542997823);
        AnonymousClass0IU anonymousClass0IU = this.f13381B;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", anonymousClass3Oe.f40783G);
        bundle.putString("feedback_title", anonymousClass3Oe.f40784H);
        bundle.putString("feedback_message", anonymousClass3Oe.f40782F);
        bundle.putString("feedback_appeal_label", anonymousClass3Oe.f40778B);
        bundle.putString("feedback_action", anonymousClass3Oe.f40779C);
        bundle.putString("feedback_ignore_label", anonymousClass3Oe.f40781E);
        bundle.putString("feedback_url", anonymousClass3Oe.f40780D);
        AnonymousClass0kr.m7220E(anonymousClass0IU, bundle);
        AnonymousClass0F8 anonymousClass0F8 = this.f13382C;
        if (anonymousClass0F8 != null) {
            anonymousClass0F8.onEvent(anonymousClass3Oe);
        }
        AnonymousClass0cQ.m5858H(this, -1116952600, I2);
        AnonymousClass0cQ.m5858H(this, 1060949363, I);
    }
}
