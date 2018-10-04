package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;

/* renamed from: X.1qM */
public final class AnonymousClass1qM implements OnKeyListener {
    /* renamed from: B */
    public final /* synthetic */ DefaultBrowserLiteChrome f23270B;

    public AnonymousClass1qM(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.f23270B = defaultBrowserLiteChrome;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return (i == 82 && keyEvent.getAction() == 0) ? DefaultBrowserLiteChrome.m15593C(this.f23270B) : false;
    }
}
