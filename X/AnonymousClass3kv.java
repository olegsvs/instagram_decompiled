package X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.3kv */
public final class AnonymousClass3kv {
    /* renamed from: B */
    public static AnonymousClass0Iu m20579B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, String str) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = AnonymousClass0IE.E("friendships/%s/%s/", new Object[]{str, anonymousClass0Ci.getId()});
        return anonymousClass0Pt.D(MemoryDumpUploadJob.EXTRA_USER_ID, anonymousClass0Ci.getId()).M(AnonymousClass3lW.class).N().H();
    }
}
