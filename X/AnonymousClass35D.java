package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.webkit.WebView;
import com.instagram.business.payments.PaymentsWebViewActivity;

/* renamed from: X.35D */
public final class AnonymousClass35D implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ String f37659B;
    /* renamed from: C */
    public final /* synthetic */ WebView f37660C;

    public AnonymousClass35D(PaymentsWebViewActivity paymentsWebViewActivity, String str, WebView webView) {
        this.f37659B = str;
        this.f37660C = webView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (TextUtils.isEmpty(this.f37659B)) {
            dialogInterface.dismiss();
        } else {
            PaymentsWebViewActivity.m21680B(this.f37660C, this.f37659B);
        }
    }
}
