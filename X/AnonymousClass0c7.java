package X;

/* renamed from: X.0c7 */
public final class AnonymousClass0c7 {
    /* renamed from: B */
    public final AnonymousClass0c8 f7000B;

    public AnonymousClass0c7(AnonymousClass0c8 anonymousClass0c8) {
        this.f7000B = anonymousClass0c8;
    }

    /* renamed from: A */
    public final void m5687A() {
        this.f7000B.f7003D.m5827b();
    }

    /* renamed from: B */
    public final void m5688B() {
        AnonymousClass0cP.m5776D(this.f7000B.f7003D, 4);
    }

    /* renamed from: C */
    public final void m5689C() {
        AnonymousClass0cP anonymousClass0cP = this.f7000B.f7003D;
        anonymousClass0cP.f7149Z = false;
        AnonymousClass0cP.m5776D(anonymousClass0cP, 5);
    }

    /* renamed from: D */
    public final void m5690D() {
        this.f7000B.m5700D();
    }

    /* renamed from: E */
    public final void m5691E() {
        this.f7000B.m5701E();
    }

    /* renamed from: F */
    public final void m5692F(boolean z) {
        this.f7000B.m5702F(z);
    }

    /* renamed from: G */
    public final boolean m5693G() {
        return this.f7000B.f7003D.AA();
    }

    /* renamed from: H */
    public final AnonymousClass0IU m5694H() {
        return this.f7000B.f7003D;
    }

    /* renamed from: I */
    public final AnonymousClass0Fz m5695I() {
        return this.f7000B.m5705I();
    }

    /* renamed from: J */
    public final void m5696J() {
        this.f7000B.f7003D.KA();
    }

    /* renamed from: K */
    public final void m5697K() {
        AnonymousClass0c8 anonymousClass0c8 = this.f7000B;
        AnonymousClass0O8 anonymousClass0O8 = anonymousClass0c8.f7001B;
        if (anonymousClass0O8 != null) {
            int size = anonymousClass0O8.size();
            AnonymousClass0Fy[] anonymousClass0FyArr = new AnonymousClass0Fy[size];
            for (int i = size - 1; i >= 0; i--) {
                anonymousClass0FyArr[i] = (AnonymousClass0Fy) anonymousClass0c8.f7001B.m3532I(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass0Fy anonymousClass0Fy = anonymousClass0FyArr[i2];
                if (anonymousClass0Fy.f2289F) {
                    StringBuilder stringBuilder;
                    if (AnonymousClass0Fy.f2284I) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Finished Retaining in ");
                        stringBuilder.append(anonymousClass0Fy);
                        stringBuilder.toString();
                    }
                    anonymousClass0Fy.f2289F = false;
                    for (int I = anonymousClass0Fy.f2288E.m2849I() - 1; I >= 0; I--) {
                        AnonymousClass0dM anonymousClass0dM = (AnonymousClass0dM) anonymousClass0Fy.f2288E.m2850J(I);
                        if (anonymousClass0dM.f7431M) {
                            if (AnonymousClass0Fy.f2284I) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("  Finished Retaining: ");
                                stringBuilder.append(anonymousClass0dM);
                                stringBuilder.toString();
                            }
                            anonymousClass0dM.f7431M = false;
                            boolean z = anonymousClass0dM.f7433O;
                            if (!(z == anonymousClass0dM.f7432N || z)) {
                                anonymousClass0dM.m6035F();
                            }
                        }
                        if (anonymousClass0dM.f7433O && anonymousClass0dM.f7425G && !anonymousClass0dM.f7430L) {
                            anonymousClass0dM.m6030A(anonymousClass0dM.f7428J, anonymousClass0dM.f7422D);
                        }
                    }
                }
                anonymousClass0Fy.m1704E();
            }
        }
    }
}
