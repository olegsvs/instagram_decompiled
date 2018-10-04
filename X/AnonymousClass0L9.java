package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0L9 */
public abstract class AnonymousClass0L9 extends AnonymousClass0L1 {
    /* renamed from: I */
    public abstract boolean mo704I(Context context, ComponentInfo componentInfo);

    public AnonymousClass0L9(AnonymousClass0Kz anonymousClass0Kz, AnonymousClass0Kv anonymousClass0Kv) {
        super(anonymousClass0Kz, anonymousClass0Kv);
    }

    /* renamed from: A */
    public final Intent mo702A(Intent intent, Context context, String str) {
        if (AnonymousClass0L1.m2878I(intent, context)) {
            return null;
        }
        List C = m2881C(intent, context);
        if (C.isEmpty()) {
            C = AnonymousClass0L1.m2874E(intent, context, 0);
        }
        return m2903B(intent, context, C);
    }

    /* renamed from: B */
    public final Intent mo703B(Intent intent, Context context, String str) {
        if (AnonymousClass0L1.m2878I(intent, context)) {
            return null;
        }
        List D = m2882D(intent, context);
        if (D.isEmpty()) {
            D = AnonymousClass0L1.m2875F(intent, context, 0);
        }
        return m2903B(intent, context, D);
    }

    /* renamed from: B */
    private Intent m2903B(Intent intent, Context context, List list) {
        List arrayList = new ArrayList(list.size());
        for (ComponentInfo componentInfo : list) {
            StringBuilder stringBuilder;
            if (mo704I(context, componentInfo)) {
                Object obj = (componentInfo.applicationInfo == null || !"com.android.internal.app.ResolverActivity".equals(componentInfo.applicationInfo.className)) ? null : 1;
                if (obj == null) {
                    arrayList.add(componentInfo);
                } else if (m2886H()) {
                    arrayList.add(componentInfo);
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Found potentially dangerous resolver but not removing: ");
                    stringBuilder.append(AnonymousClass0L1.m2877H(intent));
                    this.f3164B.HKA("DifferentKeyIntentScope", stringBuilder.toString(), null);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Removed potentially dangerous resolver: ");
                    stringBuilder.append(AnonymousClass0L1.m2877H(intent));
                    this.f3164B.HKA("DifferentKeyIntentScope", stringBuilder.toString(), null);
                }
            } else if (m2885G()) {
                arrayList.add(componentInfo);
                stringBuilder = new StringBuilder();
                stringBuilder.append("Non-external/third-party component detected, but allowing because of fail-open: ");
                stringBuilder.append(AnonymousClass0L1.m2877H(intent));
                this.f3164B.HKA("DifferentKeyIntentScope", stringBuilder.toString(), null);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Removed non-external/third-party component: ");
                stringBuilder.append(AnonymousClass0L1.m2877H(intent));
                this.f3164B.HKA("DifferentKeyIntentScope", stringBuilder.toString(), null);
            }
        }
        if (arrayList.isEmpty()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("No matching different-signature components for: ");
            stringBuilder.append(AnonymousClass0L1.m2877H(intent));
            this.f3164B.HKA("DifferentKeyIntentScope", stringBuilder.toString(), null);
            return null;
        }
        if (arrayList.size() != list.size()) {
            if (arrayList.size() > 1) {
                intent = AnonymousClass0L1.m2873D(AnonymousClass0L1.m2876G(arrayList, intent));
            } else {
                ComponentInfo componentInfo2 = (ComponentInfo) arrayList.get(0);
                intent.setComponent(new ComponentName(componentInfo2.packageName, componentInfo2.name));
            }
        }
        return AnonymousClass1JZ.m10710B(intent, this.f3164B, m2885G());
    }
}
