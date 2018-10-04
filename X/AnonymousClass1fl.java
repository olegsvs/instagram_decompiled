package X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.1fl */
public final class AnonymousClass1fl {
    /* renamed from: B */
    public static void m12426B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, String str, AnonymousClass0Iw anonymousClass0Iw, boolean z) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = AnonymousClass0IE.m2137E("users/%s/flag_user/", anonymousClass0Ci.getId());
        AnonymousClass0GA H = anonymousClass0Pt.m3935D(MemoryDumpUploadJob.EXTRA_USER_ID, anonymousClass0Ci.getId()).m3935D("reason_id", String.valueOf(1)).m3935D("source_name", str).m3935D("is_spam", z ? "true" : "false").m3944M(AnonymousClass0Pv.class).m3945N().m3939H();
        if (anonymousClass0Iw != null) {
            H.f2849B = anonymousClass0Iw;
        }
        AnonymousClass0Ix.m2384D(H);
    }
}
