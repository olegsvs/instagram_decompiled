package X;

import android.content.Context;
import com.instagram.model.hashtag.Hashtag;
import java.util.List;

/* renamed from: X.1Oq */
public final class AnonymousClass1Oq {
    /* renamed from: B */
    public AnonymousClass1Ot f18018B;
    /* renamed from: C */
    public String f18019C;
    /* renamed from: D */
    public String f18020D;
    /* renamed from: E */
    public String f18021E;
    /* renamed from: F */
    public int f18022F;
    /* renamed from: G */
    public AnonymousClass1Or f18023G;
    /* renamed from: H */
    private String f18024H;
    /* renamed from: I */
    private String f18025I;

    /* renamed from: A */
    public final String m11196A() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18042B : null;
    }

    /* renamed from: B */
    private AnonymousClass1P0 m11194B() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        if (anonymousClass1Ot != null) {
            if (anonymousClass1Ot.f18059S != null) {
                List list = this.f18018B.f18059S;
                if (!list.isEmpty()) {
                    return (AnonymousClass1P0) list.get(list.size() - 1);
                }
            }
        }
        return null;
    }

    /* renamed from: B */
    public final List m11197B() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18043C : null;
    }

    /* renamed from: C */
    private static java.lang.Double m11195C(X.AnonymousClass1Oq r2) {
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
        r0 = r2.f18018B;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0 = r0.f18073g;
        goto L_0x0008;
    L_0x0007:
        r0 = 0;
    L_0x0008:
        r2 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r2;
    L_0x000c:
        r0 = java.lang.Double.parseDouble(r0);	 Catch:{ NumberFormatException -> 0x0015 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0015 }
        return r0;	 Catch:{ NumberFormatException -> 0x0015 }
    L_0x0015:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Oq.C(X.1Oq):java.lang.Double");
    }

    /* renamed from: C */
    public final String m11198C() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18046F : null;
    }

    /* renamed from: D */
    public final String m11199D() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18048H : null;
    }

    /* renamed from: E */
    public final String m11200E(String str) {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? (String) anonymousClass1Ot.f18049I.get(str) : null;
    }

    /* renamed from: F */
    public final AnonymousClass0Ci m11201F() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return (anonymousClass1Ot == null || anonymousClass1Ot.f18051K == null) ? null : this.f18018B.f18051K.f18096B;
    }

    /* renamed from: G */
    public final Hashtag m11202G() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return (anonymousClass1Ot == null || anonymousClass1Ot.f18052L == null) ? null : this.f18018B.f18052L;
    }

    /* renamed from: H */
    public final String m11203H(Context context) {
        if (this.f18024H == null) {
            Double C = AnonymousClass1Oq.m11195C(this);
            if (C == null) {
                return null;
            }
            this.f18024H = AnonymousClass0dw.m6140H(context, C.doubleValue());
        }
        return this.f18024H;
    }

    /* renamed from: I */
    public final int m11204I() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18053M : 0;
    }

    /* renamed from: J */
    public final String m11205J() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18055O : null;
    }

    /* renamed from: K */
    public final String m11206K(Context context) {
        if (this.f18025I == null) {
            Double C = AnonymousClass1Oq.m11195C(this);
            if (C == null) {
                return null;
            }
            this.f18025I = AnonymousClass0dw.m6138F(context, C.doubleValue());
        }
        return this.f18025I;
    }

    /* renamed from: L */
    public final String m11207L() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18061U : null;
    }

    /* renamed from: M */
    public final String m11208M(String str) {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? (String) anonymousClass1Ot.f18062V.get(str) : null;
    }

    /* renamed from: N */
    public final String m11209N() {
        AnonymousClass1P0 B = m11194B();
        if (B != null) {
            return B.f18099B;
        }
        return null;
    }

    /* renamed from: O */
    public final List m11210O() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18059S : null;
    }

    /* renamed from: P */
    public final String m11211P() {
        AnonymousClass1P0 B = m11194B();
        if (B != null) {
            return B.f18100C;
        }
        return null;
    }

    /* renamed from: Q */
    public final List m11212Q() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18063W : null;
    }

    /* renamed from: R */
    public final String m11213R() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18064X : null;
    }

    /* renamed from: S */
    public final String m11214S() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18065Y : null;
    }

    /* renamed from: T */
    public final String m11215T() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18066Z : null;
    }

    /* renamed from: U */
    public final String m11216U() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18071e : null;
    }

    /* renamed from: V */
    public final String m11217V() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18074h : null;
    }

    /* renamed from: W */
    public final String m11218W() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return anonymousClass1Ot != null ? anonymousClass1Ot.f18075i : null;
    }

    /* renamed from: X */
    public final boolean m11219X() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return (anonymousClass1Ot == null || anonymousClass1Ot.f18045E == null) ? false : true;
    }

    /* renamed from: Y */
    public final boolean m11220Y() {
        AnonymousClass1Ot anonymousClass1Ot = this.f18018B;
        return (anonymousClass1Ot == null || anonymousClass1Ot.f18054N == null || !this.f18018B.f18054N.booleanValue()) ? false : true;
    }

    /* renamed from: Z */
    public final boolean m11221Z(AnonymousClass1d6 anonymousClass1d6) {
        return m11194B() != null && m11194B().contains(anonymousClass1d6);
    }

    /* renamed from: a */
    public final boolean m11222a() {
        return this.f18018B != null && Boolean.TRUE.equals(this.f18018B.f18045E);
    }

    /* renamed from: b */
    public final boolean m11223b() {
        return "facebook".equals(m11199D());
    }

    /* renamed from: c */
    public final void m11224c() {
        if (m11219X()) {
            this.f18018B.f18045E = Boolean.valueOf(true);
        }
    }

    /* renamed from: d */
    public final void m11225d(boolean z) {
        ((AnonymousClass1Ot) AnonymousClass0LH.m2927E(this.f18018B)).f18054N = Boolean.valueOf(z);
    }
}
