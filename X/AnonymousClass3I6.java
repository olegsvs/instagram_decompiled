package X;

import android.content.Intent;

/* renamed from: X.3I6 */
public final class AnonymousClass3I6 implements AnonymousClass0Qc {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3zn f39900B;

    public AnonymousClass3I6(AnonymousClass3zn anonymousClass3zn) {
        this.f39900B = anonymousClass3zn;
    }

    public final /* bridge */ /* synthetic */ boolean RB(AnonymousClass0F6 anonymousClass0F6) {
        AnonymousClass3IG anonymousClass3IG = (AnonymousClass3IG) anonymousClass0F6;
        AnonymousClass0OA B = AnonymousClass3zn.m21917B(this.f39900B.getContext());
        this.f39900B.f48042D = anonymousClass3IG.f39912B;
        return B.UB.equals(anonymousClass3IG.f39913C);
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -1842734874);
        AnonymousClass3IG anonymousClass3IG = (AnonymousClass3IG) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, -1207806246);
        if (this.f39900B.f48043E != AnonymousClass3IF.FILTER) {
            if (this.f39900B.f48043E != AnonymousClass3IF.TRIM) {
                if (this.f39900B.f48043E == AnonymousClass3IF.COVER) {
                    AnonymousClass3zn.m21918C(this.f39900B, false);
                    AnonymousClass0dB.E(new Intent("VideoCoverFragmentBase.INTENT_ACTION_SAVE_COVER_FRAME"));
                }
                AnonymousClass0cQ.H(this, -725121915, I2);
                AnonymousClass0cQ.H(this, -403731827, I);
            }
        }
        this.f39900B.f48044F.mo4873b();
        AnonymousClass3zn.m21920E(this.f39900B, false);
        AnonymousClass0cQ.H(this, -725121915, I2);
        AnonymousClass0cQ.H(this, -403731827, I);
    }
}
