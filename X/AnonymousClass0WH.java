package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0WH */
public final class AnonymousClass0WH {
    /* renamed from: B */
    public final AnonymousClass0Ci f5950B;
    /* renamed from: C */
    public final AnonymousClass0XB f5951C = new AnonymousClass1T3(this);
    /* renamed from: D */
    public final AnonymousClass0XB f5952D = new AnonymousClass1hT(this);
    /* renamed from: E */
    public final AnonymousClass0XB f5953E = new AnonymousClass1bB(this);
    /* renamed from: F */
    public final AnonymousClass0XB f5954F = new AnonymousClass1hU(this);
    /* renamed from: G */
    public final AnonymousClass0XB f5955G = new AnonymousClass1hW(this);
    /* renamed from: H */
    public final List f5956H = new ArrayList();
    /* renamed from: I */
    public final List f5957I = new ArrayList();
    /* renamed from: J */
    public final AnonymousClass0Vw f5958J;
    /* renamed from: K */
    private final AnonymousClass0XB f5959K = new AnonymousClass1hS(this);
    /* renamed from: L */
    private final AnonymousClass0XB f5960L = new AnonymousClass1hV(this);

    public AnonymousClass0WH(AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Vw anonymousClass0Vw, List list) {
        this.f5950B = anonymousClass0Ci;
        this.f5958J = anonymousClass0Vw;
        if (list != null) {
            this.f5956H.addAll(list);
            Collections.sort(this.f5956H, AnonymousClass0W7.GB);
        }
        AnonymousClass0WH.m5061I(this);
        m5081R();
    }

    /* renamed from: A */
    public final synchronized AnonymousClass0W7 m5064A(AnonymousClass0W7 anonymousClass0W7, boolean z) {
        return m5065B(anonymousClass0W7, true, z);
    }

    /* renamed from: B */
    public final AnonymousClass0W7 m5065B(AnonymousClass0W7 anonymousClass0W7, boolean z, boolean z2) {
        AnonymousClass0W7 N = AnonymousClass0Wy.m5202N(this.f5957I, anonymousClass0W7);
        AnonymousClass0W7 N2 = AnonymousClass0Wy.m5202N(this.f5956H, anonymousClass0W7);
        if (N2 != null) {
            N = N2;
        } else if (N == null) {
            N = anonymousClass0W7;
        }
        if (N != anonymousClass0W7) {
            N.m5036l(anonymousClass0W7);
        }
        String Q = this.f5958J.m4945Q();
        String str = N.f5885O;
        if (z2 && (Q == null || Q.compareTo(str) > 0)) {
            this.f5958J.m4973s(str);
        }
        AnonymousClass0Wy.m5190B(this.f5956H, N);
        if (z) {
            AnonymousClass0WH.m5061I(this);
            if (AnonymousClass0V0.EXPIRING_MEDIA.equals(anonymousClass0W7.f5915s)) {
                m5071H();
                m5081R();
            }
        }
        return N;
    }

    /* renamed from: B */
    public static List m5054B(AnonymousClass0WH anonymousClass0WH, AnonymousClass0WS anonymousClass0WS) {
        return AnonymousClass0WX.m5147E(anonymousClass0WH.f5956H, anonymousClass0WS, AnonymousClass0Wy.f6075C);
    }

    /* renamed from: C */
    public static List m5055C(AnonymousClass0WH anonymousClass0WH, AnonymousClass0Vw anonymousClass0Vw, int i) {
        AnonymousClass0WS R = anonymousClass0Vw.m4946R();
        List list = anonymousClass0WH.f5956H;
        AnonymousClass0WU anonymousClass0WU = AnonymousClass0Wx.f6073C;
        AnonymousClass0WV anonymousClass0WV = new AnonymousClass0WV(anonymousClass0WU, anonymousClass0WU.f5989C, i, 0);
        AnonymousClass0WW anonymousClass0WW = AnonymousClass0Wy.f6075C;
        R = AnonymousClass0WX.m5148F(list, R, anonymousClass0WV, anonymousClass0WW);
        list = AnonymousClass0WX.m5147E(anonymousClass0WH.f5956H, R, anonymousClass0WW);
        AnonymousClass0WS X = anonymousClass0Vw.m4952X();
        List J = anonymousClass0WH.m5073J(X);
        AnonymousClass0WV N = anonymousClass0WH.m5077N(i);
        AnonymousClass0WW anonymousClass0WW2 = AnonymousClass0Wy.f6075C;
        X = AnonymousClass0WX.m5148F(J, X, N, anonymousClass0WW2);
        List H = AnonymousClass0Ww.m5186H(list, AnonymousClass0WX.m5147E(J, X, anonymousClass0WW2), AnonymousClass0W7.GB, false);
        AnonymousClass0WH.m5062J(anonymousClass0Vw, R, list);
        AnonymousClass0WH.m5063K(anonymousClass0Vw, X, H);
        return H;
    }

