package X;

import android.graphics.RectF;
import android.view.View;

/* renamed from: X.41T */
public final class AnonymousClass41T extends AnonymousClass3bH {
    /* renamed from: B */
    public RectF f48475B;
    /* renamed from: C */
    private final AnonymousClass3bS f48476C;

    /* renamed from: A */
    public final void mo4985A(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
    }

    /* renamed from: F */
    public final void mo4987F(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
    }

    /* renamed from: G */
    public final void mo4988G(AnonymousClass0MI anonymousClass0MI) {
    }

    public AnonymousClass41T(RectF rectF, AnonymousClass3bG anonymousClass3bG) {
        this(rectF, AnonymousClass3bS.REEL_AVATAR, anonymousClass3bG);
    }

    public AnonymousClass41T(RectF rectF, AnonymousClass3bS anonymousClass3bS, AnonymousClass3bG anonymousClass3bG) {
        super(anonymousClass3bG);
        this.f48475B = rectF;
        this.f48476C = anonymousClass3bS;
    }

    public AnonymousClass41T(View view, AnonymousClass3bG anonymousClass3bG) {
        this(AnonymousClass0Nm.L(view), AnonymousClass3bS.REEL_AVATAR, anonymousClass3bG);
    }

    /* renamed from: C */
    public final AnonymousClass3Uy mo4986C(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
        if (this.f48476C == AnonymousClass3bS.REEL_AVATAR) {
            return AnonymousClass3Uy.m19747D(this.f48475B);
        }
        return AnonymousClass3Uy.m19745B(this.f48475B);
    }

    /* renamed from: I */
    public final boolean m22092I(View view) {
        return this.f48475B.equals(AnonymousClass0Nm.L(view));
    }
}
