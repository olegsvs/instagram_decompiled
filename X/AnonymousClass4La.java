package X;

/* renamed from: X.4La */
public final class AnonymousClass4La implements AnonymousClass0ES {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Cm f53077B;

    public AnonymousClass4La(AnonymousClass4Lb anonymousClass4Lb, AnonymousClass0Cm anonymousClass0Cm) {
        this.f53077B = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final Boolean m23957A() {
        AnonymousClass0HV D = AnonymousClass0HV.D(this.f53077B);
        String str = "visual_replies_nux_overlay_impressions";
        int i = D.f2646B.getInt(str, 0);
        if (i >= 3 || D.f2646B.getBoolean("has_tapped_on_visual_reply_thumbnail", false)) {
            return Boolean.valueOf(false);
        }
        D.f2646B.edit().putInt(str, i + 1).apply();
        return Boolean.valueOf(true);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return m23957A();
    }
}
