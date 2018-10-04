package X;

import com.instagram.save.model.SavedCollection;

/* renamed from: X.3dK */
public final class AnonymousClass3dK implements AnonymousClass0kB {
    /* renamed from: B */
    private final AnonymousClass3cx f42883B;
    /* renamed from: C */
    private final SavedCollection f42884C;
    /* renamed from: D */
    private AnonymousClass0P7 f42885D;
    /* renamed from: E */
    private AnonymousClass0m3 f42886E;
    /* renamed from: F */
    private int f42887F;
    /* renamed from: G */
    private final AnonymousClass41e f42888G;
    /* renamed from: H */
    private final AnonymousClass0Cm f42889H;

    public AnonymousClass3dK(AnonymousClass3cx anonymousClass3cx, AnonymousClass41e anonymousClass41e, AnonymousClass0Cm anonymousClass0Cm, SavedCollection savedCollection) {
        this.f42883B = anonymousClass3cx;
        this.f42888G = anonymousClass41e;
        this.f42889H = anonymousClass0Cm;
        this.f42884C = savedCollection;
    }

    public final void Oy(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0kC anonymousClass0kC) {
        this.f42885D = anonymousClass0P7;
        this.f42886E = anonymousClass0m3;
        this.f42887F = i;
        if (AnonymousClass0ew.B(this.f42889H).S(anonymousClass0P7)) {
            this.f42883B.f42822L.add(anonymousClass0P7.NO());
        }
        this.f42888G.Oy(anonymousClass0P7, anonymousClass0m3, i, this);
    }

    public final void Py(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        SavedCollection savedCollection = this.f42884C;
        if (savedCollection != null) {
            this.f42888G.m22113A(anonymousClass0P7, anonymousClass0m3, i, savedCollection.f12480B);
        } else {
            this.f42888G.Py(anonymousClass0P7, anonymousClass0m3, i);
        }
    }

    public final void dJA() {
        this.f42883B.f42822L.add(this.f42885D.NO());
        SavedCollection savedCollection = this.f42884C;
        if (savedCollection != null) {
            this.f42888G.m22115C(savedCollection, this.f42885D, this.f42886E.f9673H, this.f42887F, this.f42884C.f12480B);
        } else {
            this.f42888G.m22114B(savedCollection, this.f42885D, this.f42886E.f9673H, this.f42887F);
        }
    }

    public final boolean mV() {
        return this.f42884C != null;
    }

    public final void rVA() {
        this.f42888G.rVA();
    }
}
