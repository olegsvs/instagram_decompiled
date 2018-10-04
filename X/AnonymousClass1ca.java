package X;

/* renamed from: X.1ca */
public final class AnonymousClass1ca extends AnonymousClass1cR {
    /* renamed from: B */
    public final String f20640B;
    /* renamed from: C */
    public final AnonymousClass0PZ f20641C;
    /* renamed from: D */
    public final AnonymousClass0dd f20642D;
    /* renamed from: E */
    public final StringBuilder f20643E = new StringBuilder();

    public AnonymousClass1ca(int i, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0vy anonymousClass0vy, String str, AnonymousClass0dd anonymousClass0dd) {
        super(i);
        this.f20641C = anonymousClass0PZ;
        this.f20631C = AnonymousClass1cT.m12135C(anonymousClass0vy);
        this.f20640B = str;
        this.f20642D = anonymousClass0dd;
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ void mo2633A(Object obj, Object obj2) {
        AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) obj;
        AnonymousClass0m3 anonymousClass0m3 = (AnonymousClass0m3) obj2;
        AnonymousClass0bP B = m12146B(this.f20640B, this.f20641C, anonymousClass0P7, anonymousClass0m3.f9717z);
        if (B != null) {
            B.lB = 4;
            AnonymousClass0vy.m8381B(B, anonymousClass0P7, this.f20643E);
            AnonymousClass0jl.m7154B(B, this.f20641C, anonymousClass0P7, anonymousClass0m3.f9717z);
            AnonymousClass0bN.m5557U(B, anonymousClass0P7, this.f20641C, anonymousClass0m3.f9673H, false, this.f20642D);
        }
    }

    /* renamed from: B */
    public final AnonymousClass0bP m12146B(String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0P7 anonymousClass0P7, int i) {
        if (this.f20631C instanceof AnonymousClass1YI) {
            return this.f20631C.f19981B.m8385C(str, anonymousClass0PZ, anonymousClass0P7, i);
        }
        AnonymousClass0Gn.m1881H("OrganicImpressionHelper", "viewportContext unavailable");
        return null;
    }
}
