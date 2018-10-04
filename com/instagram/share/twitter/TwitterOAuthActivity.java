package com.instagram.share.twitter;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0GA;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Sb;
import X.AnonymousClass0cQ;
import X.AnonymousClass3fb;
import X.AnonymousClass3fd;
import X.AnonymousClass3fe;
import X.AnonymousClass3fj;
import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.C0164R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class TwitterOAuthActivity extends IgFragmentActivity {
    /* renamed from: C */
    public static final Class f43187C = TwitterOAuthActivity.class;
    /* renamed from: B */
    public AnonymousClass0Cm f43188B;

    /* renamed from: B */
    public static void m20376B(TwitterOAuthActivity twitterOAuthActivity) {
        AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(twitterOAuthActivity);
        anonymousClass0Sb.H(C0164R.string.unknown_error_occured);
        anonymousClass0Sb.O(C0164R.string.ok, new AnonymousClass3fb(twitterOAuthActivity));
        anonymousClass0Sb.C().show();
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, -1036164287);
        super.onCreate(bundle);
        setContentView(C0164R.layout.share_webview);
        this.f43188B = AnonymousClass0Ce.H(this);
        WebView webView = (WebView) findViewById(C0164R.id.webView);
        webView.setWebViewClient(new AnonymousClass3fd(this));
        webView.getSettings().setJavaScriptEnabled(true);
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f43188B);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "twitter/authorize/";
        AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass3fj.class).H();
        H.f2849B = new AnonymousClass3fe(this, webView);
        O(H);
        AnonymousClass0cQ.C(this, 1891411681, B);
    }
}
