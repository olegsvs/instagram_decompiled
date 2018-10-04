package X;

/* renamed from: X.1cU */
public final class AnonymousClass1cU extends AnonymousClass1cR {
    /* renamed from: B */
    public final String f20632B;
    /* renamed from: C */
    public final AnonymousClass0PZ f20633C;

    public AnonymousClass1cU(int i, AnonymousClass0PZ anonymousClass0PZ, String str, AnonymousClass0vy anonymousClass0vy) {
        super(i);
        this.f20633C = anonymousClass0PZ;
        this.f20632B = str;
        this.f20631C = AnonymousClass1cT.m12135C(anonymousClass0vy);
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ void mo2633A(Object obj, Object obj2) {
        AnonymousClass1ce anonymousClass1ce = (AnonymousClass1ce) obj2;
        AnonymousClass0P7 JA = ((AnonymousClass0P7) obj).JA();
        AnonymousClass0bP B = m12137B(this.f20632B, this.f20633C, JA, anonymousClass1ce.f20651C);
        if (B != null) {
            B.lB = 4;
            AnonymousClass0bN.m5556T(B, JA, this.f20633C, anonymousClass1ce.f20650B, true);
        }
    }

    /* renamed from: B */
    public final AnonymousClass0bP m12137B(String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0P7 anonymousClass0P7, int i) {
        if (this.f20631C instanceof AnonymousClass1YI) {
            return this.f20631C.f19981B.m8383A(str, anonymousClass0PZ, anonymousClass0P7, i);
        }
        AnonymousClass0Gn.m1881H("OrganicImpressionHelper", "viewportContext unavailable");
        return null;
    }
}
