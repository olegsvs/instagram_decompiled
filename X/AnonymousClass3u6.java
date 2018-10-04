package X;

import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3u6 */
public final class AnonymousClass3u6 implements AnonymousClass2qm, AnonymousClass2tG, AnonymousClass2qn {
    /* renamed from: B */
    public IOException f46274B;
    /* renamed from: C */
    public int f46275C;
    /* renamed from: D */
    public final Handler f46276D;
    /* renamed from: E */
    public final AnonymousClass2r1 f46277E;
    /* renamed from: F */
    public final int f46278F;
    /* renamed from: G */
    private final int f46279G;
    /* renamed from: H */
    private final AnonymousClass2rM f46280H;
    /* renamed from: I */
    private long f46281I;
    /* renamed from: J */
    private long f46282J;
    /* renamed from: K */
    private final AnonymousClass2r2 f46283K;
    /* renamed from: L */
    private AnonymousClass2rO f46284L;
    /* renamed from: M */
    private AnonymousClass2qi f46285M;
    /* renamed from: N */
    private long f46286N;
    /* renamed from: O */
    private final boolean f46287O;
    /* renamed from: P */
    private int f46288P;
    /* renamed from: Q */
    private long f46289Q = -1;
    /* renamed from: R */
    private long f46290R;
    /* renamed from: S */
    private AnonymousClass45L f46291S;
    /* renamed from: T */
    private long f46292T;
    /* renamed from: U */
    private final AnonymousClass2qL f46293U;
    /* renamed from: V */
    private AnonymousClass3uj f46294V;
    /* renamed from: W */
    private boolean f46295W;
    /* renamed from: X */
    private final LinkedList f46296X;
    /* renamed from: Y */
    private final int f46297Y;
    /* renamed from: Z */
    private boolean f46298Z;
    /* renamed from: a */
    private boolean[] f46299a;
    /* renamed from: b */
    private long f46300b;
    /* renamed from: c */
    private boolean f46301c;
    /* renamed from: d */
    private final List f46302d;
    /* renamed from: e */
    private int f46303e;
    /* renamed from: f */
    private final SparseArray f46304f;
    /* renamed from: g */
    private int f46305g;
    /* renamed from: h */
    private boolean[] f46306h;

    public AnonymousClass3u6(AnonymousClass2rM anonymousClass2rM, AnonymousClass2qL anonymousClass2qL, int i, Handler handler, AnonymousClass2r1 anonymousClass2r1, int i2, int i3, boolean z) {
        this.f46280H = anonymousClass2rM;
        this.f46293U = anonymousClass2qL;
        this.f46279G = i;
        this.f46276D = handler;
        this.f46277E = anonymousClass2r1;
        this.f46278F = i2;
        this.f46297Y = i3;
        this.f46283K = new AnonymousClass2r2();
        List linkedList = new LinkedList();
        this.f46296X = linkedList;
        this.f46302d = Collections.unmodifiableList(linkedList);
        SparseArray sparseArray = new SparseArray(2);
        this.f46304f = sparseArray;
        sparseArray.put(0, new AnonymousClass3uR(anonymousClass2qL.PI()));
        this.f46304f.put(1, new AnonymousClass3uR(anonymousClass2qL.PI()));
        this.f46299a = new boolean[2];
        this.f46306h = new boolean[2];
        this.f46305g = 0;
        this.f46300b = Long.MIN_VALUE;
        this.f46287O = z;
    }

    /* renamed from: B */
    public static final long m21265B(long j) {
        return j / 1000;
    }

    /* renamed from: C */
    private void m21266C() {
        this.f46283K.f34950B = null;
        this.f46274B = null;
        this.f46275C = 0;
    }

    /* renamed from: D */
    private void m21267D() {
        for (int i = 0; i < this.f46304f.size(); i++) {
            ((AnonymousClass3uR) this.f46304f.valueAt(i)).m21363A();
        }
    }

    public final void DH(int i, long j) {
        int J = m21273J(i);
        AnonymousClass2td.m17606E(this.f46305g == 2);
        AnonymousClass2td.m17606E(this.f46306h[J] ^ true);
        this.f46288P++;
        this.f46299a[J] = false;
        this.f46306h[J] = true;
        if (this.f46288P == 1) {
            this.f46280H.CH(i);
            this.f46293U.BJA(this, this.f46279G);
            this.f46284L = null;
            this.f46285M = null;
            this.f46286N = j;
            this.f46292T = j;
            this.f46298Z = true;
            m21279P(j);
        }
    }

