package X;

/* renamed from: X.1O8 */
public final class AnonymousClass1O8 extends AnonymousClass1DL {
    /* renamed from: B */
    public final AnonymousClass0O8 f17871B;

    public AnonymousClass1O8(AnonymousClass1O1 anonymousClass1O1) {
        AnonymousClass0O8 anonymousClass0O8 = new AnonymousClass0O8();
        this.f17871B = anonymousClass0O8;
        anonymousClass0O8.m3530G(anonymousClass1O1.f17853B);
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ AnonymousClass1Nl mo2241A() {
        return m11125C();
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ boolean mo2242B(AnonymousClass1Nl anonymousClass1Nl) {
        AnonymousClass1OE anonymousClass1OE = (AnonymousClass1OE) anonymousClass1Nl;
        AnonymousClass1OK.m11152B(anonymousClass1OE, "Null value passed to getSnapshot!");
        AnonymousClass0O8 anonymousClass0O8 = anonymousClass1OE.f17884B;
        int size = anonymousClass0O8.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Class cls = (Class) anonymousClass0O8.m3529F(i);
            AnonymousClass1DL anonymousClass1DL = (AnonymousClass1DL) this.f17871B.get(cls);
            boolean B = anonymousClass1DL != null ? anonymousClass1DL.mo2242B(anonymousClass1OE.m11134C(cls)) : false;
            anonymousClass1OE.m11137F(cls, B);
            z |= B;
        }
        return z;
    }

    /* renamed from: C */
    public final AnonymousClass1OE m11125C() {
        AnonymousClass1OE anonymousClass1OE = new AnonymousClass1OE();
        int size = this.f17871B.size();
        for (int i = 0; i < size; i++) {
            Class cls = (Class) this.f17871B.m3529F(i);
            anonymousClass1OE.f17884B.put(cls, ((AnonymousClass1DL) this.f17871B.m3532I(i)).mo2241A());
            anonymousClass1OE.f17885C.put(cls, Boolean.FALSE);
        }
        return anonymousClass1OE;
    }
}
