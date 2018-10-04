package X;

/* renamed from: X.0a3 */
public final class AnonymousClass0a3 {
    /* renamed from: B */
    public static boolean m5428B() {
        if (AnonymousClass0FZ.m1634B().f2177B.getBoolean("force_off_session_scoping_facebook_account", false)) {
            return false;
        }
        if (AnonymousClass0CB.m834D()) {
            return true;
        }
        boolean booleanValue = ((Boolean) AnonymousClass0CC.yc.m914G()).booleanValue();
        if (booleanValue) {
            AnonymousClass0FH.f2099C.f2100B.edit().putBoolean("exposed_session_scoping_facebook_account", true).apply();
        }
        return booleanValue;
    }
}
