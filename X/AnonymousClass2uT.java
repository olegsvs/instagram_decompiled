package X;

/* renamed from: X.2uT */
public final class AnonymousClass2uT {
    /* renamed from: F */
    public static final AnonymousClass2uT f35630F = new AnonymousClass2uT(1.0f);
    /* renamed from: B */
    public final float f35631B;
    /* renamed from: C */
    public final int f35632C;
    /* renamed from: D */
    public final boolean f35633D;
    /* renamed from: E */
    public final float f35634E;

    public AnonymousClass2uT(float f) {
        this(f, 1.0f, false);
    }

    public AnonymousClass2uT(float f, float f2, boolean z) {
        boolean z2 = true;
        AnonymousClass2yO.m18013B(f > 0.0f);
        if (f2 <= 0.0f) {
            z2 = false;
        }
        AnonymousClass2yO.m18013B(z2);
        this.f35634E = f;
        this.f35631B = f2;
        this.f35633D = z;
        this.f35632C = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    AnonymousClass2uT anonymousClass2uT = (AnonymousClass2uT) obj;
                    if (this.f35634E != anonymousClass2uT.f35634E || this.f35631B != anonymousClass2uT.f35631B || this.f35633D != anonymousClass2uT.f35633D) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.f35634E)) * 31) + Float.floatToRawIntBits(this.f35631B)) * 31) + this.f35633D;
    }
}
