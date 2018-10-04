package X;

/* renamed from: X.0Iu */
public final class AnonymousClass0Iu implements AnonymousClass0GA {
    /* renamed from: B */
    public AnonymousClass0Iw f2849B;
    /* renamed from: C */
    private final String f2850C;
    /* renamed from: D */
    private final AnonymousClass0Xx f2851D;

    public AnonymousClass0Iu(AnonymousClass0Xx anonymousClass0Xx) {
        this(anonymousClass0Xx, "HttpRequest", "path undefined");
    }

    public AnonymousClass0Iu(AnonymousClass0Xx anonymousClass0Xx, String str, String str2) {
        this.f2851D = anonymousClass0Xx;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(str2.split("\\?")[0]);
        this.f2850C = stringBuilder.toString();
    }

    /* renamed from: A */
    public final void m2381A() {
        this.f2851D.f6233B.m5280A();
    }

    public final String getName() {
        return this.f2850C;
    }

    public final void onFinish() {
        AnonymousClass0Iw anonymousClass0Iw = this.f2849B;
        if (anonymousClass0Iw != null) {
            anonymousClass0Iw.onFinish();
            if (this.f2851D.m5274A()) {
                this.f2849B.onFail(new AnonymousClass0Q6((Throwable) AnonymousClass0LH.m2927E(this.f2851D.f6234C)));
                return;
            }
            AnonymousClass0Pp anonymousClass0Pp = (AnonymousClass0Pp) this.f2851D.f6235D;
            if (anonymousClass0Pp.isOk()) {
                this.f2849B.onSuccess(anonymousClass0Pp);
            } else {
                this.f2849B.onFail(new AnonymousClass0Q6(AnonymousClass0LH.m2927E(anonymousClass0Pp)));
            }
        }
    }

    public final void onStart() {
        AnonymousClass0Iw anonymousClass0Iw = this.f2849B;
        if (anonymousClass0Iw != null) {
            anonymousClass0Iw.onStart();
        }
    }

    public final void run() {
        this.f2851D.run();
        if (this.f2849B == null) {
            return;
        }
        if (this.f2851D.m5274A()) {
            this.f2849B.onFailInBackground(AnonymousClass0fp.f7999B);
            return;
        }
        Object obj = (AnonymousClass0Pp) this.f2851D.f6235D;
        if (obj.isOk()) {
            this.f2849B.onSuccessInBackground(obj);
        } else {
            this.f2849B.onFailInBackground(AnonymousClass0fq.mo1547C(obj));
        }
    }

    public final String toString() {
        return this.f2851D.toString();
    }
}
