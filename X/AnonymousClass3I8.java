package X;

import com.facebook.C0164R;

/* renamed from: X.3I8 */
public final class AnonymousClass3I8 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3zn f39902B;

    public AnonymousClass3I8(AnonymousClass3zn anonymousClass3zn) {
        this.f39902B = anonymousClass3zn;
    }

    public final void run() {
        if (this.f39902B.getView() != null) {
            AnonymousClass1Km anonymousClass1Km = AnonymousClass3zn.m21917B(this.f39902B.getContext()).bC;
            double J = (double) AnonymousClass0Nm.J(this.f39902B.getContext());
            Double.isNaN(J);
            int max = (int) Math.max(J / 7.5d, AnonymousClass3zs.m21933C(this.f39902B.getContext(), anonymousClass1Km));
            int max2 = (int) Math.max((double) this.f39902B.getResources().getDimensionPixelSize(C0164R.dimen.cover_seekbar_height), (double) this.f39902B.getResources().getDimensionPixelSize(C0164R.dimen.trim_preview_height_dp));
            this.f39902B.f48054P = new AnonymousClass3zu(anonymousClass1Km, max, max2);
            if (this.f39902B.f48044F == null) {
                return;
            }
            if (this.f39902B.f48043E == AnonymousClass3IF.COVER || this.f39902B.f48043E == AnonymousClass3IF.TRIM) {
                this.f39902B.f48044F.f39916D = this.f39902B.f48054P;
                this.f39902B.f48044F.mo4876f();
            }
        }
    }
}
