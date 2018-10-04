package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.05o */
public final class AnonymousClass05o implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0AC f194B;
    /* renamed from: C */
    private AnonymousClass05f f195C;

    public AnonymousClass05o(AnonymousClass0AC anonymousClass0AC, AnonymousClass05f anonymousClass05f) {
        this.f194B = anonymousClass0AC;
        this.f195C = anonymousClass05f;
    }

    public final void run() {
        AnonymousClass0AC anonymousClass0AC = this.f194B;
        AnonymousClass05f anonymousClass05f = this.f195C;
        Object string = anonymousClass0AC.f1172K.getString(MemoryDumpUploadJob.EXTRA_USER_ID, JsonProperty.USE_DEFAULT_NAME);
        if (AnonymousClass1Cn.m9924D(string)) {
            string = "0";
        }
        anonymousClass05f.f168B.put("pk", string);
        AnonymousClass05j anonymousClass05j = this.f194B.f1171J;
        anonymousClass05j.f182E.add(this.f195C);
        this.f194B.f1169H.removeMessages(1);
        if (this.f194B.f1171J.f182E.size() >= 50) {
            AnonymousClass0AC.m675B(this.f194B);
        } else {
            this.f194B.f1169H.sendEmptyMessageDelayed(1, 300000);
        }
    }
}
