package com.instagram.share.ameba;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0GA;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Px;
import X.AnonymousClass0cQ;
import X.AnonymousClass3ed;
import X.AnonymousClass3ek;
import X.AnonymousClass3el;
import X.AnonymousClass3et;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class AmebaAuthActivity extends IgFragmentActivity {
    /* renamed from: B */
    public AnonymousClass0Cm f43057B;
    /* renamed from: C */
    private WebView f43058C;

    /* renamed from: B */
    public static void m20307B(AmebaAuthActivity amebaAuthActivity) {
        amebaAuthActivity.f43058C.clearHistory();
        amebaAuthActivity.f43058C.loadUrl("https://oauth.ameba.jp/authorize?response_type=code&client_id=4d0c1bbd6846e97622631d869d293f53baeb7b75afe27a2d31fa5794ae2e705a&display=smartphone&scope=w_ameba");
    }

    /* renamed from: O */
    public final void m20308O(AnonymousClass0GA anonymousClass0GA) {
        AnonymousClass0Px.B(this, E(), anonymousClass0GA);
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 356081213);
        super.onCreate(bundle);
        this.f43057B = AnonymousClass0Ce.H(this);
        View webView = new com.facebook.secure.webkit.WebView(this);
        this.f43058C = webView;
        setContentView(webView);
        this.f43058C.getSettings().setJavaScriptEnabled(true);
        this.f43058C.setWebViewClient(new AnonymousClass3ek(this));
        AnonymousClass3ed B2 = AnonymousClass3ed.m20300B(this.f43057B);
        if (B2 != null) {
            String str = B2.f43042D;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f43057B);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "ameba/reauthenticate/";
            AnonymousClass0GA H = anonymousClass0Pt.D("refresh_token", str).M(AnonymousClass3et.class).N().H();
            H.f2849B = new AnonymousClass3el(this);
            O(H);
        } else {
            m20307B(this);
        }
        AnonymousClass0cQ.C(this, 1130497062, B);
    }

    public final void onDestroy() {
        int B = AnonymousClass0cQ.B(this, -1872890834);
        super.onDestroy();
        this.f43058C = null;
        AnonymousClass0cQ.C(this, 2027107107, B);
    }
}
