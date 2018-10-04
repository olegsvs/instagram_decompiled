package X;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: X.1ht */
public final class AnonymousClass1ht extends AnonymousClass1zl {
    /* renamed from: B */
    public static String m12634B(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) AnonymousClass20z.B(new AnonymousClass1zp(sharedPreferences, str, str2));
        } catch (Exception e) {
            str = "FlagDataUtils";
            String str3 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return str2;
        }
    }
}
