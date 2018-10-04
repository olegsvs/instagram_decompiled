package X;

/* renamed from: X.3vm */
public final class AnonymousClass3vm extends AnonymousClass2ue {
    /* renamed from: K */
    private static final Object f47017K = new Object();
    /* renamed from: B */
    private final boolean f47018B;
    /* renamed from: C */
    private final boolean f47019C;
    /* renamed from: D */
    private final long f47020D;
    /* renamed from: E */
    private final long f47021E;
    /* renamed from: F */
    private final Object f47022F;
    /* renamed from: G */
    private final long f47023G;
    /* renamed from: H */
    private final long f47024H;
    /* renamed from: I */
    private final long f47025I;
    /* renamed from: J */
    private final long f47026J;

    /* renamed from: H */
    public final int mo4489H() {
        return 1;
    }

    /* renamed from: M */
    public final int mo4491M() {
        return 1;
    }

    public AnonymousClass3vm(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, Object obj) {
        this.f47021E = j;
        this.f47026J = j2;
        this.f47020D = j3;
        this.f47024H = j4;
        this.f47025I = j5;
        this.f47023G = j6;
        this.f47019C = z;
        this.f47018B = z2;
        this.f47022F = obj;
    }

    public AnonymousClass3vm(long j, long j2, long j3, long j4, boolean z, boolean z2, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public AnonymousClass3vm(long j, boolean z, boolean z2, Object obj) {
        this(j, j, 0, 0, z, z2, obj);
    }

    /* renamed from: B */
    public final int mo4487B(Object obj) {
        return f47017K.equals(obj) ? 0 : -1;
    }

    /* renamed from: G */
    public final AnonymousClass2uc mo4488G(int i, AnonymousClass2uc anonymousClass2uc, boolean z) {
        AnonymousClass2yO.m18015D(i, 0, 1);
        return anonymousClass2uc.m17722G(null, z ? f47017K : null, 0, this.f47020D, -this.f47025I);
    }

    /* renamed from: L */
    public final AnonymousClass2ud mo4490L(int i, AnonymousClass2ud anonymousClass2ud, boolean z, long j) {
        AnonymousClass2yO.m18015D(i, 0, 1);
        Object obj = z ? this.f47022F : null;
        long j2 = r0.f47023G;
        if (r0.f47018B && j != 0) {
            long j3 = r0.f47024H;
            if (j3 != -9223372036854775807L) {
                j2 += j;
                if (j2 > j3) {
                }
            }
            j2 = -9223372036854775807L;
        }
        return anonymousClass2ud.m17723A(obj, r0.f47021E, r0.f47026J, r0.f47019C, r0.f47018B, j2, r0.f47024H, 0, 0, r0.f47025I);
    }
}
