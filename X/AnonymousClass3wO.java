package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.3wO */
public final class AnonymousClass3wO implements AnonymousClass2xP {
    /* renamed from: B */
    private final List f47149B;

    public final int fL() {
        return 1;
    }

    public final int jO(long j) {
        return j < 0 ? 0 : -1;
    }

    public AnonymousClass3wO(List list) {
        this.f47149B = Collections.unmodifiableList(list);
    }

    public final List bK(long j) {
        return j >= 0 ? this.f47149B : Collections.emptyList();
    }

    public final long eL(int i) {
        AnonymousClass2yO.m18013B(i == 0);
        return 0;
    }
}
