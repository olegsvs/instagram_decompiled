package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.3Mz */
public final class AnonymousClass3Mz extends AnonymousClass0wR {
    /* renamed from: B */
    public final AnonymousClass0s9 f40561B;
    /* renamed from: C */
    private final ReboundViewPager f40562C;
    /* renamed from: D */
    private final AnonymousClass0sD f40563D;

    public AnonymousClass3Mz(ReboundViewPager reboundViewPager, AnonymousClass0sD anonymousClass0sD, AnonymousClass0s9 anonymousClass0s9) {
        this.f40562C = reboundViewPager;
        this.f40563D = anonymousClass0sD;
        this.f40561B = anonymousClass0s9;
    }

    public final /* bridge */ /* synthetic */ void Vc(Object obj) {
        AnonymousClass0s9.B(this.f40561B, ((AnonymousClass0mW) obj).getId(), true);
    }

    public final Class WT() {
        return AnonymousClass0mW.class;
    }

    public final /* bridge */ /* synthetic */ void Yc(Object obj, int i) {
        this.f40561B.A((AnonymousClass0mW) obj, i);
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        AnonymousClass0mW anonymousClass0mW = (AnonymousClass0mW) this.f40563D.getItem(i);
        if (anonymousClass0mW != null && AnonymousClass0wg.B(this.f40562C, 0.75d) && AnonymousClass0wg.B(this.f40562C.D(i), 0.5d)) {
            anonymousClass0wM.sWA(anonymousClass0mW.getId(), anonymousClass0mW, i);
        }
    }
}
