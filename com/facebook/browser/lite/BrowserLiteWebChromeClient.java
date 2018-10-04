package com.facebook.browser.lite;

import X.AnonymousClass0Ca;
import X.AnonymousClass1pq;
import X.AnonymousClass1ps;
import X.AnonymousClass1pu;
import X.AnonymousClass1pv;
import X.AnonymousClass1rD;
import X.AnonymousClass1rJ;
import X.AnonymousClass1rN;
import X.AnonymousClass1rP;
import X.AnonymousClass2P0;
import X.AnonymousClass2PN;
import X.AnonymousClass2PX;
import X.AnonymousClass2dD;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Build.VERSION;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.facebook.C0164R;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BrowserLiteWebChromeClient extends AnonymousClass1rJ implements OnCompletionListener, OnErrorListener {
    /* renamed from: R */
    private static final String f30059R = "BrowserLiteWebChromeClient";
    /* renamed from: B */
    public boolean f30060B = false;
    /* renamed from: C */
    public FrameLayout f30061C;
    /* renamed from: D */
    public BrowserLiteProgressBar f30062D;
    /* renamed from: E */
    private AnonymousClass2PN f30063E;
    /* renamed from: F */
    private BrowserLiteFragment f30064F;
    /* renamed from: G */
    private List f30065G;
    /* renamed from: H */
    private int f30066H = 0;
    /* renamed from: I */
    private CustomViewCallback f30067I;
    /* renamed from: J */
    private ValueCallback f30068J;
    /* renamed from: K */
    private Intent f30069K;
    /* renamed from: L */
    private AlertDialog f30070L;
    /* renamed from: M */
    private boolean f30071M = false;
    /* renamed from: N */
    private boolean f30072N;
    /* renamed from: O */
    private ValueCallback f30073O;
    /* renamed from: P */
    private VideoView f30074P;
    /* renamed from: Q */
    private AnonymousClass1rN f30075Q;

    public BrowserLiteWebChromeClient(AnonymousClass1rN anonymousClass1rN, BrowserLiteFragment browserLiteFragment, AnonymousClass2PN anonymousClass2PN, String str, boolean z, boolean z2) {
        this.f30075Q = anonymousClass1rN;
        this.f30064F = browserLiteFragment;
        this.f30061C = (FrameLayout) m15534B(this, C0164R.id.frame_full_screen_video);
        this.f30072N = z;
        this.f30071M = z2;
        this.f30065G = AnonymousClass2PX.mo2918B().m13443C(AnonymousClass2dD.class);
        this.f30063E = anonymousClass2PN;
        Activity activity = this.f30064F.getActivity();
        if (activity != null) {
            this.f30069K = activity.getIntent();
        }
        m15540D();
    }

    /* renamed from: A */
    public final void mo2854A() {
        if (VERSION.SDK_INT <= 17) {
            onHideCustomView();
        }
    }

    /* renamed from: B */
    private static View m15534B(BrowserLiteWebChromeClient browserLiteWebChromeClient, int i) {
        return browserLiteWebChromeClient.f30064F.getView().findViewById(i);
    }

    /* renamed from: B */
    public final boolean m15538B(int i, int i2, Intent intent) {
        if (this.f30073O != null && i == 1) {
            Object data = (i2 != -1 || intent == null) ? null : intent.getData();
            this.f30073O.onReceiveValue(data);
            this.f30073O = null;
            return true;
        } else if (this.f30068J == null || i != 2) {
            return false;
        } else {
            this.f30068J.onReceiveValue(FileChooserParams.parseResult(i2, intent));
            this.f30068J = null;
            return true;
        }
    }

    /* renamed from: C */
    private void m15535C() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f30061C;
        r0 = r0.getVisibility();
        r2 = 8;
        if (r0 != r2) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r0 = r3.f30074P;
        r1 = 0;
        if (r0 == 0) goto L_0x0015;
    L_0x0010:
        r0.stopPlayback();
        r3.f30074P = r1;
    L_0x0015:
        r0 = r3.f30067I;
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0.onCustomViewHidden();	 Catch:{ Exception -> 0x001c }
    L_0x001c:
        r3.f30067I = r1;
    L_0x001e:
        r0 = r3.f30061C;
        r0.setVisibility(r2);
        r0 = 1;
        m15536D(r3, r0);
        r0 = r3.f30061C;	 Catch:{ Exception -> 0x002d }
        r0.removeAllViews();	 Catch:{ Exception -> 0x002d }
        goto L_0x0032;	 Catch:{ Exception -> 0x002d }
    L_0x002d:
        r0 = r3.f30061C;	 Catch:{ Exception -> 0x0032 }
        r0.removeAllViews();	 Catch:{ Exception -> 0x0032 }
    L_0x0032:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteWebChromeClient.C():void");
    }

    /* renamed from: C */
    public final boolean m15539C() {
        if ((this.f30061C.getVisibility() == 0 ? 1 : null) == null) {
            return false;
        }
        onHideCustomView();
        return true;
    }

    /* renamed from: D */
    public final void m15540D() {
        AnonymousClass2PN anonymousClass2PN = this.f30063E;
        if (anonymousClass2PN != null) {
            anonymousClass2PN.f30186C.NW();
            return;
        }
        BrowserLiteProgressBar browserLiteProgressBar = (BrowserLiteProgressBar) m15534B(this, C0164R.id.progress_bar);
        this.f30062D = browserLiteProgressBar;
        if (browserLiteProgressBar == null) {
            this.f30062D = (BrowserLiteProgressBar) ((ViewStub) m15534B(this, C0164R.id.progress_bar_stub)).inflate();
        } else {
            browserLiteProgressBar.setVisibility(0);
        }
        this.f30062D.setProgress(0);
        for (AnonymousClass2dD anonymousClass2dD : this.f30065G) {
            int i = 0;
            browserLiteProgressBar = (BrowserLiteProgressBar) anonymousClass2dD.f23360E.findViewById(0);
            anonymousClass2dD.f31745L = browserLiteProgressBar;
            if (browserLiteProgressBar != null && browserLiteProgressBar.getVisibility() == 0) {
                i = 1;
                continue;
            }
            if (i != 0) {
                this.f30062D.setVisibility(8);
                break;
            }
        }
    }

    /* renamed from: D */
    private static void m15536D(BrowserLiteWebChromeClient browserLiteWebChromeClient, boolean z) {
        if (VERSION.SDK_INT < 16) {
            if (z) {
                browserLiteWebChromeClient.f30064F.getActivity().getWindow().clearFlags(DexStore.LOAD_RESULT_MIXED_MODE);
            } else {
                browserLiteWebChromeClient.f30064F.getActivity().getWindow().setFlags(DexStore.LOAD_RESULT_MIXED_MODE, DexStore.LOAD_RESULT_MIXED_MODE);
            }
        } else if (z) {
            browserLiteWebChromeClient.f30064F.getActivity().getWindow().getDecorView().setSystemUiVisibility(0);
        } else {
            browserLiteWebChromeClient.f30064F.getActivity().getWindow().getDecorView().setSystemUiVisibility(4);
        }
    }

    /* renamed from: E */
    public final void m15541E() {
        this.f30062D.setProgress(this.f30066H);
        for (AnonymousClass2dD E : this.f30065G) {
            E.m16596E(this.f30066H);
        }
    }

    public final void onCloseWindow(WebView webView) {
        BrowserLiteFragment browserLiteFragment = this.f30064F;
        if (browserLiteFragment.m15519F(webView)) {
            BrowserLiteFragment.m15493J(browserLiteFragment);
        }
    }

    public final void onCompletion(android.media.MediaPlayer r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r0.onHideCustomView();	 Catch:{ Throwable -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteWebChromeClient.onCompletion(android.media.MediaPlayer):void");
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Object message = consoleMessage.message();
        if (!TextUtils.isEmpty(message)) {
            if (AnonymousClass1pv.f23224B[consoleMessage.messageLevel().ordinal()] == 1) {
                this.f30075Q.f23449C.m13509A(message);
            }
        }
        return true;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        return this.f30064F.m15523J(webView, z2, message);
    }

    public final boolean onError(android.media.MediaPlayer r1, int r2, int r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r0.onHideCustomView();	 Catch:{ Throwable -> 0x0003 }
    L_0x0003:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteWebChromeClient.onError(android.media.MediaPlayer, int, int):boolean");
    }

    public final void onGeolocationPermissionsShowPrompt(java.lang.String r8, android.webkit.GeolocationPermissions.Callback r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = r7.f30064F;
        r6 = r0.getActivity();
        r5 = 0;
        if (r6 != 0) goto L_0x000d;
    L_0x0009:
        r9.invoke(r8, r5, r5);
        return;
    L_0x000d:
        r1 = r7.f30069K;
        if (r1 != 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0009;
    L_0x0012:
        r0 = "BrowserLiteIntent.EXTRA_GEO_LOCATION_PROMPT_ENABLED";
        r4 = 1;
        r0 = r1.getBooleanExtra(r0, r4);
        if (r0 != 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0009;
    L_0x001c:
        r0 = new java.net.URI;	 Catch:{ Exception -> 0x0026 }
        r0.<init>(r8);	 Catch:{ Exception -> 0x0026 }
        r3 = r0.getHost();	 Catch:{ Exception -> 0x0026 }
        goto L_0x0027;	 Catch:{ Exception -> 0x0026 }
    L_0x0026:
        r3 = r8;
    L_0x0027:
        r2 = new android.app.AlertDialog$Builder;
        r2.<init>(r6);
        r1 = 2131689484; // 0x7f0f000c float:1.9007985E38 double:1.0531945416E-314;
        r0 = new java.lang.Object[r4];
        r0[r5] = r3;
        r0 = r6.getString(r1, r0);
        r2 = r2.setMessage(r0);
        r1 = 2131689485; // 0x7f0f000d float:1.9007987E38 double:1.053194542E-314;
        r0 = new X.1po;
        r0.<init>(r7, r9, r8);
        r2 = r2.setPositiveButton(r1, r0);
        r1 = 2131689486; // 0x7f0f000e float:1.9007989E38 double:1.0531945426E-314;
        r0 = new X.1pn;
        r0.<init>(r7, r9, r8);
        r1 = r2.setNegativeButton(r1, r0);
        r0 = new X.1pm;
        r0.<init>(r7, r9, r8);
        r0 = r1.setOnCancelListener(r0);
        r0.show();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteWebChromeClient.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    public final void onHideCustomView() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r0.m15535C();	 Catch:{ Throwable -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteWebChromeClient.onHideCustomView():void");
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        for (AnonymousClass2dD anonymousClass2dD : this.f30065G) {
        }
        return false;
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (this.f30071M) {
            if (permissionRequest != null) {
                if (VERSION.SDK_INT >= 21) {
                    String[] resources = permissionRequest.getResources();
                    if (resources != null && resources.length > 0 && resources.length <= 1) {
                        if ("android.webkit.resource.VIDEO_CAPTURE" == resources[0]) {
                            Context activity = this.f30064F.getActivity();
                            if (activity != null) {
                                if (AnonymousClass0Ca.B(activity, "android.permission.CAMERA") != 0) {
                                    AnonymousClass1rD.m13485E(f30059R, "Does not have camera permission", new Object[0]);
                                } else if (activity.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
                                    this.f30060B = true;
                                    this.f30070L = new Builder(activity).setMessage(activity.getString(C0164R.string.__external__browser_lite_camera_permission_prompt, new Object[]{permissionRequest.getOrigin().getHost()})).setPositiveButton(C0164R.string.__external__browser_lite_permission_allow, new AnonymousClass1pu(this, activity, permissionRequest)).setNegativeButton(C0164R.string.__external__browser_lite_permission_block, new AnonymousClass1ps(this, activity, permissionRequest)).setOnCancelListener(new AnonymousClass1pq(this, activity, permissionRequest)).show();
                                } else {
                                    AnonymousClass1rD.m13485E(f30059R, "Does not have camera", new Object[0]);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        super.onPermissionRequestCanceled(permissionRequest);
        this.f30060B = false;
        AlertDialog alertDialog = this.f30070L;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f30070L.dismiss();
            this.f30070L = null;
        }
    }

    public final void onProgressChanged(WebView webView, int i) {
        this.f30066H = i;
        if (this.f30072N) {
            AnonymousClass2P0 H = BrowserLiteFragment.m15491H(this.f30064F.IT());
            if (H != null) {
                H.m15544A(webView.getUrl());
            }
        }
        if (webView.getVisibility() == 0) {
            AnonymousClass2PN anonymousClass2PN = this.f30063E;
            if (anonymousClass2PN != null) {
                anonymousClass2PN.f30186C.setProgress(i);
            } else {
                this.f30062D.setProgress(i);
                for (AnonymousClass2dD E : this.f30065G) {
                    E.m16596E(i);
                }
            }
            AnonymousClass1rP anonymousClass1rP = this.f30075Q.f23449C;
            if (anonymousClass1rP.f23476B) {
                anonymousClass1rP.f23477C.m13501C("void((function() {try {  if (window.location.href === 'about:blank') {    return;  }  if (!window.performance || !window.performance.timing || !document || !document.body       || document.body.scrollHeight <= 0 || !document.body.children ||       document.body.children.length < 1) {    return;  }  var nvtiming__fb_t = window.performance.timing;  if (nvtiming__fb_t.responseEnd > 0) {    console.log('FBNavResponseEnd:'+nvtiming__fb_t.responseEnd);  }  if (nvtiming__fb_t.domContentLoadedEventStart > 0) {    console.log('FBNavDomContentLoaded:'+nvtiming__fb_t.domContentLoadedEventStart);  }  if (nvtiming__fb_t.loadEventEnd > 0) {    console.log('FBNavLoadEventEnd:'+nvtiming__fb_t.loadEventEnd);  }  var nvtiming__fb_html = document.getElementsByTagName('html')[0];  if (nvtiming__fb_html) {    var nvtiming__fb_html_amp = nvtiming__fb_html.hasAttribute('amp') ||        nvtiming__fb_html.hasAttribute(\"\\u26A1\");    console.log('FBNavAmpDetect:'+nvtiming__fb_html_amp);  }}catch(err){  console.log('fb_navigation_timing_error:'+err.message);}})());", true, null);
            }
        }
    }

    public final void onReceivedTitle(WebView webView, String str) {
        String obj;
        if (str != null) {
            if (!ReactWebViewManager.BLANK_URL.equals(str)) {
                obj = Html.fromHtml(str).toString();
                if (VERSION.SDK_INT < 19) {
                    ((AnonymousClass1rN) webView).setTitle(obj);
                }
                if (webView.getVisibility() == 0) {
                    this.f30064F.m15530Q(obj);
                }
            }
        }
        obj = null;
        if (VERSION.SDK_INT < 19) {
            ((AnonymousClass1rN) webView).setTitle(obj);
        }
        if (webView.getVisibility() == 0) {
            this.f30064F.m15530Q(obj);
        }
    }

    public final void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        try {
            if (view instanceof FrameLayout) {
                this.f30061C.addView(view);
                this.f30061C.setVisibility(0);
                m15536D(this, false);
                this.f30067I = customViewCallback;
                View focusedChild = ((FrameLayout) view).getFocusedChild();
                if (focusedChild instanceof VideoView) {
                    this.f30074P = (VideoView) focusedChild;
                    this.f30074P.setOnCompletionListener(this);
                    this.f30074P.setOnErrorListener(this);
                }
            }
        } catch (Throwable th) {
            AnonymousClass1rD.m13483C(f30059R, th, "Failed enter fullscreen %s", th.getMessage());
        }
    }

    public boolean onShowFileChooser(android.webkit.WebView r6, android.webkit.ValueCallback r7, android.webkit.WebChromeClient.FileChooserParams r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r5.f30068J;
        r4 = 0;
        if (r0 == 0) goto L_0x000a;
    L_0x0005:
        r0.onReceiveValue(r4);
        r5.f30068J = r4;
    L_0x000a:
        r5.f30068J = r7;
        r2 = r8.createIntent();
        r1 = r5.f30064F;	 Catch:{ ActivityNotFoundException -> 0x0018 }
        r0 = 2;	 Catch:{ ActivityNotFoundException -> 0x0018 }
        r1.startActivityForResult(r2, r0);	 Catch:{ ActivityNotFoundException -> 0x0018 }
        r0 = 1;	 Catch:{ ActivityNotFoundException -> 0x0018 }
        return r0;	 Catch:{ ActivityNotFoundException -> 0x0018 }
    L_0x0018:
        r3 = f30059R;
        r2 = "failed to resolve activity";
        r1 = 0;
        r0 = new java.lang.Object[r1];
        X.AnonymousClass1rD.m13482B(r3, r2, r0);
        r5.f30068J = r4;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteWebChromeClient.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }

    public void openFileChooser(ValueCallback valueCallback, String str) {
        openFileChooser(valueCallback, str, JsonProperty.USE_DEFAULT_NAME);
    }

    public void openFileChooser(android.webkit.ValueCallback r2, java.lang.String r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r1.f30073O = r2;
        r2 = new android.content.Intent;
        r0 = "android.intent.action.GET_CONTENT";
        r2.<init>(r0);
        r0 = "android.intent.category.OPENABLE";
        r2.addCategory(r0);
        r2.setType(r3);
        r1 = r1.f30064F;	 Catch:{ ActivityNotFoundException -> 0x0017 }
        r0 = 1;	 Catch:{ ActivityNotFoundException -> 0x0017 }
        r1.startActivityForResult(r2, r0);	 Catch:{ ActivityNotFoundException -> 0x0017 }
    L_0x0017:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteWebChromeClient.openFileChooser(android.webkit.ValueCallback, java.lang.String, java.lang.String):void");
    }
}
