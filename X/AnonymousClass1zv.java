package X;

/* renamed from: X.1zv */
public final class AnonymousClass1zv {
    /* renamed from: E */
    public static final AnonymousClass1zv f25127E = new AnonymousClass1zv(0, 30, 3600);
    /* renamed from: B */
    public final int f25128B;
    /* renamed from: C */
    public final int f25129C = 30;
    /* renamed from: D */
    public final int f25130D = 3600;

    static {
        AnonymousClass1zv anonymousClass1zv = new AnonymousClass1zv(1, 30, 3600);
    }

    private AnonymousClass1zv(int i, int i2, int i3) {
        this.f25128B = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass1zv) {
                AnonymousClass1zv anonymousClass1zv = (AnonymousClass1zv) obj;
                if (anonymousClass1zv.f25128B == this.f25128B && anonymousClass1zv.f25129C == this.f25129C && anonymousClass1zv.f25130D == this.f25130D) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f25128B + 1) ^ 1000003) * 1000003) ^ this.f25129C) * 1000003) ^ this.f25130D;
    }

    public final String toString() {
        int i = this.f25128B;
        int i2 = this.f25129C;
        int i3 = this.f25130D;
        StringBuilder stringBuilder = new StringBuilder(74);
        stringBuilder.append("policy=");
        stringBuilder.append(i);
        stringBuilder.append(" initial_backoff=");
        stringBuilder.append(i2);
        stringBuilder.append(" maximum_backoff=");
        stringBuilder.append(i3);
        return stringBuilder.toString();
    }
}
