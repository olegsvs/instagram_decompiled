package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0L2 */
public final class AnonymousClass0L2 extends AnonymousClass0L1 {
    public AnonymousClass0L2(AnonymousClass0Kz anonymousClass0Kz, AnonymousClass0Kv anonymousClass0Kv, boolean z) {
        super(anonymousClass0Kz, anonymousClass0Kv, z);
    }

    /* renamed from: A */
    public final Intent mo702A(Intent intent, Context context, String str) {
        return m2887B(intent, context, str, m2881C(intent, context));
    }

    /* renamed from: B */
    public final Intent mo703B(Intent intent, Context context, String str) {
        return m2887B(intent, context, str, m2882D(intent, context));
    }

    /* renamed from: B */
    private Intent m2887B(Intent intent, Context context, String str, List list) {
        try {
            intent = AnonymousClass0LE.m2919B(intent, context, str);
        } catch (Throwable e) {
            this.f3164B.HKA("SameKeyIntentScope", "Error attaching caller info to Intent.", e);
        }
        if (AnonymousClass0L1.m2878I(intent, context)) {
            return intent;
        }
        List<ComponentInfo> C = m2888C(context, list);
        if (C.isEmpty()) {
            this.f3164B.HKA("SameKeyIntentScope", "No matching same-key components.", null);
            return null;
        } else if (this.f3165C && C.size() > 1) {
            return AnonymousClass0L1.m2873D(AnonymousClass0L1.m2876G(C, intent));
        } else {
            PackageItemInfo packageItemInfo = (ComponentInfo) C.get(0);
            if (C.size() > 1) {
                for (ComponentInfo componentInfo : C) {
                    if (!context.getPackageName().equals(componentInfo.packageName)) {
                        ComponentInfo componentInfo2 = componentInfo;
                    }
                }
            }
            intent.setComponent(new ComponentName(packageItemInfo.packageName, packageItemInfo.name));
            return intent;
        }
    }

    /* renamed from: C */
    private List m2888C(Context context, List list) {
        List arrayList = new ArrayList(list.size());
        PackageItemInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            this.f3164B.HKA("SameKeyIntentScope", "Current app info is null.", null);
            return arrayList;
        }
        for (ComponentInfo componentInfo : list) {
            PackageItemInfo packageItemInfo = componentInfo.applicationInfo;
            if (packageItemInfo == null) {
                this.f3164B.HKA("SameKeyIntentScope", "Target app info is null.", null);
            } else if (AnonymousClass1JX.m10709F(context, applicationInfo, packageItemInfo)) {
                arrayList.add(componentInfo);
            } else if (m2885G()) {
                this.f3164B.HKA("SameKeyIntentScope", String.format("Different signature of the component but fail-open: current app=%s, target app=%s.", new Object[]{applicationInfo.packageName, packageItemInfo.packageName}), null);
                arrayList.add(componentInfo);
            } else {
                this.f3164B.HKA("SameKeyIntentScope", String.format("Different signature component blocked: current app=%s, target app=%s.", new Object[]{applicationInfo.packageName, packageItemInfo.packageName}), null);
            }
        }
        return arrayList;
    }
}
