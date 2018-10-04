package X;

/* renamed from: X.0vy */
public final class AnonymousClass0vy {
    /* renamed from: B */
    public final AnonymousClass0hq f12184B;
    /* renamed from: C */
    private final boolean f12185C = ((Boolean) AnonymousClass0CC.iU.m845G()).booleanValue();
    /* renamed from: D */
    private final AnonymousClass0Ns f12186D;

    public AnonymousClass0vy(AnonymousClass0hq anonymousClass0hq, AnonymousClass0Ns anonymousClass0Ns) {
        this.f12184B = anonymousClass0hq;
        this.f12186D = anonymousClass0Ns;
    }

    /* renamed from: A */
    public final AnonymousClass0bP m8383A(String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0P7 anonymousClass0P7, int i) {
        if (!AnonymousClass0bN.m5547K(anonymousClass0P7, anonymousClass0PZ)) {
            return null;
        }
        AnonymousClass0bP E = AnonymousClass0bN.m5541E(AnonymousClass0bN.m5538B(str), anonymousClass0P7, anonymousClass0PZ);
        E.nB = i;
        AnonymousClass0vy.m8382C(this, E);
        return E;
    }

    /* renamed from: B */
    public final AnonymousClass0bP m8384B(String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0P7 anonymousClass0P7, int i, long j) {
        AnonymousClass0bP E = AnonymousClass0bN.m5541E(AnonymousClass0bN.m5538B(str), anonymousClass0P7, anonymousClass0PZ);
        E.nB = i;
        E.CE = j;
        AnonymousClass0vy.m8382C(this, E);
        return E;
    }

    /* renamed from: B */
    public static void m8381B(AnonymousClass0bP anonymousClass0bP, AnonymousClass0P7 anonymousClass0P7, StringBuilder stringBuilder) {
        if (anonymousClass0P7.eY()) {
            AnonymousClass0Sy.m4434C();
            stringBuilder.delete(0, stringBuilder.length());
            stringBuilder.append(anonymousClass0P7.DA());
            if (anonymousClass0P7.m3768X() != null) {
                stringBuilder.append(" ");
                stringBuilder.append(anonymousClass0P7.m3768X());
            }
            anonymousClass0bP.kD = stringBuilder.toString();
            if (anonymousClass0P7.m3784n() != null) {
                anonymousClass0bP.f6760j = anonymousClass0P7.m3784n();
            }
        }
    }

    /* renamed from: C */
    public final AnonymousClass0bP m8385C(String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0P7 anonymousClass0P7, int i) {
        AnonymousClass0bP H = AnonymousClass0bN.m5544H(str, this.f12184B, anonymousClass0P7, anonymousClass0PZ, i);
        if (H != null) {
            AnonymousClass0Ns anonymousClass0Ns = this.f12186D;
            if (anonymousClass0Ns != null) {
                H.AC = Boolean.valueOf(anonymousClass0Ns.f3736C);
                H.zB = this.f12186D.m3472A();
            }
            H.pB = AnonymousClass0Fj.f2192B.m1667B();
            AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            H.EC = anonymousClass0Iz.f2860G;
            H.yB = Boolean.valueOf(anonymousClass0Iz.m2402E());
        }
        AnonymousClass0vy.m8382C(this, H);
        return H;
    }

    /* renamed from: C */
    public static void m8382C(AnonymousClass0vy anonymousClass0vy, AnonymousClass0bP anonymousClass0bP) {
        if (anonymousClass0bP != null && anonymousClass0vy.f12185C != null) {
            anonymousClass0bP.kB = Boolean.TRUE;
            anonymousClass0bP.lB = 4;
        }
    }

    /* renamed from: D */
    public final AnonymousClass0bP m8386D(String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0P7 anonymousClass0P7, int i) {
        AnonymousClass0bP H = AnonymousClass0bN.m5544H(str, this.f12184B, anonymousClass0P7, anonymousClass0PZ, i);
        if (H != null) {
            AnonymousClass0Ns anonymousClass0Ns = this.f12186D;
            if (anonymousClass0Ns != null) {
                H.AC = Boolean.valueOf(anonymousClass0Ns.f3736C);
            }
        }
        AnonymousClass0vy.m8382C(this, H);
        return H;
    }

    /* renamed from: E */
    public final AnonymousClass0bP m8387E(String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0P7 anonymousClass0P7, int i, long j, AnonymousClass0vz anonymousClass0vz) {
        AnonymousClass0bP E = AnonymousClass0bN.m5541E(str, anonymousClass0P7, anonymousClass0PZ);
        E.nB = i;
        E.CE = j;
        E.OE = anonymousClass0vz;
        AnonymousClass0hq anonymousClass0hq = this.f12184B;
        if (anonymousClass0hq != null) {
            E.bD = anonymousClass0hq.kR();
        }
        AnonymousClass0vy.m8382C(this, E);
        return E;
    }
}
