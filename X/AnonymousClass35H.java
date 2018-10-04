package X;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import com.instagram.business.payments.PaymentsWebViewActivity;

/* renamed from: X.35H */
public final class AnonymousClass35H implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ String f37667B;
    /* renamed from: C */
    public final /* synthetic */ WebView f37668C;

    public AnonymousClass35H(PaymentsWebViewActivity paymentsWebViewActivity, WebView webView, String str) {
        this.f37668C = webView;
        this.f37667B = str;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1363465264);
        PaymentsWebViewActivity.m21680B(this.f37668C, this.f37667B);
        AnonymousClass0cQ.L(this, 1333735160, M);
    }
}
