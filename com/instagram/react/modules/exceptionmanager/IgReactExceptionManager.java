package com.instagram.react.modules.exceptionmanager;

import X.AnonymousClass0Gn;
import X.AnonymousClass0Il;
import X.AnonymousClass0Im;
import X.AnonymousClass5sH;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.util.JSStackTrace;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ReactModule(canOverrideExistingModule = true, name = "ExceptionsManager", needsEagerInit = true)
public class IgReactExceptionManager extends BaseJavaModule implements NativeModuleCallExceptionHandler {
    private static final String ERROR_CATEGORY_PREFIX = "IG React Native JS: ";
    public static final String MODULE_NAME = "ExceptionsManager";
    private static IgReactExceptionManager sInstance;
    private final Set mExceptionHandlers = Collections.synchronizedSet(new HashSet());

    public boolean canOverrideExistingModule() {
        return true;
    }

    public String getName() {
        return "ExceptionsManager";
    }

    private IgReactExceptionManager() {
    }

    public void addExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        UiThreadUtil.assertOnUiThread();
        this.mExceptionHandlers.add(nativeModuleCallExceptionHandler);
    }

    public static IgReactExceptionManager getInstance() {
        if (sInstance == null) {
            sInstance = new IgReactExceptionManager();
        }
        return sInstance;
    }

    public void handleException(Exception exception) {
        AnonymousClass0Im reactInstanceHolder = AnonymousClass0Il.getInstance().getReactInstanceHolder();
        if (reactInstanceHolder != null) {
            ReactInstanceManager reactInstanceManager = reactInstanceHolder.f2834J;
            if (reactInstanceManager != null) {
                DevSupportManager devSupportManager = reactInstanceManager.getDevSupportManager();
                if (devSupportManager == null || !devSupportManager.getDevSupportEnabled()) {
                    synchronized (this.mExceptionHandlers) {
                        if (!this.mExceptionHandlers.isEmpty()) {
                            AnonymousClass0Gn B = AnonymousClass0Gn.B();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(ERROR_CATEGORY_PREFIX);
                            stringBuilder.append(exception.getMessage());
                            B.E(stringBuilder.toString(), exception);
                            reactInstanceHolder.A();
                            UiThreadUtil.runOnUiThread(new AnonymousClass5sH(this, new HashSet(this.mExceptionHandlers), exception));
                        } else if (exception instanceof RuntimeException) {
                            throw ((RuntimeException) exception);
                        } else {
                            throw new RuntimeException(exception);
                        }
                    }
                    return;
                }
                devSupportManager.showNewJavaError(exception.getMessage(), exception);
            }
        }
    }

    public void removeExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        UiThreadUtil.assertOnUiThread();
        this.mExceptionHandlers.remove(nativeModuleCallExceptionHandler);
    }

    @ReactMethod
    public void reportFatalException(String str, ReadableArray readableArray, int i) {
        AnonymousClass0Im reactInstanceHolder = AnonymousClass0Il.getInstance().getReactInstanceHolder();
        if (reactInstanceHolder != null) {
            ReactInstanceManager reactInstanceManager = reactInstanceHolder.f2834J;
            if (reactInstanceManager != null) {
                DevSupportManager devSupportManager = reactInstanceManager.getDevSupportManager();
                if (devSupportManager == null || !devSupportManager.getDevSupportEnabled()) {
                    throw new JavascriptException(JSStackTrace.format(str, readableArray));
                }
                devSupportManager.showNewJSError(str, readableArray, i);
            }
        }
    }

    @ReactMethod
    public void reportSoftException(String str, ReadableArray readableArray, int i) {
        AnonymousClass0Im reactInstanceHolder = AnonymousClass0Il.getInstance().getReactInstanceHolder();
        if (reactInstanceHolder != null) {
            ReactInstanceManager reactInstanceManager = reactInstanceHolder.f2834J;
            if (reactInstanceManager != null) {
                DevSupportManager devSupportManager = reactInstanceManager.getDevSupportManager();
                if (devSupportManager == null || !devSupportManager.getDevSupportEnabled()) {
                    AnonymousClass0Gn B = AnonymousClass0Gn.B();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(ERROR_CATEGORY_PREFIX);
                    stringBuilder.append(str);
                    B.D(stringBuilder.toString(), JSStackTrace.format(str, readableArray));
                    return;
                }
                devSupportManager.showNewJSError(str, readableArray, i);
            }
        }
    }

    @ReactMethod
    public void updateExceptionMessage(String str, ReadableArray readableArray, int i) {
        AnonymousClass0Im reactInstanceHolder = AnonymousClass0Il.getInstance().getReactInstanceHolder();
        if (reactInstanceHolder != null) {
            ReactInstanceManager reactInstanceManager = reactInstanceHolder.f2834J;
            if (reactInstanceManager != null) {
                DevSupportManager devSupportManager = reactInstanceManager.getDevSupportManager();
                if (devSupportManager != null && devSupportManager.getDevSupportEnabled()) {
                    devSupportManager.updateJSError(str, readableArray, i);
                }
            }
        }
    }
}
