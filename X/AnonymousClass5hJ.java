package X;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.instantexperiences.ui.InstantExperiencesWebViewContainerLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.Executors;

/* renamed from: X.5hJ */
public final class AnonymousClass5hJ {
    /* renamed from: B */
    public final AnonymousClass5cu f68199B;
    /* renamed from: C */
    public final Context f68200C;
    /* renamed from: D */
    public final AnonymousClass5cn f68201D;
    /* renamed from: E */
    public final AnonymousClass5gv f68202E;
    /* renamed from: F */
    public final IGInstantExperiencesParameters f68203F;
    /* renamed from: G */
    public final AnonymousClass6Cz f68204G;
    /* renamed from: H */
    public final AnonymousClass5hK f68205H;
    /* renamed from: I */
    public final AnonymousClass5dm f68206I;
    /* renamed from: J */
    public final AnonymousClass5dn f68207J;
    /* renamed from: K */
    public final List f68208K = Collections.synchronizedList(new ArrayList());
    /* renamed from: L */
    public final AnonymousClass5d5 f68209L;
    /* renamed from: M */
    public final List f68210M = Collections.synchronizedList(new ArrayList());
    /* renamed from: N */
    public final AnonymousClass0Cm f68211N;
    /* renamed from: O */
    private final InstantExperiencesWebViewContainerLayout f68212O;
    /* renamed from: P */
    private final AnonymousClass5db f68213P = new AnonymousClass6D2(this);
    /* renamed from: Q */
    private final AnonymousClass6D0 f68214Q = new AnonymousClass6D0(this);
    /* renamed from: R */
    private final AnonymousClass5dd f68215R = new AnonymousClass6D1(this);
    /* renamed from: S */
    private final Stack f68216S = new Stack();

    public AnonymousClass5hJ(Context context, AnonymousClass0Cm anonymousClass0Cm, InstantExperiencesWebViewContainerLayout instantExperiencesWebViewContainerLayout, AnonymousClass5dn anonymousClass5dn, AnonymousClass5cn anonymousClass5cn, AnonymousClass6Cz anonymousClass6Cz, IGInstantExperiencesParameters iGInstantExperiencesParameters, AnonymousClass5cu anonymousClass5cu, AnonymousClass5d5 anonymousClass5d5, ProgressBar progressBar) {
        this.f68205H = new AnonymousClass6D3(this, context, progressBar, this.f68214Q);
        this.f68211N = anonymousClass0Cm;
        this.f68204G = anonymousClass6Cz;
        this.f68207J = anonymousClass5dn;
        this.f68201D = anonymousClass5cn;
        this.f68212O = instantExperiencesWebViewContainerLayout;
        this.f68199B = anonymousClass5cu;
        this.f68200C = context;
        this.f68203F = iGInstantExperiencesParameters;
        this.f68209L = anonymousClass5d5;
        this.f68206I = new AnonymousClass5dm(Executors.newSingleThreadExecutor(), new AnonymousClass5hI(this));
        this.f68202E = new AnonymousClass5gv(iGInstantExperiencesParameters, this.f68206I);
        AnonymousClass5hJ.m28273C(this);
    }

    /* renamed from: A */
    public final AnonymousClass5dW m28274A() {
        return (AnonymousClass5dW) this.f68216S.peek();
    }

