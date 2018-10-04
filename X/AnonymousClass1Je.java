package X;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

/* renamed from: X.1Je */
public final class AnonymousClass1Je implements AnonymousClass1Jf {
    /* renamed from: B */
    public final int f17101B;
    /* renamed from: C */
    private final Proxy f17102C;

    public AnonymousClass1Je(int i, Proxy proxy) {
        this.f17101B = i;
        this.f17102C = proxy;
    }

    public final HttpURLConnection DK(URL url) {
        Proxy proxy = this.f17102C;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy != null ? url.openConnection(proxy) : url.openConnection());
        httpURLConnection.setConnectTimeout(this.f17101B);
        httpURLConnection.setReadTimeout(this.f17101B);
        return httpURLConnection;
    }
}
