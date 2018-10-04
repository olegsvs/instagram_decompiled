package X;

import java.io.File;

/* renamed from: X.43L */
public final class AnonymousClass43L extends AnonymousClass3sw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Nc f49055B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3sw f49056C;

    public AnonymousClass43L(AnonymousClass0Nc anonymousClass0Nc, AnonymousClass3sw anonymousClass3sw) {
        this.f49055B = anonymousClass0Nc;
        this.f49056C = anonymousClass3sw;
    }

    /* renamed from: A */
    public final void mo5128A(Exception exception) {
        if (!(this.f49055B.f3640t == null || this.f49055B.f3640t.f34099F == null)) {
            File file = new File(this.f49055B.f3640t.f34099F);
            if (file.exists()) {
                file.delete();
            }
        }
        this.f49055B.f3619Y = false;
        AnonymousClass3sw anonymousClass3sw = this.f49056C;
        if (anonymousClass3sw != null) {
            anonymousClass3sw.mo5128A(exception);
        }
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo5129B(Object obj) {
        AnonymousClass2nq anonymousClass2nq = (AnonymousClass2nq) obj;
        AnonymousClass3sw anonymousClass3sw = this.f49056C;
        if (anonymousClass3sw != null) {
            anonymousClass3sw.mo5129B(anonymousClass2nq);
        }
    }
}
