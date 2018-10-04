package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.40E */
public final class AnonymousClass40E implements AnonymousClass3MR {
    /* renamed from: B */
    private final List f48190B;

    public AnonymousClass40E(boolean z, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0dd anonymousClass0dd) {
        if (z) {
            r4 = new AnonymousClass1cS[5];
            r4[0] = new AnonymousClass1cQ(0, anonymousClass0PZ, AnonymousClass1cT.B("impression"), null, anonymousClass0dd);
            r4[1] = new AnonymousClass1cU(1, anonymousClass0PZ, AnonymousClass1cT.B("sub_impression"), null);
            r4[2] = new AnonymousClass1cU(2, anonymousClass0PZ, AnonymousClass1cT.B("viewed_impression"), null);
            r4[3] = new AnonymousClass1cU(3, anonymousClass0PZ, AnonymousClass1cT.B("sub_viewed_impression"), null);
            r4[4] = new AnonymousClass1cV(5, AnonymousClass1cT.B("time_spent"), anonymousClass0PZ, null);
            this.f48190B = Arrays.asList(r4);
            return;
        }
        this.f48190B = Collections.emptyList();
    }

    public final List JI() {
        return this.f48190B;
    }
}
