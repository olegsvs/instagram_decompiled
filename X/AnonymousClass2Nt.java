package X;

import java.util.ArrayList;

/* renamed from: X.2Nt */
public final class AnonymousClass2Nt extends AnonymousClass1kw {
    /* renamed from: B */
    public int f29852B;
    /* renamed from: C */
    public int f29853C = -1;
    /* renamed from: D */
    public int f29854D = -1;
    /* renamed from: E */
    public float f29855E = -1.0f;
    /* renamed from: F */
    private AnonymousClass1kt f29856F = this.f22420s;
    /* renamed from: G */
    private boolean f29857G;

    /* renamed from: B */
    public final boolean mo2733B() {
        return true;
    }

    public AnonymousClass2Nt() {
        int i = 0;
        this.f29852B = 0;
        this.f29857G = false;
        AnonymousClass1ky anonymousClass1ky = new AnonymousClass1ky();
        this.f22377B.clear();
        this.f22377B.add(this.f29856F);
        int length = this.f22396U.length;
        while (i < length) {
            this.f22396U[i] = this.f29856F;
            i++;
        }
    }

    /* renamed from: A */
    public final void mo2732A(AnonymousClass1kk anonymousClass1kk) {
        AnonymousClass1Pi anonymousClass1Pi = (AnonymousClass1Pi) this.f22413l;
        if (anonymousClass1Pi != null) {
            Object E = anonymousClass1Pi.mo2735E(AnonymousClass1ks.LEFT);
            Object E2 = anonymousClass1Pi.mo2735E(AnonymousClass1ks.RIGHT);
            Object obj = (this.f22413l == null || this.f22413l.f22397V[0] != AnonymousClass1kv.WRAP_CONTENT) ? null : 1;
            if (this.f29852B == 0) {
                E = anonymousClass1Pi.mo2735E(AnonymousClass1ks.TOP);
                E2 = anonymousClass1Pi.mo2735E(AnonymousClass1ks.BOTTOM);
                obj = (this.f22413l == null || this.f22413l.f22397V[1] != AnonymousClass1kv.WRAP_CONTENT) ? null : 1;
            }
            AnonymousClass1ko J;
            if (this.f29853C != -1) {
                J = anonymousClass1kk.m12878J(this.f29856F);
                anonymousClass1kk.m12871C(J, anonymousClass1kk.m12878J(E), this.f29853C, 6);
                if (obj != null) {
                    anonymousClass1kk.m12873E(anonymousClass1kk.m12878J(E2), J, 0, 5);
                }
            } else if (this.f29854D != -1) {
                J = anonymousClass1kk.m12878J(this.f29856F);
                AnonymousClass1ko J2 = anonymousClass1kk.m12878J(E2);
                anonymousClass1kk.m12871C(J, J2, -this.f29854D, 6);
                if (obj != null) {
                    anonymousClass1kk.m12873E(J, anonymousClass1kk.m12878J(E), 0, 5);
                    anonymousClass1kk.m12873E(J2, J, 0, 5);
                }
            } else if (this.f29855E != -1.0f) {
                AnonymousClass1ko J3 = anonymousClass1kk.m12878J(this.f29856F);
                AnonymousClass1ko J4 = anonymousClass1kk.m12878J(E);
                AnonymousClass1ko J5 = anonymousClass1kk.m12878J(E2);
                float f = this.f29855E;
                boolean z = this.f29857G;
                AnonymousClass2Nr K = anonymousClass1kk.m12879K();
                if (z) {
                    K.m15374A(anonymousClass1kk, 0);
                }
                K.f29849E.m12859I(J3, -1.0f);
                K.f29849E.m12859I(J4, 1.0f - f);
                K.f29849E.m12859I(J5, f);
                anonymousClass1kk.m12870B(K);
            }
        }
    }

