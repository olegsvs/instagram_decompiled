package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.webkit.WebView;
import com.instagram.business.payments.PaymentsWebViewActivity;

/* renamed from: X.35F */
public final class AnonymousClass35F implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ String f37663B;
    /* renamed from: C */
    public final /* synthetic */ WebView f37664C;

    public AnonymousClass35F(PaymentsWebViewActivity paymentsWebViewActivity, String str, WebView webView) {
        this.f37663B = str;
        this.f37664C = webView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (TextUtils.isEmpty(this.f37663B)) {
            dialogInterface.dismiss();
        } else {
            PaymentsWebViewActivity.m21680B(this.f37664C, this.f37663B);
        }
    }
}
