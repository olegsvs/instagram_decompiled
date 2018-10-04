package X;

import java.io.File;

/* renamed from: X.17t */
public final class AnonymousClass17t {
    /* renamed from: B */
    public String f14850B;
    /* renamed from: C */
    public String f14851C;
    /* renamed from: D */
    public AnonymousClass0ES f14852D;
    /* renamed from: E */
    public AnonymousClass0Pu f14853E;
    /* renamed from: F */
    public final AnonymousClass0Qu f14854F = new AnonymousClass0Qu();
    /* renamed from: G */
    public AnonymousClass0RB f14855G;
    /* renamed from: H */
    public String f14856H;

    /* renamed from: A */
    public final AnonymousClass17t m9510A(String str, File file, String str2) {
        AnonymousClass0Qu anonymousClass0Qu = this.f14854F;
        AnonymousClass0LH.m2924B(str != null);
        anonymousClass0Qu.f4504B.put(str, new AnonymousClass18r(file, str2));
        return this;
    }

    /* renamed from: B */
    public final AnonymousClass17t m9511B(String str, String str2) {
        this.f14854F.m4077H(str, str2);
        return this;
    }

    /* renamed from: C */
    public final AnonymousClass0Iu m9512C() {
        return new AnonymousClass0Iu(AnonymousClass0Xx.m5273B(new AnonymousClass1Bu(this)).m5276C(AnonymousClass0gO.f8154B).m5277D(this.f14855G), "FacebookGraphApi", this.f14856H);
    }

    /* renamed from: D */
    public final AnonymousClass17t m9513D(Class cls) {
        this.f14855G = new AnonymousClass0RA(cls);
        return this;
    }
}
