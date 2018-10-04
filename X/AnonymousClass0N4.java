package X;

import java.util.zip.CRC32;

/* renamed from: X.0N4 */
public final class AnonymousClass0N4 {
    /* renamed from: B */
    public AnonymousClass1Kz f3505B;
    /* renamed from: C */
    public long f3506C;

    public AnonymousClass0N4() {
        this(-1);
    }

    public AnonymousClass0N4(long j) {
        this.f3506C = j;
    }

    /* renamed from: A */
    public final AnonymousClass1Kz m3269A(String str) {
        AnonymousClass1Kz anonymousClass1Kz = this.f3505B;
        if (anonymousClass1Kz != null) {
            return anonymousClass1Kz;
        }
        long j = this.f3506C;
        if (j < 0) {
            j = 2003;
        }
        anonymousClass1Kz = new AnonymousClass1Kz(j, AnonymousClass0N4.m3268B(j, str));
        this.f3505B = anonymousClass1Kz;
        return anonymousClass1Kz;
    }

    /* renamed from: B */
    private static long m3268B(long j, String str) {
        if (str != null) {
            if (j >= 1) {
                CRC32 crc32 = new CRC32();
                crc32.update(str.getBytes());
                return crc32.getValue() % j;
            }
        }
        return -1;
    }
}
