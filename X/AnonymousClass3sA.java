package X;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;

/* renamed from: X.3sA */
public final class AnonymousClass3sA extends AnonymousClass2kV {
    public AnonymousClass3sA(ActivityManager activityManager) {
        super(activityManager);
    }

    /* renamed from: A */
    public final long mo3944A(MemoryInfo memoryInfo) {
        return memoryInfo != null ? memoryInfo.totalMem : -1;
    }
}
