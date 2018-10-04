package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0DM */
public final class AnonymousClass0DM {
    /* renamed from: B */
    public static Map m1208B(Context context) {
        Map hashMap = new HashMap();
        Set<String> F = AnonymousClass0DM.m1212F(context);
        if (!(F == null || F.isEmpty())) {
            SharedPreferences C = AnonymousClass0DM.m1209C(context);
            for (String str : F) {
                CharSequence string = C.getString(str, JsonProperty.USE_DEFAULT_NAME);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: C */
    public static SharedPreferences m1209C(Context context) {
        return context.getSharedPreferences("acra_criticaldata_store", 0);
    }

    /* renamed from: D */
    public static String m1210D(Context context) {
        return AnonymousClass0DM.m1209C(context).getString("USER_ID", JsonProperty.USE_DEFAULT_NAME);
    }

    /* renamed from: E */
    public static void m1211E(Context context, String str, String str2) {
        if (VERSION.SDK_INT < 11) {
            AnonymousClass0Dc.m1255R("CriticalAppData", "dropping key '%s' due to low api level", str);
        } else if (TextUtils.isEmpty(str) || str.equals("USER_ID") || str.equals("DEVICE_ID")) {
            throw new IllegalArgumentException("Invalid parameter");
        } else {
            Collection F = AnonymousClass0DM.m1212F(context);
            if (F == null || F.size() <= 5) {
                SharedPreferences C = AnonymousClass0DM.m1209C(context);
                if (F == null || !F.contains(str)) {
                    Set hashSet;
                    if (F == null) {
                        hashSet = new HashSet();
                    } else {
                        hashSet = new HashSet(F);
                    }
                    hashSet.add(str);
                    C.edit().putStringSet("ADDITIONAL_PARAMS", hashSet).commit();
                }
                if (!str2.equals(C.getString(str, JsonProperty.USE_DEFAULT_NAME))) {
                    AnonymousClass0DM.m1209C(context).edit().putString(str, str2).commit();
                }
                return;
            }
            AnonymousClass0Dc.m1255R("CriticalAppData", "dropping key '%s' due to too many additional params", str);
        }
    }

    /* renamed from: F */
    private static Set m1212F(Context context) {
        if (VERSION.SDK_INT < 11) {
            return null;
        }
        return AnonymousClass0DM.m1209C(context).getStringSet("ADDITIONAL_PARAMS", null);
    }
}
