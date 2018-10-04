package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.40G */
public final class AnonymousClass40G implements AnonymousClass3MR {
    /* renamed from: B */
    private final List f48192B;

    public AnonymousClass40G(boolean z, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0dd anonymousClass0dd) {
        if (z) {
            r4 = new AnonymousClass1cS[3];
            r4[0] = new AnonymousClass1ca(0, anonymousClass0PZ, null, AnonymousClass1cT.B("impression"), anonymousClass0dd);
            r4[1] = new AnonymousClass1cb(1, anonymousClass0PZ, null, AnonymousClass1cT.B("sub_impression"));
            r4[2] = new AnonymousClass1cc(4, AnonymousClass1cT.B("time_spent"), anonymousClass0PZ, null);
            this.f48192B = Arrays.asList(r4);
            return;
        }
        this.f48192B = Collections.emptyList();
    }

    public final List JI() {
        return this.f48192B;
    }
}
