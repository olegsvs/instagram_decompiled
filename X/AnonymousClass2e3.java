package X;

/* renamed from: X.2e3 */
public final class AnonymousClass2e3 extends AnonymousClass2Tn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Z9 f31937B;

    /* renamed from: F */
    public final boolean mo3179F() {
        return false;
    }

    public AnonymousClass2e3(AnonymousClass1Z9 anonymousClass1Z9) {
        this.f31937B = anonymousClass1Z9;
    }

    /* renamed from: A */
    public final AnonymousClass1GR mo3168A() {
        return new AnonymousClass2U1(this);
    }

    /* renamed from: J */
    public final AnonymousClass2Tn mo3576J() {
        return this.f31937B;
    }

    public final Object get(Object obj) {
        if (obj != null) {
            if (this.f31937B.f20151E != null) {
                for (AnonymousClass2To anonymousClass2To = this.f31937B.f20151E[AnonymousClass1GV.C(obj.hashCode()) & this.f31937B.f20150D]; anonymousClass2To != null; anonymousClass2To = null) {
                    if (obj.equals(anonymousClass2To.getValue())) {
                        return anonymousClass2To.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final int size() {
        return mo3576J().size();
    }
}
