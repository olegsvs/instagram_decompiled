package X;

import java.util.HashMap;

/* renamed from: X.44W */
public final class AnonymousClass44W extends AnonymousClass3xt {
    public AnonymousClass44W(AnonymousClass36n anonymousClass36n) {
        super(anonymousClass36n, "fm", "FaceTrackerAssetManager");
    }

    /* renamed from: A */
    public final long mo4718A() {
        return this.f37977E.f37930K;
    }

    /* renamed from: B */
    public static int m22653B(AnonymousClass0Cm anonymousClass0Cm) {
        return ((Integer) AnonymousClass0E6.D(AnonymousClass0CC.fD, anonymousClass0Cm)).intValue();
    }

    /* renamed from: H */
    public final void mo4721H(AnonymousClass37m anonymousClass37m, AnonymousClass0Iw anonymousClass0Iw) {
        int i = this.f47453B;
        AnonymousClass0Iw anonymousClass37h = new AnonymousClass37h(anonymousClass37m, anonymousClass0Iw, i);
        AnonymousClass0GA E = AnonymousClass37c.m18637E(i);
        E.f2849B = anonymousClass37h;
        AnonymousClass0Ix.D(E);
    }

    /* renamed from: I */
    public final int mo5298I() {
        return (int) this.f37977E.m18549C();
    }

    /* renamed from: J */
    public final HashMap mo5299J() {
        return this.f37977E.m18548B();
    }

    /* renamed from: K */
    public final HashMap mo5300K(AnonymousClass37f anonymousClass37f) {
        HashMap hashMap = anonymousClass37f.f38095B;
        if (hashMap == null) {
            return new HashMap();
        }
        return hashMap;
    }

    /* renamed from: L */
    public final HashMap mo5301L() {
        return this.f37977E.m18550D();
    }

    /* renamed from: M */
    public final AnonymousClass2h9 mo5302M() {
        return AnonymousClass2h9.AML_FACE_TRACKER;
    }

    /* renamed from: N */
    public final AnonymousClass0CD mo5303N() {
        return AnonymousClass0CC.fD;
    }

    /* renamed from: O */
    public final boolean mo5304O() {
        return true;
    }

    /* renamed from: Q */
    public final void mo5305Q(int i) {
        AnonymousClass36n anonymousClass36n = this.f37977E;
        long j = (long) i;
        if (anonymousClass36n.f37924E == null) {
            anonymousClass36n.f37924E = new AnonymousClass36t();
        }
        anonymousClass36n.f37924E.f37947C = j;
        AnonymousClass0RF.f4617B = j;
    }

    /* renamed from: R */
    public final void mo5306R(HashMap hashMap, int i, long j) {
        this.f37977E.m18558L(hashMap, (long) i, j);
    }

    /* renamed from: S */
    public final void mo5307S(HashMap hashMap, long j) {
        this.f37977E.m18559M(hashMap, j);
    }
}