    /* renamed from: E */
    private static boolean m21268E(AnonymousClass3u6 anonymousClass3u6, int i) {
        AnonymousClass3u6 anonymousClass3u62 = anonymousClass3u6;
        if (anonymousClass3u6.f46296X.size() <= i) {
            return false;
        }
        long j = 0;
        long j2 = ((AnonymousClass45L) anonymousClass3u6.f46296X.getLast()).f49130C;
        AnonymousClass45L anonymousClass45L = null;
        while (anonymousClass3u62.f46296X.size() > i) {
            anonymousClass45L = (AnonymousClass45L) anonymousClass3u62.f46296X.removeLast();
            j = anonymousClass45L.f49131D;
            anonymousClass3u62.f46295W = false;
        }
        ((AnonymousClass3uR) anonymousClass3u62.f46304f.valueAt(0)).m21364B(anonymousClass45L.f49791C);
        Handler handler = anonymousClass3u62.f46276D;
        if (!(handler == null || anonymousClass3u62.f46277E == null)) {
            AnonymousClass0OR.D(handler, new AnonymousClass2rK(anonymousClass3u62, j, j2), -1635543088);
        }
        return true;
    }

    /* renamed from: F */
    private static void m21269F(AnonymousClass3u6 anonymousClass3u6) {
        AnonymousClass2r2 anonymousClass2r2 = anonymousClass3u6.f46283K;
        anonymousClass2r2.f34951C = false;
        anonymousClass2r2.f34953E = anonymousClass3u6.f46302d.size();
        AnonymousClass2rM anonymousClass2rM = anonymousClass3u6.f46280H;
        List list = anonymousClass3u6.f46302d;
        long j = anonymousClass3u6.f46300b;
        if (j == Long.MIN_VALUE) {
            j = anonymousClass3u6.f46286N;
        }
        anonymousClass2rM.nJ(list, j, anonymousClass3u6.f46283K);
        anonymousClass3u6.f46295W = anonymousClass3u6.f46283K.f34951C;
    }

