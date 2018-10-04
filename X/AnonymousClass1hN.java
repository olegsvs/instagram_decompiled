package X;

/* renamed from: X.1hN */
public final class AnonymousClass1hN {
    /* renamed from: B */
    public static void m12568B(AnonymousClass0P7 anonymousClass0P7, boolean z, AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass1hN.m12569C(anonymousClass0P7, z ? AnonymousClass0xJ.LIKED : AnonymousClass0xJ.NOT_LIKED, z ? AnonymousClass0xJ.NOT_LIKED : AnonymousClass0xJ.LIKED, anonymousClass0Ci);
    }

    /* renamed from: C */
    public static void m12569C(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0xJ anonymousClass0xJ, AnonymousClass0xJ anonymousClass0xJ2, AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0Sy.m4434C();
        if (anonymousClass0xJ != anonymousClass0xJ2) {
            anonymousClass0P7.jB = anonymousClass0xJ2;
            if (anonymousClass0P7.kB != null) {
                if ((anonymousClass0P7.jB == AnonymousClass0xJ.LIKED ? 1 : null) != null) {
                    anonymousClass0P7.kB.add(anonymousClass0Ci);
                } else {
                    anonymousClass0P7.kB.remove(anonymousClass0Ci);
                }
            }
            anonymousClass0P7.iB = anonymousClass0xJ2 == AnonymousClass0xJ.LIKED ? anonymousClass0P7.iB + 1 : anonymousClass0P7.iB - 1;
            anonymousClass0P7.yC();
        }
    }
}
