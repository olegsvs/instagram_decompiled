package X;

/* renamed from: X.2Pn */
public final class AnonymousClass2Pn extends AnonymousClass1sP {
    /* renamed from: B */
    public final int f30225B;
    /* renamed from: C */
    private Integer f30226C = null;

    public AnonymousClass2Pn(AnonymousClass1sn anonymousClass1sn, int i, int i2, int i3) {
        super(anonymousClass1sn, i, i2);
        this.f30225B = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2Pn)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (((AnonymousClass2Pn) obj).f30225B == this.f30225B) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f30226C == null) {
            AnonymousClass1t2 anonymousClass1t2 = new AnonymousClass1t2();
            anonymousClass1t2.m13600A(super.hashCode());
            anonymousClass1t2.m13600A(this.f30225B);
            this.f30226C = Integer.valueOf(anonymousClass1t2.hashCode());
        }
        return this.f30226C.intValue();
    }
}
