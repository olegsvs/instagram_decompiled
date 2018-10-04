package X;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;

/* renamed from: X.0fj */
public final class AnonymousClass0fj {
    /* renamed from: B */
    public static Boolean m6547B(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return Boolean.valueOf(((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled());
        }
        return Boolean.valueOf(AnonymousClass0Ra.m4206B(context).m4208A());
    }

    /* renamed from: C */
    public static void m6548C(Context context) {
        Intent intent = new Intent();
        if (VERSION.SDK_INT >= 21) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("package:");
            stringBuilder.append(context.getPackageName());
            intent.setData(Uri.parse(stringBuilder.toString()));
        }
        AnonymousClass0IW.m2251Q(intent, context);
    }
}
