package X;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: X.461 */
public final class AnonymousClass461 extends AnonymousClass45s {
    /* renamed from: B */
    private final AnonymousClass1Gy f50254B;
    /* renamed from: C */
    private long f50255C;
    /* renamed from: D */
    private float f50256D;

    public AnonymousClass461(AnonymousClass1Gy anonymousClass1Gy, AnonymousClass2qn anonymousClass2qn, AnonymousClass2s1 anonymousClass2s1, Handler handler, AnonymousClass45I anonymousClass45I, AnonymousClass2qV anonymousClass2qV) {
        super(anonymousClass2qn, AnonymousClass2qT.f34819B, anonymousClass2s1, true, handler, anonymousClass45I, anonymousClass2qV);
        this.f50254B = anonymousClass1Gy;
    }

    /* renamed from: I */
    public final boolean mo5170I() {
        if (this.f50256D > 0.0f && SystemClock.elapsedRealtime() - this.f50255C >= ((long) this.f50254B.f16574E.f16565D)) {
            if (!super.mo5170I()) {
                return false;
            }
        }
        return true;
    }

    public final void uU(int i, Object obj) {
        if (i == 1) {
            float floatValue = ((Float) obj).floatValue();
            this.f50256D = floatValue;
            if (floatValue > 0.0f) {
                this.f50255C = SystemClock.elapsedRealtime();
            }
        }
        super.uU(i, obj);
    }
}
