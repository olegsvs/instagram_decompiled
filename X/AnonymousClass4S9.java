package X;

/* renamed from: X.4S9 */
public final class AnonymousClass4S9 {
    /* renamed from: B */
    public static void m24262B(int i, AnonymousClass0IL anonymousClass0IL, AnonymousClass0IL anonymousClass0IL2, boolean z, String str) {
        AnonymousClass0IU fragmentManager;
        if (z) {
            fragmentManager = anonymousClass0IL.getParentFragment().getFragmentManager();
        } else {
            fragmentManager = anonymousClass0IL.getFragmentManager();
        }
        AnonymousClass0IV B = fragmentManager.B();
        B.M(i, anonymousClass0IL2);
        B.D(str);
        B.F();
    }

    /* renamed from: C */
    public static void m24263C(AnonymousClass4Sa anonymousClass4Sa, AnonymousClass4SZ anonymousClass4SZ, AnonymousClass0IU anonymousClass0IU, AnonymousClass0IL anonymousClass0IL, boolean z) {
        int LM = anonymousClass4Sa.LM(anonymousClass4SZ);
        String nI = z ? anonymousClass4Sa.nI(anonymousClass4SZ) : null;
        AnonymousClass0IV B = anonymousClass0IU.B();
        B.M(LM, anonymousClass0IL);
        B.D(nI);
        B.F();
    }

    /* renamed from: D */
    public static boolean m24264D(String str, AnonymousClass0IU anonymousClass0IU) {
        return AnonymousClass0cJ.E(anonymousClass0IU) ? anonymousClass0IU.Q(str, 1) : false;
    }
}
