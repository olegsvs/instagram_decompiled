package X;

/* renamed from: X.1Nr */
public final class AnonymousClass1Nr extends AnonymousClass1Nl {
    /* renamed from: B */
    public long f17833B;
    /* renamed from: C */
    public long f17834C;
    /* renamed from: D */
    public long f17835D;
    /* renamed from: E */
    public long f17836E;

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ AnonymousClass1Nl mo2502A(AnonymousClass1Nl anonymousClass1Nl, AnonymousClass1Nl anonymousClass1Nl2) {
        AnonymousClass1Nr anonymousClass1Nr = (AnonymousClass1Nr) anonymousClass1Nl;
        anonymousClass1Nl2 = (AnonymousClass1Nr) anonymousClass1Nl2;
        if (anonymousClass1Nl2 == null) {
            anonymousClass1Nl2 = new AnonymousClass1Nr();
        }
        if (anonymousClass1Nr == null) {
            anonymousClass1Nl2.m11078C(this);
        } else {
            anonymousClass1Nl2.f17834C = this.f17834C - anonymousClass1Nr.f17834C;
            anonymousClass1Nl2.f17833B = this.f17833B - anonymousClass1Nr.f17833B;
            anonymousClass1Nl2.f17836E = this.f17836E - anonymousClass1Nr.f17836E;
            anonymousClass1Nl2.f17835D = this.f17835D - anonymousClass1Nr.f17835D;
        }
        return anonymousClass1Nl2;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ AnonymousClass1Nl mo2503B(AnonymousClass1Nl anonymousClass1Nl) {
        return m11078C((AnonymousClass1Nr) anonymousClass1Nl);
    }

    /* renamed from: C */
    public final AnonymousClass1Nr m11078C(AnonymousClass1Nr anonymousClass1Nr) {
        this.f17833B = anonymousClass1Nr.f17833B;
        this.f17834C = anonymousClass1Nr.f17834C;
        this.f17835D = anonymousClass1Nr.f17835D;
        this.f17836E = anonymousClass1Nr.f17836E;
        return this;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    AnonymousClass1Nr anonymousClass1Nr = (AnonymousClass1Nr) obj;
                    if (this.f17834C != anonymousClass1Nr.f17834C || this.f17833B != anonymousClass1Nr.f17833B || this.f17836E != anonymousClass1Nr.f17836E || this.f17835D != anonymousClass1Nr.f17835D) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        long j = this.f17834C;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        j = this.f17833B;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.f17836E;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.f17835D;
        return i + ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NetworkMetrics{mobileBytesTx=");
        stringBuilder.append(this.f17834C);
        stringBuilder.append(", mobileBytesRx=");
        stringBuilder.append(this.f17833B);
        stringBuilder.append(", wifiBytesTx=");
        stringBuilder.append(this.f17836E);
        stringBuilder.append(", wifiBytesRx=");
        stringBuilder.append(this.f17835D);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
