package X;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* renamed from: X.0G1 */
public final class AnonymousClass0G1 {
    /* renamed from: B */
    private static final Class f2294B = AnonymousClass0G1.class;
    /* renamed from: C */
    public static String f2295C;
    /* renamed from: D */
    private static String f2296D;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static synchronized long m1714B() {
        /*
        r13 = X.AnonymousClass0G1.class;
        monitor-enter(r13);
        r0 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ all -> 0x0069 }
        r12 = r0.getPath();	 Catch:{ all -> 0x0069 }
        r7 = android.os.Environment.getExternalStorageState();	 Catch:{ all -> 0x0069 }
        r10 = -1;
        r0 = "mounted";
        r0 = r0.equals(r7);	 Catch:{ all -> 0x0069 }
        r8 = 50000000; // 0x2faf080 float:3.6872239E-37 double:2.47032823E-316;
        if (r0 == 0) goto L_0x0026;
    L_0x001c:
        r10 = X.AnonymousClass0G1.m1720H(r12);	 Catch:{ all -> 0x0069 }
        r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x0026;
    L_0x0024:
        monitor-exit(r13);
        return r10;
    L_0x0026:
        r0 = "SECONDARY_STORAGE";
        r1 = java.lang.System.getenv(r0);	 Catch:{ all -> 0x0069 }
        if (r1 == 0) goto L_0x004d;
    L_0x002e:
        r0 = ":";
        r6 = r1.split(r0);	 Catch:{ all -> 0x0069 }
        r5 = r6.length;	 Catch:{ all -> 0x0069 }
        r4 = 0;
    L_0x0036:
        if (r4 >= r5) goto L_0x004d;
    L_0x0038:
        r3 = r6[r4];	 Catch:{ all -> 0x0069 }
        r1 = X.AnonymousClass0G1.m1720H(r3);	 Catch:{ all -> 0x0069 }
        r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x0044;
    L_0x0042:
        monitor-exit(r13);
        return r1;
    L_0x0044:
        r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x004a;
    L_0x0048:
        r12 = r3;
        r10 = r1;
    L_0x004a:
        r4 = r4 + 1;
        goto L_0x0036;
    L_0x004d:
        r0 = X.AnonymousClass0G1.m1719G(r12);	 Catch:{ all -> 0x0069 }
        r0 = r0.getAbsolutePath();	 Catch:{ all -> 0x0069 }
        f2296D = r0;	 Catch:{ all -> 0x0069 }
        r0 = 0;
        r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0024;
    L_0x005d:
        r0 = "checking";
        r0 = r0.equals(r7);	 Catch:{ all -> 0x0069 }
        if (r0 == 0) goto L_0x0024;
    L_0x0065:
        r0 = -2;
        monitor-exit(r13);
        return r0;
    L_0x0069:
        r0 = move-exception;
        monitor-exit(r13);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0G1.B():long");
    }

    /* renamed from: C */
    public static synchronized String m1715C(Context context, boolean z) {
        String str;
        synchronized (AnonymousClass0G1.class) {
            if (z) {
                if (AnonymousClass1Ba.m9838D(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (f2296D == null) {
                        AnonymousClass0G1.m1714B();
                    }
                    str = f2296D;
                }
            }
            str = f2295C;
        }
        return str;
    }

    /* renamed from: D */
    public static synchronized String m1716D(String str, String str2) {
        String stringBuilder;
        synchronized (AnonymousClass0G1.class) {
            if (f2296D == null) {
                AnonymousClass0G1.m1714B();
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(f2296D);
            stringBuilder2.append('/');
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    /* renamed from: E */
    public static String m1717E(String str) {
        if (!AnonymousClass0HV.m2007C().m2035W()) {
            return "temp.jpg";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".jpg");
        return stringBuilder.toString();
    }

    /* renamed from: F */
    public static synchronized String m1718F() {
        String str;
        synchronized (AnonymousClass0G1.class) {
            str = f2295C;
        }
        return str;
    }

    /* renamed from: G */
    private static File m1719G(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Environment.DIRECTORY_DCIM);
        stringBuilder.append("/Camera");
        return new File(str, stringBuilder.toString());
    }

    /* renamed from: H */
    private static synchronized long m1720H(String str) {
        synchronized (AnonymousClass0G1.class) {
            try {
                File G = AnonymousClass0G1.m1719G(str);
                f2296D = G.getAbsolutePath();
                G.mkdirs();
                if (G.isDirectory()) {
                    if (G.canWrite()) {
                        StatFs statFs = new StatFs(str);
                        long availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
                        return availableBlocks;
                    }
                }
                return -1;
            } catch (Throwable e) {
                AnonymousClass0Dc.m1252O(f2294B, e, "Failed to access external storage %s", str);
                return -3;
            }
        }
    }
}
