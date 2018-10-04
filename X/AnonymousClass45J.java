package X;

/* renamed from: X.45J */
public final class AnonymousClass45J extends AnonymousClass43D {
    /* renamed from: B */
    private long f49747B = 0;
    /* renamed from: C */
    private final AnonymousClass2py f49748C;
    /* renamed from: D */
    private long f49749D;
    /* renamed from: E */
    private final AnonymousClass3tL f49750E;

    public AnonymousClass45J(AnonymousClass3tL anonymousClass3tL, AnonymousClass2py anonymousClass2py) {
        this.f49750E = anonymousClass3tL;
        this.f49748C = anonymousClass2py;
    }

    /* renamed from: A */
    public final void mo5359A(AnonymousClass1xX anonymousClass1xX) {
        if (this.f48991B != null) {
            AnonymousClass3tL anonymousClass3tL = this.f49750E;
            AnonymousClass1xV anonymousClass1xV = anonymousClass1xX.f24674C;
            int i = anonymousClass1xX.f24673B;
            long j = this.f49747B;
            this.f49747B = 1 + j;
            anonymousClass3tL.m21177B(new AnonymousClass2S6(anonymousClass1xV, i, j, (int) (System.currentTimeMillis() - anonymousClass1xX.f24674C.f24666B), this.f48991B, this.f48992C));
        }
    }

    /* renamed from: B */
    public final void mo5360B(AnonymousClass1xV anonymousClass1xV) {
        if (this.f48991B != null) {
            AnonymousClass1xV anonymousClass1xV2 = anonymousClass1xV;
            int i = (int) (anonymousClass1xV.f24666B - this.f49749D);
            for (int i2 = 0; i2 < anonymousClass1xV.f24667C.length; i2++) {
                AnonymousClass3tL anonymousClass3tL = this.f49750E;
                long j = this.f49747B;
                this.f49747B = 1 + j;
                anonymousClass3tL.m21177B(new AnonymousClass2S7(anonymousClass1xV2, i2, j, i, this.f48991B, this.f48992C));
                AnonymousClass2py anonymousClass2py = this.f49748C;
                AnonymousClass1xX anonymousClass1xX = new AnonymousClass1xX(anonymousClass1xV, i2);
                synchronized (anonymousClass2py) {
                    if (anonymousClass2py.f34671B.size() < 200) {
                        anonymousClass2py.f34671B.add(anonymousClass1xX);
                    }
                }
            }
        }
    }

    public final void OEA(AnonymousClass2tB anonymousClass2tB, AnonymousClass1e6 anonymousClass1e6) {
        this.f49749D = System.currentTimeMillis();
    }
}
