package X;

import java.util.AbstractList;

/* renamed from: X.25D */
public final class AnonymousClass25D extends AbstractList {
    /* renamed from: B */
    public final /* synthetic */ Object f25729B;
    /* renamed from: C */
    public final /* synthetic */ Object[] f25730C;
    /* renamed from: D */
    public final /* synthetic */ Object f25731D;

    public AnonymousClass25D(Object[] objArr, Object obj, Object obj2) {
        this.f25730C = objArr;
        this.f25729B = obj;
        this.f25731D = obj2;
    }

    public final Object get(int i) {
        switch (i) {
            case 0:
                return this.f25729B;
            case 1:
                return this.f25731D;
            default:
                return this.f25730C[i - 2];
        }
    }

    public final int size() {
        return this.f25730C.length + 2;
    }
}
