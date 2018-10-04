package com.facebook.react;

import X.AnonymousClass0LR;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptExecutorFactory;

public final class ReactInstanceManager$ReactContextInitParams {
    private final JSBundleLoader mJsBundleLoader;
    private final JavaScriptExecutorFactory mJsExecutorFactory;
    public final /* synthetic */ ReactInstanceManager this$0;

    public ReactInstanceManager$ReactContextInitParams(ReactInstanceManager reactInstanceManager, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        this.this$0 = reactInstanceManager;
        this.mJsExecutorFactory = (JavaScriptExecutorFactory) AnonymousClass0LR.D(javaScriptExecutorFactory);
        this.mJsBundleLoader = (JSBundleLoader) AnonymousClass0LR.D(jSBundleLoader);
    }

    public final JSBundleLoader getJsBundleLoader() {
        return this.mJsBundleLoader;
    }

    public final JavaScriptExecutorFactory getJsExecutorFactory() {
        return this.mJsExecutorFactory;
    }
}
