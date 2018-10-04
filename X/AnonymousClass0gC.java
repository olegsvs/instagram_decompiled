package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0gC */
public final class AnonymousClass0gC {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0cY f8117B;
    /* renamed from: C */
    public final /* synthetic */ WeakReference f8118C;
    /* renamed from: D */
    public final /* synthetic */ String f8119D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass1Up f8120E;

    public AnonymousClass0gC(AnonymousClass0cY anonymousClass0cY, Object obj, AnonymousClass1Up anonymousClass1Up, String str, WeakReference weakReference) {
        this.f8117B = anonymousClass0cY;
        this.f8120E = anonymousClass1Up;
        this.f8119D = str;
        this.f8118C = weakReference;
    }

    /* renamed from: A */
    public final void m6589A(boolean z) {
        Integer.valueOf(this.f8120E.f19169C);
        AnonymousClass1Tj anonymousClass1Tj = (AnonymousClass1Tj) this.f8117B.f7173D.get(this.f8119D);
        if (anonymousClass1Tj == null) {
            anonymousClass1Tj = new AnonymousClass1Tj();
            this.f8117B.f7173D.put(this.f8119D, anonymousClass1Tj);
        }
        if (z) {
            anonymousClass1Tj.f18975E = this.f8120E.f19169C;
            anonymousClass1Tj.f18976F = 0;
        } else {
            anonymousClass1Tj.f18976F++;
        }
        WeakReference weakReference = this.f8118C;
        AnonymousClass41Y anonymousClass41Y = weakReference != null ? (AnonymousClass41Y) weakReference.get() : null;
        if (anonymousClass41Y != null) {
            anonymousClass41Y.A(z, anonymousClass1Tj.f18975E);
        }
        int intValue = ((Integer) AnonymousClass0CC.uk.m846H(this.f8117B.f7180K)).intValue();
        if (intValue > 0) {
            AnonymousClass0OR.m3627G(this.f8117B.f7179J, this.f8117B.f7172C, 1131750606);
            AnonymousClass0OR.m3626F(this.f8117B.f7179J, this.f8117B.f7172C, (long) intValue, -122188990);
            return;
        }
        AnonymousClass0cY.m5902F(this.f8117B);
    }
}
