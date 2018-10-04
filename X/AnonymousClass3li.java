package X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.3li */
public final class AnonymousClass3li implements AnonymousClass0gl {
    /* renamed from: B */
    private final String f44220B;
    /* renamed from: C */
    private String f44221C;

    public AnonymousClass3li(String str) {
        this.f44220B = str;
    }

    public AnonymousClass3li(String str, String str2) {
        this.f44220B = str;
        this.f44221C = str2;
    }

    public final void iB(AnonymousClass0NN anonymousClass0NN) {
        anonymousClass0NN.F(MemoryDumpUploadJob.EXTRA_USER_ID, this.f44220B);
        String str = this.f44221C;
        if (str != null) {
            anonymousClass0NN.F("username", str);
        }
    }
}
