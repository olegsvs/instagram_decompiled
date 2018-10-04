package X;

import android.hardware.Camera;
import android.hardware.camera2.CameraDevice;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: X.1O2 */
public final class AnonymousClass1O2 extends AnonymousClass1DL {
    /* renamed from: B */
    private final SparseArray f17854B = new SparseArray();
    /* renamed from: C */
    private final SparseArray f17855C = new SparseArray();
    /* renamed from: D */
    private boolean f17856D = true;
    /* renamed from: E */
    private long f17857E;
    /* renamed from: F */
    private long f17858F;

    /* renamed from: A */
    public final AnonymousClass1Nl mo2241A() {
        return new AnonymousClass1Nk();
    }

    /* renamed from: B */
    private static synchronized void m11092B(int i, SparseArray sparseArray) {
        synchronized (AnonymousClass1O2.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (sparseArray.get(i) == null) {
                sparseArray.append(i, Long.valueOf(uptimeMillis));
            }
        }
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ boolean mo2242B(AnonymousClass1Nl anonymousClass1Nl) {
        return m11098C((AnonymousClass1Nk) anonymousClass1Nl);
    }

    /* renamed from: C */
    private static synchronized long m11093C(int i, SparseArray sparseArray) {
        long j;
        synchronized (AnonymousClass1O2.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            j = 0;
            Long l = (Long) sparseArray.get(i);
            if (l != null) {
                j = uptimeMillis - l.longValue();
                sparseArray.remove(i);
            } else {
                AnonymousClass1OI.m11150B("CameraMetricsCollector", "Stopped recording details for a camera that hasn't been added yet");
            }
        }
        return j;
    }

    /* renamed from: C */
    public final synchronized boolean m11098C(AnonymousClass1Nk anonymousClass1Nk) {
        AnonymousClass1OK.m11152B(anonymousClass1Nk, "Null value passed to getSnapshot!");
        if (!this.f17856D) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        anonymousClass1Nk.f17821B = this.f17857E + AnonymousClass1O2.m11094D(uptimeMillis, this.f17854B);
        anonymousClass1Nk.f17822C = this.f17858F + AnonymousClass1O2.m11094D(uptimeMillis, this.f17855C);
        return true;
    }

    /* renamed from: D */
    private static long m11094D(long j, SparseArray sparseArray) {
        long j2 = 0;
        for (int i = 0; i < sparseArray.size(); i++) {
            j2 += j - ((Long) sparseArray.valueAt(i)).longValue();
        }
        return j2;
    }

    /* renamed from: D */
    public final synchronized void m11099D(Object obj) {
        if (this.f17856D) {
            AnonymousClass1O2.m11095E(obj);
            this.f17857E += AnonymousClass1O2.m11093C(System.identityHashCode(obj), this.f17854B);
        }
    }

    /* renamed from: E */
    private static void m11095E(Object obj) {
        if (!(obj instanceof Camera)) {
            if (VERSION.SDK_INT < 21 || !(obj instanceof CameraDevice)) {
                throw new IllegalArgumentException("Must pass in a Camera or a CameraDevice");
            }
        }
    }

    /* renamed from: F */
    public final synchronized void m11100F(Object obj) {
        if (this.f17856D) {
            AnonymousClass1O2.m11095E(obj);
            int identityHashCode = System.identityHashCode(obj);
            this.f17854B.delete(identityHashCode);
            this.f17855C.delete(identityHashCode);
        }
    }

    /* renamed from: G */
    public final synchronized void m11101G(Object obj) {
        if (this.f17856D) {
            AnonymousClass1O2.m11095E(obj);
            AnonymousClass1O2.m11092B(System.identityHashCode(obj), this.f17854B);
        }
    }

    /* renamed from: H */
    public final synchronized void m11102H(Object obj) {
        if (this.f17856D) {
            AnonymousClass1O2.m11095E(obj);
            AnonymousClass1O2.m11092B(System.identityHashCode(obj), this.f17855C);
        }
    }

    /* renamed from: I */
    public final synchronized void m11103I(Object obj) {
        if (this.f17856D) {
            AnonymousClass1O2.m11095E(obj);
            this.f17858F += AnonymousClass1O2.m11093C(System.identityHashCode(obj), this.f17855C);
        }
    }
}
