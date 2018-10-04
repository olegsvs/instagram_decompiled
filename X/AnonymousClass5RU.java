package X;

import com.facebook.analytics2.logger.UploadJobInstrumentation;

/* renamed from: X.5RU */
public final class AnonymousClass5RU implements AnonymousClass46d {
    /* renamed from: B */
    private final String f63407B;
    /* renamed from: C */
    private final AnonymousClass46o f63408C;
    /* renamed from: D */
    private final AnonymousClass46d f63409D;
    /* renamed from: E */
    private final UploadJobInstrumentation f63410E;

    public AnonymousClass5RU(AnonymousClass46d anonymousClass46d, AnonymousClass46o anonymousClass46o, String str, UploadJobInstrumentation uploadJobInstrumentation) {
        this.f63409D = anonymousClass46d;
        this.f63408C = anonymousClass46o;
        this.f63407B = str;
        this.f63410E = uploadJobInstrumentation;
    }

    public final void jGA(boolean z) {
        this.f63409D.jGA(z);
    }

    public final void yk() {
        UploadJobInstrumentation uploadJobInstrumentation = this.f63410E;
        if (uploadJobInstrumentation != null) {
            uploadJobInstrumentation.recordUploadJobStop((String) AnonymousClass0LR.D(this.f63407B));
        }
        this.f63409D.yk();
        AnonymousClass46o anonymousClass46o = this.f63408C;
        if (anonymousClass46o != null) {
            anonymousClass46o.f50366B.stopSelf(anonymousClass46o.f50367C);
        }
    }
}
