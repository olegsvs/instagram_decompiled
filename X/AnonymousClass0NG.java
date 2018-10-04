package X;

/* renamed from: X.0NG */
public final class AnonymousClass0NG {
    /* renamed from: B */
    private final AnonymousClass23Q f3533B;
    /* renamed from: C */
    private final AnonymousClass0NE f3534C;
    /* renamed from: D */
    private final String f3535D;
    /* renamed from: E */
    private final String f3536E;
    /* renamed from: F */
    private final String f3537F;
    /* renamed from: G */
    private final AnonymousClass0N2 f3538G;

    public AnonymousClass0NG(String str, String str2, String str3, AnonymousClass0N2 anonymousClass0N2, AnonymousClass0NE anonymousClass0NE, AnonymousClass23Q anonymousClass23Q) {
        this.f3536E = str;
        this.f3537F = str2;
        this.f3535D = str3;
        this.f3538G = anonymousClass0N2;
        this.f3534C = anonymousClass0NE;
        this.f3533B = anonymousClass23Q;
    }

    /* renamed from: A */
    public final AnonymousClass0di m3285A(String str, String str2, AnonymousClass0dd anonymousClass0dd) {
        if (anonymousClass0dd != AnonymousClass0dd.REGULAR) {
            return AnonymousClass0NG.m3283B(this, str, str2, anonymousClass0dd);
        }
        AnonymousClass0di B;
        if (this.f3533B.f25496H) {
            B = m3286B(str, str2, anonymousClass0dd);
        } else {
            B = AnonymousClass0NG.m3283B(this, str, str2, anonymousClass0dd);
        }
        return B;
    }

    /* renamed from: B */
    private static AnonymousClass0di m3283B(AnonymousClass0NG anonymousClass0NG, String str, String str2, AnonymousClass0dd anonymousClass0dd) {
        AnonymousClass0di anonymousClass0di = new AnonymousClass0di(new AnonymousClass0dj(anonymousClass0NG.f3534C));
        AnonymousClass0NG.m3284C(anonymousClass0NG, anonymousClass0di, str, str2, anonymousClass0dd);
        return anonymousClass0di;
    }

    /* renamed from: B */
    public final AnonymousClass0di m3286B(String str, String str2, AnonymousClass0dd anonymousClass0dd) {
        Object anonymousClass18E = new AnonymousClass18E(this.f3534C);
        AnonymousClass0di anonymousClass0di = new AnonymousClass0di(anonymousClass18E);
        AnonymousClass0NG.m3284C(this, anonymousClass0di, str, str2, anonymousClass0dd);
        try {
            anonymousClass18E.m9542A(anonymousClass0di);
            return anonymousClass0di;
        } catch (Throwable e) {
            String str3 = "AnalyticsSessionFactory";
            String str4 = "IOException while initializing FileBasedSession.";
            AnonymousClass0Dc.m1244G(str3, str4, e);
            AnonymousClass0Gn.m1878E(str3, str4, e);
            return AnonymousClass0NG.m3283B(this, str, str2, anonymousClass0dd);
        }
    }

    /* renamed from: C */
    private static void m3284C(AnonymousClass0NG anonymousClass0NG, AnonymousClass0di anonymousClass0di, String str, String str2, AnonymousClass0dd anonymousClass0dd) {
        anonymousClass0di.f7500D = anonymousClass0NG.f3536E;
        anonymousClass0di.f7501E = anonymousClass0NG.f3537F;
        anonymousClass0di.f7499C = anonymousClass0NG.f3535D;
        anonymousClass0di.f7503G = anonymousClass0NG.f3538G.m3261B();
        anonymousClass0di.f7505I = anonymousClass0NG.f3538G.m3261B();
        anonymousClass0di.f7507K = str;
        anonymousClass0di.f7504H = str2;
        anonymousClass0di.f7502F = anonymousClass0dd;
    }
}
