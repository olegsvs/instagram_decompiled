package X;

/* renamed from: X.5dh */
public final class AnonymousClass5dh implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5dm f67650B;
    /* renamed from: C */
    public final /* synthetic */ String f67651C;

    public AnonymousClass5dh(AnonymousClass5dm anonymousClass5dm, String str) {
        this.f67650B = anonymousClass5dm;
        this.f67651C = str;
    }

    public final void run() {
        synchronized (this.f67650B.f67657F) {
            for (AnonymousClass5dl onUrlChanged : this.f67650B.f67657F) {
                onUrlChanged.onUrlChanged(this.f67651C);
            }
        }
    }
}
