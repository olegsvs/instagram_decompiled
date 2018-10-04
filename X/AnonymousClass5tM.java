package X;

/* renamed from: X.5tM */
public final class AnonymousClass5tM extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5tP f69690B;

    public AnonymousClass5tM(AnonymousClass5tP anonymousClass5tP) {
        this.f69690B = anonymousClass5tP;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -975645025);
        AnonymousClass5tP.m28599C(this.f69690B, null, anonymousClass0Q6.f4288C != null ? ((AnonymousClass3Uz) anonymousClass0Q6.f4288C).getStatusCode() : 0);
        AnonymousClass0cQ.H(this, 226762534, I);
    }

    public final void onFailInBackground(AnonymousClass0fq anonymousClass0fq) {
        int I = AnonymousClass0cQ.I(this, 587447097);
        this.f69690B.f69700G = System.currentTimeMillis();
        AnonymousClass0cQ.H(this, 744664135, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 1168443665);
        this.f69690B.f69702I = AnonymousClass5tO.IDLE;
        AnonymousClass0cQ.H(this, -174498364, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -174164044);
        this.f69690B.f69701H = System.currentTimeMillis();
        AnonymousClass0cQ.H(this, 1491461891, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 388197918);
        AnonymousClass3Uz anonymousClass3Uz = (AnonymousClass3Uz) obj;
        int I2 = AnonymousClass0cQ.I(this, 1863487533);
        AnonymousClass5tP.m28598B(this.f69690B, anonymousClass3Uz);
        if (anonymousClass3Uz.f41704B != null) {
            this.f69690B.f69698E = anonymousClass3Uz.f41704B.intValue();
        } else {
            this.f69690B.f69698E = Integer.MAX_VALUE;
        }
        AnonymousClass0cQ.H(this, 263636057, I2);
        AnonymousClass0cQ.H(this, -1185196121, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1391996831);
        AnonymousClass3Uz anonymousClass3Uz = (AnonymousClass3Uz) obj;
        int I2 = AnonymousClass0cQ.I(this, 2119015876);
        this.f69690B.f69700G = System.currentTimeMillis();
        AnonymousClass0cQ.H(this, -1481949839, I2);
        AnonymousClass0cQ.H(this, 1127112231, I);
    }
}
