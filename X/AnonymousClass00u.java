package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.os.DeadObjectException;
import android.util.Log;

/* renamed from: X.00u */
public final class AnonymousClass00u {
    /* renamed from: B */
    public final Context f106B;

    public AnonymousClass00u(Context context) {
        this.f106B = context;
    }

    /* renamed from: A */
    public final String m60A(String str, String str2) {
        String str3 = null;
        try {
            PackageItemInfo applicationInfo = this.f106B.getPackageManager().getApplicationInfo(str2, 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                Object obj = applicationInfo.metaData.get(str);
                if (obj != null) {
                    str3 = obj.toString();
                }
            }
            return str3;
        } catch (Throwable e) {
            Log.e(AnonymousClass00u.class.getName(), "Error reading <meta-data> from AndroidManifest.xml.", e);
            return null;
        } catch (Throwable e2) {
            if (e2.getCause() instanceof DeadObjectException) {
                Log.e(AnonymousClass00u.class.getName(), "Error reading <meta-data> from AndroidManifest.xml.", e2);
                return null;
            }
            throw e2;
        }
    }
}
