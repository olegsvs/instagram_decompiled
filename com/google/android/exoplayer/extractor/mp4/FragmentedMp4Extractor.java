package com.google.android.exoplayer.extractor.mp4;

import X.AnonymousClass2qk;
import X.AnonymousClass2rz;
import X.AnonymousClass2s0;
import X.AnonymousClass2sN;
import X.AnonymousClass2sO;
import X.AnonymousClass2sP;
import X.AnonymousClass2sU;
import X.AnonymousClass2sY;
import X.AnonymousClass2sZ;
import X.AnonymousClass2sa;
import X.AnonymousClass2se;
import X.AnonymousClass2sf;
import X.AnonymousClass2sg;
import X.AnonymousClass2si;
import X.AnonymousClass2sj;
import X.AnonymousClass2sk;
import X.AnonymousClass2sl;
import X.AnonymousClass2sm;
import X.AnonymousClass2so;
import X.AnonymousClass2t2;
import X.AnonymousClass2td;
import X.AnonymousClass2tu;
import X.AnonymousClass2tw;
import X.AnonymousClass2u6;
import X.AnonymousClass3uH;
import X.AnonymousClass3uP;
import X.AnonymousClass3uW;
import X.AnonymousClass3uX;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.common.dextricks.DexStore;
import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public final class FragmentedMp4Extractor implements AnonymousClass2sN {
    /* renamed from: Y */
    private static final byte[] f46497Y = new byte[]{(byte) -94, (byte) 57, (byte) 79, (byte) 82, (byte) 90, (byte) -101, (byte) 79, (byte) 20, (byte) -94, (byte) 68, (byte) 108, (byte) 66, (byte) 124, (byte) 100, (byte) -115, (byte) -12};
    /* renamed from: Z */
    private static final int f46498Z = AnonymousClass2u6.m17654G("seig");
    /* renamed from: B */
    public AnonymousClass2tw f46499B;
    /* renamed from: C */
    public int f46500C;
    /* renamed from: D */
    public long f46501D;
    /* renamed from: E */
    public int f46502E;
    /* renamed from: F */
    public final Stack f46503F;
    /* renamed from: G */
    public final byte[] f46504G;
    /* renamed from: H */
    public AnonymousClass2sP f46505H;
    /* renamed from: I */
    public final int f46506I;
    /* renamed from: J */
    public boolean f46507J;
    /* renamed from: K */
    public final AnonymousClass2sk f46508K;
    /* renamed from: L */
    public final SparseArray f46509L;
    /* renamed from: M */
    private final AnonymousClass2tw f46510M;
    /* renamed from: N */
    private AnonymousClass2sg f46511N;
    /* renamed from: O */
    private final AnonymousClass2tw f46512O;
    /* renamed from: P */
    private long f46513P;
    /* renamed from: Q */
    private final AnonymousClass2tw f46514Q;
    /* renamed from: R */
    private final AnonymousClass2tw f46515R;
    /* renamed from: S */
    private final AnonymousClass2tw f46516S;
    /* renamed from: T */
    private int f46517T;
    /* renamed from: U */
    private int f46518U;
    /* renamed from: V */
    private int f46519V;
    /* renamed from: W */
    private int f46520W;
    /* renamed from: X */
    private AnonymousClass2so f46521X;

    public final void release() {
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    public FragmentedMp4Extractor(int i) {
        this(i, null);
    }

    public FragmentedMp4Extractor(int i, AnonymousClass2sk anonymousClass2sk) {
        this.f46508K = anonymousClass2sk;
        this.f46506I = i | (anonymousClass2sk != null ? 16 : 0);
        this.f46510M = new AnonymousClass2tw(16);
        this.f46516S = new AnonymousClass2tw(AnonymousClass2tu.f35491C);
        this.f46514Q = new AnonymousClass2tw(4);
        this.f46515R = new AnonymousClass2tw(1);
        this.f46512O = new AnonymousClass2tw(1);
        this.f46504G = new byte[16];
        this.f46503F = new Stack();
        this.f46509L = new SparseArray();
        m21383H(this);
    }

    public FragmentedMp4Extractor(boolean z) {
        this(z ? 8 : 0, null);
    }

    /* renamed from: B */
    public static AnonymousClass3uH m21377B(List list) {
        int size = list.size();
        AnonymousClass3uH anonymousClass3uH = null;
        for (int i = 0; i < size; i++) {
            AnonymousClass3uX anonymousClass3uX = (AnonymousClass3uX) list.get(i);
            if (anonymousClass3uX.f35278B == AnonymousClass2sa.f35274w) {
                if (anonymousClass3uH == null) {
                    anonymousClass3uH = new AnonymousClass3uH();
                }
                byte[] bArr = anonymousClass3uX.f46496B.f35498B;
                if (AnonymousClass2si.m17568C(bArr) == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    anonymousClass3uH.m21348A(AnonymousClass2si.m17568C(bArr), new AnonymousClass2rz("video/mp4", bArr));
                }
            }
        }
        return anonymousClass3uH;
    }

    /* renamed from: C */
    public static void m21378C(FragmentedMp4Extractor fragmentedMp4Extractor) {
        if ((fragmentedMp4Extractor.f46506I & 8) != 0 && fragmentedMp4Extractor.f46521X == null) {
            AnonymousClass2sZ eVA = fragmentedMp4Extractor.f46505H.eVA(fragmentedMp4Extractor.f46509L.size());
            if (eVA != null) {
                fragmentedMp4Extractor.f46521X = new AnonymousClass2so(eVA);
            }
        }
    }

    /* renamed from: D */
    public static void m21379D(AnonymousClass2tw anonymousClass2tw, int i, AnonymousClass2sm anonymousClass2sm) {
        anonymousClass2tw.m17638O(i + 8);
        int C = AnonymousClass2sa.m17550C(anonymousClass2tw.m17627D());
        if ((C & 1) == 0) {
            boolean z = (C & 2) != 0;
            int J = anonymousClass2tw.m17633J();
            if (J == anonymousClass2sm.f35323F) {
                Arrays.fill(anonymousClass2sm.f35330M, 0, J, z);
                anonymousClass2sm.m17572A(anonymousClass2tw.m17624A());
                anonymousClass2tw.m17626C(anonymousClass2sm.f35327J.f35498B, 0, anonymousClass2sm.f35328K);
                anonymousClass2sm.f35327J.m17638O(0);
                anonymousClass2sm.f35329L = false;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Length mismatch: ");
            stringBuilder.append(J);
            stringBuilder.append(", ");
            stringBuilder.append(anonymousClass2sm.f35323F);
            throw new AnonymousClass2qk(stringBuilder.toString());
        }
        throw new AnonymousClass2qk("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: E */
    public static void m21380E(AnonymousClass3uW anonymousClass3uW, SparseArray sparseArray, int i, byte[] bArr) {
        int i2;
        int i3;
        int i4 = AnonymousClass2sa.YB;
        AnonymousClass3uW anonymousClass3uW2 = anonymousClass3uW;
        int size = anonymousClass3uW2.f46495D.size();
        int i5 = 0;
        for (i2 = 0; i2 < size; i2++) {
            if (((AnonymousClass3uX) anonymousClass3uW2.f46495D.get(i2)).f35278B == i4) {
                i5++;
            }
        }
        i2 = anonymousClass3uW2.f46493B.size();
        for (i3 = 0; i3 < i2; i3++) {
            if (((AnonymousClass3uW) anonymousClass3uW2.f46493B.get(i3)).f35278B == i4) {
                i5++;
            }
        }
        if (i5 == 1) {
            int i6 = i;
            AnonymousClass2sg J = m21385J(anonymousClass3uW2.mo4435B(AnonymousClass2sa.TB).f46496B, sparseArray, i6);
            if (J != null) {
                StringBuilder stringBuilder;
                AnonymousClass2sm anonymousClass2sm = J.f35295D;
                long j = anonymousClass2sm.f35324G;
                J.m17566B();
                if (anonymousClass3uW2.mo4435B(AnonymousClass2sa.SB) != null && (i & 2) == 0) {
                    AnonymousClass2tw anonymousClass2tw = anonymousClass3uW2.mo4435B(AnonymousClass2sa.SB).f46496B;
                    anonymousClass2tw.m17638O(8);
                    j = AnonymousClass2sa.m17551D(anonymousClass2tw.m17627D()) == 1 ? anonymousClass2tw.m17634K() : anonymousClass2tw.m17632I();
                }
                AnonymousClass2tw anonymousClass2tw2 = anonymousClass3uW2.mo4435B(i4).f46496B;
                i = anonymousClass2tw2;
                anonymousClass2tw2.m17638O(8);
                int C = AnonymousClass2sa.m17550C(i.m17627D());
                AnonymousClass2sk anonymousClass2sk = J.f35297F;
                AnonymousClass2sm anonymousClass2sm2 = J.f35295D;
                AnonymousClass2sf anonymousClass2sf = anonymousClass2sm2.f35322E;
                int J2 = i.m17633J();
                if ((C & 1) != 0) {
                    anonymousClass2sm2.f35320C += (long) i.m17627D();
                }
                Object obj = (C & 4) != 0 ? 1 : null;
                int i7 = anonymousClass2sf.f35290C;
                if (obj != null) {
                    i7 = i.m17633J();
                }
                Object obj2 = (C & 256) != 0 ? 1 : null;
                Object obj3 = (C & DexStore.LOAD_RESULT_DEX2OAT_QUICKENED) != 0 ? 1 : null;
                Object obj4 = (C & DexStore.LOAD_RESULT_MIXED_MODE) != 0 ? 1 : null;
                Object obj5 = (C & DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED) != 0 ? 1 : null;
                long j2 = 0;
                if (anonymousClass2sk.f35308B != null && anonymousClass2sk.f35308B.length == 1 && anonymousClass2sk.f35308B[0] == 0) {
                    j2 = AnonymousClass2u6.m17659L(anonymousClass2sk.f35309C[0], 1000, anonymousClass2sk.f35315I);
                }
                anonymousClass2sm2.f35323F = J2;
                int[] iArr = anonymousClass2sm2.f35332O;
                if (iArr == null || iArr.length < anonymousClass2sm2.f35323F) {
                    i2 = (J2 * ParserMinimalBase.INT_RCURLY) / 100;
                    anonymousClass2sm2.f35332O = new int[i2];
                    anonymousClass2sm2.f35325H = new int[i2];
                    anonymousClass2sm2.f35326I = new long[i2];
                    anonymousClass2sm2.f35331N = new boolean[i2];
                    anonymousClass2sm2.f35330M = new boolean[i2];
                }
                int[] iArr2 = anonymousClass2sm2.f35332O;
                int[] iArr3 = anonymousClass2sm2.f35325H;
                long[] jArr = anonymousClass2sm2.f35326I;
                boolean[] zArr = anonymousClass2sm2.f35331N;
                long j3 = anonymousClass2sk.f35315I;
                Object obj6 = (anonymousClass2sk.f35316J != AnonymousClass2sk.f35307O || (i6 & 1) == 0) ? null : 1;
                int i8 = 0;
                while (i8 < J2) {
                    C = obj2 != null ? i.m17633J() : anonymousClass2sf.f35289B;
                    i6 = obj3 != null ? i.m17633J() : anonymousClass2sf.f35292E;
                    i4 = (i8 != 0 || obj == null) ? obj4 != null ? i.m17627D() : anonymousClass2sf.f35290C : i7;
                    if (obj5 != null) {
                        iArr3[i8] = (int) (((long) (i.m17627D() * JsonMappingException.MAX_REFS_TO_LIST)) / j3);
                    } else {
                        obj5 = null;
                        iArr3[i8] = 0;
                    }
                    jArr[i8] = AnonymousClass2u6.m17659L(j, 1000, j3) - j2;
                    iArr2[i8] = i6;
                    boolean z = ((i4 >> 16) & 1) == 0 && (obj6 == null || i8 == 0);
                    zArr[i8] = z;
                    i8++;
                    j = ((long) C) + j;
                }
                anonymousClass2sm2.f35324G = j;
                AnonymousClass3uX B = anonymousClass3uW2.mo4435B(AnonymousClass2sa.f35277z);
                if (B != null) {
                    AnonymousClass2sl anonymousClass2sl = J.f35297F.f35314H[anonymousClass2sm.f35322E.f35291D];
                    AnonymousClass2tw anonymousClass2tw3 = B.f46496B;
                    size = anonymousClass2sl.f35317B;
                    anonymousClass2tw3.m17638O(8);
                    boolean z2 = true;
                    if ((AnonymousClass2sa.m17550C(anonymousClass2tw3.m17627D()) & 1) == 1) {
                        anonymousClass2tw3.m17639P(8);
                    }
                    i3 = anonymousClass2tw3.m17631H();
                    i4 = anonymousClass2tw3.m17633J();
                    if (i4 == anonymousClass2sm.f35323F) {
                        if (i3 == 0) {
                            boolean[] zArr2 = anonymousClass2sm.f35330M;
                            i3 = 0;
                            for (i2 = 0; i2 < i4; i2++) {
                                int H = anonymousClass2tw3.m17631H();
                                i3 += H;
                                zArr2[i2] = H > size;
                            }
                        } else {
                            if (i3 <= size) {
                                z2 = false;
                            }
                            i3 *= i4;
                            Arrays.fill(anonymousClass2sm.f35330M, 0, i4, z2);
                        }
                        anonymousClass2sm.m17572A(i3);
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Length mismatch: ");
                        stringBuilder.append(i4);
                        stringBuilder.append(", ");
                        stringBuilder.append(anonymousClass2sm.f35323F);
                        throw new AnonymousClass2qk(stringBuilder.toString());
                    }
                }
                AnonymousClass3uX B2 = anonymousClass3uW2.mo4435B(AnonymousClass2sa.f35276y);
                if (B2 != null) {
                    AnonymousClass2tw anonymousClass2tw4 = B2.f46496B;
                    anonymousClass2tw4.m17638O(8);
                    i5 = anonymousClass2tw4.m17627D();
                    if ((AnonymousClass2sa.m17550C(i5) & 1) == 1) {
                        anonymousClass2tw4.m17639P(8);
                    }
                    i4 = anonymousClass2tw4.m17633J();
                    if (i4 == 1) {
                        anonymousClass2sm.f35319B += AnonymousClass2sa.m17551D(i5) == 0 ? anonymousClass2tw4.m17632I() : anonymousClass2tw4.m17634K();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected saio entry count: ");
                        stringBuilder.append(i4);
                        throw new AnonymousClass2qk(stringBuilder.toString());
                    }
                }
                B2 = anonymousClass3uW2.mo4435B(AnonymousClass2sa.FB);
                if (B2 != null) {
                    m21379D(B2.f46496B, 0, anonymousClass2sm);
                }
                AnonymousClass3uX B3 = anonymousClass3uW2.mo4435B(AnonymousClass2sa.CB);
                B2 = anonymousClass3uW2.mo4435B(AnonymousClass2sa.GB);
                if (!(B3 == null || B2 == null)) {
                    m21384I(B3.f46496B, B2.f46496B, anonymousClass2sm);
                }
                i3 = anonymousClass3uW2.f46495D.size();
                for (i4 = 0; i4 < i3; i4++) {
                    B = (AnonymousClass3uX) anonymousClass3uW2.f46495D.get(i4);
                    if (B.f35278B == AnonymousClass2sa.bB) {
                        m21386K(B.f46496B, anonymousClass2sm, bArr);
                    }
                }
                return;
            }
            return;
        }
        throw new AnonymousClass2qk("Trun count in traf != 1 (unsupported).");
    }

    /* renamed from: F */
    public static void m21381F(FragmentedMp4Extractor fragmentedMp4Extractor, long j) {
        FragmentedMp4Extractor fragmentedMp4Extractor2;
        while (true) {
            fragmentedMp4Extractor2 = fragmentedMp4Extractor;
            if (fragmentedMp4Extractor2.f46503F.isEmpty() || ((AnonymousClass3uW) fragmentedMp4Extractor2.f46503F.peek()).f46494C != j) {
                m21383H(fragmentedMp4Extractor2);
            } else {
                AnonymousClass3uW anonymousClass3uW = (AnonymousClass3uW) fragmentedMp4Extractor2.f46503F.pop();
                AnonymousClass2s0 B;
                int size;
                int size2;
                if (anonymousClass3uW.f35278B == AnonymousClass2sa.f35267p) {
                    boolean z = true;
                    int i = 0;
                    String str = "Unexpected moov box.";
                    if ((fragmentedMp4Extractor2.f46508K == null ? 1 : null) != null) {
                        B = m21377B(anonymousClass3uW.f46495D);
                        if (B != null) {
                            fragmentedMp4Extractor2.f46505H.uG(B);
                        }
                        AnonymousClass3uW A = anonymousClass3uW.m21375A(AnonymousClass2sa.f35270s);
                        SparseArray sparseArray = new SparseArray();
                        int size3 = A.f46495D.size();
                        long j2 = -1;
                        for (int i2 = 0; i2 < size3; i2++) {
                            AnonymousClass3uX anonymousClass3uX = (AnonymousClass3uX) A.f46495D.get(i2);
                            if (anonymousClass3uX.f35278B == AnonymousClass2sa.XB) {
                                AnonymousClass2tw anonymousClass2tw = anonymousClass3uX.f46496B;
                                anonymousClass2tw.m17638O(12);
                                Pair create = Pair.create(Integer.valueOf(anonymousClass2tw.m17627D()), new AnonymousClass2sf(anonymousClass2tw.m17633J() - 1, anonymousClass2tw.m17633J(), anonymousClass2tw.m17633J(), anonymousClass2tw.m17627D()));
                                sparseArray.put(((Integer) create.first).intValue(), create.second);
                            } else if (anonymousClass3uX.f35278B == AnonymousClass2sa.f35263l) {
                                AnonymousClass2tw anonymousClass2tw2 = anonymousClass3uX.f46496B;
                                anonymousClass2tw2.m17638O(8);
                                j2 = AnonymousClass2sa.m17551D(anonymousClass2tw2.m17627D()) == 0 ? anonymousClass2tw2.m17632I() : anonymousClass2tw2.m17634K();
                            }
                        }
                        SparseArray sparseArray2 = new SparseArray();
                        size = anonymousClass3uW.f46493B.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            AnonymousClass3uW anonymousClass3uW2 = (AnonymousClass3uW) anonymousClass3uW.f46493B.get(i3);
                            if (anonymousClass3uW2.f35278B == AnonymousClass2sa.WB) {
                                AnonymousClass2sk D = AnonymousClass2se.m17554D(anonymousClass3uW2, anonymousClass3uW.mo4435B(AnonymousClass2sa.f35271t), j2, false);
                                if (D != null) {
                                    sparseArray2.put(D.f35310D, D);
                                }
                            }
                        }
                        size2 = sparseArray2.size();
                        if (fragmentedMp4Extractor2.f46509L.size() == 0) {
                            for (size = 0; size < size2; size++) {
                                fragmentedMp4Extractor2.f46509L.put(((AnonymousClass2sk) sparseArray2.valueAt(size)).f35310D, new AnonymousClass2sg(fragmentedMp4Extractor2.f46505H.eVA(size)));
                            }
                            m21378C(fragmentedMp4Extractor2);
                            fragmentedMp4Extractor2.f46505H.MH();
                        } else {
                            if (fragmentedMp4Extractor2.f46509L.size() != size2) {
                                z = false;
                            }
                            AnonymousClass2td.m17606E(z);
                        }
                        while (i < size2) {
                            AnonymousClass2sk anonymousClass2sk = (AnonymousClass2sk) sparseArray2.valueAt(i);
                            ((AnonymousClass2sg) fragmentedMp4Extractor2.f46509L.get(anonymousClass2sk.f35310D)).m17565A(anonymousClass2sk, (AnonymousClass2sf) sparseArray.get(anonymousClass2sk.f35310D));
                            i++;
                        }
                    } else {
                        throw new IllegalStateException(String.valueOf(str));
                    }
                } else if (anonymousClass3uW.f35278B == AnonymousClass2sa.f35266o) {
                    SparseArray sparseArray3 = fragmentedMp4Extractor2.f46509L;
                    size = fragmentedMp4Extractor2.f46506I;
                    byte[] bArr = fragmentedMp4Extractor2.f46504G;
                    size2 = anonymousClass3uW.f46493B.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        AnonymousClass3uW anonymousClass3uW3 = (AnonymousClass3uW) anonymousClass3uW.f46493B.get(i4);
                        if (anonymousClass3uW3.f35278B == AnonymousClass2sa.VB) {
                            m21380E(anonymousClass3uW3, sparseArray3, size, bArr);
                        }
                    }
                    B = m21377B(anonymousClass3uW.f46495D);
                    if (B != null) {
                        fragmentedMp4Extractor2.f46505H.uG(B);
                    }
                } else if (!fragmentedMp4Extractor2.f46503F.isEmpty()) {
                    ((AnonymousClass3uW) fragmentedMp4Extractor2.f46503F.peek()).f46493B.add(anonymousClass3uW);
                }
            }
        }
        m21383H(fragmentedMp4Extractor2);
    }

    /* renamed from: G */
    private static int m21382G(FragmentedMp4Extractor fragmentedMp4Extractor, AnonymousClass2sg anonymousClass2sg) {
        AnonymousClass2sm anonymousClass2sm = anonymousClass2sg.f35295D;
        AnonymousClass2tw anonymousClass2tw = anonymousClass2sm.f35327J;
        int i = (anonymousClass2sm.f35333P != null ? anonymousClass2sm.f35333P : anonymousClass2sg.f35297F.f35314H[anonymousClass2sm.f35322E.f35291D]).f35317B;
        boolean z = anonymousClass2sm.f35330M[anonymousClass2sg.f35293B];
        fragmentedMp4Extractor.f46512O.f35498B[0] = (byte) ((z ? 128 : 0) | i);
        fragmentedMp4Extractor.f46512O.m17638O(0);
        AnonymousClass2sZ anonymousClass2sZ = anonymousClass2sg.f35296E;
        anonymousClass2sZ.dLA(fragmentedMp4Extractor.f46512O, 1);
        anonymousClass2sZ.dLA(anonymousClass2tw, i);
        if (!z) {
            return i + 1;
        }
        int L = anonymousClass2tw.m17635L();
        anonymousClass2tw.m17639P(-2);
        int i2 = (L * 6) + 2;
        anonymousClass2sZ.dLA(anonymousClass2tw, i2);
        return (i + 1) + i2;
    }

    /* renamed from: H */
    private static void m21383H(FragmentedMp4Extractor fragmentedMp4Extractor) {
        fragmentedMp4Extractor.f46517T = 0;
        fragmentedMp4Extractor.f46500C = 0;
    }

    /* renamed from: I */
    private static void m21384I(AnonymousClass2tw anonymousClass2tw, AnonymousClass2tw anonymousClass2tw2, AnonymousClass2sm anonymousClass2sm) {
        anonymousClass2tw.m17638O(8);
        int D = anonymousClass2tw.m17627D();
        if (anonymousClass2tw.m17627D() == f46498Z) {
            if (AnonymousClass2sa.m17551D(D) == 1) {
                anonymousClass2tw.m17639P(4);
            }
            if (anonymousClass2tw.m17627D() == 1) {
                anonymousClass2tw2.m17638O(8);
                D = anonymousClass2tw2.m17627D();
                if (anonymousClass2tw2.m17627D() == f46498Z) {
                    int D2 = AnonymousClass2sa.m17551D(D);
                    if (D2 == 1) {
                        if (anonymousClass2tw2.m17632I() == 0) {
                            throw new AnonymousClass2qk("Variable length decription in sgpd found (unsupported)");
                        }
                    } else if (D2 >= 2) {
                        anonymousClass2tw2.m17639P(4);
                    }
                    if (anonymousClass2tw2.m17632I() == 1) {
                        anonymousClass2tw2.m17639P(2);
                        boolean z = anonymousClass2tw2.m17631H() == 1;
                        if (z) {
                            D = anonymousClass2tw2.m17631H();
                            byte[] bArr = new byte[16];
                            anonymousClass2tw2.m17626C(bArr, 0, bArr.length);
                            anonymousClass2sm.f35321D = true;
                            anonymousClass2sm.f35333P = new AnonymousClass2sl(z, D, bArr);
                        }
                    } else {
                        throw new AnonymousClass2qk("Entry count in sgpd != 1 (unsupported).");
                    }
                }
            } else {
                throw new AnonymousClass2qk("Entry count in sbgp != 1 (unsupported).");
            }
        }
    }

    /* renamed from: J */
    private static AnonymousClass2sg m21385J(AnonymousClass2tw anonymousClass2tw, SparseArray sparseArray, int i) {
        anonymousClass2tw.m17638O(8);
        int C = AnonymousClass2sa.m17550C(anonymousClass2tw.m17627D());
        int D = anonymousClass2tw.m17627D();
        if ((i & 16) != 0) {
            D = 0;
        }
        AnonymousClass2sg anonymousClass2sg = (AnonymousClass2sg) sparseArray.get(D);
        if (anonymousClass2sg == null) {
            return null;
        }
        if ((C & 1) != 0) {
            long K = anonymousClass2tw.m17634K();
            anonymousClass2sg.f35295D.f35320C = K;
            anonymousClass2sg.f35295D.f35319B = K;
        }
        AnonymousClass2sf anonymousClass2sf = anonymousClass2sg.f35294C;
        anonymousClass2sg.f35295D.f35322E = new AnonymousClass2sf((C & 2) != 0 ? anonymousClass2tw.m17633J() - 1 : anonymousClass2sf.f35291D, (C & 8) != 0 ? anonymousClass2tw.m17633J() : anonymousClass2sf.f35289B, (C & 16) != 0 ? anonymousClass2tw.m17633J() : anonymousClass2sf.f35292E, (C & 32) != 0 ? anonymousClass2tw.m17633J() : anonymousClass2sf.f35290C);
        return anonymousClass2sg;
    }

    /* renamed from: K */
    private static void m21386K(AnonymousClass2tw anonymousClass2tw, AnonymousClass2sm anonymousClass2sm, byte[] bArr) {
        anonymousClass2tw.m17638O(8);
        anonymousClass2tw.m17626C(bArr, 0, 16);
        if (Arrays.equals(bArr, f46497Y)) {
            m21379D(anonymousClass2tw, 16, anonymousClass2sm);
        }
    }

    /* renamed from: L */
    private boolean m21387L(AnonymousClass2sO anonymousClass2sO) {
        int i;
        if (this.f46500C == 0) {
            if (!anonymousClass2sO.kIA(this.f46510M.f35498B, 0, 8, true)) {
                return false;
            }
            this.f46500C = 8;
            this.f46510M.m17638O(0);
            this.f46501D = this.f46510M.m17632I();
            this.f46502E = this.f46510M.m17627D();
        }
        if (this.f46501D == 1) {
            anonymousClass2sO.readFully(this.f46510M.f35498B, 8, 8);
            this.f46500C += 8;
            this.f46501D = this.f46510M.m17634K();
        }
        long gP = anonymousClass2sO.gP() - ((long) this.f46500C);
        if (this.f46502E == AnonymousClass2sa.f35266o) {
            int size = this.f46509L.size();
            for (i = 0; i < size; i++) {
                AnonymousClass2sm anonymousClass2sm = ((AnonymousClass2sg) this.f46509L.valueAt(i)).f35295D;
                anonymousClass2sm.f35319B = gP;
                anonymousClass2sm.f35320C = gP;
            }
        }
        if (this.f46502E == AnonymousClass2sa.f35259h) {
            this.f46511N = null;
            this.f46513P = gP + this.f46501D;
            if (!this.f46507J) {
                this.f46505H.uLA(AnonymousClass2sY.f35227B);
                this.f46507J = true;
            }
            this.f46517T = 2;
            return true;
        }
        Object obj;
        i = this.f46502E;
        if (!(i == AnonymousClass2sa.f35267p || i == AnonymousClass2sa.WB || i == AnonymousClass2sa.f35261j || i == AnonymousClass2sa.f35265n || i == AnonymousClass2sa.JB || i == AnonymousClass2sa.f35266o || i == AnonymousClass2sa.VB || i == AnonymousClass2sa.f35270s)) {
            if (i != AnonymousClass2sa.f35246U) {
                obj = null;
                if (obj == null) {
                    gP = (anonymousClass2sO.gP() + this.f46501D) - 8;
                    this.f46503F.add(new AnonymousClass3uW(this.f46502E, gP));
                    if (this.f46501D != ((long) this.f46500C)) {
                        m21381F(this, gP);
                    } else {
                        m21383H(this);
                    }
                } else {
                    i = this.f46502E;
                    if (!(i == AnonymousClass2sa.f35254c || i == AnonymousClass2sa.f35260i || i == AnonymousClass2sa.f35271t || i == AnonymousClass2sa.HB || i == AnonymousClass2sa.NB || i == AnonymousClass2sa.SB || i == AnonymousClass2sa.TB || i == AnonymousClass2sa.UB || i == AnonymousClass2sa.XB || i == AnonymousClass2sa.YB || i == AnonymousClass2sa.f35274w || i == AnonymousClass2sa.f35277z || i == AnonymousClass2sa.f35276y || i == AnonymousClass2sa.FB || i == AnonymousClass2sa.CB || i == AnonymousClass2sa.GB || i == AnonymousClass2sa.bB || i == AnonymousClass2sa.f35247V || i == AnonymousClass2sa.f35263l)) {
                        if (i == AnonymousClass2sa.f35248W) {
                            obj = null;
                            if (obj == null) {
                                if (this.f46500C != 8) {
                                    gP = this.f46501D;
                                    if (gP > 2147483647L) {
                                        this.f46499B = new AnonymousClass2tw((int) gP);
                                        System.arraycopy(this.f46510M.f35498B, 0, this.f46499B.f35498B, 0, 8);
                                        this.f46517T = 1;
                                    } else {
                                        throw new AnonymousClass2qk("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                }
                                throw new AnonymousClass2qk("Leaf atom defines extended atom size (unsupported).");
                            } else if (this.f46501D > 2147483647L) {
                                this.f46499B = null;
                                this.f46517T = 1;
                            } else {
                                throw new AnonymousClass2qk("Skipping atom with length > 2147483647 (unsupported).");
                            }
                        }
                    }
                    obj = 1;
                    if (obj == null) {
                        if (this.f46501D > 2147483647L) {
                            throw new AnonymousClass2qk("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f46499B = null;
                        this.f46517T = 1;
                    } else if (this.f46500C != 8) {
                        throw new AnonymousClass2qk("Leaf atom defines extended atom size (unsupported).");
                    } else {
                        gP = this.f46501D;
                        if (gP > 2147483647L) {
                            throw new AnonymousClass2qk("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        this.f46499B = new AnonymousClass2tw((int) gP);
                        System.arraycopy(this.f46510M.f35498B, 0, this.f46499B.f35498B, 0, 8);
                        this.f46517T = 1;
                    }
                }
                return true;
            }
        }
        obj = 1;
        if (obj == null) {
            i = this.f46502E;
            if (i == AnonymousClass2sa.f35248W) {
                obj = null;
                if (obj == null) {
                    if (this.f46500C != 8) {
                        gP = this.f46501D;
                        if (gP > 2147483647L) {
                            this.f46499B = new AnonymousClass2tw((int) gP);
                            System.arraycopy(this.f46510M.f35498B, 0, this.f46499B.f35498B, 0, 8);
                            this.f46517T = 1;
                        } else {
                            throw new AnonymousClass2qk("Leaf atom with length > 2147483647 (unsupported).");
                        }
                    }
                    throw new AnonymousClass2qk("Leaf atom defines extended atom size (unsupported).");
                } else if (this.f46501D > 2147483647L) {
                    this.f46499B = null;
                    this.f46517T = 1;
                } else {
                    throw new AnonymousClass2qk("Skipping atom with length > 2147483647 (unsupported).");
                }
            }
            obj = 1;
            if (obj == null) {
                if (this.f46501D > 2147483647L) {
                    throw new AnonymousClass2qk("Skipping atom with length > 2147483647 (unsupported).");
                }
                this.f46499B = null;
                this.f46517T = 1;
            } else if (this.f46500C != 8) {
                throw new AnonymousClass2qk("Leaf atom defines extended atom size (unsupported).");
            } else {
                gP = this.f46501D;
                if (gP > 2147483647L) {
                    throw new AnonymousClass2qk("Leaf atom with length > 2147483647 (unsupported).");
                }
                this.f46499B = new AnonymousClass2tw((int) gP);
                System.arraycopy(this.f46510M.f35498B, 0, this.f46499B.f35498B, 0, 8);
                this.f46517T = 1;
            }
        } else {
            gP = (anonymousClass2sO.gP() + this.f46501D) - 8;
            this.f46503F.add(new AnonymousClass3uW(this.f46502E, gP));
            if (this.f46501D != ((long) this.f46500C)) {
                m21383H(this);
            } else {
                m21381F(this, gP);
            }
        }
        return true;
    }

    /* renamed from: M */
    private void m21388M(AnonymousClass2sO anonymousClass2sO) {
        int size = this.f46509L.size();
        AnonymousClass2sg anonymousClass2sg = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            AnonymousClass2sm anonymousClass2sm = ((AnonymousClass2sg) this.f46509L.valueAt(i)).f35295D;
            if (anonymousClass2sm.f35329L && anonymousClass2sm.f35319B < j) {
                j = anonymousClass2sm.f35319B;
                anonymousClass2sg = (AnonymousClass2sg) this.f46509L.valueAt(i);
            }
        }
        if (anonymousClass2sg == null) {
            this.f46517T = 3;
            return;
        }
        int gP = (int) (j - anonymousClass2sO.gP());
        if (gP >= 0) {
            anonymousClass2sO.MUA(gP);
            AnonymousClass2sm anonymousClass2sm2 = anonymousClass2sg.f35295D;
            anonymousClass2sO.readFully(anonymousClass2sm2.f35327J.f35498B, 0, anonymousClass2sm2.f35328K);
            anonymousClass2sm2.f35327J.m17638O(0);
            anonymousClass2sm2.f35329L = false;
            return;
        }
        throw new AnonymousClass2qk("Offset to encryption data was negative.");
    }

    /* renamed from: N */
    private boolean m21389N(AnonymousClass2sO anonymousClass2sO) {
        int i;
        int gP;
        int i2;
        byte[] bArr;
        int i3 = 4;
        AnonymousClass2sO anonymousClass2sO2 = anonymousClass2sO;
        if (this.f46517T == 3) {
            if (r4.f46511N == null) {
                SparseArray sparseArray = r4.f46509L;
                int size = sparseArray.size();
                AnonymousClass2sg anonymousClass2sg = null;
                long j = Long.MAX_VALUE;
                for (i = 0; i < size; i++) {
                    AnonymousClass2sg anonymousClass2sg2 = (AnonymousClass2sg) sparseArray.valueAt(i);
                    if (anonymousClass2sg2.f35293B != anonymousClass2sg2.f35295D.f35323F) {
                        long j2 = anonymousClass2sg2.f35295D.f35320C;
                        if (j2 < j) {
                            anonymousClass2sg = anonymousClass2sg2;
                            j = j2;
                        }
                    }
                }
                r4.f46511N = anonymousClass2sg;
                if (anonymousClass2sg == null) {
                    gP = (int) (r4.f46513P - anonymousClass2sO2.gP());
                    if (gP >= 0) {
                        anonymousClass2sO2.MUA(gP);
                        m21383H(r4);
                        return false;
                    }
                    throw new AnonymousClass2qk("Offset to end of mdat was negative.");
                }
                gP = (int) (anonymousClass2sg.f35295D.f35320C - anonymousClass2sO2.gP());
                if (gP >= 0) {
                    anonymousClass2sO2.MUA(gP);
                } else {
                    throw new AnonymousClass2qk("Offset to sample data was negative.");
                }
            }
            r4.f46520W = r4.f46511N.f35295D.f35332O[r4.f46511N.f35293B];
            if (r4.f46511N.f35295D.f35321D) {
                r4.f46518U = m21382G(r4, r4.f46511N);
                r4.f46520W += r4.f46518U;
            } else {
                r4.f46518U = 0;
            }
            r4.f46517T = 4;
            r4.f46519V = 0;
        }
        AnonymousClass2sm anonymousClass2sm = r4.f46511N.f35295D;
        AnonymousClass2sk anonymousClass2sk = r4.f46511N.f35297F;
        AnonymousClass2sZ anonymousClass2sZ = r4.f46511N.f35296E;
        i = r4.f46511N.f35293B;
        if (anonymousClass2sk.f35313G == -1) {
            while (true) {
                i2 = r4.f46518U;
                gP = r4.f46520W;
                if (i2 >= gP) {
                    break;
                }
                r4.f46518U += anonymousClass2sZ.bLA(anonymousClass2sO2, gP - i2, false);
            }
        } else {
            byte[] bArr2 = r4.f46514Q.f35498B;
            bArr2[0] = (byte) 0;
            bArr2[1] = (byte) 0;
            bArr2[2] = (byte) 0;
            anonymousClass2sO = anonymousClass2sk.f35313G;
            int i4 = 4 - anonymousClass2sk.f35313G;
            while (r4.f46518U < r4.f46520W) {
                gP = r4.f46519V;
                if (gP == 0) {
                    anonymousClass2sO2.readFully(r4.f46514Q.f35498B, i4, anonymousClass2sO);
                    r4.f46514Q.m17638O(0);
                    r4.f46519V = r4.f46514Q.m17633J();
                    r4.f46516S.m17638O(0);
                    anonymousClass2sZ.dLA(r4.f46516S, i3);
                    r4.f46518U += i3;
                    r4.f46520W += i4;
                    if (r4.f46521X != null) {
                        anonymousClass2sO2.JHA(r4.f46515R.f35498B, 0, 1);
                        if ((r4.f46515R.f35498B[0] & 31) == 6) {
                            AnonymousClass2tw anonymousClass2tw = r4.f46515R;
                            i2 = r4.f46519V;
                            anonymousClass2tw.m17636M(anonymousClass2tw.m17625B() < i2 ? new byte[i2] : anonymousClass2tw.f35498B, i2);
                            anonymousClass2sO2.readFully(r4.f46515R.f35498B, 0, r4.f46519V);
                            anonymousClass2sZ.dLA(r4.f46515R, r4.f46519V);
                            r4.f46518U += r4.f46519V;
                            r4.f46519V = 0;
                            Object obj = r4.f46515R.f35498B;
                            int i5 = r4.f46515R.f35499C;
                            synchronized (AnonymousClass2tu.f35493E) {
                                i3 = 0;
                                int i6 = 0;
                                while (i3 < i5) {
                                    i3 = AnonymousClass2tu.m17615C(obj, i3, i5);
                                    if (i3 < i5) {
                                        if (AnonymousClass2tu.f35492D.length <= i6) {
                                            AnonymousClass2tu.f35492D = Arrays.copyOf(AnonymousClass2tu.f35492D, AnonymousClass2tu.f35492D.length * 2);
                                        }
                                        gP = i6 + 1;
                                        AnonymousClass2tu.f35492D[i6] = i3;
                                        i3 += 3;
                                        i6 = gP;
                                    }
                                }
                                i5 -= i6;
                                i3 = 0;
                                i2 = 0;
                                for (int i7 = 0; i7 < i6; i7++) {
                                    gP = AnonymousClass2tu.f35492D[i7] - i2;
                                    System.arraycopy(obj, i2, obj, i3, gP);
                                    i3 += gP;
                                    int i8 = i3 + 1;
                                    obj[i3] = null;
                                    i3 = i8 + 1;
                                    obj[i8] = null;
                                    i2 += gP + 3;
                                }
                                System.arraycopy(obj, i2, obj, i3, i5 - i3);
                            }
                            r4.f46515R.m17638O(1);
                            r4.f46515R.m17637N(i5);
                            AnonymousClass2so anonymousClass2so = r4.f46521X;
                            long j3 = (anonymousClass2sm.f35326I[i] + ((long) anonymousClass2sm.f35325H[i])) * 1000;
                            AnonymousClass2tw anonymousClass2tw2 = r4.f46515R;
                            while (anonymousClass2tw2.m17624A() > 1) {
                                gP = 0;
                                int i9 = 0;
                                do {
                                    i5 = anonymousClass2tw2.m17631H();
                                    i9 += i5;
                                } while (i5 == 255);
                                do {
                                    i5 = anonymousClass2tw2.m17631H();
                                    gP += i5;
                                } while (i5 == 255);
                                if (AnonymousClass2t2.m17584C(i9, gP, anonymousClass2tw2)) {
                                    anonymousClass2so.f35340B.dLA(anonymousClass2tw2, gP);
                                    anonymousClass2so.f35340B.gLA(j3, 1, gP, 0, null);
                                } else {
                                    anonymousClass2tw2.m17639P(gP);
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i2 = anonymousClass2sZ.bLA(anonymousClass2sO2, gP, false);
                    r4.f46518U += i2;
                    r4.f46519V -= i2;
                }
                i3 = 4;
            }
        }
        long j4 = (anonymousClass2sm.f35326I[i] + ((long) anonymousClass2sm.f35325H[i])) * 1000;
        int i10 = (anonymousClass2sm.f35321D ? 2 : 0) | anonymousClass2sm.f35331N[i];
        i2 = anonymousClass2sm.f35322E.f35291D;
        if (anonymousClass2sm.f35321D) {
            bArr = (anonymousClass2sm.f35333P != null ? anonymousClass2sm.f35333P : anonymousClass2sk.f35314H[i2]).f35318C;
        } else {
            bArr = null;
        }
        anonymousClass2sZ.gLA(j4, i10, r4.f46520W, 0, bArr);
        AnonymousClass2sg anonymousClass2sg3 = r4.f46511N;
        anonymousClass2sg3.f35293B++;
        if (r4.f46511N.f35293B == anonymousClass2sm.f35323F) {
            r4.f46511N = null;
        }
        r4.f46517T = 3;
        return true;
    }

    public final boolean PUA(AnonymousClass2sO anonymousClass2sO) {
        return AnonymousClass2sj.m17570B(anonymousClass2sO, DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED, true);
    }

    public final int bIA(AnonymousClass2sO anonymousClass2sO, AnonymousClass2sU anonymousClass2sU) {
        while (true) {
            AnonymousClass2sO anonymousClass2sO2 = anonymousClass2sO;
            switch (this.f46517T) {
                case 0:
                    if (m21387L(anonymousClass2sO2)) {
                        break;
                    }
                    return -1;
                case 1:
                    int i = ((int) r5.f46501D) - r5.f46500C;
                    AnonymousClass2tw anonymousClass2tw = r5.f46499B;
                    if (anonymousClass2tw != null) {
                        anonymousClass2sO2.readFully(anonymousClass2tw.f35498B, 8, i);
                        AnonymousClass2sa anonymousClass3uX = new AnonymousClass3uX(r5.f46502E, r5.f46499B);
                        long gP = anonymousClass2sO2.gP();
                        if (!r5.f46503F.isEmpty()) {
                            ((AnonymousClass3uW) r5.f46503F.peek()).f46495D.add(anonymousClass3uX);
                        } else if (anonymousClass3uX.f35278B == AnonymousClass2sa.HB) {
                            long I;
                            AnonymousClass2tw anonymousClass2tw2 = anonymousClass3uX.f46496B;
                            anonymousClass2tw2.m17638O(8);
                            int D = AnonymousClass2sa.m17551D(anonymousClass2tw2.m17627D());
                            anonymousClass2tw2.m17639P(4);
                            long I2 = anonymousClass2tw2.m17632I();
                            if (D == 0) {
                                I = anonymousClass2tw2.m17632I();
                                gP += anonymousClass2tw2.m17632I();
                            } else {
                                I = anonymousClass2tw2.m17634K();
                                gP += anonymousClass2tw2.m17634K();
                            }
                            anonymousClass2tw2.m17639P(2);
                            int L = anonymousClass2tw2.m17635L();
                            int[] iArr = new int[L];
                            long[] jArr = new long[L];
                            long[] jArr2 = new long[L];
                            long[] jArr3 = new long[L];
                            long j = I;
                            long L2 = AnonymousClass2u6.m17659L(I, 1000000, I2);
                            int i2 = 0;
                            while (i2 < L) {
                                D = anonymousClass2tw2.m17627D();
                                if ((Process.WAIT_RESULT_TIMEOUT & D) == 0) {
                                    long I3 = anonymousClass2tw2.m17632I();
                                    iArr[i2] = D & Integer.MAX_VALUE;
                                    jArr[i2] = gP;
                                    jArr3[i2] = L2;
                                    j += I3;
                                    L2 = AnonymousClass2u6.m17659L(j, 1000000, I2);
                                    jArr2[i2] = L2 - jArr3[i2];
                                    anonymousClass2tw2.m17639P(4);
                                    gP += (long) iArr[i2];
                                    i2++;
                                } else {
                                    throw new AnonymousClass2qk("Unhandled indirect reference");
                                }
                            }
                            r5.f46505H.uLA(new AnonymousClass3uP(iArr, jArr, jArr2, jArr3));
                            r5.f46507J = true;
                        }
                    } else {
                        anonymousClass2sO2.MUA(i);
                    }
                    m21381F(r5, anonymousClass2sO2.gP());
                    break;
                case 2:
                    m21388M(anonymousClass2sO2);
                    break;
                default:
                    if (!m21389N(anonymousClass2sO2)) {
                        break;
                    }
                    return 0;
            }
        }
    }

    public final void sLA() {
        int size = this.f46509L.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass2sg) this.f46509L.valueAt(i)).m17566B();
        }
        this.f46503F.clear();
        m21383H(this);
    }

    public final void zV(AnonymousClass2sP anonymousClass2sP) {
        this.f46505H = anonymousClass2sP;
        if (this.f46508K != null) {
            AnonymousClass2sg anonymousClass2sg = new AnonymousClass2sg(anonymousClass2sP.eVA(0));
            anonymousClass2sg.m17565A(this.f46508K, new AnonymousClass2sf(0, 0, 0, 0));
            this.f46509L.put(0, anonymousClass2sg);
            m21378C(this);
            this.f46505H.MH();
        }
    }
}
