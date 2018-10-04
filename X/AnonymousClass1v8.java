package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.1v8 */
public final class AnonymousClass1v8 extends WebViewClient {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1vA f24114B;

    public AnonymousClass1v8(AnonymousClass1vA anonymousClass1vA) {
        this.f24114B = anonymousClass1vA;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (!this.f24114B.f24117D) {
            this.f24114B.f24120G.dismiss();
        }
        this.f24114B.f24115B.setBackgroundColor(0);
        this.f24114B.f24122I.setVisibility(0);
        this.f24114B.f24116C.setVisibility(0);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (!this.f24114B.f24117D) {
            this.f24114B.f24120G.show();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.f24114B.m13717B(new AnonymousClass1ok(AnonymousClass1oj.DIALOG));
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        sslErrorHandler.cancel();
        this.f24114B.m13717B(new AnonymousClass1ok(AnonymousClass1oj.DIALOG));
    }

    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r8, java.lang.String r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = "fbconnect://success";
        r0 = r9.startsWith(r0);
        r6 = 1;
        if (r0 == 0) goto L_0x00a4;
    L_0x0009:
        r1 = android.net.Uri.parse(r9);
        r0 = r1.getQuery();
        r3 = X.AnonymousClass19Y.H(r0);
        r0 = r1.getFragment();
        r0 = X.AnonymousClass19Y.H(r0);
        r3.putAll(r0);
        r0 = "error";
        r5 = r3.getString(r0);
        if (r5 != 0) goto L_0x002e;
    L_0x0028:
        r0 = "error_type";
        r5 = r3.getString(r0);
    L_0x002e:
        r0 = "error_msg";
        r4 = r3.getString(r0);
        if (r4 != 0) goto L_0x003c;
    L_0x0036:
        r0 = "error_message";
        r4 = r3.getString(r0);
    L_0x003c:
        if (r4 != 0) goto L_0x0044;
    L_0x003e:
        r0 = "error_description";
        r4 = r3.getString(r0);
    L_0x0044:
        r0 = "error_code";
        r1 = r3.getString(r0);
        r0 = X.AnonymousClass19Y.E(r1);
        r2 = -1;
        if (r0 != 0) goto L_0x0056;
    L_0x0051:
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0056 }
        goto L_0x0057;	 Catch:{ NumberFormatException -> 0x0056 }
    L_0x0056:
        r1 = -1;
    L_0x0057:
        r0 = X.AnonymousClass19Y.E(r5);
        if (r0 == 0) goto L_0x007a;
    L_0x005d:
        r0 = X.AnonymousClass19Y.E(r4);
        if (r0 == 0) goto L_0x007a;
    L_0x0063:
        if (r1 != r2) goto L_0x007a;
    L_0x0065:
        r2 = r7.f24114B;
        r1 = r2.f24119F;
        if (r1 == 0) goto L_0x0079;
    L_0x006b:
        r0 = r2.f24118E;
        if (r0 != 0) goto L_0x0079;
    L_0x006f:
        r0 = 1;
        r2.f24118E = r0;
        r0 = 0;
        r1.Dh(r3, r0);
        r2.dismiss();
    L_0x0079:
        goto L_0x00a3;
    L_0x007a:
        if (r5 == 0) goto L_0x0092;
    L_0x007c:
        r0 = "access_denied";
        r0 = r5.equals(r0);
        if (r0 != 0) goto L_0x008c;
    L_0x0084:
        r0 = "OAuthAccessDeniedException";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x0092;
    L_0x008c:
        r0 = r7.f24114B;
        r0.cancel();
        goto L_0x00a3;
    L_0x0092:
        r0 = 4201; // 0x1069 float:5.887E-42 double:2.0756E-320;
        if (r1 != r0) goto L_0x0097;
    L_0x0096:
        goto L_0x008c;
    L_0x0097:
        r2 = r7.f24114B;
        r1 = new X.1ok;
        r0 = X.AnonymousClass1oj.SERVICE;
        r1.<init>(r0);
        r2.m13717B(r1);
    L_0x00a3:
        return r6;
    L_0x00a4:
        r0 = "fbconnect://cancel";
        r0 = r9.startsWith(r0);
        if (r0 == 0) goto L_0x00b2;
    L_0x00ac:
        r0 = r7.f24114B;
        r0.cancel();
        return r6;
    L_0x00b2:
        r0 = "touch";
        r0 = r9.contains(r0);
        if (r0 == 0) goto L_0x00bc;
    L_0x00ba:
        r0 = 0;
        return r0;
    L_0x00bc:
        r1 = android.net.Uri.parse(r9);
        r0 = r7.f24114B;
        r0 = r0.getContext();
        X.AnonymousClass0IW.T(r1, r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1v8.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
