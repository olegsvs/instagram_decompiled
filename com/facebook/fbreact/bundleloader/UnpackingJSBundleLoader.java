package com.facebook.fbreact.bundleloader;

import X.AnonymousClass00p;
import X.AnonymousClass0LR;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;

public final class UnpackingJSBundleLoader extends JSBundleLoader {
    private final JSBundleLoader mDelegate;
    private AnonymousClass00p mUnpacker;

    public UnpackingJSBundleLoader(JSBundleLoader jSBundleLoader, AnonymousClass00p anonymousClass00p) {
        this.mDelegate = (JSBundleLoader) AnonymousClass0LR.D(jSBundleLoader);
        this.mUnpacker = (AnonymousClass00p) AnonymousClass0LR.D(anonymousClass00p);
    }

    public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
        unpack();
        return this.mDelegate.loadScript(catalystInstanceImpl);
    }

    public final synchronized void unpack() {
        if (this.mUnpacker != null) {
            ReactMarker.logMarker(ReactMarkerConstants.UNPACKING_JS_BUNDLE_LOADER_CHECK_START);
            if (this.mUnpacker.A()) {
                ReactMarker.logMarker(ReactMarkerConstants.UNPACKING_JS_BUNDLE_LOADER_BLOCKED);
            }
            if (this.mUnpacker.B()) {
                ReactMarker.logMarker(ReactMarkerConstants.UNPACKING_JS_BUNDLE_LOADER_EXTRACTED);
            }
            ReactMarker.logMarker(ReactMarkerConstants.UNPACKING_JS_BUNDLE_LOADER_CHECK_END);
            this.mUnpacker = null;
        }
    }
}
