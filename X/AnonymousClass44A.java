package X;

import java.util.List;

/* renamed from: X.44A */
public final class AnonymousClass44A extends AnonymousClass3wB {
    /* renamed from: B */
    public final List f49408B;

    /* renamed from: G */
    public final boolean mo5274G() {
        return true;
    }

    public AnonymousClass44A(AnonymousClass2xI anonymousClass2xI, long j, long j2, long j3, long j4, List list, List list2) {
        super(anonymousClass2xI, j, j2, j3, j4, list);
        this.f49408B = list2;
    }

    /* renamed from: B */
    public final int mo5272B(long j) {
        return this.f49408B.size();
    }

    /* renamed from: F */
    public final AnonymousClass2xI mo5273F(AnonymousClass2xJ anonymousClass2xJ, long j) {
        return (AnonymousClass2xI) this.f49408B.get((int) (j - this.f47131D));
    }
}
