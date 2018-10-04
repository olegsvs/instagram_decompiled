package X;

import android.content.Context;
import android.webkit.WebView;

/* renamed from: X.1v5 */
public final class AnonymousClass1v5 extends WebView {
    public AnonymousClass1v5(AnonymousClass1vA anonymousClass1vA, Context context) {
        super(context);
    }

    public final void onWindowFocusChanged(boolean z) {
        int N = AnonymousClass0cQ.N(this, -2060696786);
        try {
            super.onWindowFocusChanged(z);
        } catch (NullPointerException e) {
            AnonymousClass1v1.m13712B("WebDialog", e.toString());
        }
        AnonymousClass0cQ.O(this, -310633602, N);
    }
}
