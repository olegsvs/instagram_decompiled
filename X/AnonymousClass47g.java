package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IsManagedAppFlag;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.47g */
public final class AnonymousClass47g {
    /* renamed from: G */
    public static final long f50539G;
    /* renamed from: H */
    public static final long f50540H;
    /* renamed from: I */
    private static AnonymousClass47g f50541I;
    /* renamed from: B */
    public final ComponentName f50542B = new ComponentName(this.f50545E, IsManagedAppFlag.class);
    /* renamed from: C */
    public final PackageManager f50543C = this.f50545E.getPackageManager();
    /* renamed from: D */
    public final SharedPreferences f50544D = this.f50545E.getSharedPreferences("oxygen_preloads_sdk", 0);
    /* renamed from: E */
    private final Context f50545E;
    /* renamed from: F */
    private final AnonymousClass2ol f50546F;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f50540H = timeUnit.toMillis(7);
        f50539G = timeUnit.toMillis(1);
    }

    public AnonymousClass47g(Context context, AnonymousClass2ol anonymousClass2ol) {
        this.f50545E = context;
        this.f50546F = anonymousClass2ol;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final boolean m23308A() {
        /*
        r7 = this;
        r3 = r7.f50544D;
        r2 = "/is_managed_app_cache/is_managed_app_last_check";
        r0 = 0;
        r5 = r3.getLong(r2, r0);
        r2 = java.lang.System.currentTimeMillis();
        r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        r4 = 0;
        if (r0 <= 0) goto L_0x0023;
    L_0x0013:
        r0 = r7.f50544D;
        r1 = r0.edit();
        r0 = "/is_managed_app_cache/is_managed_app_last_check";
        r0 = r1.putLong(r0, r2);
        r0.apply();
        return r4;
    L_0x0023:
        r1 = r7.f50546F;
        r0 = 9;
        r0 = r1.m17290A(r0);
        if (r0 == 0) goto L_0x0036;
    L_0x002d:
        r0 = f50540H;
        r5 = r5 + r0;
        r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r0 <= 0) goto L_0x0035;
    L_0x0034:
        r4 = 1;
    L_0x0035:
        return r4;
    L_0x0036:
        r0 = f50539G;
        r5 = r5 + r0;
        r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r0 <= 0) goto L_0x0035;
    L_0x003d:
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.47g.A():boolean");
    }

    /* renamed from: B */
    public static synchronized AnonymousClass47g m23305B(Context context) {
        AnonymousClass47g anonymousClass47g;
        synchronized (AnonymousClass47g.class) {
            if (f50541I == null) {
                Context applicationContext = context.getApplicationContext();
                f50541I = new AnonymousClass47g(applicationContext, new AnonymousClass2ol(applicationContext, applicationContext.getPackageManager()));
            }
            anonymousClass47g = f50541I;
        }
        return anonymousClass47g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public final boolean m23309B() {
        /*
        r3 = this;
        X.AnonymousClass47g.m23306C();
        r0 = X.AnonymousClass47g.m23307D(r3);
        r2 = 0;
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        return r2;
    L_0x000b:
        monitor-enter(r3);
        r1 = r3.f50543C;	 Catch:{ all -> 0x0028 }
        r0 = r3.f50542B;	 Catch:{ all -> 0x0028 }
        r1 = r1.getComponentEnabledSetting(r0);	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x0022;
    L_0x0016:
        r0 = r3.m23308A();	 Catch:{ all -> 0x0028 }
        if (r0 != 0) goto L_0x0022;
    L_0x001c:
        r0 = 1;
        if (r1 != r0) goto L_0x0020;
    L_0x001f:
        r2 = 1;
    L_0x0020:
        monitor-exit(r3);	 Catch:{ all -> 0x0028 }
        goto L_0x000a;
    L_0x0022:
        monitor-exit(r3);	 Catch:{ all -> 0x0028 }
        r0 = r3.m23311D();
        return r0;
    L_0x0028:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0028 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.47g.B():boolean");
    }

    /* renamed from: C */
    private static void m23306C() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot block UI thread when waiting for service call.");
        }
    }

    /* renamed from: C */
    public final boolean m23310C() {
        boolean z = false;
        if (AnonymousClass47g.m23307D(this)) {
            synchronized (this) {
                if (this.f50543C.getComponentEnabledSetting(this.f50542B) == 1) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: D */
    public final boolean m23311D() {
        AnonymousClass47g.m23306C();
        boolean z = false;
        if (AnonymousClass47g.m23307D(this)) {
            boolean z2 = AnonymousClass2oX.m17280B(this.f50545E).f34283D;
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f50543C.setComponentEnabledSetting(this.f50542B, z2 ? 1 : 2, 1);
                this.f50544D.edit().putLong("/is_managed_app_cache/is_managed_app_last_check", currentTimeMillis).apply();
                if (this.f50543C.getComponentEnabledSetting(this.f50542B) == 1) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: D */
    private static boolean m23307D(AnonymousClass47g anonymousClass47g) {
        AnonymousClass2ol anonymousClass2ol = anonymousClass47g.f50546F;
        AnonymousClass2os anonymousClass2os = anonymousClass2ol.f34357D;
        AnonymousClass2of B = anonymousClass2ol.m17291B();
        List arrayList = new ArrayList();
        AnonymousClass2oi A = anonymousClass2ol.f34356C.m17295A();
        if (A != null) {
            arrayList.add(A);
        }
        A = anonymousClass2ol.f34358E.m17307A();
        if (A != null) {
            arrayList.add(A);
        }
        A = anonymousClass2ol.f34355B.m17294A();
        if (A != null) {
            arrayList.add(A);
        }
        List A2 = anonymousClass2os.m17303A(B, arrayList);
        AnonymousClass2ok anonymousClass2ok = (AnonymousClass2ok) A2.get(0);
        A2.remove(0);
        if (new AnonymousClass2ok((AnonymousClass1Fo) null, 3, anonymousClass2ok.f34350C, anonymousClass2ok.f34349B, anonymousClass2ok.f34354G, anonymousClass2ok.f34352E, anonymousClass2ok.f34351D, anonymousClass2ok.f34353F, A2).f34351D && anonymousClass47g.f50546F.m17290A(1)) {
            return true;
        }
        return false;
    }
}
