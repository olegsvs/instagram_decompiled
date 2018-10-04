package com.facebook.react.modules.debug;

import X.AnonymousClass0LR;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "SourceCode")
public class SourceCodeModule extends BaseJavaModule {
    public static final String NAME = "SourceCode";
    private final ReactContext mReactContext;

    public String getName() {
        return NAME;
    }

    public SourceCodeModule(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    public Map getConstants() {
        Map hashMap = new HashMap();
        hashMap.put("scriptURL", (String) AnonymousClass0LR.E(this.mReactContext.getCatalystInstance().getSourceURL(), "No source URL loaded, have you initialised the instance?"));
        return hashMap;
    }
}
