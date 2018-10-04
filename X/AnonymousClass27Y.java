package X;

/* renamed from: X.27Y */
public final class AnonymousClass27Y implements AnonymousClass0ES {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2VC f26290B;

    public AnonymousClass27Y(AnonymousClass2VC anonymousClass2VC) {
        this.f26290B = anonymousClass2VC;
    }

    /* renamed from: A */
    public final Boolean m14498A() {
        if ((this.f26290B.m16110C(AnonymousClass166.class) ^ 1) != 0) {
            AnonymousClass0HV C = AnonymousClass0HV.C();
            if (!C.f2646B.getBoolean("has_used_region_tracking_v2", false)) {
                if (C.f2646B.getInt("region_tracking_nux_impressions", 0) < 3) {
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return m14498A();
    }
}
