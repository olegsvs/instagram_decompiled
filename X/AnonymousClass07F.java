package X;

/* renamed from: X.07F */
public final class AnonymousClass07F implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Af f504B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass07W f505C;

    public AnonymousClass07F(AnonymousClass0Af anonymousClass0Af, AnonymousClass07W anonymousClass07W) {
        this.f504B = anonymousClass0Af;
        this.f505C = anonymousClass07W;
    }

    public final void run() {
        AnonymousClass1iu anonymousClass1iu = (AnonymousClass1iu) this.f505C.f552F.mo82A();
        if (anonymousClass1iu.equals(AnonymousClass1iu.FAILED_CONNECTION_REFUSED_SERVER_SHEDDING_LOAD) || anonymousClass1iu.equals(AnonymousClass1iu.FAILED_CONNECTION_REFUSED_NOT_AUTHORIZED)) {
            this.f504B.f1267D.f21698D.m515E();
        }
        if (this.f504B.f1267D.f21716V == this.f504B.f1266C) {
            if (anonymousClass1iu.equals(AnonymousClass1iu.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD)) {
                this.f504B.f1267D.f21719Y.clear();
            }
            AnonymousClass1ia.m12680G(this.f504B.f1267D, AnonymousClass07K.CONNECT_FAILED, AnonymousClass05y.m353C(anonymousClass1iu));
        } else if (this.f504B.f1267D.f21730j == this.f504B.f1266C) {
            AnonymousClass1ia.m12675B(this.f504B.f1267D);
        }
        ((AnonymousClass0Bk) this.f504B.f1267D.f21721a.m12720C(AnonymousClass0Bk.class)).m689B(AnonymousClass0AM.LastConnectFailureReason, anonymousClass1iu.name());
    }
}
