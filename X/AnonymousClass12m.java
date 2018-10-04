package X;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: X.12m */
public final class AnonymousClass12m {
    /* renamed from: B */
    public static void m8993B(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: C */
    public static void m8994C() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
