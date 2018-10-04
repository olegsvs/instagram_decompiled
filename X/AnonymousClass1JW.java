package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.1JW */
public final class AnonymousClass1JW {
    /* renamed from: B */
    public static void m10702B(Context context) {
        context = AnonymousClass1JW.m10703C(context).edit();
        context.putString("dm_registration", JsonProperty.USE_DEFAULT_NAME);
        context.putLong("last_registration_change", System.currentTimeMillis());
        context.apply();
    }

    /* renamed from: C */
    public static SharedPreferences m10703C(Context context) {
        return context.getSharedPreferences("com.google.android.c2dm", 0);
    }

    /* renamed from: D */
    public static void m10704D(Context context, String str, boolean z) {
        try {
            ComponentName H;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
            intent.putExtra("sender", str);
            if (z) {
                intent.setPackage("com.google.android.gms");
                H = AnonymousClass0IW.f2749B.m2868D().m2917H(intent, context);
            } else {
                H = null;
            }
            if (H == null) {
                intent.setPackage("com.google.android.gsf");
                H = AnonymousClass0IW.f2749B.m2868D().m2917H(intent, context);
            }
            if (H == null) {
                AnonymousClass0NN.m3291B("ig_android_gcm_registration", null).m3298F("error_msg", "Cannot start GCM service. Could not find matching package or intent-filter.").m3310R();
                return;
            }
            H.toString();
        } catch (Throwable e) {
            AnonymousClass0NN.m3291B("ig_android_gcm_registration", null).m3298F("error", "exception").m3298F("error_msg", e.getMessage()).m3310R();
            AnonymousClass0Gn.m1879F("ig_android_gcm_registration_failure", "Error when registering for GCM", e, 1);
            AnonymousClass0Dc.m1244G("GCMessaging", "GCM not supported", e);
        }
    }
}
