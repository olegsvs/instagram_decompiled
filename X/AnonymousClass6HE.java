package X;

import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.6HE */
public final class AnonymousClass6HE extends AnonymousClass6CE {
    /* renamed from: B */
    public final Comparator f73953B;
    /* renamed from: C */
    public Object f73954C;
    /* renamed from: D */
    public Object f73955D;
    /* renamed from: E */
    private final AnonymousClass5eW f73956E;
    /* renamed from: F */
    private final AnonymousClass5eV f73957F;
    /* renamed from: G */
    private final AnonymousClass5eW f73958G;
    /* renamed from: H */
    private final AnonymousClass5eV f73959H;

    public AnonymousClass6HE(Comparator comparator, Iterator it, Iterator it2, AnonymousClass5eV anonymousClass5eV, AnonymousClass5eV anonymousClass5eV2) {
        this.f73953B = comparator;
        this.f73956E = new AnonymousClass5eW(it);
        this.f73958G = new AnonymousClass5eW(it2);
        this.f73957F = anonymousClass5eV;
        this.f73959H = anonymousClass5eV2;
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object mo6780A() {
        return mo6781B();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public final X.AnonymousClass5eU mo6781B() {
        /*
        r6 = this;
        r0 = r6.f73956E;
        r0 = r0.m28185A();
        if (r0 != 0) goto L_0x0018;
    L_0x0008:
        r0 = r6.f73958G;
        r0 = r0.m28185A();
        if (r0 != 0) goto L_0x0018;
    L_0x0010:
        r0 = X.AnonymousClass5e5.DONE;
        r6.f72879B = r0;
        r0 = 0;
        r0 = (X.AnonymousClass5eU) r0;
        return r0;
    L_0x0018:
        r0 = r6.f73956E;
        r0 = r0.m28185A();
        r1 = 0;
        if (r0 == 0) goto L_0x0057;
    L_0x0021:
        r2 = r6.f73957F;
        r0 = r6.f73956E;
        r0 = r0.m28187C();
        r3 = r2.YH(r0);
        r2 = r6.f73954C;
        if (r2 == 0) goto L_0x0056;
    L_0x0031:
        r0 = r6.f73953B;
        r0 = r0.compare(r3, r2);
        if (r0 <= 0) goto L_0x003b;
    L_0x0039:
        r4 = 1;
        goto L_0x003c;
    L_0x003b:
        r4 = 0;
    L_0x003c:
        r2 = new java.lang.StringBuilder;
        r0 = "Left iterator keys must be strictly ascending. (";
        r2.<init>(r0);
        r0 = r6.f73954C;
        r2.append(r0);
        r0 = " ";
        r2.append(r0);
        r2.append(r3);
        r0 = r2.toString();
        if (r4 == 0) goto L_0x0106;
    L_0x0056:
        goto L_0x0058;
    L_0x0057:
        r3 = r1;
    L_0x0058:
        r0 = r6.f73958G;
        r0 = r0.m28185A();
        if (r0 == 0) goto L_0x0096;
    L_0x0060:
        r2 = r6.f73959H;
        r0 = r6.f73958G;
        r0 = r0.m28187C();
        r2 = r2.YH(r0);
        r4 = r6.f73955D;
        if (r4 == 0) goto L_0x0095;
    L_0x0070:
        r0 = r6.f73953B;
        r0 = r0.compare(r2, r4);
        if (r0 <= 0) goto L_0x007a;
    L_0x0078:
        r5 = 1;
        goto L_0x007b;
    L_0x007a:
        r5 = 0;
    L_0x007b:
        r4 = new java.lang.StringBuilder;
        r0 = "Right iterator keys must be strictly ascending. (";
        r4.<init>(r0);
        r0 = r6.f73955D;
        r4.append(r0);
        r0 = " ";
        r4.append(r0);
        r4.append(r2);
        r0 = r4.toString();
        if (r5 == 0) goto L_0x0106;
    L_0x0095:
        goto L_0x0097;
    L_0x0096:
        r2 = r1;
    L_0x0097:
        r0 = r6.f73956E;
        r0 = r0.m28185A();
        if (r0 != 0) goto L_0x00b2;
    L_0x009f:
        r0 = r6.f73958G;
        r0 = r0.m28185A();
        if (r0 == 0) goto L_0x00b2;
    L_0x00a7:
        r0 = r6.f73958G;
        r0 = r0.m28186B();
        r0 = X.AnonymousClass6HE.m29886B(r1, r0);
        return r0;
    L_0x00b2:
        r0 = r6.f73956E;
        r0 = r0.m28185A();
        if (r0 == 0) goto L_0x00cd;
    L_0x00ba:
        r0 = r6.f73958G;
        r0 = r0.m28185A();
        if (r0 != 0) goto L_0x00cd;
    L_0x00c2:
        r0 = r6.f73956E;
        r0 = r0.m28186B();
        r0 = X.AnonymousClass6HE.m29886B(r0, r1);
        return r0;
    L_0x00cd:
        r0 = r6.f73953B;
        r0 = r0.compare(r3, r2);
        if (r0 <= 0) goto L_0x00e2;
    L_0x00d5:
        r6.f73955D = r2;
        r0 = r6.f73958G;
        r0 = r0.m28186B();
        r0 = X.AnonymousClass6HE.m29886B(r1, r0);
        return r0;
    L_0x00e2:
        if (r0 >= 0) goto L_0x00f1;
    L_0x00e4:
        r6.f73954C = r3;
        r0 = r6.f73956E;
        r0 = r0.m28186B();
        r0 = X.AnonymousClass6HE.m29886B(r0, r1);
        return r0;
    L_0x00f1:
        r6.f73955D = r2;
        r6.f73954C = r3;
        r0 = r6.f73956E;
        r1 = r0.m28186B();
        r0 = r6.f73958G;
        r0 = r0.m28186B();
        r0 = X.AnonymousClass6HE.m29886B(r1, r0);
        return r0;
    L_0x0106:
        r1 = new java.lang.IllegalStateException;
        r0 = java.lang.String.valueOf(r0);
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.6HE.B():X.5eU");
    }

    /* renamed from: B */
    private static final AnonymousClass5eU m29886B(Object obj, Object obj2) {
        return new AnonymousClass5eU(obj, obj2);
    }
}
