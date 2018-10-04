package X;

import org.apache.http.client.HttpResponseException;

/* renamed from: X.1u9 */
public final class AnonymousClass1u9 {
    /* renamed from: B */
    public final AnonymousClass1u1 f23946B;
    /* renamed from: C */
    public int f23947C = 0;

    public AnonymousClass1u9(AnonymousClass1u1 anonymousClass1u1) {
        this.f23946B = anonymousClass1u1;
    }

    /* renamed from: A */
    public final void m13655A(Exception exception) {
        if ((exception instanceof HttpResponseException) && ((HttpResponseException) exception).getStatusCode() == 418) {
            this.f23947C++;
        }
    }
}
