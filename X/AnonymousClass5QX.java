package X;

/* renamed from: X.5QX */
public enum AnonymousClass5QX {
    f63259E(r1),
    f63258D(r1),
    f63260F(r1),
    f63261G(r1),
    f63262H(r1);
    
    /* renamed from: B */
    private String f63263B;

    private AnonymousClass5QX(String str) {
        this.f63263B = str;
    }

    /* renamed from: A */
    public final String m26466A() {
        return this.f63263B;
    }

    /* renamed from: B */
    public static AnonymousClass5QX m26465B(String str) {
        for (AnonymousClass5QX anonymousClass5QX : AnonymousClass5QX.values()) {
            if (anonymousClass5QX.m26466A().equals(str)) {
                return anonymousClass5QX;
            }
        }
        return f63262H;
    }
}
