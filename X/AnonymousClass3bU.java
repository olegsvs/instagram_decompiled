package X;

/* renamed from: X.3bU */
public final class AnonymousClass3bU implements AnonymousClass0XB {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3bV f42636B;

    public AnonymousClass3bU(AnonymousClass3bV anonymousClass3bV) {
        this.f42636B = anonymousClass3bV;
    }

    /* renamed from: A */
    public final boolean m20160A(AnonymousClass0MI anonymousClass0MI) {
        for (AnonymousClass0XB apply : this.f42636B.f42638C) {
            if (!apply.apply(anonymousClass0MI)) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return m20160A((AnonymousClass0MI) obj);
    }
}
