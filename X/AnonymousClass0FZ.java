package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.0FZ */
public final class AnonymousClass0FZ {
    /* renamed from: C */
    private static AnonymousClass0FZ f2176C;
    /* renamed from: B */
    public SharedPreferences f2177B;

    public AnonymousClass0FZ(Context context) {
        this.f2177B = context.getSharedPreferences("devprefs", 0);
    }

    /* renamed from: A */
    public final String m1635A() {
        return this.f2177B.getString("dev_server_name", JsonProperty.USE_DEFAULT_NAME);
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0FZ m1634B() {
        AnonymousClass0FZ anonymousClass0FZ;
        synchronized (AnonymousClass0FZ.class) {
            if (f2176C == null) {
                f2176C = new AnonymousClass0FZ(AnonymousClass0EV.f1977B);
            }
            anonymousClass0FZ = f2176C;
        }
        return anonymousClass0FZ;
    }

    /* renamed from: B */
    public final boolean m1636B() {
        return this.f2177B.getBoolean("direct_app_integration_enabled", true);
    }

    /* renamed from: C */
    public final boolean m1637C() {
        return m1641G() != null;
    }

    /* renamed from: D */
    public final boolean m1638D() {
        return m1642H() != null;
    }

    /* renamed from: E */
    public final boolean m1639E() {
        return m1643I() != null;
    }

    /* renamed from: F */
    public final boolean m1640F() {
        return this.f2177B.getBoolean("show_iglive_mute", false);
    }

    /* renamed from: G */
    public final String m1641G() {
        return this.f2177B.getString("qe_device_spoof_id", null);
    }

    /* renamed from: H */
    public final String m1642H() {
        return this.f2177B.getString("qe_user_bisect_id", null);
    }

    /* renamed from: I */
    public final String m1643I() {
        return this.f2177B.getString("qe_user_spoof_id", null);
    }

    /* renamed from: J */
    public final boolean m1644J() {
        return this.f2177B.getBoolean("show_live_video_debug", false);
    }

    /* renamed from: K */
    public final boolean m1645K() {
        return this.f2177B.getBoolean("tracking_quick_experiments", false);
    }

    /* renamed from: L */
    public final boolean m1646L() {
        return this.f2177B.getBoolean("vc_audio_off", false);
    }

    /* renamed from: M */
    public final boolean m1647M() {
        return this.f2177B.getBoolean("vc_video_off", false);
    }

    /* renamed from: N */
    public final boolean m1648N() {
        return this.f2177B.getBoolean("using_dev_server", false);
    }

    /* renamed from: O */
    public final void m1649O(int i) {
        this.f2177B.edit().putInt("instacrash_loop_test_crashes_left", i).apply();
    }

    /* renamed from: P */
    public final void m1650P(String str) {
        this.f2177B.edit().putString("mqtt_server_name", str).apply();
    }

    /* renamed from: Q */
    public final void m1651Q(String str) {
        this.f2177B.edit().putString("qe_device_spoof_id", str).apply();
    }

    /* renamed from: R */
    public final void m1652R(boolean z) {
        this.f2177B.edit().putBoolean("qe_synced_with_cached_strore", z).apply();
    }

    /* renamed from: S */
    public final void m1653S(int i) {
        this.f2177B.edit().putInt("qe_user_bisect_top", i).apply();
    }

    /* renamed from: T */
    public final void m1654T(int i) {
        this.f2177B.edit().putInt("qe_user_bisect_bottom", i).apply();
    }

    /* renamed from: U */
    public final void m1655U(String str) {
        this.f2177B.edit().putString("qe_user_spoof_id", str).apply();
    }

    /* renamed from: V */
    public final void m1656V(boolean z) {
        this.f2177B.edit().putBoolean("using_dev_server", z).apply();
    }

    /* renamed from: W */
    public final void m1657W(boolean z) {
        this.f2177B.edit().putBoolean("using_mqtt_sandbox", z).apply();
    }
}
