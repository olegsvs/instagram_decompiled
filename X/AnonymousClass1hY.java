package X;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1hY */
public final class AnonymousClass1hY {
    /* renamed from: B */
    private final long f21502B;
    /* renamed from: C */
    private final long f21503C;
    /* renamed from: D */
    private final long f21504D;
    /* renamed from: E */
    private final AnonymousClass1Gq f21505E;
    /* renamed from: F */
    private final AtomicBoolean f21506F;
    /* renamed from: G */
    private final boolean f21507G;
    /* renamed from: H */
    private final long f21508H;
    /* renamed from: I */
    private final AnonymousClass1Dz f21509I;
    /* renamed from: J */
    private final long f21510J;
    /* renamed from: K */
    private final long f21511K;

    public AnonymousClass1hY() {
        this(false, null, new AtomicBoolean(false), JsonMappingException.MAX_REFS_TO_LIST, -1, 15000, 30000, 0, 0, AnonymousClass1Dz.DEFAULT);
    }

    public AnonymousClass1hY(boolean z, AnonymousClass1Gq anonymousClass1Gq, AtomicBoolean atomicBoolean, int i, int i2, int i3, int i4, long j, long j2, AnonymousClass1Dz anonymousClass1Dz) {
        this.f21507G = z;
        this.f21505E = anonymousClass1Gq;
        this.f21506F = atomicBoolean;
        this.f21510J = ((long) i) * 1000;
        this.f21511K = ((long) i2) * 1000;
        this.f21508H = ((long) i3) * 1000;
        this.f21504D = ((long) i4) * 1000;
        this.f21503C = j * 1000;
        this.f21502B = j2 * 1000;
        this.f21509I = anonymousClass1Dz;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final long m12574A(boolean r6, long r7, boolean r9) {
        /*
        r5 = this;
        r0 = r5.f21506F;
        r0 = r0.get();
        if (r0 == 0) goto L_0x000b;
    L_0x0008:
        r0 = r5.f21510J;
        return r0;
    L_0x000b:
        r3 = 0;
        if (r9 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.f21511K;
        r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0016;
    L_0x0015:
        return r1;
    L_0x0016:
        r1 = r5.m12575B(r6, r7);
        r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0015;
    L_0x001f:
        if (r6 == 0) goto L_0x0028;
    L_0x0021:
        r1 = r5.f21502B;
        r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0028;
    L_0x0027:
        goto L_0x0015;
    L_0x0028:
        r1 = r5.f21504D;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1hY.A(boolean, long, boolean):long");
    }

    /* renamed from: B */
    private float m12573B() {
        if (this.f21505E != null) {
            if (this.f21509I == AnonymousClass1Dz.MODERATE) {
                return this.f21505E.f16479G;
            }
            if (this.f21509I == AnonymousClass1Dz.AGGRESSIVE) {
                return this.f21505E.f16478F;
            }
            if (this.f21509I == AnonymousClass1Dz.LONG_AD) {
                return this.f21505E.f16480H;
            }
            if (this.f21509I == AnonymousClass1Dz.SHORT_AD) {
                return this.f21505E.f16481I;
            }
        }
        return 1.0f;
    }

    /* renamed from: B */
    public final long m12575B(boolean z, long j) {
        AnonymousClass1Gq anonymousClass1Gq = this.f21505E;
        if (anonymousClass1Gq != null) {
            if (!this.f21507G) {
                int i = z ? anonymousClass1Gq.f16482J : anonymousClass1Gq.f16474B;
                long C = m12576C(z, j);
                if (C != 0) {
                    return C + (((long) i) * 1000);
                }
            }
        }
        return 0;
    }

    /* renamed from: C */
    public final long m12576C(boolean z, long j) {
        AnonymousClass1Gq anonymousClass1Gq = this.f21505E;
        if (anonymousClass1Gq != null) {
            if (!this.f21507G) {
                int i;
                int i2;
                float f;
                if (z) {
                    i = anonymousClass1Gq.f16485M;
                    i2 = this.f21505E.f16484L;
                    f = this.f21505E.f16483K;
                } else {
                    i = anonymousClass1Gq.f16477E;
                    i2 = this.f21505E.f16476D;
                    f = this.f21505E.f16475C;
                }
                return (long) (m12573B() * Math.min(((float) (((long) i) * 1000)) + (f * ((float) j)), (float) (((long) i2) * 1000)));
            }
        }
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public final long m12577D(boolean r6, long r7, boolean r9) {
        /*
        r5 = this;
        r0 = r5.f21506F;
        r0 = r0.get();
        if (r0 == 0) goto L_0x000b;
    L_0x0008:
        r0 = r5.f21510J;
        return r0;
    L_0x000b:
        r3 = 0;
        if (r9 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.f21511K;
        r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0016;
    L_0x0015:
        return r1;
    L_0x0016:
        r1 = r5.m12576C(r6, r7);
        r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0015;
    L_0x001f:
        if (r6 == 0) goto L_0x0028;
    L_0x0021:
        r1 = r5.f21503C;
        r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0028;
    L_0x0027:
        goto L_0x0015;
    L_0x0028:
        r1 = r5.f21508H;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1hY.D(boolean, long, boolean):long");
    }
}
