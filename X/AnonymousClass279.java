package X;

import android.content.Context;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;

/* renamed from: X.279 */
public final class AnonymousClass279 extends Thread {
    /* renamed from: B */
    public final /* synthetic */ int f26103B;
    /* renamed from: C */
    public final /* synthetic */ long f26104C;

    public AnonymousClass279(AnonymousClass27A anonymousClass27A, long j, int i) {
        this.f26104C = j;
        this.f26103B = i;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        Throwable e;
        Throwable th;
        double d = (double) this.f26104C;
        Double.isNaN(d);
        long round = Math.round(d / 1000.0d);
        int i = this.f26103B;
        String str = AnonymousClass0Cq.f1769D;
        Context context = AnonymousClass0EV.f1977B;
        int parseInt = Integer.parseInt(AnonymousClass0FF.C(context).split("\\.")[0]);
        int B = AnonymousClass0FF.B(context);
        String A = AnonymousClass0Dt.f1941C.A(context);
        try {
            httpURLConnection = (HttpURLConnection) new URL(String.format(Locale.US, "https://m.facebook.com/insta_crash?app_name=%s&app_version=%s&major_version=%d&build_number=%d&device_id=%s&crash_count=%d&duration=%d&platform=%s", new Object[]{str, r10, Integer.valueOf(parseInt), Integer.valueOf(B), A, Integer.valueOf(i), Long.valueOf(round), "android"})).openConnection();
            try {
                httpURLConnection.setRequestMethod(ReactWebViewManager.HTTP_METHOD_POST);
                AnonymousClass1Ji.B(httpURLConnection, 2125680931);
                AnonymousClass27A.f26105B.getName();
                Integer.valueOf(httpURLConnection.getResponseCode());
                httpURLConnection.getResponseMessage();
            } catch (IOException e2) {
                e = e2;
                try {
                    AnonymousClass0Gn.G(AnonymousClass27A.f26105B.getName(), e);
                    if (httpURLConnection == null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            AnonymousClass0Gn.G(AnonymousClass27A.f26105B.getName(), e);
            if (httpURLConnection == null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
        if (httpURLConnection == null) {
            httpURLConnection.disconnect();
        }
    }
}
