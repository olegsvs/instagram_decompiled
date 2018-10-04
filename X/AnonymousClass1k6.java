package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1k6 */
public abstract class AnonymousClass1k6 extends AnonymousClass1k7 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1jn f22063B;
    /* renamed from: C */
    private List f22064C;

    /* renamed from: E */
    public abstract Object mo2716E(List list);

    public AnonymousClass1k6(AnonymousClass1jn anonymousClass1jn, AnonymousClass0Ox anonymousClass0Ox, boolean z) {
        AnonymousClass0Ow anonymousClass0Ow;
        this.f22063B = anonymousClass1jn;
        super(anonymousClass1jn, anonymousClass0Ox, z, true);
        if (anonymousClass0Ox.isEmpty()) {
            anonymousClass0Ow = AnonymousClass13w.f13788C;
        } else {
            int size = anonymousClass0Ox.size();
            AnonymousClass1Ka.m10783C(size, "initialArraySize");
            anonymousClass0Ow = new ArrayList(size);
        }
        this.f22064C = anonymousClass0Ow;
        for (int i = 0; i < anonymousClass0Ox.size(); i++) {
            this.f22064C.add(null);
        }
    }

    /* renamed from: B */
    public final void mo2717B(boolean z, int i, Object obj) {
        List list = this.f22064C;
        if (list != null) {
            Object obj2;
            if (obj == null) {
                obj2 = AnonymousClass1Ga.f16303B;
            } else {
                obj2 = new AnonymousClass1Hj(obj);
            }
            list.set(i, obj2);
            return;
        }
        boolean z2;
        if (!z) {
            if (!this.f22063B.isCancelled()) {
                z2 = false;
                AnonymousClass1Cy.m9957L(z2, "Future was done before all dependencies completed");
            }
        }
        z2 = true;
        AnonymousClass1Cy.m9957L(z2, "Future was done before all dependencies completed");
    }

    /* renamed from: C */
    public final void mo2718C() {
        List list = this.f22064C;
        if (list != null) {
            this.f22063B.m10383B(mo2716E(list));
        } else {
            AnonymousClass1Cy.m9956K(this.f22063B.isDone());
        }
    }

    /* renamed from: D */
    public final void mo2719D() {
        super.mo2719D();
        this.f22064C = null;
    }
}
