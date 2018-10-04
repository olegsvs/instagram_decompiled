package X;

/* renamed from: X.1sR */
public final class AnonymousClass1sR {
    /* renamed from: B */
    public AnonymousClass1rv f23626B;
    /* renamed from: C */
    public final AnonymousClass2mM f23627C;
    /* renamed from: D */
    public AnonymousClass3sf f23628D;
    /* renamed from: E */
    public final boolean f23629E;
    /* renamed from: F */
    public boolean f23630F;
    /* renamed from: G */
    public AnonymousClass1xs f23631G;
    /* renamed from: H */
    public final AnonymousClass1xr f23632H;
    /* renamed from: I */
    public AnonymousClass2he f23633I;
    /* renamed from: J */
    private final boolean f23634J;

    public AnonymousClass1sR(AnonymousClass1xr anonymousClass1xr) {
        this(anonymousClass1xr, AnonymousClass1sR.m13537B(anonymousClass1xr));
    }

    public AnonymousClass1sR(AnonymousClass1xr anonymousClass1xr, AnonymousClass2mM anonymousClass2mM) {
        this.f23632H = anonymousClass1xr;
        this.f23627C = anonymousClass2mM;
        if (anonymousClass1xr instanceof AnonymousClass3sf) {
            AnonymousClass3sf anonymousClass3sf = (AnonymousClass3sf) anonymousClass1xr;
            this.f23628D = anonymousClass3sf;
            anonymousClass3sf.f45879M.f33792D = new AnonymousClass2Po(this);
        }
        this.f23626B = new AnonymousClass1rv();
        this.f23629E = anonymousClass1xr instanceof AnonymousClass2S8;
        this.f23634J = anonymousClass1xr instanceof AnonymousClass3sf;
    }

    /* renamed from: A */
    public final boolean m13538A(AnonymousClass2SA anonymousClass2SA, long j, AnonymousClass1xq anonymousClass1xq) {
        if (!this.f23630F) {
            return false;
        }
        long nanoTime = System.nanoTime();
        AnonymousClass1xr anonymousClass1xr = this.f23632H;
        if (anonymousClass1xr instanceof AnonymousClass3sf) {
            ((AnonymousClass3sf) anonymousClass1xr).f45876J = anonymousClass1xq;
        }
        boolean sj = this.f23632H.sj(anonymousClass2SA, j);
        long nanoTime2 = System.nanoTime();
        AnonymousClass1rv anonymousClass1rv = this.f23626B;
        anonymousClass1rv.f23534B += nanoTime2 - nanoTime;
        anonymousClass1rv.f23537E++;
        return sj;
    }

    /* renamed from: B */
    private static AnonymousClass2mM m13537B(Object obj) {
        if (obj instanceof AnonymousClass2mM) {
            return (AnonymousClass2mM) obj;
        }
        if (obj instanceof AnonymousClass3sf) {
            return ((AnonymousClass3sf) obj).f45881O;
        }
        return null;
    }

    /* renamed from: B */
    public final boolean m13539B() {
        if (this.f23634J) {
            AnonymousClass3sf anonymousClass3sf = (AnonymousClass3sf) this.f23632H;
            Object obj = 1;
            Object obj2 = ((anonymousClass3sf.f45874H == null || !anonymousClass3sf.f45874H.f33854a) && (anonymousClass3sf.f45873G == null || !anonymousClass3sf.f45873G.f33854a)) ? null : 1;
            if (obj2 != null) {
                if (!anonymousClass3sf.f45884R) {
                    if (anonymousClass3sf.f45889W) {
                    }
                }
                if (obj != null) {
                    return true;
                }
            }
            obj = null;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }
}
