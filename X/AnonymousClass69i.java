package X;

import android.view.Surface;

/* renamed from: X.69i */
public final class AnonymousClass69i implements AnonymousClass5Iz {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6GX f72430B;

    public AnonymousClass69i(AnonymousClass6GX anonymousClass6GX) {
        this.f72430B = anonymousClass6GX;
    }

    public final void PVA(Surface surface, int i, int i2) {
        Integer.valueOf(i);
        Integer.valueOf(i2);
        this.f72430B.f73793O.C(new AnonymousClass69u(surface, i, i2));
    }

    public final void QVA(Surface surface) {
    }

    public final void RVA() {
        AnonymousClass6GX anonymousClass6GX = this.f72430B;
        AnonymousClass0Sy.C();
        anonymousClass6GX.f73789K.releaseSurface();
        anonymousClass6GX.f73796R = null;
        this.f72430B.f73793O.C(new AnonymousClass69v());
    }
}
