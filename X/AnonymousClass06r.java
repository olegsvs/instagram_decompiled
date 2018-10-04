package X;

import javax.net.ssl.SSLSocketFactory;
import org.apache.harmony.xnet.provider.jsse.ClientSessionContext;
import org.apache.harmony.xnet.provider.jsse.SSLParametersImpl;

/* renamed from: X.06r */
public final class AnonymousClass06r {
    /* renamed from: B */
    public final SSLParametersImpl f431B;
    /* renamed from: C */
    public final AnonymousClass06z f432C;

    public AnonymousClass06r(SSLSocketFactory sSLSocketFactory, AnonymousClass06z anonymousClass06z, AnonymousClass06w anonymousClass06w, AnonymousClass06x anonymousClass06x, AnonymousClass06y anonymousClass06y, AnonymousClass06s anonymousClass06s, int i) {
        this.f432C = anonymousClass06z;
        try {
            SSLParametersImpl sSLParametersImpl = (SSLParametersImpl) AnonymousClass06w.f444D.get(sSLSocketFactory);
            this.f431B = sSLParametersImpl;
            try {
                ((ClientSessionContext) AnonymousClass06x.f446C.get(sSLParametersImpl)).setSessionTimeout(i);
            } catch (Exception e) {
                throw new AnonymousClass06t(e);
            }
        } catch (Exception e2) {
            throw new AnonymousClass06t(e2);
        } catch (Exception e22) {
            throw new AnonymousClass06t(e22);
        }
    }
}
