package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.feed.ui.views.CabooseLayout;

/* renamed from: X.6E7 */
public final class AnonymousClass6E7 implements AnonymousClass5l7 {
    /* renamed from: B */
    private final AnonymousClass0r0 f73094B;
    /* renamed from: C */
    private final AnonymousClass0qy f73095C;
    /* renamed from: D */
    private final AnonymousClass0r0 f73096D;
    /* renamed from: E */
    private final AnonymousClass0qy f73097E;
    /* renamed from: F */
    private final AnonymousClass0P7 f73098F;
    /* renamed from: G */
    private final AnonymousClass0m3 f73099G;

    public AnonymousClass6E7(AnonymousClass0r0 anonymousClass0r0, AnonymousClass0qy anonymousClass0qy, AnonymousClass0r0 anonymousClass0r02, AnonymousClass0qy anonymousClass0qy2, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        this.f73096D = anonymousClass0r0;
        this.f73097E = anonymousClass0qy;
        this.f73094B = anonymousClass0r02;
        this.f73095C = anonymousClass0qy2;
        this.f73098F = anonymousClass0P7;
        this.f73099G = anonymousClass0m3;
    }

    public final void ND(CabooseLayout cabooseLayout, AnonymousClass0jL anonymousClass0jL) {
        ViewGroup viewGroup = cabooseLayout;
        cabooseLayout.removeAllViews();
        View C = AnonymousClass0tM.C(cabooseLayout.getContext(), cabooseLayout);
        AnonymousClass0tM.B((AnonymousClass0tN) C.getTag(), this.f73096D, this.f73097E, null);
        View C2 = AnonymousClass0tM.C(cabooseLayout.getContext(), cabooseLayout);
        AnonymousClass0tM.B((AnonymousClass0tN) C2.getTag(), this.f73094B, this.f73095C, null);
        AnonymousClass0jL anonymousClass0jL2 = anonymousClass0jL;
        View LU = anonymousClass0jL2.LU(3, null, viewGroup, this.f73098F, this.f73099G);
        View LU2 = anonymousClass0jL2.LU(4, null, viewGroup, this.f73098F, this.f73099G);
        View B = CabooseLayout.B(cabooseLayout.getContext(), cabooseLayout);
        cabooseLayout.addView(C);
        cabooseLayout.addView(C2);
        cabooseLayout.addView(LU);
        cabooseLayout.addView(LU2);
        cabooseLayout.addView(B);
        cabooseLayout.f13494D = B;
    }

    public final boolean qD() {
        return (this.f73094B == null || this.f73095C == null || this.f73096D == null || this.f73097E == null || this.f73098F == null || this.f73099G == null) ? false : true;
    }
}
