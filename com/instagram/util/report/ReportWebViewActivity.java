package com.instagram.util.report;

import X.AnonymousClass0IL;
import X.AnonymousClass0IV;
import X.AnonymousClass1Th;
import X.AnonymousClass3o6;
import X.AnonymousClass3oB;
import X.AnonymousClass3oC;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;

public class ReportWebViewActivity extends BaseFragmentActivity {
    /* renamed from: B */
    public static Intent m20723B(Context context, String str, String str2, AnonymousClass3oB anonymousClass3oB, AnonymousClass3oC anonymousClass3oC) {
        Intent intent = new Intent(context, ReportWebViewActivity.class);
        intent.putExtra("IgSessionManager.USER_ID", str);
        intent.putExtra("extra_url", str2);
        intent.putExtra("extra_page", anonymousClass3oB.toString());
        intent.putExtra("extra_report_target", anonymousClass3oC.toString());
        return intent;
    }

    /* renamed from: T */
    public final void m20724T() {
        if (D().E(C0164R.id.layout_container_main) == null) {
            AnonymousClass0IL anonymousClass1Th = new AnonymousClass1Th();
            anonymousClass1Th.setArguments(getIntent().getExtras());
            AnonymousClass0IV B = D().B();
            B.M(C0164R.id.layout_container_main, anonymousClass1Th);
            B.F();
        }
    }

    public final void onBackPressed() {
        AnonymousClass1Th anonymousClass1Th = (AnonymousClass1Th) D().E(C0164R.id.layout_container_main);
        WebView webView = anonymousClass1Th.f18961J;
        boolean z = anonymousClass1Th.f18958G;
        if (webView.canGoBack() && z) {
            webView.goBack();
            return;
        }
        AnonymousClass3o6 anonymousClass3o6 = AnonymousClass3o6.f44699D;
        anonymousClass3o6.f44701C = null;
        anonymousClass3o6.f44700B = null;
        super.onBackPressed();
    }
}
