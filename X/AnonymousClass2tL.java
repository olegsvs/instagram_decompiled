package X;

import java.util.Map;

/* renamed from: X.2tL */
public final class AnonymousClass2tL {
    /* renamed from: B */
    private final Map f35427B;

    /* renamed from: A */
    public final synchronized void m17591A(String str, AnonymousClass2tK anonymousClass2tK, boolean z) {
        if (!this.f35427B.containsKey(str)) {
            switch (AnonymousClass2tJ.f35423B[anonymousClass2tK.ordinal()]) {
                case 1:
                case 2:
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: B */
    public static boolean m17589B(AnonymousClass2tK anonymousClass2tK) {
        if (anonymousClass2tK != AnonymousClass2tK.AUDIO && anonymousClass2tK == AnonymousClass2tK.VIDEO) {
        }
        return false;
    }

    /* renamed from: C */
    public static AnonymousClass2tL m17590C() {
        throw new IllegalStateException("Logger not enabled");
    }
}
