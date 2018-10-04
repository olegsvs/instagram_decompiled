package X;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: X.12f */
public final class AnonymousClass12f {
    /* renamed from: B */
    public int f13590B = 0;
    /* renamed from: C */
    public SparseArray f13591C = new SparseArray();

    /* renamed from: A */
    public final AnonymousClass0oo m8970A(int i) {
        AnonymousClass12g anonymousClass12g = (AnonymousClass12g) this.f13591C.get(i);
        if (anonymousClass12g == null || anonymousClass12g.f13595E.isEmpty()) {
            return null;
        }
        i = anonymousClass12g.f13595E;
        return (AnonymousClass0oo) i.remove(i.size() - 1);
    }

    /* renamed from: B */
    public static AnonymousClass12g m8968B(AnonymousClass12f anonymousClass12f, int i) {
        AnonymousClass12g anonymousClass12g = (AnonymousClass12g) anonymousClass12f.f13591C.get(i);
        if (anonymousClass12g != null) {
            return anonymousClass12g;
        }
        anonymousClass12g = new AnonymousClass12g();
        anonymousClass12f.f13591C.put(i, anonymousClass12g);
        return anonymousClass12g;
    }

    /* renamed from: B */
    public final void m8971B(AnonymousClass0oo anonymousClass0oo) {
        int i = anonymousClass0oo.f10374F;
        ArrayList arrayList = AnonymousClass12f.m8968B(this, i).f13595E;
        if (((AnonymousClass12g) this.f13591C.get(i)).f13594D > arrayList.size()) {
            anonymousClass0oo.m7725Q();
            arrayList.add(anonymousClass0oo);
        }
    }

    /* renamed from: C */
    public static final long m8969C(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    /* renamed from: C */
    public final void m8972C(int i, int i2) {
        AnonymousClass12g B = AnonymousClass12f.m8968B(this, i);
        B.f13594D = i2;
        i = B.f13595E;
        if (i != 0) {
            while (i.size() > i2) {
                i.remove(i.size() - 1);
            }
        }
    }
}
