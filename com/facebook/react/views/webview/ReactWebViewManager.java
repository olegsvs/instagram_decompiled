package com.facebook.react.views.webview;

import X.AnonymousClass0Df;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView.PictureListener;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.ContentSizeChangeEvent;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.webview.events.TopLoadingErrorEvent;
import com.facebook.react.views.webview.events.TopLoadingFinishEvent;
import com.facebook.react.views.webview.events.TopLoadingStartEvent;
import com.facebook.react.views.webview.events.TopMessageEvent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

@ReactModule(name = "RCTWebView")
public class ReactWebViewManager extends SimpleViewManager {
    public static final String BLANK_URL = "about:blank";
    public static final String BRIDGE_NAME = "__REACT_WEB_VIEW_BRIDGE";
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    public static final String HTML_ENCODING = "UTF-8";
    public static final String HTML_MIME_TYPE = "text/html";
    public static final String HTTP_METHOD_POST = "POST";
    public static final String REACT_CLASS = "RCTWebView";
    public PictureListener mPictureListener;
    public WebViewConfig mWebViewConfig;

    /* renamed from: com.facebook.react.views.webview.ReactWebViewManager$2 */
    public final class C02042 extends WebChromeClient {
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
            callback.invoke(str, true, false);
        }
    }

    /* renamed from: com.facebook.react.views.webview.ReactWebViewManager$3 */
    public final class C02053 implements PictureListener {
        public final void onNewPicture(WebView webView, Picture picture) {
            ReactWebViewManager.dispatchEvent(webView, new ContentSizeChangeEvent(webView.getId(), webView.getWidth(), webView.getContentHeight()));
        }
    }

    public final class ReactWebView extends WebView implements LifecycleEventListener {
        public String injectedJS;
        public ReactWebViewClient mReactWebViewClient;
        public boolean messagingEnabled = false;

        public final class ReactWebViewBridge {
            public ReactWebView mContext;

            public ReactWebViewBridge(ReactWebView reactWebView) {
                this.mContext = reactWebView;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.mContext.onMessage(str);
            }
        }

        public final void onHostPause() {
        }

        public final void onHostResume() {
        }

        public ReactWebView(ThemedReactContext themedReactContext) {
            super(themedReactContext);
        }

        public final void callInjectedJavaScript() {
            if (getSettings().getJavaScriptEnabled()) {
                CharSequence charSequence = this.injectedJS;
                if (charSequence != null && !TextUtils.isEmpty(charSequence)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("(function() {\n");
                    stringBuilder.append(this.injectedJS);
                    stringBuilder.append(";\n})();");
                    evaluateJavascriptWithFallback(stringBuilder.toString());
                }
            }
        }

        public final void cleanupCallbacksAndDestroy() {
            setWebViewClient(null);
            destroy();
        }

        public final ReactWebViewBridge createReactWebViewBridge(ReactWebView reactWebView) {
            return new ReactWebViewBridge(reactWebView);
        }

        public final void evaluateJavascriptWithFallback(String str) {
            if (VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
                return;
            }
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("javascript:");
                stringBuilder.append(URLEncoder.encode(str, "UTF-8"));
                loadUrl(stringBuilder.toString());
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public ReactWebViewClient getReactWebViewClient() {
            return this.mReactWebViewClient;
        }

        public final void linkBridge() {
            if (this.messagingEnabled) {
                evaluateJavascriptWithFallback("(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})");
            }
        }

        public final void onHostDestroy() {
            cleanupCallbacksAndDestroy();
        }

        public final void onMessage(String str) {
            ReactWebViewManager.dispatchEvent(this, new TopMessageEvent(getId(), str));
        }

        public void setInjectedJavaScript(String str) {
            this.injectedJS = str;
        }

        public void setMessagingEnabled(boolean z) {
            if (this.messagingEnabled != z) {
                this.messagingEnabled = z;
                if (z) {
                    addJavascriptInterface(createReactWebViewBridge(this), ReactWebViewManager.BRIDGE_NAME);
                    linkBridge();
                    return;
                }
                removeJavascriptInterface(ReactWebViewManager.BRIDGE_NAME);
            }
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.mReactWebViewClient = (ReactWebViewClient) webViewClient;
        }
    }

    public final class ReactWebViewClient extends WebViewClient {
        public boolean mLastLoadFailed = false;
        public List mOriginWhitelist;
        public ReadableArray mUrlPrefixesForDefaultIntent;

        public final WritableMap createWebViewEvent(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", (double) webView.getId());
            createMap.putString(IgReactNavigatorModule.URL, str);
            String str2 = "loading";
            boolean z = (this.mLastLoadFailed || webView.getProgress() == 100) ? false : true;
            createMap.putBoolean(str2, z);
            createMap.putString(DialogModule.KEY_TITLE, webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        public final void emitFinishEvent(WebView webView, String str) {
            ReactWebViewManager.dispatchEvent(webView, new TopLoadingFinishEvent(webView.getId(), createWebViewEvent(webView, str)));
        }

        private static void launchIntent(Context context, String str) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                intent.addCategory("android.intent.category.BROWSABLE");
                context.startActivity(intent);
            } catch (Context context2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("activity not found to handle uri scheme for: ");
                stringBuilder.append(str);
                AnonymousClass0Df.I("ReactNative", stringBuilder.toString(), context2);
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.mLastLoadFailed) {
                ReactWebView reactWebView = (ReactWebView) webView;
                reactWebView.callInjectedJavaScript();
                reactWebView.linkBridge();
                emitFinishEvent(webView, str);
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.mLastLoadFailed = false;
            ReactWebViewManager.dispatchEvent(webView, new TopLoadingStartEvent(webView.getId(), createWebViewEvent(webView, str)));
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.mLastLoadFailed = true;
            emitFinishEvent(webView, str2);
            WritableMap createWebViewEvent = createWebViewEvent(webView, str2);
            createWebViewEvent.putDouble("code", (double) i);
            createWebViewEvent.putString("description", str);
            ReactWebViewManager.dispatchEvent(webView, new TopLoadingErrorEvent(webView.getId(), createWebViewEvent));
        }

        public final void setOriginWhitelist(List list) {
            this.mOriginWhitelist = list;
        }

        public final void setUrlPrefixesForDefaultIntent(ReadableArray readableArray) {
            this.mUrlPrefixesForDefaultIntent = readableArray;
        }

        private static boolean shouldHandleURL(List list, String str) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme() != null ? parse.getScheme() : JsonProperty.USE_DEFAULT_NAME;
            String authority = parse.getAuthority() != null ? parse.getAuthority() : JsonProperty.USE_DEFAULT_NAME;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(scheme);
            stringBuilder.append("://");
            stringBuilder.append(authority);
            CharSequence stringBuilder2 = stringBuilder.toString();
            for (Pattern matcher : list) {
                if (matcher.matcher(stringBuilder2).matches()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.equals(ReactWebViewManager.BLANK_URL)) {
                ReadableArray readableArray = this.mUrlPrefixesForDefaultIntent;
                if (readableArray != null && readableArray.size() > 0) {
                    ArrayList toArrayList = this.mUrlPrefixesForDefaultIntent.toArrayList();
                    int size = toArrayList.size();
                    for (int i = 0; i < size; i++) {
                        if (str.startsWith((String) toArrayList.get(i))) {
                            break;
                        }
                    }
                }
                List list = this.mOriginWhitelist;
                if (list != null && shouldHandleURL(list, str)) {
                }
                launchIntent(webView.getContext(), str);
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.facebook.react.views.webview.ReactWebViewManager$1 */
    public final class C02511 implements WebViewConfig {
        public final void configWebView(WebView webView) {
        }
    }

    public String getName() {
        return REACT_CLASS;
    }

    public ReactWebViewManager() {
        this.mWebViewConfig = new C02511();
    }

    public ReactWebViewManager(WebViewConfig webViewConfig) {
        this.mWebViewConfig = webViewConfig;
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, WebView webView) {
        webView.setWebViewClient(new ReactWebViewClient());
    }

    public ReactWebView createReactWebViewInstance(ThemedReactContext themedReactContext) {
        return new ReactWebView(themedReactContext);
    }

    public WebView createViewInstance(ThemedReactContext themedReactContext) {
        WebView createReactWebViewInstance = createReactWebViewInstance(themedReactContext);
        createReactWebViewInstance.setWebChromeClient(new C02042());
        themedReactContext.addLifecycleEventListener(createReactWebViewInstance);
        this.mWebViewConfig.configWebView(createReactWebViewInstance);
        WebSettings settings = createReactWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            setAllowUniversalAccessFromFileURLs(createReactWebViewInstance, false);
        }
        setMixedContentMode(createReactWebViewInstance, "never");
        createReactWebViewInstance.setLayoutParams(new LayoutParams(-1, -1));
        setGeolocationEnabled(createReactWebViewInstance, Boolean.valueOf(false));
        return createReactWebViewInstance;
    }

    public static void dispatchEvent(WebView webView, Event event) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(event);
    }

    public Map getCommandsMap() {
        return MapBuilder.of("goBack", Integer.valueOf(1), "goForward", Integer.valueOf(2), "reload", Integer.valueOf(3), "stopLoading", Integer.valueOf(4), "postMessage", Integer.valueOf(5), "injectJavaScript", Integer.valueOf(6));
    }

    public PictureListener getPictureListener() {
        if (this.mPictureListener == null) {
            this.mPictureListener = new C02053();
        }
        return this.mPictureListener;
    }

    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance(webView);
        ReactWebView reactWebView = (ReactWebView) webView;
        ((ThemedReactContext) webView.getContext()).removeLifecycleEventListener(reactWebView);
        reactWebView.cleanupCallbacksAndDestroy();
    }

    public void receiveCommand(WebView webView, int i, ReadableArray readableArray) {
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                try {
                    ReactWebView reactWebView = (ReactWebView) webView;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("(function () {var event;var data = ");
                    stringBuilder.append(jSONObject.toString());
                    stringBuilder.append(";");
                    stringBuilder.append("try {");
                    stringBuilder.append("event = new MessageEvent('message', data);");
                    stringBuilder.append("} catch (e) {");
                    stringBuilder.append("event = document.createEvent('MessageEvent');");
                    stringBuilder.append("event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);");
                    stringBuilder.append("}");
                    stringBuilder.append("document.dispatchEvent(event);");
                    stringBuilder.append("})();");
                    reactWebView.evaluateJavascriptWithFallback(stringBuilder.toString());
                    return;
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            case 6:
                ((ReactWebView) webView).evaluateJavascriptWithFallback(readableArray.getString(0));
                return;
            default:
                return;
        }
    }

    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, Boolean bool) {
        webView = webView.getSettings();
        boolean z = bool != null && bool.booleanValue();
        webView.setAllowFileAccess(z);
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @ReactProp(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, Boolean bool) {
        webView = webView.getSettings();
        boolean z = bool != null && bool.booleanValue();
        webView.setGeolocationEnabled(z);
    }

    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((ReactWebView) webView).setInjectedJavaScript(str);
    }

    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((ReactWebView) webView).setMessagingEnabled(z);
    }

    @ReactProp(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        if (VERSION.SDK_INT >= 21) {
            if (str != null) {
                if (!"never".equals(str)) {
                    if ("always".equals(str)) {
                        webView.getSettings().setMixedContentMode(0);
                        return;
                    } else if ("compatibility".equals(str)) {
                        webView.getSettings().setMixedContentMode(2);
                        return;
                    } else {
                        return;
                    }
                }
            }
            webView.getSettings().setMixedContentMode(1);
        }
    }

    @ReactProp(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z) {
        if (z) {
            webView.setPictureListener(getPictureListener());
        } else {
            webView.setPictureListener(null);
        }
    }

    @ReactProp(name = "originWhitelist")
    public void setOriginWhitelist(WebView webView, ReadableArray readableArray) {
        webView = ((ReactWebView) webView).getReactWebViewClient();
        if (webView != null && readableArray != null) {
            List linkedList = new LinkedList();
            for (int i = 0; i < readableArray.size(); i++) {
                linkedList.add(Pattern.compile(readableArray.getString(i)));
            }
            webView.setOriginWhitelist(linkedList);
        }
    }

    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(z ^ 1);
    }

    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setUseWideViewPort(z ^ 1);
    }

    @com.facebook.react.uimanager.annotations.ReactProp(name = "source")
    public void setSource(android.webkit.WebView r11, com.facebook.react.bridge.ReadableMap r12) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r7 = r11;
        if (r12 == 0) goto L_0x00d1;
    L_0x0003:
        r0 = "html";
        r0 = r12.hasKey(r0);
        if (r0 == 0) goto L_0x0030;
    L_0x000b:
        r0 = "html";
        r9 = r12.getString(r0);
        r0 = "baseUrl";
        r0 = r12.hasKey(r0);
        if (r0 == 0) goto L_0x0028;
    L_0x0019:
        r0 = "baseUrl";
        r8 = r12.getString(r0);
        r10 = "text/html";
        r11 = "UTF-8";
        r12 = 0;
        r7.loadDataWithBaseURL(r8, r9, r10, r11, r12);
        goto L_0x002f;
    L_0x0028:
        r1 = "text/html";
        r0 = "UTF-8";
        r11.loadData(r9, r1, r0);
    L_0x002f:
        return;
    L_0x0030:
        r0 = "uri";
        r0 = r12.hasKey(r0);
        if (r0 == 0) goto L_0x00d1;
    L_0x0038:
        r0 = "uri";
        r6 = r12.getString(r0);
        r0 = r11.getUrl();
        if (r0 == 0) goto L_0x004b;
    L_0x0044:
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x004b;
    L_0x004a:
        goto L_0x002f;
    L_0x004b:
        r0 = "method";
        r0 = r12.hasKey(r0);
        if (r0 == 0) goto L_0x0084;
    L_0x0053:
        r0 = "method";
        r1 = r12.getString(r0);
        r0 = "POST";
        r0 = r1.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x0084;
    L_0x0061:
        r1 = 0;
        r0 = "body";
        r0 = r12.hasKey(r0);
        if (r0 == 0) goto L_0x007b;
    L_0x006a:
        r0 = "body";
        r1 = r12.getString(r0);
        r0 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0077 }
        r1 = r1.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x0077 }
        goto L_0x007b;	 Catch:{ UnsupportedEncodingException -> 0x0077 }
    L_0x0077:
        r1 = r1.getBytes();
    L_0x007b:
        if (r1 != 0) goto L_0x0080;
    L_0x007d:
        r0 = 0;
        r1 = new byte[r0];
    L_0x0080:
        r11.postUrl(r6, r1);
        return;
    L_0x0084:
        r5 = new java.util.HashMap;
        r5.<init>();
        r0 = "headers";
        r0 = r12.hasKey(r0);
        if (r0 == 0) goto L_0x00cd;
    L_0x0091:
        r0 = "headers";
        r4 = r12.getMap(r0);
        r3 = r4.keySetIterator();
    L_0x009b:
        r0 = r3.hasNextKey();
        if (r0 == 0) goto L_0x00cd;
    L_0x00a1:
        r2 = r3.nextKey();
        r1 = "user-agent";
        r0 = java.util.Locale.ENGLISH;
        r0 = r2.toLowerCase(r0);
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00c5;
    L_0x00b3:
        r0 = r11.getSettings();
        if (r0 == 0) goto L_0x009b;
    L_0x00b9:
        r1 = r11.getSettings();
        r0 = r4.getString(r2);
        r1.setUserAgentString(r0);
        goto L_0x009b;
    L_0x00c5:
        r0 = r4.getString(r2);
        r5.put(r2, r0);
        goto L_0x009b;
    L_0x00cd:
        r11.loadUrl(r6, r5);
        return;
    L_0x00d1:
        r0 = "about:blank";
        r11.loadUrl(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.webview.ReactWebViewManager.setSource(android.webkit.WebView, com.facebook.react.bridge.ReadableMap):void");
    }

    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @ReactProp(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        ReactWebViewClient reactWebViewClient = ((ReactWebView) webView).getReactWebViewClient();
        if (reactWebViewClient != null && readableArray != null) {
            reactWebViewClient.setUrlPrefixesForDefaultIntent(readableArray);
        }
    }

    @ReactProp(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            webView.getSettings().setUserAgentString(str);
        }
    }
}
