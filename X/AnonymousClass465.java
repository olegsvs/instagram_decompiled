package X;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.465 */
public final class AnonymousClass465 {
    /* renamed from: B */
    public static boolean m23214B(Context context) {
        return ((AccessibilityManager) context.getApplicationContext().getSystemService("accessibility")).isEnabled();
    }

    /* renamed from: C */
    public static boolean m23215C(Context context) {
        if (VERSION.SDK_INT >= 21 && Secure.getInt(context.getContentResolver(), "accessibility_display_inversion_enabled", 0) != 0) {
            return true;
        }
        return false;
    }
}
