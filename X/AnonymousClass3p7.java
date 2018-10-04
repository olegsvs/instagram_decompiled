package X;

/* renamed from: X.3p7 */
public final class AnonymousClass3p7 {
    /* renamed from: B */
    public long f44891B;
    /* renamed from: C */
    public long f44892C;
    /* renamed from: D */
    private final String f44893D;

    public AnonymousClass3p7(String str) {
        this.f44893D = str;
    }

    /* renamed from: B */
    public static void m20797B(AnonymousClass3p7 anonymousClass3p7, AnonymousClass0NN anonymousClass0NN) {
        anonymousClass0NN.C(anonymousClass3p7.f44893D, anonymousClass3p7.f44892C / 1000);
    }

    /* renamed from: C */
    public static void m20798C(AnonymousClass3p7 anonymousClass3p7) {
        anonymousClass3p7.f44891B = System.nanoTime();
    }

    /* renamed from: D */
    public static void m20799D(AnonymousClass3p7 anonymousClass3p7) {
        anonymousClass3p7.f44892C += System.nanoTime() - anonymousClass3p7.f44891B;
    }

    /* renamed from: E */
    public static void m20800E(AnonymousClass3p7 anonymousClass3p7, AnonymousClass3p7 anonymousClass3p72) {
        long nanoTime = System.nanoTime();
        anonymousClass3p7.f44892C += nanoTime - anonymousClass3p7.f44891B;
        anonymousClass3p72.f44891B = nanoTime;
    }
}
