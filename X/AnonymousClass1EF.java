package X;

import java.util.HashSet;

/* renamed from: X.1EF */
public final class AnonymousClass1EF {
    /* renamed from: C */
    public static final AnonymousClass1EF f15875C = new AnonymousClass1EF();
    /* renamed from: B */
    public final HashSet f15876B = new HashSet();

    /* renamed from: A */
    public final void m10184A(String str, AnonymousClass3lo anonymousClass3lo, AnonymousClass0Cn anonymousClass0Cn) {
        if (this.f15876B.add(str)) {
            AnonymousClass0Pt anonymousClass0Pt = anonymousClass0Cn == null ? new AnonymousClass0Pt() : new AnonymousClass0Pt(anonymousClass0Cn);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            AnonymousClass0GA H = anonymousClass0Pt.m3943L("users/%s/info/", str).m3944M(AnonymousClass3ll.class).m3939H();
            H.f2849B = new AnonymousClass3ln(this, str, anonymousClass3lo);
            AnonymousClass0Ix.m2384D(H);
        }
    }
}
