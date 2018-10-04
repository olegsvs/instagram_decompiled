package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: X.242 */
public final class AnonymousClass242 implements Comparable, Serializable {
    /* renamed from: D */
    public static final char[] f25556D = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /* renamed from: B */
    public final byte[] f25557B;
    /* renamed from: C */
    public transient int f25558C;

    public AnonymousClass242(byte[] bArr) {
        this.f25557B = bArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final int m14312A(X.AnonymousClass242 r9) {
        /*
        r8 = this;
        r0 = r8.f25557B;
        r7 = r0.length;
        r0 = r9.f25557B;
        r6 = r0.length;
        r5 = java.lang.Math.min(r7, r6);
        r4 = 0;
        r3 = 0;
    L_0x000c:
        r2 = -1;
        if (r3 >= r5) goto L_0x0025;
    L_0x000f:
        r0 = r8.f25557B;
        r0 = r0[r3];
        r1 = r0 & 255;
        r0 = r9.f25557B;
        r0 = r0[r3];
        r0 = r0 & 255;
        if (r1 != r0) goto L_0x0020;
    L_0x001d:
        r3 = r3 + 1;
        goto L_0x000c;
    L_0x0020:
        if (r1 >= r0) goto L_0x0023;
    L_0x0022:
        goto L_0x0024;
    L_0x0023:
        r2 = 1;
    L_0x0024:
        return r2;
    L_0x0025:
        if (r7 != r6) goto L_0x0028;
    L_0x0027:
        return r4;
    L_0x0028:
        if (r7 >= r6) goto L_0x0023;
    L_0x002a:
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.242.A(X.242):int");
    }

    /* renamed from: B */
    public final String m14313B() {
        byte[] bArr = this.f25557B;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f25556D;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: B */
    public static boolean m14310B(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public static AnonymousClass242 m14311C(byte... bArr) {
        if (bArr != null) {
            return new AnonymousClass242((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: C */
    public final byte[] m14314C() {
        return (byte[]) this.f25557B.clone();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m14312A((AnonymousClass242) obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AnonymousClass242) {
            AnonymousClass242 anonymousClass242 = (AnonymousClass242) obj;
            int length = anonymousClass242.f25557B.length;
            byte[] bArr = this.f25557B;
            if (length == bArr.length) {
                int length2 = bArr.length;
                byte[] bArr2 = anonymousClass242.f25557B;
                Object obj2 = (0 > bArr2.length - length2 || 0 > bArr.length - length2 || !AnonymousClass242.m14310B(bArr2, 0, bArr, 0, length2)) ? null : 1;
                if (obj2 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f25558C;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.f25557B);
        this.f25558C = i;
        return i;
    }

    public final String toString() {
        byte[] bArr = this.f25557B;
        if (bArr.length == 0) {
            return "ByteString[size=0]";
        }
        if (bArr.length <= 16) {
            return String.format("ByteString[size=%s data=%s]", new Object[]{Integer.valueOf(bArr.length), m14313B()});
        }
        String str = "ByteString[size=%s md5=%s]";
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(bArr.length);
        try {
            objArr[1] = AnonymousClass242.m14311C(MessageDigest.getInstance("MD5").digest(this.f25557B)).m14313B();
            return String.format(str, objArr);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
