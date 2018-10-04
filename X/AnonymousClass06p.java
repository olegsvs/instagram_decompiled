package X;

import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.06p */
public final class AnonymousClass06p {
    /* renamed from: B */
    private final ExecutorService f419B;
    /* renamed from: C */
    private final AnonymousClass06q f420C;
    /* renamed from: D */
    private final AnonymousClass06z f421D;

    public AnonymousClass06p(ExecutorService executorService, AnonymousClass06q anonymousClass06q, AnonymousClass06z anonymousClass06z) {
        this.f419B = executorService;
        this.f420C = anonymousClass06q;
        this.f421D = anonymousClass06z;
    }

    /* renamed from: A */
    public final AnonymousClass06o m419A() {
        AnonymousClass06r A = this.f420C.m421A();
        if (A != null) {
            return new AnonymousClass0AV(this.f419B, A);
        }
        return new AnonymousClass0AW(this.f419B, (SSLSocketFactory) SSLSocketFactory.getDefault(), this.f421D);
    }
}
