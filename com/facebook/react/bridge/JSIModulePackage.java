package com.facebook.react.bridge;

import java.util.List;

public interface JSIModulePackage {
    List getJSIModules(ReactApplicationContext reactApplicationContext, JavaScriptContextHolder javaScriptContextHolder);
}
