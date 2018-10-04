package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.3xy */
public final class AnonymousClass3xy extends AnonymousClass372 {
    /* renamed from: B */
    public boolean f47483B = false;

    public AnonymousClass3xy(AnonymousClass36n anonymousClass36n) {
        super(anonymousClass36n, "wt", "WorldTrackingDeviceConfigAssetManager");
    }

    /* renamed from: A */
    public final long mo4718A() {
        return this.f37977E.f37936Q;
    }

    /* renamed from: B */
    public final boolean mo4719B() {
        return this.f37977E.m18554H() != null;
    }

    /* renamed from: E */
    public final void mo4720E(Object obj) {
        if (obj instanceof AnonymousClass37d) {
            List<AnonymousClass36v> unmodifiableList = Collections.unmodifiableList(((AnonymousClass37d) obj).f38094B);
            if (unmodifiableList == null) {
                return;
            }
            if (!unmodifiableList.isEmpty()) {
                for (AnonymousClass36v anonymousClass36v : unmodifiableList) {
                    AnonymousClass36x anonymousClass36x = anonymousClass36v.f37951B;
                    if (anonymousClass36x != null) {
                        AnonymousClass36n anonymousClass36n = this.f37977E;
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (anonymousClass36n) {
                            if (anonymousClass36n.f37924E == null) {
                                anonymousClass36n.f37924E = new AnonymousClass36t();
                            }
                            anonymousClass36n.f37924E.f37950F = anonymousClass36x;
                            anonymousClass36n.f37931L = currentTimeMillis;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: H */
    public final void mo4721H(AnonymousClass37m anonymousClass37m, AnonymousClass0Iw anonymousClass0Iw) {
        AnonymousClass0Iw anonymousClass37l = new AnonymousClass37l(anonymousClass37m, anonymousClass0Iw);
        AnonymousClass0GA B = AnonymousClass37c.m18634B();
        B.f2849B = anonymousClass37l;
        AnonymousClass0Ix.D(B);
    }

    /* renamed from: I */
    public final void m21770I() {
        this.f47483B = ((Boolean) AnonymousClass0CC.xm.G()).booleanValue();
    }
}
