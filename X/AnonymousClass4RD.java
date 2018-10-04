package X;

import android.util.SparseArray;

/* renamed from: X.4RD */
public final class AnonymousClass4RD {
    /* renamed from: B */
    public final SparseArray f54055B = new SparseArray();

    public AnonymousClass4RD(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            this.f54055B.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
    }
}
