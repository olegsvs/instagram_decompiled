package X;

/* renamed from: X.0W1 */
public final class AnonymousClass0W1 {
    /* renamed from: B */
    public int f5854B;
    /* renamed from: C */
    public Object[] f5855C;
    /* renamed from: D */
    public int f5856D;
    /* renamed from: E */
    public int f5857E;

    public AnonymousClass0W1() {
        this(8);
    }

    public AnonymousClass0W1(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            if (Integer.bitCount(i) != 1) {
                i = Integer.highestOneBit(i - 1) << 1;
            }
            this.f5854B = i - 1;
            this.f5855C = new Object[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    /* renamed from: A */
    public final int m4987A() {
        return (this.f5857E - this.f5856D) & this.f5854B;
    }
}
