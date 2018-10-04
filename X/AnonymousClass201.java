package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.201 */
public final class AnonymousClass201 implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    /* renamed from: F */
    public static final AnonymousClass201 f25152F = new AnonymousClass201();
    /* renamed from: B */
    public final ArrayList f25153B = new ArrayList();
    /* renamed from: C */
    public boolean f25154C = false;
    /* renamed from: D */
    private final AtomicBoolean f25155D = new AtomicBoolean();
    /* renamed from: E */
    private final AtomicBoolean f25156E = new AtomicBoolean();

    private AnonymousClass201() {
    }

    /* renamed from: B */
    private final void m14136B(boolean z) {
        synchronized (f25152F) {
            ArrayList arrayList = this.f25153B;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((AnonymousClass202) obj).pXA(z);
            }
        }
    }

    /* renamed from: A */
    public final boolean m14137A(boolean z) {
        if (!this.f25156E.get()) {
            if (!AnonymousClass1F0.D()) {
                return true;
            }
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f25156E.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f25155D.set(true);
            }
        }
        return this.f25155D.get();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f25155D.compareAndSet(true, false);
        this.f25156E.set(true);
        if (compareAndSet) {
            m14136B(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f25155D.compareAndSet(true, false);
        this.f25156E.set(true);
        if (compareAndSet) {
            m14136B(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f25155D.compareAndSet(false, true)) {
            this.f25156E.set(true);
            m14136B(true);
        }
    }
}
