package X;

/* renamed from: X.2fu */
public final class AnonymousClass2fu {
    /* renamed from: C */
    public static float m16849C(double d) {
        return ((float) (d + 180.0d)) / 360.0f;
    }

    /* renamed from: B */
    public static float m16848B(double d) {
        d = Math.sin((d * 3.141592653589793d) / 180.0d);
        return (float) (0.5d - (Math.log((d + 1.0d) / (1.0d - d)) / 12.566370614359172d));
    }
}
