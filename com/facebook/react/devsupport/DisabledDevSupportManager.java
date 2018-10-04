package com.facebook.react.devsupport;

import com.facebook.react.bridge.DefaultNativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;

public final class DisabledDevSupportManager implements DevSupportManager {
    private final DefaultNativeModuleCallExceptionHandler mDefaultNativeModuleCallExceptionHandler = new DefaultNativeModuleCallExceptionHandler();

    public final DeveloperSettings getDevSettings() {
        return null;
    }

    public final boolean getDevSupportEnabled() {
        return false;
    }

    public final String getDownloadedJSBundleFile() {
        return null;
    }

    public final String getSourceUrl() {
        return null;
    }

    public final void handleReloadJS() {
    }

    public final boolean hasUpToDateJSBundleInCache() {
        return false;
    }

    public final void hideRedboxDialog() {
    }

    public final void isPackagerRunning(PackagerStatusCallback packagerStatusCallback) {
    }

    public final void onNewReactContextCreated(ReactContext reactContext) {
    }

    public final void onReactInstanceDestroyed(ReactContext reactContext) {
    }

    public final void setDevSupportEnabled(boolean z) {
    }

    public final void showDevOptionsDialog() {
    }

    public final void showNewJSError(String str, ReadableArray readableArray, int i) {
    }

    public final void showNewJavaError(String str, Throwable th) {
    }

    public final void startInspector() {
    }

    public final void stopInspector() {
    }

    public final void updateJSError(String str, ReadableArray readableArray, int i) {
    }

    public final void handleException(Exception exception) {
        this.mDefaultNativeModuleCallExceptionHandler.handleException(exception);
    }
}
