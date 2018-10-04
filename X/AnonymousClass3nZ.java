package X;

/* renamed from: X.3nZ */
public final class AnonymousClass3nZ {
    /* renamed from: B */
    private final AnonymousClass0EE f44568B;
    /* renamed from: C */
    private final String f44569C;
    /* renamed from: D */
    private String f44570D;

    public AnonymousClass3nZ(AnonymousClass0EE anonymousClass0EE, String str) {
        this.f44568B = (AnonymousClass0EE) AnonymousClass1mY.m13012C(anonymousClass0EE);
        this.f44570D = str;
        this.f44569C = null;
    }

    public AnonymousClass3nZ(String str, String str2) {
        this.f44568B = null;
        this.f44570D = str2;
        this.f44569C = (String) AnonymousClass1mY.m13012C(str);
    }

    /* renamed from: A */
    public final void m20674A(int i) {
        AnonymousClass3nZ.m20669B(this, "fb_invite_exit").B("last_row_viewed", i).R();
    }

    /* renamed from: B */
    public static AnonymousClass0NN m20669B(AnonymousClass3nZ anonymousClass3nZ, String str) {
        return anonymousClass3nZ.m20673F(str, null);
    }

    /* renamed from: C */
    public static void m20670C(AnonymousClass3nZ anonymousClass3nZ, String str) {
        AnonymousClass3nZ.m20671D(anonymousClass3nZ, str, null);
    }

    /* renamed from: D */
    public static void m20671D(AnonymousClass3nZ anonymousClass3nZ, String str, AnonymousClass0dl anonymousClass0dl) {
        anonymousClass3nZ.m20673F(str, anonymousClass0dl).R();
    }

    /* renamed from: E */
    public static AnonymousClass0NN m20672E(AnonymousClass3nZ anonymousClass3nZ, String str) {
        AnonymousClass0EE anonymousClass0EE = anonymousClass3nZ.f44568B;
        if (anonymousClass0EE != null) {
            return AnonymousClass0NN.B(str, anonymousClass0EE);
        }
        return AnonymousClass0NN.C(str, anonymousClass3nZ.f44569C);
    }

    /* renamed from: F */
    private AnonymousClass0NN m20673F(String str, AnonymousClass0dl anonymousClass0dl) {
        AnonymousClass0NN F = AnonymousClass3nZ.m20672E(this, str).F("referring_screen", this.f44570D).F("invite_flow", AnonymousClass3RI.CONTACT.m19645A());
        if (anonymousClass0dl != null) {
            F.F("phone_id", anonymousClass0dl.f7512B);
        }
        return F;
    }
}
