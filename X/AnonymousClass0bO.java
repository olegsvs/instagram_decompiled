package X;

import android.net.ConnectivityManager;

/* renamed from: X.0bO */
public final class AnonymousClass0bO implements AnonymousClass0Nf {
    /* renamed from: B */
    public ConnectivityManager f6724B;
    /* renamed from: C */
    private final AnonymousClass0Nf f6725C;

    public AnonymousClass0bO(AnonymousClass0Nf anonymousClass0Nf) {
        this.f6725C = anonymousClass0Nf;
    }

    public final AnonymousClass0aL pUA(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA, AnonymousClass0gT anonymousClass0gT) {
        if (AnonymousClass0gf.m6670B(anonymousClass0a8.f6448H.getHost())) {
            String str = "X-IG-Connection-Type";
            if (this.f6724B == null) {
                this.f6724B = (ConnectivityManager) AnonymousClass0EV.f1977B.getSystemService("connectivity");
            }
            anonymousClass0a8.m5429A(str, AnonymousClass0MM.m3146B(this.f6724B.getActiveNetworkInfo()));
            anonymousClass0a8.m5429A("X-IG-Capabilities", AnonymousClass0gh.f8268B);
            anonymousClass0a8.m5429A("X-IG-App-ID", AnonymousClass0Cq.f1767B);
        }
        return this.f6725C.pUA(anonymousClass0a8, anonymousClass0aA, anonymousClass0gT);
    }
}
