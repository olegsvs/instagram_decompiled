package X;

import java.util.Map.Entry;

/* renamed from: X.2U2 */
public final class AnonymousClass2U2 extends AnonymousClass22C {
    /* renamed from: B */
    public final transient Entry[] f30856B;
    /* renamed from: C */
    private final transient int f30857C;
    /* renamed from: D */
    private final transient AnonymousClass2e1[] f30858D;

    /* renamed from: F */
    public final boolean mo3179F() {
        return false;
    }

    public AnonymousClass2U2(Entry[] entryArr, AnonymousClass2e1[] anonymousClass2e1Arr, int i) {
        this.f30856B = entryArr;
        this.f30858D = anonymousClass2e1Arr;
        this.f30857C = i;
    }

    /* renamed from: A */
    public final AnonymousClass1GR mo3168A() {
        return new AnonymousClass2Tr(this, this.f30856B);
    }

    /* renamed from: B */
    public final AnonymousClass1GR mo3177B() {
        return new AnonymousClass22U(this);
    }

    /* renamed from: C */
    public final AnonymousClass0Ox mo3178C() {
        return new AnonymousClass22V(this);
    }

    /* renamed from: D */
    public static Object m15984D(Object obj, AnonymousClass2e1[] anonymousClass2e1Arr, int i) {
        if (obj != null) {
            for (AnonymousClass2To anonymousClass2To = anonymousClass2e1Arr[i & AnonymousClass1GV.C(obj.hashCode())]; anonymousClass2To != null; anonymousClass2To = anonymousClass2To.mo3631A()) {
                if (obj.equals(anonymousClass2To.getKey())) {
                    return anonymousClass2To.getValue();
                }
            }
        }
        return null;
    }

    public final Object get(Object obj) {
        return AnonymousClass2U2.m15984D(obj, this.f30858D, this.f30857C);
    }

    public final int size() {
        return this.f30856B.length;
    }
}
