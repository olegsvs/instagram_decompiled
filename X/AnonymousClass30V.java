package X;

/* renamed from: X.30V */
public final class AnonymousClass30V {
    /* renamed from: C */
    public static AnonymousClass30V f36813C;
    /* renamed from: B */
    public AnonymousClass30d f36814B;

    /* renamed from: A */
    public final void m18166A(AnonymousClass30c anonymousClass30c, AnonymousClass0Iw anonymousClass0Iw) {
        AnonymousClass30d anonymousClass30d = this.f36814B;
        if (anonymousClass30d == null) {
            anonymousClass30c.onFinish();
        } else if (anonymousClass30d.f36842G) {
            AnonymousClass30d.m18184B(anonymousClass30d, anonymousClass30c, anonymousClass0Iw);
        } else {
            anonymousClass30d.f36843H = anonymousClass30c;
            anonymousClass30d.f36844I = anonymousClass0Iw;
        }
    }

    /* renamed from: B */
    public static synchronized AnonymousClass30V m18165B() {
        AnonymousClass30V anonymousClass30V;
        synchronized (AnonymousClass30V.class) {
            if (f36813C == null) {
                f36813C = new AnonymousClass30V();
            }
            anonymousClass30V = f36813C;
        }
        return anonymousClass30V;
    }
}
