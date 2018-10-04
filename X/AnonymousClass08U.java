package X;

import android.content.Context;
import com.facebook.rti.push.service.FbnsService;

/* renamed from: X.08U */
public final class AnonymousClass08U {
    /* renamed from: B */
    public static boolean m526B(Context context) {
        Context context2 = context;
        String C = AnonymousClass1Co.m9930C(context);
        if (!AnonymousClass1Co.m9934G(C)) {
            return true;
        }
        AnonymousClass1DC.m9972C(context2, FbnsService.m9979C(C), "FbnsSuspendSwitch", true, C, "com.facebook.rti.intent.ACTION_FBNS_KILL_SWITCH_DISABLE_SERVICE", null);
        return false;
    }
}
