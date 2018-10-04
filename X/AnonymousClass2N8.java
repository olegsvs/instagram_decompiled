package X;

/* renamed from: X.2N8 */
public final class AnonymousClass2N8 {
    /* renamed from: B */
    public double f29618B;
    /* renamed from: C */
    public double f29619C;

    public AnonymousClass2N8(double d, double d2) {
        this.f29618B = d;
        this.f29619C = d2;
    }

    /* renamed from: A */
    public final AnonymousClass2N8 m15294A() {
        return new AnonymousClass2N8(this.f29618B, this.f29619C);
    }

    /* renamed from: B */
    public static double m15291B(AnonymousClass2N8 anonymousClass2N8, AnonymousClass2N8 anonymousClass2N82) {
        return (anonymousClass2N82.f29618B * anonymousClass2N8.f29618B) + (anonymousClass2N82.f29619C * anonymousClass2N8.f29619C);
    }

    /* renamed from: C */
    public static AnonymousClass2N8 m15292C(AnonymousClass2N8 anonymousClass2N8, AnonymousClass2N8 anonymousClass2N82) {
        return new AnonymousClass2N8(anonymousClass2N8.f29618B - anonymousClass2N82.f29618B, anonymousClass2N8.f29619C - anonymousClass2N82.f29619C);
    }

    /* renamed from: D */
    public static double m15293D(AnonymousClass2N8 anonymousClass2N8, AnonymousClass2N8 anonymousClass2N82) {
        return (anonymousClass2N8.f29618B * anonymousClass2N82.f29619C) - (anonymousClass2N8.f29619C * anonymousClass2N82.f29618B);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m15294A();
    }
}
