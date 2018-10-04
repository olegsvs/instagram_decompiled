package X;

import android.content.SharedPreferences;

/* renamed from: X.17y */
public final class AnonymousClass17y implements AnonymousClass0G2 {
    /* renamed from: B */
    public AnonymousClass1C0 f14861B;
    /* renamed from: C */
    public SharedPreferences f14862C;
    /* renamed from: D */
    public AnonymousClass0Cm f14863D;

    public AnonymousClass17y(AnonymousClass0Cm anonymousClass0Cm) {
        this.f14861B = AnonymousClass1C0.m9882B(anonymousClass0Cm);
        this.f14863D = anonymousClass0Cm;
        this.f14862C = AnonymousClass0Mu.m3253B(anonymousClass0Cm, "accountLinkageMetadata");
    }

    /* renamed from: A */
    public final String m9521A() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f14863D.f1759C);
        stringBuilder.append("_");
        stringBuilder.append("pref_key_prefix_last_synced_ms");
        return stringBuilder.toString();
    }

    /* renamed from: B */
    public static AnonymousClass17y m9520B(AnonymousClass0Cm anonymousClass0Cm) {
        Class cls = AnonymousClass17y.class;
        AnonymousClass17y anonymousClass17y = (AnonymousClass17y) anonymousClass0Cm.m1036A(cls);
        if (anonymousClass17y != null) {
            return anonymousClass17y;
        }
        Object anonymousClass17y2 = new AnonymousClass17y(anonymousClass0Cm);
        anonymousClass0Cm.m1039D(cls, anonymousClass17y2);
        return anonymousClass17y2;
    }

    /* renamed from: B */
    public final void m9522B(boolean z) {
        this.f14862C.edit().putBoolean("pref_key_force_sync", z).apply();
    }

    /* renamed from: C */
    public final void m9523C(int i) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f14863D);
        anonymousClass0Pt.f4229M = "linked_accounts/get_linkage_status/";
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        AnonymousClass0GA H = anonymousClass0Pt.m3944M(AnonymousClass1Im.class).m3939H();
        H.f2849B = new AnonymousClass1In(this);
        AnonymousClass0Ix.m2385E(H, i);
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.f14861B.onUserSessionWillEnd(z);
        if (z) {
            this.f14862C.edit().clear().apply();
        }
    }
}
