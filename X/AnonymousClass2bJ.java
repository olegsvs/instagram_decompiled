package X;

import android.os.SystemClock;

/* renamed from: X.2bJ */
public class AnonymousClass2bJ implements AnonymousClass1uF, AnonymousClass18t {
    /* renamed from: B */
    public long f31394B = 0;
    /* renamed from: C */
    public int f31395C = 0;
    /* renamed from: D */
    public long f31396D = -1;
    /* renamed from: E */
    public long f31397E = 0;
    /* renamed from: F */
    public long f31398F = -1;
    /* renamed from: G */
    public long f31399G = -1;
    /* renamed from: H */
    public String f31400H;

    public final void Bf() {
    }

    public final void Ph(AnonymousClass1uP anonymousClass1uP) {
    }

    public final void gl(AnonymousClass1uH anonymousClass1uH) {
    }

    public final void onStart() {
    }

    /* renamed from: A */
    public final void m16406A(long j, long j2, long j3, String str) {
        this.f31394B = 0;
        this.f31399G = j3;
        this.f31395C++;
        this.f31397E = j;
        this.f31396D = (j2 - j) + 1;
        this.f31400H = str;
        this.f31398F = SystemClock.elapsedRealtime();
    }

    public void pe(long j, long j2) {
        this.f31394B = j;
        this.f31399G = j2;
    }

    public final void yu(float f) {
        float min = Math.min(Math.max(f, 0.0f), 1.0f);
        long j = this.f31399G;
        long j2 = (long) (min * ((float) j));
        this.f31394B = j2;
        pe(j2, j);
    }
}
