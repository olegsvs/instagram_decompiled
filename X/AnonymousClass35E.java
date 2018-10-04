package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.webkit.WebView;
import com.instagram.business.payments.PaymentsWebViewActivity;

/* renamed from: X.35E */
public final class AnonymousClass35E implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ String f37661B;
    /* renamed from: C */
    public final /* synthetic */ WebView f37662C;

    public AnonymousClass35E(PaymentsWebViewActivity paymentsWebViewActivity, String str, WebView webView) {
        this.f37661B = str;
        this.f37662C = webView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (TextUtils.isEmpty(this.f37661B)) {
            dialogInterface.dismiss();
        } else {
            PaymentsWebViewActivity.m21680B(this.f37662C, this.f37661B);
        }
    }
}
