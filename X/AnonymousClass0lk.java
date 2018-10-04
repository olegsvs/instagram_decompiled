package X;

import java.util.ArrayList;

/* renamed from: X.0lk */
public final class AnonymousClass0lk implements AnonymousClass0IR {
    /* renamed from: B */
    private final ArrayList f9601B = new ArrayList();

    /* renamed from: A */
    public final void m7382A(boolean z, AnonymousClass0IL anonymousClass0IL) {
        for (int size = this.f9601B.size() - 1; size >= 0; size--) {
            AnonymousClass1d2 anonymousClass1d2 = (AnonymousClass1d2) this.f9601B.get(size);
            if (z) {
                anonymousClass1d2.om(anonymousClass0IL);
            } else {
                anonymousClass1d2.nm(anonymousClass0IL);
            }
        }
    }

    public final void addFragmentVisibilityListener(AnonymousClass1d2 anonymousClass1d2) {
        if (!this.f9601B.contains(anonymousClass1d2)) {
            this.f9601B.add(anonymousClass1d2);
        }
    }

    public final void removeFragmentVisibilityListener(AnonymousClass1d2 anonymousClass1d2) {
        this.f9601B.remove(anonymousClass1d2);
    }
}
