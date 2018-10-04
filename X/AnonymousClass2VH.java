package X;

/* renamed from: X.2VH */
public final class AnonymousClass2VH implements AnonymousClass27h {
    /* renamed from: B */
    private final AnonymousClass2Hj f31050B;
    /* renamed from: C */
    private final AnonymousClass27l f31051C;
    /* renamed from: D */
    private final AnonymousClass27i f31052D;
    /* renamed from: E */
    private final String f31053E;

    public AnonymousClass2VH(AnonymousClass27l anonymousClass27l) {
        this.f31052D = AnonymousClass27i.STICKER;
        this.f31050B = null;
        this.f31051C = anonymousClass27l;
        this.f31053E = ((AnonymousClass27n) anonymousClass27l.f26360F.get(0)).f26372I;
    }

    public AnonymousClass2VH(AnonymousClass2Hj anonymousClass2Hj) {
        this.f31052D = AnonymousClass27i.EMOJI;
        this.f31050B = anonymousClass2Hj;
        this.f31051C = null;
        this.f31053E = AnonymousClass2Hj.m14936C(anonymousClass2Hj.f28575B, anonymousClass2Hj.f28577D);
    }

    public final AnonymousClass27l JS() {
        return this.f31051C;
    }

    public final boolean YV() {
        AnonymousClass2Hj anonymousClass2Hj = this.f31050B;
        return anonymousClass2Hj != null && AnonymousClass2Hk.m14941C(anonymousClass2Hj);
    }

    public final AnonymousClass2Hj ZL() {
        return this.f31050B;
    }

    public final AnonymousClass27i eT() {
        return this.f31052D;
    }

    public final String getUri() {
        return this.f31053E;
    }
}
