package com.instagram.analytics.deviceinfo;

public class InstagramDeviceInfoReporter$Api21Actions {
    private InstagramDeviceInfoReporter$Api21Actions() {
    }

    public static void addFileLastAccessTime(X.AnonymousClass0db r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = android.system.Os.lstat(r5);	 Catch:{ ErrnoException -> 0x000e }
        r2 = r0.st_atime;	 Catch:{ ErrnoException -> 0x000e }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ ErrnoException -> 0x000e }
        r2 = r2 * r0;	 Catch:{ ErrnoException -> 0x000e }
        r0 = "access_date";	 Catch:{ ErrnoException -> 0x000e }
        r4.D(r0, r2);	 Catch:{ ErrnoException -> 0x000e }
    L_0x000e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.analytics.deviceinfo.InstagramDeviceInfoReporter$Api21Actions.addFileLastAccessTime(X.0db, java.lang.String):void");
    }
}
