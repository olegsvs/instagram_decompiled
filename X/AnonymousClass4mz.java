package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4mz */
public final class AnonymousClass4mz extends AnonymousClass0wR {
    /* renamed from: B */
    public final AnonymousClass4n5 f57264B;
    /* renamed from: C */
    public final AnonymousClass4my f57265C;
    /* renamed from: D */
    public final Set f57266D = new HashSet();

    public AnonymousClass4mz(AnonymousClass4n5 anonymousClass4n5, AnonymousClass4my anonymousClass4my) {
        this.f57264B = anonymousClass4n5;
        this.f57265C = anonymousClass4my;
    }

    public final Class WT() {
        return AnonymousClass3J1.class;
    }

    public final /* bridge */ /* synthetic */ void ac(Object obj, int i) {
        AnonymousClass3J1 anonymousClass3J1 = (AnonymousClass3J1) obj;
        if (this.f57266D.add(anonymousClass3J1.f39984B)) {
            this.f57265C.mCA(anonymousClass3J1, this.f57264B.dR());
        }
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        AnonymousClass3J1 anonymousClass3J1 = (AnonymousClass3J1) this.f57264B.getItem(i);
        anonymousClass0wM.tWA(anonymousClass3J1.f39984B, anonymousClass3J1, i);
    }
}
