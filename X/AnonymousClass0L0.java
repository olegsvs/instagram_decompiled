package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0L0 */
public final class AnonymousClass0L0 extends AnonymousClass0L1 {
    public AnonymousClass0L0(AnonymousClass0Kz anonymousClass0Kz, AnonymousClass0Kv anonymousClass0Kv) {
        super(anonymousClass0Kz, anonymousClass0Kv);
    }

    /* renamed from: A */
    public final Intent mo702A(Intent intent, Context context, String str) {
        return m2870C(intent, context, str, m2881C(intent, context));
    }

    /* renamed from: B */
    public final Intent mo703B(Intent intent, Context context, String str) {
        return m2870C(intent, context, str, m2882D(intent, context));
    }

    /* renamed from: B */
    public static boolean m2869B(AnonymousClass0L0 anonymousClass0L0, ComponentInfo componentInfo, Context context) {
        PackageItemInfo packageItemInfo = componentInfo.applicationInfo;
        if (packageItemInfo != null) {
            String str = packageItemInfo.packageName;
            if (str.equals(context.getPackageName())) {
                return true;
            }
            if (anonymousClass0L0.m2885G()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Detected different package name component but fail open: ");
                stringBuilder.append(str);
                anonymousClass0L0.f3164B.HKA("InternalIntentScope", stringBuilder.toString(), null);
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private Intent m2870C(Intent intent, Context context, String str, List list) {
        try {
            intent = AnonymousClass0LE.m2919B(intent, context, str);
        } catch (Throwable e) {
            this.f3164B.HKA("InternalIntentScope", "Error attaching caller info to Intent.", e);
        }
        if (AnonymousClass0L1.m2878I(intent, context)) {
            return intent;
        }
        List arrayList = new ArrayList(list.size());
        for (ComponentInfo componentInfo : list) {
            if (AnonymousClass0L0.m2869B(this, componentInfo, context)) {
                arrayList.add(componentInfo);
            }
        }
        if (arrayList.isEmpty()) {
            this.f3164B.HKA("InternalIntentScope", "No matching internal components", null);
            return null;
        }
        ComponentInfo componentInfo2 = (ComponentInfo) arrayList.get(0);
        intent.setComponent(new ComponentName(componentInfo2.packageName, componentInfo2.name));
        return intent;
    }
}
