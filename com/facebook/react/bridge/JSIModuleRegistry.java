package com.facebook.react.bridge;

import X.AnonymousClass0LR;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class JSIModuleRegistry {
    private final Map mModules = new HashMap();

    public final JSIModule getModule(Class cls) {
        JSIModuleHolder jSIModuleHolder = (JSIModuleHolder) this.mModules.get(cls);
        if (jSIModuleHolder != null) {
            return (JSIModule) AnonymousClass0LR.D(jSIModuleHolder.getJSIModule());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to find JSIModule for class ");
        stringBuilder.append(cls);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void notifyJSInstanceDestroy() {
        for (JSIModuleHolder notifyJSInstanceDestroy : this.mModules.values()) {
            notifyJSInstanceDestroy.notifyJSInstanceDestroy();
        }
    }

    public final void registerModules(List list) {
        for (JSIModuleSpec jSIModuleSpec : list) {
            this.mModules.put(jSIModuleSpec.getJSIModuleClass(), new JSIModuleHolder(jSIModuleSpec));
        }
    }
}
