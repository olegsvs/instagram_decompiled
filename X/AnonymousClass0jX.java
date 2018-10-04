package X;

/* renamed from: X.0jX */
public final class AnonymousClass0jX implements AnonymousClass0hk {
    /* renamed from: B */
    private final AnonymousClass0Cm f9199B;

    public final boolean VTA() {
        return false;
    }

    public AnonymousClass0jX(AnonymousClass0Cm anonymousClass0Cm) {
        this.f9199B = anonymousClass0Cm;
    }

    public final boolean jTA() {
        return AnonymousClass0HV.m2008D(this.f9199B).f2646B.getInt("watch_and_more_button", 0) < 5;
    }

    public final void rDA() {
        AnonymousClass0HV D = AnonymousClass0HV.m2008D(this.f9199B);
        String str = "watch_and_more_button";
        D.f2646B.edit().putInt(str, D.f2646B.getInt(str, 0) + 1).apply();
    }
}
