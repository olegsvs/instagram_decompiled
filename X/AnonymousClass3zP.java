package X;

import android.view.Choreographer.FrameCallback;

/* renamed from: X.3zP */
public final class AnonymousClass3zP extends AnonymousClass3HO implements FrameCallback {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3HP f47981B;

    public AnonymousClass3zP(AnonymousClass3HP anonymousClass3HP, AnonymousClass3Ct anonymousClass3Ct, long j, float f, float f2) {
        this.f47981B = anonymousClass3HP;
        super(anonymousClass3HP, anonymousClass3Ct, j, f, f2);
    }

    /* renamed from: A */
    public final void mo4853A() {
        this.f47981B.f39796B.postFrameCallback(this);
    }

    public final void doFrame(long j) {
        if (this.f39793F == -1) {
            this.f39793F = j;
        }
        float f = this.f39792E;
        float f2 = this.f39794G - f;
        long j2 = this.f39793F;
        f2 *= (float) (j - j2);
        long j3 = this.f39789B;
        f += f2 / ((float) j3);
        if (j - j2 < j3) {
            if (!this.f39790C) {
                mo4853A();
                this.f39795H.f39797C.m23207Q(f);
                this.f39791D.vJA();
            }
        }
        f = this.f39794G;
        this.f39795H.f39797C.m23207Q(f);
        this.f39791D.vJA();
    }
}
