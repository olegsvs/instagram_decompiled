package X;

/* renamed from: X.1L7 */
public final class AnonymousClass1L7 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Fk f17288B;

    public AnonymousClass1L7(AnonymousClass0Fk anonymousClass0Fk) {
        this.f17288B = anonymousClass0Fk;
    }

    public final void run() {
        if (!this.f17288B.f2194C) {
            this.f17288B.f2195D = Boolean.valueOf(false);
        } else if (!this.f17288B.m1668C()) {
            this.f17288B.f2195D = Boolean.valueOf(true);
            for (AnonymousClass0EJ onAppBackgrounded : this.f17288B.f2193B) {
                onAppBackgrounded.onAppBackgrounded();
            }
            AnonymousClass0Fk anonymousClass0Fk = this.f17288B;
            for (Runnable B : anonymousClass0Fk.f2198G) {
                AnonymousClass0GG.m1763B(anonymousClass0Fk.f2197F, B, -57557127);
            }
            anonymousClass0Fk.f2198G.clear();
        }
        this.f17288B.f2196E = false;
    }
}
