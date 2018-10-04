package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;

public final class UIManagerHelper {
    public static UIManager getUIManager(ReactContext reactContext, int i) {
        reactContext = reactContext.getCatalystInstance();
        if (i == 2) {
            return (UIManager) reactContext.getJSIModule(UIManager.class);
        }
        return (UIManager) reactContext.getNativeModule(UIManagerModule.class);
    }
}
