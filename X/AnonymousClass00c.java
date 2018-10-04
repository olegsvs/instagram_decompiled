package X;

import android.os.StatFs;

/* renamed from: X.00c */
public final class AnonymousClass00c {
    private AnonymousClass00c() {
    }

    /* renamed from: B */
    public static long m31B(StatFs statFs) {
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    /* renamed from: C */
    public static long m32C(StatFs statFs) {
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
