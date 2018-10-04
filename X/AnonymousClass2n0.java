package X;

import java.util.concurrent.Callable;

/* renamed from: X.2n0 */
public final class AnonymousClass2n0 implements Callable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Nc f33968B;
    /* renamed from: C */
    public final /* synthetic */ float f33969C;
    /* renamed from: D */
    public final /* synthetic */ float f33970D;

    public AnonymousClass2n0(AnonymousClass0Nc anonymousClass0Nc, float f, float f2) {
        this.f33968B = anonymousClass0Nc;
        this.f33969C = f;
        this.f33970D = f2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (this.f33968B.M() && this.f33968B.f3622b) {
            float f = (float) this.f33968B.f3623c;
            float f2 = this.f33969C;
            f2 = Math.min(Math.max(1.0f, f2 + (this.f33970D * (f - f2))), f);
            if (this.f33968B.f3638r) {
                AnonymousClass0Nc.E(this.f33968B).m17214B((int) f2);
            } else {
                this.f33968B.f3642v.m17180A((int) f2);
            }
        }
        return null;
    }
}
