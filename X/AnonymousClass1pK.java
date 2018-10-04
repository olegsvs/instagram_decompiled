package X;

/* renamed from: X.1pK */
public final class AnonymousClass1pK extends AnonymousClass1Nl {
    /* renamed from: B */
    public int f23140B;
    /* renamed from: C */
    public long f23141C;
    /* renamed from: D */
    public int f23142D;
    /* renamed from: E */
    public long f23143E;

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ AnonymousClass1Nl m13370A(AnonymousClass1Nl anonymousClass1Nl, AnonymousClass1Nl anonymousClass1Nl2) {
        AnonymousClass1pK anonymousClass1pK = (AnonymousClass1pK) anonymousClass1Nl;
        anonymousClass1Nl2 = (AnonymousClass1pK) anonymousClass1Nl2;
        if (anonymousClass1Nl2 == null) {
            anonymousClass1Nl2 = new AnonymousClass1pK();
        }
        if (anonymousClass1pK == null) {
            anonymousClass1Nl2.m13372C(this);
        } else {
            anonymousClass1Nl2.f23142D = this.f23142D - anonymousClass1pK.f23142D;
            anonymousClass1Nl2.f23143E = this.f23143E - anonymousClass1pK.f23143E;
            anonymousClass1Nl2.f23140B = this.f23140B - anonymousClass1pK.f23140B;
            anonymousClass1Nl2.f23141C = this.f23141C - anonymousClass1pK.f23141C;
        }
        return anonymousClass1Nl2;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ AnonymousClass1Nl m13371B(AnonymousClass1Nl anonymousClass1Nl) {
        return m13372C((AnonymousClass1pK) anonymousClass1Nl);
    }

    /* renamed from: C */
    public final AnonymousClass1pK m13372C(AnonymousClass1pK anonymousClass1pK) {
        this.f23142D = anonymousClass1pK.f23142D;
        this.f23143E = anonymousClass1pK.f23143E;
        this.f23140B = anonymousClass1pK.f23140B;
        this.f23141C = anonymousClass1pK.f23141C;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    AnonymousClass1pK anonymousClass1pK = (AnonymousClass1pK) obj;
                    if (!(this.f23142D == anonymousClass1pK.f23142D && this.f23143E == anonymousClass1pK.f23143E && this.f23140B == anonymousClass1pK.f23140B && this.f23141C == anonymousClass1pK.f23141C)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f23142D * 31;
        long j = this.f23143E;
        i = (((i + ((int) (j ^ (j >>> 32)))) * 31) + this.f23140B) * 31;
        j = this.f23141C;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BluetoothMetrics{bleScanCount=");
        stringBuilder.append(this.f23142D);
        stringBuilder.append(", bleScanDurationMs=");
        stringBuilder.append(this.f23143E);
        stringBuilder.append(", bleOpportunisticScanCount=");
        stringBuilder.append(this.f23140B);
        stringBuilder.append(", bleOpportunisticScanDurationMs=");
        stringBuilder.append(this.f23141C);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
