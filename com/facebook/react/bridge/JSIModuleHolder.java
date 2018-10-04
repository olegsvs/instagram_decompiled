package com.facebook.react.bridge;

public final class JSIModuleHolder {
    private JSIModule mModule;
    private final JSIModuleSpec mSpec;

    public JSIModuleHolder(JSIModuleSpec jSIModuleSpec) {
        this.mSpec = jSIModuleSpec;
    }

    public final JSIModule getJSIModule() {
        if (this.mModule == null) {
            synchronized (this) {
                if (this.mModule != null) {
                    JSIModule jSIModule = this.mModule;
                    return jSIModule;
                }
                this.mModule = this.mSpec.getJSIModuleProvider().get();
                this.mModule.initialize();
            }
        }
        return this.mModule;
    }

    public final void notifyJSInstanceDestroy() {
        JSIModule jSIModule = this.mModule;
        if (jSIModule != null) {
            jSIModule.onCatalystInstanceDestroy();
        }
    }
}
