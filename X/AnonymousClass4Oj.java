package X;

/* renamed from: X.4Oj */
public final class AnonymousClass4Oj implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Ol f53594B;

    public AnonymousClass4Oj(AnonymousClass4Ol anonymousClass4Ol) {
        this.f53594B = anonymousClass4Ol;
    }

    public final void run() {
        AnonymousClass0eB anonymousClass0eB = this.f53594B.f53600G;
        AnonymousClass0Ur anonymousClass0Ur = anonymousClass0eB.IB;
        if (anonymousClass0Ur != null) {
            anonymousClass0Ur.dismiss();
            anonymousClass0eB.IB = null;
        }
        AnonymousClass4Ol.m24092C(this.f53594B);
    }
}
