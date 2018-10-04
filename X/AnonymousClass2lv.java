package X;

/* renamed from: X.2lv */
public final class AnonymousClass2lv implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1iP f33749B;
    /* renamed from: C */
    public final /* synthetic */ byte[] f33750C;
    /* renamed from: D */
    public final /* synthetic */ long f33751D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass06D f33752E;
    /* renamed from: F */
    public final /* synthetic */ String f33753F;

    public AnonymousClass2lv(AnonymousClass1iP anonymousClass1iP, String str, byte[] bArr, long j, AnonymousClass06D anonymousClass06D) {
        this.f33749B = anonymousClass1iP;
        this.f33753F = str;
        this.f33750C = bArr;
        this.f33751D = j;
        this.f33752E = anonymousClass06D;
    }

    public final void run() {
        if (this.f33749B.f21648O != null) {
            this.f33749B.f21648O.onMessageArrived(new AnonymousClass1iy(this.f33753F, this.f33750C, this.f33751D));
        }
        this.f33752E.A();
    }
}
