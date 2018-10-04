package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.005 */
public abstract class AnonymousClass005 extends Service {
    /* renamed from: H */
    public static final HashMap f5H = new HashMap();
    /* renamed from: I */
    public static final Object f6I = new Object();
    /* renamed from: B */
    public final ArrayList f7B;
    /* renamed from: C */
    public AnonymousClass004 f8C;
    /* renamed from: D */
    public AnonymousClass001 f9D;
    /* renamed from: E */
    public boolean f10E = false;
    /* renamed from: F */
    public boolean f11F = false;
    /* renamed from: G */
    public AnonymousClass002 f12G;

    /* renamed from: C */
    public abstract void mo173C(Intent intent);

    public AnonymousClass005() {
        if (VERSION.SDK_INT >= 26) {
            this.f7B = null;
        } else {
            this.f7B = new ArrayList();
        }
    }

    /* renamed from: A */
    public AnonymousClass003 mo12A() {
        AnonymousClass002 anonymousClass002 = this.f12G;
        if (anonymousClass002 != null) {
            return anonymousClass002.PG();
        }
        AnonymousClass003 anonymousClass003;
        synchronized (this.f7B) {
            if (this.f7B.size() > 0) {
                anonymousClass003 = (AnonymousClass003) this.f7B.remove(0);
            } else {
                anonymousClass003 = null;
            }
        }
        return anonymousClass003;
    }

    /* renamed from: B */
    public static void m5B(Context context, Class cls, int i, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent != null) {
            synchronized (f6I) {
                AnonymousClass004 C = AnonymousClass005.m6C(context, componentName, true, i);
                C.m1B(i);
                C.mo13A(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: B */
    public final void m8B(boolean z) {
        if (this.f9D == null) {
            this.f9D = new AnonymousClass001(this);
            AnonymousClass004 anonymousClass004 = this.f8C;
            if (anonymousClass004 != null && z) {
                anonymousClass004.mo15D();
            }
            this.f9D.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: C */
    public static AnonymousClass004 m6C(Context context, ComponentName componentName, boolean z, int i) {
        AnonymousClass004 anonymousClass004 = (AnonymousClass004) f5H.get(componentName);
        if (anonymousClass004 == null) {
            if (VERSION.SDK_INT < 26) {
                anonymousClass004 = new AnonymousClass09q(context, componentName);
            } else if (z) {
                anonymousClass004 = new AnonymousClass09u(context, componentName, i);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            f5H.put(componentName, anonymousClass004);
        }
        return anonymousClass004;
    }

    /* renamed from: D */
    public final void m10D() {
        ArrayList arrayList = this.f7B;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f9D = null;
                if (this.f7B != null && this.f7B.size() > 0) {
                    m8B(false);
                } else if (!this.f10E) {
                    this.f8C.mo14C();
                }
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        AnonymousClass002 anonymousClass002 = this.f12G;
        return anonymousClass002 != null ? anonymousClass002.tE() : null;
    }

    public final void onCreate() {
        int J = AnonymousClass0cQ.m5860J(this, 1090800241);
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.f12G = new AnonymousClass09t(this);
            this.f8C = null;
        } else {
            this.f12G = null;
            this.f8C = AnonymousClass005.m6C(this, new ComponentName(this, getClass()), false, 0);
        }
        AnonymousClass0cQ.m5861K(this, -1545950430, J);
    }

    public final void onDestroy() {
        int J = AnonymousClass0cQ.m5860J(this, 1273932822);
        super.onDestroy();
        ArrayList arrayList = this.f7B;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f10E = true;
                    this.f8C.mo14C();
                } catch (Throwable th) {
                    AnonymousClass0cQ.m5861K(this, 1838122199, J);
                }
            }
        }
        AnonymousClass0cQ.m5861K(this, -1482500401, J);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int J = AnonymousClass0cQ.m5860J(this, -1016457988);
        if (this.f7B != null) {
            this.f8C.mo16E();
            synchronized (this.f7B) {
                try {
                    ArrayList arrayList = this.f7B;
                    if (intent == null) {
                        intent = new Intent();
                    }
                    arrayList.add(new AnonymousClass09r(this, intent, i2));
                    m8B(true);
                } finally {
                    while (true) {
                    }
                    AnonymousClass0cQ.m5861K(this, -1601867078, J);
                }
            }
            return 3;
        }
        AnonymousClass0cQ.m5861K(this, 1883291670, J);
        return 2;
    }
}
