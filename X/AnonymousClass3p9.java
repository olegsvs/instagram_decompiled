package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.3p9 */
public abstract class AnonymousClass3p9 {
    /* renamed from: B */
    public volatile double f44895B = -1.0d;
    /* renamed from: C */
    public AnonymousClass3og f44896C;
    /* renamed from: D */
    private long f44897D;
    /* renamed from: E */
    private Handler f44898E;
    /* renamed from: F */
    private final long f44899F;

    /* renamed from: A */
    public abstract void mo5087A();

    /* renamed from: B */
    public abstract int mo5088B();

    /* renamed from: C */
    public abstract boolean mo5089C();

    public AnonymousClass3p9() {
        long max = Math.max(1, ((long) ((Integer) AnonymousClass0CC.Ql.G()).intValue()) * 1000);
        this.f44899F = max;
        this.f44897D = (-max) - 1;
    }

    /* renamed from: D */
    public final void m20804D() {
        Handler handler = this.f44898E;
        if (handler != null) {
            handler.obtainMessage(2).sendToTarget();
            return;
        }
        AnonymousClass3og anonymousClass3og = this.f44896C;
        if (anonymousClass3og != null) {
            anonymousClass3og.Lh();
        }
    }

    /* renamed from: E */
    public final void m20805E(long j, long j2) {
        long j3 = this.f44897D + this.f44899F;
        if (j >= j3 || j == j2) {
            this.f44897D = j;
            double d = (double) j3;
            double d2 = (double) j2;
            Double.isNaN(d);
            Double.isNaN(d2);
            d = Math.min(d / d2, 1.0d);
            Handler handler = this.f44898E;
            if (handler != null) {
                this.f44895B = d;
                handler.obtainMessage(1).sendToTarget();
                return;
            }
            AnonymousClass3og anonymousClass3og = this.f44896C;
            if (anonymousClass3og != null) {
                anonymousClass3og.Dv(d);
            }
        }
    }

    /* renamed from: F */
    public void mo5090F(Context context, AnonymousClass3pA anonymousClass3pA) {
        AnonymousClass3og anonymousClass3og = anonymousClass3pA.f44908J;
        this.f44896C = anonymousClass3og;
        if (anonymousClass3og != null && ((Boolean) AnonymousClass0CC.Nl.G()).booleanValue()) {
            this.f44898E = new AnonymousClass3p8(this, AnonymousClass0NZ.B());
        }
        this.f44896C = anonymousClass3pA.f44908J;
    }
}
