package X;

/* renamed from: X.64l */
public final class AnonymousClass64l {
    /* renamed from: B */
    public final AnonymousClass0Cm f71539B;
    /* renamed from: C */
    private final AnonymousClass0IP f71540C;

    public AnonymousClass64l(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IP anonymousClass0IP) {
        this.f71539B = anonymousClass0Cm;
        this.f71540C = anonymousClass0IP;
    }

    /* renamed from: B */
    public static void m28915B(AnonymousClass64l anonymousClass64l, String str, String str2, String str3, AnonymousClass3AL anonymousClass3AL) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass64l.f71539B);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        AnonymousClass0GA H = anonymousClass0Pt.L("live/%s/interactivity_publish_prototype/", new Object[]{str2}).D("payload", str3).M(AnonymousClass64s.class).N().H();
        H.f2849B = new AnonymousClass3AK(anonymousClass3AL, str);
        anonymousClass64l.f71540C.schedule(H);
    }
}
