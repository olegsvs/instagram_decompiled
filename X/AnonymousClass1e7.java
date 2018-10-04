package X;

/* renamed from: X.1e7 */
public enum AnonymousClass1e7 {
    f20937L(-1, r1),
    f20932G(0, r1),
    f20930E(1, r1),
    f20931F(2, r1),
    f20936K(10, r1),
    f20935J(11, r1),
    f20933H(12, r1),
    f20934I(13, r1);
    
    /* renamed from: B */
    public final String f20938B;
    /* renamed from: C */
    public final int f20939C;

    private AnonymousClass1e7(int i, String str) {
        this.f20939C = i;
        this.f20938B = str;
    }

    /* renamed from: B */
    public static AnonymousClass1e7 m12268B(int i) {
        for (AnonymousClass1e7 anonymousClass1e7 : AnonymousClass1e7.values()) {
            if (anonymousClass1e7.f20939C == i) {
                return anonymousClass1e7;
            }
        }
        return f20937L;
    }

    /* renamed from: C */
    public static boolean m12269C(AnonymousClass1e7 anonymousClass1e7) {
        if (!(anonymousClass1e7 == f20935J || anonymousClass1e7 == f20933H)) {
            if (anonymousClass1e7 != f20934I) {
                return false;
            }
        }
        return true;
    }
}
