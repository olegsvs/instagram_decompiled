package X;

import android.content.Context;
import android.net.ConnectivityManager;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3sJ */
public final class AnonymousClass3sJ implements AnonymousClass2rQ, AnonymousClass2rg {
    /* renamed from: B */
    public final AnonymousClass2lI f45694B;
    /* renamed from: C */
    public final boolean f45695C;
    /* renamed from: D */
    public final float f45696D;
    /* renamed from: E */
    public final int f45697E;
    /* renamed from: F */
    public final AnonymousClass2kv f45698F;
    /* renamed from: G */
    public final float f45699G;
    /* renamed from: H */
    public final int f45700H;
    /* renamed from: I */
    public final int f45701I;
    /* renamed from: J */
    public final int f45702J;
    /* renamed from: K */
    public final int f45703K;
    /* renamed from: L */
    public final AnonymousClass2kx f45704L;
    /* renamed from: M */
    public final int f45705M;
    /* renamed from: N */
    public final int f45706N;
    /* renamed from: O */
    public final int f45707O;
    /* renamed from: P */
    public long f45708P;
    /* renamed from: Q */
    public long f45709Q;
    /* renamed from: R */
    public volatile String f45710R;
    /* renamed from: S */
    private final AnonymousClass3ue f45711S;
    /* renamed from: T */
    private final AnonymousClass2kb f45712T;
    /* renamed from: U */
    private final float f45713U;
    /* renamed from: V */
    private volatile AnonymousClass2rO[] f45714V;
    /* renamed from: W */
    private final boolean f45715W;
    /* renamed from: X */
    private final int f45716X;
    /* renamed from: Y */
    private final boolean f45717Y;
    /* renamed from: Z */
    private final boolean f45718Z;

    public final void BH() {
    }

    public final void WG() {
    }

    public AnonymousClass3sJ(Context context, AnonymousClass2kx anonymousClass2kx, AnonymousClass3ue anonymousClass3ue, AnonymousClass3ti anonymousClass3ti, Map map, AnonymousClass2kb anonymousClass2kb, AnonymousClass2lI anonymousClass2lI, String str, AnonymousClass1Gs anonymousClass1Gs, AnonymousClass2kY anonymousClass2kY) {
        boolean z;
        this.f45711S = anonymousClass3ue;
        AnonymousClass2kb anonymousClass2kb2 = anonymousClass2kb;
        this.f45712T = anonymousClass2kb;
        this.f45694B = anonymousClass2lI;
        this.f45710R = str;
        AnonymousClass1Gs anonymousClass1Gs2 = anonymousClass1Gs;
        this.f45698F = new AnonymousClass2kv(context, anonymousClass2kb2, map, anonymousClass2kx, anonymousClass1Gs2, anonymousClass2kY);
        this.f45704L = anonymousClass2kx;
        this.f45702J = AnonymousClass1Gk.XB(map);
        this.f45701I = AnonymousClass1Gk.SB(map);
        this.f45703K = AnonymousClass1Gk.YB(map);
        this.f45696D = AnonymousClass1Gk.LB(map);
        this.f45713U = AnonymousClass1Gk.OB(map);
        this.f45715W = AnonymousClass1Gk.PB(map);
        this.f45700H = AnonymousClass1Gk.RB(map);
        this.f45699G = AnonymousClass1Gk.QB(map);
        this.f45718Z = AnonymousClass1Gk.lC(map);
        if (!anonymousClass2kx.f33342D) {
            if (!anonymousClass1Gs2.f16539U) {
                z = false;
                this.f45717Y = z;
                if (anonymousClass2kx.f33341C) {
                    this.f45706N = anonymousClass1Gs2.f16541W;
                    this.f45705M = anonymousClass1Gs2.f16538T;
                    this.f45707O = anonymousClass1Gs2.f16543Y;
                } else {
                    this.f45706N = anonymousClass1Gs2.f16540V;
                    this.f45705M = anonymousClass1Gs2.f16537S;
                    this.f45707O = anonymousClass1Gs2.f16542X;
                }
                this.f45708P = (long) (this.f45707O * -2);
                this.f45709Q = 0;
                this.f45716X = anonymousClass1Gs2.f16536R;
                this.f45697E = anonymousClass1Gs2.f16535Q;
                this.f45695C = anonymousClass1Gs2.f16532N;
            }
        }
        z = true;
        this.f45717Y = z;
        if (anonymousClass2kx.f33341C) {
            this.f45706N = anonymousClass1Gs2.f16541W;
            this.f45705M = anonymousClass1Gs2.f16538T;
            this.f45707O = anonymousClass1Gs2.f16543Y;
        } else {
            this.f45706N = anonymousClass1Gs2.f16540V;
            this.f45705M = anonymousClass1Gs2.f16537S;
            this.f45707O = anonymousClass1Gs2.f16542X;
        }
        this.f45708P = (long) (this.f45707O * -2);
        this.f45709Q = 0;
        this.f45716X = anonymousClass1Gs2.f16536R;
        this.f45697E = anonymousClass1Gs2.f16535Q;
        this.f45695C = anonymousClass1Gs2.f16532N;
    }

    /* renamed from: B */
    public static void m21061B(AnonymousClass3sJ anonymousClass3sJ, AnonymousClass2lA anonymousClass2lA) {
        if (anonymousClass3sJ.f45694B != null) {
            new Object[1][0] = anonymousClass2lA;
            anonymousClass3sJ.f45694B.f33502B.m17071A(anonymousClass2lA);
        }
    }

