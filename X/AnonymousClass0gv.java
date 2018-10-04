package X;

import com.facebook.proxygen.SamplePolicy;

/* renamed from: X.0gv */
public final class AnonymousClass0gv implements SamplePolicy {
    /* renamed from: D */
    public static int f8297D = 5000;
    /* renamed from: E */
    public static int f8298E = 10000;
    /* renamed from: B */
    public boolean f8299B;
    /* renamed from: C */
    public boolean f8300C;

    public AnonymousClass0gv(int i, int i2) {
        double d;
        boolean z;
        f8298E = i;
        f8297D = i2;
        boolean z2 = false;
        if (i != 0) {
            double random = Math.random();
            d = (double) i;
            Double.isNaN(d);
            if (random < 1.0d / d) {
                z = true;
                this.f8300C = z;
                if (i2 == 0) {
                    double d2;
                    d = Math.random();
                    d2 = (double) i2;
                    Double.isNaN(d2);
                    if (d < 1.0d / d2) {
                        z2 = true;
                    }
                }
                this.f8299B = z2;
            }
        }
        z = false;
        this.f8300C = z;
        if (i2 == 0) {
            d = Math.random();
            d2 = (double) i2;
            Double.isNaN(d2);
            if (d < 1.0d / d2) {
                z2 = true;
            }
        }
        this.f8299B = z2;
    }

    public final boolean isSampled() {
        if (!(this.f8300C || this.f8299B)) {
            if (!AnonymousClass0h0.m6717B()) {
                return false;
            }
        }
        return true;
    }
}
