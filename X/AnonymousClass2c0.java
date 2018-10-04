package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2c0 */
public final class AnonymousClass2c0 implements AnonymousClass2LC {
    /* renamed from: B */
    public final AnonymousClass2KU f31543B;
    /* renamed from: C */
    public final Set f31544C = new HashSet();
    /* renamed from: D */
    public final AnonymousClass2Kd f31545D;
    /* renamed from: E */
    private final AnonymousClass2LM f31546E = new AnonymousClass2cJ();
    /* renamed from: F */
    private AnonymousClass264 f31547F;
    /* renamed from: G */
    private AnonymousClass2LE f31548G;

    public AnonymousClass2c0(AnonymousClass2KU anonymousClass2KU, boolean z) {
        this.f31545D = new AnonymousClass2Kd(this, z);
        this.f31543B = anonymousClass2KU;
    }

    /* renamed from: A */
    public final void m16464A(List list) {
        AnonymousClass0Sy.C();
        for (AnonymousClass2LR anonymousClass2c1 : list) {
            Object anonymousClass2c12 = new AnonymousClass2c1(this, anonymousClass2c1, this.f31546E);
            this.f31544C.add(anonymousClass2c12);
            AnonymousClass264 anonymousClass264 = this.f31547F;
            if (anonymousClass264 != null) {
                anonymousClass2c12.An(this.f31548G, anonymousClass264);
            }
            String str = anonymousClass2c12.f31550C.f29279D;
            if (str != null) {
                AnonymousClass0Gs.f2431j.D(str).C(anonymousClass2c12).B();
            } else {
                anonymousClass2c12.f31554G.C(new AnonymousClass2Ka());
            }
        }
    }

    public final void An(AnonymousClass2LE anonymousClass2LE, AnonymousClass264 anonymousClass264) {
        this.f31548G = anonymousClass2LE;
        this.f31547F = anonymousClass264;
        for (AnonymousClass2c1 An : this.f31544C) {
            An.An(anonymousClass2LE, anonymousClass264);
        }
    }
}
