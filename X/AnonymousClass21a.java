package X;

/* renamed from: X.21a */
public final class AnonymousClass21a extends RuntimeException {
    /* renamed from: B */
    public final int f25317B;

    public AnonymousClass21a(int i) {
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append("Split Install Error: ");
        stringBuilder.append(i);
        super(stringBuilder.toString());
        this.f25317B = i;
    }
}
