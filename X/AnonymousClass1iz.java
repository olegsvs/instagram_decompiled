package X;

/* renamed from: X.1iz */
public enum AnonymousClass1iz {
    FIRE_AND_FORGET(0),
    ACKNOWLEDGED_DELIVERY(1),
    ASSURED_DELIVERY(2);
    
    /* renamed from: B */
    private final int f21927B;

    private AnonymousClass1iz(int i) {
        this.f21927B = i;
    }

    /* renamed from: A */
    public final int m12726A() {
        return this.f21927B;
    }

    /* renamed from: B */
    public static AnonymousClass1iz m12725B(int i) {
        switch (i) {
            case 0:
                return FIRE_AND_FORGET;
            case 1:
                return ACKNOWLEDGED_DELIVERY;
            case 2:
                return ASSURED_DELIVERY;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown QOS level ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
