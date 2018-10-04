package X;

import android.os.Bundle;

/* renamed from: X.0u2 */
public final class AnonymousClass0u2 implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0jR f11789B;

    public AnonymousClass0u2(AnonymousClass0jR anonymousClass0jR) {
        this.f11789B = anonymousClass0jR;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.m5859I(this, 1094204832);
        AnonymousClass0uI anonymousClass0uI = (AnonymousClass0uI) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.m5859I(this, -1541998183);
        AnonymousClass0P7 anonymousClass0P7 = anonymousClass0uI.f11819B;
        Bundle bundle = new Bundle();
        bundle.putString("MediaHashtagsListFragment.MEDIA_ID", anonymousClass0P7.getId());
        AnonymousClass0IZ F = new AnonymousClass0IZ(this.f11789B.f9164D).m2312F(new AnonymousClass0uS(), bundle);
        F.f2753C = "media_hashtags_header";
        F.f2757G = new AnonymousClass4qm(this, anonymousClass0P7);
        F.m2308B();
        AnonymousClass0cQ.m5858H(this, -1276075935, I2);
        AnonymousClass0cQ.m5858H(this, 73842391, I);
    }
}
