package com.instagram.share.odnoklassniki;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0GA;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Sb;
import X.AnonymousClass0cQ;
import X.AnonymousClass3fJ;
import X.AnonymousClass3fK;
import X.AnonymousClass3fL;
import X.AnonymousClass3fM;
import X.AnonymousClass3fN;
import X.AnonymousClass3fP;
import X.AnonymousClass3fR;
import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.C0164R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class OdnoklassnikiAuthActivity extends IgFragmentActivity {
    /* renamed from: E */
    public static final Class f43151E = OdnoklassnikiAuthActivity.class;
    /* renamed from: B */
    public AnonymousClass0Cm f43152B;
    /* renamed from: C */
    public WebView f43153C;
    /* renamed from: D */
    public AnonymousClass3fM f43154D;

    /* renamed from: B */
    public static void m20358B(OdnoklassnikiAuthActivity odnoklassnikiAuthActivity) {
        AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(odnoklassnikiAuthActivity);
        anonymousClass0Sb.H(C0164R.string.unknown_error_occured);
        anonymousClass0Sb.O(C0164R.string.ok, new AnonymousClass3fK(odnoklassnikiAuthActivity));
        anonymousClass0Sb.C().show();
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0Pt anonymousClass0Pt;
        int B = AnonymousClass0cQ.B(this, -113645172);
        super.onCreate(bundle);
        setContentView(C0164R.layout.share_webview);
        this.f43152B = AnonymousClass0Ce.H(this);
        this.f43153C = (WebView) findViewById(C0164R.id.webView);
        this.f43154D = new AnonymousClass3fM(this);
        this.f43153C.setWebViewClient(this.f43154D);
        this.f43153C.getSettings().setJavaScriptEnabled(true);
        AnonymousClass3fJ B2 = AnonymousClass3fJ.m20354B(this.f43152B);
        if (B2 != null) {
            if ((System.currentTimeMillis() < B2.f43143E ? 1 : null) != null) {
                String str = B2.f43142D;
                anonymousClass0Pt = new AnonymousClass0Pt(this.f43152B);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
                anonymousClass0Pt.f4229M = "odnoklassniki/reauthenticate/";
                AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass3fP.class).N().D("refresh_token", str).H();
                H.f2849B = new AnonymousClass3fL(this);
                O(H);
                AnonymousClass0cQ.C(this, -1911883361, B);
            }
        }
        anonymousClass0Pt = new AnonymousClass0Pt(this.f43152B);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "odnoklassniki/authorize/";
        AnonymousClass0GA H2 = anonymousClass0Pt.M(AnonymousClass3fR.class).H();
        H2.f2849B = new AnonymousClass3fN(this, this.f43153C, this.f43154D);
        O(H2);
        AnonymousClass0cQ.C(this, -1911883361, B);
    }
}
