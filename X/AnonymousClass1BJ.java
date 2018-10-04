package X;

import android.os.SystemClock;

/* renamed from: X.1BJ */
public class AnonymousClass1BJ extends AnonymousClass0Iw {
    /* renamed from: B */
    private long f15387B = -1;

    /* renamed from: A */
    public final long m9796A() {
        if (this.f15387B == -1) {
            return -1;
        }
        return SystemClock.elapsedRealtime() - this.f15387B;
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.m5859I(this, 755779854);
        this.f15387B = SystemClock.elapsedRealtime();
        AnonymousClass0cQ.m5858H(this, 255571179, I);
    }
}
