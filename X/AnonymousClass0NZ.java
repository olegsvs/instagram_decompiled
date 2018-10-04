package X;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.0NZ */
public final class AnonymousClass0NZ {
    /* renamed from: B */
    private static Looper f3589B;

    /* renamed from: B */
    public static synchronized Looper m3338B() {
        Looper looper;
        synchronized (AnonymousClass0NZ.class) {
            if (f3589B == null) {
                HandlerThread handlerThread = new HandlerThread("IgLooper.backgroundLooper", 9);
                handlerThread.start();
                f3589B = handlerThread.getLooper();
            }
            looper = f3589B;
        }
        return looper;
    }
}
