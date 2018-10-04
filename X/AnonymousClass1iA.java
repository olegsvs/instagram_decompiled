package X;

import java.util.Set;

/* renamed from: X.1iA */
public final class AnonymousClass1iA implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1GH f21614B;
    /* renamed from: C */
    public final /* synthetic */ Set f21615C;

    public AnonymousClass1iA(AnonymousClass1GH anonymousClass1GH, Set set) {
        this.f21614B = anonymousClass1GH;
        this.f21615C = set;
    }

    public final void run() {
        synchronized (this.f21614B) {
            if (this.f21614B.f16239C.get()) {
                for (String requestLocationUpdates : this.f21615C) {
                    this.f21614B.f16240D.requestLocationUpdates(requestLocationUpdates, this.f21614B.f16241E.f16167H, 0.0f, this.f21614B.f16238B);
                }
            }
        }
    }
}
