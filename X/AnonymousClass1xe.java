package X;

/* renamed from: X.1xe */
public final class AnonymousClass1xe extends AnonymousClass1H0 {
    /* renamed from: B */
    public final int f24696B;
    /* renamed from: C */
    public final boolean f24697C;
    /* renamed from: D */
    public final String f24698D;

    public AnonymousClass1xe(String str, boolean z, int i) {
        super(AnonymousClass17Z.MANIFEST_FETECH_END);
        this.f24698D = str;
        this.f24697C = z;
        this.f24696B = i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("videoId=");
        stringBuilder2.append(this.f24698D);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", isSucceeded=");
        stringBuilder2.append(this.f24697C);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", invalidResponseCode=");
        stringBuilder2.append(this.f24696B);
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }
}
