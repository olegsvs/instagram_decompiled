package X;

import com.facebook.forker.Process;

/* renamed from: X.2v7 */
public abstract class AnonymousClass2v7 {
    /* renamed from: B */
    public int f35759B;

    /* renamed from: A */
    public final void m17763A(int i) {
        this.f35759B = i | this.f35759B;
    }

    /* renamed from: B */
    public void mo4533B() {
        this.f35759B = 0;
    }

    /* renamed from: C */
    public final boolean m17765C(int i) {
        return (this.f35759B & i) == i;
    }

    /* renamed from: D */
    public final boolean m17766D() {
        return m17765C(Process.WAIT_RESULT_TIMEOUT);
    }

    /* renamed from: E */
    public final boolean m17767E() {
        return m17765C(4);
    }
}
