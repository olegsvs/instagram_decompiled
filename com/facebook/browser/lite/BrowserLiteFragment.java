package com.facebook.browser.lite;

import X.AnonymousClass0Ca;
import X.AnonymousClass0OR;
import X.AnonymousClass1pO;
import X.AnonymousClass1pY;
import X.AnonymousClass1pZ;
import X.AnonymousClass1pa;
import X.AnonymousClass1pb;
import X.AnonymousClass1pc;
import X.AnonymousClass1pd;
import X.AnonymousClass1pe;
import X.AnonymousClass1pf;
import X.AnonymousClass1pg;
import X.AnonymousClass1pi;
import X.AnonymousClass1pj;
import X.AnonymousClass1pl;
import X.AnonymousClass1qK;
import X.AnonymousClass1qX;
import X.AnonymousClass1qb;
import X.AnonymousClass1qf;
import X.AnonymousClass1qh;
import X.AnonymousClass1ql;
import X.AnonymousClass1qm;
import X.AnonymousClass1qn;
import X.AnonymousClass1qs;
import X.AnonymousClass1qt;
import X.AnonymousClass1qu;
import X.AnonymousClass1r4;
import X.AnonymousClass1r5;
import X.AnonymousClass1r7;
import X.AnonymousClass1rA;
import X.AnonymousClass1rC;
import X.AnonymousClass1rD;
import X.AnonymousClass1rE;
import X.AnonymousClass1rG;
import X.AnonymousClass1rJ;
import X.AnonymousClass1rK;
import X.AnonymousClass1rN;
import X.AnonymousClass2P0;
import X.AnonymousClass2P3;
import X.AnonymousClass2P5;
import X.AnonymousClass2P7;
import X.AnonymousClass2P9;
import X.AnonymousClass2PF;
import X.AnonymousClass2PH;
import X.AnonymousClass2PI;
import X.AnonymousClass2PJ;
import X.AnonymousClass2PN;
import X.AnonymousClass2PX;
import X.AnonymousClass2PY;
import X.AnonymousClass2dD;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;
import com.facebook.browser.lite.extensions.watchandbrowse.BrowserLiteHeaderLoadingScreen;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.browser.lite.views.BrowserLiteGestureDelegateView;
import com.facebook.browser.lite.views.BrowserLiteWrapperView;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.webrtc.audio.WebRtcAudioRecord;

public class BrowserLiteFragment extends Fragment implements AnonymousClass1qm, AnonymousClass1qn, AnonymousClass1ql {
    public static final String[] CB = new String[]{"c_user", "xs", "fr", "datr"};
    public static final Pattern DB = Pattern.compile("(?i)^https://(.*)\\.facebook\\.com/(flx/warn|fblynx/warn|si/linkclick/warn)/(.*)");
    public static final String EB = "BrowserLiteFragment";
    private boolean AB = false;
    /* renamed from: B */
    public AnonymousClass1qb f30008B;
    private FrameLayout BB;
    /* renamed from: C */
    public AnonymousClass1pi f30009C;
    /* renamed from: D */
    public AnonymousClass1rE f30010D;
    /* renamed from: E */
    public BrowserLiteWrapperView f30011E;
    /* renamed from: F */
    public AnonymousClass2P3 f30012F;
    /* renamed from: G */
    public AnonymousClass1qK f30013G;
    /* renamed from: H */
    public Context f30014H;
    /* renamed from: I */
    public String f30015I;
    /* renamed from: J */
    public String f30016J;
    /* renamed from: K */
    public AnonymousClass1pj f30017K;
    /* renamed from: L */
    public boolean f30018L = false;
    /* renamed from: M */
    public int f30019M;
    /* renamed from: N */
    public boolean f30020N;
    /* renamed from: O */
    public List f30021O;
    /* renamed from: P */
    public List f30022P;
    /* renamed from: Q */
    public int f30023Q;
    /* renamed from: R */
    public Intent f30024R;
    /* renamed from: S */
    public final HashSet f30025S = new HashSet();
    /* renamed from: T */
    public boolean f30026T = false;
    /* renamed from: U */
    public boolean f30027U;
    /* renamed from: V */
    public BrowserLiteJSBridgeProxy f30028V;
    /* renamed from: W */
    public boolean f30029W;
    /* renamed from: X */
    public int f30030X = 0;
    /* renamed from: Y */
    public int f30031Y;
    /* renamed from: Z */
    public int f30032Z;
    /* renamed from: a */
    public ProgressDialog f30033a;
    /* renamed from: b */
    public volatile String f30034b;
    /* renamed from: c */
    public AnonymousClass1qs f30035c = new AnonymousClass1qs();
    /* renamed from: d */
    public View f30036d;
    /* renamed from: e */
    public int f30037e;
    /* renamed from: f */
    public int f30038f;
    /* renamed from: g */
    public boolean f30039g;
    /* renamed from: h */
    public int f30040h;
    /* renamed from: i */
    public Bundle f30041i;
    /* renamed from: j */
    public final Handler f30042j = new Handler(Looper.getMainLooper());
    /* renamed from: k */
    public String f30043k;
    /* renamed from: l */
    public final Stack f30044l = new Stack();
    /* renamed from: m */
    private boolean f30045m = false;
    /* renamed from: n */
    private View f30046n;
    /* renamed from: o */
    private View f30047o;
    /* renamed from: p */
    private AnonymousClass2PN f30048p;
    /* renamed from: q */
    private String f30049q;
    /* renamed from: r */
    private TextView f30050r;
    /* renamed from: s */
    private boolean f30051s = true;
    /* renamed from: t */
    private boolean f30052t = false;
    /* renamed from: u */
    private Uri f30053u;
    /* renamed from: v */
    private boolean f30054v;
    /* renamed from: w */
    private long f30055w = -1;
    /* renamed from: x */
    private AnonymousClass1rN f30056x;
    /* renamed from: y */
    private boolean f30057y = true;
    /* renamed from: z */
    private boolean f30058z = false;

    /* renamed from: A */
    public final void m15514A() {
        m15515B(false);
    }

    public final Uri AN() {
        return this.f30053u;
    }

    /* renamed from: B */
    public final void m15515B(boolean z) {
        for (AnonymousClass2dD anonymousClass2dD : this.f30021O) {
        }
        jE(null);
    }

