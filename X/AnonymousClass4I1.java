package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4I1 */
public final class AnonymousClass4I1 {
    /* renamed from: E */
    public static AnonymousClass4I1 f52428E;
    /* renamed from: B */
    public float f52429B;
    /* renamed from: C */
    public Map f52430C = new HashMap();
    /* renamed from: D */
    public List f52431D = new ArrayList();

    private AnonymousClass4I1() {
    }

    /* renamed from: A */
    public final void m23763A(List list) {
        List arrayList = new ArrayList();
        this.f52431D = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: B */
    public static synchronized AnonymousClass4I1 m23762B() {
        AnonymousClass4I1 anonymousClass4I1;
        synchronized (AnonymousClass4I1.class) {
            if (f52428E == null) {
                f52428E = new AnonymousClass4I1();
            }
            anonymousClass4I1 = f52428E;
        }
        return anonymousClass4I1;
    }
}
