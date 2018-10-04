package X;

import android.content.Context;

/* renamed from: X.6H2 */
public final class AnonymousClass6H2 {
    /* renamed from: B */
    public final Context f73881B;
    /* renamed from: C */
    public final AnonymousClass6B3 f73882C;

    public AnonymousClass6H2(Context context, AnonymousClass6B3 anonymousClass6B3) {
        this.f73881B = context;
        this.f73882C = anonymousClass6B3;
    }

    /* renamed from: A */
    public final void m29849A(AnonymousClass6Az anonymousClass6Az, int i, boolean z, AnonymousClass6Ge anonymousClass6Ge) {
        float A = anonymousClass6Az.m29302A();
        int i2 = i;
        Integer.valueOf(i);
        boolean z2 = z;
        Boolean.toString(z);
        Float.valueOf(A);
        m29850B();
        AnonymousClass6B3 anonymousClass6B3 = this.f73882C;
        anonymousClass6B3.sendMessage(anonymousClass6B3.obtainMessage(1, new AnonymousClass6B0(anonymousClass6Az.m29303B(this.f73881B), i2, z2, A, anonymousClass6Ge)));
    }

    /* renamed from: B */
    public final void m29850B() {
        this.f73882C.sendEmptyMessage(2);
    }
}
