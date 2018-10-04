package X;

/* renamed from: X.39G */
public final class AnonymousClass39G {
    /* renamed from: D */
    public static final AnonymousClass39G f38378D = new AnonymousClass39G(AnonymousClass39F.UNSET, 0.0f);
    /* renamed from: E */
    public static final AnonymousClass39G f38379E = new AnonymousClass39G(AnonymousClass39F.PIXEL, 0.0f);
    /* renamed from: B */
    public final float f38380B;
    /* renamed from: C */
    public final AnonymousClass39F f38381C;

    public AnonymousClass39G(AnonymousClass39F anonymousClass39F, float f) {
        this.f38381C = anonymousClass39F;
        this.f38380B = f;
    }

    /* renamed from: B */
    public static AnonymousClass39G m18756B(float f) {
        return new AnonymousClass39G(AnonymousClass39F.DP, f);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f38380B);
        stringBuilder.append(' ');
        stringBuilder.append(this.f38381C);
        return stringBuilder.toString();
    }
}
