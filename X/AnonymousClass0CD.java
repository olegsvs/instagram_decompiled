package X;

/* renamed from: X.0CD */
public class AnonymousClass0CD extends AnonymousClass0CE {
    public AnonymousClass0CD(String str, AnonymousClass0CP anonymousClass0CP, Object obj, String[] strArr, AnonymousClass0CT anonymousClass0CT) {
        super(str, anonymousClass0CP, obj, strArr, anonymousClass0CT);
    }

    /* renamed from: B */
    private Object m842B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0M7 anonymousClass0M7 = AnonymousClass0M7.f3347C;
        if (anonymousClass0M7 != null) {
            AnonymousClass0MR I = anonymousClass0M7.mo862I(anonymousClass0Cm);
            if (I != null) {
                try {
                    Object D = m852D(I);
                    return D;
                } finally {
                    m851C(I);
                }
            }
        }
        return this.f1491B;
    }

    /* renamed from: E */
    public final void m843E(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0M7 anonymousClass0M7 = AnonymousClass0M7.f3347C;
        if (anonymousClass0M7 != null) {
            AnonymousClass0MR I = anonymousClass0M7.mo862I(anonymousClass0Cm);
            if (I != null) {
                m851C(I);
            }
        }
    }

    /* renamed from: F */
    public final Object m844F(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0M7 anonymousClass0M7 = AnonymousClass0M7.f3347C;
        if (anonymousClass0M7 != null) {
            AnonymousClass0MR I = anonymousClass0M7.mo862I(anonymousClass0Cm);
            if (I != null) {
                return m852D(I);
            }
        }
        return this.f1491B;
    }

    /* renamed from: G */
    public final Object m845G() {
        return m842B(null);
    }

    /* renamed from: H */
    public final Object m846H(AnonymousClass0Cm anonymousClass0Cm) {
        return m842B(anonymousClass0Cm);
    }
}
