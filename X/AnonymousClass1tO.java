package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: X.1tO */
public final class AnonymousClass1tO {
    /* renamed from: B */
    private final ApplicationInfo f23786B;
    /* renamed from: C */
    private final PackageManager f23787C;

    public AnonymousClass1tO(PackageManager packageManager, ApplicationInfo applicationInfo) {
        this.f23787C = packageManager;
        this.f23786B = applicationInfo;
    }

    /* renamed from: A */
    public final PackageInfo m13615A(String str, int i) {
        PackageInfo B = m13616B(str, i);
        return (B == null || !m13617C(B.applicationInfo)) ? null : B;
    }

    /* renamed from: B */
    public final android.content.pm.PackageInfo m13616B(java.lang.String r4, int r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = 0;
        r0 = r3.f23787C;	 Catch:{ NameNotFoundException -> 0x0013, RuntimeException -> 0x0008 }
        r0 = r0.getPackageInfo(r4, r5);	 Catch:{ NameNotFoundException -> 0x0013, RuntimeException -> 0x0008 }
        return r0;	 Catch:{ NameNotFoundException -> 0x0013, RuntimeException -> 0x0008 }
    L_0x0008:
        r1 = move-exception;
        r0 = r1.getCause();
        r0 = r0 instanceof android.os.DeadObjectException;
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        return r2;
    L_0x0012:
        throw r1;
    L_0x0013:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1tO.B(java.lang.String, int):android.content.pm.PackageInfo");
    }

    /* renamed from: C */
    public final boolean m13617C(ApplicationInfo applicationInfo) {
        int i = this.f23786B.uid;
        int i2 = applicationInfo.uid;
        if (i != i2) {
            if (this.f23787C.checkSignatures(i, i2) != 0) {
                return false;
            }
        }
        return true;
    }
}