    /* renamed from: C */
    public final void mo2734C(int i) {
        AnonymousClass1kw anonymousClass1kw = this.f22413l;
        if (anonymousClass1kw != null) {
            int i2;
            if (this.f29852B == 1) {
                this.f22420s.f22365F.m15392H(1, anonymousClass1kw.f22420s.f22365F, 0);
                this.f22380E.f22365F.m15392H(1, anonymousClass1kw.f22420s.f22365F, 0);
                if (this.f29853C != -1) {
                    this.f22395T.f22365F.m15392H(1, anonymousClass1kw.f22395T.f22365F, this.f29853C);
                    this.f22419r.f22365F.m15392H(1, anonymousClass1kw.f22395T.f22365F, this.f29853C);
                    return;
                } else if (this.f29854D != -1) {
                    this.f22395T.f22365F.m15392H(1, anonymousClass1kw.f22419r.f22365F, -this.f29854D);
                    this.f22419r.f22365F.m15392H(1, anonymousClass1kw.f22419r.f22365F, -this.f29854D);
                    return;
                } else if (this.f29855E != -1.0f && anonymousClass1kw.m12903H() == AnonymousClass1kv.FIXED) {
                    i2 = (int) (((float) anonymousClass1kw.f22426y) * this.f29855E);
                    this.f22395T.f22365F.m15392H(1, anonymousClass1kw.f22395T.f22365F, i2);
                    this.f22419r.f22365F.m15392H(1, anonymousClass1kw.f22395T.f22365F, i2);
                    return;
                } else {
                    return;
                }
            }
            this.f22395T.f22365F.m15392H(1, anonymousClass1kw.f22395T.f22365F, 0);
            this.f22419r.f22365F.m15392H(1, anonymousClass1kw.f22395T.f22365F, 0);
            if (this.f29853C != -1) {
                this.f22420s.f22365F.m15392H(1, anonymousClass1kw.f22420s.f22365F, this.f29853C);
                this.f22380E.f22365F.m15392H(1, anonymousClass1kw.f22420s.f22365F, this.f29853C);
            } else if (this.f29854D != -1) {
                this.f22420s.f22365F.m15392H(1, anonymousClass1kw.f22380E.f22365F, -this.f29854D);
                this.f22380E.f22365F.m15392H(1, anonymousClass1kw.f22380E.f22365F, -this.f29854D);
            } else if (this.f29855E != -1.0f && anonymousClass1kw.m12906K() == AnonymousClass1kv.FIXED) {
                i2 = (int) (((float) anonymousClass1kw.f22391P) * this.f29855E);
                this.f22420s.f22365F.m15392H(1, anonymousClass1kw.f22420s.f22365F, i2);
                this.f22380E.f22365F.m15392H(1, anonymousClass1kw.f22420s.f22365F, i2);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: E */
    public final X.AnonymousClass1kt mo2735E(X.AnonymousClass1ks r3) {
        /*
        r2 = this;
        r0 = r3.ordinal();
        switch(r0) {
            case 0: goto L_0x0008;
            case 1: goto L_0x0011;
            case 2: goto L_0x000a;
            case 3: goto L_0x0011;
            case 4: goto L_0x000a;
            case 5: goto L_0x0008;
            case 6: goto L_0x0008;
            case 7: goto L_0x0008;
            case 8: goto L_0x0008;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x0017;
    L_0x0008:
        r0 = 0;
        return r0;
    L_0x000a:
        r0 = r2.f29852B;
        if (r0 != 0) goto L_0x0017;
    L_0x000e:
        r0 = r2.f29856F;
        return r0;
    L_0x0011:
        r1 = r2.f29852B;
        r0 = 1;
        if (r1 != r0) goto L_0x0017;
    L_0x0016:
        goto L_0x000e;
    L_0x0017:
        r1 = new java.lang.AssertionError;
        r0 = r3.name();
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2Nt.E(X.1ks):X.1kt");
    }

    /* renamed from: F */
    public final ArrayList mo2736F() {
        return this.f22377B;
    }

    /* renamed from: a */
    public final void mo2737a(AnonymousClass1kk anonymousClass1kk) {
        if (this.f22413l != null) {
            int D = AnonymousClass1kk.m12863D(this.f29856F);
            if (this.f29852B == 1) {
                this.BB = D;
                this.CB = 0;
                m12916U(this.f22413l.m12902G());
                m12920Y(0);
                return;
            }
            this.BB = 0;
            this.CB = D;
            m12920Y(this.f22413l.m12907L());
            m12916U(0);
        }
    }

    /* renamed from: b */
    public final void m15387b(int i) {
        if (this.f29852B != i) {
            this.f29852B = i;
            this.f22377B.clear();
            if (this.f29852B == 1) {
                this.f29856F = this.f22395T;
            } else {
                this.f29856F = this.f22420s;
            }
            this.f22377B.add(this.f29856F);
            int length = this.f22396U.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f22396U[i2] = this.f29856F;
            }
        }
    }
}
