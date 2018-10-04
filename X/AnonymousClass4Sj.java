package X;

import android.view.View;

/* renamed from: X.4Sj */
public final class AnonymousClass4Sj extends AnonymousClass16a {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5U7 f54309B;

    public AnonymousClass4Sj(AnonymousClass5U7 anonymousClass5U7) {
        this.f54309B = anonymousClass5U7;
    }

    public final void Xq(View view) {
        if (this.f54309B.f64741H != null) {
            this.f54309B.f64741H.f64386B.f66841H.f7378R.C(AnonymousClass0xq.STORY_SHARE_SHORTCUT);
        }
    }

    public final boolean yCA(View view) {
        if (this.f54309B.f64741H != null) {
            AnonymousClass0dF anonymousClass0dF = this.f54309B.f64741H.f64386B.f66841H;
            if (!anonymousClass0dF.f7378R.B()) {
                anonymousClass0dF.f7378R.E(AnonymousClass0xq.STORY_SHARE_SHORTCUT, null);
            } else if (!AnonymousClass0dF.Z(anonymousClass0dF)) {
                switch (anonymousClass0dF.f7370J.m24339B().ordinal()) {
                    case 0:
                        AnonymousClass5TB.H(anonymousClass0dF.f7392f, null, AnonymousClass0Um.FAVORITES, false, AnonymousClass3Fe.POSTED_FROM_CAMERA, null);
                        break;
                    case 1:
                        AnonymousClass5TY.F(anonymousClass0dF.f7408v, null, AnonymousClass0Um.FAVORITES, false, AnonymousClass3Fe.POSTED_FROM_CAMERA, null);
                        break;
                    default:
                        throw new UnsupportedOperationException("Unknown media type");
                }
            }
        }
        return true;
    }
}
