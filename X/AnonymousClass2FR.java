package X;

import android.content.SharedPreferences;

/* renamed from: X.2FR */
public final class AnonymousClass2FR {
    /* renamed from: B */
    public static SharedPreferences m14829B() {
        return AnonymousClass0Mu.C("FilterPreferences");
    }

    /* renamed from: C */
    public static final void m14830C(boolean z) {
        AnonymousClass2FR.m14829B().edit().putBoolean("needs_lanczos_fallback", z).apply();
    }

    /* renamed from: D */
    public static final void m14831D(String str) {
        AnonymousClass2FR.m14829B().edit().putString("photo_filter_tray", str).apply();
    }
}
