package X;

import java.util.List;

/* renamed from: X.418 */
public final class AnonymousClass418 implements AnonymousClass3Z5 {
    public final void sHA(AnonymousClass0OA anonymousClass0OA) {
    }

    public final void PKA(AnonymousClass0OA anonymousClass0OA, AnonymousClass2bI anonymousClass2bI, int i) {
        AnonymousClass19a anonymousClass19a = anonymousClass0OA.TC;
        String str = anonymousClass19a.f15159D;
        anonymousClass0OA = anonymousClass19a.C();
        List D = anonymousClass19a.D();
        AnonymousClass2bI anonymousClass2bI2 = anonymousClass2bI;
        if (!D.isEmpty()) {
            anonymousClass2bI2.m16401B(D.size(), i, str, anonymousClass0OA, "network_resume");
        }
        int E = anonymousClass19a.E();
        int i2 = 0;
        for (AnonymousClass2Es anonymousClass2Es : anonymousClass19a.f15160E.subList(0, anonymousClass19a.E())) {
            i2 = (int) (((long) i2) + anonymousClass2Es.f27939D);
        }
        if (E != 0) {
            AnonymousClass0O4 anonymousClass0O4 = anonymousClass2bI2.f31392B;
            AnonymousClass0OA anonymousClass0OA2 = anonymousClass2bI2.f31393C;
            AnonymousClass0O4.N(anonymousClass0O4, AnonymousClass0O4.G(anonymousClass0O4, "segment_network_resume", null, anonymousClass0OA2).F("upload_job_id", str).B("segments_count", E).F("stream_id", anonymousClass0OA).F("reason", "network_resume").B("segment_start_offset", i2), anonymousClass0OA2.iC, anonymousClass0OA2);
        }
    }
}
