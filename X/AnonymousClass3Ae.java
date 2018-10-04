package X;

import android.util.SparseArray;
import java.util.Map;

/* renamed from: X.3Ae */
public final class AnonymousClass3Ae {
    /* renamed from: B */
    public final SparseArray f38575B;
    /* renamed from: C */
    private final Map f38576C;

    public AnonymousClass3Ae(Map map, SparseArray sparseArray) {
        this.f38576C = map;
        this.f38575B = sparseArray;
    }

    /* renamed from: A */
    public final AnonymousClass3Af m18830A(Class cls) {
        AnonymousClass3Af anonymousClass3Af = (AnonymousClass3Af) this.f38576C.get(cls);
        AnonymousClass0LH.G(anonymousClass3Af, "No definition corresponding to model %s was found", new Object[]{cls.getName()});
        return anonymousClass3Af;
    }
}
