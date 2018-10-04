package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.1F7 */
public final class AnonymousClass1F7 {
    /* renamed from: B */
    private static boolean f15977B;
    /* renamed from: C */
    public static int f15978C;
    /* renamed from: D */
    private static Object f15979D = new Object();

    /* renamed from: B */
    public static void m10290B(Context context) {
        synchronized (f15979D) {
            if (!f15977B) {
                f15977B = true;
                try {
                    Bundle bundle = AnonymousClass1F5.m10288B(context).f15976B.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        f15978C = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (Throwable e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
