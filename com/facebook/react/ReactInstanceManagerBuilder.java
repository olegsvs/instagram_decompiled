package com.facebook.react;

import X.AnonymousClass0LR;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSCJavaScriptExecutorFactory;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ReactInstanceManagerBuilder {
    private Application mApplication;
    private NotThreadSafeBridgeIdleDebugListener mBridgeIdleDebugListener;
    private Activity mCurrentActivity;
    private Map mCustomPackagerCommandHandlers;
    private DefaultHardwareBackBtnHandler mDefaultHardwareBackBtnHandler;
    private DevBundleDownloadListener mDevBundleDownloadListener;
    private LifecycleState mInitialLifecycleState;
    private String mJSBundleAssetUrl;
    private JSBundleLoader mJSBundleLoader;
    private JSIModulePackage mJSIModulesPackage;
    private String mJSMainModulePath;
    private JavaScriptExecutorFactory mJavaScriptExecutorFactory;
    private boolean mLazyViewManagersEnabled;
    private int mMinNumShakes = 1;
    private int mMinTimeLeftInFrameForNonBatchedOperationMs = -1;
    private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private final List mPackages = new ArrayList();
    private RedBoxHandler mRedBoxHandler;
    private boolean mUseDeveloperSupport;

    public final ReactInstanceManagerBuilder addPackage(ReactPackage reactPackage) {
        this.mPackages.add(reactPackage);
        return this;
    }

    public final ReactInstanceManager build() {
        boolean z;
        String packageName;
        String friendlyDeviceName;
        Context context;
        Activity activity;
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler;
        JavaScriptExecutorFactory javaScriptExecutorFactory;
        JSBundleLoader createAssetLoader;
        String str;
        List list;
        boolean z2;
        NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener;
        LifecycleState lifecycleState;
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler;
        RedBoxHandler redBoxHandler;
        AnonymousClass0LR.E(this.mApplication, "Application property has not been set with this builder");
        boolean z3 = true;
        if (!this.mUseDeveloperSupport && r0.mJSBundleAssetUrl == null) {
            if (r0.mJSBundleLoader == null) {
                z = false;
                AnonymousClass0LR.C(z, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
                if (r0.mJSMainModulePath == null && r0.mJSBundleAssetUrl == null) {
                    if (r0.mJSBundleLoader != null) {
                        z3 = false;
                    }
                }
                AnonymousClass0LR.C(z3, "Either MainModulePath or JS Bundle File needs to be provided");
                packageName = r0.mApplication.getPackageName();
                friendlyDeviceName = AndroidInfoHelpers.getFriendlyDeviceName();
                context = r0.mApplication;
                activity = r0.mCurrentActivity;
                defaultHardwareBackBtnHandler = r0.mDefaultHardwareBackBtnHandler;
                javaScriptExecutorFactory = r0.mJavaScriptExecutorFactory;
                if (javaScriptExecutorFactory == null) {
                    javaScriptExecutorFactory = new JSCJavaScriptExecutorFactory(packageName, friendlyDeviceName);
                }
                if (r0.mJSBundleLoader == null) {
                    friendlyDeviceName = r0.mJSBundleAssetUrl;
                    if (friendlyDeviceName != null) {
                        createAssetLoader = JSBundleLoader.createAssetLoader(r0.mApplication, friendlyDeviceName, false);
                        str = r0.mJSMainModulePath;
                        list = r0.mPackages;
                        z2 = r0.mUseDeveloperSupport;
                        notThreadSafeBridgeIdleDebugListener = r0.mBridgeIdleDebugListener;
                        lifecycleState = (LifecycleState) AnonymousClass0LR.E(r0.mInitialLifecycleState, "Initial lifecycle state was not set");
                        nativeModuleCallExceptionHandler = r0.mNativeModuleCallExceptionHandler;
                        redBoxHandler = r0.mRedBoxHandler;
                        return new ReactInstanceManager(context, activity, defaultHardwareBackBtnHandler, javaScriptExecutorFactory, createAssetLoader, str, list, z2, notThreadSafeBridgeIdleDebugListener, lifecycleState, nativeModuleCallExceptionHandler, redBoxHandler, r0.mLazyViewManagersEnabled, r0.mDevBundleDownloadListener, r0.mMinNumShakes, r0.mMinTimeLeftInFrameForNonBatchedOperationMs, r0.mJSIModulesPackage, r0.mCustomPackagerCommandHandlers);
                    }
                }
                createAssetLoader = r0.mJSBundleLoader;
                str = r0.mJSMainModulePath;
                list = r0.mPackages;
                z2 = r0.mUseDeveloperSupport;
                notThreadSafeBridgeIdleDebugListener = r0.mBridgeIdleDebugListener;
                lifecycleState = (LifecycleState) AnonymousClass0LR.E(r0.mInitialLifecycleState, "Initial lifecycle state was not set");
                nativeModuleCallExceptionHandler = r0.mNativeModuleCallExceptionHandler;
                redBoxHandler = r0.mRedBoxHandler;
                return new ReactInstanceManager(context, activity, defaultHardwareBackBtnHandler, javaScriptExecutorFactory, createAssetLoader, str, list, z2, notThreadSafeBridgeIdleDebugListener, lifecycleState, nativeModuleCallExceptionHandler, redBoxHandler, r0.mLazyViewManagersEnabled, r0.mDevBundleDownloadListener, r0.mMinNumShakes, r0.mMinTimeLeftInFrameForNonBatchedOperationMs, r0.mJSIModulesPackage, r0.mCustomPackagerCommandHandlers);
            }
        }
        z = true;
        AnonymousClass0LR.C(z, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (r0.mJSBundleLoader != null) {
            z3 = false;
        }
        AnonymousClass0LR.C(z3, "Either MainModulePath or JS Bundle File needs to be provided");
        packageName = r0.mApplication.getPackageName();
        friendlyDeviceName = AndroidInfoHelpers.getFriendlyDeviceName();
        context = r0.mApplication;
        activity = r0.mCurrentActivity;
        defaultHardwareBackBtnHandler = r0.mDefaultHardwareBackBtnHandler;
        javaScriptExecutorFactory = r0.mJavaScriptExecutorFactory;
        if (javaScriptExecutorFactory == null) {
            javaScriptExecutorFactory = new JSCJavaScriptExecutorFactory(packageName, friendlyDeviceName);
        }
        if (r0.mJSBundleLoader == null) {
            friendlyDeviceName = r0.mJSBundleAssetUrl;
            if (friendlyDeviceName != null) {
                createAssetLoader = JSBundleLoader.createAssetLoader(r0.mApplication, friendlyDeviceName, false);
                str = r0.mJSMainModulePath;
                list = r0.mPackages;
                z2 = r0.mUseDeveloperSupport;
                notThreadSafeBridgeIdleDebugListener = r0.mBridgeIdleDebugListener;
                lifecycleState = (LifecycleState) AnonymousClass0LR.E(r0.mInitialLifecycleState, "Initial lifecycle state was not set");
                nativeModuleCallExceptionHandler = r0.mNativeModuleCallExceptionHandler;
                redBoxHandler = r0.mRedBoxHandler;
                return new ReactInstanceManager(context, activity, defaultHardwareBackBtnHandler, javaScriptExecutorFactory, createAssetLoader, str, list, z2, notThreadSafeBridgeIdleDebugListener, lifecycleState, nativeModuleCallExceptionHandler, redBoxHandler, r0.mLazyViewManagersEnabled, r0.mDevBundleDownloadListener, r0.mMinNumShakes, r0.mMinTimeLeftInFrameForNonBatchedOperationMs, r0.mJSIModulesPackage, r0.mCustomPackagerCommandHandlers);
            }
        }
        createAssetLoader = r0.mJSBundleLoader;
        str = r0.mJSMainModulePath;
        list = r0.mPackages;
        z2 = r0.mUseDeveloperSupport;
        notThreadSafeBridgeIdleDebugListener = r0.mBridgeIdleDebugListener;
        lifecycleState = (LifecycleState) AnonymousClass0LR.E(r0.mInitialLifecycleState, "Initial lifecycle state was not set");
        nativeModuleCallExceptionHandler = r0.mNativeModuleCallExceptionHandler;
        redBoxHandler = r0.mRedBoxHandler;
        return new ReactInstanceManager(context, activity, defaultHardwareBackBtnHandler, javaScriptExecutorFactory, createAssetLoader, str, list, z2, notThreadSafeBridgeIdleDebugListener, lifecycleState, nativeModuleCallExceptionHandler, redBoxHandler, r0.mLazyViewManagersEnabled, r0.mDevBundleDownloadListener, r0.mMinNumShakes, r0.mMinTimeLeftInFrameForNonBatchedOperationMs, r0.mJSIModulesPackage, r0.mCustomPackagerCommandHandlers);
    }

    public final ReactInstanceManagerBuilder setApplication(Application application) {
        this.mApplication = application;
        return this;
    }

    public final ReactInstanceManagerBuilder setInitialLifecycleState(LifecycleState lifecycleState) {
        this.mInitialLifecycleState = lifecycleState;
        return this;
    }

    public final ReactInstanceManagerBuilder setJSBundleFile(String str) {
        if (!str.startsWith("assets://")) {
            return setJSBundleLoader(JSBundleLoader.createFileLoader(str));
        }
        this.mJSBundleAssetUrl = str;
        this.mJSBundleLoader = null;
        return this;
    }

    public final ReactInstanceManagerBuilder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
        this.mJSBundleLoader = jSBundleLoader;
        this.mJSBundleAssetUrl = null;
        return this;
    }

    public final ReactInstanceManagerBuilder setJSMainModulePath(String str) {
        this.mJSMainModulePath = str;
        return this;
    }

    public final ReactInstanceManagerBuilder setJavaScriptExecutorFactory(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.mJavaScriptExecutorFactory = javaScriptExecutorFactory;
        return this;
    }

    public final ReactInstanceManagerBuilder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        return this;
    }

    public final ReactInstanceManagerBuilder setUseDeveloperSupport(boolean z) {
        this.mUseDeveloperSupport = z;
        return this;
    }
}
