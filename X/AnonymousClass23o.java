package X;

import java.io.IOException;

/* renamed from: X.23o */
public final class AnonymousClass23o implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass190 f25532B;

    public AnonymousClass23o(AnonymousClass192 anonymousClass192, AnonymousClass190 anonymousClass190) {
        this.f25532B = anonymousClass190;
    }

    public final void run() {
        this.f25532B.f15051B.B(this.f25532B.f15053D, new IOException("request expired"));
    }
}