    /* renamed from: G */
    private long m21270G() {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.f46304f.size(); i++) {
            j = Math.max(j, ((AnonymousClass3uR) this.f46304f.valueAt(i)).f46443C);
        }
        return j == Long.MIN_VALUE ? this.f46286N : j;
    }

    /* renamed from: H */
    private long m21271H() {
        if (m21274K()) {
            return this.f46300b;
        }
        return this.f46295W ? -1 : ((AnonymousClass45L) this.f46296X.getLast()).f49130C;
    }

    public final AnonymousClass2qi HM(int i) {
        boolean z;
        if (this.f46305g != 2) {
            if (!this.f46306h[m21273J(i)]) {
                z = false;
                AnonymousClass2td.m17606E(z);
                return this.f46280H.HM(i);
            }
        }
        z = true;
        AnonymousClass2td.m17606E(z);
        return this.f46280H.HM(i);
    }

    /* renamed from: I */
    private AnonymousClass3uR m21272I(int i) {
        return (AnonymousClass3uR) this.f46304f.get(m21273J(i));
    }

    /* renamed from: J */
    private int m21273J(int i) {
        AnonymousClass2qi HM = this.f46280H.HM(i);
        if (HM != null) {
            if (HM.f34866O != "application/eia-608") {
                return 0;
            }
        } else if (i != this.f46280H.PT() - 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: K */
    private boolean m21274K() {
        return this.f46300b != Long.MIN_VALUE;
    }

    /* renamed from: L */
    private static void m21275L(AnonymousClass3u6 anonymousClass3u6) {
        AnonymousClass3u6 anonymousClass3u62 = anonymousClass3u6;
        AnonymousClass2tH anonymousClass2tH = anonymousClass3u62.f46283K.f34950B;
        if (anonymousClass2tH != null) {
            anonymousClass3u62.f46281I = SystemClock.elapsedRealtime();
            long j = anonymousClass3u62.f46289Q;
            long j2 = j > 0 ? anonymousClass3u62.f46281I - j : -1;
            if (anonymousClass2tH instanceof AnonymousClass45L) {
                AnonymousClass45L anonymousClass45L = (AnonymousClass45L) anonymousClass2tH;
                anonymousClass45L.m22817E((AnonymousClass3uR) anonymousClass3u62.f46304f.valueAt(0), (AnonymousClass3uR) anonymousClass3u62.f46304f.valueAt(1));
                anonymousClass3u62.f46296X.add(anonymousClass45L);
                if (anonymousClass3u62.m21274K()) {
                    anonymousClass3u62.f46300b = Long.MIN_VALUE;
                }
                anonymousClass3u62.m21278O(anonymousClass45L.f46188C.f35408J, anonymousClass45L.f46192G, anonymousClass45L.f46191F, anonymousClass45L.f46189D, anonymousClass45L.f49131D, anonymousClass45L.f49130C, j2);
            } else {
                if (anonymousClass2tH instanceof AnonymousClass43e) {
                    ((AnonymousClass43e) anonymousClass2tH).f49122B = (AnonymousClass3uR) anonymousClass3u62.f46304f.valueAt(1);
                }
                anonymousClass3u62.m21278O(anonymousClass2tH.f46188C.f35408J, anonymousClass2tH.f46192G, anonymousClass2tH.f46191F, anonymousClass2tH.f46189D, -1, -1, j2);
            }
            anonymousClass3u62.f46294V.hUA(anonymousClass2tH, anonymousClass3u62);
        }
    }

    public final long LJ(long j) {
        Iterator it = this.f46296X.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            AnonymousClass43f anonymousClass43f = (AnonymousClass43f) it.next();
            long min = Math.min(m21270G(), anonymousClass43f.f49130C) - Math.max(anonymousClass43f.f49131D, j);
            if (min > 0) {
                j2 += min;
            }
        }
        AnonymousClass43f anonymousClass43f2 = this.f46291S;
        return (anonymousClass43f2 == null || anonymousClass43f2.f49131D > j || j > this.f46291S.f49130C) ? j2 : j2 + (this.f46291S.f49130C - Math.max(this.f46291S.f49131D, j));
    }

    /* renamed from: M */
    private static void m21276M(AnonymousClass3u6 anonymousClass3u6, long j) {
        Handler handler = anonymousClass3u6.f46276D;
        if (handler != null && anonymousClass3u6.f46277E != null) {
            AnonymousClass0OR.D(handler, new AnonymousClass2rI(anonymousClass3u6, j), 1303749092);
        }
    }

    /* renamed from: N */
    private void m21277N(long j, int i, int i2, AnonymousClass2rO anonymousClass2rO, long j2, long j3, long j4, long j5) {
        Handler handler = this.f46276D;
        if (handler != null && this.f46277E != null) {
            AnonymousClass0OR.D(handler, new AnonymousClass2rH(this, j, i, i2, anonymousClass2rO, j2, j3, j4, j5), -93616337);
        }
    }

    public final long NJ() {
        boolean z = true;
        AnonymousClass2td.m17606E(this.f46305g == 2);
        if (this.f46288P <= 0) {
            z = false;
        }
        AnonymousClass2td.m17606E(z);
        if (m21274K()) {
            return this.f46300b;
        }
        if (this.f46295W) {
            return -3;
        }
        return m21270G();
    }

    /* renamed from: O */
    private void m21278O(long j, int i, int i2, AnonymousClass2rO anonymousClass2rO, long j2, long j3, long j4) {
        Handler handler = this.f46276D;
        if (handler != null && this.f46277E != null) {
            AnonymousClass0OR.D(handler, new AnonymousClass2rG(this, j, i, i2, anonymousClass2rO, j2, j3, j4), -684315724);
        }
    }

    /* renamed from: P */
    private void m21279P(long j) {
        this.f46300b = j;
        this.f46295W = false;
        if (this.f46294V.uX()) {
            this.f46294V.CE();
            return;
        }
        m21267D();
        this.f46296X.clear();
        m21266C();
        m21281R();
    }

    public final boolean PF(int i, long j, boolean z) {
        AnonymousClass2td.m17606E(this.f46305g == 2);
        AnonymousClass2td.m17606E(this.f46306h[m21273J(i)]);
        this.f46301c = z;
        this.f46286N = j;
        this.f46280H.OF(j, z);
        m21281R();
        if (this.f46295W) {
            return true;
        }
        if (m21272I(i).m21367E()) {
            return false;
        }
        return true;
    }

    public final int PT() {
        AnonymousClass2td.m17606E(this.f46305g == 2);
        return this.f46280H.PT();
    }

    /* renamed from: Q */
    private void m21280Q() {
        this.f46274B = null;
        AnonymousClass3u0 anonymousClass3u0 = this.f46283K.f34950B;
        if (!(anonymousClass3u0 instanceof AnonymousClass45L)) {
            AnonymousClass3u6.m21269F(this);
            AnonymousClass3u6.m21268E(this, this.f46283K.f34953E);
            if (this.f46283K.f34950B != anonymousClass3u0) {
                AnonymousClass3u6.m21276M(this, anonymousClass3u0.mo5179A());
                AnonymousClass3u6.m21275L(this);
            }
        } else if (anonymousClass3u0 == this.f46296X.getFirst()) {
            this.f46294V.hUA(anonymousClass3u0, this);
            return;
        } else {
            AnonymousClass3u0 anonymousClass3u02 = (AnonymousClass45L) this.f46296X.removeLast();
            AnonymousClass2td.m17606E(anonymousClass3u0 == anonymousClass3u02);
            AnonymousClass3u6.m21269F(this);
            this.f46296X.add(anonymousClass3u02);
            if (this.f46283K.f34950B != anonymousClass3u0) {
                AnonymousClass3u6.m21276M(this, anonymousClass3u0.mo5179A());
                AnonymousClass3u6.m21268E(this, this.f46283K.f34953E);
                this.f46274B = null;
                this.f46275C = 0;
                AnonymousClass3u6.m21275L(this);
            }
        }
        this.f46294V.hUA(anonymousClass3u0, this);
    }

    /* renamed from: R */
    private void m21281R() {
        boolean z;
        boolean E;
        long j;
        Iterator it;
        long max;
        boolean xVA;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long H = m21271H();
        Object obj = this.f46274B != null ? 1 : null;
        if (!r6.f46294V.uX()) {
            if (obj == null) {
                z = false;
                if (!z && ((r6.f46283K.f34950B == null && H != -1) || elapsedRealtime - r6.f46290R > 2000)) {
                    r6.f46290R = elapsedRealtime;
                    AnonymousClass3u6.m21269F(r6);
                    E = AnonymousClass3u6.m21268E(r6, r6.f46283K.f34953E);
                    if (r6.f46283K.f34950B == null) {
                        H = -1;
                    } else if (E) {
                        H = m21271H();
                    }
                }
                j = H - r6.f46286N;
                if (r6.f46287O) {
                    it = r6.f46296X.iterator();
                    while (it.hasNext()) {
                        AnonymousClass43f anonymousClass43f = (AnonymousClass43f) it.next();
                        max = anonymousClass43f.f49130C - Math.max(anonymousClass43f.f49131D, r6.f46286N);
                        j = 0;
                        if (max > 0) {
                            j = max + 0;
                        }
                    }
                }
                xVA = r6.f46293U.xVA(r6, j, r6.f46286N, H, z, r6.f46301c);
                if (obj == null) {
                    if (elapsedRealtime - r6.f46282J >= Math.min((((long) r6.f46275C) - 1) * 1000, 5000)) {
                        m21280Q();
                    }
                } else if (!r6.f46294V.uX() && xVA) {
                    AnonymousClass3u6.m21275L(r6);
                    return;
                }
            }
        }
        z = true;
        r6.f46290R = elapsedRealtime;
        AnonymousClass3u6.m21269F(r6);
        E = AnonymousClass3u6.m21268E(r6, r6.f46283K.f34953E);
        if (r6.f46283K.f34950B == null) {
            H = -1;
        } else if (E) {
            H = m21271H();
        }
        j = H - r6.f46286N;
        if (r6.f46287O) {
            it = r6.f46296X.iterator();
            while (it.hasNext()) {
                AnonymousClass43f anonymousClass43f2 = (AnonymousClass43f) it.next();
                max = anonymousClass43f2.f49130C - Math.max(anonymousClass43f2.f49131D, r6.f46286N);
                j = 0;
                if (max > 0) {
                    j = max + 0;
                }
            }
        }
        xVA = r6.f46293U.xVA(r6, j, r6.f46286N, H, z, r6.f46301c);
        if (obj == null) {
            if (!r6.f46294V.uX()) {
            }
        } else if (elapsedRealtime - r6.f46282J >= Math.min((((long) r6.f46275C) - 1) * 1000, 5000)) {
            m21280Q();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void XG(int r3) {
        /*
        r2 = this;
        r1 = r2.m21273J(r3);
        r0 = r2.f46306h;
        r0 = r0[r1];
        X.AnonymousClass2td.m17606E(r0);
        r0 = r2.f46288P;
        r0 = r0 + -1;
        r2.f46288P = r0;
        if (r0 != 0) goto L_0x0066;
    L_0x0013:
        r0 = 2;
        r2.f46305g = r0;
        r1 = r2.f46280H;	 Catch:{ all -> 0x0041 }
        r0 = r2.f46296X;	 Catch:{ all -> 0x0041 }
        r1.YG(r0);	 Catch:{ all -> 0x0041 }
        r0 = r2.f46293U;
        r0.nVA(r2);
        r0 = r2.f46294V;
        r0 = r0.uX();
        if (r0 == 0) goto L_0x0030;
    L_0x002a:
        r0 = r2.f46294V;
        r0.CE();
        goto L_0x0066;
    L_0x0030:
        r2.m21267D();
        r0 = r2.f46296X;
        r0.clear();
        r2.m21266C();
        r0 = r2.f46293U;
        r0.iVA();
        goto L_0x0066;
    L_0x0041:
        r1 = move-exception;
        r0 = r2.f46293U;
        r0.nVA(r2);
        r0 = r2.f46294V;
        r0 = r0.uX();
        if (r0 == 0) goto L_0x0055;
    L_0x004f:
        r0 = r2.f46294V;
        r0.CE();
        goto L_0x0065;
    L_0x0055:
        r2.m21267D();
        r0 = r2.f46296X;
        r0.clear();
        r2.m21266C();
        r0 = r2.f46293U;
        r0.iVA();
    L_0x0065:
        throw r1;
    L_0x0066:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3u6.XG(int):void");
    }

    public final int gIA(int i, long j, AnonymousClass2qj anonymousClass2qj, AnonymousClass2ql anonymousClass2ql) {
        AnonymousClass3u6 anonymousClass3u6 = this;
        int J = m21273J(i);
        AnonymousClass2td.m17606E(this.f46306h[J]);
        this.f46286N = j;
        if (!this.f46299a[m21273J(i)]) {
            if (!m21274K()) {
                AnonymousClass3uR I = m21272I(i);
                int i2 = 1;
                int E = I.m21367E() ^ 1;
                AnonymousClass3u0 anonymousClass3u0 = (AnonymousClass45L) this.f46296X.getFirst();
                int i3 = 0;
                AnonymousClass2qj anonymousClass2qj2 = anonymousClass2qj;
                if (J != 1) {
                    while (E != 0 && this.f46296X.size() > 1 && ((AnonymousClass45L) this.f46296X.get(1)).f49791C <= I.m21365C()) {
                        this.f46291S = (AnonymousClass45L) this.f46296X.removeFirst();
                        AnonymousClass45L anonymousClass45L = (AnonymousClass45L) this.f46296X.getFirst();
                    }
                    AnonymousClass2rO anonymousClass2rO = this.f46284L;
                    if (anonymousClass2rO == null || !anonymousClass2rO.equals(anonymousClass3u0.f46189D)) {
                        AnonymousClass2rO anonymousClass2rO2 = anonymousClass3u0.f46189D;
                        i = anonymousClass3u0.f46191F;
                        j = anonymousClass3u0.f49131D;
                        anonymousClass2qj = anonymousClass3u0.f46188C.f35418T.toString();
                        Handler handler = anonymousClass3u6.f46276D;
                        if (!(handler == null || anonymousClass3u6.f46277E == null)) {
                            AnonymousClass0OR.D(handler, new AnonymousClass2rL(anonymousClass3u6, anonymousClass2rO2, i, j, anonymousClass2qj), 823159062);
                        }
                        anonymousClass3u6.f46284L = anonymousClass3u0.f46189D;
                    }
                    if (E != 0 || anonymousClass3u0.f49792D) {
                        AnonymousClass2qi D = anonymousClass3u0.mo5458D();
                        if (!D.equals(anonymousClass3u6.f46285M)) {
                            anonymousClass2qj2.f34876C = D;
                            anonymousClass2qj2.f34875B = anonymousClass3u0.mo5457C();
                            anonymousClass3u6.f46285M = D;
                            return -4;
                        }
                    }
                } else if (this.f46298Z) {
                    anonymousClass2qj2.f34876C = I.f46442B;
                    anonymousClass2qj2.f34875B = anonymousClass3u0.mo5457C();
                    this.f46298Z = false;
                    return -4;
                }
                if (E != 0) {
                    AnonymousClass2ql anonymousClass2ql2 = anonymousClass2ql;
                    if (I.m21366D(anonymousClass2ql2)) {
                        if (anonymousClass2ql2.f34881F >= anonymousClass3u6.f46292T) {
                            i2 = 0;
                        }
                        int i4 = anonymousClass2ql2.f34879D;
                        if (i2 != 0) {
                            i3 = 134217728;
                        }
                        anonymousClass2ql2.f34879D = i4 | i3;
                        return -3;
                    }
                } else if (anonymousClass3u6.f46295W) {
                    return -1;
                }
            }
        }
        return -2;
    }

    public final long jIA(int i) {
        int J = m21273J(i);
        boolean[] zArr = this.f46299a;
        if (!zArr[J]) {
            return Long.MIN_VALUE;
        }
        zArr[J] = false;
        return this.f46292T;
    }

    public final boolean nHA(long j) {
        boolean z;
        int i = this.f46305g;
        if (i != 1) {
            if (i != 2) {
                z = false;
                AnonymousClass2td.m17606E(z);
                if (this.f46305g == 2) {
                    return true;
                }
                if (!this.f46280H.mHA()) {
                    return false;
                }
                if (this.f46280H.PT() > 0) {
                    AnonymousClass3uR anonymousClass3uR = (AnonymousClass3uR) this.f46304f.valueAt(1);
                    AnonymousClass2rM anonymousClass2rM = this.f46280H;
                    anonymousClass3uR.pH(anonymousClass2rM.HM(anonymousClass2rM.PT() - 1));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Loader:");
                    stringBuilder.append(this.f46280H.HM(0).f34866O);
                    this.f46294V = new AnonymousClass3uj(stringBuilder.toString());
                }
                this.f46305g = 2;
                return true;
            }
        }
        z = true;
        AnonymousClass2td.m17606E(z);
        if (this.f46305g == 2) {
            return true;
        }
        if (!this.f46280H.mHA()) {
            return false;
        }
        if (this.f46280H.PT() > 0) {
            AnonymousClass3uR anonymousClass3uR2 = (AnonymousClass3uR) this.f46304f.valueAt(1);
            AnonymousClass2rM anonymousClass2rM2 = this.f46280H;
            anonymousClass3uR2.pH(anonymousClass2rM2.HM(anonymousClass2rM2.PT() - 1));
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Loader:");
            stringBuilder2.append(this.f46280H.HM(0).f34866O);
            this.f46294V = new AnonymousClass3uj(stringBuilder2.toString());
        }
        this.f46305g = 2;
        return true;
    }

    public final void pp(AnonymousClass2tH anonymousClass2tH) {
        AnonymousClass3u0 anonymousClass3u0 = this.f46283K.f34950B;
        this.f46289Q = -1;
        AnonymousClass3u6.m21276M(this, anonymousClass3u0.mo5179A());
        m21266C();
        if (this.f46288P > 0) {
            m21279P(this.f46300b);
            return;
        }
        m21267D();
        this.f46296X.clear();
        m21266C();
        this.f46293U.iVA();
    }

    public final void release() {
        AnonymousClass2td.m17606E(this.f46303e > 0);
        int i = this.f46303e - 1;
        this.f46303e = i;
        if (i == 0) {
            AnonymousClass3uj anonymousClass3uj = this.f46294V;
            if (anonymousClass3uj != null) {
                anonymousClass3uj.release();
                this.f46294V = null;
            }
            this.f46305g = 0;
        }
    }

    public final void sb() {
        IOException iOException = this.f46274B;
        if (iOException != null) {
            if (this.f46275C > this.f46297Y) {
                throw iOException;
            }
        }
        if (this.f46283K.f34950B == null) {
            this.f46280H.sb();
        }
    }

    public final void up(AnonymousClass2tH anonymousClass2tH) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f46289Q = elapsedRealtime;
        long j = elapsedRealtime - this.f46281I;
        AnonymousClass3u0 anonymousClass3u0 = this.f46283K.f34950B;
        this.f46280H.df(anonymousClass3u0);
        if (anonymousClass3u0 instanceof AnonymousClass45L) {
            AnonymousClass45L anonymousClass45L = (AnonymousClass45L) anonymousClass3u0;
            m21277N(anonymousClass3u0.mo5179A(), anonymousClass45L.f46192G, anonymousClass45L.f46191F, anonymousClass45L.f46189D, anonymousClass45L.f49131D, anonymousClass45L.f49130C, elapsedRealtime, j);
        } else {
            m21277N(anonymousClass3u0.mo5179A(), anonymousClass3u0.f46192G, anonymousClass3u0.f46191F, anonymousClass3u0.f46189D, -1, -1, elapsedRealtime, j);
        }
        m21266C();
        m21281R();
    }

    public final AnonymousClass2qm xIA() {
        boolean z;
        int i = this.f46305g;
        if (i != 0) {
            if (this.f46303e <= 0 || i != 1) {
                z = false;
                AnonymousClass2td.m17606E(z);
                this.f46303e++;
                this.f46305g = 1;
                return this;
            }
        }
        z = true;
        AnonymousClass2td.m17606E(z);
        this.f46303e++;
        this.f46305g = 1;
        return this;
    }

    public final void zLA(long j) {
        int i = 0;
        AnonymousClass2td.m17606E(this.f46305g == 2);
        AnonymousClass2td.m17606E(this.f46288P > 0);
        long j2 = m21274K() ? this.f46300b : this.f46286N;
        this.f46286N = j;
        this.f46292T = j;
        if (j2 != j) {
            int K = m21274K() ^ 1;
            int i2 = 0;
            while (K != 0 && i2 < this.f46304f.size()) {
                K &= ((AnonymousClass3uR) this.f46304f.valueAt(i2)).m21368F(j);
                i2++;
            }
            if (K != 0) {
                AnonymousClass3uR I = m21272I(0);
                K = I.m21367E() ^ 1;
                while (K != 0 && this.f46296X.size() > 1 && ((AnonymousClass45L) this.f46296X.get(1)).f49791C <= I.m21365C()) {
                    this.f46296X.removeFirst();
                }
            } else {
                m21279P(j);
            }
            while (true) {
                boolean[] zArr = this.f46299a;
                if (i < zArr.length) {
                    zArr[i] = true;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void zp(AnonymousClass2tH anonymousClass2tH, IOException iOException) {
        long j;
        Handler handler;
        AnonymousClass3u6 anonymousClass3u6 = this;
        AnonymousClass3u0 anonymousClass3u0 = this.f46283K.f34950B;
        Exception exception = iOException;
        this.f46274B = iOException;
        this.f46275C++;
        this.f46282J = SystemClock.elapsedRealtime();
        if (anonymousClass3u0 != null && (anonymousClass3u0 instanceof AnonymousClass45L)) {
            AnonymousClass45L anonymousClass45L = (AnonymousClass45L) anonymousClass3u0;
            if (anonymousClass45L != null) {
                j = anonymousClass45L.f49131D;
                anonymousClass2tH = anonymousClass45L.f49130C;
                handler = anonymousClass3u6.f46276D;
                if (!(handler == null || anonymousClass3u6.f46277E == null)) {
                    AnonymousClass0OR.D(handler, new AnonymousClass2rJ(anonymousClass3u6, exception, j, anonymousClass2tH), -1613434370);
                }
                anonymousClass3u6.f46280H.ff(anonymousClass3u0, exception);
                m21281R();
            }
        }
        j = -1;
        anonymousClass2tH = -1;
        handler = anonymousClass3u6.f46276D;
        AnonymousClass0OR.D(handler, new AnonymousClass2rJ(anonymousClass3u6, exception, j, anonymousClass2tH), -1613434370);
        anonymousClass3u6.f46280H.ff(anonymousClass3u0, exception);
        m21281R();
    }
}
