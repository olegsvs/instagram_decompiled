package com.google.android.exoplayer.extractor.webm;

import X.AnonymousClass2qk;
import X.AnonymousClass2sN;
import X.AnonymousClass2sO;
import X.AnonymousClass2sP;
import X.AnonymousClass2sU;
import X.AnonymousClass2sY;
import X.AnonymousClass2sZ;
import X.AnonymousClass2sq;
import X.AnonymousClass2ss;
import X.AnonymousClass2st;
import X.AnonymousClass2su;
import X.AnonymousClass2ti;
import X.AnonymousClass2tu;
import X.AnonymousClass2tw;
import X.AnonymousClass2u6;
import X.AnonymousClass3uP;
import X.AnonymousClass3uY;
import X.AnonymousClass3uZ;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public final class WebmExtractor implements AnonymousClass2sN {
    /* renamed from: s */
    private static final byte[] f46548s = new byte[]{(byte) 49, (byte) 10, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 45, (byte) 45, (byte) 62, (byte) 32, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 10};
    /* renamed from: t */
    public static final byte[] f46549t = new byte[]{(byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32};
    /* renamed from: u */
    public static final UUID f46550u = new UUID(72057594037932032L, -9223371306706625679L);
    /* renamed from: B */
    public long f46551B;
    /* renamed from: C */
    public int f46552C;
    /* renamed from: D */
    public int f46553D;
    /* renamed from: E */
    public final AnonymousClass2tw f46554E;
    /* renamed from: F */
    public final AnonymousClass2tw f46555F;
    /* renamed from: G */
    private int f46556G;
    /* renamed from: H */
    private int f46557H;
    /* renamed from: I */
    private int f46558I;
    /* renamed from: J */
    private int[] f46559J;
    /* renamed from: K */
    private int f46560K;
    /* renamed from: L */
    private long f46561L;
    /* renamed from: M */
    private int f46562M;
    /* renamed from: N */
    private int f46563N;
    /* renamed from: O */
    private long f46564O;
    /* renamed from: P */
    private AnonymousClass2ti f46565P;
    /* renamed from: Q */
    private AnonymousClass2ti f46566Q;
    /* renamed from: R */
    private long f46567R;
    /* renamed from: S */
    private AnonymousClass2su f46568S;
    /* renamed from: T */
    private long f46569T;
    /* renamed from: U */
    private long f46570U;
    /* renamed from: V */
    private AnonymousClass2sP f46571V;
    /* renamed from: W */
    private final AnonymousClass2tw f46572W;
    /* renamed from: X */
    private final AnonymousClass2tw f46573X;
    /* renamed from: Y */
    private final AnonymousClass2sq f46574Y;
    /* renamed from: Z */
    private int f46575Z;
    /* renamed from: a */
    private boolean f46576a;
    /* renamed from: b */
    private boolean f46577b;
    /* renamed from: c */
    private boolean f46578c;
    /* renamed from: d */
    private final AnonymousClass2tw f46579d;
    /* renamed from: e */
    private int f46580e;
    /* renamed from: f */
    private final AnonymousClass2tw f46581f;
    /* renamed from: g */
    private long f46582g;
    /* renamed from: h */
    private boolean f46583h;
    /* renamed from: i */
    private long f46584i;
    /* renamed from: j */
    private boolean f46585j;
    /* renamed from: k */
    private long f46586k;
    /* renamed from: l */
    private long f46587l;
    /* renamed from: m */
    private boolean f46588m;
    /* renamed from: n */
    private boolean f46589n;
    /* renamed from: o */
    private long f46590o;
    /* renamed from: p */
    private final SparseArray f46591p;
    /* renamed from: q */
    private final AnonymousClass2st f46592q;
    /* renamed from: r */
    private final AnonymousClass2tw f46593r;

    /* renamed from: B */
    public static final int m21398B(int i) {
        switch (i) {
            case 131:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21680:
            case 21682:
            case 21690:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 25152:
            case 28032:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
                return 4;
            case 181:
            case 17545:
                return 5;
            default:
                return 0;
        }
    }

    public final void release() {
    }

    public WebmExtractor() {
        this(new AnonymousClass3uY());
    }

    public WebmExtractor(AnonymousClass2sq anonymousClass2sq) {
        this.f46586k = -1;
        this.f46587l = -1;
        this.f46590o = -1;
        this.f46569T = -1;
        this.f46570U = -1;
        this.f46567R = -1;
        this.f46584i = -1;
        this.f46564O = -1;
        this.f46574Y = anonymousClass2sq;
        anonymousClass2sq.AW(new AnonymousClass3uZ(this));
        this.f46592q = new AnonymousClass2st();
        this.f46591p = new SparseArray();
        this.f46579d = new AnonymousClass2tw(4);
        this.f46593r = new AnonymousClass2tw(ByteBuffer.allocate(4).putInt(-1).array());
        this.f46581f = new AnonymousClass2tw(4);
        this.f46573X = new AnonymousClass2tw(AnonymousClass2tu.f35491C);
        this.f46572W = new AnonymousClass2tw(4);
        this.f46554E = new AnonymousClass2tw();
        this.f46555F = new AnonymousClass2tw();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final void m21408A(int r15, int r16, X.AnonymousClass2sO r17) {
        /*
        r14 = this;
        r10 = r16;
        r0 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r11 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r3 = 4;
        r2 = 0;
        r6 = r17;
        r5 = r14;
        r8 = r15;
        if (r15 == r0) goto L_0x007a;
    L_0x000e:
        if (r15 == r11) goto L_0x007a;
    L_0x0010:
        r0 = 16981; // 0x4255 float:2.3795E-41 double:8.3897E-320;
        if (r15 == r0) goto L_0x006e;
    L_0x0014:
        r0 = 18402; // 0x47e2 float:2.5787E-41 double:9.092E-320;
        if (r15 == r0) goto L_0x0062;
    L_0x0018:
        r0 = 21419; // 0x53ab float:3.0014E-41 double:1.05824E-319;
        if (r15 == r0) goto L_0x0043;
    L_0x001c:
        r0 = 25506; // 0x63a2 float:3.5742E-41 double:1.26016E-319;
        if (r15 != r0) goto L_0x002c;
    L_0x0020:
        r1 = r14.f46568S;
        r0 = new byte[r10];
        r1.f35353F = r0;
        r0 = r1.f35353F;
        r6.readFully(r0, r2, r10);
        return;
    L_0x002c:
        r2 = new X.2qk;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Unexpected id: ";
        r1.append(r0);
        r1.append(r15);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0043:
        r0 = r14.f46581f;
        r0 = r0.f35498B;
        java.util.Arrays.fill(r0, r2);
        r0 = r14.f46581f;
        r0 = r0.f35498B;
        r3 = r3 - r16;
        r6.readFully(r0, r3, r10);
        r0 = r14.f46581f;
        r0.m17638O(r2);
        r0 = r14.f46581f;
        r0 = r0.m17632I();
        r0 = (int) r0;
        r14.f46580e = r0;
        return;
    L_0x0062:
        r1 = r14.f46568S;
        r0 = new byte[r10];
        r1.f35358K = r0;
        r0 = r1.f35358K;
        r6.readFully(r0, r2, r10);
        return;
    L_0x006e:
        r1 = r14.f46568S;
        r0 = new byte[r10];
        r1.f35366S = r0;
        r0 = r1.f35366S;
        r6.readFully(r0, r2, r10);
        return;
    L_0x007a:
        r0 = r14.f46560K;
        r12 = 8;
        r7 = 1;
        if (r0 != 0) goto L_0x009d;
    L_0x0081:
        r0 = r14.f46592q;
        r0 = r0.m17579A(r6, r2, r7, r12);
        r0 = (int) r0;
        r14.f46562M = r0;
        r0 = r14.f46592q;
        r0 = r0.f35346B;
        r14.f46563N = r0;
        r0 = -1;
        r14.f46551B = r0;
        r14.f46560K = r7;
        r1 = r14.f46579d;
        r0 = 0;
        r1.f35500D = r0;
        r1.f35499C = r0;
    L_0x009d:
        r1 = r14.f46591p;
        r0 = r14.f46562M;
        r4 = r1.get(r0);
        r4 = (X.AnonymousClass2su) r4;
        if (r4 != 0) goto L_0x00b3;
    L_0x00a9:
        r0 = r14.f46563N;
        r10 = r16 - r0;
        r6.MUA(r10);
        r14.f46560K = r2;
        return;
    L_0x00b3:
        r0 = r14.f46560K;
        if (r0 != r7) goto L_0x0262;
    L_0x00b7:
        r13 = 3;
        m21403G(r14, r6, r13);
        r0 = r14.f46579d;
        r0 = r0.f35498B;
        r1 = 2;
        r0 = r0[r1];
        r9 = r0 & 6;
        r9 = r9 >> r7;
        r15 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r9 != 0) goto L_0x00dc;
    L_0x00c9:
        r14.f46557H = r7;
        r0 = r14.f46559J;
        r1 = m21401E(r0, r7);
        r14.f46559J = r1;
        r0 = r14.f46563N;
        r10 = r16 - r0;
        r10 = r10 - r13;
        r1[r2] = r10;
        goto L_0x01ef;
    L_0x00dc:
        if (r8 != r11) goto L_0x025a;
    L_0x00de:
        m21403G(r14, r6, r3);
        r0 = r14.f46579d;
        r0 = r0.f35498B;
        r0 = r0[r13];
        r0 = r0 & r15;
        r0 = r0 + r7;
        r14.f46557H = r0;
        r11 = r14.f46559J;
        r0 = r14.f46557H;
        r0 = m21401E(r11, r0);
        r14.f46559J = r0;
        if (r9 != r1) goto L_0x0106;
    L_0x00f7:
        r0 = r14.f46563N;
        r10 = r16 - r0;
        r10 = r10 - r3;
        r1 = r14.f46557H;
        r10 = r10 / r1;
        r0 = r14.f46559J;
        java.util.Arrays.fill(r0, r2, r1, r10);
        goto L_0x01ef;
    L_0x0106:
        if (r9 != r7) goto L_0x013e;
    L_0x0108:
        r11 = 0;
        r9 = 4;
        r12 = 0;
    L_0x010b:
        r3 = r14.f46557H;
        r0 = r3 + -1;
        if (r11 >= r0) goto L_0x0131;
    L_0x0111:
        r0 = r14.f46559J;
        r0[r11] = r2;
    L_0x0115:
        r9 = r9 + r7;
        m21403G(r14, r6, r9);
        r0 = r14.f46579d;
        r1 = r0.f35498B;
        r0 = r9 + -1;
        r3 = r1[r0];
        r3 = r3 & r15;
        r1 = r14.f46559J;
        r0 = r1[r11];
        r0 = r0 + r3;
        r1[r11] = r0;
        if (r3 == r15) goto L_0x0115;
    L_0x012b:
        r0 = r1[r11];
        r12 = r12 + r0;
        r11 = r11 + 1;
        goto L_0x010b;
    L_0x0131:
        r1 = r14.f46559J;
        r3 = r3 - r7;
        r0 = r14.f46563N;
        r10 = r16 - r0;
        r10 = r10 - r9;
        r10 = r10 - r12;
        r1[r3] = r10;
        goto L_0x01ef;
    L_0x013e:
        if (r9 != r13) goto L_0x0243;
    L_0x0140:
        r11 = 0;
        r9 = 4;
        r17 = 0;
    L_0x0144:
        r3 = r5.f46557H;
        r0 = r3 + -1;
        if (r11 >= r0) goto L_0x01e4;
    L_0x014a:
        r0 = r5.f46559J;
        r0[r11] = r2;
        r9 = r9 + 1;
        m21403G(r5, r6, r9);
        r0 = r5.f46579d;
        r0 = r0.f35498B;
        r1 = r9 + -1;
        r0 = r0[r1];
        if (r0 == 0) goto L_0x01dc;
    L_0x015d:
        r2 = 0;
        r13 = 0;
    L_0x0160:
        if (r13 >= r12) goto L_0x01aa;
    L_0x0162:
        r0 = 7 - r13;
        r16 = r7 << r0;
        r0 = r5.f46579d;
        r0 = r0.f35498B;
        r0 = r0[r1];
        r0 = r0 & r16;
        if (r0 == 0) goto L_0x01a3;
    L_0x0170:
        r9 = r9 + r13;
        m21403G(r5, r6, r9);
        r0 = r5.f46579d;
        r0 = r0.f35498B;
        r14 = r1 + 1;
        r1 = r0[r1];
        r1 = r1 & r15;
        r0 = r16 ^ -1;
        r1 = r1 & r0;
        r2 = (long) r1;
    L_0x0181:
        if (r14 >= r9) goto L_0x0196;
    L_0x0183:
        r2 = r2 << r12;
        r0 = r5.f46579d;
        r0 = r0.f35498B;
        r12 = r14 + 1;
        r1 = r0[r14];
        r0 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r1 = r1 & r0;
        r0 = (long) r1;
        r0 = r0 | r2;
        r14 = r12;
        r2 = r0;
        r12 = 8;
        goto L_0x0181;
    L_0x0196:
        if (r11 <= 0) goto L_0x01aa;
    L_0x0198:
        r0 = r13 * 7;
        r0 = r0 + 6;
        r12 = 1;
        r0 = r12 << r0;
        r0 = r0 - r12;
        r2 = r2 - r0;
        goto L_0x01aa;
    L_0x01a3:
        r13 = r13 + 1;
        r12 = 8;
        r15 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        goto L_0x0160;
    L_0x01aa:
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x01d4;
    L_0x01b1:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x01d4;
    L_0x01b8:
        r2 = (int) r2;
        r1 = r5.f46559J;
        if (r11 != 0) goto L_0x01be;
    L_0x01bd:
        goto L_0x01c3;
    L_0x01be:
        r0 = r11 + -1;
        r0 = r1[r0];
        r2 = r2 + r0;
    L_0x01c3:
        r1[r11] = r2;
        r0 = r5.f46559J;
        r0 = r0[r11];
        r17 = r17 + r0;
        r11 = r11 + 1;
        r2 = 0;
        r12 = 8;
        r15 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        goto L_0x0144;
    L_0x01d4:
        r1 = new X.2qk;
        r0 = "EBML lacing sample size out of range.";
        r1.<init>(r0);
        throw r1;
    L_0x01dc:
        r1 = new X.2qk;
        r0 = "No valid varint length mask found";
        r1.<init>(r0);
        throw r1;
    L_0x01e4:
        r1 = r5.f46559J;
        r3 = r3 - r7;
        r0 = r5.f46563N;
        r10 = r10 - r0;
        r10 = r10 - r9;
        r10 = r10 - r17;
        r1[r3] = r10;
    L_0x01ef:
        r0 = r5.f46579d;
        r1 = r0.f35498B;
        r0 = 0;
        r9 = r1[r0];
        r0 = 8;
        r9 = r9 << r0;
        r0 = r5.f46579d;
        r0 = r0.f35498B;
        r1 = r0[r7];
        r0 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r1 = r1 & r0;
        r9 = r9 | r1;
        r2 = r5.f46564O;
        r0 = (long) r9;
        r0 = m21406J(r5, r0);
        r2 = r2 + r0;
        r5.f46561L = r2;
        r0 = r5.f46579d;
        r0 = r0.f35498B;
        r3 = 2;
        r1 = r0[r3];
        r0 = 8;
        r1 = r1 & r0;
        if (r1 != r0) goto L_0x021b;
    L_0x0219:
        r2 = 1;
        goto L_0x021c;
    L_0x021b:
        r2 = 0;
    L_0x021c:
        r0 = r4.f35368U;
        if (r0 == r3) goto L_0x0232;
    L_0x0220:
        r0 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        if (r8 != r0) goto L_0x0230;
    L_0x0224:
        r0 = r5.f46579d;
        r0 = r0.f35498B;
        r1 = r0[r3];
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r1 = r1 & r0;
        if (r1 != r0) goto L_0x0230;
    L_0x022f:
        goto L_0x0232;
    L_0x0230:
        r1 = 0;
        goto L_0x0233;
    L_0x0232:
        r1 = 1;
    L_0x0233:
        if (r2 == 0) goto L_0x0238;
    L_0x0235:
        r0 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        goto L_0x0239;
    L_0x0238:
        r0 = 0;
    L_0x0239:
        r1 = r1 | r0;
        r5.f46556G = r1;
        r0 = 2;
        r5.f46560K = r0;
        r0 = 0;
        r5.f46558I = r0;
        goto L_0x0262;
    L_0x0243:
        r2 = new X.2qk;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Unexpected lacing value: ";
        r1.append(r0);
        r1.append(r9);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x025a:
        r1 = new X.2qk;
        r0 = "Lacing only supported in SimpleBlocks.";
        r1.<init>(r0);
        throw r1;
    L_0x0262:
        r0 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        if (r8 != r0) goto L_0x028b;
    L_0x0266:
        r1 = r5.f46558I;
        r0 = r5.f46557H;
        if (r1 >= r0) goto L_0x0287;
    L_0x026c:
        r0 = r5.f46559J;
        r0 = r0[r1];
        m21407K(r5, r6, r4, r0);
        r2 = r5.f46561L;
        r1 = r5.f46558I;
        r0 = r4.f35354G;
        r1 = r1 * r0;
        r0 = r1 / 1000;
        r0 = (long) r0;
        r2 = r2 + r0;
        m21400D(r5, r4, r2);
        r0 = r5.f46558I;
        r0 = r0 + r7;
        r5.f46558I = r0;
        goto L_0x0266;
    L_0x0287:
        r0 = 0;
        r5.f46560K = r0;
        goto L_0x0293;
    L_0x028b:
        r1 = 0;
        r0 = r5.f46559J;
        r0 = r0[r1];
        m21407K(r5, r6, r4, r0);
    L_0x0293:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.extractor.webm.WebmExtractor.A(int, int, X.2sO):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public final void m21409B(int r43) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r42 = this;
        r0 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r6 = 1;
        r1 = r42;
        r2 = r43;
        if (r2 == r0) goto L_0x0674;
    L_0x0009:
        r0 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        if (r2 == r0) goto L_0x00c3;
    L_0x000d:
        r0 = 19899; // 0x4dbb float:2.7884E-41 double:9.8314E-320;
        r5 = 475249515; // 0x1c53bb6b float:7.0056276E-22 double:2.348044586E-315;
        r7 = -1;
        if (r2 == r0) goto L_0x00aa;
    L_0x0016:
        r0 = 25152; // 0x6240 float:3.5245E-41 double:1.24267E-319;
        if (r2 == r0) goto L_0x007a;
    L_0x001a:
        r0 = 28032; // 0x6d80 float:3.9281E-41 double:1.38496E-319;
        if (r2 == r0) goto L_0x0065;
    L_0x001e:
        r0 = 357149030; // 0x1549a966 float:4.072526E-26 double:1.76455066E-315;
        if (r2 == r0) goto L_0x004d;
    L_0x0023:
        r0 = 374648427; // 0x1654ae6b float:1.718026E-25 double:1.85100917E-315;
        if (r2 == r0) goto L_0x0037;
    L_0x0028:
        if (r2 == r5) goto L_0x002b;
    L_0x002a:
        return;
    L_0x002b:
        r2 = r1.f46571V;
        r0 = m21399C(r1);
        r2.uLA(r0);
        r1.f46589n = r6;
        return;
    L_0x0037:
        r0 = r1.f46591p;
        r0 = r0.size();
        if (r0 == 0) goto L_0x0045;
    L_0x003f:
        r0 = r1.f46571V;
        r0.MH();
        return;
    L_0x0045:
        r1 = new X.2qk;
        r0 = "No valid tracks were found";
        r1.<init>(r0);
        throw r1;
    L_0x004d:
        r2 = r1.f46590o;
        r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r0 != 0) goto L_0x0058;
    L_0x0053:
        r2 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r1.f46590o = r2;
    L_0x0058:
        r2 = r1.f46569T;
        r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r0 == 0) goto L_0x002a;
    L_0x005e:
        r2 = m21406J(r1, r2);
        r1.f46570U = r2;
        goto L_0x002a;
    L_0x0065:
        r0 = r1.f46568S;
        r0 = r0.f35359L;
        if (r0 == 0) goto L_0x002a;
    L_0x006b:
        r0 = r1.f46568S;
        r0 = r0.f35366S;
        if (r0 != 0) goto L_0x0072;
    L_0x0071:
        goto L_0x002a;
    L_0x0072:
        r1 = new X.2qk;
        r0 = "Combining encryption and compression is not supported";
        r1.<init>(r0);
        throw r1;
    L_0x007a:
        r0 = r1.f46568S;
        r0 = r0.f35359L;
        if (r0 == 0) goto L_0x002a;
    L_0x0080:
        r0 = r1.f46568S;
        r0 = r0.f35358K;
        if (r0 == 0) goto L_0x00a2;
    L_0x0086:
        r0 = r1.f46588m;
        if (r0 != 0) goto L_0x002a;
    L_0x008a:
        r5 = r1.f46571V;
        r4 = new X.3uI;
        r3 = new X.2rz;
        r2 = "video/webm";
        r0 = r1.f46568S;
        r0 = r0.f35358K;
        r3.<init>(r2, r0);
        r4.<init>(r3);
        r5.uG(r4);
        r1.f46588m = r6;
        goto L_0x002a;
    L_0x00a2:
        r1 = new X.2qk;
        r0 = "Encrypted Track found but ContentEncKeyID was not found";
        r1.<init>(r0);
        throw r1;
    L_0x00aa:
        r4 = r1.f46580e;
        r0 = -1;
        if (r4 == r0) goto L_0x00bb;
    L_0x00af:
        r2 = r1.f46582g;
        r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r0 == 0) goto L_0x00bb;
    L_0x00b5:
        if (r4 != r5) goto L_0x002a;
    L_0x00b7:
        r1.f46567R = r2;
        goto L_0x002a;
    L_0x00bb:
        r1 = new X.2qk;
        r0 = "Mandatory element SeekID or SeekPosition not found";
        r1.<init>(r0);
        throw r1;
    L_0x00c3:
        r0 = r1.f46568S;
        r2 = r0.f35352E;
        r0 = "V_VP8";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x00cf:
        r0 = "V_VP9";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x00d7:
        r0 = "V_MPEG2";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x00df:
        r0 = "V_MPEG4/ISO/SP";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x00e7:
        r0 = "V_MPEG4/ISO/ASP";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x00ef:
        r0 = "V_MPEG4/ISO/AP";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x00f7:
        r0 = "V_MPEG4/ISO/AVC";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x00ff:
        r0 = "V_MPEGH/ISO/HEVC";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x0107:
        r0 = "V_MS/VFW/FOURCC";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x010f:
        r0 = "A_OPUS";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x0117:
        r0 = "A_VORBIS";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x011f:
        r0 = "A_AAC";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x0127:
        r0 = "A_MPEG/L3";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x012f:
        r0 = "A_AC3";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x0137:
        r0 = "A_EAC3";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x013f:
        r0 = "A_TRUEHD";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x0147:
        r0 = "A_DTS";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x014f:
        r0 = "A_DTS/EXPRESS";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x0157:
        r0 = "A_DTS/LOSSLESS";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x015f:
        r0 = "A_FLAC";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x0167:
        r0 = "A_MS/ACM";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x016f:
        r0 = "A_PCM/INT/LIT";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x0177:
        r0 = "S_TEXT/UTF8";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x017f:
        r0 = "S_VOBSUB";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0192;
    L_0x0187:
        r0 = "S_HDMV/PGS";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0190;
    L_0x018f:
        goto L_0x0192;
    L_0x0190:
        r0 = 0;
        goto L_0x0193;
    L_0x0192:
        r0 = 1;
    L_0x0193:
        if (r0 == 0) goto L_0x0670;
    L_0x0195:
        r0 = r1.f46568S;
        r2 = r1.f46571V;
        r43 = r2;
        r2 = r0.f35363P;
        r24 = r2;
        r2 = r1.f46570U;
        r41 = r2;
        r3 = r1.f46591p;
        r2 = r1.f46568S;
        r2 = r2.f35363P;
        r18 = r3.get(r2);
        r2 = r18;
        r2 = (X.AnonymousClass2su) r2;
        r18 = r2;
        r3 = r0.f35352E;
        r2 = r3.hashCode();
        r4 = 3;
        r6 = 16;
        r8 = 8;
        r7 = -1;
        switch(r2) {
            case -2095576542: goto L_0x02d2;
            case -2095575984: goto L_0x02c8;
            case -1985379776: goto L_0x02bd;
            case -1784763192: goto L_0x02b2;
            case -1730367663: goto L_0x02a7;
            case -1482641357: goto L_0x029c;
            case -1373388978: goto L_0x0291;
            case -538363189: goto L_0x0287;
            case -538363109: goto L_0x027d;
            case -425012669: goto L_0x0272;
            case -356037306: goto L_0x0267;
            case 62923557: goto L_0x025c;
            case 62923603: goto L_0x0250;
            case 62927045: goto L_0x0244;
            case 82338133: goto L_0x0239;
            case 82338134: goto L_0x022e;
            case 99146302: goto L_0x0222;
            case 542569478: goto L_0x0216;
            case 725957860: goto L_0x020a;
            case 855502857: goto L_0x01ff;
            case 1422270023: goto L_0x01f3;
            case 1809237540: goto L_0x01e8;
            case 1950749482: goto L_0x01dc;
            case 1950789798: goto L_0x01d0;
            case 1951062397: goto L_0x01c4;
            default: goto L_0x01c2;
        };
    L_0x01c2:
        goto L_0x02dc;
    L_0x01c4:
        r2 = "A_OPUS";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x01cc:
        r2 = 10;
        goto L_0x02dd;
    L_0x01d0:
        r2 = "A_FLAC";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x01d8:
        r2 = 19;
        goto L_0x02dd;
    L_0x01dc:
        r2 = "A_EAC3";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x01e4:
        r2 = 14;
        goto L_0x02dd;
    L_0x01e8:
        r2 = "V_MPEG2";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x01f0:
        r2 = 2;
        goto L_0x02dd;
    L_0x01f3:
        r2 = "S_TEXT/UTF8";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x01fb:
        r2 = 22;
        goto L_0x02dd;
    L_0x01ff:
        r2 = "V_MPEGH/ISO/HEVC";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x0207:
        r2 = 7;
        goto L_0x02dd;
    L_0x020a:
        r2 = "A_PCM/INT/LIT";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x0212:
        r2 = 21;
        goto L_0x02dd;
    L_0x0216:
        r2 = "A_DTS/EXPRESS";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x021e:
        r2 = 17;
        goto L_0x02dd;
    L_0x0222:
        r2 = "S_HDMV/PGS";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x022a:
        r2 = 24;
        goto L_0x02dd;
    L_0x022e:
        r2 = "V_VP9";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x0236:
        r2 = 1;
        goto L_0x02dd;
    L_0x0239:
        r2 = "V_VP8";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x0241:
        r2 = 0;
        goto L_0x02dd;
    L_0x0244:
        r2 = "A_DTS";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x024c:
        r2 = 16;
        goto L_0x02dd;
    L_0x0250:
        r2 = "A_AC3";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x0258:
        r2 = 13;
        goto L_0x02dd;
    L_0x025c:
        r2 = "A_AAC";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x0264:
        r2 = 11;
        goto L_0x02dd;
    L_0x0267:
        r2 = "A_DTS/LOSSLESS";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x026f:
        r2 = 18;
        goto L_0x02dd;
    L_0x0272:
        r2 = "S_VOBSUB";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x027a:
        r2 = 23;
        goto L_0x02dd;
    L_0x027d:
        r2 = "V_MPEG4/ISO/AVC";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x0285:
        r2 = 6;
        goto L_0x02dd;
    L_0x0287:
        r2 = "V_MPEG4/ISO/ASP";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x028f:
        r2 = 4;
        goto L_0x02dd;
    L_0x0291:
        r2 = "V_MS/VFW/FOURCC";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x0299:
        r2 = 8;
        goto L_0x02dd;
    L_0x029c:
        r2 = "A_MPEG/L3";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x02a4:
        r2 = 12;
        goto L_0x02dd;
    L_0x02a7:
        r2 = "A_VORBIS";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x02af:
        r2 = 9;
        goto L_0x02dd;
    L_0x02b2:
        r2 = "A_TRUEHD";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x02ba:
        r2 = 15;
        goto L_0x02dd;
    L_0x02bd:
        r2 = "A_MS/ACM";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x02c5:
        r2 = 20;
        goto L_0x02dd;
    L_0x02c8:
        r2 = "V_MPEG4/ISO/SP";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x02d0:
        r2 = 3;
        goto L_0x02dd;
    L_0x02d2:
        r2 = "V_MPEG4/ISO/AP";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02dc;
    L_0x02da:
        r2 = 5;
        goto L_0x02dd;
    L_0x02dc:
        r2 = -1;
    L_0x02dd:
        r3 = 0;
        switch(r2) {
            case 0: goto L_0x0578;
            case 1: goto L_0x0575;
            case 2: goto L_0x0572;
            case 3: goto L_0x0566;
            case 4: goto L_0x0566;
            case 5: goto L_0x0566;
            case 6: goto L_0x050f;
            case 7: goto L_0x0479;
            case 8: goto L_0x03fd;
            case 9: goto L_0x03a5;
            case 10: goto L_0x0367;
            case 11: goto L_0x035d;
            case 12: goto L_0x0357;
            case 13: goto L_0x0353;
            case 14: goto L_0x034f;
            case 15: goto L_0x034b;
            case 16: goto L_0x0347;
            case 17: goto L_0x0347;
            case 18: goto L_0x0343;
            case 19: goto L_0x0339;
            case 20: goto L_0x031c;
            case 21: goto L_0x02fb;
            case 22: goto L_0x02f7;
            case 23: goto L_0x02ed;
            case 24: goto L_0x02e9;
            default: goto L_0x02e1;
        };
    L_0x02e1:
        r1 = new X.2qk;
        r0 = "Unrecognized codec identifier.";
        r1.<init>(r0);
        throw r1;
    L_0x02e9:
        r2 = "application/pgs";
        goto L_0x057a;
    L_0x02ed:
        r2 = "application/vobsub";
        r3 = r0.f35353F;
        r3 = java.util.Collections.singletonList(r3);
        goto L_0x057a;
    L_0x02f7:
        r2 = "application/x-subrip";
        goto L_0x057a;
    L_0x02fb:
        r2 = "audio/raw";
        r4 = r0.f35349B;
        if (r4 != r6) goto L_0x0303;
    L_0x0301:
        goto L_0x057a;
    L_0x0303:
        r3 = new X.2qk;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r1 = "Unsupported PCM bit depth: ";
        r2.append(r1);
        r0 = r0.f35349B;
        r2.append(r0);
        r0 = r2.toString();
        r3.<init>(r0);
        throw r3;
    L_0x031c:
        r2 = "audio/raw";
        r5 = new X.2tw;
        r4 = r0.f35353F;
        r5.<init>(r4);
        r4 = X.AnonymousClass2su.m17580B(r5);
        if (r4 == 0) goto L_0x0331;
    L_0x032b:
        r4 = r0.f35349B;
        if (r4 != r6) goto L_0x0303;
    L_0x032f:
        goto L_0x057a;
    L_0x0331:
        r1 = new X.2qk;
        r0 = "Non-PCM MS/ACM is unsupported";
        r1.<init>(r0);
        throw r1;
    L_0x0339:
        r2 = "audio/x-flac";
        r3 = r0.f35353F;
        r3 = java.util.Collections.singletonList(r3);
        goto L_0x057a;
    L_0x0343:
        r2 = "audio/vnd.dts.hd";
        goto L_0x057a;
    L_0x0347:
        r2 = "audio/vnd.dts";
        goto L_0x057a;
    L_0x034b:
        r2 = "audio/true-hd";
        goto L_0x057a;
    L_0x034f:
        r2 = "audio/eac3";
        goto L_0x057a;
    L_0x0353:
        r2 = "audio/ac3";
        goto L_0x057a;
    L_0x0357:
        r2 = "audio/mpeg";
        r10 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        goto L_0x057b;
    L_0x035d:
        r2 = "audio/mp4a-latm";
        r3 = r0.f35353F;
        r3 = java.util.Collections.singletonList(r3);
        goto L_0x057a;
    L_0x0367:
        r2 = "audio/opus";
        r3 = new java.util.ArrayList;
        r3.<init>(r4);
        r4 = r0.f35353F;
        r3.add(r4);
        r5 = java.nio.ByteBuffer.allocate(r8);
        r4 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r6 = r5.order(r4);
        r4 = r0.f35351D;
        r4 = r6.putLong(r4);
        r4 = r4.array();
        r3.add(r4);
        r5 = java.nio.ByteBuffer.allocate(r8);
        r4 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r6 = r5.order(r4);
        r4 = r0.f35367T;
        r4 = r6.putLong(r4);
        r4 = r4.array();
        r3.add(r4);
        r10 = 5760; // 0x1680 float:8.071E-42 double:2.846E-320;
        goto L_0x057b;
    L_0x03a5:
        r2 = "audio/vorbis";
        r10 = r0.f35353F;
        r9 = 0;
        r3 = r10[r9];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r8 = 2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        if (r3 != r8) goto L_0x06af;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x03af:
        r5 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r11 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r12 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x03b2:
        r3 = r10[r11];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r6 = -1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        if (r3 != r6) goto L_0x03bc;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x03b7:
        r12 = r12 + 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r11 = r11 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        goto L_0x03b2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x03bc:
        r4 = r11 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3 = r10[r11];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r12 = r12 + r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r11 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x03c2:
        r3 = r10[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        if (r3 != r6) goto L_0x03cb;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x03c6:
        r11 = r11 + 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r4 = r4 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        goto L_0x03c2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x03cb:
        r6 = r4 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3 = r10[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r11 = r11 + r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3 = r10[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        if (r3 != r5) goto L_0x06a7;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x03d4:
        r5 = new byte[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        java.lang.System.arraycopy(r10, r6, r5, r9, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r6 = r6 + r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r4 = r10[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3 = 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        if (r4 != r3) goto L_0x069f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x03df:
        r6 = r6 + r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r4 = r10[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3 = 5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        if (r4 != r3) goto L_0x0697;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x03e5:
        r3 = r10.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3 = r3 - r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r4 = new byte[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3 = r10.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3 = r3 - r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        java.lang.System.arraycopy(r10, r6, r4, r9, r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3 = new java.util.ArrayList;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3.<init>(r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3.add(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r3.add(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r10 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        goto L_0x057b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x03fd:
        r2 = "video/wvc1";
        r8 = new X.2tw;
        r3 = r0.f35353F;
        r8.<init>(r3);
        r3 = 16;
        r8.m17639P(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r10 = r8.f35498B;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r4 = r8.f35500D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = r4 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r8.f35500D = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = r10[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = (long) r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r11 = 255; // 0xff float:3.57E-43 double:1.26E-321;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = r3 & r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r6 = r8.f35500D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = r6 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r8.f35500D = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = r10[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = (long) r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = r5 & r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r9 = 8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = r5 << r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = r3 | r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r6 = r8.f35500D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = r6 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r8.f35500D = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = r10[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = (long) r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = r5 & r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r9 = 16;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = r5 << r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = r3 | r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r6 = r8.f35500D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = r6 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r8.f35500D = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = r10[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = (long) r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r11 = r11 & r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = 24;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r11 = r11 << r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = r3 | r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = 826496599; // 0x31435657 float:2.8425313E-9 double:4.08343576E-315;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        if (r5 != 0) goto L_0x06cb;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
    L_0x044a:
        r3 = r8.f35500D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r6 = r3 + 20;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r5 = r8.f35498B;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
    L_0x0450:
        r3 = r5.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = r3 + -4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        if (r6 >= r3) goto L_0x06c3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
    L_0x0455:
        r3 = r5[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        if (r3 != 0) goto L_0x06bf;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
    L_0x0459:
        r3 = r6 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = r5[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        if (r3 != 0) goto L_0x06bf;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
    L_0x045f:
        r3 = r6 + 2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r4 = r5[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        if (r4 != r3) goto L_0x06bf;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
    L_0x0466:
        r3 = r6 + 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r4 = r5[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = 15;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        if (r4 != r3) goto L_0x06bf;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
    L_0x046e:
        r3 = r5.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = java.util.Arrays.copyOfRange(r5, r6, r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r3 = java.util.Collections.singletonList(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        goto L_0x057a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
    L_0x0479:
        r2 = "video/hevc";
        r15 = new X.2tw;
        r3 = r0.f35353F;
        r15.<init>(r3);
        r3 = 21;
        r15.m17638O(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r3 = r15.m17631H();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r17 = r3 & 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r14 = r15.m17631H();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r9 = r15.f35500D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r16 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r8 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r13 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x0497:
        r12 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        if (r8 >= r14) goto L_0x04b4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x049a:
        r15.m17639P(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r6 = r15.m17635L();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r5 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04a2:
        if (r5 >= r6) goto L_0x04b1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04a4:
        r4 = r15.m17635L();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r3 = r4 + 4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r13 = r13 + r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r15.m17639P(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r5 = r5 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        goto L_0x04a2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04b1:
        r8 = r8 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        goto L_0x0497;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04b4:
        r15.m17638O(r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r11 = new byte[r13];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r10 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r9 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04bb:
        if (r10 >= r14) goto L_0x04ee;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04bd:
        r15.m17639P(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r8 = r15.m17635L();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r6 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04c5:
        if (r6 >= r8) goto L_0x04eb;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04c7:
        r5 = r15.m17635L();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r4 = X.AnonymousClass2tu.f35491C;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r3 = r4.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r19 = r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r20 = r16;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r21 = r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r22 = r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r23 = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        java.lang.System.arraycopy(r19, r20, r21, r22, r23);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r3 = r4.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r9 = r9 + r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r4 = r15.f35498B;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r3 = r15.f35500D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        java.lang.System.arraycopy(r4, r3, r11, r9, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r9 = r9 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r15.m17639P(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r6 = r6 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        goto L_0x04c5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04eb:
        r10 = r10 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        goto L_0x04bb;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04ee:
        if (r13 != 0) goto L_0x04f2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04f0:
        r4 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        goto L_0x04f6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04f2:
        r4 = java.util.Collections.singletonList(r11);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
    L_0x04f6:
        r17 = r17 + r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r3 = java.lang.Integer.valueOf(r17);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r4 = android.util.Pair.create(r4, r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
        r3 = r4.first;
        r3 = (java.util.List) r3;
        r4 = r4.second;
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r0.f35362O = r4;
        goto L_0x057a;
    L_0x050f:
        r2 = "video/avc";
        r10 = new X.2tw;
        r3 = r0.f35353F;
        r10.<init>(r3);
        r3 = 4;
        r10.m17638O(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r4 = r10.m17631H();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r3 = 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r4 = r4 & r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r9 = r4 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        if (r9 == r3) goto L_0x06f2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
    L_0x0526:
        r8 = new java.util.ArrayList;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r8.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r3 = r10.m17631H();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r6 = r3 & 31;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r5 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r4 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
    L_0x0533:
        if (r4 >= r6) goto L_0x053f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
    L_0x0535:
        r3 = X.AnonymousClass2tu.m17616D(r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r8.add(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r4 = r4 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        goto L_0x0533;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
    L_0x053f:
        r4 = r10.m17631H();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
    L_0x0543:
        if (r5 >= r4) goto L_0x054f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
    L_0x0545:
        r3 = X.AnonymousClass2tu.m17616D(r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r8.add(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r5 = r5 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        goto L_0x0543;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
    L_0x054f:
        r3 = java.lang.Integer.valueOf(r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r4 = android.util.Pair.create(r8, r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r3 = r4.first;
        r3 = (java.util.List) r3;
        r4 = r4.second;
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r0.f35362O = r4;
        goto L_0x057a;
    L_0x0566:
        r2 = "video/mp4v-es";
        r4 = r0.f35353F;
        if (r4 != 0) goto L_0x056d;
    L_0x056c:
        goto L_0x057a;
    L_0x056d:
        r3 = java.util.Collections.singletonList(r4);
        goto L_0x057a;
    L_0x0572:
        r2 = "video/mpeg2";
        goto L_0x057a;
    L_0x0575:
        r2 = "video/x-vnd.on2.vp9";
        goto L_0x057a;
    L_0x0578:
        r2 = "video/x-vnd.on2.vp8";
    L_0x057a:
        r10 = -1;
    L_0x057b:
        r4 = X.AnonymousClass2ts.m17612E(r2);
        if (r4 == 0) goto L_0x059c;
    L_0x0581:
        r4 = r24;
        r7 = java.lang.Integer.toString(r4);
        r9 = -1;
        r6 = r0.f35350C;
        r5 = r0.f35365R;
        r4 = r0.f35361N;
        r8 = r2;
        r11 = r41;
        r13 = r6;
        r14 = r5;
        r15 = r3;
        r16 = r4;
        r4 = X.AnonymousClass2qi.m17460B(r7, r8, r9, r10, r11, r13, r14, r15, r16);
        goto L_0x064d;
    L_0x059c:
        r4 = X.AnonymousClass2ts.m17613F(r2);
        if (r4 == 0) goto L_0x05e4;
    L_0x05a2:
        r4 = r0.f35356I;
        if (r4 != 0) goto L_0x05b6;
    L_0x05a6:
        r4 = r0.f35357J;
        if (r4 != r7) goto L_0x05ac;
    L_0x05aa:
        r4 = r0.f35369V;
    L_0x05ac:
        r0.f35357J = r4;
        r4 = r0.f35355H;
        if (r4 != r7) goto L_0x05b4;
    L_0x05b2:
        r4 = r0.f35360M;
    L_0x05b4:
        r0.f35355H = r4;
    L_0x05b6:
        r6 = r0.f35357J;
        if (r6 == r7) goto L_0x05c8;
    L_0x05ba:
        r5 = r0.f35355H;
        if (r5 == r7) goto L_0x05c8;
    L_0x05be:
        r4 = r0.f35360M;
        r4 = r4 * r6;
        r6 = (float) r4;
        r4 = r0.f35369V;
        r4 = r4 * r5;
        r4 = (float) r4;
        r6 = r6 / r4;
        goto L_0x05ca;
    L_0x05c8:
        r6 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x05ca:
        r4 = r24;
        r7 = java.lang.Integer.toString(r4);
        r9 = -1;
        r5 = r0.f35369V;
        r4 = r0.f35360M;
        r16 = -1;
        r8 = r2;
        r11 = r41;
        r13 = r5;
        r14 = r4;
        r15 = r3;
        r17 = r6;
        r4 = X.AnonymousClass2qi.m17463E(r7, r8, r9, r10, r11, r13, r14, r15, r16, r17);
        goto L_0x064d;
    L_0x05e4:
        r4 = "application/x-subrip";
        r4 = r4.equals(r2);
        if (r4 == 0) goto L_0x05fe;
    L_0x05ec:
        r3 = r24;
        r4 = java.lang.Integer.toString(r3);
        r6 = -1;
        r3 = r0.f35361N;
        r5 = r2;
        r7 = r41;
        r9 = r3;
        r4 = X.AnonymousClass2qi.m17461C(r4, r5, r6, r7, r9);
        goto L_0x064d;
    L_0x05fe:
        r4 = "application/vobsub";
        r4 = r4.equals(r2);
        if (r4 != 0) goto L_0x0617;
    L_0x0606:
        r4 = "application/pgs";
        r4 = r4.equals(r2);
        if (r4 == 0) goto L_0x060f;
    L_0x060e:
        goto L_0x0617;
    L_0x060f:
        r1 = new X.2qk;
        r0 = "Unexpected MIME type.";
        r1.<init>(r0);
        throw r1;
    L_0x0617:
        r4 = r24;
        r20 = java.lang.Integer.toString(r4);
        r5 = r0.f35361N;
        r22 = -1;
        r4 = new X.2qi;
        r23 = -1;
        r26 = -1;
        r27 = -1;
        r28 = -1;
        r29 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r30 = -1;
        r31 = -1;
        r33 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r36 = 0;
        r37 = -1;
        r38 = -1;
        r39 = -1;
        r40 = -1;
        r19 = r4;
        r21 = r2;
        r24 = r41;
        r32 = r5;
        r35 = r3;
        r19.<init>(r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40);
    L_0x064d:
        if (r18 != 0) goto L_0x065a;
    L_0x064f:
        r3 = r0.f35363P;
        r2 = r43;
        r2 = r2.eVA(r3);
        r0.f35364Q = r2;
        goto L_0x0660;
    L_0x065a:
        r2 = r18;
        r2 = r2.f35364Q;
        r0.f35364Q = r2;
    L_0x0660:
        r0 = r0.f35364Q;
        r0.pH(r4);
        r3 = r1.f46591p;
        r0 = r1.f46568S;
        r2 = r0.f35363P;
        r0 = r1.f46568S;
        r3.put(r2, r0);
    L_0x0670:
        r0 = 0;
        r1.f46568S = r0;
        return;
    L_0x0674:
        r2 = r1.f46560K;
        r0 = 2;
        if (r2 == r0) goto L_0x067b;
    L_0x0679:
        goto L_0x002a;
    L_0x067b:
        r0 = r1.f46578c;
        if (r0 != 0) goto L_0x0684;
    L_0x067f:
        r0 = r1.f46556G;
        r0 = r0 | r6;
        r1.f46556G = r0;
    L_0x0684:
        r2 = r1.f46591p;
        r0 = r1.f46562M;
        r0 = r2.get(r0);
        r0 = (X.AnonymousClass2su) r0;
        r2 = r1.f46561L;
        m21400D(r1, r0, r2);
        r0 = 0;
        r1.f46560K = r0;
        return;
    L_0x0697:
        r1 = new X.2qk;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r1.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x069e:
        throw r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x069f:
        r1 = new X.2qk;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r1.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        goto L_0x069e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x06a7:
        r1 = new X.2qk;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r1.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        goto L_0x069e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x06af:
        r1 = new X.2qk;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        r1.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
        goto L_0x069e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06b7 }
    L_0x06b7:
        r1 = new X.2qk;
        r0 = "Error parsing vorbis codec private";
        r1.<init>(r0);
        throw r1;
    L_0x06bf:
        r6 = r6 + 1;
        goto L_0x0450;
    L_0x06c3:
        r2 = new X.2qk;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r0 = "Failed to find FourCC VC1 initialization data";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r2.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
    L_0x06ca:
        throw r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
    L_0x06cb:
        r2 = new X.2qk;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r1.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r0 = "Unsupported FourCC compression type: ";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r1.append(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r1.append(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r0 = r1.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        r2.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
        goto L_0x06ca;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06e2 }
    L_0x06e2:
        r1 = new X.2qk;
        r0 = "Error parsing FourCC VC1 codec private";
        r1.<init>(r0);
        throw r1;
    L_0x06ea:
        r1 = new X.2qk;
        r0 = "Error parsing HEVC codec private";
        r1.<init>(r0);
        throw r1;
    L_0x06f2:
        r0 = new X.2qk;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        r0.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x06f8 }
    L_0x06f8:
        r1 = new X.2qk;
        r0 = "Error parsing AVC codec private";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.extractor.webm.WebmExtractor.B(int):void");
    }

    /* renamed from: C */
    private static AnonymousClass2sY m21399C(WebmExtractor webmExtractor) {
        if (!(webmExtractor.f46586k == -1 || webmExtractor.f46570U == -1)) {
            AnonymousClass2ti anonymousClass2ti = webmExtractor.f46566Q;
            if (!(anonymousClass2ti == null || anonymousClass2ti.f35478B == 0)) {
                anonymousClass2ti = webmExtractor.f46565P;
                if (anonymousClass2ti != null) {
                    if (anonymousClass2ti.f35478B == webmExtractor.f46566Q.f35478B) {
                        int i;
                        int i2 = webmExtractor.f46566Q.f35478B;
                        int[] iArr = new int[i2];
                        long[] jArr = new long[i2];
                        long[] jArr2 = new long[i2];
                        long[] jArr3 = new long[i2];
                        int i3 = 0;
                        for (i = 0; i < i2; i++) {
                            jArr3[i] = webmExtractor.f46566Q.m17608B(i);
                            jArr[i] = webmExtractor.f46586k + webmExtractor.f46565P.m17608B(i);
                        }
                        while (true) {
                            int i4 = i2 - 1;
                            if (i3 < i4) {
                                i = i3 + 1;
                                iArr[i3] = (int) (jArr[i] - jArr[i3]);
                                jArr2[i3] = jArr3[i] - jArr3[i3];
                                i3 = i;
                            } else {
                                iArr[i4] = (int) ((webmExtractor.f46586k + webmExtractor.f46587l) - jArr[i4]);
                                jArr2[i4] = webmExtractor.f46570U - jArr3[i4];
                                webmExtractor.f46566Q = null;
                                webmExtractor.f46565P = null;
                                return new AnonymousClass3uP(iArr, jArr, jArr2, jArr3);
                            }
                        }
                    }
                }
            }
        }
        webmExtractor.f46566Q = null;
        webmExtractor.f46565P = null;
        return AnonymousClass2sY.f35227B;
    }

    /* renamed from: C */
    public final void m21410C(int i, double d) {
        if (i == 181) {
            this.f46568S.f35365R = (int) d;
        } else if (i == 17545) {
            this.f46569T = (long) d;
        }
    }

    /* renamed from: D */
    public final void m21411D(int i, long j) {
        StringBuilder stringBuilder;
        switch (i) {
            case 131:
                this.f46568S.f35368U = (int) j;
                return;
            case 155:
                this.f46551B = m21406J(this, j);
                return;
            case 159:
                this.f46568S.f35350C = (int) j;
                return;
            case 176:
                this.f46568S.f35369V = (int) j;
                return;
            case 179:
                this.f46566Q.m17607A(m21406J(this, j));
                return;
            case 186:
                this.f46568S.f35360M = (int) j;
                return;
            case 215:
                this.f46568S.f35363P = (int) j;
                return;
            case 231:
                this.f46564O = m21406J(this, j);
                return;
            case 241:
                if (!this.f46585j) {
                    this.f46565P.m17607A(j);
                    this.f46585j = true;
                    break;
                }
                break;
            case 251:
                this.f46578c = true;
                return;
            case 16980:
                if (j == 3) {
                    break;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("ContentCompAlgo ");
                stringBuilder.append(j);
                stringBuilder.append(" not supported");
                throw new AnonymousClass2qk(stringBuilder.toString());
            case 17029:
                if (j >= 1 && j <= 2) {
                    break;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("DocTypeReadVersion ");
                stringBuilder.append(j);
                stringBuilder.append(" not supported");
                throw new AnonymousClass2qk(stringBuilder.toString());
                break;
            case 17143:
                if (j == 1) {
                    break;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("EBMLReadVersion ");
                stringBuilder.append(j);
                stringBuilder.append(" not supported");
                throw new AnonymousClass2qk(stringBuilder.toString());
            case 18401:
                if (j == 5) {
                    break;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("ContentEncAlgo ");
                stringBuilder.append(j);
                stringBuilder.append(" not supported");
                throw new AnonymousClass2qk(stringBuilder.toString());
            case 18408:
                if (j == 1) {
                    break;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("AESSettingsCipherMode ");
                stringBuilder.append(j);
                stringBuilder.append(" not supported");
                throw new AnonymousClass2qk(stringBuilder.toString());
            case 20529:
                if (j == 0) {
                    break;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("ContentEncodingOrder ");
                stringBuilder.append(j);
                stringBuilder.append(" not supported");
                throw new AnonymousClass2qk(stringBuilder.toString());
            case 20530:
                if (j == 1) {
                    break;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("ContentEncodingScope ");
                stringBuilder.append(j);
                stringBuilder.append(" not supported");
                throw new AnonymousClass2qk(stringBuilder.toString());
            case 21420:
                this.f46582g = j + this.f46586k;
                return;
            case 21680:
                this.f46568S.f35357J = (int) j;
                return;
            case 21682:
                this.f46568S.f35356I = (int) j;
                return;
            case 21690:
                this.f46568S.f35355H = (int) j;
                return;
            case 22186:
                this.f46568S.f35351D = j;
                return;
            case 22203:
                this.f46568S.f35367T = j;
                return;
            case 25188:
                this.f46568S.f35349B = (int) j;
                return;
            case 2352003:
                this.f46568S.f35354G = (int) j;
                return;
            case 2807729:
                this.f46590o = j;
                return;
        }
    }

    /* renamed from: D */
    private static void m21400D(WebmExtractor webmExtractor, AnonymousClass2su anonymousClass2su, long j) {
        AnonymousClass2su anonymousClass2su2 = anonymousClass2su;
        WebmExtractor webmExtractor2 = webmExtractor;
        if ("S_TEXT/UTF8".equals(anonymousClass2su.f35352E)) {
            Object obj;
            Object obj2 = webmExtractor.f46555F.f35498B;
            long j2 = webmExtractor.f46551B;
            if (j2 == -1) {
                obj = f46549t;
            } else {
                j2 -= ((long) ((int) (j2 / 3600000000L))) * 3600000000L;
                j2 -= (long) (60000000 * ((int) (j2 / 60000000)));
                anonymousClass2su = (int) ((j2 - ((long) (1000000 * ((int) (j2 / 1000000))))) / 1000);
                obj = String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(r6), Integer.valueOf(r9), Integer.valueOf((int) (j2 / 1000000)), Integer.valueOf(anonymousClass2su)}).getBytes();
            }
            System.arraycopy(obj, 0, obj2, 19, 12);
            AnonymousClass2sZ anonymousClass2sZ = anonymousClass2su2.f35364Q;
            AnonymousClass2tw anonymousClass2tw = webmExtractor2.f46555F;
            anonymousClass2sZ.dLA(anonymousClass2tw, anonymousClass2tw.f35499C);
            webmExtractor2.f46553D += webmExtractor2.f46555F.f35499C;
        }
        anonymousClass2su2.f35364Q.gLA(j, webmExtractor2.f46556G, webmExtractor2.f46553D, null, anonymousClass2su2.f35358K);
        webmExtractor2.f46577b = true;
        webmExtractor2.m21405I();
    }

    /* renamed from: E */
    public final void m21412E(int i, long j, long j2) {
        if (i == 160) {
            this.f46578c = false;
        } else if (i == 174) {
            this.f46568S = new AnonymousClass2su();
        } else if (i == 187) {
            this.f46585j = false;
        } else if (i == 19899) {
            this.f46580e = -1;
            this.f46582g = -1;
        } else if (i != 20533) {
            if (i != 25152) {
                if (i == 408125543) {
                    long j3 = this.f46586k;
                    if (j3 != -1) {
                        if (j3 != j) {
                            throw new AnonymousClass2qk("Multiple Segment elements not supported");
                        }
                    }
                    this.f46586k = j;
                    this.f46587l = j2;
                } else if (i == 475249515) {
                    this.f46566Q = new AnonymousClass2ti();
                    this.f46565P = new AnonymousClass2ti();
                } else if (i == 524531317 && !this.f46589n) {
                    if (this.f46567R != -1) {
                        this.f46583h = true;
                    } else {
                        this.f46571V.uLA(AnonymousClass2sY.f35227B);
                        this.f46589n = true;
                    }
                }
            }
        } else {
            this.f46568S.f35359L = true;
        }
    }

    /* renamed from: E */
    private static int[] m21401E(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    /* renamed from: F */
    public final void m21413F(int i, String str) {
        if (i != 134) {
            if (i != 17026) {
                if (i == 2274716) {
                    this.f46568S.f35361N = str;
                    return;
                }
            } else if (!"webm".equals(str)) {
                if (!"matroska".equals(str)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DocType ");
                    stringBuilder.append(str);
                    stringBuilder.append(" not supported");
                    throw new AnonymousClass2qk(stringBuilder.toString());
                }
            }
            return;
        }
        this.f46568S.f35352E = str;
    }

    /* renamed from: F */
    private boolean m21402F(AnonymousClass2sU anonymousClass2sU, long j) {
        if (this.f46583h) {
            this.f46584i = j;
            anonymousClass2sU.f35204B = this.f46567R;
            this.f46583h = false;
            return true;
        }
        if (this.f46589n) {
            long j2 = this.f46584i;
            if (j2 != -1) {
                anonymousClass2sU.f35204B = j2;
                this.f46584i = -1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    private static void m21403G(WebmExtractor webmExtractor, AnonymousClass2sO anonymousClass2sO, int i) {
        if (webmExtractor.f46579d.f35499C < i) {
            if (webmExtractor.f46579d.m17625B() < i) {
                AnonymousClass2tw anonymousClass2tw = webmExtractor.f46579d;
                anonymousClass2tw.m17636M(Arrays.copyOf(anonymousClass2tw.f35498B, Math.max(webmExtractor.f46579d.f35498B.length * 2, i)), webmExtractor.f46579d.f35499C);
            }
            anonymousClass2sO.readFully(webmExtractor.f46579d.f35498B, webmExtractor.f46579d.f35499C, i - webmExtractor.f46579d.f35499C);
            webmExtractor.f46579d.m17637N(i);
        }
    }

    /* renamed from: H */
    private int m21404H(AnonymousClass2sO anonymousClass2sO, AnonymousClass2sZ anonymousClass2sZ, int i) {
        int min;
        int A = this.f46554E.m17624A();
        if (A > 0) {
            min = Math.min(i, A);
            anonymousClass2sZ.dLA(this.f46554E, min);
        } else {
            min = anonymousClass2sZ.bLA(anonymousClass2sO, i, false);
        }
        this.f46552C += min;
        this.f46553D += min;
        return min;
    }

    /* renamed from: I */
    private void m21405I() {
        this.f46552C = 0;
        this.f46553D = 0;
        this.f46575Z = 0;
        this.f46576a = false;
        AnonymousClass2tw anonymousClass2tw = this.f46554E;
        anonymousClass2tw.f35500D = 0;
        anonymousClass2tw.f35499C = 0;
    }

    /* renamed from: J */
    private static long m21406J(WebmExtractor webmExtractor, long j) {
        long j2 = webmExtractor.f46590o;
        if (j2 != -1) {
            return AnonymousClass2u6.m17659L(j, j2, 1000);
        }
        throw new AnonymousClass2qk("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: K */
    private static void m21407K(WebmExtractor webmExtractor, AnonymousClass2sO anonymousClass2sO, AnonymousClass2su anonymousClass2su, int i) {
        if ("S_TEXT/UTF8".equals(anonymousClass2su.f35352E)) {
            int length = f46548s.length + i;
            if (webmExtractor.f46555F.m17625B() < length) {
                webmExtractor.f46555F.f35498B = Arrays.copyOf(f46548s, length + i);
            }
            anonymousClass2sO.readFully(webmExtractor.f46555F.f35498B, f46548s.length, i);
            webmExtractor.f46555F.m17638O(0);
            webmExtractor.f46555F.m17637N(length);
            return;
        }
        AnonymousClass2sZ anonymousClass2sZ = anonymousClass2su.f35364Q;
        if (!webmExtractor.f46576a) {
            if (anonymousClass2su.f35359L) {
                webmExtractor.f46556G &= -3;
                anonymousClass2sO.readFully(webmExtractor.f46579d.f35498B, 0, 1);
                webmExtractor.f46552C++;
                if ((webmExtractor.f46579d.f35498B[0] & 128) == 128) {
                    throw new AnonymousClass2qk("Extension bit is set in signal byte");
                } else if ((webmExtractor.f46579d.f35498B[0] & 1) == 1) {
                    webmExtractor.f46579d.f35498B[0] = (byte) 8;
                    webmExtractor.f46579d.m17638O(0);
                    anonymousClass2sZ.dLA(webmExtractor.f46579d, 1);
                    webmExtractor.f46553D++;
                    webmExtractor.f46556G |= 2;
                }
            } else if (anonymousClass2su.f35366S != null) {
                webmExtractor.f46554E.m17636M(anonymousClass2su.f35366S, anonymousClass2su.f35366S.length);
            }
            webmExtractor.f46576a = true;
        }
        i += webmExtractor.f46554E.f35499C;
        if (!"V_MPEG4/ISO/AVC".equals(anonymousClass2su.f35352E)) {
            if (!"V_MPEGH/ISO/HEVC".equals(anonymousClass2su.f35352E)) {
                while (true) {
                    int i2 = webmExtractor.f46552C;
                    if (i2 >= i) {
                        break;
                    }
                    webmExtractor.m21404H(anonymousClass2sO, anonymousClass2sZ, i - i2);
                }
                if ("A_VORBIS".equals(anonymousClass2su.f35352E)) {
                    webmExtractor.f46593r.m17638O(0);
                    anonymousClass2sZ.dLA(webmExtractor.f46593r, 4);
                    webmExtractor.f46553D += 4;
                }
            }
        }
        byte[] bArr = webmExtractor.f46572W.f35498B;
        bArr[0] = (byte) 0;
        bArr[1] = (byte) 0;
        bArr[2] = (byte) 0;
        int i3 = anonymousClass2su.f35362O;
        int i4 = 4 - anonymousClass2su.f35362O;
        while (webmExtractor.f46552C < i) {
            int i5 = webmExtractor.f46575Z;
            if (i5 == 0) {
                int min = Math.min(i3, webmExtractor.f46554E.m17624A());
                anonymousClass2sO.readFully(bArr, i4 + min, i3 - min);
                if (min > 0) {
                    webmExtractor.f46554E.m17626C(bArr, i4, min);
                }
                webmExtractor.f46552C += i3;
                webmExtractor.f46572W.m17638O(0);
                webmExtractor.f46575Z = webmExtractor.f46572W.m17633J();
                webmExtractor.f46573X.m17638O(0);
                anonymousClass2sZ.dLA(webmExtractor.f46573X, 4);
                webmExtractor.f46553D += 4;
            } else {
                webmExtractor.f46575Z = i5 - webmExtractor.m21404H(anonymousClass2sO, anonymousClass2sZ, i5);
            }
        }
        if ("A_VORBIS".equals(anonymousClass2su.f35352E)) {
            webmExtractor.f46593r.m17638O(0);
            anonymousClass2sZ.dLA(webmExtractor.f46593r, 4);
            webmExtractor.f46553D += 4;
        }
    }

    public final boolean PUA(AnonymousClass2sO anonymousClass2sO) {
        return new AnonymousClass2ss().m17576A(anonymousClass2sO);
    }

    public final int bIA(AnonymousClass2sO anonymousClass2sO, AnonymousClass2sU anonymousClass2sU) {
        int i = 0;
        this.f46577b = false;
        boolean z = true;
        while (z && !this.f46577b) {
            z = this.f46574Y.eIA(anonymousClass2sO);
            if (z && m21402F(anonymousClass2sU, anonymousClass2sO.gP())) {
                return 1;
            }
        }
        if (!z) {
            i = -1;
        }
        return i;
    }

    public final void sLA() {
        this.f46564O = -1;
        this.f46560K = 0;
        this.f46574Y.reset();
        AnonymousClass2st anonymousClass2st = this.f46592q;
        anonymousClass2st.f35347C = 0;
        anonymousClass2st.f35346B = 0;
        m21405I();
    }

    public final void zV(AnonymousClass2sP anonymousClass2sP) {
        this.f46571V = anonymousClass2sP;
    }
}