    /* renamed from: C */
    public static AnonymousClass2rO m21062C(AnonymousClass3sJ anonymousClass3sJ, AnonymousClass2rO[] anonymousClass2rOArr, AnonymousClass2rO anonymousClass2rO, long j) {
        AnonymousClass3sJ anonymousClass3sJ2 = anonymousClass3sJ;
        long j2 = j;
        j = AnonymousClass3sJ.m21064E(anonymousClass3sJ, j, anonymousClass3sJ.f45696D);
        long E = AnonymousClass3sJ.m21064E(anonymousClass3sJ, j2, anonymousClass3sJ.f45696D * anonymousClass3sJ.f45713U);
        String str = anonymousClass3sJ.f45710R;
        anonymousClass3sJ = anonymousClass2rOArr;
        if (str != null) {
            int B;
            for (AnonymousClass2rO anonymousClass2rO2 : anonymousClass2rOArr) {
                if (anonymousClass2rO2.f35068Q.equals(anonymousClass3sJ2.f45710R)) {
                    return anonymousClass2rO2;
                }
            }
        }
        if (j2 == -1) {
            return anonymousClass3sJ2.f45698F.m17053A(anonymousClass3sJ, anonymousClass3sJ2.f45704L.m17066C(), anonymousClass2rO, j);
        }
        B = anonymousClass3sJ2.f45698F.m17054B(anonymousClass2rO, anonymousClass2rOArr, null);
        int i = 0;
        while (i < anonymousClass2rOArr.length) {
            AnonymousClass2rO anonymousClass2rO3 = anonymousClass2rOArr[i];
            long j3 = (anonymousClass2rO == null || anonymousClass2rO3.f35055D <= anonymousClass2rO.f35055D) ? j : E;
            if (((long) anonymousClass2rO3.f35055D) > j3 || anonymousClass2rO3.f35071T > B) {
                i++;
            } else {
                new Object[1][0] = anonymousClass2rO3.f35068Q;
                return anonymousClass2rO3;
            }
        }
        new Object[1][0] = anonymousClass2rOArr[anonymousClass2rOArr.length - 1].f35068Q;
        return anonymousClass2rOArr[anonymousClass2rOArr.length - 1];
    }

    /* renamed from: D */
    public static long m21063D(AnonymousClass3sJ anonymousClass3sJ) {
        long sI = anonymousClass3sJ.f45711S.sI();
        if (anonymousClass3sJ.f45711S.hI() < anonymousClass3sJ.f45716X || sI == -1) {
            sI = AnonymousClass45G.f49741F.sI();
        }
        return (sI == -1 && anonymousClass3sJ.f45718Z) ? -1 : sI;
    }

    /* renamed from: E */
    public static long m21064E(AnonymousClass3sJ anonymousClass3sJ, long j, float f) {
        return j == -1 ? (long) anonymousClass3sJ.f45697E : (long) (((float) j) * f);
    }

    /* renamed from: F */
    public static AnonymousClass2rO m21065F(AnonymousClass3sJ anonymousClass3sJ, AnonymousClass2rO[] anonymousClass2rOArr) {
        anonymousClass3sJ = anonymousClass3sJ.f45698F.m17054B(null, anonymousClass2rOArr, null);
        for (AnonymousClass2rO anonymousClass2rO : anonymousClass2rOArr) {
            if (anonymousClass2rO.f35071T <= anonymousClass3sJ) {
                return anonymousClass2rO;
            }
        }
        return anonymousClass2rOArr[anonymousClass2rOArr.length - 1];
    }

    /* renamed from: G */
    public static boolean m21066G(ConnectivityManager connectivityManager, AnonymousClass2kY anonymousClass2kY, boolean z) {
        if (anonymousClass2kY != null && z) {
            return anonymousClass2kY.m17016B();
        }
        connectivityManager = connectivityManager.getActiveNetworkInfo();
        anonymousClass2kY = true;
        if (connectivityManager == null || connectivityManager.getType() != 1) {
            anonymousClass2kY = null;
        }
        return anonymousClass2kY;
    }

    /* renamed from: H */
    public static void m21067H(AnonymousClass3sJ anonymousClass3sJ, AnonymousClass2rP anonymousClass2rP, long j, AnonymousClass2rO anonymousClass2rO, AnonymousClass2rO anonymousClass2rO2, long j2, long j3, AnonymousClass2rO[] anonymousClass2rOArr, String str, String str2) {
        int i;
        long j4 = j2;
        AnonymousClass3sJ anonymousClass3sJ2 = anonymousClass3sJ;
        AnonymousClass2rP anonymousClass2rP2 = anonymousClass2rP;
        long j5 = j;
        AnonymousClass2rO anonymousClass2rO3 = anonymousClass2rO;
        AnonymousClass2rO anonymousClass2rO4 = anonymousClass2rO2;
        j2 = j3;
        AnonymousClass2rO[] anonymousClass2rOArr2 = anonymousClass2rOArr;
        j3 = str;
        String str3 = str2;
        if (anonymousClass2rO == null || anonymousClass2rO4 == anonymousClass2rO3) {
            i = 3;
        } else {
            anonymousClass2rP2.f35074D = 3;
            i = 3;
            long j6 = j5;
            long j7 = j4;
            long j8 = j2;
            AnonymousClass2lI anonymousClass2lI = anonymousClass3sJ2.f45694B;
            if (anonymousClass2lI != null) {
                anonymousClass2lI.m17086B(j6, anonymousClass2rO3, anonymousClass2rO4, j7, j8, anonymousClass2rOArr2, AnonymousClass3sJ.m21065F(anonymousClass3sJ2, anonymousClass2rOArr2), anonymousClass3sJ2.f45698F.m17054B(null, anonymousClass2rOArr2, null), j3, str3);
            }
        }
        anonymousClass2rP2.f35072B = anonymousClass2rO4;
        if (anonymousClass2rO == null) {
            AnonymousClass2lI anonymousClass2lI2 = anonymousClass3sJ2.f45694B;
            if (anonymousClass2lI2 != null) {
                anonymousClass2lI2.m17089E(anonymousClass2rO4, anonymousClass2rOArr2, j5, j4, AnonymousClass3sJ.m21065F(anonymousClass3sJ2, anonymousClass2rOArr2), anonymousClass3sJ2.f45698F.m17054B(null, anonymousClass2rOArr2, null), anonymousClass3sJ2.f45711S, j2, j3, str3);
            }
        }
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(anonymousClass2rP2.f35074D);
        objArr[1] = anonymousClass2rP2.f35072B == null ? "null" : anonymousClass2rP2.f35072B.f35068Q;
        objArr[2] = Integer.valueOf(anonymousClass2rP2.f35072B == null ? -1 : anonymousClass2rP2.f35072B.f35055D / JsonMappingException.MAX_REFS_TO_LIST);
        objArr[i] = str;
        objArr[4] = str2;
        objArr[5] = Integer.valueOf((int) (j4 / 1000));
    }

