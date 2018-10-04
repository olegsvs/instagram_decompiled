package X;

/* renamed from: X.1cb */
public final class AnonymousClass1cb extends AnonymousClass1cR {
    /* renamed from: B */
    public final String f20644B;
    /* renamed from: C */
    public final AnonymousClass0PZ f20645C;
    /* renamed from: D */
    public final StringBuilder f20646D = new StringBuilder();

    public AnonymousClass1cb(int i, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0vy anonymousClass0vy, String str) {
        super(i);
        this.f20645C = anonymousClass0PZ;
        this.f20631C = AnonymousClass1cT.m12135C(anonymousClass0vy);
        this.f20644B = str;
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ void mo2633A(Object obj, Object obj2) {
        AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) obj;
        AnonymousClass0m3 anonymousClass0m3 = (AnonymousClass0m3) obj2;
        AnonymousClass0bP B = m12148B(this.f20644B, this.f20645C, anonymousClass0P7, anonymousClass0m3.f9717z);
        if (B != null) {
            B.lB = 4;
            AnonymousClass0vy.m8381B(B, anonymousClass0P7, this.f20646D);
            AnonymousClass0jl.m7154B(B, this.f20645C, anonymousClass0P7, anonymousClass0m3.f9717z);
            AnonymousClass0bN.m5555S(B, anonymousClass0P7, this.f20645C, anonymousClass0m3.f9673H);
        }
    }

    /* renamed from: B */
    public final AnonymousClass0bP m12148B(String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0P7 anonymousClass0P7, int i) {
        if (this.f20631C instanceof AnonymousClass1YI) {
            return this.f20631C.f19981B.m8386D(str, anonymousClass0PZ, anonymousClass0P7, i);
        }
        AnonymousClass0Gn.m1881H("OrganicImpressionHelper", "viewportContext unavailable");
        return null;
    }
}
