package X;

/* renamed from: X.22h */
public final class AnonymousClass22h {
    /* renamed from: B */
    public static byte m14270B(long j) {
        if ((j >> 8) == 0) {
            return (byte) ((int) j);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Out of range: ");
        stringBuilder.append(j);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
