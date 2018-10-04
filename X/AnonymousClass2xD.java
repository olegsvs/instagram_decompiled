package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.2xD */
public final class AnonymousClass2xD {
    /* renamed from: B */
    public final List f36188B;
    /* renamed from: C */
    public final int f36189C;
    /* renamed from: D */
    public final List f36190D;
    /* renamed from: E */
    public final List f36191E;
    /* renamed from: F */
    public final int f36192F;

    public AnonymousClass2xD(int i, int i2, List list, List list2, List list3) {
        List emptyList;
        this.f36189C = i;
        this.f36192F = i2;
        this.f36190D = Collections.unmodifiableList(list);
        if (list2 == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Collections.unmodifiableList(list2);
        }
        this.f36188B = emptyList;
        if (list3 == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Collections.unmodifiableList(list3);
        }
        this.f36191E = emptyList;
    }
}