    /* renamed from: C */
    public final synchronized List m5066C(List list, String str) {
        List arrayList;
        String str2;
        AnonymousClass0Vw anonymousClass0Vw;
        AnonymousClass0W7 B;
        if (str == null) {
            str = AnonymousClass0Wy.m5193E(list);
        }
        String V = this.f5958J.m4950V();
        if (V != null) {
            if (str != null) {
                if (AnonymousClass0Wx.f6072B.compare(V, str) > 0) {
                    str2 = V;
                    anonymousClass0Vw = this.f5958J;
                    synchronized (anonymousClass0Vw) {
                        anonymousClass0Vw.f5846t = str2;
                    }
                    arrayList = new ArrayList();
                    for (AnonymousClass0W7 anonymousClass0W7 : list) {
                        B = m5065B(anonymousClass0W7, false, false);
                        if ((B == anonymousClass0W7 || V == null || AnonymousClass0Wx.f6072B.compare(anonymousClass0W7.f5885O, V) > 0) && str != null && AnonymousClass0Wx.f6072B.compare(B.f5885O, str) <= 0) {
                            arrayList.add(B);
                        }
                    }
                    if (((Boolean) AnonymousClass0CC.ra.m845G()).booleanValue()) {
                        m5071H();
                    }
                    AnonymousClass0WH.m5061I(this);
                    m5081R();
                }
            }
        }
        str2 = str;
        anonymousClass0Vw = this.f5958J;
        synchronized (anonymousClass0Vw) {
            anonymousClass0Vw.f5846t = str2;
        }
        arrayList = new ArrayList();
        for (AnonymousClass0W7 anonymousClass0W72 : list) {
            B = m5065B(anonymousClass0W72, false, false);
            arrayList.add(B);
        }
        if (((Boolean) AnonymousClass0CC.ra.m845G()).booleanValue()) {
            m5071H();
        }
        AnonymousClass0WH.m5061I(this);
        m5081R();
        return arrayList;
    }

