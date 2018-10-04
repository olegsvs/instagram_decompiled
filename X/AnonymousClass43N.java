package X;

import java.io.File;

/* renamed from: X.43N */
public final class AnonymousClass43N extends AnonymousClass3sw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Nc f49059B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3sw f49060C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass3sw f49061D;

    public AnonymousClass43N(AnonymousClass0Nc anonymousClass0Nc, AnonymousClass3sw anonymousClass3sw, AnonymousClass3sw anonymousClass3sw2) {
        this.f49059B = anonymousClass0Nc;
        this.f49061D = anonymousClass3sw;
        this.f49060C = anonymousClass3sw2;
    }

    /* renamed from: A */
    public final void mo5128A(Exception exception) {
        if (!(this.f49059B.f3640t == null || this.f49059B.f3640t.f34099F == null)) {
            File file = new File(this.f49059B.f3640t.f34099F);
            if (file.exists()) {
                file.delete();
            }
        }
        this.f49059B.f3619Y = false;
        AnonymousClass3sw anonymousClass3sw = this.f49061D;
        if (anonymousClass3sw != null) {
            anonymousClass3sw.mo5128A(exception);
        }
        AnonymousClass0Nc.O(this.f49059B, this.f49060C);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo5129B(Object obj) {
        AnonymousClass2nq anonymousClass2nq = (AnonymousClass2nq) obj;
        AnonymousClass3sw anonymousClass3sw = this.f49061D;
        if (anonymousClass3sw != null) {
            anonymousClass3sw.mo5129B(anonymousClass2nq);
        }
        AnonymousClass0Nc.O(this.f49059B, this.f49060C);
    }
}
