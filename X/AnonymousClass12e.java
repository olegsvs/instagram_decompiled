package X;

import android.database.Observable;

/* renamed from: X.12e */
public final class AnonymousClass12e extends Observable {
    /* renamed from: A */
    public final boolean m8962A() {
        return this.mObservers.isEmpty() ^ 1;
    }

    /* renamed from: B */
    public final void m8963B() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AnonymousClass12J) this.mObservers.get(size)).mo2048A();
        }
    }

    /* renamed from: C */
    public final void m8964C(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AnonymousClass12J) this.mObservers.get(size)).mo2051E(i, i2, 1);
        }
    }

    /* renamed from: D */
    public final void m8965D(int i, int i2, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AnonymousClass12J) this.mObservers.get(size)).mo2049C(i, i2, obj);
        }
    }

    /* renamed from: E */
    public final void m8966E(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AnonymousClass12J) this.mObservers.get(size)).mo2050D(i, i2);
        }
    }

    /* renamed from: F */
    public final void m8967F(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AnonymousClass12J) this.mObservers.get(size)).mo2052F(i, i2);
        }
    }
}
