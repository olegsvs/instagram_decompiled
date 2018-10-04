package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;

/* renamed from: X.1po */
public final class AnonymousClass1po implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ Callback f23210B;
    /* renamed from: C */
    public final /* synthetic */ String f23211C;

    public AnonymousClass1po(BrowserLiteWebChromeClient browserLiteWebChromeClient, Callback callback, String str) {
        this.f23210B = callback;
        this.f23211C = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f23210B.invoke(this.f23211C, true, false);
    }
}
