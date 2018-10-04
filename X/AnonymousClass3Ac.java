package X;

import java.util.List;

/* renamed from: X.3Ac */
public final class AnonymousClass3Ac extends AnonymousClass1nt {
    /* renamed from: B */
    public final /* synthetic */ List f38570B;
    /* renamed from: C */
    public final /* synthetic */ List f38571C;

    public AnonymousClass3Ac(List list, List list2) {
        this.f38571C = list;
        this.f38570B = list2;
    }

    /* renamed from: A */
    public final boolean mo3788A(int i, int i2) {
        AnonymousClass3Ag anonymousClass3Ag = (AnonymousClass3Ag) this.f38571C.get(i);
        AnonymousClass3Ag anonymousClass3Ag2 = (AnonymousClass3Ag) this.f38570B.get(i2);
        AnonymousClass0LH.E(anonymousClass3Ag);
        AnonymousClass0LH.E(anonymousClass3Ag2);
        return anonymousClass3Ag.getClass().equals(anonymousClass3Ag2.getClass()) && anonymousClass3Ag.AX(anonymousClass3Ag2);
    }

    /* renamed from: B */
    public final boolean mo3789B(int i, int i2) {
        return ((AnonymousClass3Ag) this.f38571C.get(i)).pM() == ((AnonymousClass3Ag) this.f38570B.get(i2)).pM();
    }

    /* renamed from: C */
    public final int mo3790C() {
        return this.f38570B.size();
    }

    /* renamed from: D */
    public final int mo3791D() {
        return this.f38571C.size();
    }
}
