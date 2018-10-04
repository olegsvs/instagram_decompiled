package X;

import android.content.Context;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.091 */
public final class AnonymousClass091 {
    /* renamed from: B */
    public static Context f1031B;
    /* renamed from: C */
    public static boolean f1032C;
    /* renamed from: D */
    public static ArrayList f1033D;

    /* renamed from: B */
    public static synchronized void m561B(Context context, int i) {
        synchronized (AnonymousClass091.class) {
            synchronized (AnonymousClass091.class) {
                if (!f1032C) {
                    ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        if (new File("/data/local/tmp/ctscan_test_running").exists()) {
                            i &= -3;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(context.getApplicationInfo().dataDir);
                        stringBuilder.append("/app_libs");
                        AnonymousClass0Cz.m1080B(new File(stringBuilder.toString()));
                        AnonymousClass0CF.m853B(context, i);
                        f1033D = new ArrayList();
                        AnonymousClass0CF.m862K(new AnonymousClass0C7(context, "lib-assets"));
                        AnonymousClass0CF.m862K(new AnonymousClass0C3(context, "lib-xzs"));
                        f1033D.add("lib-assets");
                        f1033D.add("lib-xzs");
                        f1031B = context;
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        f1032C = true;
                    } catch (Throwable e) {
                        Log.e("FbSoLoader", "IOException during init", e);
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        f1032C = true;
                    }
                }
            }
        }
    }
}
