package com.facebook.react.bridge;

public interface JSIModuleSpec {
    Class getJSIModuleClass();

    JSIModuleProvider getJSIModuleProvider();
}
