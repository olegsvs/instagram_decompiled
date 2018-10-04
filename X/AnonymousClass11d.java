package X;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.11d */
public final class AnonymousClass11d {
    /* renamed from: F */
    public static final AnonymousClass11d f13434F = new AnonymousClass11d();
    /* renamed from: B */
    public final ConcurrentMap f13435B = new AnonymousClass0LF().m2922B();
    /* renamed from: C */
    private final LruCache f13436C = new LruCache(64);
    /* renamed from: D */
    private final Object f13437D = new Object();
    /* renamed from: E */
    private final Handler f13438E = new Handler(Looper.getMainLooper());

    private AnonymousClass11d() {
    }

    /* renamed from: A */
    public final void m8814A(AnonymousClass11c anonymousClass11c) {
        if (anonymousClass11c.f13430D) {
            this.f13436C.remove(anonymousClass11c.f13429C);
        }
        if (this.f13436C.get(anonymousClass11c.f13429C) != null) {
            AnonymousClass11d.m8812B(this, anonymousClass11c);
            Boolean.valueOf(anonymousClass11c.f13430D);
            return;
        }
        Boolean.valueOf(anonymousClass11c.f13430D);
        synchronized (this.f13437D) {
            AnonymousClass11c anonymousClass11c2 = (AnonymousClass11c) this.f13435B.get(anonymousClass11c.f13429C);
            if (anonymousClass11c2 == null) {
                this.f13435B.put(anonymousClass11c.f13429C, anonymousClass11c);
                AnonymousClass0Iu B = AnonymousClass1Dj.m10097C(anonymousClass11c.f13433G).m10100C(new AnonymousClass2AF(AnonymousClass0IE.m2137E("{\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\"}", "0", anonymousClass11c.f13429C, "1", "100", "3", Integer.valueOf(anonymousClass11c.f13431E), "2", Integer.valueOf(anonymousClass11c.f13432F)))).m10101D(AnonymousClass2CF.f27374E).m10099B(AnonymousClass1Dk.ADS);
                B.f2849B = new AnonymousClass394(this, anonymousClass11c);
                AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass1bY(this, B), -885064710);
            } else {
                anonymousClass11c2.f13428B.addAll(anonymousClass11c.f13428B);
            }
        }
    }

    /* renamed from: B */
    public final AnonymousClass2XD m8815B(String str) {
        return str == null ? null : (AnonymousClass2XD) this.f13436C.get(str);
    }

    /* renamed from: B */
    public static void m8812B(AnonymousClass11d anonymousClass11d, AnonymousClass11c anonymousClass11c) {
        for (WeakReference weakReference : anonymousClass11c.f13428B) {
            if (weakReference.get() != null) {
                AnonymousClass11d.m8813C(anonymousClass11d, new AnonymousClass1Yv(anonymousClass11d, weakReference, anonymousClass11c));
            }
        }
    }

    /* renamed from: C */
    public static void m8813C(AnonymousClass11d anonymousClass11d, Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            AnonymousClass0OR.m3624D(anonymousClass11d.f13438E, runnable, 691307832);
        }
    }

    /* renamed from: C */
    public final void m8816C(AnonymousClass2XD anonymousClass2XD) {
        this.f13436C.put(anonymousClass2XD.f31156C, anonymousClass2XD);
    }
}
