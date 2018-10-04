package X;

import android.view.Surface;

/* renamed from: X.68a */
public final class AnonymousClass68a implements AnonymousClass5Iz {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass68i f72145B;

    public AnonymousClass68a(AnonymousClass68i anonymousClass68i) {
        this.f72145B = anonymousClass68i;
    }

    public final void PVA(Surface surface, int i, int i2) {
        Integer.valueOf(i);
        Integer.valueOf(i2);
        this.f72145B.f72173Q = surface;
        AnonymousClass5ao anonymousClass5ao = this.f72145B;
        i2 *= anonymousClass5ao.f72160D;
        if (anonymousClass5ao.f72174R == 0 || anonymousClass5ao.f72172P == 0) {
            anonymousClass5ao.f72174R = i;
            anonymousClass5ao.f72172P = i2;
            anonymousClass5ao.f66744B.m27726G(anonymousClass5ao.f72174R, anonymousClass5ao.f72172P);
            anonymousClass5ao.f66748F.cSA(i, i2);
        }
        if (!this.f72145B.f72162F) {
            AnonymousClass68i.m29194E(this.f72145B);
        }
    }

    public final void QVA(Surface surface) {
    }

    public final void RVA() {
        this.f72145B.f72173Q = null;
    }
}
