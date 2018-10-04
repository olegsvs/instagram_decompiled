package X;

import android.webkit.DownloadListener;
import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.1pV */
public final class AnonymousClass1pV implements DownloadListener {
    /* renamed from: B */
    public final /* synthetic */ BrowserLiteFragment f23173B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1rN f23174C;

    public AnonymousClass1pV(BrowserLiteFragment browserLiteFragment, AnonymousClass1rN anonymousClass1rN) {
        this.f23173B = browserLiteFragment;
        this.f23174C = anonymousClass1rN;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        this.f23173B.m15487D(str);
        if (!str.equals(this.f23174C.getUrl())) {
            return;
        }
        if (this.f23174C.canGoBack()) {
            this.f23174C.goBack();
        } else if (this.f23173B.f30044l.size() > 1) {
            BrowserLiteFragment.m15493J(this.f23173B);
        } else {
            this.f23173B.m15514A();
        }
    }
}
