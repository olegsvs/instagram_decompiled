package X;

/* renamed from: X.1tM */
public final class AnonymousClass1tM {
    /* renamed from: B */
    public static final byte[] f23782B = new byte[103];
    /* renamed from: C */
    private static final char[] f23783C = new char[256];
    /* renamed from: D */
    private static final char[] f23784D = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    /* renamed from: E */
    private static final char[] f23785E = new char[256];

    static {
        for (int i = 0; i < 256; i++) {
            char[] cArr = f23783C;
            char[] cArr2 = f23784D;
            cArr[i] = cArr2[(i >> 4) & 15];
            f23785E[i] = cArr2[i & 15];
        }
        for (int i2 = 0; i2 <= 70; i2++) {
            f23782B[i2] = (byte) -1;
        }
        for (byte b = (byte) 0; b < (byte) 10; b = (byte) (b + 1)) {
            f23782B[b + 48] = b;
        }
        for (int i3 = 0; i3 < 6; i3 = (byte) (i3 + 1)) {
            byte[] bArr = f23782B;
            byte b2 = (byte) (i3 + 10);
            bArr[i3 + 65] = b2;
            bArr[i3 + 97] = b2;
        }
    }
}
