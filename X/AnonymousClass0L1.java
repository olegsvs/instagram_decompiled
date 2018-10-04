package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0L1 */
public abstract class AnonymousClass0L1 {
    /* renamed from: B */
    public final AnonymousClass0Kv f3164B;
    /* renamed from: C */
    public final boolean f3165C;
    /* renamed from: D */
    private final AnonymousClass0Kz f3166D;

    /* renamed from: A */
    public abstract Intent mo702A(Intent intent, Context context, String str);

    /* renamed from: B */
    public abstract Intent mo703B(Intent intent, Context context, String str);

    public AnonymousClass0L1(AnonymousClass0Kz anonymousClass0Kz, AnonymousClass0Kv anonymousClass0Kv) {
        this(anonymousClass0Kz, anonymousClass0Kv, false);
    }

    public AnonymousClass0L1(AnonymousClass0Kz anonymousClass0Kz, AnonymousClass0Kv anonymousClass0Kv, boolean z) {
        this.f3166D = anonymousClass0Kz;
        this.f3164B = anonymousClass0Kv;
        this.f3165C = z;
    }

    /* renamed from: C */
    public final List m2881C(Intent intent, Context context) {
        return AnonymousClass0L1.m2874E(intent, context, 65600);
    }

    /* renamed from: D */
    public static Intent m2873D(List list) {
        Parcelable[] parcelableArr = new Intent[(list.size() - 1)];
        int i = 0;
        while (i < list.size() - 1) {
            int i2 = i + 1;
            parcelableArr[i] = (Intent) list.get(i2);
            i = i2;
        }
        Intent createChooser = Intent.createChooser((Intent) list.get(0), "Choose an app to launch.");
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", parcelableArr);
        return createChooser;
    }

    /* renamed from: D */
    public final List m2882D(Intent intent, Context context) {
        return AnonymousClass0L1.m2875F(intent, context, 65600);
    }

    /* renamed from: E */
    public final AnonymousClass0Kt m2883E() {
        AnonymousClass0Kt anonymousClass0Kt;
        AnonymousClass0Kz anonymousClass0Kz = this.f3166D;
        synchronized (anonymousClass0Kz) {
            anonymousClass0Kt = anonymousClass0Kz.f3163B;
        }
        return anonymousClass0Kt;
    }

    /* renamed from: E */
    public static List m2874E(Intent intent, Context context, int i) {
        Intent<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, i);
        if (queryIntentActivities == null) {
            return Collections.emptyList();
        }
        i = new ArrayList(1);
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (!(resolveInfo.activityInfo == null || resolveInfo.activityInfo.applicationInfo == null)) {
                i.add(resolveInfo.activityInfo);
            }
        }
        return i;
    }

    /* renamed from: F */
    public static List m2875F(Intent intent, Context context, int i) {
        Intent<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, i);
        if (queryIntentServices == null) {
            return Collections.emptyList();
        }
        i = new ArrayList(1);
        for (ResolveInfo resolveInfo : queryIntentServices) {
            if (!(resolveInfo.serviceInfo == null || resolveInfo.serviceInfo.applicationInfo == null)) {
                i.add(resolveInfo.serviceInfo);
            }
        }
        return i;
    }

    /* renamed from: F */
    public final boolean m2884F() {
        return m2883E() == AnonymousClass0Kt.ENFORCE_EVERYWHERE;
    }

    /* renamed from: G */
    public static List m2876G(List list, Intent intent) {
        List arrayList = new ArrayList(list.size());
        for (ComponentInfo componentInfo : list) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(componentInfo.packageName, componentInfo.name));
            intent2.setPackage(componentInfo.packageName);
            arrayList.add(intent2);
        }
        return arrayList;
    }

    /* renamed from: G */
    public final boolean m2885G() {
        return m2883E() == AnonymousClass0Kt.OPEN_EVERYWHERE;
    }

    /* renamed from: H */
    public static String m2877H(Intent intent) {
        if (intent == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("intent(");
        stringBuilder.append("action = ");
        stringBuilder.append(intent.getAction());
        stringBuilder.append(", data= ");
        stringBuilder.append(intent.getData());
        stringBuilder.append(", type= ");
        stringBuilder.append(intent.getType());
        if (intent.getComponent() != null) {
            stringBuilder.append(", component = ");
            stringBuilder.append(intent.getComponent());
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            stringBuilder.append(", extras = [");
            for (String str : extras.keySet()) {
                stringBuilder.append(str);
                stringBuilder.append(" = ");
                stringBuilder.append(extras.get(str));
                stringBuilder.append(", ");
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: H */
    public final boolean m2886H() {
        if (!m2885G()) {
            if (m2883E() != AnonymousClass0Kt.OPEN_NONFB_AND_EXCEPTION_ONLY) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    public static boolean m2878I(Intent intent, Context context) {
        return intent.getComponent() != null && intent.getComponent().getPackageName().equals(context.getPackageName());
    }
}
