package X;

import android.os.Handler;
import android.view.Surface;

/* renamed from: X.2z0 */
public final class AnonymousClass2z0 {
    /* renamed from: B */
    public final Handler f36618B;
    /* renamed from: C */
    public final AnonymousClass2z1 f36619C;

    public AnonymousClass2z0(Handler handler, AnonymousClass2z1 anonymousClass2z1) {
        this.f36618B = anonymousClass2z1 != null ? (Handler) AnonymousClass2yO.m18016E(handler) : null;
        this.f36619C = anonymousClass2z1;
    }

    /* renamed from: A */
    public final void m18124A(AnonymousClass2vB anonymousClass2vB) {
        if (this.f36619C != null) {
            AnonymousClass0OR.D(this.f36618B, new AnonymousClass2yz(this, anonymousClass2vB), 1543863534);
        }
    }

    /* renamed from: B */
    public final void m18125B(Surface surface) {
        if (this.f36619C != null) {
            AnonymousClass0OR.D(this.f36618B, new AnonymousClass2yy(this, surface), -1647395750);
        }
    }

    /* renamed from: C */
    public final void m18126C(int i, int i2, int i3, float f) {
        if (this.f36619C != null) {
            AnonymousClass0OR.D(this.f36618B, new AnonymousClass2yx(this, i, i2, i3, f), -1553791311);
        }
    }
}
