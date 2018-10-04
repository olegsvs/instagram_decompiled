package X;

/* renamed from: X.07W */
public final class AnonymousClass07W {
    /* renamed from: B */
    public final AnonymousClass05y f548B;
    /* renamed from: C */
    public final AnonymousClass05y f549C;
    /* renamed from: D */
    public final AnonymousClass05y f550D;
    /* renamed from: E */
    public final AnonymousClass05y f551E;
    /* renamed from: F */
    public final AnonymousClass05y f552F;
    /* renamed from: G */
    public final boolean f553G;

    public AnonymousClass07W(AnonymousClass1iK anonymousClass1iK, AnonymousClass070 anonymousClass070) {
        AnonymousClass05y anonymousClass05y;
        AnonymousClass05y anonymousClass05y2;
        AnonymousClass05y anonymousClass05y3 = AnonymousClass0AD.f1177B;
        AnonymousClass05y anonymousClass05y4 = anonymousClass05y3;
        AnonymousClass05y anonymousClass05y5 = anonymousClass05y3;
        if (anonymousClass1iK.equals(AnonymousClass1iK.f21623B)) {
            anonymousClass05y = anonymousClass05y3;
        } else {
            anonymousClass05y = AnonymousClass05y.m353C(anonymousClass1iK);
        }
        if (anonymousClass070.m427C()) {
            anonymousClass05y2 = anonymousClass05y3;
        } else {
            anonymousClass05y2 = AnonymousClass05y.m353C(anonymousClass070);
        }
        this(true, anonymousClass05y3, anonymousClass05y4, anonymousClass05y5, anonymousClass05y, anonymousClass05y2);
    }

    public AnonymousClass07W(AnonymousClass1iu anonymousClass1iu) {
        AnonymousClass05y C = AnonymousClass05y.m353C(anonymousClass1iu);
        AnonymousClass05y anonymousClass05y = AnonymousClass0AD.f1177B;
        this(false, C, anonymousClass05y, anonymousClass05y, anonymousClass05y, anonymousClass05y);
    }

    public AnonymousClass07W(AnonymousClass1iu anonymousClass1iu, byte b) {
        AnonymousClass05y C = AnonymousClass05y.m353C(anonymousClass1iu);
        AnonymousClass05y anonymousClass05y = AnonymousClass0AD.f1177B;
        this(false, C, anonymousClass05y, AnonymousClass05y.m353C(Byte.valueOf(b)), anonymousClass05y, anonymousClass05y);
    }

    public AnonymousClass07W(AnonymousClass1iu anonymousClass1iu, Exception exception) {
        AnonymousClass05y C = AnonymousClass05y.m353C(anonymousClass1iu);
        AnonymousClass05y B = AnonymousClass05y.m352B(exception);
        AnonymousClass05y anonymousClass05y = AnonymousClass0AD.f1177B;
        this(false, C, B, anonymousClass05y, anonymousClass05y, anonymousClass05y);
    }

    public AnonymousClass07W(boolean z, AnonymousClass05y anonymousClass05y, AnonymousClass05y anonymousClass05y2, AnonymousClass05y anonymousClass05y3, AnonymousClass05y anonymousClass05y4, AnonymousClass05y anonymousClass05y5) {
        this.f553G = z;
        this.f552F = anonymousClass05y;
        this.f549C = anonymousClass05y2;
        this.f548B = anonymousClass05y3;
        this.f550D = anonymousClass05y4;
        this.f551E = anonymousClass05y5;
    }
}
