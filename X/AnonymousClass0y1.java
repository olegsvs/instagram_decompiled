package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.0y1 */
public final class AnonymousClass0y1 implements AnonymousClass0G2 {
    /* renamed from: B */
    public final Map f12704B = new HashMap();
    /* renamed from: C */
    public final AnonymousClass3Mg f12705C;
    /* renamed from: D */
    public final Executor f12706D;
    /* renamed from: E */
    public final AnonymousClass0fT f12707E;
    /* renamed from: F */
    private boolean f12708F = false;

    public AnonymousClass0y1(AnonymousClass0fT anonymousClass0fT, AnonymousClass3Mg anonymousClass3Mg, Executor executor) {
        anonymousClass0fT.DSA(new AnonymousClass1Xo(this));
        this.f12707E = anonymousClass0fT;
        this.f12705C = anonymousClass3Mg;
        this.f12706D = executor;
    }

    /* renamed from: A */
    public final AnonymousClass0fD m8613A(String str) {
        AnonymousClass0y1.m8611B(this);
        return (AnonymousClass0fD) this.f12704B.get(str);
    }

    /* renamed from: B */
    public final Set m8614B() {
        AnonymousClass0y1.m8611B(this);
        return new HashSet(this.f12704B.values());
    }

    /* renamed from: B */
    public static void m8611B(AnonymousClass0y1 anonymousClass0y1) {
        if (!anonymousClass0y1.f12708F) {
            for (AnonymousClass0fD anonymousClass0fD : anonymousClass0y1.f12705C.dIA()) {
                anonymousClass0y1.f12704B.put(anonymousClass0fD.f7875D, anonymousClass0fD);
            }
            anonymousClass0y1.f12708F = true;
        }
    }

    /* renamed from: C */
    public static AnonymousClass0y1 m8612C(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0y1 anonymousClass0y1 = (AnonymousClass0y1) anonymousClass0Cm.m1036A(AnonymousClass0y1.class);
        if (anonymousClass0y1 != null) {
            return anonymousClass0y1;
        }
        AnonymousClass0f7 anonymousClass0f7 = new AnonymousClass0f7();
        Object anonymousClass0y12 = new AnonymousClass0y1(AnonymousClass1Zx.m11896B(anonymousClass0f7), AnonymousClass1UL.m11589B(AnonymousClass0EV.f1977B, anonymousClass0f7, anonymousClass0Cm, AnonymousClass0Fx.m1698B()), AnonymousClass0Fx.m1698B());
        anonymousClass0Cm.m1039D(AnonymousClass0y1.class, anonymousClass0y12);
        return anonymousClass0y12;
    }

    /* renamed from: C */
    public final void m8615C(AnonymousClass0fD anonymousClass0fD) {
        AnonymousClass0y1.m8611B(this);
        this.f12704B.put(anonymousClass0fD.f7875D, anonymousClass0fD);
        this.f12707E.yKA();
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            AnonymousClass0y1.m8611B(this);
            this.f12704B.clear();
        }
        this.f12707E.nH();
        this.f12707E.DSA(null);
    }
}