    /* renamed from: I */
    private void m21068I(AnonymousClass2rO anonymousClass2rO) {
        if (this.f45694B != null) {
            new Object[1][0] = Integer.valueOf(anonymousClass2rO.f35055D);
            this.f45694B.f33502B.m17072B(anonymousClass2rO);
        }
    }

    /* renamed from: J */
    private void m21069J(long j, long j2, AnonymousClass2rO anonymousClass2rO, AnonymousClass2rO[] anonymousClass2rOArr) {
        if (this.f45694B != null) {
            r3 = new Object[3];
            long j3 = j;
            int i = 0;
            r3[0] = Long.valueOf(j);
            long j4 = j2;
            r3[1] = Long.valueOf(j4);
            AnonymousClass2rO anonymousClass2rO2 = anonymousClass2rO;
            if (anonymousClass2rO != null) {
                i = anonymousClass2rO2.f35055D;
            }
            r3[2] = Integer.valueOf(i);
            List arrayList = new ArrayList();
            AnonymousClass2rO[] anonymousClass2rOArr2 = anonymousClass2rOArr;
            this.f45694B.f33502B.m17073C(j3, j4, AnonymousClass3sJ.m21063D(this), anonymousClass2rO2, anonymousClass2rOArr2, AnonymousClass3sJ.m21065F(this, anonymousClass2rOArr2), this.f45698F.m17054B(null, anonymousClass2rOArr2, arrayList), arrayList);
        }
    }

