package com.google.android.exoplayer.extractor.mp4;

import X.AnonymousClass2qi;
import X.AnonymousClass2sN;
import X.AnonymousClass2sO;
import X.AnonymousClass2sP;
import X.AnonymousClass2sT;
import X.AnonymousClass2sU;
import X.AnonymousClass2sY;
import X.AnonymousClass2sZ;
import X.AnonymousClass2sa;
import X.AnonymousClass2se;
import X.AnonymousClass2sh;
import X.AnonymousClass2sj;
import X.AnonymousClass2sk;
import X.AnonymousClass2sn;
import X.AnonymousClass2td;
import X.AnonymousClass2tu;
import X.AnonymousClass2tw;
import X.AnonymousClass2u6;
import X.AnonymousClass3uW;
import X.AnonymousClass3uX;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public final class Mp4Extractor implements AnonymousClass2sN, AnonymousClass2sY {
    /* renamed from: S */
    private static final int f46522S = AnonymousClass2u6.m17654G("qt  ");
    /* renamed from: B */
    public AnonymousClass2tw f46523B;
    /* renamed from: C */
    public int f46524C;
    /* renamed from: D */
    public long f46525D;
    /* renamed from: E */
    public int f46526E;
    /* renamed from: F */
    public final Stack f46527F;
    /* renamed from: G */
    public AnonymousClass2sP f46528G;
    /* renamed from: H */
    public boolean f46529H;
    /* renamed from: I */
    public int f46530I;
    /* renamed from: J */
    public AnonymousClass2sh[] f46531J;
    /* renamed from: K */
    private final AnonymousClass2tw f46532K;
    /* renamed from: L */
    private int f46533L;
    /* renamed from: M */
    private final boolean f46534M;
    /* renamed from: N */
    private final AnonymousClass2tw f46535N;
    /* renamed from: O */
    private final AnonymousClass2tw f46536O;
    /* renamed from: P */
    private int f46537P;
    /* renamed from: Q */
    private int f46538Q;
    /* renamed from: R */
    private int f46539R;

    public final boolean YY() {
        return true;
    }

    public final void release() {
    }

    public Mp4Extractor() {
        this(true);
    }

    public Mp4Extractor(boolean z) {
        this.f46532K = new AnonymousClass2tw(16);
        this.f46527F = new Stack();
        this.f46536O = new AnonymousClass2tw(AnonymousClass2tu.f35491C);
        this.f46535N = new AnonymousClass2tw(4);
        this.f46534M = z;
        m21392D(this);
    }

    /* renamed from: B */
    public static void m21390B(Mp4Extractor mp4Extractor, long j) {
        while (true) {
            Mp4Extractor mp4Extractor2 = mp4Extractor;
            if (!mp4Extractor2.f46527F.isEmpty() && ((AnonymousClass3uW) mp4Extractor2.f46527F.peek()).f46494C == j) {
                AnonymousClass3uW anonymousClass3uW = (AnonymousClass3uW) mp4Extractor2.f46527F.pop();
                if (anonymousClass3uW.f35278B == AnonymousClass2sa.f35267p) {
                    List arrayList = new ArrayList();
                    AnonymousClass3uX B = anonymousClass3uW.mo4435B(AnonymousClass2sa.aB);
                    AnonymousClass2sT E = B != null ? AnonymousClass2se.m17555E(B, mp4Extractor2.f46529H) : null;
                    long j2 = Long.MAX_VALUE;
                    for (int i = 0; i < anonymousClass3uW.f46493B.size(); i++) {
                        AnonymousClass3uW anonymousClass3uW2 = (AnonymousClass3uW) anonymousClass3uW.f46493B.get(i);
                        if (anonymousClass3uW2.f35278B == AnonymousClass2sa.WB) {
                            AnonymousClass2sk D = AnonymousClass2se.m17554D(anonymousClass3uW2, anonymousClass3uW.mo4435B(AnonymousClass2sa.f35271t), -1, mp4Extractor2.f46529H);
                            if (D != null) {
                                AnonymousClass2sn C = AnonymousClass2se.m17553C(D, anonymousClass3uW2.m21375A(AnonymousClass2sa.f35261j).m21375A(AnonymousClass2sa.f35265n).m21375A(AnonymousClass2sa.JB));
                                if (C.f35337E != 0) {
                                    AnonymousClass2qi anonymousClass2qi;
                                    AnonymousClass2sh anonymousClass2sh = new AnonymousClass2sh(D, C, mp4Extractor2.f46528G.eVA(i));
                                    int i2 = C.f35335C + 30;
                                    AnonymousClass2qi anonymousClass2qi2 = D.f35311E;
                                    String str = anonymousClass2qi2.f34871T;
                                    AnonymousClass2qi anonymousClass2qi3 = new AnonymousClass2qi(str, anonymousClass2qi2.f34866O, anonymousClass2qi2.f34854C, i2, anonymousClass2qi2.f34856E, anonymousClass2qi2.f34872U, anonymousClass2qi2.f34860I, anonymousClass2qi2.f34868Q, anonymousClass2qi2.f34867P, anonymousClass2qi2.f34855D, anonymousClass2qi2.f34869R, anonymousClass2qi2.f34862K, anonymousClass2qi2.f34870S, anonymousClass2qi2.f34861J, anonymousClass2qi2.f34853B, anonymousClass2qi2.f34865N, anonymousClass2qi2.f34863L, anonymousClass2qi2.f34857F, anonymousClass2qi2.f34858G);
                                    if (E != null) {
                                        int i3 = E.f35202B;
                                        int i4 = E.f35203C;
                                        str = anonymousClass2qi3.f34871T;
                                        anonymousClass2qi = new AnonymousClass2qi(str, anonymousClass2qi3.f34866O, anonymousClass2qi3.f34854C, anonymousClass2qi3.f34864M, anonymousClass2qi3.f34856E, anonymousClass2qi3.f34872U, anonymousClass2qi3.f34860I, anonymousClass2qi3.f34868Q, anonymousClass2qi3.f34867P, anonymousClass2qi3.f34855D, anonymousClass2qi3.f34869R, anonymousClass2qi3.f34862K, anonymousClass2qi3.f34870S, anonymousClass2qi3.f34861J, anonymousClass2qi3.f34853B, anonymousClass2qi3.f34865N, anonymousClass2qi3.f34863L, i3, i4);
                                    }
                                    anonymousClass2sh.f35301E.pH(anonymousClass2qi);
                                    arrayList.add(anonymousClass2sh);
                                    long j3 = C.f35336D[0];
                                    if (j3 < j2) {
                                        j2 = j3;
                                    }
                                }
                            }
                        }
                    }
                    mp4Extractor2.f46531J = (AnonymousClass2sh[]) arrayList.toArray(new AnonymousClass2sh[0]);
                    mp4Extractor2.f46528G.MH();
                    mp4Extractor2.f46528G.uLA(mp4Extractor2);
                    mp4Extractor2.f46527F.clear();
                    mp4Extractor2.f46530I = 3;
                } else if (!mp4Extractor2.f46527F.isEmpty()) {
                    ((AnonymousClass3uW) mp4Extractor2.f46527F.peek()).f46493B.add(anonymousClass3uW);
                }
            }
        }
        if (mp4Extractor2.f46530I != 3) {
            m21392D(mp4Extractor2);
        }
    }

    /* renamed from: C */
    public static boolean m21391C(AnonymousClass2tw anonymousClass2tw) {
        anonymousClass2tw.m17638O(8);
        int D = anonymousClass2tw.m17627D();
        int i = f46522S;
        if (D != i) {
            anonymousClass2tw.m17639P(4);
            while (anonymousClass2tw.m17624A() > 0) {
                if (anonymousClass2tw.m17627D() == i) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: D */
    private static void m21392D(Mp4Extractor mp4Extractor) {
        mp4Extractor.f46530I = 1;
        mp4Extractor.f46524C = 0;
    }

    /* renamed from: E */
    private static int m21393E(Mp4Extractor mp4Extractor) {
        AnonymousClass2sh[] anonymousClass2shArr = mp4Extractor.f46531J;
        int i = 0;
        if (anonymousClass2shArr.length == 1) {
            AnonymousClass2sh anonymousClass2sh = anonymousClass2shArr[0];
            return anonymousClass2sh.f35298B == anonymousClass2sh.f35299C.f35337E ? -1 : 0;
        } else {
            long j = Long.MAX_VALUE;
            long j2 = Long.MAX_VALUE;
            int i2 = -1;
            while (true) {
                AnonymousClass2sh[] anonymousClass2shArr2 = mp4Extractor.f46531J;
                if (i >= anonymousClass2shArr2.length) {
                    break;
                }
                AnonymousClass2sh anonymousClass2sh2 = anonymousClass2shArr2[i];
                int i3 = anonymousClass2sh2.f35298B;
                if (i3 != anonymousClass2sh2.f35299C.f35337E) {
                    long j3 = anonymousClass2sh2.f35299C.f35339G[i3];
                    if (j3 < j2) {
                        i2 = i;
                        j2 = j3;
                    }
                    if (i == mp4Extractor.f46533L) {
                        j = j3;
                    }
                } else if (i == mp4Extractor.f46533L) {
                    mp4Extractor.f46533L = -1;
                }
                i++;
            }
            if (mp4Extractor.f46533L != -1) {
                if (j - j2 > 3000000) {
                }
                return mp4Extractor.f46533L;
            }
            mp4Extractor.f46533L = i2;
            return mp4Extractor.f46533L;
        }
    }

    /* renamed from: F */
    private boolean m21394F(AnonymousClass2sO anonymousClass2sO) {
        Object obj;
        long gP;
        if (this.f46524C == 0) {
            if (!anonymousClass2sO.kIA(this.f46532K.f35498B, 0, 8, true)) {
                return false;
            }
            this.f46524C = 8;
            this.f46532K.m17638O(0);
            this.f46525D = this.f46532K.m17632I();
            this.f46526E = this.f46532K.m17627D();
        }
        if (this.f46525D == 1) {
            anonymousClass2sO.readFully(this.f46532K.f35498B, 8, 8);
            this.f46524C += 8;
            this.f46525D = this.f46532K.m17634K();
        }
        int i = this.f46526E;
        if (!(i == AnonymousClass2sa.f35267p || i == AnonymousClass2sa.WB || i == AnonymousClass2sa.f35261j || i == AnonymousClass2sa.f35265n || i == AnonymousClass2sa.JB)) {
            if (i != AnonymousClass2sa.f35246U) {
                obj = null;
                if (obj == null) {
                    gP = (anonymousClass2sO.gP() + this.f46525D) - ((long) this.f46524C);
                    this.f46527F.add(new AnonymousClass3uW(this.f46526E, gP));
                    if (this.f46525D != ((long) this.f46524C)) {
                        m21390B(this, gP);
                    } else {
                        m21392D(this);
                    }
                } else {
                    i = this.f46526E;
                    if (!(i == AnonymousClass2sa.f35260i || i == AnonymousClass2sa.f35271t || i == AnonymousClass2sa.f35254c || i == AnonymousClass2sa.NB || i == AnonymousClass2sa.QB || i == AnonymousClass2sa.OB || i == AnonymousClass2sa.f35235J || i == AnonymousClass2sa.f35247V || i == AnonymousClass2sa.MB || i == AnonymousClass2sa.PB || i == AnonymousClass2sa.KB || i == AnonymousClass2sa.f35234I || i == AnonymousClass2sa.UB || i == AnonymousClass2sa.f35253b)) {
                        if (i == AnonymousClass2sa.aB) {
                            obj = null;
                            if (obj == null) {
                                AnonymousClass2td.m17606E(this.f46524C != 8);
                                AnonymousClass2td.m17606E(this.f46525D > 2147483647L);
                                this.f46523B = new AnonymousClass2tw((int) this.f46525D);
                                System.arraycopy(this.f46532K.f35498B, 0, this.f46523B.f35498B, 0, 8);
                                this.f46530I = 2;
                            } else {
                                this.f46523B = null;
                                this.f46530I = 2;
                            }
                        }
                    }
                    obj = 1;
                    if (obj == null) {
                        this.f46523B = null;
                        this.f46530I = 2;
                    } else {
                        if (this.f46524C != 8) {
                        }
                        AnonymousClass2td.m17606E(this.f46524C != 8);
                        if (this.f46525D > 2147483647L) {
                        }
                        AnonymousClass2td.m17606E(this.f46525D > 2147483647L);
                        this.f46523B = new AnonymousClass2tw((int) this.f46525D);
                        System.arraycopy(this.f46532K.f35498B, 0, this.f46523B.f35498B, 0, 8);
                        this.f46530I = 2;
                    }
                }
                return true;
            }
        }
        obj = 1;
        if (obj == null) {
            i = this.f46526E;
            if (i == AnonymousClass2sa.aB) {
                obj = null;
                if (obj == null) {
                    if (this.f46524C != 8) {
                    }
                    AnonymousClass2td.m17606E(this.f46524C != 8);
                    if (this.f46525D > 2147483647L) {
                    }
                    AnonymousClass2td.m17606E(this.f46525D > 2147483647L);
                    this.f46523B = new AnonymousClass2tw((int) this.f46525D);
                    System.arraycopy(this.f46532K.f35498B, 0, this.f46523B.f35498B, 0, 8);
                    this.f46530I = 2;
                } else {
                    this.f46523B = null;
                    this.f46530I = 2;
                }
            } else {
                obj = 1;
                if (obj == null) {
                    this.f46523B = null;
                    this.f46530I = 2;
                } else {
                    if (this.f46524C != 8) {
                    }
                    AnonymousClass2td.m17606E(this.f46524C != 8);
                    if (this.f46525D > 2147483647L) {
                    }
                    AnonymousClass2td.m17606E(this.f46525D > 2147483647L);
                    this.f46523B = new AnonymousClass2tw((int) this.f46525D);
                    System.arraycopy(this.f46532K.f35498B, 0, this.f46523B.f35498B, 0, 8);
                    this.f46530I = 2;
                }
            }
        } else {
            gP = (anonymousClass2sO.gP() + this.f46525D) - ((long) this.f46524C);
            this.f46527F.add(new AnonymousClass3uW(this.f46526E, gP));
            if (this.f46525D != ((long) this.f46524C)) {
                m21392D(this);
            } else {
                m21390B(this, gP);
            }
        }
        return true;
    }

    /* renamed from: G */
    private int m21395G(AnonymousClass2sO anonymousClass2sO, AnonymousClass2sU anonymousClass2sU) {
        int i;
        long j;
        int i2;
        if (this.f46534M) {
            i = -1;
            j = Long.MAX_VALUE;
            i2 = 0;
            while (true) {
                AnonymousClass2sh[] anonymousClass2shArr = r3.f46531J;
                if (i2 >= anonymousClass2shArr.length) {
                    break;
                }
                AnonymousClass2sh anonymousClass2sh;
                anonymousClass2sh = anonymousClass2shArr[i2];
                int i3 = anonymousClass2sh.f35298B;
                if (i3 != anonymousClass2sh.f35299C.f35337E) {
                    long j2 = anonymousClass2sh.f35299C.f35336D[i3];
                    if (j2 < j) {
                        i = i2;
                        j = j2;
                    }
                }
                i2++;
            }
        } else {
            i = m21393E(r3);
        }
        if (i == -1) {
            return -1;
        }
        anonymousClass2sh = r3.f46531J[i];
        AnonymousClass2sZ anonymousClass2sZ = anonymousClass2sh.f35301E;
        int i4 = anonymousClass2sh.f35298B;
        j = anonymousClass2sh.f35299C.f35336D[i4];
        AnonymousClass2sO anonymousClass2sO2 = anonymousClass2sO;
        long gP = (j - anonymousClass2sO2.gP()) + ((long) r3.f46537P);
        if (gP >= 0) {
            if (gP < 262144) {
                anonymousClass2sO2.MUA((int) gP);
                r3.f46539R = anonymousClass2sh.f35299C.f35338F[i4];
                int i5;
                if (anonymousClass2sh.f35300D.f35313G == -1) {
                    while (true) {
                        i2 = r3.f46537P;
                        i5 = r3.f46539R;
                        if (i2 >= i5) {
                            break;
                        }
                        i2 = anonymousClass2sZ.bLA(anonymousClass2sO2, i5 - i2, false);
                        r3.f46537P += i2;
                        r3.f46538Q -= i2;
                    }
                } else {
                    byte[] bArr = r3.f46535N.f35498B;
                    bArr[0] = (byte) 0;
                    bArr[1] = (byte) 0;
                    bArr[2] = (byte) 0;
                    int i6 = anonymousClass2sh.f35300D.f35313G;
                    i = 4 - anonymousClass2sh.f35300D.f35313G;
                    while (r3.f46537P < r3.f46539R) {
                        i5 = r3.f46538Q;
                        if (i5 == 0) {
                            anonymousClass2sO2.readFully(r3.f46535N.f35498B, i, i6);
                            r3.f46535N.m17638O(0);
                            r3.f46538Q = r3.f46535N.m17633J();
                            r3.f46536O.m17638O(0);
                            anonymousClass2sZ.dLA(r3.f46536O, 4);
                            r3.f46537P += 4;
                            r3.f46539R += i;
                        } else {
                            i2 = anonymousClass2sZ.bLA(anonymousClass2sO2, i5, false);
                            r3.f46537P += i2;
                            r3.f46538Q -= i2;
                        }
                    }
                }
                anonymousClass2sZ.gLA(anonymousClass2sh.f35299C.f35339G[i4], anonymousClass2sh.f35299C.f35334B[i4], r3.f46539R, null, null);
                anonymousClass2sh.f35298B++;
                r3.f46537P = 0;
                r3.f46538Q = 0;
                return 0;
            }
        }
        anonymousClass2sU.f35204B = j;
        return 1;
    }

    public final boolean PUA(AnonymousClass2sO anonymousClass2sO) {
        return AnonymousClass2sj.m17570B(anonymousClass2sO, 128, false);
    }

    public final int bIA(AnonymousClass2sO anonymousClass2sO, AnonymousClass2sU anonymousClass2sU) {
        while (true) {
            switch (this.f46530I) {
                case 0:
                    if (anonymousClass2sO.gP() != 0) {
                        this.f46530I = 3;
                        break;
                    }
                    m21392D(this);
                    break;
                case 1:
                    if (m21394F(anonymousClass2sO)) {
                        break;
                    }
                    return -1;
                case 2:
                    Object obj;
                    long j = this.f46525D - ((long) this.f46524C);
                    long gP = anonymousClass2sO.gP() + j;
                    AnonymousClass2tw anonymousClass2tw = this.f46523B;
                    Object obj2 = 1;
                    if (anonymousClass2tw == null) {
                        if (j >= 262144) {
                            anonymousClass2sU.f35204B = anonymousClass2sO.gP() + j;
                            obj = 1;
                            m21390B(this, gP);
                            if (obj != null || this.f46530I == 3) {
                                obj2 = null;
                            }
                            if (obj2 == null) {
                                break;
                            }
                            return 1;
                        }
                        anonymousClass2sO.MUA((int) j);
                    } else {
                        anonymousClass2sO.readFully(anonymousClass2tw.f35498B, this.f46524C, (int) j);
                        if (this.f46526E == AnonymousClass2sa.f35253b) {
                            this.f46529H = m21391C(this.f46523B);
                        } else if (!this.f46527F.isEmpty()) {
                            AnonymousClass3uW anonymousClass3uW = (AnonymousClass3uW) this.f46527F.peek();
                            anonymousClass3uW.f46495D.add(new AnonymousClass3uX(this.f46526E, this.f46523B));
                        }
                    }
                    obj = null;
                    m21390B(this, gP);
                    if (obj != null) {
                        break;
                    }
                    obj2 = null;
                    if (obj2 == null) {
                        return 1;
                    }
                default:
                    return m21395G(anonymousClass2sO, anonymousClass2sU);
            }
        }
    }

    public final long hP(long j) {
        long j2 = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            AnonymousClass2sh[] anonymousClass2shArr = this.f46531J;
            if (i >= anonymousClass2shArr.length) {
                return j2;
            }
            AnonymousClass2sn anonymousClass2sn = anonymousClass2shArr[i].f35299C;
            int A = anonymousClass2sn.m17573A(j);
            if (A == -1) {
                A = anonymousClass2sn.m17574B(j);
            }
            this.f46531J[i].f35298B = A;
            long j3 = anonymousClass2sn.f35336D[A];
            if (j3 < j2) {
                j2 = j3;
            }
            i++;
        }
    }

    public final void sLA() {
        this.f46527F.clear();
        this.f46524C = 0;
        this.f46537P = 0;
        this.f46538Q = 0;
        this.f46530I = 0;
    }

    public final void zV(AnonymousClass2sP anonymousClass2sP) {
        this.f46528G = anonymousClass2sP;
    }
}
