package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0ln */
public final class AnonymousClass0ln extends AnonymousClass0lo {
    /* renamed from: B */
    public final Set f9603B = new HashSet();

    /* renamed from: L */
    public final String mo1796L(Object obj) {
        return ((AnonymousClass0fH) obj).f7904T;
    }

    /* renamed from: O */
    public final /* bridge */ /* synthetic */ void mo1797O(Object obj) {
        AnonymousClass0fH anonymousClass0fH = (AnonymousClass0fH) obj;
        if (anonymousClass0fH.f7893I instanceof AnonymousClass0pn) {
            this.f9603B.add(((AnonymousClass0pn) anonymousClass0fH.f7893I).AO());
        }
    }

    /* renamed from: P */
    public final /* bridge */ /* synthetic */ void mo1798P(Object obj) {
        AnonymousClass0fH anonymousClass0fH = (AnonymousClass0fH) obj;
        if (anonymousClass0fH.f7893I instanceof AnonymousClass0pn) {
            this.f9603B.remove(((AnonymousClass0pn) anonymousClass0fH.f7893I).AO());
        }
    }

    /* renamed from: Q */
    public final void mo1799Q() {
        this.f9603B.clear();
    }
}
