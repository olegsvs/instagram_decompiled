package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;

/* renamed from: X.1zc */
public final class AnonymousClass1zc {
    /* renamed from: B */
    public static final Object f25100B = new Object();
    /* renamed from: C */
    public static volatile AnonymousClass1zc f25101C;

    /* renamed from: B */
    public static boolean m14115B(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : AnonymousClass1hm.B(context, component.getPackageName()))) {
            return AnonymousClass17r.B(context, intent, serviceConnection, i, -1600961754);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
