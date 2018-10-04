package X;

import java.util.List;

/* renamed from: X.43i */
public final class AnonymousClass43i extends AnonymousClass3uF {
    /* renamed from: B */
    public final List f49137B;

    /* renamed from: J */
    public final boolean mo5189J() {
        return true;
    }

    public AnonymousClass43i(AnonymousClass2rs anonymousClass2rs, long j, long j2, int i, long j3, List list, List list2) {
        super(anonymousClass2rs, j, j2, i, j3, list);
        this.f49137B = list2;
    }

    /* renamed from: C */
    public final int mo5187C(long j) {
        return (this.f46399D + this.f49137B.size()) - 1;
    }

    /* renamed from: I */
    public final AnonymousClass2rs mo5188I(AnonymousClass3uE anonymousClass3uE, int i) {
        return (AnonymousClass2rs) this.f49137B.get(i - this.f46399D);
    }
}
