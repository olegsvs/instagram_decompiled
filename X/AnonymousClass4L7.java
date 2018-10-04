package X;

/* renamed from: X.4L7 */
public final class AnonymousClass4L7 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4L8 f52962B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1Qg f52963C;
    /* renamed from: D */
    public final /* synthetic */ boolean f52964D;

    public AnonymousClass4L7(AnonymousClass4L8 anonymousClass4L8, boolean z, AnonymousClass1Qg anonymousClass1Qg) {
        this.f52962B = anonymousClass4L8;
        this.f52964D = z;
        this.f52963C = anonymousClass1Qg;
    }

    public final void run() {
        if (!this.f52962B.f52968E.equals(this.f52962B.f52965B.f64142U) || this.f52962B.f52965B.f64126E) {
            AnonymousClass1Qg anonymousClass1Qg = this.f52963C;
            if (anonymousClass1Qg != null) {
                anonymousClass1Qg.C();
            }
        } else if (this.f52964D) {
            this.f52962B.f52965B.f64130I = this.f52963C;
            AnonymousClass5Sv anonymousClass5Sv = this.f52962B.f52965B;
            if (anonymousClass5Sv.f64124C.gX()) {
                anonymousClass5Sv.f64134M = new AnonymousClass4L9(anonymousClass5Sv, new AnonymousClass4LG(anonymousClass5Sv.f64142U, anonymousClass5Sv.f64130I, anonymousClass5Sv.f64139R, anonymousClass5Sv.f64131J, anonymousClass5Sv.f64135N, anonymousClass5Sv.f64138Q, anonymousClass5Sv.f64137P));
                anonymousClass5Sv.f64124C.rB(anonymousClass5Sv.f64134M);
            }
        } else {
            this.f52962B.f52965B.vE(false);
        }
    }
}
