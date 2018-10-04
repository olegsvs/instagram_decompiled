package com.facebook.react.devsupport.interfaces;

import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;

public interface DevSupportManager extends NativeModuleCallExceptionHandler {
    DeveloperSettings getDevSettings();

    boolean getDevSupportEnabled();

    String getDownloadedJSBundleFile();

    String getSourceUrl();

    void handleReloadJS();

    boolean hasUpToDateJSBundleInCache();

    void hideRedboxDialog();

    void isPackagerRunning(PackagerStatusCallback packagerStatusCallback);

    void onNewReactContextCreated(ReactContext reactContext);

    void onReactInstanceDestroyed(ReactContext reactContext);

    void setDevSupportEnabled(boolean z);

    void showDevOptionsDialog();

    void showNewJSError(String str, ReadableArray readableArray, int i);

    void showNewJavaError(String str, Throwable th);

    void startInspector();

    void stopInspector();

    void updateJSError(String str, ReadableArray readableArray, int i);
}
