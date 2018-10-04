package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1kf */
public final class AnonymousClass1kf extends ViewGroup {
    /* renamed from: B */
    public AnonymousClass1ke f22252B;

    public AnonymousClass1ke getConstraintSet() {
        if (this.f22252B == null) {
            this.f22252B = new AnonymousClass1ke();
        }
        AnonymousClass1ke anonymousClass1ke = this.f22252B;
        int childCount = getChildCount();
        anonymousClass1ke.f22251B.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            AnonymousClass2Nq anonymousClass2Nq = (AnonymousClass2Nq) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!anonymousClass1ke.f22251B.containsKey(Integer.valueOf(id))) {
                    anonymousClass1ke.f22251B.put(Integer.valueOf(id), new AnonymousClass1kd());
                }
                AnonymousClass1kd anonymousClass1kd = (AnonymousClass1kd) anonymousClass1ke.f22251B.get(Integer.valueOf(id));
                if (childAt instanceof AnonymousClass1ka) {
                    AnonymousClass1ka anonymousClass1ka = (AnonymousClass1ka) childAt;
                    AnonymousClass1kd.m12842C(anonymousClass1kd, id, anonymousClass2Nq);
                    if (anonymousClass1ka instanceof AnonymousClass2Np) {
                        anonymousClass1kd.f22237o = 1;
                        AnonymousClass2Np anonymousClass2Np = (AnonymousClass2Np) anonymousClass1ka;
                        anonymousClass1kd.f22235m = anonymousClass2Np.getType();
                        anonymousClass1kd.f22239q = anonymousClass2Np.getReferencedIds();
                    }
                }
                AnonymousClass1kd.m12842C(anonymousClass1kd, id, anonymousClass2Nq);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f22252B;
    }
}
