package X;

/* renamed from: X.0fb */
public final class AnonymousClass0fb implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0fV f7961B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0GE f7962C;

    public AnonymousClass0fb(AnonymousClass0fV anonymousClass0fV, AnonymousClass0GE anonymousClass0GE) {
        this.f7961B = anonymousClass0fV;
        this.f7962C = anonymousClass0GE;
    }

    public final void run() {
        try {
            this.f7961B.f7948B.f2321D.f7946B.edit().putString("operations", AnonymousClass0fX.m6542C(this.f7962C)).commit();
        } catch (Throwable e) {
            AnonymousClass0Gn.m1880G("ViewStateModStore", e);
        }
    }
}
