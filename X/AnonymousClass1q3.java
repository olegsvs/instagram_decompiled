package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.facebook.browser.lite.DefaultBrowserLiteChrome;

/* renamed from: X.1q3 */
public final class AnonymousClass1q3 implements OnKeyListener {
    /* renamed from: B */
    public final /* synthetic */ DefaultBrowserLiteChrome f23239B;

    public AnonymousClass1q3(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.f23239B = defaultBrowserLiteChrome;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return (i == 82 && keyEvent.getAction() == 0) ? this.f23239B.mo2858C() : false;
    }
}
