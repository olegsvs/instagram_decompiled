package X;

/* renamed from: X.1GV */
public final class AnonymousClass1GV {
    /* renamed from: B */
    public static int m10491B(int i, double d) {
        i = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(i);
        double d2 = (double) highestOneBit;
        Double.isNaN(d2);
        if (i <= ((int) (d * d2))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 <= 0) {
            i2 = 1073741824;
        }
        return i2;
    }

    /* renamed from: C */
    public static int m10492C(int i) {
        return Integer.rotateLeft(i * -862048943, 15) * 461845907;
    }
}
