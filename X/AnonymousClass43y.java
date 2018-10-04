package X;

import com.google.android.exoplayer2.source.TrackGroupArray;

/* renamed from: X.43y */
public final class AnonymousClass43y implements AnonymousClass3vk, AnonymousClass3vj {
    /* renamed from: B */
    public AnonymousClass3vj f49281B;
    /* renamed from: C */
    public long f49282C;
    /* renamed from: D */
    public final AnonymousClass3vk f49283D;
    /* renamed from: E */
    public long f49284E;
    /* renamed from: F */
    private long f49285F;
    /* renamed from: G */
    private AnonymousClass3vc[] f49286G = new AnonymousClass3vc[0];

    public AnonymousClass43y(AnonymousClass3vk anonymousClass3vk, boolean z, long j, long j2) {
        this.f49283D = anonymousClass3vk;
        this.f49285F = z ? j : -9223372036854775807L;
        this.f49284E = j;
        this.f49282C = j2;
    }

    /* renamed from: A */
    public final boolean m22487A() {
        return this.f49285F != -9223372036854775807L;
    }

    public final long AMA(AnonymousClass2y4[] anonymousClass2y4Arr, boolean[] zArr, AnonymousClass2wp[] anonymousClass2wpArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        AnonymousClass2wp[] anonymousClass2wpArr2 = anonymousClass2wpArr;
        this.f49286G = new AnonymousClass3vc[anonymousClass2wpArr2.length];
        AnonymousClass2wp[] anonymousClass2wpArr3 = new AnonymousClass2wp[anonymousClass2wpArr2.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            AnonymousClass2wp anonymousClass2wp = null;
            if (i2 >= anonymousClass2wpArr2.length) {
                break;
            }
            AnonymousClass3vc[] anonymousClass3vcArr = this.f49286G;
            AnonymousClass3vc anonymousClass3vc = (AnonymousClass3vc) anonymousClass2wpArr[i2];
            anonymousClass3vcArr[i2] = anonymousClass3vc;
            if (anonymousClass3vc != null) {
                anonymousClass2wp = anonymousClass3vcArr[i2].f46984B;
            }
            anonymousClass2wpArr3[i2] = anonymousClass2wp;
            i2++;
        }
        AnonymousClass2y4[] anonymousClass2y4Arr2 = anonymousClass2y4Arr;
        long AMA = this.f49283D.AMA(anonymousClass2y4Arr2, zArr, anonymousClass2wpArr3, zArr2, j);
        if (m22487A()) {
            j2 = this.f49284E;
            if (j == j2 && AnonymousClass43y.m22486C(j2, anonymousClass2y4Arr2)) {
                j2 = AMA;
                this.f49285F = j2;
                if (AMA != j) {
                    if (AMA >= this.f49284E) {
                        j2 = this.f49282C;
                        if (j2 != Long.MIN_VALUE) {
                            if (AMA <= j2) {
                            }
                        }
                    }
                    z = false;
                    AnonymousClass2yO.m18017F(z);
                    while (i < anonymousClass2wpArr2.length) {
                        if (anonymousClass2wpArr3[i] != null) {
                            this.f49286G[i] = null;
                        } else if (anonymousClass2wpArr[i] != null || this.f49286G[i].f46984B != anonymousClass2wpArr3[i]) {
                            this.f49286G[i] = new AnonymousClass3vc(this, anonymousClass2wpArr3[i]);
                        }
                        anonymousClass2wpArr[i] = this.f49286G[i];
                        i++;
                    }
                    return AMA;
                }
                z = true;
                AnonymousClass2yO.m18017F(z);
                while (i < anonymousClass2wpArr2.length) {
                    if (anonymousClass2wpArr3[i] != null) {
                        if (anonymousClass2wpArr[i] != null) {
                        }
                        this.f49286G[i] = new AnonymousClass3vc(this, anonymousClass2wpArr3[i]);
                    } else {
                        this.f49286G[i] = null;
                    }
                    anonymousClass2wpArr[i] = this.f49286G[i];
                    i++;
                }
                return AMA;
            }
        }
        j2 = -9223372036854775807L;
        this.f49285F = j2;
        if (AMA != j) {
            if (AMA >= this.f49284E) {
                j2 = this.f49282C;
                if (j2 != Long.MIN_VALUE) {
                    if (AMA <= j2) {
                    }
                }
            }
            z = false;
            AnonymousClass2yO.m18017F(z);
            while (i < anonymousClass2wpArr2.length) {
                if (anonymousClass2wpArr3[i] != null) {
                    this.f49286G[i] = null;
                } else {
                    if (anonymousClass2wpArr[i] != null) {
                    }
                    this.f49286G[i] = new AnonymousClass3vc(this, anonymousClass2wpArr3[i]);
                }
                anonymousClass2wpArr[i] = this.f49286G[i];
                i++;
            }
            return AMA;
        }
        z = true;
        AnonymousClass2yO.m18017F(z);
        while (i < anonymousClass2wpArr2.length) {
            if (anonymousClass2wpArr3[i] != null) {
                if (anonymousClass2wpArr[i] != null) {
                }
                this.f49286G[i] = new AnonymousClass3vc(this, anonymousClass2wpArr3[i]);
            } else {
                this.f49286G[i] = null;
            }
            anonymousClass2wpArr[i] = this.f49286G[i];
            i++;
        }
        return AMA;
    }

