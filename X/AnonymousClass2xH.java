package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.2xH */
public final class AnonymousClass2xH {
    /* renamed from: B */
    public final List f36208B;
    /* renamed from: C */
    public final List f36209C;
    /* renamed from: D */
    public final String f36210D;
    /* renamed from: E */
    public final long f36211E;

    public AnonymousClass2xH(String str, long j, List list, List list2) {
        this.f36210D = str;
        this.f36211E = j;
        this.f36208B = Collections.unmodifiableList(list);
        this.f36209C = Collections.unmodifiableList(list2);
    }

    /* renamed from: A */
    public final int m17909A(int i) {
        int size = this.f36208B.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AnonymousClass2xD) this.f36208B.get(i2)).f36192F == i) {
                return i2;
            }
        }
        return -1;
    }
}