    /* renamed from: B */
    public static void m28272B(AnonymousClass5hJ anonymousClass5hJ) {
        if (anonymousClass5hJ.f68216S.size() > 1) {
            AnonymousClass5dW anonymousClass5dW = (AnonymousClass5dW) anonymousClass5hJ.f68216S.pop();
            anonymousClass5dW.setVisibility(8);
            anonymousClass5hJ.f68212O.removeView(anonymousClass5dW);
            if (anonymousClass5dW != null) {
                anonymousClass5dW.loadUrl(ReactWebViewManager.BLANK_URL);
                anonymousClass5dW.setTag(null);
                anonymousClass5dW.clearHistory();
                anonymousClass5dW.removeAllViews();
                if (VERSION.SDK_INT < 18) {
                    anonymousClass5dW.loadUrl(ReactWebViewManager.BLANK_URL);
                }
                anonymousClass5dW.onPause();
                anonymousClass5dW.destroy();
            }
            AnonymousClass5dW A = anonymousClass5hJ.m28274A();
            A.setVisibility(0);
            A.onResume();
            anonymousClass5hJ.f68212O.setWebView(A);
            AnonymousClass5dm anonymousClass5dm = anonymousClass5hJ.f68206I;
            AnonymousClass0GG.B(anonymousClass5dm.f67656E, new AnonymousClass5dg(anonymousClass5dm, A), 1124571357);
        }
    }

    /* renamed from: B */
    public final boolean m28275B() {
        AnonymousClass5dW A = m28274A();
        if (A != null) {
            if (A.canGoBack()) {
                A.goBack();
                return true;
            } else if (this.f68216S.size() > 1) {
                AnonymousClass5hJ.m28272B(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public static AnonymousClass5dW m28273C(AnonymousClass5hJ anonymousClass5hJ) {
        WebView anonymousClass5dW = new AnonymousClass5dW(anonymousClass5hJ.f68200C, null, 16842885, anonymousClass5hJ.f68207J);
        WebViewClient anonymousClass5de = new AnonymousClass5de(anonymousClass5dW, Executors.newSingleThreadExecutor());
        anonymousClass5de.f67640C = anonymousClass5hJ.f68206I;
        anonymousClass5dW.setWebViewClient(anonymousClass5de);
        anonymousClass5dW.addJavascriptInterface(new AnonymousClass5gq(new AnonymousClass5gp(anonymousClass5hJ.f68204G, anonymousClass5dW, anonymousClass5hJ.f68199B, anonymousClass5hJ.f68209L), anonymousClass5hJ.f68203F, anonymousClass5de), "_FBExtensions");
        StringBuilder stringBuilder = new StringBuilder(AnonymousClass0Nl.B());
        stringBuilder.append(" ");
        stringBuilder.append(AnonymousClass5hH.m28271B(anonymousClass5hJ.f68211N));
        String stringBuilder2 = stringBuilder.toString();
        if (VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(anonymousClass5dW, true);
        }
        WebSettings settings = anonymousClass5dW.getSettings();
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(5242880);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        stringBuilder = new StringBuilder(settings.getUserAgentString());
        stringBuilder.append(" ");
        stringBuilder.append(stringBuilder2);
        settings.setUserAgentString(stringBuilder.toString());
        anonymousClass5dW.setWebChromeClient(anonymousClass5hJ.f68205H);
        anonymousClass5de.f67643F.add(new AnonymousClass6D4(anonymousClass5hJ));
        AnonymousClass5gv anonymousClass5gv = anonymousClass5hJ.f68202E;
        if (anonymousClass5gv.f68156B == -1) {
            anonymousClass5gv.f68156B = System.currentTimeMillis();
        }
        anonymousClass5de.f67645H.add(new AnonymousClass6C4(new AnonymousClass6Cs(anonymousClass5gv)));
        AnonymousClass5dW anonymousClass5dW2 = !anonymousClass5hJ.f68216S.empty() ? (AnonymousClass5dW) anonymousClass5hJ.f68216S.peek() : null;
        if (anonymousClass5dW2 != null) {
            anonymousClass5dW2.getWebViewClient().f67644G.remove(anonymousClass5hJ.f68215R);
        }
        AnonymousClass5de webViewClient = anonymousClass5dW.getWebViewClient();
        webViewClient.f67644G.add(anonymousClass5hJ.f68215R);
        webViewClient.f67642E.add(anonymousClass5hJ.f68213P);
        anonymousClass5hJ.f68216S.push(anonymousClass5dW);
        anonymousClass5hJ.f68212O.setWebView(anonymousClass5dW);
        return anonymousClass5dW;
    }
}
