package X;

/* renamed from: X.5jw */
public final class AnonymousClass5jw implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5jy f68647B;
    /* renamed from: C */
    public final /* synthetic */ String f68648C;

    public AnonymousClass5jw(AnonymousClass5jy anonymousClass5jy, String str) {
        this.f68647B = anonymousClass5jy;
        this.f68648C = str;
    }

    public final void run() {
        this.f68647B.f68651B.onFail(new AnonymousClass0Q6((Throwable) AnonymousClass0LH.E(new RuntimeException(this.f68648C))));
    }
}
