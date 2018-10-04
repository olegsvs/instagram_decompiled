package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1r0 */
public final class AnonymousClass1r0 {
    /* renamed from: L */
    public static AnonymousClass1r0 f23375L;
    /* renamed from: B */
    public AnonymousClass1qK f23376B;
    /* renamed from: C */
    public final Context f23377C;
    /* renamed from: D */
    public PrefetchCacheEntry f23378D;
    /* renamed from: E */
    public String f23379E;
    /* renamed from: F */
    public boolean f23380F = false;
    /* renamed from: G */
    public long f23381G;
    /* renamed from: H */
    public final LinkedList f23382H = new LinkedList();
    /* renamed from: I */
    public List f23383I;
    /* renamed from: J */
    public WebView f23384J;
    /* renamed from: K */
    private final Handler f23385K;

    public AnonymousClass1r0(Context context) {
        this.f23377C = context.getApplicationContext();
        this.f23385K = new Handler(Looper.getMainLooper());
        AnonymousClass1qK B = AnonymousClass1qK.m13396B();
        this.f23376B = B;
        B.f23264D = AnonymousClass2P3.m15569B();
        this.f23376B.m13399A(this.f23377C, false);
        this.f23383I = Collections.synchronizedList(new LinkedList());
    }

    /* renamed from: A */
    public final synchronized void m13439A(PrefetchCacheEntry prefetchCacheEntry) {
        if (!this.f23380F) {
            this.f23380F = true;
            AnonymousClass0OR.D(this.f23385K, new AnonymousClass1qy(this, prefetchCacheEntry), 1845532634);
        } else if (this.f23382H.size() < 10) {
            this.f23382H.addLast(prefetchCacheEntry);
        } else {
            String str = "BrowserHtmlResourceExtractor";
            String str2 = "Too many extract resource requests, dropping current one";
            Object[] objArr = new Object[0];
            if (AnonymousClass1rD.f23412B) {
                Log.w(str, AnonymousClass1rD.m13484D(str2, objArr));
            }
        }
    }

    /* renamed from: B */
    public static void m13437B() {
        AnonymousClass1r0 anonymousClass1r0 = f23375L;
        if (anonymousClass1r0 != null) {
            AnonymousClass1r0.m13438C(anonymousClass1r0);
        }
    }

    /* renamed from: C */
    private static synchronized void m13438C(AnonymousClass1r0 anonymousClass1r0) {
        synchronized (anonymousClass1r0) {
            if (anonymousClass1r0.f23384J != null) {
                if (anonymousClass1r0.f23380F || !anonymousClass1r0.f23382H.isEmpty()) {
                    AnonymousClass1rD.m13485E("BrowserHtmlResourceExtractor", "HtmlResourceExtractor is still working when browser opened, current url %s, in queue %d", anonymousClass1r0.f23379E, Integer.valueOf(anonymousClass1r0.f23382H.size()));
                }
                anonymousClass1r0.f23382H.clear();
                anonymousClass1r0.f23383I.clear();
                anonymousClass1r0.f23384J.destroy();
                anonymousClass1r0.f23384J = null;
            }
        }
    }
}
