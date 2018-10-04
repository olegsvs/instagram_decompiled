package X;

import java.util.Random;

/* renamed from: X.08S */
public final class AnonymousClass08S {
    /* renamed from: B */
    public int f913B = this.f915D;
    /* renamed from: C */
    public int f914C = -2;
    /* renamed from: D */
    public final int f915D;
    /* renamed from: E */
    private final int f916E;
    /* renamed from: F */
    private final Random f917F = new Random();

    public AnonymousClass08S(int i, int i2) {
        this.f915D = i;
        this.f916E = i2;
    }

    /* renamed from: A */
    public final int m519A(boolean z, boolean z2) {
        this.f914C++;
        if (!z) {
            this.f914C++;
        }
        if (z2) {
            this.f914C++;
        }
        if (this.f914C > 3) {
            this.f914C = 3;
        }
        int i = this.f914C;
        if (i < 1) {
            return 0;
        }
        int i2 = this.f913B * i;
        double nextFloat = (double) this.f917F.nextFloat();
        Double.isNaN(nextFloat);
        nextFloat -= 0.5d;
        double d = (double) this.f913B;
        Double.isNaN(d);
        this.f913B = i2 + ((int) (nextFloat * d));
        int i3 = this.f913B;
        i = this.f915D;
        if (i3 < i) {
            this.f913B = i;
        }
        i3 = this.f913B;
        i = this.f916E;
        if (i3 > i) {
            this.f913B = i;
        }
        return this.f913B;
    }

    public final String toString() {
        return AnonymousClass1Cn.m9922B("ParameterizedRetryState (%d,%d): multiplier:%d, interval:%d", Integer.valueOf(this.f915D), Integer.valueOf(this.f916E), Integer.valueOf(this.f914C), Integer.valueOf(this.f913B));
    }
}
