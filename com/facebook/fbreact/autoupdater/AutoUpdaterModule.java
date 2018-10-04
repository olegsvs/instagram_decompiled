package com.facebook.fbreact.autoupdater;

import X.AnonymousClass5dt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "AutoUpdater")
public final class AutoUpdaterModule extends ReactContextBaseJavaModule {
    public static final String NAME = "AutoUpdater";
    private static final String REACT_BUNDLE_VERSION_KEY = "reactBundleVersion";

    public String getName() {
        return NAME;
    }

    public AutoUpdaterModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public Map getConstants() {
        Map hashMap = new HashMap();
        hashMap.put(REACT_BUNDLE_VERSION_KEY, Integer.valueOf(new AnonymousClass5dt(getReactApplicationContext()).f67669E));
        return hashMap;
    }
}
