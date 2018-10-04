package X;

import android.content.pm.PackageInfo;
import android.os.Bundle;

/* renamed from: X.2oT */
public final class AnonymousClass2oT {
    /* renamed from: B */
    public static int m17279B(PackageInfo packageInfo) {
        int i = packageInfo.versionCode >= 20297189 ? 1 : -1;
        if (packageInfo.applicationInfo != null) {
            Bundle bundle = packageInfo.applicationInfo.metaData;
            if (bundle != null) {
                return bundle.getInt("com.facebook.appmanager.api.level", i);
            }
        }
        return i;
    }
}
