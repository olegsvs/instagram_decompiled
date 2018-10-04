package X;

import android.os.SystemClock;

/* renamed from: X.3FP */
public final class AnonymousClass3FP {
    /* renamed from: B */
    public int f39470B;
    /* renamed from: C */
    public long f39471C;
    /* renamed from: D */
    public long f39472D;
    /* renamed from: E */
    public boolean f39473E;

    /* renamed from: A */
    public final void m19110A() {
        if (!this.f39473E) {
            this.f39473E = true;
            this.f39470B++;
            this.f39472D = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: B */
    public final void m19111B() {
        if (this.f39473E) {
            this.f39473E = false;
            this.f39471C += SystemClock.elapsedRealtime() - this.f39472D;
        }
    }
}