    /* renamed from: B */
    private AnonymousClass2ub m22485B(long j, AnonymousClass2ub anonymousClass2ub) {
        long J = AnonymousClass2yi.m18089J(anonymousClass2ub.f35653C, 0, j - this.f49284E);
        long j2 = anonymousClass2ub.f35652B;
        long j3 = this.f49282C;
        long J2 = AnonymousClass2yi.m18089J(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (J == anonymousClass2ub.f35653C && J2 == anonymousClass2ub.f35652B) {
            return anonymousClass2ub;
        }
        return new AnonymousClass2ub(J, J2);
    }

    /* renamed from: C */
    private static boolean m22486C(long j, AnonymousClass2y4[] anonymousClass2y4Arr) {
        if (j != 0) {
            for (AnonymousClass2y4 anonymousClass2y4 : anonymousClass2y4Arr) {
                if (anonymousClass2y4 != null && !AnonymousClass2yY.m18031H(anonymousClass2y4.XR().f35577a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long LI(long j, AnonymousClass2ub anonymousClass2ub) {
        long j2 = this.f49284E;
        if (j == j2) {
            return j2;
        }
        return this.f49283D.LI(j, m22485B(j, anonymousClass2ub));
    }

    public final long NJ() {
        long NJ = this.f49283D.NJ();
        if (NJ != Long.MIN_VALUE) {
            long j = this.f49282C;
            if (j == Long.MIN_VALUE || NJ < j) {
                return NJ;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean QF(long j) {
        return this.f49283D.QF(j);
    }

    public final TrackGroupArray RT() {
        return this.f49283D.RT();
    }

    public final void eu(AnonymousClass3vk anonymousClass3vk) {
        this.f49281B.eu(this);
    }

    public final void fG(long j, boolean z) {
        this.f49283D.fG(j, z);
    }

    public final long iIA() {
        long j;
        if (m22487A()) {
            j = this.f49285F;
            this.f49285F = -9223372036854775807L;
            long iIA = iIA();
            if (iIA != -9223372036854775807L) {
                j = iIA;
            }
            return j;
        }
        j = this.f49283D.iIA();
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        AnonymousClass2yO.m18017F(j >= this.f49284E);
        long j2 = this.f49282C;
        if (j2 != Long.MIN_VALUE) {
            if (j > j2) {
                z = false;
            }
        }
        AnonymousClass2yO.m18017F(z);
        return j;
    }

    public final void jHA(AnonymousClass3vj anonymousClass3vj, long j) {
        this.f49281B = anonymousClass3vj;
        this.f49283D.jHA(this, j);
    }

    public final long mO() {
        long mO = this.f49283D.mO();
        if (mO != Long.MIN_VALUE) {
            long j = this.f49282C;
            if (j == Long.MIN_VALUE || mO < j) {
                return mO;
            }
        }
        return Long.MIN_VALUE;
    }

    public final /* bridge */ /* synthetic */ void mh(AnonymousClass2wr anonymousClass2wr) {
        AnonymousClass3vk anonymousClass3vk = (AnonymousClass3vk) anonymousClass2wr;
        this.f49281B.mh(this);
    }

    public final void tb() {
        this.f49283D.tb();
    }

    public final void vIA(long j) {
        this.f49283D.vIA(j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long yLA(long r8) {
        /*
        r7 = this;
        r0 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r7.f49285F = r0;
        r4 = r7.f49286G;
        r3 = r4.length;
        r6 = 0;
        r2 = 0;
    L_0x000c:
        if (r2 >= r3) goto L_0x0018;
    L_0x000e:
        r1 = r4[r2];
        if (r1 == 0) goto L_0x0015;
    L_0x0012:
        r0 = 0;
        r1.f46985C = r0;
    L_0x0015:
        r2 = r2 + 1;
        goto L_0x000c;
    L_0x0018:
        r0 = r7.f49283D;
        r4 = r0.yLA(r8);
        r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x0034;
    L_0x0022:
        r0 = r7.f49284E;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0035;
    L_0x0028:
        r2 = r7.f49282C;
        r0 = -9223372036854775808;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x0034;
    L_0x0030:
        r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x0035;
    L_0x0034:
        r6 = 1;
    L_0x0035:
        X.AnonymousClass2yO.m18017F(r6);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.43y.yLA(long):long");
    }
}
