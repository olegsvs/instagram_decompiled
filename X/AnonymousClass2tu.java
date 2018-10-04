package X;

import java.nio.ByteBuffer;

/* renamed from: X.2tu */
public final class AnonymousClass2tu {
    /* renamed from: B */
    public static final float[] f35490B = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    /* renamed from: C */
    public static final byte[] f35491C = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
    /* renamed from: D */
    public static int[] f35492D = new int[10];
    /* renamed from: E */
    public static final Object f35493E = new Object();

    /* renamed from: B */
    public static void m17614B(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: C */
    public static int m17615C(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == (byte) 0 && bArr[i + 1] == (byte) 0 && bArr[i + 2] == (byte) 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: D */
    public static byte[] m17616D(AnonymousClass2tw anonymousClass2tw) {
        int L = anonymousClass2tw.m17635L();
        int i = anonymousClass2tw.f35500D;
        anonymousClass2tw.m17639P(L);
        Object obj = anonymousClass2tw.f35498B;
        Object obj2 = AnonymousClass2tf.f35470D;
        Object obj3 = new byte[(obj2.length + L)];
        System.arraycopy(obj2, 0, obj3, 0, obj2.length);
        System.arraycopy(obj, i, obj3, obj2.length, L);
        return obj3;
    }
}
