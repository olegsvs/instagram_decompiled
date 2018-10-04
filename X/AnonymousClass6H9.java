package X;

/* renamed from: X.6H9 */
public final class AnonymousClass6H9 extends AnonymousClass6Bx {
    /* renamed from: B */
    private final String f73907B;
    /* renamed from: C */
    private final String f73908C;
    /* renamed from: D */
    private final String f73909D;

    public AnonymousClass6H9(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0ng anonymousClass0ng, AnonymousClass6HB anonymousClass6HB, String str, String str2, String str3, String str4) {
        super(anonymousClass0Cm, anonymousClass0ng, anonymousClass6HB, str, AnonymousClass0ON.VIDEO.toString());
        this.f73908C = str2;
        this.f73907B = str3;
        this.f73909D = str4;
    }

    /* renamed from: A */
    public final AnonymousClass0Iu mo6687A(String str) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f72845C);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "discover/chaining_experience/";
        AnonymousClass0Pt D = anonymousClass0Pt.M(AnonymousClass11j.class).D("media_id", this.f72847E).D("media_type", this.f72848F).D("surface", "explore_auto_play");
        String str2 = this.f73908C;
        if (str2 != null) {
            D.D("entry_point", str2);
        }
        str2 = this.f73907B;
        if (str2 != null) {
            D.D("author_id", str2);
        }
        str2 = this.f73909D;
        if (str2 != null) {
            D.D("explore_source_token", str2);
        }
        AnonymousClass0It.F(D, str);
        return D.H();
    }

    /* renamed from: B */
    public final AnonymousClass6Bv mo6688B(AnonymousClass0Pn anonymousClass0Pn, boolean z) {
        AnonymousClass0ft anonymousClass0ft = (AnonymousClass0ft) anonymousClass0Pn;
        AnonymousClass6Bu anonymousClass6Bu = new AnonymousClass6Bu();
        anonymousClass6Bu.f72837D = anonymousClass0ft.f8015E;
        anonymousClass6Bu.f72838E = anonymousClass0ft.oO();
        anonymousClass6Bu.f72835B = z;
        return new AnonymousClass6Bv(anonymousClass6Bu);
    }
}
