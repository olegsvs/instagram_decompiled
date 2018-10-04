package X;

import android.text.TextUtils;

/* renamed from: X.5GH */
public final class AnonymousClass5GH extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5GI f61658B;

    public AnonymousClass5GH(AnonymousClass5GI anonymousClass5GI) {
        this.f61658B = anonymousClass5GI;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 127145401);
        AnonymousClass35B anonymousClass35B = (AnonymousClass35B) obj;
        int I2 = AnonymousClass0cQ.I(this, -1478433657);
        super.onSuccess(anonymousClass35B);
        if (!(anonymousClass35B == null || TextUtils.isEmpty(anonymousClass35B.f37658B))) {
            AnonymousClass0Mt.G().edit().putString("biz_social_context", anonymousClass35B.f37658B).apply();
            if (this.f61658B.f61660C instanceof AnonymousClass5IH) {
                ((AnonymousClass5IH) this.f61658B.f61660C).m26174A();
            }
        }
        AnonymousClass0cQ.H(this, 1684490312, I2);
        AnonymousClass0cQ.H(this, -48710417, I);
    }
}
