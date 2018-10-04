package X;

import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: X.1rV */
public final class AnonymousClass1rV {
    /* renamed from: B */
    public static long m13511B() {
        if (VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return System.nanoTime();
    }
}
