package X;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: X.390 */
public final class AnonymousClass390 extends AnonymousClass0wR {
    /* renamed from: B */
    public final AnonymousClass3yB f38308B;
    /* renamed from: C */
    private final AnonymousClass0wm f38309C;
    /* renamed from: D */
    private final RecyclerView f38310D;

    public AnonymousClass390(AnonymousClass0wm anonymousClass0wm, AnonymousClass3yB anonymousClass3yB, RecyclerView recyclerView) {
        this.f38309C = anonymousClass0wm;
        this.f38308B = anonymousClass3yB;
        this.f38310D = recyclerView;
    }

    public final Class WT() {
        return AnonymousClass3yE.class;
    }

    public final /* bridge */ /* synthetic */ void Xc(Object obj) {
        AnonymousClass3yE anonymousClass3yE = (AnonymousClass3yE) obj;
        AnonymousClass3yB anonymousClass3yB = this.f38308B;
        if (anonymousClass3yB != null && !anonymousClass3yE.dT().equals(AnonymousClass399.f38325L)) {
            anonymousClass3yB.m21790A(anonymousClass3yE.getId());
        }
    }

    public final /* bridge */ /* synthetic */ void ac(Object obj, int i) {
        AnonymousClass3yE anonymousClass3yE = (AnonymousClass3yE) obj;
        AnonymousClass3yB anonymousClass3yB = this.f38308B;
        if (anonymousClass3yB != null && !anonymousClass3yE.dT().equals(AnonymousClass399.f38325L)) {
            anonymousClass3yB.f47571C.put(anonymousClass3yE.getId(), new AnonymousClass38z(anonymousClass3yE.getId(), Long.valueOf(System.currentTimeMillis())));
        }
    }

    public final void bc(Object obj, View view, double d) {
        AnonymousClass3yE anonymousClass3yE = (AnonymousClass3yE) obj;
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        AnonymousClass3yE anonymousClass3yE = (AnonymousClass3yE) this.f38309C.UT(i);
        anonymousClass0wM.tWA(anonymousClass3yE.getId(), anonymousClass3yE, i);
        View childAt = this.f38310D.getChildAt(i - ((AnonymousClass0rr) this.f38310D.getLayoutManager()).aA());
        if (this.f38308B != null) {
            float f = 1.0f;
            if (childAt.getBottom() > this.f38310D.getHeight()) {
                f = 1.0f - (((float) (childAt.getBottom() - this.f38310D.getHeight())) / ((float) childAt.getHeight()));
            }
            AnonymousClass3yB anonymousClass3yB = this.f38308B;
            double d = (double) f;
            if (!anonymousClass3yE.dT().equals(AnonymousClass399.f38325L)) {
                Float f2 = (Float) anonymousClass3yB.f47576H.get(anonymousClass3yE.getId());
                if (f2 == null) {
                    f2 = Float.valueOf(0.0f);
                }
                if (d > ((double) f2.floatValue())) {
                    anonymousClass3yB.f47576H.put(anonymousClass3yE.getId(), Float.valueOf((float) d));
                }
            }
        }
    }
}
