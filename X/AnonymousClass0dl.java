package X;

/* renamed from: X.0dl */
public final class AnonymousClass0dl {
    /* renamed from: B */
    public final String f7512B;
    /* renamed from: C */
    public final String f7513C;
    /* renamed from: D */
    public final long f7514D;

    public AnonymousClass0dl(String str, long j, String str2) {
        this.f7512B = str;
        this.f7514D = j;
        this.f7513C = str2;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        if (this.f7513C == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f7512B);
            stringBuilder.append(" : ");
            stringBuilder.append(this.f7514D);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f7512B);
            stringBuilder.append(" : ");
            stringBuilder.append(this.f7514D);
            stringBuilder.append(" : ");
            stringBuilder.append(this.f7513C);
        }
        return stringBuilder.toString();
    }
}