    /* renamed from: D */
    public static List m5056D(AnonymousClass0WH anonymousClass0WH) {
        return AnonymousClass0WX.m5147E(anonymousClass0WH.f5956H, anonymousClass0WH.f5958J.m4946R(), AnonymousClass0Wy.f6075C);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public final synchronized java.util.List m5067D(java.util.List r8, java.lang.String r9, java.lang.String r10) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f5958J;	 Catch:{ all -> 0x0068 }
        r3 = r0.m4951W();	 Catch:{ all -> 0x0068 }
        r1 = r7.f5958J;	 Catch:{ all -> 0x0068 }
        r0 = X.AnonymousClass0Wy.m5207S(r3, r9);	 Catch:{ all -> 0x0068 }
        monitor-enter(r1);	 Catch:{ all -> 0x0068 }
        r1.f5847u = r0;	 Catch:{ all -> 0x006b }
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
        r1 = r7.f5958J;	 Catch:{ all -> 0x0068 }
        monitor-enter(r1);	 Catch:{ all -> 0x0068 }
        r4 = r1.f5848v;	 Catch:{ all -> 0x006e }
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
        r1 = r7.f5958J;	 Catch:{ all -> 0x0068 }
        r0 = X.AnonymousClass0Wy.m5206R(r4, r10);	 Catch:{ all -> 0x0068 }
        monitor-enter(r1);	 Catch:{ all -> 0x0068 }
        r1.f5848v = r0;	 Catch:{ all -> 0x0071 }
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0068 }
        r5.<init>();	 Catch:{ all -> 0x0068 }
        r6 = r8.iterator();	 Catch:{ all -> 0x0068 }
    L_0x002a:
        r0 = r6.hasNext();	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x005d;
    L_0x0030:
        r2 = r6.next();	 Catch:{ all -> 0x0068 }
        r2 = (X.AnonymousClass0W7) r2;	 Catch:{ all -> 0x0068 }
        r0 = 0;
        r0 = r7.m5065B(r2, r0, r0);	 Catch:{ all -> 0x0068 }
        if (r0 == r2) goto L_0x0059;
    L_0x003d:
        if (r3 == 0) goto L_0x004b;
    L_0x003f:
        r0 = X.AnonymousClass0Wx.f6073C;	 Catch:{ all -> 0x0068 }
        r1 = r0.f5988B;	 Catch:{ all -> 0x0068 }
        r0 = r2.f5885O;	 Catch:{ all -> 0x0068 }
        r0 = r1.compare(r0, r3);	 Catch:{ all -> 0x0068 }
        if (r0 >= 0) goto L_0x0059;
    L_0x004b:
        if (r4 == 0) goto L_0x002a;
    L_0x004d:
        r0 = X.AnonymousClass0Wx.f6073C;	 Catch:{ all -> 0x0068 }
        r1 = r0.f5988B;	 Catch:{ all -> 0x0068 }
        r0 = r2.f5885O;	 Catch:{ all -> 0x0068 }
        r0 = r1.compare(r0, r4);	 Catch:{ all -> 0x0068 }
        if (r0 > 0) goto L_0x002a;
    L_0x0059:
        r5.add(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x002a;
    L_0x005d:
        r7.m5071H();	 Catch:{ all -> 0x0068 }
        X.AnonymousClass0WH.m5061I(r7);	 Catch:{ all -> 0x0068 }
        r7.m5081R();	 Catch:{ all -> 0x0068 }
        monitor-exit(r7);
        return r5;
    L_0x0068:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x006b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
    L_0x006d:
        throw r0;	 Catch:{ all -> 0x0068 }
    L_0x006e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
        goto L_0x006d;
    L_0x0071:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0WH.D(java.util.List, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: E */
    public static AnonymousClass0WS m5057E(AnonymousClass0WS anonymousClass0WS, AnonymousClass0WS anonymousClass0WS2) {
        Object obj = (anonymousClass0WS.m5141A() || anonymousClass0WS2.m5141A() || anonymousClass0WS.f5986D.f5988B.compare(anonymousClass0WS.f5984B, anonymousClass0WS2.f5985C) <= 0 || anonymousClass0WS.f5986D.f5988B.compare(anonymousClass0WS2.f5984B, anonymousClass0WS.f5985C) <= 0) ? null : 1;
        return obj != null ? anonymousClass0WS.m5143C(anonymousClass0WS2) : anonymousClass0WS;
    }

    /* renamed from: E */
    public final synchronized boolean m5068E(AnonymousClass0W7 anonymousClass0W7) {
        if (this.f5957I.contains(anonymousClass0W7)) {
            return false;
        }
        AnonymousClass0Wy.m5190B(this.f5957I, anonymousClass0W7);
        AnonymousClass0WH.m5060H(this);
        return true;
    }

    /* renamed from: F */
    public final synchronized AnonymousClass0Wz m5069F(String str, AnonymousClass0Wt anonymousClass0Wt) {
        if (str != null) {
            if (!str.equals(this.f5958J.m4945Q())) {
                this.f5958J.m4945Q();
                return new AnonymousClass0Wz(null, null, null, null);
            }
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        Object arrayList4 = new ArrayList();
        List arrayList5 = new ArrayList(anonymousClass0Wt.f6045S);
        Collections.sort(arrayList5, AnonymousClass0W7.GB);
        String str2 = anonymousClass0Wt.f6047U;
        AnonymousClass1T0 anonymousClass1T0 = new AnonymousClass1T0(AnonymousClass0Wy.m5201M(str2, arrayList5), AnonymousClass0Wy.m5198J(str2, arrayList5));
        AnonymousClass0Wy.m5205Q(AnonymousClass0Wy.m5204P(this.f5956H, anonymousClass1T0), AnonymousClass0Wy.m5204P(arrayList5, anonymousClass1T0), arrayList, arrayList2, arrayList3);
        AnonymousClass0WH.m5059G(this, arrayList, arrayList4);
        arrayList3.addAll(arrayList4);
        String M = AnonymousClass0Wy.m5201M(anonymousClass0Wt.f6047U, arrayList5);
        AnonymousClass0Vw anonymousClass0Vw = this.f5958J;
        anonymousClass0Vw.m4973s(AnonymousClass0Wy.m5200L(M, anonymousClass0Vw.m4945Q()));
        anonymousClass0Vw = this.f5958J;
        boolean G = anonymousClass0Wt.m5173G();
        synchronized (anonymousClass0Vw) {
            anonymousClass0Vw.f5806F = G;
        }
        m5071H();
        return new AnonymousClass0Wz(Collections.unmodifiableList(arrayList), Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList4));
    }

    /* renamed from: F */
    public static String m5058F(String str, String str2) {
        return str2 != null ? (String) AnonymousClass1hX.m12572C(str, str2, AnonymousClass0Wx.f6072B) : null;
    }

    /* renamed from: G */
    public static void m5059G(AnonymousClass0WH anonymousClass0WH, ArrayList arrayList, ArrayList arrayList2) {
        if (!anonymousClass0WH.f5957I.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                AnonymousClass0W7 N = AnonymousClass0Wy.m5202N(anonymousClass0WH.f5957I, (AnonymousClass0W7) listIterator.previous());
                if (N != null) {
                    listIterator.remove();
                    arrayList2.add(N);
                }
            }
        }
    }

    /* renamed from: G */
    public final synchronized void m5070G(String str) {
        int size;
        AnonymousClass0W7 L = this.f5958J.m4940L();
        int i = 0;
        if (str == null) {
            size = this.f5956H.size();
        } else if (L == null || AnonymousClass0Wx.f6072B.compare(L.f5885O, str) < 0) {
            size = AnonymousClass0Wy.m5191C(this.f5956H, str);
            if (size < 0) {
                size ^= -1;
            }
        } else {
            size = 0;
        }
        while (i < size) {
            AnonymousClass0W7 anonymousClass0W7 = (AnonymousClass0W7) this.f5956H.get(i);
            if (anonymousClass0W7.m5024Z(this.f5950B)) {
                AnonymousClass0Gn.m1876C("DirectThreadEntry", "Client message count was forcefully incremented");
                anonymousClass0W7.m5034j(1);
            }
            i++;
        }
        m5081R();
    }

    /* renamed from: H */
    public final synchronized void m5071H() {
        AnonymousClass0WS R = this.f5958J.m4946R();
        AnonymousClass0WS X = this.f5958J.m4952X();
        AnonymousClass0WS E = AnonymousClass0WH.m5057E(X, R);
        if (!E.equals(X)) {
            AnonymousClass0WH.m5063K(this.f5958J, E, this.f5956H);
        }
    }

    /* renamed from: H */
    public static void m5060H(AnonymousClass0WH anonymousClass0WH) {
        AnonymousClass0W7 anonymousClass0W7 = (AnonymousClass0W7) AnonymousClass0Ww.m5185G(AnonymousClass0WH.m5056D(anonymousClass0WH));
        AnonymousClass0W7 anonymousClass0W72 = (AnonymousClass0W7) AnonymousClass0Ww.m5185G(anonymousClass0WH.f5957I);
        AnonymousClass0Vw anonymousClass0Vw = anonymousClass0WH.f5958J;
        anonymousClass0W72 = (AnonymousClass0W7) AnonymousClass1hX.m12571B(anonymousClass0W7, anonymousClass0W72, AnonymousClass0W7.GB);
        synchronized (anonymousClass0Vw) {
            anonymousClass0Vw.f5821U = anonymousClass0W72;
            if (anonymousClass0Vw.f5821U != null) {
                anonymousClass0Vw.f5820T = Long.valueOf(anonymousClass0W72.m5009K());
            }
        }
        anonymousClass0Vw = anonymousClass0WH.f5958J;
        AnonymousClass0W7 anonymousClass0W73 = (AnonymousClass0W7) AnonymousClass0Ww.m5183E(AnonymousClass0WH.m5056D(anonymousClass0WH), anonymousClass0WH.f5953E);
        synchronized (anonymousClass0Vw) {
            anonymousClass0Vw.f5824X = anonymousClass0W73;
        }
        anonymousClass0Vw = anonymousClass0WH.f5958J;
        anonymousClass0W73 = (AnonymousClass0W7) AnonymousClass0Ww.m5183E(anonymousClass0WH.f5956H, anonymousClass0WH.f5951C);
        synchronized (anonymousClass0Vw) {
            anonymousClass0Vw.f5822V = anonymousClass0W73;
        }
    }

    /* renamed from: I */
    public final synchronized List m5072I() {
        return m5073J(this.f5958J.m4952X());
    }

    /* renamed from: I */
    public static void m5061I(AnonymousClass0WH anonymousClass0WH) {
        AnonymousClass0WH.m5060H(anonymousClass0WH);
        anonymousClass0WH.m5082S();
    }

    /* renamed from: J */
    public final synchronized List m5073J(AnonymousClass0WS anonymousClass0WS) {
        return AnonymousClass0Ww.m5181C(AnonymousClass0WX.m5147E(this.f5956H, anonymousClass0WS, AnonymousClass0Wy.f6075C), ((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.eI)).booleanValue() ? this.f5952D : this.f5954F);
    }

    /* renamed from: J */
    public static void m5062J(AnonymousClass0Vw anonymousClass0Vw, AnonymousClass0WS anonymousClass0WS, List list) {
        synchronized (anonymousClass0Vw) {
            AnonymousClass1b8 K = AnonymousClass0Wy.m5199K(list, anonymousClass0WS);
            anonymousClass0Vw.m4973s(K.f20408B);
            boolean z = K.f20409C;
            synchronized (anonymousClass0Vw) {
                anonymousClass0Vw.f5806F = z;
            }
        }
    }

    /* renamed from: K */
    public final synchronized AnonymousClass0W7 m5074K(String str) {
        int binarySearch;
        AnonymousClass0W7 anonymousClass0W7 = new AnonymousClass0W7();
        anonymousClass0W7.m5028d(str);
        binarySearch = Collections.binarySearch(this.f5956H, anonymousClass0W7, AnonymousClass0W7.GB);
        return binarySearch >= 0 ? (AnonymousClass0W7) this.f5956H.get(binarySearch) : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: K */
    public static void m5063K(X.AnonymousClass0Vw r2, X.AnonymousClass0WS r3, java.util.List r4) {
        /*
        monitor-enter(r2);
        r1 = X.AnonymousClass0Wy.m5196H(r4, r3);	 Catch:{ all -> 0x0022 }
        r0 = r1.f20408B;	 Catch:{ all -> 0x0022 }
        monitor-enter(r2);	 Catch:{ all -> 0x0022 }
        r2.f5846t = r0;	 Catch:{ all -> 0x0025 }
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        r0 = r1.f20409C;	 Catch:{ all -> 0x0022 }
        r2.m4968n(r0);	 Catch:{ all -> 0x0022 }
        r0 = r3.f5985C;	 Catch:{ all -> 0x0022 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0022 }
        monitor-enter(r2);	 Catch:{ all -> 0x0022 }
        r2.f5848v = r0;	 Catch:{ all -> 0x0028 }
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        r0 = r3.f5984B;	 Catch:{ all -> 0x0022 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0022 }
        monitor-enter(r2);	 Catch:{ all -> 0x0022 }
        r2.f5847u = r0;	 Catch:{ all -> 0x002b }
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        return;
    L_0x0022:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        throw r0;
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
    L_0x0027:
        throw r0;	 Catch:{ all -> 0x0022 }
    L_0x0028:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        goto L_0x0027;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0WH.K(X.0Vw, X.0WS, java.util.List):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: L */
    public final synchronized X.AnonymousClass0W7 m5075L(X.AnonymousClass0V0 r6, java.lang.String r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.f5957I;	 Catch:{ all -> 0x0047 }
        r4 = r0.size();	 Catch:{ all -> 0x0047 }
        r3 = 0;
        r2 = 0;
    L_0x0009:
        if (r2 >= r4) goto L_0x0024;
    L_0x000b:
        r0 = r5.f5957I;	 Catch:{ all -> 0x0047 }
        r1 = r0.get(r2);	 Catch:{ all -> 0x0047 }
        r1 = (X.AnonymousClass0W7) r1;	 Catch:{ all -> 0x0047 }
        r0 = r1.f5915s;	 Catch:{ all -> 0x0047 }
        if (r6 != r0) goto L_0x0021;
    L_0x0017:
        r0 = r1.f5875E;	 Catch:{ all -> 0x0047 }
        r0 = r7.equals(r0);	 Catch:{ all -> 0x0047 }
        if (r0 == 0) goto L_0x0021;
    L_0x001f:
        monitor-exit(r5);
        return r1;
    L_0x0021:
        r2 = r2 + 1;
        goto L_0x0009;
    L_0x0024:
        r0 = r5.f5956H;	 Catch:{ all -> 0x0047 }
        r2 = r0.size();	 Catch:{ all -> 0x0047 }
    L_0x002a:
        if (r3 >= r2) goto L_0x0044;
    L_0x002c:
        r0 = r5.f5956H;	 Catch:{ all -> 0x0047 }
        r1 = r0.get(r3);	 Catch:{ all -> 0x0047 }
        r1 = (X.AnonymousClass0W7) r1;	 Catch:{ all -> 0x0047 }
        r0 = r1.f5915s;	 Catch:{ all -> 0x0047 }
        if (r6 != r0) goto L_0x0041;
    L_0x0038:
        r0 = r1.f5875E;	 Catch:{ all -> 0x0047 }
        r0 = r7.equals(r0);	 Catch:{ all -> 0x0047 }
        if (r0 == 0) goto L_0x0041;
    L_0x0040:
        goto L_0x001f;
    L_0x0041:
        r3 = r3 + 1;
        goto L_0x002a;
    L_0x0044:
        r0 = 0;
        monitor-exit(r5);
        return r0;
    L_0x0047:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0WH.L(X.0V0, java.lang.String):X.0W7");
    }

    /* renamed from: M */
    public final synchronized AnonymousClass0W7 m5076M(AnonymousClass0V0 anonymousClass0V0, AnonymousClass0OA anonymousClass0OA) {
        for (AnonymousClass0W7 anonymousClass0W7 : this.f5957I) {
            if (anonymousClass0W7.f5915s == anonymousClass0V0) {
                AnonymousClass0WE anonymousClass0WE = anonymousClass0W7.f5877G;
                if (anonymousClass0WE != null && anonymousClass0WE.f5941E.getId().equals(anonymousClass0OA.getId())) {
                    return anonymousClass0W7;
                }
            }
        }
        return null;
    }

    /* renamed from: N */
    public final AnonymousClass0WV m5077N(int i) {
        if (((Boolean) AnonymousClass0CC.eI.m845G()).booleanValue()) {
            AnonymousClass0W7 L = this.f5958J.m4940L();
            if (L != null) {
                return new AnonymousClass0WV(AnonymousClass0Wx.f6073C, L.f5885O, ((Integer) AnonymousClass0CC.fI.m845G()).intValue(), ((Integer) AnonymousClass0CC.hI.m845G()).intValue());
            }
            i = AnonymousClass0Wx.f6073C;
            return new AnonymousClass0WV(i, i.f5990D, 0, ((Integer) AnonymousClass0CC.hI.m845G()).intValue());
        }
        AnonymousClass0WU anonymousClass0WU = AnonymousClass0Wx.f6073C;
        return new AnonymousClass0WV(anonymousClass0WU, anonymousClass0WU.f5990D, 0, i);
    }

    /* renamed from: O */
    public final synchronized AnonymousClass0W6 m5078O(String str, String str2, boolean z) {
        AnonymousClass0W7 K = m5074K(str);
        if (K != null) {
            if (K.f5921y != null) {
                AnonymousClass0X1 anonymousClass0X1 = K.f5921y;
                K.m5034j(anonymousClass0X1.f6088H + 1);
                if (!z) {
                    K.m5035k(str2);
                }
                AnonymousClass0W7 L = this.f5958J.m4940L();
                if (anonymousClass0X1.f6088H == 1 && L != null && AnonymousClass0Wx.f6072B.compare(L.f5885O, str) == 0) {
                    m5081R();
                }
                return new AnonymousClass0W6(this.f5958J.m4934F(), null, null, Collections.singletonList(K));
            }
        }
        AnonymousClass0Gn.m1876C("DirectThreadEntry", "Visual message is missing from thread entry");
        return null;
    }

    /* renamed from: P */
    public final synchronized List m5079P(String str) {
        boolean booleanValue = ((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.eI)).booleanValue();
        if (AnonymousClass0Wx.f6072B.compare(str, this.f5958J.m4945Q()) < 0) {
            return Collections.emptyList();
        }
        String str2;
        ListIterator listIterator = this.f5956H.listIterator(this.f5956H.size());
        List arrayList = new ArrayList();
        AnonymousClass0W7 anonymousClass0W7 = (AnonymousClass0W7) AnonymousClass0Ww.m5183E(this.f5956H, this.f5951C);
        Object W;
        if (booleanValue) {
            W = this.f5958J.m4951W();
        } else {
            W = this.f5958J.m4950V();
        }
        while (listIterator.hasPrevious()) {
            AnonymousClass0W7 anonymousClass0W72 = (AnonymousClass0W7) listIterator.previous();
            String str3 = anonymousClass0W72.f5885O;
            if (str3 == null) {
                AnonymousClass0Gn.m1876C("DirectThreadEntry", "message with null id within mSortedCachedMessages list");
            } else if (AnonymousClass0Wx.f6072B.compare(str3, str) < 0) {
                if ((anonymousClass0W7 == null || !AnonymousClass0W7.m4991B(anonymousClass0W7, anonymousClass0W72)) && (anonymousClass0W72.f5915s != AnonymousClass0V0.EXPIRING_MEDIA || r4 == null || AnonymousClass0Wx.f6073C.f5988B.compare(str3, r4) >= 0)) {
                    arrayList.add(anonymousClass0W72);
                    listIterator.remove();
                } else {
                    arrayList.add(anonymousClass0W72);
                }
            }
        }
        int C = AnonymousClass0Wy.m5191C(this.f5956H, str);
        if (C < 0) {
            C ^= -1;
        }
        AnonymousClass0Vw anonymousClass0Vw = this.f5958J;
        if (C < this.f5956H.size()) {
            str2 = ((AnonymousClass0W7) this.f5956H.get(C)).f5885O;
        } else {
            str2 = null;
        }
        anonymousClass0Vw.m4973s(str2);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: Q */
    public final synchronized void m5080Q() {
        AnonymousClass0W7 anonymousClass0W7 = (AnonymousClass0W7) AnonymousClass0Ww.m5182D(AnonymousClass0WH.m5054B(this, this.f5958J.m4952X()), this.f5960L);
        AnonymousClass0Vw anonymousClass0Vw = this.f5958J;
        if (anonymousClass0W7 != null) {
            if (anonymousClass0W7.m5024Z(this.f5950B)) {
                anonymousClass0W7 = null;
            }
        }
        synchronized (anonymousClass0Vw) {
            anonymousClass0Vw.f5830d = anonymousClass0W7;
        }
    }

    /* renamed from: R */
    public final synchronized void m5081R() {
        if (((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.eI)).booleanValue()) {
            m5080Q();
        }
        synchronized (this) {
            AnonymousClass0Vw anonymousClass0Vw = this.f5958J;
            AnonymousClass0W7 anonymousClass0W7 = (AnonymousClass0W7) AnonymousClass0Ww.m5182D(AnonymousClass0WH.m5054B(this, this.f5958J.m4952X()), this.f5954F);
            synchronized (anonymousClass0Vw) {
                anonymousClass0Vw.f5831e = anonymousClass0W7;
            }
        }
    }

    /* renamed from: S */
    public final synchronized void m5082S() {
        AnonymousClass0Vw anonymousClass0Vw = this.f5958J;
        AnonymousClass0W7 anonymousClass0W7 = (AnonymousClass0W7) AnonymousClass0Ww.m5183E(this.f5956H, this.f5959K);
        synchronized (anonymousClass0Vw) {
            anonymousClass0Vw.f5823W = anonymousClass0W7;
        }
    }
}
