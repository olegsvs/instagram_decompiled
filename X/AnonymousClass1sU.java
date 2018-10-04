package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1sU */
public final class AnonymousClass1sU {
    /* renamed from: B */
    public List f23649B = new LinkedList();
    /* renamed from: C */
    public int f23650C;
    /* renamed from: D */
    public int f23651D;
    /* renamed from: E */
    public int f23652E;

    /* renamed from: A */
    public final synchronized void m13550A(int i, int i2) {
        boolean z = i > 0 && i2 > 0;
        AnonymousClass0LH.C(z, "Non zero width and height required");
        if (!(i == this.f23652E && i2 == this.f23650C)) {
            m13551B();
            this.f23652E = i;
            this.f23650C = i2;
            this.f23651D = 0;
        }
    }

    /* renamed from: B */
    public final synchronized void m13551B() {
        AnonymousClass0LH.I(this.f23651D == 0, "There are allocated frame buffers unaccounted for, we're leaking!");
        for (AnonymousClass1uk A : this.f23649B) {
            A.m13685A();
        }
        this.f23649B.clear();
        this.f23650C = 0;
        this.f23652E = 0;
    }

    /* renamed from: C */
    public final synchronized void m13552C(AnonymousClass1uk anonymousClass1uk) {
        if (anonymousClass1uk != null) {
            if (!this.f23649B.contains(anonymousClass1uk)) {
                this.f23649B.add(anonymousClass1uk);
                this.f23651D--;
            }
        }
    }
}
