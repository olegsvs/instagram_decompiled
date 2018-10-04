package X;

/* renamed from: X.1Dz */
public enum AnonymousClass1Dz {
    DEFAULT(0),
    MODERATE(1),
    AGGRESSIVE(2),
    SHORT_AD(3),
    LONG_AD(4);
    
    /* renamed from: B */
    private final int f15810B;

    private AnonymousClass1Dz(int i) {
        this.f15810B = i;
    }

    /* renamed from: A */
    public final int m10138A() {
        return this.f15810B;
    }

    /* renamed from: B */
    public static AnonymousClass1Dz m10137B(int i) {
        return AnonymousClass1Dz.values()[i];
    }
}
