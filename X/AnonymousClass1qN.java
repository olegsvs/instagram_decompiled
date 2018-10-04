package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;

/* renamed from: X.1qN */
public final class AnonymousClass1qN implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ DefaultBrowserLiteChrome f23271B;

    public AnonymousClass1qN(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.f23271B = defaultBrowserLiteChrome;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -186133053);
        if (this.f23271B.f30189B == null) {
            AnonymousClass0cQ.L(this, 1130789444, M);
            return;
        }
        this.f23271B.f30189B.iE(1, true);
        AnonymousClass0cQ.L(this, 630973611, M);
    }
}
