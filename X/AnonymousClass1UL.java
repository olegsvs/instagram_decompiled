package X;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: X.1UL */
public final class AnonymousClass1UL {
    /* renamed from: B */
    public static AnonymousClass3Mg m11589B(Context context, AnonymousClass0f7 anonymousClass0f7, AnonymousClass0Cm anonymousClass0Cm, Executor executor) {
        if (!((Boolean) AnonymousClass0CC.Nm.m845G()).booleanValue()) {
            return new AnonymousClass40N();
        }
        String str = (String) AnonymousClass0CC.Om.m845G();
        Object obj = -1;
        int hashCode = str.hashCode();
        if (hashCode != 3271912) {
            if (hashCode == 1989861112) {
                if (str.equals("preferences")) {
                    obj = null;
                }
            }
        } else if (str.equals("json")) {
            obj = 1;
        }
        switch (obj) {
            case null:
                return new AnonymousClass1UM(context, anonymousClass0Cm);
            case 1:
                return new AnonymousClass1UN(context, anonymousClass0Cm, executor);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown store adapter configuration: ");
                stringBuilder.append((String) AnonymousClass0CC.Om.m845G());
                AnonymousClass0Gn.m1881H("StoreAdapterFactory", stringBuilder.toString());
                return new AnonymousClass1UM(context, anonymousClass0Cm);
        }
    }
}
