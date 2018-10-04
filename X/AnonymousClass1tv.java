package X;

/* renamed from: X.1tv */
public final class AnonymousClass1tv implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1M2 f23848B;
    /* renamed from: C */
    public final /* synthetic */ String f23849C;
    /* renamed from: D */
    public final /* synthetic */ Throwable f23850D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass1tu f23851E;

    public AnonymousClass1tv(AnonymousClass1M2 anonymousClass1M2, Throwable th, AnonymousClass1tu anonymousClass1tu, String str) {
        this.f23848B = anonymousClass1M2;
        this.f23850D = th;
        this.f23851E = anonymousClass1tu;
        this.f23849C = str;
    }

    public final void run() {
        this.f23851E.onSharedPreferenceChanged(this.f23848B, this.f23849C);
    }
}
