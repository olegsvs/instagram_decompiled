package X;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import java.util.Collections;
import java.util.LinkedList;

/* renamed from: X.1qz */
public final class AnonymousClass1qz extends WebViewClient {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1r0 f23374B;

    public AnonymousClass1qz(AnonymousClass1r0 anonymousClass1r0) {
        this.f23374B = anonymousClass1r0;
    }

    public final void onPageFinished(WebView webView, String str) {
        AnonymousClass1r0 anonymousClass1r0 = this.f23374B;
        synchronized (anonymousClass1r0) {
            anonymousClass1r0.f23380F = false;
            if (!anonymousClass1r0.f23383I.isEmpty()) {
                AnonymousClass1qK anonymousClass1qK = anonymousClass1r0.f23376B;
                AnonymousClass1qK.m13397C(anonymousClass1qK, new AnonymousClass2PA(anonymousClass1qK, anonymousClass1r0.f23379E, anonymousClass1r0.f23383I));
                AnonymousClass1rD.m13482B("BrowserHtmlResourceExtractor", "Took %d ms to finish extract %d resource %s", Long.valueOf(System.currentTimeMillis() - anonymousClass1r0.f23381G), Integer.valueOf(anonymousClass1r0.f23383I.size()), anonymousClass1r0.f23379E);
            }
            anonymousClass1r0.f23379E = null;
            anonymousClass1r0.f23383I = Collections.synchronizedList(new LinkedList());
            PrefetchCacheEntry prefetchCacheEntry = (PrefetchCacheEntry) anonymousClass1r0.f23382H.pollFirst();
            if (prefetchCacheEntry != null) {
                anonymousClass1r0.m13439A(prefetchCacheEntry);
            }
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (this.f23374B.f23379E != null) {
            if (this.f23374B.f23379E.equals(str)) {
                return AnonymousClass1qB.m13390B(this.f23374B.f23378D);
            }
            if (AnonymousClass1r5.m13453K(str) && this.f23374B.f23383I.size() < 50) {
                this.f23374B.f23383I.add(str);
            }
        }
        return null;
    }
}
