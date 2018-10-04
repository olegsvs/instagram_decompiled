package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Fc */
public final class AnonymousClass3Fc {
    /* renamed from: B */
    public List f39565B;
    /* renamed from: C */
    public List f39566C;
    /* renamed from: D */
    public int f39567D;
    /* renamed from: E */
    public int f39568E;

    /* renamed from: A */
    public final void m19135A(int i) {
        int indexOf = this.f39565B.indexOf(Integer.valueOf(i));
        List list = this.f39566C;
        list.set(indexOf, Integer.valueOf(((Integer) list.get(indexOf)).intValue() + 1));
    }

    /* renamed from: B */
    public final void m19136B(List list) {
        this.f39565B = new ArrayList(list);
        this.f39566C = new ArrayList(Collections.nCopies(this.f39565B.size(), Integer.valueOf(0)));
    }

    /* renamed from: C */
    public final boolean m19137C() {
        return (this.f39565B == null || this.f39566C == null) ? false : true;
    }

    /* renamed from: D */
    public final void m19138D(int i) {
        this.f39567D = i;
        this.f39568E = this.f39565B.indexOf(Integer.valueOf(i));
    }
}