    /* renamed from: B */
    public static boolean m15485B(Uri uri) {
        if (VERSION.SDK_INT < 19) {
            if (!AnonymousClass1r5.m13454L(uri)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public final int m15516C() {
        int i = 0;
        for (int i2 = 0; i2 < this.f30044l.size(); i2++) {
            i += ((AnonymousClass1rN) this.f30044l.get(i2)).getNonBlankNavigationDepthUpToCurrentIndex();
        }
        return i;
    }

    /* renamed from: C */
    public static final boolean m15486C(AnonymousClass1rN anonymousClass1rN, String str) {
        return !anonymousClass1rN.m13499A() && m15495L((WebView) anonymousClass1rN, str);
    }

    public final String CT() {
        return this.f30049q;
    }

    /* renamed from: D */
    public static java.util.Date m15487D(java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = ";";	 Catch:{ Exception -> 0x001a }
        r0 = r2.split(r0);	 Catch:{ Exception -> 0x001a }
        r2 = 1;	 Catch:{ Exception -> 0x001a }
        r1 = r0[r2];	 Catch:{ Exception -> 0x001a }
        r0 = "=";	 Catch:{ Exception -> 0x001a }
        r0 = r1.split(r0);	 Catch:{ Exception -> 0x001a }
        r1 = r0[r2];	 Catch:{ Exception -> 0x001a }
        r0 = m15500Q();	 Catch:{ Exception -> 0x001a }
        r0 = r0.parse(r1);	 Catch:{ Exception -> 0x001a }
        goto L_0x001b;	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        r0 = 0;
    L_0x001b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.D(java.lang.String):java.util.Date");
    }

    /* renamed from: D */
    public final boolean m15517D(java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r4 = EB;
        r2 = "handleInvalidProtocol %s";
        r3 = 1;
        r1 = new java.lang.Object[r3];
        r0 = 0;
        r1[r0] = r6;
        X.AnonymousClass1rD.m13482B(r4, r2, r1);
        r0 = r5.f30013G;
        r0 = r0.f23263C;
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r4 = r0.rU(r6);	 Catch:{ RemoteException -> 0x0018 }
        goto L_0x0019;	 Catch:{ RemoteException -> 0x0018 }
    L_0x0018:
        r4 = 0;
    L_0x0019:
        r0 = r5.f30022P;
        r2 = r0.iterator();
    L_0x001f:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0034;
    L_0x0025:
        r1 = r2.next();
        r1 = (X.AnonymousClass2dD) r1;
        r0 = r5.f30018L;
        r0 = r1.m16593B(r6, r4, r0);
        if (r0 == 0) goto L_0x001f;
    L_0x0033:
        return r3;
    L_0x0034:
        switch(r4) {
            case 1: goto L_0x0070;
            case 2: goto L_0x004e;
            case 3: goto L_0x0046;
            default: goto L_0x0037;
        };
    L_0x0037:
        r5.f30016J = r6;
        r0 = r5.f30014H;
        r3 = X.AnonymousClass1rA.m13475K(r0, r6);
        r0 = r5.f30022P;
        r2 = r0.iterator();
        goto L_0x0052;
    L_0x0046:
        r0 = 2131689493; // 0x7f0f0015 float:1.9008003E38 double:1.053194546E-314;
        m15494K(r5, r0);
        r3 = 0;
        goto L_0x0070;
    L_0x004e:
        r5.jE(r6);
        return r3;
    L_0x0052:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0068;
    L_0x0058:
        r0 = r2.next();
        r0 = (X.AnonymousClass2dD) r0;
        r1 = r5.f30018L;
        r0 = r0.f31750Q;
        if (r0 == 0) goto L_0x0067;
    L_0x0064:
        r0.onTryStartExternalActivityForUntrustedUrl(r6, r3, r1);
    L_0x0067:
        goto L_0x0052;
    L_0x0068:
        if (r3 != 0) goto L_0x0070;
    L_0x006a:
        r0 = 2131689493; // 0x7f0f0015 float:1.9008003E38 double:1.053194546E-314;
        m15494K(r5, r0);
    L_0x0070:
        r0 = r5.f30018L;
        if (r0 != 0) goto L_0x0033;
    L_0x0074:
        r5.m15514A();
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.D(java.lang.String):boolean");
    }

    /* renamed from: E */
    public static int m15488E(Set set) {
        if (set != null) {
            if (!set.isEmpty()) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    String[] strArr = CB;
                    if (i >= strArr.length) {
                        return i2;
                    }
                    if (!set.contains(strArr[i])) {
                        i2 |= 1 << i;
                    }
                    i++;
                }
            }
        }
        return 15;
    }

    /* renamed from: E */
    public final boolean m15518E(String str) {
        Intent intent = this.f30024R;
        if (intent != null) {
            String str2 = "OAUTH_REDIRECT_URI";
            if (intent.hasExtra(str2)) {
                Uri parse = Uri.parse(this.f30024R.getStringExtra(str2));
                Uri parse2 = Uri.parse(str);
                if (parse.getHost().equals(parse2.getHost()) && parse.getPort() == parse2.getPort()) {
                    Intent intent2 = this.f30024R;
                    boolean z = false;
                    if (intent2 != null && intent2.getBooleanExtra("OAUTH_STRICT_URI_MATCHING", false)) {
                        z = true;
                    }
                    if (!z || m15504U(parse, parse2)) {
                        jE(str);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: F */
    public static int m15489F(ArrayList arrayList) {
        int i = 0;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i < size) {
                    Bundle bundle = (Bundle) arrayList.get(i);
                    if (bundle != null) {
                        if (!bundle.isEmpty()) {
                            if (m15503T(bundle.getString("KEY_URL"))) {
                                i2 += bundle.getStringArrayList("KEY_STRING_ARRAY").size();
                            }
                        }
                    }
                    i++;
                }
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: F */
    public final boolean m15519F(WebView webView) {
        return IT() == webView;
    }

    /* renamed from: G */
    public static BrowserLiteWebChromeClient m15490G(AnonymousClass1rN anonymousClass1rN) {
        if (anonymousClass1rN != null) {
            AnonymousClass1rJ browserLiteWebChromeClient = anonymousClass1rN.getBrowserLiteWebChromeClient();
            if (browserLiteWebChromeClient instanceof BrowserLiteWebChromeClient) {
                return (BrowserLiteWebChromeClient) browserLiteWebChromeClient;
            }
        }
        return null;
    }

    /* renamed from: G */
    public final void m15520G(AnonymousClass1rN anonymousClass1rN, Uri uri, Map map, String str) {
        AnonymousClass1rN anonymousClass1rN2 = anonymousClass1rN;
        if (this.f30055w < 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f30055w = currentTimeMillis;
            anonymousClass1rN.setLandingPageLoadStartTime(currentTimeMillis);
        }
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(str)) {
            String A;
            if (uri == this.f30053u) {
                A = this.f30012F.m15570A();
                if (!TextUtils.isEmpty(A)) {
                    if (!uri2.equals(A)) {
                        AnonymousClass1rD.m13485E(EB, "Prefetch resolved final url %s -> %s", uri2, A);
                    }
                    for (AnonymousClass2dD anonymousClass2dD : this.f30022P) {
                    }
                    AnonymousClass1qt.m13430B().m13432B("BLF.loadExternalUrl.Start");
                    if (map != null || map.isEmpty()) {
                        anonymousClass1rN.loadUrl(A);
                    } else if (this.f30057y && VERSION.SDK_INT == 19) {
                        anonymousClass1rN2.loadDataWithBaseURL(AnonymousClass1r4.f23396C, AnonymousClass1r7.m13462G(A), ReactWebViewManager.HTML_MIME_TYPE, "UTF-8", null);
                    } else {
                        anonymousClass1rN.loadUrl(A, map);
                    }
                    AnonymousClass1qt.m13430B().m13432B("BLF.loadExternalUrl.End");
                    return;
                }
            }
            A = uri2;
            for (AnonymousClass2dD anonymousClass2dD2 : this.f30022P) {
            }
            AnonymousClass1qt.m13430B().m13432B("BLF.loadExternalUrl.Start");
            if (map != null) {
            }
            anonymousClass1rN.loadUrl(A);
            AnonymousClass1qt.m13430B().m13432B("BLF.loadExternalUrl.End");
            return;
        }
        try {
            anonymousClass1rN.postUrl(uri2, str.getBytes("UTF-8"));
        } catch (Throwable e) {
            AnonymousClass1rD.m13483C(EB, e, "Failed postUrl", new Object[0]);
        }
    }

    /* renamed from: H */
    public static AnonymousClass2P0 m15491H(AnonymousClass1rN anonymousClass1rN) {
        if (anonymousClass1rN != null) {
            AnonymousClass1rK browserLiteWebViewClient = anonymousClass1rN.getBrowserLiteWebViewClient();
            if (browserLiteWebViewClient instanceof AnonymousClass2P0) {
                return (AnonymousClass2P0) browserLiteWebViewClient;
            }
        }
        return null;
    }

    /* renamed from: H */
    public final boolean m15521H(AnonymousClass1rN anonymousClass1rN, String str) {
        if (!m15486C(anonymousClass1rN, str)) {
            return false;
        }
        m15493J(this);
        return true;
    }

    public final View HJ() {
        return this.f30047o;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: I */
    public static void m15492I(com.facebook.browser.lite.BrowserLiteFragment r7, boolean r8) {
        /*
        r1 = r7.f30034b;
        r0 = "NONE";
        r0 = r1.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r6 = r7.f30013G;
        r5 = r7.f30035c;
        r4 = r5.f23363C;
        monitor-enter(r4);
        r3 = new android.os.Bundle;	 Catch:{ all -> 0x004f }
        r3.<init>();	 Catch:{ all -> 0x004f }
        r2 = "resource_counts";
        r1 = r5.f23362B;	 Catch:{ all -> 0x004f }
        r0 = new X.1t6;	 Catch:{ all -> 0x004f }
        r0.<init>(r1);	 Catch:{ all -> 0x004f }
        r3.putSerializable(r2, r0);	 Catch:{ all -> 0x004f }
        r2 = "resource_domains";
        r1 = r5.f23363C;	 Catch:{ all -> 0x004f }
        r0 = new X.1t7;	 Catch:{ all -> 0x004f }
        r0.<init>(r1);	 Catch:{ all -> 0x004f }
        r3.putSerializable(r2, r0);	 Catch:{ all -> 0x004f }
        monitor-exit(r4);	 Catch:{ all -> 0x004f }
        r0 = new X.2PD;
        r0.<init>(r6, r3);
        X.AnonymousClass1qK.m13397C(r6, r0);
        r2 = r7.f30035c;
        r1 = r2.f23363C;
        monitor-enter(r1);
        r0 = r2.f23362B;	 Catch:{ all -> 0x0052 }
        r0.clear();	 Catch:{ all -> 0x0052 }
        r0 = r2.f23363C;	 Catch:{ all -> 0x0052 }
        r0.clear();	 Catch:{ all -> 0x0052 }
        monitor-exit(r1);	 Catch:{ all -> 0x0052 }
        if (r8 == 0) goto L_0x000a;
    L_0x004a:
        r0 = "NONE";
        r7.f30034b = r0;
        goto L_0x000a;
    L_0x004f:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x004f }
    L_0x0051:
        throw r0;
    L_0x0052:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0052 }
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.I(com.facebook.browser.lite.BrowserLiteFragment, boolean):void");
    }

    /* renamed from: I */
    public final boolean m15522I(int i) {
        AnonymousClass1rN IT = IT();
        boolean z = false;
        if (IT != null) {
            BrowserLiteWebChromeClient G = m15490G(IT);
            if (G != null && G.m15535C()) {
                return true;
            }
            int P = m15499P(i);
            if (P < 0) {
                IT.goBackOrForward(P);
                return true;
            } else if (this.f30044l.size() > 1) {
                m15493J(this);
                if (P == 0 || m15522I(P)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final AnonymousClass1rN IT() {
        return this.f30044l.isEmpty() ? null : (AnonymousClass1rN) this.f30044l.peek();
    }

    public final void IUA(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        m15506W(sslErrorHandler);
        AnonymousClass1rE anonymousClass1rE = this.f30010D;
    }

    /* renamed from: J */
    public static void m15493J(BrowserLiteFragment browserLiteFragment) {
        if (browserLiteFragment.f30044l.isEmpty()) {
            browserLiteFragment.m15514A();
            return;
        }
        AnonymousClass1rN anonymousClass1rN = (AnonymousClass1rN) browserLiteFragment.f30044l.pop();
        anonymousClass1rN.setVisibility(8);
        browserLiteFragment.BB.removeView(anonymousClass1rN);
        for (AnonymousClass2dD anonymousClass2dD : browserLiteFragment.f30022P) {
        }
        m15498O(anonymousClass1rN);
        AnonymousClass1rN IT = browserLiteFragment.IT();
        if (IT == null) {
            browserLiteFragment.m15514A();
        } else {
            IT.setVisibility(0);
            IT.onResume();
            m15512c(browserLiteFragment, IT);
        }
    }

    /* renamed from: J */
    public final boolean m15523J(WebView webView, boolean z, Message message) {
        if (!m15519F(webView) || !z) {
            return false;
        }
        ((WebViewTransport) message.obj).setWebView(m15528O());
        message.sendToTarget();
        return true;
    }

    /* renamed from: K */
    public static void m15494K(BrowserLiteFragment browserLiteFragment, int i) {
        CharSequence string = browserLiteFragment.getResources().getString(i);
        Toast.makeText(browserLiteFragment.f30014H.getApplicationContext(), string, string.length() > 60 ? 1 : 0).show();
    }

    /* renamed from: K */
    public final boolean m15524K(boolean z) {
        this.f30030X = 2;
        if (this.f30029W) {
            AnonymousClass1rE anonymousClass1rE = this.f30010D;
        }
        List<AnonymousClass2dD> list = this.f30021O;
        if (list != null) {
            for (AnonymousClass2dD anonymousClass2dD : list) {
            }
        }
        boolean Y = m15508Y();
        if (Y && z) {
            this.f30031Y++;
        }
        return Y;
    }

    public final Intent KN() {
        Intent intent = this.f30024R;
        if (intent != null) {
            return intent;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!arguments.isEmpty()) {
                return (Intent) arguments.getParcelable("BrowserLiteIntent.ACTIVITY_INTENT");
            }
        }
        return getActivity().getIntent();
    }

    /* renamed from: L */
    public final boolean m15525L(int i, KeyEvent keyEvent) {
        if (i == 82) {
            i = this.f30008B;
            if (i != 0) {
                AnonymousClass1pO anonymousClass1pO = i.f23310D;
                boolean z = false;
                if (anonymousClass1pO != null) {
                    z = 0 | anonymousClass1pO.mo2857B();
                }
                anonymousClass1pO = i.f23311E;
                if (anonymousClass1pO != null) {
                    z |= anonymousClass1pO.mo2857B();
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: L */
    public static boolean m15495L(WebView webView, String str) {
        webView = webView.getUrl();
        if (!(webView == null || ReactWebViewManager.BLANK_URL.equals(webView))) {
            if (!webView.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    public final void m15526M(Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_ACTION");
        if (stringExtra != null) {
            for (AnonymousClass2dD anonymousClass2dD : this.f30021O) {
            }
            Object obj = -1;
            switch (stringExtra.hashCode()) {
                case -2074076840:
                    if (stringExtra.equals("ACTION_CLOSE_BROWSER")) {
                        obj = 4;
                        break;
                    }
                    break;
                case 36417203:
                    if (stringExtra.equals("ACTION_SAVE_LINK")) {
                        obj = 8;
                        break;
                    }
                    break;
                case 375695139:
                    if (stringExtra.equals("ACTION_SHOW_OFFER_AUTO_SAVE_NUX")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 440638271:
                    if (stringExtra.equals("ACTION_REPORT_RESULT")) {
                        obj = 7;
                        break;
                    }
                    break;
                case 744788469:
                    if (stringExtra.equals("ACTION_SHOW_QUOTE_SHARE_NUX")) {
                        obj = null;
                        break;
                    }
                    break;
                case 1126883864:
                    if (stringExtra.equals("ACTION_CONFIRM_EXTENSION_ADDED")) {
                        obj = 6;
                        break;
                    }
                    break;
                case 1505276866:
                    if (stringExtra.equals("ACTION_REFRESH_TOP_WEBVIEW")) {
                        obj = 3;
                        break;
                    }
                    break;
                case 1776594544:
                    if (stringExtra.equals("ACTION_COMPLETE_WEB_SHARE_DIALOG")) {
                        obj = 2;
                        break;
                    }
                    break;
                case 2093777120:
                    if (stringExtra.equals("ACTION_REPORT_START")) {
                        obj = 5;
                        break;
                    }
                    break;
                default:
                    break;
            }
            switch (obj) {
                case null:
                    AnonymousClass0OR.D(this.f30042j, new AnonymousClass1pe(this), -1813990415);
                    return;
                case 1:
                    AnonymousClass0OR.D(this.f30042j, new AnonymousClass1pf(this), -1205797351);
                    return;
                case 2:
                    m15496M(this, intent.getStringExtra("BrowserLiteIntent.EXTRA_JS_TO_EXECUTE"), intent.getStringExtra("BrowserLiteIntent.EXTRA_REFERER"));
                    return;
                case 3:
                    AnonymousClass0OR.D(this.f30042j, new AnonymousClass1pZ(this), -85950286);
                    return;
                case 4:
                    AnonymousClass0OR.D(this.f30042j, new AnonymousClass1pd(this), -185954577);
                    return;
                case 5:
                    AnonymousClass0OR.D(this.f30042j, new AnonymousClass1pa(this), 1681774663);
                    return;
                case 6:
                    AnonymousClass1qb anonymousClass1qb = this.f30008B;
                    if (anonymousClass1qb != null && (anonymousClass1qb.m13421A() instanceof MessengerLiteChrome)) {
                        ((Activity) this.f30008B.m13421A().getContext()).runOnUiThread(new AnonymousClass1pY(this));
                        return;
                    }
                    return;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    if (intent.hasExtra("EXTRA_REPORT_SUCCEED")) {
                        AnonymousClass0OR.D(this.f30042j, new AnonymousClass1pb(this, intent.getBooleanExtra("EXTRA_REPORT_SUCCEED", false)), 555233161);
                        return;
                    }
                    return;
                case 8:
                    if (intent.hasExtra("EXTRA_SAVE_LINK_SUCCEED")) {
                        intent.getBooleanExtra("EXTRA_SAVE_LINK_SUCCEED", false);
                        stringExtra = intent.getStringExtra("EXTRA_SAVE_COLLECTION_NAME");
                        AnonymousClass2PY anonymousClass2PY = new AnonymousClass2PY();
                        AnonymousClass1pc anonymousClass1pc = new AnonymousClass1pc(this);
                        Resources resources = getResources();
                        if (stringExtra == null) {
                            resources.getString(C0164R.string.__external__browser_save_confirmation);
                            resources.getString(C0164R.string.__external__browser_add_to_collection_hint);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(resources.getString(C0164R.string.__external__browser_add_to_collection_confirmation));
                            stringBuilder.append(" \"");
                            stringBuilder.append(stringExtra);
                            stringBuilder.append("\"");
                            stringBuilder.toString();
                            resources.getString(C0164R.string.__external__browser_change_collection_hint);
                        }
                        getView();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: M */
    private static void m15496M(BrowserLiteFragment browserLiteFragment, String str, String str2) {
        AnonymousClass1rN IT = browserLiteFragment.IT();
        if (IT != null) {
            if (str2 != null) {
                if (browserLiteFragment.KN().getBooleanExtra("BrowserLiteIntent.EXTRA_EXECUTE_WEB_SHARE_JS", true)) {
                    IT.post(new AnonymousClass1pg(browserLiteFragment, str2, IT, str));
                }
            }
        }
    }

    public final void MSA(int i) {
        if (IT() != null) {
            BrowserLiteWebChromeClient G = m15490G(IT());
            if (G != null) {
                G.f30062D.setVisibility(i);
            }
        }
    }

    /* renamed from: N */
    private static X.AnonymousClass1rN m15497N(com.facebook.browser.lite.BrowserLiteFragment r17) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = X.AnonymousClass1qt.m13430B();
        r0 = "BLF.createWebView.Start";
        r1.m13432B(r0);
        r2 = new X.1rN;
        r3 = r17;
        r4 = r3.f30014H;
        r1 = 0;
        r0 = 16842885; // 0x1010085 float:2.369393E-38 double:8.321491E-317;
        r2.<init>(r4, r1, r0);
        r1 = X.AnonymousClass1qt.m13430B();
        r0 = "BLF.createWebView.inflate_end";
        r1.m13432B(r0);
        r0 = new X.2Oy;
        r0.<init>(r3);
        r2.setBrowserLiteWebViewEventListener(r0);
        r0 = r3.f30024R;
        r7 = r0.getExtras();
        r1 = new android.widget.FrameLayout$LayoutParams;
        r0 = -1;
        r1.<init>(r0, r0);
        r2.setLayoutParams(r1);
        r1 = 1;
        r2.setFocusable(r1);
        r2.setFocusableInTouchMode(r1);
        r2.setScrollbarFadingEnabled(r1);
        r0 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r2.setScrollBarStyle(r0);
        r0 = new X.1pV;
        r0.<init>(r3, r2);
        r2.setDownloadListener(r0);
        r0 = r3.f30024R;
        r4 = "BrowserLiteIntent.EXTRA_INITIAL_SCALE";
        r0 = r0.hasExtra(r4);
        r6 = 0;
        if (r0 == 0) goto L_0x0061;
    L_0x0058:
        r0 = r3.f30024R;
        r0 = r0.getIntExtra(r4, r6);
        r2.setInitialScale(r0);
    L_0x0061:
        r0 = r2.getSettings();
        X.AnonymousClass08u.B(r0);
        r0.setSaveFormData(r6);
        r0.setSavePassword(r6);
        r0.setSupportZoom(r1);
        r0.setBuiltInZoomControls(r1);
        r0.setSupportMultipleWindows(r1);
        r0.setDisplayZoomControls(r6);
        r5 = r3.f30024R;
        r4 = "BrowserLiteIntent.EXTRA_USE_WIDE_VIEW_PORT";
        r4 = r5.getBooleanExtra(r4, r1);
        r0.setUseWideViewPort(r4);
        r0.setLoadWithOverviewMode(r1);
        if (r7 == 0) goto L_0x0095;
    L_0x008a:
        r4 = "BrowserLiteIntent.EXTRA_LAME_DUCK_MODE";
        r4 = r7.getBoolean(r4, r6);
        if (r4 == 0) goto L_0x0095;
    L_0x0092:
        r0.setBlockNetworkLoads(r1);
    L_0x0095:
        r0.setJavaScriptEnabled(r1);	 Catch:{ NullPointerException -> 0x0098 }
    L_0x0098:
        r5 = r3.f30024R;
        r4 = "BrowserLiteIntent.EXTRA_UA";
        r6 = r5.getStringExtra(r4);
        r4 = android.text.TextUtils.isEmpty(r6);
        if (r4 != 0) goto L_0x00be;
    L_0x00a6:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r4 = r0.getUserAgentString();
        r5.append(r4);
        r5.append(r6);
        r4 = r5.toString();
        r3.f30043k = r4;
        r0.setUserAgentString(r4);
    L_0x00be:
        r7 = new X.2P0;
        r8 = r3.f30008B;
        r9 = r3.f30048p;
        r10 = r3.f30013G;
        r12 = r3.f30012F;
        r13 = r3.f30014H;
        r14 = r3.f30045m;
        r15 = r3.f30024R;
        r5 = r3.f30039g;
        r4 = r3.f30042j;
        r11 = r3;
        r6 = 0;
        r17 = r4;
        r16 = r5;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
        r2.setWebViewClient(r7);
        r8 = new com.facebook.browser.lite.BrowserLiteWebChromeClient;
        r7 = r3.f30048p;
        r5 = r3.f30024R;
        r4 = "BrowserLiteIntent.EXTRA_THEME";
        r12 = r5.getStringExtra(r4);
        r5 = r3.f30024R;
        r4 = "BrowserLiteIntent.EXTRA_UPDATE_ADDRESS_ON_PROGRESS";
        r13 = r5.getBooleanExtra(r4, r1);
        r5 = r3.f30024R;
        r4 = "BrowserLiteIntent.EXTRA_THIRD_PARTY_CAMERA_ACCESS";
        r14 = r5.getBooleanExtra(r4, r6);
        r10 = r3;
        r11 = r7;
        r9 = r2;
        r8.<init>(r9, r10, r11, r12, r13, r14);
        r2.setWebChromeClient(r8);
        r4 = new X.2Oz;
        r4.<init>(r3);
        r2.setOnPageInteractiveListener(r4);
        r7 = new X.1py;
        r7.<init>();
        r5 = new X.1pk;
        r5.<init>(r3);
        if (r5 == 0) goto L_0x011c;
    L_0x0117:
        r4 = r7.f23232B;
        r4.add(r5);
    L_0x011c:
        r5 = new X.1ph;
        r5.<init>(r3);
        if (r5 == 0) goto L_0x0128;
    L_0x0123:
        r4 = r7.f23232B;
        r4.add(r5);
    L_0x0128:
        r5 = r3.f30024R;
        r4 = "extra_enable_swipe_down_to_dismiss";
        r4 = r5.getBooleanExtra(r4, r6);
        if (r4 == 0) goto L_0x013e;
    L_0x0132:
        r5 = new X.1VZ;
        r5.<init>(r3);
        if (r5 == 0) goto L_0x013e;
    L_0x0139:
        r4 = r7.f23232B;
        r4.add(r5);
    L_0x013e:
        r2.setOnTouchListener(r7);
        r2.setHapticFeedbackEnabled(r6);
        r2.clearSslPreferences();
        r0.setAppCacheEnabled(r1);
        r4 = 5242880; // 0x500000 float:7.34684E-39 double:2.590327E-317;
        r0.setAppCacheMaxSize(r4);
        r0.setDatabaseEnabled(r1);
        r0.setDomStorageEnabled(r1);
        r5 = android.os.Build.VERSION.SDK_INT;
        r4 = 19;
        if (r5 < r4) goto L_0x0161;
    L_0x015c:
        r4 = r3.f30054v;
        X.AnonymousClass1rN.setWebContentsDebuggingEnabled(r4);
    L_0x0161:
        r7 = android.os.Build.VERSION.SDK_INT;
        r4 = 21;
        r5 = 2;
        if (r7 < r4) goto L_0x0188;
    L_0x0168:
        r4 = r3.f30014H;
        android.webkit.CookieSyncManager.createInstance(r4);
        r7 = android.webkit.CookieManager.getInstance();
        if (r7 == 0) goto L_0x0177;
    L_0x0173:
        r4 = 1;
        r7.setAcceptThirdPartyCookies(r2, r4);
    L_0x0177:
        r7 = r3.f30024R;
        r4 = "BrowserLiteIntent.EXTRA_MIXED_CONTENT_COMPATABILITY_MODE";
        r4 = r7.getBooleanExtra(r4, r6);
        if (r4 == 0) goto L_0x0185;
    L_0x0181:
        r0.setMixedContentMode(r5);
        goto L_0x0188;
    L_0x0185:
        r0.setMixedContentMode(r1);
    L_0x0188:
        r1 = r3.f30028V;
        if (r1 == 0) goto L_0x0191;
    L_0x018c:
        r0 = r1.f23248B;
        r2.addJavascriptInterface(r1, r0);
    L_0x0191:
        r1 = X.AnonymousClass1qt.m13430B();
        r0 = "BLF.createWebView.injectSessionCookies_start";
        r1.m13432B(r0);
        r3.m15502S();
        r1 = X.AnonymousClass1qt.m13430B();
        r0 = "BLF.createWebView.injectSessionCookies_end";
        r1.m13432B(r0);
        r3.m15507X();
        r4 = r3.f30024R;
        r1 = "BrowserLiteIntent.EXTRA_WEBVIEW_LAYTER_TYPE";
        r0 = -1;
        r1 = r4.getIntExtra(r1, r0);
        if (r1 < 0) goto L_0x01ba;
    L_0x01b4:
        if (r1 > r5) goto L_0x01ba;
    L_0x01b6:
        r0 = 0;
        r2.setLayerType(r1, r0);
    L_0x01ba:
        r0 = r3.f30022P;
        r7 = r0.iterator();
    L_0x01c0:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x021a;
    L_0x01c6:
        r5 = r7.next();
        r5 = (X.AnonymousClass2dD) r5;
        r0 = r5.f23359D;
        r6 = r0.getExtras();
        if (r6 == 0) goto L_0x0201;
    L_0x01d4:
        r1 = "watch_and_browse_is_in_watch_and_browse";
        r0 = 0;
        r0 = r6.getBoolean(r1, r0);
        if (r0 == 0) goto L_0x0201;
    L_0x01dd:
        r0 = "watch_and_browse_browser_height";
        r0 = r6.containsKey(r0);
        if (r0 == 0) goto L_0x0201;
    L_0x01e5:
        r0 = "watch_and_browse_browser_height";
        r4 = -1;
        r0 = r6.getInt(r0, r4);
        r1 = new android.widget.FrameLayout$LayoutParams;
        r1.<init>(r4, r0);
        r0 = r5.f31746M;
        if (r0 == 0) goto L_0x01fa;
    L_0x01f5:
        r0 = r0.getTranslationY();
        goto L_0x01fb;
    L_0x01fa:
        r0 = 0;
    L_0x01fb:
        r2.setTranslationY(r0);
        r2.setLayoutParams(r1);
    L_0x0201:
        r0 = X.AnonymousClass2dD.m16591F(r5);
        if (r0 != 0) goto L_0x020d;
    L_0x0207:
        r0 = X.AnonymousClass2dD.m16590E(r5);
        if (r0 == 0) goto L_0x0219;
    L_0x020d:
        r1 = new X.1qk;
        r0 = r5.f31752S;
        r1.<init>(r0, r2);
        r0 = "WatchAndInstall";
        r2.addJavascriptInterface(r1, r0);
    L_0x0219:
        goto L_0x01c0;
    L_0x021a:
        r0 = r3.BB;
        r0.addView(r2);
        r1 = X.AnonymousClass1qt.m13430B();
        r0 = "BLF.createWebView.End";
        r1.m13432B(r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.N(com.facebook.browser.lite.BrowserLiteFragment):X.1rN");
    }

    /* renamed from: N */
    public final void m15527N(int i) {
        AnonymousClass2PX.mo2918B().mo2918B();
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = this.f30028V;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.m13389A(null);
        }
        this.f30030X = i;
        this.f30026T = true;
    }

    /* renamed from: O */
    public final AnonymousClass1rN m15528O() {
        AnonymousClass1rN IT = IT();
        this.f30056x = IT;
        if (IT != null) {
            IT.onPause();
            this.f30056x.setVisibility(8);
        }
        View N = m15497N(this);
        for (AnonymousClass2dD anonymousClass2dD : this.f30022P) {
            if (this.f30056x == null && anonymousClass2dD.f23359D.getExtras().getBoolean("watch_and_browse_is_in_watch_and_browse") && anonymousClass2dD.f31738E) {
                AnonymousClass1qX.m13419D(N, new ColorDrawable(-16777216));
                if (anonymousClass2dD.f31735B != null) {
                    anonymousClass2dD.f23358C.zC(8);
                    anonymousClass2dD.f31735B.setVisibility(0);
                }
                AnonymousClass1qh anonymousClass1qh = anonymousClass2dD.f31749P;
                if (anonymousClass1qh != null) {
                    anonymousClass1qh.onPageStartedListener();
                }
            }
        }
        this.f30044l.push(N);
        m15512c(this, N);
        return N;
    }

    /* renamed from: O */
    private static void m15498O(WebView webView) {
        if (webView != null) {
            webView.loadUrl(ReactWebViewManager.BLANK_URL);
            webView.setTag(null);
            webView.clearHistory();
            webView.removeAllViews();
            if (VERSION.SDK_INT < 18) {
                webView.clearView();
            }
            webView.onPause();
            webView.destroy();
        }
    }

    /* renamed from: P */
    private int m15499P(int i) {
        AnonymousClass1rN IT = IT();
        int i2 = 0;
        if (IT == null) {
            return 0;
        }
        if (!IT.canGoBack()) {
            return i - 1;
        }
        WebBackForwardList copyBackForwardList = IT.copyBackForwardList();
        int currentIndex = copyBackForwardList.getCurrentIndex();
        for (int i3 = currentIndex - 1; i3 > -1; i3--) {
            String url = copyBackForwardList.getItemAtIndex(i3).getUrl();
            if (url != null) {
                if (AnonymousClass1r5.m13450H(Uri.parse(url))) {
                    i2++;
                    if (i2 == i) {
                        return i3 - currentIndex;
                    }
                }
            }
        }
        return i - copyBackForwardList.getSize();
    }

    /* renamed from: P */
    public final void m15529P(WebView webView) {
        WebHistoryItem currentItem = webView.copyBackForwardList().getCurrentItem();
        if (currentItem == null || !AnonymousClass1r5.m13450H(Uri.parse(currentItem.getUrl()))) {
            m15522I(1);
        }
    }

    public final boolean PX() {
        AnonymousClass1rE anonymousClass1rE = this.f30010D;
        return anonymousClass1rE != null && anonymousClass1rE.getVisibility() == 0;
    }

    public final boolean PY() {
        AnonymousClass1rN IT = IT();
        if (IT == null) {
            return false;
        }
        return IT.f23450D;
    }

    /* renamed from: Q */
    private static SimpleDateFormat m15500Q() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StdDateFormat.DATE_FORMAT_STR_RFC1123, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: Q */
    public final void m15530Q(String str) {
        this.f30049q = str;
        AnonymousClass1qb anonymousClass1qb = this.f30008B;
        if (anonymousClass1qb != null) {
            AnonymousClass1pO anonymousClass1pO = anonymousClass1qb.f23310D;
            if (anonymousClass1pO != null) {
                anonymousClass1pO.setTitle(str);
            }
            anonymousClass1pO = anonymousClass1qb.f23311E;
            if (anonymousClass1pO != null) {
                anonymousClass1pO.setTitle(str);
            }
        }
        for (AnonymousClass2dD anonymousClass2dD : this.f30021O) {
            BrowserLiteHeaderLoadingScreen browserLiteHeaderLoadingScreen = anonymousClass2dD.f31735B;
            if (browserLiteHeaderLoadingScreen != null) {
                browserLiteHeaderLoadingScreen.setTitleText(str);
            }
        }
    }

    public final void QRA(ViewStub viewStub, String str) {
        AnonymousClass1qb anonymousClass1qb = this.f30008B;
        if (AnonymousClass1qb.f23306H.equals(str)) {
            anonymousClass1qb.f23311E = (MessengerLiteChrome) viewStub.inflate();
        } else if (AnonymousClass1qb.f23307I.equals(str)) {
            WatchAndBrowseChrome watchAndBrowseChrome = (WatchAndBrowseChrome) viewStub.inflate();
            anonymousClass1qb.f23311E = watchAndBrowseChrome;
            watchAndBrowseChrome.setBackground(new ColorDrawable(-16777216));
        } else {
            anonymousClass1qb.f23311E = (DefaultBrowserLiteChrome) viewStub.inflate();
        }
        anonymousClass1qb.f23311E.bringToFront();
        anonymousClass1qb.f23311E.setControllers(anonymousClass1qb.f23309C, anonymousClass1qb.f23308B);
        anonymousClass1qb.f23311E.setVisibility(8);
    }

    /* renamed from: R */
    private int m15501R() {
        AnonymousClass1rN IT = IT();
        if (IT != null) {
            WebBackForwardList copyBackForwardList = IT.copyBackForwardList();
            int currentIndex = copyBackForwardList.getCurrentIndex();
            for (int i = currentIndex + 1; i < copyBackForwardList.getSize(); i++) {
                String url = copyBackForwardList.getItemAtIndex(i).getUrl();
                if (url != null) {
                    if (AnonymousClass1r5.m13450H(Uri.parse(url))) {
                        return i - currentIndex;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: R */
    public final void m15531R(boolean z) {
        AnonymousClass1qb anonymousClass1qb = this.f30008B;
        if (anonymousClass1qb != null) {
            AnonymousClass1pO anonymousClass1pO = anonymousClass1qb.f23310D;
            if (anonymousClass1pO != null) {
                anonymousClass1pO.setCloseButtonVisibility(z);
            }
            anonymousClass1pO = anonymousClass1qb.f23311E;
            if (anonymousClass1pO != null) {
                anonymousClass1pO.setCloseButtonVisibility(z);
            }
        }
    }

    public final void RQA(boolean z) {
        this.f30027U = z;
    }

    /* renamed from: S */
    private void m15502S() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r31 = this;
        r14 = r31;
        r2 = r14.KN();
        r1 = "BrowserLiteIntent.EXTRA_COOKIE_LOGGING_ENABLED";
        r0 = 0;
        r25 = r2.getBooleanExtra(r1, r0);
        r0 = "BrowserLIteIntent.EXTRA_MISSING_COOKIE_TEST_INFO";
        r1 = r2.getParcelableExtra(r0);
        r1 = (com.facebook.browser.lite.ipc.MissingCookiesTestInfo) r1;
        if (r1 == 0) goto L_0x001c;
    L_0x0017:
        r0 = r1.f23351B;
        r24 = r0;
        goto L_0x001e;
    L_0x001c:
        r24 = 0;
    L_0x001e:
        if (r1 == 0) goto L_0x0023;
    L_0x0020:
        r3 = r1.f23352C;
        goto L_0x0025;
    L_0x0023:
        r3 = 0;
    L_0x0025:
        r0 = r14.f30014H;
        android.webkit.CookieSyncManager.createInstance(r0);
        r13 = android.webkit.CookieManager.getInstance();
        r0 = r14.f30053u;
        r23 = m15485B(r0);
        r0 = 1;
        if (r23 != 0) goto L_0x003b;
    L_0x0037:
        r13.removeAllCookie();
        goto L_0x003d;
    L_0x003b:
        r14.f30020N = r0;
    L_0x003d:
        r0 = "BrowserLiteIntent.EXTRA_COOKIES";
        r12 = r2.getParcelableArrayListExtra(r0);
        if (r12 != 0) goto L_0x0046;
    L_0x0045:
        return;
    L_0x0046:
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 21;
        if (r1 >= r0) goto L_0x004f;
    L_0x004c:
        r22 = 1;
        goto L_0x0051;
    L_0x004f:
        r22 = 0;
    L_0x0051:
        r29 = new java.lang.Object;
        r29.<init>();
        r21 = 0;
        if (r22 != 0) goto L_0x0066;
    L_0x005a:
        if (r25 == 0) goto L_0x0066;
    L_0x005c:
        r11 = new java.util.concurrent.CountDownLatch;
        r0 = m15489F(r12);
        r11.<init>(r0);
        goto L_0x0068;
    L_0x0066:
        r11 = r21;
    L_0x0068:
        r20 = new java.util.HashSet;
        r0 = r20;
        r0.<init>();
        r19 = new java.util.HashSet;
        r0 = r19;
        r0.<init>();
        r18 = r12.size();
        r10 = 0;
    L_0x007b:
        r0 = r18;
        if (r10 >= r0) goto L_0x0151;
    L_0x007f:
        r1 = r12.get(r10);
        r1 = (android.os.Bundle) r1;
        r0 = "KEY_URL";
        r9 = r1.getString(r0);
        r17 = m15503T(r9);
        r0 = "KEY_STRING_ARRAY";
        r8 = r1.getStringArrayList(r0);
        r0 = android.text.TextUtils.isEmpty(r9);
        if (r0 != 0) goto L_0x014d;
    L_0x009b:
        if (r8 == 0) goto L_0x014d;
    L_0x009d:
        r16 = r8.size();
        r7 = 0;
    L_0x00a2:
        r0 = r16;
        if (r7 >= r0) goto L_0x014d;
    L_0x00a6:
        r6 = r8.get(r7);
        r6 = (java.lang.String) r6;
        if (r25 == 0) goto L_0x0121;
    L_0x00ae:
        if (r17 == 0) goto L_0x0121;
    L_0x00b0:
        r0 = X.AnonymousClass1r7.m13461F(r6);
        if (r0 == 0) goto L_0x00bb;
    L_0x00b6:
        r5 = r0.toLowerCase();
        goto L_0x00bc;
    L_0x00bb:
        r5 = 0;
    L_0x00bc:
        r0 = android.text.TextUtils.isEmpty(r6);
        if (r0 != 0) goto L_0x0123;
    L_0x00c2:
        r0 = r20;
        r0.add(r5);
        r0 = r14.f30017K;	 Catch:{ Exception -> 0x0112 }
        if (r0 != 0) goto L_0x00d2;	 Catch:{ Exception -> 0x0112 }
    L_0x00cb:
        r0 = new X.1pj;	 Catch:{ Exception -> 0x0112 }
        r0.<init>();	 Catch:{ Exception -> 0x0112 }
        r14.f30017K = r0;	 Catch:{ Exception -> 0x0112 }
    L_0x00d2:
        r0 = "c_user";	 Catch:{ Exception -> 0x0112 }
        r0 = r0.equals(r5);	 Catch:{ Exception -> 0x0112 }
        r2 = 1;	 Catch:{ Exception -> 0x0112 }
        if (r0 == 0) goto L_0x00f1;	 Catch:{ Exception -> 0x0112 }
    L_0x00db:
        r15 = r14.f30017K;	 Catch:{ Exception -> 0x0112 }
        r0 = ";";	 Catch:{ Exception -> 0x0112 }
        r1 = r6.split(r0);	 Catch:{ Exception -> 0x0112 }
        r0 = 0;	 Catch:{ Exception -> 0x0112 }
        r1 = r1[r0];	 Catch:{ Exception -> 0x0112 }
        r0 = "=";	 Catch:{ Exception -> 0x0112 }
        r0 = r1.split(r0);	 Catch:{ Exception -> 0x0112 }
        r0 = r0[r2];	 Catch:{ Exception -> 0x0112 }
        r15.f23198C = r0;	 Catch:{ Exception -> 0x0112 }
        goto L_0x0112;	 Catch:{ Exception -> 0x0112 }
    L_0x00f1:
        r0 = "fr=";	 Catch:{ Exception -> 0x0112 }
        r0 = r6.startsWith(r0);	 Catch:{ Exception -> 0x0112 }
        if (r0 == 0) goto L_0x0112;	 Catch:{ Exception -> 0x0112 }
    L_0x00f9:
        r0 = m15487D(r6);	 Catch:{ Exception -> 0x0112 }
        r1 = new java.util.Date;	 Catch:{ Exception -> 0x0112 }
        r1.<init>();	 Catch:{ Exception -> 0x0112 }
        if (r0 == 0) goto L_0x0112;	 Catch:{ Exception -> 0x0112 }
    L_0x0104:
        r1 = r0.compareTo(r1);	 Catch:{ Exception -> 0x0112 }
        if (r1 >= r2) goto L_0x0112;	 Catch:{ Exception -> 0x0112 }
    L_0x010a:
        r1 = r14.f30017K;	 Catch:{ Exception -> 0x0112 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0112 }
        r1.f23197B = r0;	 Catch:{ Exception -> 0x0112 }
    L_0x0112:
        if (r24 == 0) goto L_0x0123;
    L_0x0114:
        r0 = "fr=";	 Catch:{ Exception -> 0x0123 }
        r0 = r6.startsWith(r0);	 Catch:{ Exception -> 0x0123 }
        if (r0 == 0) goto L_0x0123;	 Catch:{ Exception -> 0x0123 }
    L_0x011c:
        r6 = m15513d(r14, r6, r3);	 Catch:{ Exception -> 0x0123 }
        goto L_0x0123;	 Catch:{ Exception -> 0x0123 }
    L_0x0121:
        r5 = r21;	 Catch:{ Exception -> 0x0123 }
    L_0x0123:
        if (r23 != 0) goto L_0x012d;
    L_0x0125:
        r0 = "fr=";
        r0 = r6.startsWith(r0);
        if (r0 == 0) goto L_0x0149;
    L_0x012d:
        if (r22 == 0) goto L_0x0133;
    L_0x012f:
        r13.setCookie(r9, r6);
        goto L_0x0149;
    L_0x0133:
        if (r25 == 0) goto L_0x012f;
    L_0x0135:
        if (r17 == 0) goto L_0x012f;
    L_0x0137:
        r0 = new X.1pW;
        r26 = r0;
        r27 = r14;
        r28 = r5;
        r30 = r19;
        r31 = r11;
        r26.<init>(r27, r28, r29, r30, r31);
        r13.setCookie(r9, r6, r0);
    L_0x0149:
        r7 = r7 + 1;
        goto L_0x00a2;
    L_0x014d:
        r10 = r10 + 1;
        goto L_0x007b;
    L_0x0151:
        if (r25 == 0) goto L_0x0169;
    L_0x0153:
        if (r11 == 0) goto L_0x0169;
    L_0x0155:
        r2 = new java.lang.Thread;
        r1 = new X.1pX;
        r0 = r19;
        r1.<init>(r14, r11, r0);
        r2.<init>(r1);
        r1 = 1;
        r2.setPriority(r1);
        r2.start();
        goto L_0x016a;
    L_0x0169:
        r1 = 1;
    L_0x016a:
        if (r25 == 0) goto L_0x0184;
    L_0x016c:
        r0 = m15488E(r20);
        r14.f30023Q = r0;
        r4 = EB;
        r3 = "Input cookie error number: %d";
        r2 = new java.lang.Object[r1];
        r0 = r14.f30023Q;
        r1 = java.lang.Integer.valueOf(r0);
        r0 = 0;
        r2[r0] = r1;
        X.AnonymousClass1rD.m13485E(r4, r3, r2);
    L_0x0184:
        r0 = android.webkit.CookieSyncManager.getInstance();
        r0.sync();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.S():void");
    }

    /* renamed from: S */
    public final void m15532S(boolean z) {
        AnonymousClass1qb anonymousClass1qb = this.f30008B;
        if (anonymousClass1qb != null) {
            AnonymousClass1pO anonymousClass1pO = anonymousClass1qb.f23310D;
            if (anonymousClass1pO != null) {
                anonymousClass1pO.setMenuButtonVisibility(z);
            }
            anonymousClass1pO = anonymousClass1qb.f23311E;
            if (anonymousClass1pO != null) {
                anonymousClass1pO.setMenuButtonVisibility(z);
            }
        }
    }

    /* renamed from: T */
    public final boolean m15533T(int i, String str) {
        for (AnonymousClass2dD anonymousClass2dD : this.f30021O) {
        }
        BrowserLiteWrapperView browserLiteWrapperView = this.f30011E;
        return browserLiteWrapperView != null ? browserLiteWrapperView.m13494D(str) : false;
    }

    /* renamed from: T */
    private static boolean m15503T(String str) {
        Object obj = (TextUtils.isEmpty(str) || !AnonymousClass1r5.m13452J(Uri.parse(str))) ? null : 1;
        if (obj == null) {
            if (str == null || !str.startsWith("https://facebook.com/")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: U */
    private static boolean m15504U(Uri uri, Uri uri2) {
        if (uri.getPath() != null) {
            return uri.getPath().equals(uri2.getPath());
        }
        return uri2.getPath() == null;
    }

    /* renamed from: V */
    private void m15505V(View view) {
        if (this.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_DEBUG_OVERLAY_ENABLED", false)) {
            this.f30050r = (TextView) ((ViewStub) view.findViewById(C0164R.id.browser_lite_debug_overlay_stub)).inflate();
            AnonymousClass1rC.f23407E = true;
            this.f30050r.bringToFront();
            this.f30050r.setMovementMethod(new ScrollingMovementMethod());
            AnonymousClass1rC.m13479B().f23410C = this.f30050r;
            AnonymousClass1rD.m13485E(EB, "debug overlay. separate data dir: %s, click source %s", Boolean.valueOf(this.f30058z), this.f30024R.getStringExtra("iab_click_source"));
        }
    }

    /* renamed from: W */
    private void m15506W(SslErrorHandler sslErrorHandler) {
        if (this.f30010D == null) {
            ViewStub viewStub = (ViewStub) getView().findViewById(0);
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        }
    }

    public final void Wm() {
        AnonymousClass1qK B = AnonymousClass1qK.m13396B();
        AnonymousClass1qK.m13397C(B, new AnonymousClass2PF(B, "LEChromeExtras.DismissMockBottomSheet", null));
    }

    /* renamed from: X */
    private boolean m15507X() {
        Intent intent = this.f30024R;
        if (intent == null || !intent.hasExtra("OAUTH_BASE_URI")) {
            return false;
        }
        Context context = this.f30014H;
        Uri parse = Uri.parse(this.f30024R.getStringExtra("OAUTH_BASE_URI"));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(parse.getScheme());
        stringBuilder.append("://");
        stringBuilder.append(parse.getHost());
        return AnonymousClass1r7.m13457B(context, stringBuilder.toString());
    }

    /* renamed from: Y */
    private boolean m15508Y() {
        AnonymousClass1rN IT = IT();
        if (IT != null) {
            BrowserLiteWebChromeClient G = m15490G(IT);
            if (G != null && G.m15535C()) {
                return true;
            }
            if (IT.canGoBack()) {
                IT.goBack();
                return true;
            } else if (this.f30044l.size() > 1) {
                m15493J(this);
                return true;
            }
        }
        return false;
    }

    public final FrameLayout YU() {
        return this.BB;
    }

    /* renamed from: Z */
    private void m15509Z() {
        AnonymousClass1qt.m13430B().m13432B("BLF.onSelfAttached");
        AnonymousClass1rD.f23412B = KN().getBooleanExtra("BrowserLiteIntent.EXTRA_LOGCAT", false);
        AnonymousClass1qK B = AnonymousClass1qK.m13396B();
        this.f30013G = B;
        B.f23264D = AnonymousClass2P3.m15569B();
        this.f30013G.m13399A(this.f30014H.getApplicationContext(), true);
    }

    /* renamed from: a */
    private void m15510a(Bundle bundle) {
        if (bundle.containsKey("web_view_number")) {
            int i = bundle.getInt("web_view_number");
            if (i == 0) {
                AnonymousClass1rD.m13486F(EB, "0 webview saved!", new Object[0]);
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("web_view_");
                stringBuilder.append(i2);
                String stringBuilder2 = stringBuilder.toString();
                if (bundle.containsKey(stringBuilder2)) {
                    Bundle bundle2 = bundle.getBundle(stringBuilder2);
                    AnonymousClass1rN N = m15497N(this);
                    N.restoreState(bundle2);
                    this.f30044l.push(N);
                } else {
                    AnonymousClass1rD.m13486F(EB, "Info for webview %d (total %d) not found!", Integer.valueOf(i2), Integer.valueOf(i));
                }
            }
            m15512c(this, (AnonymousClass1rN) this.f30044l.peek());
            for (AnonymousClass2dD anonymousClass2dD : this.f30022P) {
            }
            return;
        }
        AnonymousClass1rD.m13486F(EB, "The fragment is reconstructed but without webview state number info!", new Object[0]);
    }

    /* renamed from: b */
    private void m15511b() {
        ViewStub viewStub;
        String stringExtra = this.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_THEME");
        this.f30008B = new AnonymousClass1qb(this, this);
        for (AnonymousClass2dD F : this.f30021O) {
            if (F.m16597F()) {
                return;
            }
        }
        View view = getView();
        if (AnonymousClass1qb.f23306H.equals(stringExtra)) {
            stringExtra = AnonymousClass1qb.f23306H;
            viewStub = (ViewStub) view.findViewById(C0164R.id.messenger_platform_chrome_stub);
        } else {
            stringExtra = AnonymousClass1qb.f23304F;
            viewStub = (ViewStub) view.findViewById(C0164R.id.default_browser_chrome_stub);
        }
        this.f30008B.m13423C(viewStub, stringExtra);
    }

    public final boolean bn() {
        return m15524K(false);
    }

    /* renamed from: c */
    private static void m15512c(BrowserLiteFragment browserLiteFragment, AnonymousClass1rN anonymousClass1rN) {
        AnonymousClass2PN anonymousClass2PN = browserLiteFragment.f30048p;
        if (anonymousClass2PN != null) {
            anonymousClass2PN.f30186C.ks(anonymousClass1rN);
        } else {
            AnonymousClass1qb anonymousClass1qb = browserLiteFragment.f30008B;
            if (anonymousClass1qb != null) {
                AnonymousClass1pO anonymousClass1pO = anonymousClass1qb.f23310D;
                if (anonymousClass1pO != null) {
                    anonymousClass1pO.mo2856A(anonymousClass1rN);
                }
                anonymousClass1pO = anonymousClass1qb.f23311E;
                if (anonymousClass1pO != null) {
                    anonymousClass1pO.mo2856A(anonymousClass1rN);
                }
            }
        }
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = browserLiteFragment.f30028V;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.m13389A(anonymousClass1rN);
        }
    }

    /* renamed from: d */
    private static String m15513d(BrowserLiteFragment browserLiteFragment, String str, long j) {
        browserLiteFragment = m15487D(str);
        Date date = new Date();
        Object obj = null;
        if (browserLiteFragment != null && browserLiteFragment.compareTo(date) < 1) {
            obj = 1;
        }
        if (obj == null) {
            return str;
        }
        Date date2 = new Date();
        date2.setTime(date2.getTime() + j);
        j = m15500Q().format(date2);
        str = str.split(";");
        browserLiteFragment = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (i == 1) {
                browserLiteFragment.append(" Expires=");
                browserLiteFragment.append(j);
            } else {
                browserLiteFragment.append(str[i]);
            }
            if (i < str.length - 1) {
                browserLiteFragment.append(";");
            }
        }
        return browserLiteFragment.toString();
    }

    public final boolean fX() {
        String dataString = this.f30024R.getDataString();
        AnonymousClass1rN IT = IT();
        if (IT == null) {
            return false;
        }
        Object obj = (this.f30044l.size() > 1 || IT.canGoBack()) ? null : 1;
        String url = IT.getUrl();
        if (obj != null || dataString.equalsIgnoreCase(url)) {
            return true;
        }
        return false;
    }

    public final void hE(int i, String str) {
        this.f30030X = i;
        jE(str);
    }

    public final void hQA(ViewStub viewStub, String str) {
        this.f30008B.m13423C(viewStub, str);
    }

    public final void iE(int i, boolean z) {
        this.f30030X = i;
        m15515B(z);
    }

    public final void jE(String str) {
        AnonymousClass1pi anonymousClass1pi = this.f30009C;
        if (anonymousClass1pi != null && !this.f30026T) {
            anonymousClass1pi.ge(this.f30030X, str);
        }
    }

    public final void jG() {
        AnonymousClass1rE anonymousClass1rE = this.f30010D;
    }

    public final boolean mD() {
        AnonymousClass1rN IT = IT();
        if (IT == null) {
            return false;
        }
        if (!this.AB) {
            return IT.canGoBack();
        }
        boolean z = true;
        if (m15499P(1) >= 0) {
            z = false;
        }
        return z;
    }

    public final View mJ() {
        return this.f30046n;
    }

    public final void mm() {
        AnonymousClass1rN IT = IT();
        if (IT != null) {
            if (this.AB) {
                IT.goBackOrForward(m15501R());
            } else {
                IT.goForward();
            }
        }
    }

    public final boolean nD() {
        AnonymousClass1rN IT = IT();
        boolean z = false;
        if (IT != null) {
            if (!this.AB) {
                return IT.canGoForward();
            }
            if (m15501R() != 0) {
                z = true;
            }
        }
        return z;
    }

    public final void onActivityCreated(Bundle bundle) {
        AnonymousClass1qt.m13430B().m13432B("BLF.onActivityCreated.Start");
        Bundle bundle2 = bundle;
        super.onActivityCreated(bundle2);
        Intent KN = KN();
        this.f30024R = KN;
        Uri data = KN.getData();
        this.f30053u = data;
        if (data != null) {
            if (AnonymousClass1r5.m13450H(data)) {
                Object obj;
                Class cls;
                PrefetchCacheEntry prefetchCacheEntry;
                int intExtra;
                OnClickListener onClickListener;
                String str;
                AnonymousClass1qf anonymousClass1qf;
                AnonymousClass1rN O;
                String stringExtra;
                Uri uri;
                Object stringExtra2;
                Map hashMap;
                AnonymousClass1pl B;
                Iterator it;
                Object obj2;
                WeakReference weakReference;
                AnonymousClass1qK anonymousClass1qK;
                View view = getView();
                r4.BB = (FrameLayout) view.findViewById(C0164R.id.webview_container);
                r4.f30047o = view.findViewById(C0164R.id.browser_container);
                r4.f30046n = view.findViewById(C0164R.id.browser_chrome_container);
                int intExtra2 = r4.f30024R.getIntExtra("BrowserLiteIntent.EXTRA_LE_DESIGN_EXPERIMENT_STYLE", 0);
                boolean z = intExtra2 != 0;
                r4.f30029W = z;
                if (z) {
                    AnonymousClass1qX.m13419D(r4.f30046n, new ColorDrawable(0));
                    AnonymousClass1qX.m13419D(r4.f30047o, new ColorDrawable(0));
                    if (intExtra2 != 3) {
                        AnonymousClass1qX.m13419D(r4.BB, new ColorDrawable(-419430401));
                    }
                    r4.f30011E = (BrowserLiteWrapperView) view.findViewById(C0164R.id.browser_wrapper_view);
                    ViewStub viewStub = (ViewStub) view.findViewById(C0164R.id.default_le_browser_chrome_stub);
                    viewStub.setBackgroundColor(0);
                    AnonymousClass2PN anonymousClass2PN = new AnonymousClass2PN();
                    r4.f30048p = anonymousClass2PN;
                    anonymousClass2PN.f30185B = r4;
                    anonymousClass2PN.f30187D = r4;
                    AnonymousClass2PN anonymousClass2PN2 = r4.f30048p;
                    anonymousClass2PN2.f30186C = (DefaultBrowserLiteChrome) viewStub.inflate();
                    anonymousClass2PN2.f30186C.setControllers(anonymousClass2PN2.f30185B, anonymousClass2PN2.f30187D);
                    anonymousClass2PN2.f30186C.MW();
                    BrowserLiteWrapperView browserLiteWrapperView = r4.f30011E;
                    anonymousClass2PN = r4.f30048p;
                    browserLiteWrapperView.f23437E = r4;
                    browserLiteWrapperView.f23438F = r4;
                    browserLiteWrapperView.f23436D = anonymousClass2PN;
                    browserLiteWrapperView.f23434B = new ArgbEvaluator();
                    Context activity = browserLiteWrapperView.f23438F.getActivity();
                    browserLiteWrapperView.f23441I = AnonymousClass0Ca.C(activity, C0164R.color.status_bar_background);
                    if (VERSION.SDK_INT >= 23) {
                        browserLiteWrapperView.f23441I = AnonymousClass0Ca.C(activity, C0164R.color.status_bar_background_light);
                    }
                    browserLiteWrapperView.f23440H = AnonymousClass0Ca.C(activity, C0164R.color.black_70_transparent);
                    browserLiteWrapperView.f23435C = browserLiteWrapperView.findViewById(C0164R.id.browser_background_protection);
                    BrowserLiteWrapperView.m13489B(browserLiteWrapperView);
                    BrowserLiteWrapperView.m13490C(browserLiteWrapperView, 0.0f, 0.0f);
                    BrowserLiteGestureDelegateView browserLiteGestureDelegateView = (BrowserLiteGestureDelegateView) view.findViewById(C0164R.id.browser_gesture_delegate_view);
                    browserLiteWrapperView = r4.f30011E;
                    z = (intExtra2 == 4 || intExtra2 == 2) ? false : true;
                    browserLiteGestureDelegateView.f23422B = browserLiteWrapperView;
                    browserLiteGestureDelegateView.f23428H = z;
                    browserLiteGestureDelegateView.f23427G = AnonymousClass1r7.m13458C(10.0f, browserLiteGestureDelegateView.getContext());
                    browserLiteGestureDelegateView.f23424D = new GestureDetector(browserLiteGestureDelegateView.getContext(), new AnonymousClass1rG(browserLiteGestureDelegateView));
                    BrowserLiteWrapperView browserLiteWrapperView2 = r4.f30011E;
                    if (intExtra2 != 3) {
                        if (intExtra2 != 4) {
                            obj = null;
                            BrowserLiteWrapperView.m13489B(browserLiteWrapperView2);
                            if (obj != null) {
                                BrowserLiteWrapperView.m13490C(browserLiteWrapperView2, browserLiteWrapperView2.f23442J, 0.7f);
                            }
                            r4.f30017K = new AnonymousClass1pj();
                        }
                    }
                    obj = 1;
                    BrowserLiteWrapperView.m13489B(browserLiteWrapperView2);
                    if (obj != null) {
                        BrowserLiteWrapperView.m13490C(browserLiteWrapperView2, browserLiteWrapperView2.f23442J, 0.7f);
                    }
                    r4.f30017K = new AnonymousClass1pj();
                }
                m15505V(view);
                boolean E = AnonymousClass1rA.m13469E(r4.f30014H);
                if (E) {
                    if (!AnonymousClass1r4.f23395B) {
                        z = false;
                        r4.f30052t = z;
                        AnonymousClass1r4.f23395B = true;
                        r4.f30028V = (BrowserLiteJSBridgeProxy) r4.f30024R.getParcelableExtra("BrowserLiteIntent.JS_BRIDGE");
                        r4.f30054v = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_IN_APP_BROWSER_PROFILING_ENABLED", false);
                        r4.f30039g = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_LOG_FB_TRACKING_REQUEST", false);
                        r4.f30034b = r4.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_REQUEST_LOG_LEVEL");
                        r4.f30034b = r4.f30034b == null ? r4.f30034b : "NONE";
                        r4.f30027U = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_PLAY_STORE_URL_OVERRIDE_DISABLED", false);
                        r4.f30057y = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_REFERRER_HTML_ENABLED", true);
                        r4.f30045m = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_DATA_SCHEME_ENABLED", false);
                        r4.AB = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_SAFE_BROWSING_ENABLED", false);
                        AnonymousClass2PX.mo2918B().f23387C = new WeakReference(r4.f30014H);
                        AnonymousClass2PX.mo2918B().f23392H = new WeakReference(r4.f30024R);
                        AnonymousClass2PX.mo2918B().f23393I = new WeakReference(view);
                        AnonymousClass2PX.mo2918B().f23391G = r4;
                        AnonymousClass2PX.mo2918B().f23389E = r4;
                        AnonymousClass2PX.mo2918B().f23388D = r4;
                        AnonymousClass2PX.mo2918B().f23390F = r4.f30048p;
                        AnonymousClass2PX.mo2918B().m13441A();
                        cls = AnonymousClass2dD.class;
                        r4.f30021O = AnonymousClass2PX.mo2918B().m13443C(cls);
                        r4.f30022P = AnonymousClass2PX.mo2918B().m13443C(cls);
                        r4.f30015I = r4.f30053u.toString();
                        r4.f30012F = AnonymousClass2P3.m15569B();
                        prefetchCacheEntry = (PrefetchCacheEntry) r4.f30024R.getParcelableExtra("BrowserLiteIntent.EXTRA_PREFETCH_INFO");
                        if (prefetchCacheEntry == null) {
                            r4.f30012F.f30133B = prefetchCacheEntry;
                        } else {
                            if (r4.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_NO_PREFETCH_REASON") != null) {
                                AnonymousClass1rD.m13485E(EB, "No prefetch reason: %s", r4.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_NO_PREFETCH_REASON"));
                            }
                        }
                        AnonymousClass1qt.m13430B().m13432B("BLF.onActivityCreated.setUpBrowserChromeControllerByTheme_start");
                        if (!r4.f30029W) {
                            m15511b();
                        }
                        AnonymousClass1qt.m13430B().m13432B("BLF.onActivityCreated.setUpBrowserChromeControllerByTheme_end");
                        intExtra = r4.f30024R.getIntExtra("BrowserLiteIntent.EXTRA_TOAST_RES_ID", -1);
                        if (intExtra > 0) {
                            m15494K(r4, intExtra);
                        }
                        AnonymousClass1qt.m13430B().m13432B("BLF.IABListenerProvider.onActivityCreated_Start");
                        for (AnonymousClass2dD anonymousClass2dD : r4.f30021O) {
                            anonymousClass2dD.f31760a = anonymousClass2dD.f23359D.getBooleanExtra("BrowserLiteIntent.EXTRA_WATCH_INSTALL_JS_ENABLED", true);
                            anonymousClass2dD.f31736C = anonymousClass2dD.f23359D.getBooleanExtra("watch_and_install_hijack_cta_button_enabled", false);
                            anonymousClass2dD.f31737D = anonymousClass2dD.f23359D.getBooleanExtra("watch_and_install_hijack_install_button_enabled", anonymousClass2dD.f31737D);
                            if (anonymousClass2dD.f23359D.getExtras().getBoolean("watch_and_browse_is_in_watch_and_browse")) {
                                anonymousClass2dD.f23358C.zC(8);
                                if (anonymousClass2dD.f31735B == null) {
                                    anonymousClass2dD.f31735B = (BrowserLiteHeaderLoadingScreen) ((ViewStub) anonymousClass2dD.f23360E.findViewById(C0164R.id.browser_lite_header_loading_screen)).inflate();
                                }
                                anonymousClass2dD.f31735B.setLoadingScreenDisplayUrlEnabled(anonymousClass2dD.f31744K);
                                onClickListener = anonymousClass2dD.f31752S;
                                if (onClickListener != null) {
                                    str = anonymousClass2dD.f31743J;
                                    if (str != null) {
                                        if (anonymousClass2dD.f31742I) {
                                            anonymousClass2dD.f31735B.setCallToActionButton(str, onClickListener);
                                        } else if (anonymousClass2dD.f31740G || anonymousClass2dD.f31741H) {
                                            anonymousClass2dD.f31735B.setWatchAndInstallDefaultMessageEnabled(anonymousClass2dD.f31753T);
                                            anonymousClass2dD.f31735B.setBottomCallToActionButton(anonymousClass2dD.f31743J, anonymousClass2dD.f31752S);
                                            AnonymousClass2dD.m16587B(anonymousClass2dD);
                                            if (anonymousClass2dD.f31741H) {
                                                anonymousClass2dD.f31735B.findViewById(0).setBackgroundResource(0);
                                            }
                                            if (anonymousClass2dD.f31755V) {
                                                anonymousClass2dD.f31735B.setAnimationSocialContextFirst(anonymousClass2dD.f31754U);
                                                AnonymousClass2dD.m16588C(anonymousClass2dD);
                                                anonymousClass2dD.f31735B.m13426A();
                                                anonymousClass2dD.m16594C("watch_and_install_mode", anonymousClass2dD.f31759Z == null, anonymousClass2dD.f31757X == null, anonymousClass2dD.f31758Y == null, anonymousClass2dD.f31756W == null ? true : null);
                                            }
                                        }
                                    }
                                }
                                if (!anonymousClass2dD.f23359D.getExtras().getBoolean("watch_and_browse_is_in_watch_and_install", false) && anonymousClass2dD.f31751R) {
                                    AnonymousClass2dD.m16587B(anonymousClass2dD);
                                    anonymousClass2dD.f31735B.setWatchAndBrowseSocialContextEnabled(anonymousClass2dD.f31751R);
                                    anonymousClass2dD.f31735B.setSocialContextMessageVisibility(0);
                                    AnonymousClass2dD.m16588C(anonymousClass2dD);
                                    anonymousClass2dD.f31735B.m13426A();
                                    anonymousClass2dD.m16594C("watch_and_browse_mode", anonymousClass2dD.f31759Z == null, anonymousClass2dD.f31757X == null, anonymousClass2dD.f31758Y == null, anonymousClass2dD.f31756W == null ? true : null);
                                }
                                if (anonymousClass2dD.f31739F) {
                                    AnonymousClass2dD.m16587B(anonymousClass2dD);
                                }
                                anonymousClass2dD.f31735B.setVisibility(8);
                            }
                            AnonymousClass2dD.m16589D(anonymousClass2dD);
                            anonymousClass1qf = anonymousClass2dD.f31747N;
                            if (anonymousClass1qf != null) {
                                anonymousClass1qf.onWatchAndBrowserExtensionsSetup();
                            }
                        }
                        AnonymousClass1qt.m13430B().m13432B("BLF.IABListenerProvider.onActivityCreated_End");
                        if (bundle2 != null) {
                            O = m15528O();
                            stringExtra = r4.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_POST_DATA");
                            uri = r4.f30053u;
                            if (!(TextUtils.isEmpty(stringExtra) || AnonymousClass1r5.m13452J(uri))) {
                                obj = (uri == null && ("fb".equals(uri.getScheme()) || "fb-messenger".equals(uri.getScheme()) || "fbinternal".equals(uri.getScheme()) || "fb-work".equals(uri.getScheme()) || "dialtone".equals(uri.getScheme()))) ? 1 : null;
                                if (obj == null && URLUtil.isHttpsUrl(uri.toString())) {
                                    obj = 1;
                                    if (obj != null) {
                                        stringExtra = null;
                                    }
                                    stringExtra2 = r4.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_REFERER");
                                    if (!TextUtils.isEmpty(stringExtra2)) {
                                        AnonymousClass1r4.f23396C = stringExtra2;
                                    }
                                    hashMap = new HashMap();
                                    hashMap.put("Referer", AnonymousClass1r4.f23396C);
                                    m15520G(O, r4.f30053u, hashMap, stringExtra);
                                }
                            }
                            obj = null;
                            if (obj != null) {
                                stringExtra = null;
                            }
                            stringExtra2 = r4.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_REFERER");
                            if (TextUtils.isEmpty(stringExtra2)) {
                                AnonymousClass1r4.f23396C = stringExtra2;
                            }
                            hashMap = new HashMap();
                            hashMap.put("Referer", AnonymousClass1r4.f23396C);
                            m15520G(O, r4.f30053u, hashMap, stringExtra);
                        } else {
                            m15510a(bundle2);
                        }
                        B = AnonymousClass1pl.m13388B();
                        synchronized (B) {
                            it = B.f23205B.iterator();
                            obj2 = null;
                            while (it.hasNext()) {
                                weakReference = (WeakReference) it.next();
                                if (weakReference.get() == null) {
                                    it.remove();
                                } else if (r4 == weakReference.get()) {
                                    obj2 = 1;
                                }
                            }
                            if (obj2 == null) {
                                B.f23205B.addLast(new WeakReference(r4));
                            }
                        }
                        r4.f30041i = r4.f30024R.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
                        anonymousClass1qK = r4.f30013G;
                        AnonymousClass1qK.m13397C(anonymousClass1qK, new AnonymousClass2PH(anonymousClass1qK, r4.f30053u.toString(), r4.f30041i));
                        if (AnonymousClass1r7.m13459D() && E) {
                            r4.f30058z = true;
                        }
                        AnonymousClass1qt.m13430B().m13432B("BLF.onActivityCreated.End");
                    }
                }
                z = true;
                r4.f30052t = z;
                AnonymousClass1r4.f23395B = true;
                r4.f30028V = (BrowserLiteJSBridgeProxy) r4.f30024R.getParcelableExtra("BrowserLiteIntent.JS_BRIDGE");
                r4.f30054v = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_IN_APP_BROWSER_PROFILING_ENABLED", false);
                r4.f30039g = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_LOG_FB_TRACKING_REQUEST", false);
                r4.f30034b = r4.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_REQUEST_LOG_LEVEL");
                if (r4.f30034b == null) {
                }
                r4.f30034b = r4.f30034b == null ? r4.f30034b : "NONE";
                r4.f30027U = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_PLAY_STORE_URL_OVERRIDE_DISABLED", false);
                r4.f30057y = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_REFERRER_HTML_ENABLED", true);
                r4.f30045m = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_DATA_SCHEME_ENABLED", false);
                r4.AB = r4.f30024R.getBooleanExtra("BrowserLiteIntent.EXTRA_SAFE_BROWSING_ENABLED", false);
                AnonymousClass2PX.mo2918B().f23387C = new WeakReference(r4.f30014H);
                AnonymousClass2PX.mo2918B().f23392H = new WeakReference(r4.f30024R);
                AnonymousClass2PX.mo2918B().f23393I = new WeakReference(view);
                AnonymousClass2PX.mo2918B().f23391G = r4;
                AnonymousClass2PX.mo2918B().f23389E = r4;
                AnonymousClass2PX.mo2918B().f23388D = r4;
                AnonymousClass2PX.mo2918B().f23390F = r4.f30048p;
                AnonymousClass2PX.mo2918B().m13441A();
                cls = AnonymousClass2dD.class;
                r4.f30021O = AnonymousClass2PX.mo2918B().m13443C(cls);
                r4.f30022P = AnonymousClass2PX.mo2918B().m13443C(cls);
                r4.f30015I = r4.f30053u.toString();
                r4.f30012F = AnonymousClass2P3.m15569B();
                prefetchCacheEntry = (PrefetchCacheEntry) r4.f30024R.getParcelableExtra("BrowserLiteIntent.EXTRA_PREFETCH_INFO");
                if (prefetchCacheEntry == null) {
                    if (r4.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_NO_PREFETCH_REASON") != null) {
                        AnonymousClass1rD.m13485E(EB, "No prefetch reason: %s", r4.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_NO_PREFETCH_REASON"));
                    }
                } else {
                    r4.f30012F.f30133B = prefetchCacheEntry;
                }
                AnonymousClass1qt.m13430B().m13432B("BLF.onActivityCreated.setUpBrowserChromeControllerByTheme_start");
                if (r4.f30029W) {
                    m15511b();
                }
                AnonymousClass1qt.m13430B().m13432B("BLF.onActivityCreated.setUpBrowserChromeControllerByTheme_end");
                intExtra = r4.f30024R.getIntExtra("BrowserLiteIntent.EXTRA_TOAST_RES_ID", -1);
                if (intExtra > 0) {
                    m15494K(r4, intExtra);
                }
                AnonymousClass1qt.m13430B().m13432B("BLF.IABListenerProvider.onActivityCreated_Start");
                for (AnonymousClass2dD anonymousClass2dD2 : r4.f30021O) {
                    anonymousClass2dD2.f31760a = anonymousClass2dD2.f23359D.getBooleanExtra("BrowserLiteIntent.EXTRA_WATCH_INSTALL_JS_ENABLED", true);
                    anonymousClass2dD2.f31736C = anonymousClass2dD2.f23359D.getBooleanExtra("watch_and_install_hijack_cta_button_enabled", false);
                    anonymousClass2dD2.f31737D = anonymousClass2dD2.f23359D.getBooleanExtra("watch_and_install_hijack_install_button_enabled", anonymousClass2dD2.f31737D);
                    if (anonymousClass2dD2.f23359D.getExtras().getBoolean("watch_and_browse_is_in_watch_and_browse")) {
                        anonymousClass2dD2.f23358C.zC(8);
                        if (anonymousClass2dD2.f31735B == null) {
                            anonymousClass2dD2.f31735B = (BrowserLiteHeaderLoadingScreen) ((ViewStub) anonymousClass2dD2.f23360E.findViewById(C0164R.id.browser_lite_header_loading_screen)).inflate();
                        }
                        anonymousClass2dD2.f31735B.setLoadingScreenDisplayUrlEnabled(anonymousClass2dD2.f31744K);
                        onClickListener = anonymousClass2dD2.f31752S;
                        if (onClickListener != null) {
                            str = anonymousClass2dD2.f31743J;
                            if (str != null) {
                                if (anonymousClass2dD2.f31742I) {
                                    anonymousClass2dD2.f31735B.setCallToActionButton(str, onClickListener);
                                } else {
                                    anonymousClass2dD2.f31735B.setWatchAndInstallDefaultMessageEnabled(anonymousClass2dD2.f31753T);
                                    anonymousClass2dD2.f31735B.setBottomCallToActionButton(anonymousClass2dD2.f31743J, anonymousClass2dD2.f31752S);
                                    AnonymousClass2dD.m16587B(anonymousClass2dD2);
                                    if (anonymousClass2dD2.f31741H) {
                                        anonymousClass2dD2.f31735B.findViewById(0).setBackgroundResource(0);
                                    }
                                    if (anonymousClass2dD2.f31755V) {
                                        anonymousClass2dD2.f31735B.setAnimationSocialContextFirst(anonymousClass2dD2.f31754U);
                                        AnonymousClass2dD.m16588C(anonymousClass2dD2);
                                        anonymousClass2dD2.f31735B.m13426A();
                                        if (anonymousClass2dD2.f31759Z == null) {
                                        }
                                        if (anonymousClass2dD2.f31757X == null) {
                                        }
                                        if (anonymousClass2dD2.f31758Y == null) {
                                        }
                                        if (anonymousClass2dD2.f31756W == null) {
                                        }
                                        anonymousClass2dD2.m16594C("watch_and_install_mode", anonymousClass2dD2.f31759Z == null, anonymousClass2dD2.f31757X == null, anonymousClass2dD2.f31758Y == null, anonymousClass2dD2.f31756W == null ? true : null);
                                    }
                                }
                            }
                        }
                        AnonymousClass2dD.m16587B(anonymousClass2dD2);
                        anonymousClass2dD2.f31735B.setWatchAndBrowseSocialContextEnabled(anonymousClass2dD2.f31751R);
                        anonymousClass2dD2.f31735B.setSocialContextMessageVisibility(0);
                        AnonymousClass2dD.m16588C(anonymousClass2dD2);
                        anonymousClass2dD2.f31735B.m13426A();
                        if (anonymousClass2dD2.f31759Z == null) {
                        }
                        if (anonymousClass2dD2.f31757X == null) {
                        }
                        if (anonymousClass2dD2.f31758Y == null) {
                        }
                        if (anonymousClass2dD2.f31756W == null) {
                        }
                        anonymousClass2dD2.m16594C("watch_and_browse_mode", anonymousClass2dD2.f31759Z == null, anonymousClass2dD2.f31757X == null, anonymousClass2dD2.f31758Y == null, anonymousClass2dD2.f31756W == null ? true : null);
                        if (anonymousClass2dD2.f31739F) {
                            AnonymousClass2dD.m16587B(anonymousClass2dD2);
                        }
                        anonymousClass2dD2.f31735B.setVisibility(8);
                    }
                    AnonymousClass2dD.m16589D(anonymousClass2dD2);
                    anonymousClass1qf = anonymousClass2dD2.f31747N;
                    if (anonymousClass1qf != null) {
                        anonymousClass1qf.onWatchAndBrowserExtensionsSetup();
                    }
                }
                AnonymousClass1qt.m13430B().m13432B("BLF.IABListenerProvider.onActivityCreated_End");
                if (bundle2 != null) {
                    m15510a(bundle2);
                } else {
                    O = m15528O();
                    stringExtra = r4.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_POST_DATA");
                    uri = r4.f30053u;
                    if (uri == null) {
                    }
                    obj = 1;
                    if (obj != null) {
                        stringExtra = null;
                    }
                    stringExtra2 = r4.f30024R.getStringExtra("BrowserLiteIntent.EXTRA_REFERER");
                    if (TextUtils.isEmpty(stringExtra2)) {
                        AnonymousClass1r4.f23396C = stringExtra2;
                    }
                    hashMap = new HashMap();
                    hashMap.put("Referer", AnonymousClass1r4.f23396C);
                    m15520G(O, r4.f30053u, hashMap, stringExtra);
                }
                B = AnonymousClass1pl.m13388B();
                synchronized (B) {
                    it = B.f23205B.iterator();
                    obj2 = null;
                    while (it.hasNext()) {
                        weakReference = (WeakReference) it.next();
                        if (weakReference.get() == null) {
                            it.remove();
                        } else if (r4 == weakReference.get()) {
                            obj2 = 1;
                        }
                    }
                    if (obj2 == null) {
                        B.f23205B.addLast(new WeakReference(r4));
                    }
                }
                r4.f30041i = r4.f30024R.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
                anonymousClass1qK = r4.f30013G;
                AnonymousClass1qK.m13397C(anonymousClass1qK, new AnonymousClass2PH(anonymousClass1qK, r4.f30053u.toString(), r4.f30041i));
                r4.f30058z = true;
                AnonymousClass1qt.m13430B().m13432B("BLF.onActivityCreated.End");
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        BrowserLiteWebChromeClient G = m15490G(IT());
        if (G != null) {
            G.m15538B(i, i2, intent);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f30014H = activity;
        if (VERSION.SDK_INT < 23) {
            m15509Z();
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f30014H = context;
        m15509Z();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        BrowserLiteWrapperView browserLiteWrapperView = this.f30011E;
        if (browserLiteWrapperView != null) {
            BrowserLiteWrapperView.m13489B(browserLiteWrapperView);
            BrowserLiteWrapperView.m13490C(browserLiteWrapperView, browserLiteWrapperView.f23442J, 0.7f);
        }
        AnonymousClass1qb anonymousClass1qb = this.f30008B;
        if (anonymousClass1qb != null) {
            AnonymousClass1pO anonymousClass1pO = anonymousClass1qb.f23310D;
            if (anonymousClass1pO != null) {
                anonymousClass1pO.mo2858C();
            }
            anonymousClass1pO = anonymousClass1qb.f23311E;
            if (anonymousClass1pO != null) {
                anonymousClass1pO.mo2858C();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass1qt.m13430B().m13432B("BLF.onCreateView");
        View inflate = layoutInflater.inflate(C0164R.layout.browser_lite_fragment, viewGroup, false);
        this.f30036d = inflate;
        return inflate;
    }

    public final void onDestroy() {
        if (!this.f30026T) {
            this.f30013G.m13403E(this.f30014H.getApplicationContext());
        }
        AnonymousClass1pl B = AnonymousClass1pl.m13388B();
        synchronized (B) {
            Iterator it = B.f23205B.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || weakReference.get() == this) {
                    it.remove();
                }
            }
        }
        while (!this.f30044l.isEmpty()) {
            m15498O((AnonymousClass1rN) this.f30044l.pop());
        }
        super.onDestroy();
    }

    public final void onDestroyView() {
        FrameLayout frameLayout = this.BB;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.BB = null;
        }
        this.f30036d = null;
        this.f30033a = null;
        AnonymousClass1qb anonymousClass1qb = this.f30008B;
        if (anonymousClass1qb != null) {
            anonymousClass1qb.f23310D = null;
            anonymousClass1qb.f23311E = null;
            anonymousClass1qb.f23309C = null;
            anonymousClass1qb.f23309C = null;
        }
        super.onDestroyView();
    }

    public final void onPause() {
        Map B;
        super.onPause();
        AnonymousClass1rN IT = IT();
        String str = null;
        String url = IT != null ? IT.getUrl() : null;
        if (IT != null) {
            str = IT.getTitle();
        }
        AnonymousClass1qK anonymousClass1qK = r0.f30013G;
        AnonymousClass1qK.m13397C(anonymousClass1qK, new AnonymousClass2PJ(anonymousClass1qK, AnonymousClass1qu.m13434B().m13435A(), url, r0.f30026T));
        List<AnonymousClass2dD> list = r0.f30021O;
        if (list != null) {
            for (AnonymousClass2dD anonymousClass2dD : list) {
            }
        }
        if (IT != null) {
            IT.onPause();
            IT.pauseTimers();
            if (r0.f30051s) {
                SslError sslError;
                StringBuilder stringBuilder;
                r0.f30051s = false;
                AnonymousClass1qt.m13430B().m13432B("BLF.onPause");
                AnonymousClass1rN anonymousClass1rN = (AnonymousClass1rN) r0.f30044l.firstElement();
                HashMap hashMap = new HashMap();
                if (r0.f30039g) {
                    hashMap.putAll(anonymousClass1rN.getPixelRequestsLoggingParam());
                }
                hashMap.put("user_agent", r0.f30043k);
                AnonymousClass2P0 H = m15491H(anonymousClass1rN);
                if (H != null) {
                    sslError = H.f30078C;
                } else {
                    sslError = null;
                }
                if (sslError != null) {
                    hashMap.put("ssl_error_url", sslError.getUrl());
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(sslError.getPrimaryError());
                    hashMap.put("ssl_primary_error", stringBuilder.toString());
                }
                String safeBrowsingThreatEventType = anonymousClass1rN.getSafeBrowsingThreatEventType();
                String safeBrowsingThreatEventUrl = anonymousClass1rN.getSafeBrowsingThreatEventUrl();
                if (safeBrowsingThreatEventType != null) {
                    hashMap.put("safe_browsing_url", safeBrowsingThreatEventUrl);
                    hashMap.put("safe_browsing_threat", safeBrowsingThreatEventType);
                }
                if (r0.f30023Q != 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(r0.f30023Q);
                    hashMap.put("input_cookie_error_number", stringBuilder.toString());
                }
                if (r0.f30038f != 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(r0.f30038f);
                    hashMap.put("set_cookie_error_number", stringBuilder.toString());
                }
                AnonymousClass1pj anonymousClass1pj = r0.f30017K;
                if (anonymousClass1pj != null) {
                    Object obj = (anonymousClass1pj.f23198C == null || anonymousClass1pj.f23197B == null) ? null : 1;
                    if (obj != null) {
                        hashMap.put("expired_login_cookie_info", r0.f30017K.toString());
                    }
                }
                AnonymousClass1qb anonymousClass1qb = r0.f30008B;
                if (anonymousClass1qb != null) {
                    B = anonymousClass1qb.m13422B();
                    if (B != null) {
                        for (Entry entry : B.entrySet()) {
                            hashMap.put(entry.getKey(), Integer.toString(((Integer) entry.getValue()).intValue()));
                        }
                    }
                }
                hashMap.put("nav_bar_back_btn_press", Integer.toString(r0.f30031Y));
                AnonymousClass1rE anonymousClass1rE = r0.f30010D;
                if (anonymousClass1rE != null && anonymousClass1rE.getDisplayed()) {
                    Object userAction = r0.f30010D.getUserAction();
                    if (userAction == null && r0.f30026T && r0.f30010D.getVisibility() == 0) {
                        userAction = "close_browser";
                    }
                    if (userAction == null) {
                        userAction = "error";
                    }
                    hashMap.put("error_screen_user_action", userAction);
                }
                if (r0.f30026T) {
                    hashMap.put("close_browser_action", Integer.toString(r0.f30030X));
                }
                if (hashMap.isEmpty()) {
                    hashMap = null;
                }
                AnonymousClass1qK anonymousClass1qK2 = r0.f30013G;
                AnonymousClass1qK.m13397C(anonymousClass1qK2, new AnonymousClass2P5(anonymousClass1qK2, anonymousClass1rN.getFirstUrl(), r0.f30055w, anonymousClass1rN.getLandingPageResponseEndTime(), anonymousClass1rN.getLandingPageDomContentloadedTime(), anonymousClass1rN.getLandingPageLoadEventEndTime(), anonymousClass1rN.getFirstScrollReadyTime(), r0.f30019M, anonymousClass1rN.getHitRefreshButton(), r0.f30026T, anonymousClass1rN.getIsAmp(), hashMap, r0.f30052t, r0.f30016J, AnonymousClass1qt.m13430B().m13431A(), r0.f30014H.getApplicationContext()));
            }
        }
        if (r0.f30026T) {
            m15492I(r0, true);
            anonymousClass1qK = r0.f30013G;
            B = new HashMap();
            B.put("tap_point", Integer.valueOf(r0.f30030X));
            B.put("total_navigation_number", Integer.valueOf(r0.f30040h));
            B.put("same_domain_navigation_number", Integer.valueOf(r0.f30037e));
            B.put("number_scrolls", Integer.valueOf(r0.f30032Z));
            AnonymousClass1qK.m13397C(anonymousClass1qK, new AnonymousClass2P7(anonymousClass1qK, url, str, B));
        }
        AnonymousClass1qK anonymousClass1qK3 = r0.f30013G;
        AnonymousClass1qK.m13397C(anonymousClass1qK3, new AnonymousClass2P9(anonymousClass1qK3, r0.f30014H.getApplicationContext()));
        if (r0.f30026T) {
            r0.f30013G.m13403E(r0.f30014H.getApplicationContext());
        }
    }

    public final void onResume() {
        super.onResume();
        BrowserLiteWrapperView browserLiteWrapperView = this.f30011E;
        if (browserLiteWrapperView != null) {
            BrowserLiteWrapperView.m13489B(browserLiteWrapperView);
            BrowserLiteWrapperView.m13490C(browserLiteWrapperView, browserLiteWrapperView.f23442J, 0.7f);
        }
        AnonymousClass1qK anonymousClass1qK = this.f30013G;
        AnonymousClass1qK.m13397C(anonymousClass1qK, new AnonymousClass2PI(anonymousClass1qK, this.f30015I, this.f30024R.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING")));
        AnonymousClass1rN IT = IT();
        if (IT != null) {
            IT.onResume();
            IT.resumeTimers();
        }
        List<AnonymousClass2dD> list = this.f30021O;
        if (list != null) {
            for (AnonymousClass2dD anonymousClass2dD : list) {
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Intent intent = this.f30024R;
        int i = 0;
        if (intent == null || intent.getBooleanExtra("BrowserLiteIntent.EXTRA_ON_SAVED_INSTANCE_STATE_ENABLED", false)) {
            while (i < this.f30044l.size()) {
                Bundle bundle2 = new Bundle();
                ((AnonymousClass1rN) this.f30044l.get(i)).saveState(bundle2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("web_view_");
                stringBuilder.append(i);
                bundle.putBundle(stringBuilder.toString(), bundle2);
                i++;
            }
            bundle.putInt("web_view_number", this.f30044l.size());
        }
    }

    public final String pK() {
        return this.f30015I;
    }

    public final void rMA(int i) {
        AnonymousClass1qb anonymousClass1qb = this.f30008B;
        AnonymousClass1pO anonymousClass1pO = anonymousClass1qb.f23310D;
        if (anonymousClass1pO == null) {
            anonymousClass1pO = anonymousClass1qb.f23311E;
            if (anonymousClass1pO == null) {
                return;
            }
        }
        anonymousClass1pO.setVisibility(i);
    }

    public final void zC(int i) {
        this.f30046n.setVisibility(i);
    }
}