    /* renamed from: K */
    private void m21070K(AnonymousClass2rO[] anonymousClass2rOArr) {
        if (this.f45714V == null) {
            this.f45714V = anonymousClass2rOArr;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void QH(java.util.List r21, long r22, X.AnonymousClass2rO[] r24, X.AnonymousClass2rP r25, long r26, java.util.Map r28, long r29, float[] r31, int r32) {
        /*
        r20 = this;
        r13 = r22;
        r4 = r26;
        r0 = r20;
        r7 = r0.f45698F;
        r1 = r24;
        r2 = r7.f33330O;
        if (r2 == 0) goto L_0x0048;
    L_0x000e:
        r3 = r7.f33324I;
        r2 = -1;
        if (r3 != r2) goto L_0x0048;
    L_0x0013:
        r2 = r7.f33325J;
        r2 = r2.m17065B();
        r2 = X.AnonymousClass2kw.m17056B(r1, r2);
        r7.f33324I = r2;
        r2 = 3;
        r6 = new java.lang.Object[r2];
        r3 = 0;
        r2 = r7.f33325J;
        r2 = r2.m17066C();
        r6[r3] = r2;
        r3 = 1;
        r2 = r7.f33325J;
        r2 = r2.m17065B();
        r2 = X.AnonymousClass2kw.m17059E(r2);
        if (r2 == 0) goto L_0x003b;
    L_0x0038:
        r2 = "intentional";
        goto L_0x003d;
    L_0x003b:
        r2 = "unintentional";
    L_0x003d:
        r6[r3] = r2;
        r3 = 2;
        r2 = r7.f33324I;
        r2 = java.lang.Integer.valueOf(r2);
        r6[r3] = r2;
    L_0x0048:
        r0.m21070K(r1);
        r2 = r25;
        r2 = r2.f35072B;
        r6 = r0;
        r12 = r1;
        r11 = r2;
        r7 = r13;
        r9 = r4;
        r6.m21069J(r7, r9, r11, r12);
        r3 = r1.length;
        r2 = 1;
        if (r3 != r2) goto L_0x0088;
    L_0x005b:
        r2 = r25;
        r2 = r2.f35072B;
        if (r2 != 0) goto L_0x0087;
    L_0x0061:
        r2 = X.AnonymousClass2lA.SINGLE_FORMAT;
        X.AnonymousClass3sJ.m21061B(r0, r2);
        r4 = 0;
        r3 = r24[r4];
        r2 = r25;
        r2.f35072B = r3;
        r19 = 0;
        r20 = r24[r4];
        r23 = X.AnonymousClass3sJ.m21063D(r0);
        r26 = "UNKNOWN";
        r2 = "UNKNOWN";
        r21 = 0;
        r27 = r2;
        r15 = r0;
        r16 = r25;
        r17 = r13;
        r25 = r1;
        X.AnonymousClass3sJ.m21067H(r15, r16, r17, r19, r20, r21, r23, r25, r26, r27);
    L_0x0087:
        return;
    L_0x0088:
        r18 = new java.util.ArrayList;
        r2 = r18;
        r2.<init>();
        r6 = r21.iterator();
    L_0x0093:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x00aa;
    L_0x0099:
        r3 = r6.next();
        r3 = (X.AnonymousClass43f) r3;
        r2 = new com.facebook.exoplayer.ipc.VideoPlayerMediaChunk;
        r2.<init>(r3);
        r7 = r18;
        r7.add(r2);
        goto L_0x0093;
    L_0x00aa:
        r2 = r0.f45717Y;
        if (r2 == 0) goto L_0x0248;
    L_0x00ae:
        r3 = r18;
        r30 = r1;
        r2 = X.AnonymousClass2lA.BUFFER;
        X.AnonymousClass3sJ.m21061B(r0, r2);
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r26 / r6;
        r8 = (int) r4;
        r13 = r22 / r6;
        r2 = 3;
        r4 = new java.lang.Object[r2];
        r2 = java.lang.Long.valueOf(r22);
        r12 = 0;
        r4[r12] = r2;
        r2 = java.lang.Integer.valueOf(r8);
        r11 = 1;
        r4[r11] = r2;
        r2 = r25;
        r2 = r2.f35072B;
        r6 = 0;
        if (r2 == 0) goto L_0x00dd;
    L_0x00d6:
        r2 = r25;
        r2 = r2.f35072B;
        r2 = r2.f35068Q;
        goto L_0x00de;
    L_0x00dd:
        r2 = r6;
    L_0x00de:
        r15 = 2;
        r4[r15] = r2;
        r2 = r25;
        r10 = r2.f35072B;
        if (r18 == 0) goto L_0x010e;
    L_0x00e7:
        r2 = r3.size();
        if (r2 <= 0) goto L_0x010e;
    L_0x00ed:
        r2 = r3.size();
        r2 = r2 - r11;
        r2 = r3.get(r2);
        r2 = (com.facebook.exoplayer.ipc.VideoPlayerMediaChunk) r2;
        r9 = r2.f33357D;
        r7 = r1.length;
        r4 = 0;
    L_0x00fc:
        if (r4 >= r7) goto L_0x010e;
    L_0x00fe:
        r5 = r24[r4];
        r3 = r5.f35068Q;
        r2 = r9.f35068Q;
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x010b;
    L_0x010a:
        goto L_0x010f;
    L_0x010b:
        r4 = r4 + 1;
        goto L_0x00fc;
    L_0x010e:
        r5 = r10;
    L_0x010f:
        r31 = "UNKNOWN";
        r32 = "UNKNOWN";
        r2 = X.AnonymousClass3sJ.m21063D(r0);
        r4 = r0.f45696D;
        r20 = X.AnonymousClass3sJ.m21064E(r0, r2, r4);
        r12 = r24[r12];
        r2 = r1.length;
        r2 = r2 - r11;
        r11 = r24[r2];
        r9 = r1.length;
        r7 = 0;
    L_0x0125:
        if (r7 >= r9) goto L_0x014a;
    L_0x0127:
        r4 = r24[r7];
        if (r5 == 0) goto L_0x0138;
    L_0x012b:
        r3 = r4.f35055D;
        r2 = r5.f35055D;
        if (r3 <= r2) goto L_0x0138;
    L_0x0131:
        r3 = r4.f35055D;
        r2 = r12.f35055D;
        if (r3 >= r2) goto L_0x0138;
    L_0x0137:
        r12 = r4;
    L_0x0138:
        if (r5 == 0) goto L_0x0147;
    L_0x013a:
        r3 = r4.f35055D;
        r2 = r5.f35055D;
        if (r3 >= r2) goto L_0x0147;
    L_0x0140:
        r3 = r4.f35055D;
        r2 = r11.f35055D;
        if (r3 <= r2) goto L_0x0147;
    L_0x0146:
        r11 = r4;
    L_0x0147:
        r7 = r7 + 1;
        goto L_0x0125;
    L_0x014a:
        r2 = r0.f45710R;
        if (r2 == 0) goto L_0x016b;
    L_0x014e:
        r2 = X.AnonymousClass2lA.PRESELECTED;
        X.AnonymousClass3sJ.m21061B(r0, r2);
        r9 = r1.length;
        r7 = 0;
    L_0x0155:
        if (r7 >= r9) goto L_0x0168;
    L_0x0157:
        r4 = r24[r7];
        r3 = r4.f35068Q;
        r2 = r0.f45710R;
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x0165;
    L_0x0163:
        r6 = r4;
        goto L_0x0168;
    L_0x0165:
        r7 = r7 + 1;
        goto L_0x0155;
    L_0x0168:
        r7 = 1;
        goto L_0x01ec;
    L_0x016b:
        if (r8 > 0) goto L_0x01b6;
    L_0x016d:
        r2 = X.AnonymousClass2lA.NO_BANDWIDTH;
        X.AnonymousClass3sJ.m21061B(r0, r2);
        if (r5 != 0) goto L_0x0197;
    L_0x0174:
        r2 = X.AnonymousClass2lA.NO_CURRENT;
        X.AnonymousClass3sJ.m21061B(r0, r2);
        r3 = r0.f45698F;
        r2 = r0.f45704L;
        r18 = r2.m17066C();
        r17 = r1;
        r7 = 1;
        r19 = r5;
        r16 = r3;
        r4 = r16.m17053A(r17, r18, r19, r20);
        r3 = new java.lang.Object[r7];
        if (r4 == 0) goto L_0x0192;
    L_0x0190:
        r6 = r4.f35068Q;
    L_0x0192:
        r2 = 0;
        r3[r2] = r6;
        r6 = r4;
        goto L_0x01ec;
    L_0x0197:
        r7 = 1;
        r9 = (long) r8;
        r2 = r0.f45709Q;
        r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x01ae;
    L_0x019f:
        r2 = r0.f45708P;
        r9 = 0;
        r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r2 <= 0) goto L_0x01a8;
    L_0x01a7:
        goto L_0x01ae;
    L_0x01a8:
        r2 = X.AnonymousClass2lA.FORCE_CURRENT;
        X.AnonymousClass3sJ.m21061B(r0, r2);
        goto L_0x01eb;
    L_0x01ae:
        r2 = X.AnonymousClass2lA.TRY_LOWER_QUALITY;
        X.AnonymousClass3sJ.m21061B(r0, r2);
        r0.f45708P = r13;
        goto L_0x01c8;
    L_0x01b6:
        r7 = 1;
        r2 = r0.f45705M;
        if (r8 > r2) goto L_0x01ca;
    L_0x01bb:
        r2 = X.AnonymousClass2lA.LOW_BUFFER;
        X.AnonymousClass3sJ.m21061B(r0, r2);
        r9 = (long) r8;
        r2 = r0.f45709Q;
        r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x01ae;
    L_0x01c7:
        goto L_0x01a8;
    L_0x01c8:
        r6 = r11;
        goto L_0x01ec;
    L_0x01ca:
        r2 = r0.f45706N;
        if (r8 < r2) goto L_0x01a8;
    L_0x01ce:
        r2 = X.AnonymousClass2lA.HIGH_BUFFER;
        X.AnonymousClass3sJ.m21061B(r0, r2);
        r9 = (long) r8;
        r2 = r0.f45709Q;
        r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x01a8;
    L_0x01da:
        r2 = r0.f45708P;
        r4 = r0.f45707O;
        r9 = (long) r4;
        r2 = r2 + r9;
        r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x01a8;
    L_0x01e4:
        r2 = X.AnonymousClass2lA.TRY_HIGHER_QUALITY;
        X.AnonymousClass3sJ.m21061B(r0, r2);
        r6 = r12;
        goto L_0x01ec;
    L_0x01eb:
        r6 = r5;
    L_0x01ec:
        if (r6 != 0) goto L_0x0206;
    L_0x01ee:
        r4 = new java.lang.Object[r7];
        r2 = r1.length;
        r2 = r2 - r7;
        r2 = r24[r2];
        r3 = r2.f35068Q;
        r2 = 0;
        r4[r2] = r3;
        r2 = X.AnonymousClass2lA.USE_LOWEST_WITH_NO_SUITABLE_FORMAT;
        X.AnonymousClass3sJ.m21061B(r0, r2);
        r2 = r1.length;
        r2 = r2 - r7;
        r6 = r24[r2];
        r31 = "NONE";
        r32 = "NONE";
    L_0x0206:
        r3 = (long) r8;
        r0.f45709Q = r3;
        r1 = 6;
        r9 = new java.lang.Object[r1];
        if (r5 != 0) goto L_0x0211;
    L_0x020e:
        r2 = "null";
        goto L_0x0213;
    L_0x0211:
        r2 = r5.f35068Q;
    L_0x0213:
        r1 = 0;
        r9[r1] = r2;
        r1 = r6.f35068Q;
        r9[r7] = r1;
        r1 = r12.f35068Q;
        r9[r15] = r1;
        r2 = r11.f35068Q;
        r1 = 3;
        r9[r1] = r2;
        r2 = 4;
        r1 = java.lang.Integer.valueOf(r8);
        r9[r2] = r1;
        r7 = 5;
        r1 = r0.f45708P;
        r13 = r13 - r1;
        r1 = java.lang.Long.valueOf(r13);
        r9[r7] = r1;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = r3 * r1;
        r28 = 0;
        r20 = r0;
        r21 = r25;
        r24 = r5;
        r25 = r6;
        r26 = r3;
        X.AnonymousClass3sJ.m21067H(r20, r21, r22, r24, r25, r26, r28, r30, r31, r32);
        goto L_0x0087;
    L_0x0248:
        r2 = r0.f45715W;
        if (r2 == 0) goto L_0x0454;
    L_0x024c:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r26 / r2;
        r6 = (int) r4;
        r2 = X.AnonymousClass3sJ.m21063D(r0);
        r4 = r0.f45696D;
        r16 = X.AnonymousClass3sJ.m21064E(r0, r2, r4);
        r5 = r0.f45696D;
        r4 = r0.f45699G;
        r5 = r5 * r4;
        r9 = X.AnonymousClass3sJ.m21064E(r0, r2, r5);
        r4 = 6;
        r8 = new java.lang.Object[r4];
        r4 = java.lang.Long.valueOf(r2);
        r15 = 0;
        r8[r15] = r4;
        r4 = java.lang.Long.valueOf(r16);
        r7 = 1;
        r8[r7] = r4;
        r5 = java.lang.Long.valueOf(r9);
        r4 = 2;
        r8[r4] = r5;
        r5 = java.lang.Long.valueOf(r13);
        r4 = 3;
        r8[r4] = r5;
        r5 = java.lang.Integer.valueOf(r6);
        r4 = 4;
        r8[r4] = r5;
        r4 = r25;
        r4 = r4.f35072B;
        if (r4 == 0) goto L_0x0297;
    L_0x0290:
        r4 = r25;
        r4 = r4.f35072B;
        r5 = r4.f35068Q;
        goto L_0x0298;
    L_0x0297:
        r5 = 0;
    L_0x0298:
        r4 = 5;
        r8[r4] = r5;
        r4 = r25;
        r11 = r4.f35072B;
        r26 = "UNKNOWN";
        r27 = "UNKNOWN";
        r4 = r0.f45710R;
        if (r4 == 0) goto L_0x02c6;
    L_0x02a7:
        r4 = X.AnonymousClass2lA.PRESELECTED;
        X.AnonymousClass3sJ.m21061B(r0, r4);
        r8 = r1.length;
        r7 = 0;
    L_0x02ae:
        if (r7 >= r8) goto L_0x02c0;
    L_0x02b0:
        r5 = r24[r7];
        r9 = r5.f35068Q;
        r4 = r0.f45710R;
        r4 = r9.equals(r4);
        if (r4 == 0) goto L_0x02bd;
    L_0x02bc:
        goto L_0x02c1;
    L_0x02bd:
        r7 = r7 + 1;
        goto L_0x02ae;
    L_0x02c0:
        r5 = 0;
    L_0x02c1:
        r20 = r11;
        r11 = r5;
        goto L_0x0422;
    L_0x02c6:
        r4 = -1;
        r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r4 == 0) goto L_0x03f9;
    L_0x02cc:
        if (r11 != 0) goto L_0x02d0;
    L_0x02ce:
        goto L_0x03f9;
    L_0x02d0:
        r4 = r0.f45700H;
        if (r6 > r4) goto L_0x031d;
    L_0x02d4:
        r4 = X.AnonymousClass2lA.LOW_BUFFER;
        X.AnonymousClass3sJ.m21061B(r0, r4);
        r4 = r11.f35055D;
        r4 = (long) r4;
        r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        if (r4 >= 0) goto L_0x0306;
    L_0x02e0:
        r4 = X.AnonymousClass2lA.LOW_BANDWIDTH;
        X.AnonymousClass3sJ.m21061B(r0, r4);
        r4 = r0.f45698F;
        r16 = r4;
        r17 = r1;
        r18 = r11;
        r19 = r9;
        r8 = X.AnonymousClass2kv.m17052C(r16, r17, r18, r19);
        r5 = new java.lang.Object[r7];
        if (r8 == 0) goto L_0x02fa;
    L_0x02f7:
        r4 = r8.f35068Q;
        goto L_0x02fb;
    L_0x02fa:
        r4 = 0;
    L_0x02fb:
        r5[r15] = r4;
        r26 = "LOW";
        r27 = "LOW";
    L_0x0301:
        r20 = r11;
    L_0x0303:
        r11 = r8;
        goto L_0x0422;
    L_0x0306:
        r4 = X.AnonymousClass2lA.HIGH_BANDWIDTH;
        X.AnonymousClass3sJ.m21061B(r0, r4);
        r5 = new java.lang.Object[r7];
        if (r11 == 0) goto L_0x0312;
    L_0x030f:
        r4 = r11.f35068Q;
        goto L_0x0313;
    L_0x0312:
        r4 = 0;
    L_0x0313:
        r5[r15] = r4;
        r26 = "LOW";
        r27 = "HIGH";
    L_0x0319:
        r20 = r11;
        goto L_0x0422;
    L_0x031d:
        r4 = X.AnonymousClass2lA.HIGH_BUFFER;
        X.AnonymousClass3sJ.m21061B(r0, r4);
        r4 = r11.f35055D;
        r4 = (long) r4;
        r4 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1));
        if (r4 >= 0) goto L_0x0368;
    L_0x0329:
        r4 = X.AnonymousClass2lA.LOW_BANDWIDTH;
        X.AnonymousClass3sJ.m21061B(r0, r4);
        r4 = r0.f45701I;
        if (r6 < r4) goto L_0x0346;
    L_0x0332:
        r4 = X.AnonymousClass2lA.FORCE_CURRENT_WITH_VERY_HIGH_BUFFER;
        X.AnonymousClass3sJ.m21061B(r0, r4);
        r5 = new java.lang.Object[r7];
        if (r11 == 0) goto L_0x033e;
    L_0x033b:
        r4 = r11.f35068Q;
        goto L_0x033f;
    L_0x033e:
        r4 = 0;
    L_0x033f:
        r5[r15] = r4;
        r26 = "HIGH";
        r27 = "LOW";
        goto L_0x0319;
    L_0x0346:
        r4 = X.AnonymousClass2lA.TRY_LOWER_QUALITY;
        X.AnonymousClass3sJ.m21061B(r0, r4);
        r4 = r0.f45698F;
        r18 = r4;
        r19 = r1;
        r20 = r11;
        r21 = r16;
        r8 = X.AnonymousClass2kv.m17052C(r18, r19, r20, r21);
        r5 = new java.lang.Object[r7];
        if (r8 == 0) goto L_0x0360;
    L_0x035d:
        r4 = r8.f35068Q;
        goto L_0x0361;
    L_0x0360:
        r4 = 0;
    L_0x0361:
        r5[r15] = r4;
        r26 = "MID";
        r27 = "LOW";
        goto L_0x0301;
    L_0x0368:
        r4 = X.AnonymousClass2lA.TRY_HIGHER_QUALITY;
        X.AnonymousClass3sJ.m21061B(r0, r4);
        r4 = r0.f45698F;
        r19 = r4;
        r20 = r1;
        r21 = r11;
        r22 = r16;
        r8 = X.AnonymousClass2kv.m17052C(r19, r20, r21, r22);
        r5 = new java.lang.Object[r7];
        if (r8 == 0) goto L_0x0382;
    L_0x037f:
        r4 = r8.f35068Q;
        goto L_0x0383;
    L_0x0382:
        r4 = 0;
    L_0x0383:
        r5[r15] = r4;
        if (r8 == 0) goto L_0x03f1;
    L_0x0387:
        r5 = r8.f35055D;
        r4 = r11.f35055D;
        if (r5 <= r4) goto L_0x03f1;
    L_0x038d:
        r4 = r0.f45703K;
        if (r6 <= r4) goto L_0x03f1;
    L_0x0391:
        r6 = 0;
        r10 = 0;
    L_0x0394:
        r4 = r18;
        r4 = r4.size();
        if (r10 >= r4) goto L_0x03ea;
    L_0x039c:
        r4 = r18;
        r9 = r4.get(r10);
        r9 = (com.facebook.exoplayer.ipc.VideoPlayerMediaChunk) r9;
        r20 = r11;
        r11 = r9.f33356C;
        r4 = r9.f33358E;
        r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x03b4;
    L_0x03ae:
        r4 = r9.f33356C;
        r11 = r9.f33358E;
        r4 = r4 - r11;
        r6 = r6 + r4;
    L_0x03b4:
        r4 = r0.f45703K;
        r4 = (long) r4;
        r11 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r11;
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 < 0) goto L_0x03e5;
    L_0x03be:
        r4 = r9.f33357D;
        r5 = r4.f35055D;
        r4 = r8.f35055D;
        if (r5 >= r4) goto L_0x03e5;
    L_0x03c6:
        r4 = r9.f33357D;
        r5 = r4.f35067P;
        r4 = r8.f35067P;
        if (r5 >= r4) goto L_0x03e5;
    L_0x03ce:
        r9 = 1;
        r5 = new java.lang.Object[r9];
        r4 = r18;
        r4 = r4.size();
        r4 = r4 - r10;
        r4 = r4 - r9;
        r4 = java.lang.Integer.valueOf(r4);
        r5[r15] = r4;
        r10 = r10 + r9;
        r4 = r25;
        r4.f35073C = r10;
        goto L_0x03ec;
    L_0x03e5:
        r10 = r10 + 1;
        r11 = r20;
        goto L_0x0394;
    L_0x03ea:
        r20 = r11;
    L_0x03ec:
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 / r4;
        r6 = (int) r6;
        goto L_0x03f3;
    L_0x03f1:
        r20 = r11;
    L_0x03f3:
        r26 = "HIGH";
        r27 = "NONE";
        goto L_0x0303;
    L_0x03f9:
        r20 = r11;
        if (r11 != 0) goto L_0x0400;
    L_0x03fd:
        r4 = X.AnonymousClass2lA.NO_CURRENT;
        goto L_0x0402;
    L_0x0400:
        r4 = X.AnonymousClass2lA.NO_BANDWIDTH;
    L_0x0402:
        X.AnonymousClass3sJ.m21061B(r0, r4);
        r5 = r0.f45698F;
        r4 = r0.f45704L;
        r19 = r4.m17066C();
        r18 = r1;
        r21 = r16;
        r17 = r5;
        r11 = r17.m17053A(r18, r19, r20, r21);
        r4 = 1;
        r5 = new java.lang.Object[r4];
        if (r11 == 0) goto L_0x041f;
    L_0x041c:
        r4 = r11.f35068Q;
        goto L_0x0420;
    L_0x041f:
        r4 = 0;
    L_0x0420:
        r5[r15] = r4;
    L_0x0422:
        if (r11 != 0) goto L_0x043c;
    L_0x0424:
        r7 = 1;
        r5 = new java.lang.Object[r7];
        r4 = r1.length;
        r4 = r4 - r7;
        r4 = r24[r4];
        r4 = r4.f35068Q;
        r5[r15] = r4;
        r4 = X.AnonymousClass2lA.USE_LOWEST_WITH_NO_SUITABLE_FORMAT;
        X.AnonymousClass3sJ.m21061B(r0, r4);
        r4 = r1.length;
        r4 = r4 - r7;
        r11 = r24[r4];
        r26 = "NONE";
        r27 = "NONE";
    L_0x043c:
        r4 = (long) r6;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r15 = r0;
        r16 = r25;
        r17 = r13;
        r19 = r20;
        r20 = r11;
        r21 = r4;
        r23 = r2;
        r25 = r1;
        X.AnonymousClass3sJ.m21067H(r15, r16, r17, r19, r20, r21, r23, r25, r26, r27);
        goto L_0x0087;
    L_0x0454:
        r19 = r13;
        r23 = r4;
        r2 = r25;
        r7 = r2.f35072B;
        r8 = X.AnonymousClass3sJ.m21063D(r0);
        r2 = -1;
        r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x046d;
    L_0x0466:
        r2 = r0.f45695C;
        if (r2 == 0) goto L_0x046d;
    L_0x046a:
        r2 = r0.f45697E;
        r8 = (long) r2;
    L_0x046d:
        r6 = X.AnonymousClass3sJ.m21062C(r0, r1, r7, r8);
        r15 = 1;
        r11 = 0;
        if (r6 == 0) goto L_0x0480;
    L_0x0475:
        if (r7 == 0) goto L_0x0480;
    L_0x0477:
        r3 = r6.f35055D;
        r2 = r7.f35055D;
        if (r3 <= r2) goto L_0x0480;
    L_0x047d:
        r17 = 1;
        goto L_0x0482;
    L_0x0480:
        r17 = 0;
    L_0x0482:
        if (r6 == 0) goto L_0x048e;
    L_0x0484:
        if (r7 == 0) goto L_0x048e;
    L_0x0486:
        r3 = r6.f35055D;
        r2 = r7.f35055D;
        if (r3 >= r2) goto L_0x048e;
    L_0x048c:
        r12 = 1;
        goto L_0x048f;
    L_0x048e:
        r12 = 0;
    L_0x048f:
        r2 = 10;
        r10 = new java.lang.Object[r2];
        r2 = java.lang.Boolean.valueOf(r17);
        r10[r11] = r2;
        r2 = java.lang.Boolean.valueOf(r12);
        r10[r15] = r2;
        r3 = 2;
        r11 = -1;
        if (r6 != 0) goto L_0x04a5;
    L_0x04a3:
        r2 = -1;
        goto L_0x04a9;
    L_0x04a5:
        r2 = r6.f35055D;
        r2 = r2 / 1000;
    L_0x04a9:
        r2 = java.lang.Integer.valueOf(r2);
        r10[r3] = r2;
        r3 = 3;
        if (r6 != 0) goto L_0x04b4;
    L_0x04b2:
        r2 = -1;
        goto L_0x04b6;
    L_0x04b4:
        r2 = r6.f35071T;
    L_0x04b6:
        r2 = java.lang.Integer.valueOf(r2);
        r10[r3] = r2;
        r3 = 4;
        if (r7 != 0) goto L_0x04c0;
    L_0x04bf:
        goto L_0x04c4;
    L_0x04c0:
        r2 = r7.f35055D;
        r11 = r2 / 1000;
    L_0x04c4:
        r2 = java.lang.Integer.valueOf(r11);
        r10[r3] = r2;
        r11 = 5;
        r15 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r26 / r15;
        r2 = java.lang.Long.valueOf(r2);
        r10[r11] = r2;
        r3 = 6;
        r2 = r0.f45704L;
        r2 = r2.m17065B();
        r10[r3] = r2;
        r3 = 7;
        r2 = r0.f45704L;
        r2 = r2.m17064A();
        r10[r3] = r2;
        r3 = 8;
        r13 = r13 / r15;
        r2 = java.lang.Long.valueOf(r13);
        r10[r3] = r2;
        r11 = 9;
        r2 = r8 / r15;
        r2 = java.lang.Long.valueOf(r2);
        r10[r11] = r2;
        if (r17 == 0) goto L_0x0577;
    L_0x04fc:
        r2 = r0.f45702J;
        r2 = (long) r2;
        r2 = r2 * r15;
        r2 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x0506;
    L_0x0504:
        goto L_0x0585;
    L_0x0506:
        r2 = r0.f45703K;
        r2 = (long) r2;
        r2 = r2 * r15;
        r2 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x0576;
    L_0x050e:
        r23 = 0;
        r5 = 0;
    L_0x0511:
        r2 = r18;
        r2 = r2.size();
        if (r5 >= r2) goto L_0x0575;
    L_0x0519:
        r2 = r18;
        r4 = r2.get(r5);
        r4 = (com.facebook.exoplayer.ipc.VideoPlayerMediaChunk) r4;
        r10 = r4.f33356C;
        r2 = r4.f33358E;
        r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x0530;
    L_0x0529:
        r2 = r4.f33356C;
        r10 = r4.f33358E;
        r2 = r2 - r10;
        r23 = r23 + r2;
    L_0x0530:
        r2 = r0.f45703K;
        r2 = (long) r2;
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r10;
        r2 = (r23 > r2 ? 1 : (r23 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x0572;
    L_0x053a:
        r2 = r4.f33357D;
        r3 = r2.f35055D;
        r2 = r6.f35055D;
        if (r3 >= r2) goto L_0x0572;
    L_0x0542:
        r2 = r4.f33357D;
        r3 = r2.f35067P;
        r2 = r6.f35067P;
        if (r3 >= r2) goto L_0x0572;
    L_0x054a:
        r2 = r4.f33357D;
        r3 = r2.f35067P;
        r2 = 720; // 0x2d0 float:1.009E-42 double:3.557E-321;
        if (r3 >= r2) goto L_0x0572;
    L_0x0552:
        r2 = r4.f33357D;
        r3 = r2.f35071T;
        r2 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        if (r3 >= r2) goto L_0x0572;
    L_0x055a:
        r10 = 1;
        r4 = new java.lang.Object[r10];
        r2 = r18;
        r2 = r2.size();
        r2 = r2 - r5;
        r2 = r2 - r10;
        r3 = java.lang.Integer.valueOf(r2);
        r2 = 0;
        r4[r2] = r3;
        r5 = r5 + r10;
        r2 = r25;
        r2.f35073C = r5;
        goto L_0x0575;
    L_0x0572:
        r5 = r5 + 1;
        goto L_0x0511;
    L_0x0575:
        goto L_0x0586;
    L_0x0576:
        goto L_0x0586;
    L_0x0577:
        if (r12 == 0) goto L_0x0586;
    L_0x0579:
        if (r7 == 0) goto L_0x0586;
    L_0x057b:
        r2 = r0.f45701I;
        r2 = (long) r2;
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r10;
        r2 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x0586;
    L_0x0585:
        r6 = r7;
    L_0x0586:
        r28 = "UNKNOWN";
        r29 = "UNKNOWN";
        r17 = r0;
        r18 = r25;
        r21 = r7;
        r22 = r6;
        r25 = r8;
        r27 = r1;
        X.AnonymousClass3sJ.m21067H(r17, r18, r19, r21, r22, r23, r25, r27, r28, r29);
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3sJ.QH(java.util.List, long, X.2rO[], X.2rP, long, java.util.Map, long, float[], int):void");
    }

    public final void bNA(String str) {
        if (str == null) {
            this.f45710R = null;
        } else if (this.f45714V != null) {
            for (AnonymousClass2rO anonymousClass2rO : this.f45714V) {
                if (str.equals(anonymousClass2rO.f35065N)) {
                    Object[] objArr = new Object[]{str, anonymousClass2rO.f35068Q};
                    this.f45710R = anonymousClass2rO.f35068Q;
                    return;
                }
            }
            new Object[1][0] = str;
            this.f45710R = null;
        }
    }

    public final X.AnonymousClass2rO qLA(java.util.List r19, int r20, long r21, X.AnonymousClass2rO[] r23, X.AnonymousClass2rc r24, boolean r25, X.AnonymousClass3u8 r26, X.AnonymousClass2rO r27, long r28) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r18 = this;
        r11 = r18;
        r0 = r11.f45694B;
        r12 = r21;
        r6 = r23;
        r5 = r27;
        if (r0 == 0) goto L_0x0025;
    L_0x000c:
        r0 = r0.f33502B;
        r0 = r0.f33429B;
        if (r0 == 0) goto L_0x0014;
    L_0x0012:
        r0 = 1;
        goto L_0x0015;
    L_0x0014:
        r0 = 0;
    L_0x0015:
        if (r0 != 0) goto L_0x0025;
    L_0x0017:
        r16 = r5;
        r17 = r6;
        r14 = r28;
        r11.m21069J(r12, r14, r16, r17);
        r0 = X.AnonymousClass2lA.SECOND_PHASE_ONLY;
        X.AnonymousClass3sJ.m21061B(r11, r0);
    L_0x0025:
        r0 = r11.f45715W;
        r4 = 1;
        r10 = 0;
        r7 = r20;
        if (r0 == 0) goto L_0x0035;
    L_0x002d:
        r1 = r7 * 1000;
        r0 = r11.f45700H;
        if (r1 <= r0) goto L_0x0035;
    L_0x0033:
        r9 = 1;
        goto L_0x0036;
    L_0x0035:
        r9 = 0;
    L_0x0036:
        r1 = r11.f45710R;
        r0 = 0;
        if (r1 == 0) goto L_0x003f;
    L_0x003b:
        r11.m21068I(r5);
        return r0;
    L_0x003f:
        r3 = 0;
    L_0x0040:
        r0 = r6.length;
        if (r3 >= r0) goto L_0x00a8;
    L_0x0043:
        r2 = r23[r3];
        r0 = r24;
        r1 = r0.f35101G;
        r0 = r2.f35068Q;
        r8 = r1.get(r0);
        r8 = (X.AnonymousClass2re) r8;
        if (r9 == 0) goto L_0x005c;
    L_0x0053:
        if (r27 == 0) goto L_0x005c;
    L_0x0055:
        r1 = r5.f35055D;
        r0 = r2.f35055D;
        if (r1 <= r0) goto L_0x005c;
    L_0x005b:
        goto L_0x00a5;
    L_0x005c:
        r0 = r8.f35114G;
        if (r0 != 0) goto L_0x0061;
    L_0x0060:
        goto L_0x00a5;
    L_0x0061:
        r18 = r25;
        r14 = r26;
        r15 = r8;
        r16 = r12;
        r0 = r14.m21299B(r15, r16, r18, r19, r20);
        r0 = r8.m17518G(r0);	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        r8 = r0.m17529B();	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        r0 = r11.f45704L;	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        r0 = r0.m17066C();	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        r0 = X.AnonymousClass3sF.m21034C(r0, r8);	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        if (r0 == 0) goto L_0x008d;	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
    L_0x0080:
        r0 = new java.lang.Object[r4];	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        r0[r10] = r8;	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        r0 = X.AnonymousClass2lA.USE_CACHED;	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        X.AnonymousClass3sJ.m21061B(r11, r0);	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
    L_0x0089:
        r11.m21068I(r2);	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        return r2;	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
    L_0x008d:
        r1 = r11.f45712T;	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        r0 = r11.f45704L;	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        r0 = r0.m17066C();	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        r0 = r1.m17023B(r0, r8);	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        if (r0 == 0) goto L_0x00a5;	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
    L_0x009b:
        r0 = new java.lang.Object[r4];	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        r0[r10] = r8;	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        r0 = X.AnonymousClass2lA.USE_CACHED;	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        X.AnonymousClass3sJ.m21061B(r11, r0);	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
        goto L_0x0089;	 Catch:{ 2ra -> 0x00a5, 2ra -> 0x00a5 }
    L_0x00a5:
        r3 = r3 + 1;
        goto L_0x0040;
    L_0x00a8:
        r11.m21068I(r5);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3sJ.qLA(java.util.List, int, long, X.2rO[], X.2rc, boolean, X.3u8, X.2rO, long):X.2rO");
    }

    public final List sK() {
        if (this.f45714V == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (AnonymousClass2rO anonymousClass2rO : this.f45714V) {
            if (anonymousClass2rO.f35065N != null) {
                arrayList.add(anonymousClass2rO.f35065N);
            }
        }
        new Object[1][0] = Integer.valueOf(arrayList.size());
        return arrayList;
    }
}
