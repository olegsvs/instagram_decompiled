package X;

/* renamed from: X.1ha */
public final class AnonymousClass1ha {
    /* renamed from: B */
    public final AnonymousClass1H2 f21529B;
    /* renamed from: C */
    public int f21530C;

    public AnonymousClass1ha(AnonymousClass1H2 anonymousClass1H2) {
        this.f21529B = anonymousClass1H2;
        this.f21530C = anonymousClass1H2.f16634E;
    }

    /* renamed from: A */
    public final boolean m12580A(AnonymousClass1xU anonymousClass1xU) {
        if (anonymousClass1xU == null) {
            return false;
        }
        if (!this.f21529B.f16640K) {
            return false;
        }
        int i = this.f21530C;
        switch (anonymousClass1xU.ordinal()) {
            case 0:
                this.f21530C = this.f21529B.f16635F;
                break;
            case 1:
                this.f21530C = this.f21529B.f16639J;
                break;
            case 2:
                this.f21530C = this.f21529B.f16638I;
                break;
            case 3:
                this.f21530C = this.f21529B.f16637H;
                break;
            case 4:
                this.f21530C = this.f21529B.f16636G;
                break;
            default:
                this.f21530C = this.f21529B.f16634E;
                break;
        }
        if (this.f21530C != i) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m12581B(Integer num) {
        if (AnonymousClass1GY.m10501D(num.intValue(), -1)) {
            return false;
        }
        if (!this.f21529B.f16642M) {
            return false;
        }
        int i = this.f21530C;
        switch (num.intValue()) {
            case 3:
                this.f21530C = this.f21529B.f16631B;
                break;
            case 4:
                this.f21530C = this.f21529B.f16632C;
                break;
            case 5:
                this.f21530C = this.f21529B.f16633D;
                break;
            case 6:
                this.f21530C = this.f21529B.f16643N;
                break;
            default:
                this.f21530C = this.f21529B.f16634E;
                break;
        }
        if (this.f21530C != i) {
            return true;
        }
        return false;
    }
}
