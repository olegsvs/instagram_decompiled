package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1Sv */
public final class AnonymousClass1Sv {
    /* renamed from: B */
    public static void m11508B(AnonymousClass0Cm anonymousClass0Cm, DirectThreadKey directThreadKey, boolean z) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        String str = "direct_v2/threads/%s/%s/";
        Object[] objArr = new Object[2];
        objArr[0] = directThreadKey.f5871C;
        objArr[1] = z ? "label" : "unlabel";
        AnonymousClass0Pt M = anonymousClass0Pt.m3943L(str, objArr).m3944M(AnonymousClass0Pv.class);
        if (z) {
            M.m3935D("thread_label", Integer.toString(1));
        }
        AnonymousClass0GA H = M.m3939H();
        H.f2849B = new AnonymousClass4kC(anonymousClass0Cm, directThreadKey, z);
        AnonymousClass0Ix.m2384D(H);
    }
}
