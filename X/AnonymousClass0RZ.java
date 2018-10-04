package X;

import android.app.Notification;
import android.content.Context;
import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0RZ */
public final class AnonymousClass0RZ {
    /* renamed from: E */
    public static AnonymousClass0RZ f4724E;
    /* renamed from: B */
    public final Map f4725B;
    /* renamed from: C */
    public final Runnable f4726C = new AnonymousClass0Rf(this);
    /* renamed from: D */
    public final AnonymousClass0Ra f4727D;

    public AnonymousClass0RZ(Context context, AnonymousClass0Ra anonymousClass0Ra) {
        this.f4727D = anonymousClass0Ra;
        this.f4725B = new HashMap();
    }

    /* renamed from: A */
    public final synchronized void m4204A(String str, int i) {
        this.f4725B.remove(AnonymousClass0RZ.m4203B(str, i));
        AnonymousClass0Ra anonymousClass0Ra = this.f4727D;
        anonymousClass0Ra.f4734C.cancel(str, i);
        if (VERSION.SDK_INT <= 19) {
            AnonymousClass0Ra.m4207C(anonymousClass0Ra, new AnonymousClass1Id(anonymousClass0Ra.f4733B.getPackageName(), i, str));
        }
    }

    /* renamed from: B */
    public static String m4203B(String str, int i) {
        return AnonymousClass0IE.m2137E("tag:[%s] id [%d]", str, Integer.valueOf(i));
    }

    /* renamed from: B */
    public final void m4205B(String str, int i, Notification notification) {
        synchronized (this) {
            AnonymousClass0Oy.m3698B().m3700B(this.f4726C);
            this.f4725B.put(AnonymousClass0RZ.m4203B(str, i), new AnonymousClass1RV(str, i, notification));
            AnonymousClass0Oy.m3698B().m3699A(this.f4726C, 1000);
        }
    }
}
