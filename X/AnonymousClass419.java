package X;

import java.util.List;

/* renamed from: X.419 */
public final class AnonymousClass419 implements AnonymousClass3Z5 {
    /* renamed from: B */
    public static final Class f48405B = AnonymousClass419.class;

    public final void PKA(AnonymousClass0OA anonymousClass0OA, AnonymousClass2bI anonymousClass2bI, int i) {
        AnonymousClass19a anonymousClass19a = anonymousClass0OA.TC;
        List D = anonymousClass19a.D();
        if (!D.isEmpty()) {
            anonymousClass2bI.m16401B(D.size(), i, anonymousClass19a.f15159D, anonymousClass19a.C(), "render_resume");
        }
    }

    public final void sHA(AnonymousClass0OA anonymousClass0OA) {
        if (!AnonymousClass2NL.m15320D(anonymousClass0OA)) {
            AnonymousClass0Dc.B(f48405B, "segment failed to prepare for resumable rendering. reset checkpoint info.");
            anonymousClass0OA.TC.A();
        }
        anonymousClass0OA.TC.G();
    }
}
