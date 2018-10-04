package com.facebook.react;

import X.AnonymousClass09A;
import X.AnonymousClass09H;
import X.AnonymousClass0CF;
import X.AnonymousClass0CM;
import X.AnonymousClass0Df;
import X.AnonymousClass0LR;
import X.AnonymousClass0mE;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeDeltaClient;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.ReactInstanceManagerDevHelper;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class ReactInstanceManager {
    private final Context mApplicationContext;
    private final List mAttachedRootViews = Collections.synchronizedList(new ArrayList());
    private final NotThreadSafeBridgeIdleDebugListener mBridgeIdleDebugListener;
    private final JSBundleLoader mBundleLoader;
    private volatile Thread mCreateReactContextThread;
    private Activity mCurrentActivity;
    private volatile ReactContext mCurrentReactContext;
    private DefaultHardwareBackBtnHandler mDefaultBackButtonImpl;
    public final DevSupportManager mDevSupportManager;
    private volatile boolean mHasStartedCreatingInitialContext = false;
    public volatile Boolean mHasStartedDestroying = Boolean.valueOf(false);
    private final JSIModulePackage mJSIModulePackage;
    private final String mJSMainModulePath;
    private final JavaScriptExecutorFactory mJavaScriptExecutorFactory;
    private volatile LifecycleState mLifecycleState;
    private final MemoryPressureRouter mMemoryPressureRouter;
    private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private final List mPackages;
    public ReactInstanceManager$ReactContextInitParams mPendingReactContextInitParams;
    private final Object mReactContextLock = new Object();
    private final Collection mReactInstanceEventListeners = Collections.synchronizedSet(new HashSet());
    private final boolean mUseDeveloperSupport;
    private List mViewManagers;

    public ReactInstanceManager(Context context, Activity activity, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List list, boolean z, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, RedBoxHandler redBoxHandler, boolean z2, DevBundleDownloadListener devBundleDownloadListener, int i, int i2, JSIModulePackage jSIModulePackage, Map map) {
        Context context2 = context;
        initializeSoLoaderIfNecessary(context);
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(context);
        this.mApplicationContext = context;
        this.mCurrentActivity = activity;
        this.mDefaultBackButtonImpl = defaultHardwareBackBtnHandler;
        this.mJavaScriptExecutorFactory = javaScriptExecutorFactory;
        this.mBundleLoader = jSBundleLoader;
        this.mJSMainModulePath = str;
        this.mPackages = new ArrayList();
        boolean z3 = z;
        this.mUseDeveloperSupport = z3;
        AnonymousClass09H.m584B(8192, "ReactInstanceManager.initDevSupportManager", 68196311);
        DevBundleDownloadListener devBundleDownloadListener2 = devBundleDownloadListener;
        RedBoxHandler redBoxHandler2 = redBoxHandler;
        this.mDevSupportManager = DevSupportManagerFactory.create(context2, createDevHelperInterface(), this.mJSMainModulePath, z3, redBoxHandler2, devBundleDownloadListener2, i, map);
        AnonymousClass09H.m585C(8192, -612635047);
        this.mBridgeIdleDebugListener = notThreadSafeBridgeIdleDebugListener;
        this.mLifecycleState = lifecycleState;
        this.mMemoryPressureRouter = new MemoryPressureRouter(context);
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        synchronized (this.mPackages) {
            this.mPackages.add(new CoreModulesPackage(this, new ReactInstanceManager$1(this), z2, i2));
            if (this.mUseDeveloperSupport) {
                this.mPackages.add(new DebugCorePackage());
            }
            this.mPackages.addAll(list);
        }
        this.mJSIModulePackage = jSIModulePackage;
        ReactChoreographer.initialize();
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.startInspector();
        }
    }

    public final void addReactInstanceEventListener(ReactInstanceManager$ReactInstanceEventListener reactInstanceManager$ReactInstanceEventListener) {
        this.mReactInstanceEventListeners.add(reactInstanceManager$ReactInstanceEventListener);
    }

    public final void attachRootView(ReactRootView reactRootView) {
        UiThreadUtil.assertOnUiThread();
        this.mAttachedRootViews.add(reactRootView);
        reactRootView.removeAllViews();
        reactRootView.setId(-1);
        ReactContext currentReactContext = getCurrentReactContext();
        if (this.mCreateReactContextThread == null && currentReactContext != null) {
            attachRootViewToInstance(reactRootView, currentReactContext.getCatalystInstance());
        }
    }

    private void attachRootViewToInstance(ReactRootView reactRootView, CatalystInstance catalystInstance) {
        AnonymousClass09H.m584B(8192, "attachRootViewToInstance", -1028182079);
        int addRootView = UIManagerHelper.getUIManager(this.mCurrentReactContext, reactRootView.getUIManagerType()).addRootView(reactRootView);
        reactRootView.setRootViewTag(addRootView);
        reactRootView.runApplication();
        AnonymousClass0CM.m885B(8192, "pre_rootView.onAttachedToReactInstance", addRootView);
        UiThreadUtil.runOnUiThread(new ReactInstanceManager$9(this, addRootView, reactRootView));
        AnonymousClass09H.m585C(8192, -959580729);
    }

    public static ReactInstanceManagerBuilder builder() {
        return new ReactInstanceManagerBuilder();
    }

    private ReactInstanceManagerDevHelper createDevHelperInterface() {
        return new ReactInstanceManager$2(this);
    }

    public static ReactApplicationContext createReactContext(ReactInstanceManager reactInstanceManager, JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactContext reactApplicationContext = new ReactApplicationContext(reactInstanceManager.mApplicationContext);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = reactInstanceManager.mNativeModuleCallExceptionHandler;
        if (nativeModuleCallExceptionHandler == null) {
            nativeModuleCallExceptionHandler = reactInstanceManager.mDevSupportManager;
        }
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        NativeModuleRegistry processPackages = reactInstanceManager.processPackages(reactApplicationContext, reactInstanceManager.mPackages, false);
        ReactQueueConfigurationSpec createDefault = ReactQueueConfigurationSpec.createDefault();
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        long j = 8192;
        AnonymousClass09H.m584B(8192, "createCatalystInstance", 1387698763);
        try {
            CatalystInstance catalystInstanceImpl = new CatalystInstanceImpl((ReactQueueConfigurationSpec) AnonymousClass0LR.m2961D(createDefault), (JavaScriptExecutor) AnonymousClass0LR.m2961D(javaScriptExecutor), (NativeModuleRegistry) AnonymousClass0LR.m2961D(processPackages), (JSBundleLoader) AnonymousClass0LR.m2961D(jSBundleLoader), (NativeModuleCallExceptionHandler) AnonymousClass0LR.m2961D(nativeModuleCallExceptionHandler));
            JSIModulePackage jSIModulePackage = reactInstanceManager.mJSIModulePackage;
            if (jSIModulePackage != null) {
                catalystInstanceImpl.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, catalystInstanceImpl.getJavaScriptContextHolder()));
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = reactInstanceManager.mBridgeIdleDebugListener;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                catalystInstanceImpl.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (AnonymousClass0CM.m897N(134348800)) {
                catalystInstanceImpl.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            AnonymousClass09H.m584B(j, "runJSBundle", -1779549206);
            catalystInstanceImpl.runJSBundle();
            AnonymousClass09H.m585C(j, 428111720);
            reactApplicationContext.initializeWithInstance(catalystInstanceImpl);
            return reactApplicationContext;
        } finally {
            AnonymousClass09H.m585C(8192, -1765565825);
            j = ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END;
            ReactMarker.logMarker(j);
        }
    }

    public final void createReactContextInBackground() {
        AnonymousClass0LR.m2960C(this.mHasStartedCreatingInitialContext ^ true, "createReactContextInBackground should only be called when creating the react application for the first time. When reloading JS, e.g. from a new file, explicitlyuse recreateReactContextInBackground");
        this.mHasStartedCreatingInitialContext = true;
        recreateReactContextInBackgroundInner();
    }

    public final ViewManager createViewManager(String str) {
        synchronized (this.mReactContextLock) {
            try {
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) getCurrentReactContext();
                if (reactApplicationContext != null) {
                    if (reactApplicationContext.hasActiveCatalystInstance()) {
                        synchronized (this.mPackages) {
                            try {
                                for (ReactPackage reactPackage : this.mPackages) {
                                    if (reactPackage instanceof ViewManagerOnDemandReactPackage) {
                                        ViewManager createViewManager = ((ViewManagerOnDemandReactPackage) reactPackage).createViewManager(reactApplicationContext, str);
                                        if (createViewManager != null) {
                                            return createViewManager;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                Throwable th3;
                th3 = th2;
                throw th3;
            }
        }
        return null;
    }

    public final void destroy() {
        UiThreadUtil.assertOnUiThread();
        this.mHasStartedDestroying = Boolean.valueOf(true);
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
            this.mDevSupportManager.stopInspector();
        }
        moveToBeforeCreateLifecycleState();
        if (this.mCreateReactContextThread != null) {
            this.mCreateReactContextThread = null;
        }
        this.mMemoryPressureRouter.destroy(this.mApplicationContext);
        synchronized (this.mReactContextLock) {
            try {
                if (this.mCurrentReactContext != null) {
                    this.mCurrentReactContext.destroy();
                    this.mCurrentReactContext = null;
                }
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    break;
                }
            }
        }
        this.mHasStartedCreatingInitialContext = false;
        this.mCurrentActivity = null;
        ResourceDrawableIdHelper.getInstance().clear();
        this.mHasStartedDestroying = Boolean.valueOf(false);
        synchronized (this.mHasStartedDestroying) {
            try {
                this.mHasStartedDestroying.notifyAll();
            } catch (Throwable th3) {
                th2 = th3;
                throw th2;
            }
        }
    }

    public final void detachRootView(ReactRootView reactRootView) {
        UiThreadUtil.assertOnUiThread();
        if (this.mAttachedRootViews.remove(reactRootView)) {
            ReactContext currentReactContext = getCurrentReactContext();
            if (currentReactContext != null && currentReactContext.hasActiveCatalystInstance()) {
                detachViewFromInstance(reactRootView, currentReactContext.getCatalystInstance());
            }
        }
    }

    private static void detachViewFromInstance(ReactRootView reactRootView, CatalystInstance catalystInstance) {
        UiThreadUtil.assertOnUiThread();
        if (reactRootView.getUIManagerType() == 2) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(reactRootView.getId());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(reactRootView.getId());
        }
    }

    public final ReactContext getCurrentReactContext() {
        ReactContext reactContext;
        synchronized (this.mReactContextLock) {
            reactContext = this.mCurrentReactContext;
        }
        return reactContext;
    }

    public final DevSupportManager getDevSupportManager() {
        return this.mDevSupportManager;
    }

    public final LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public final MemoryPressureRouter getMemoryPressureRouter() {
        return this.mMemoryPressureRouter;
    }

    public final List getOrCreateViewManagers(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        AnonymousClass09H.m584B(8192, "createAllViewManagers", -1925276048);
        try {
            List list;
            int i;
            if (this.mViewManagers == null) {
                synchronized (this.mPackages) {
                    if (this.mViewManagers == null) {
                        this.mViewManagers = new ArrayList();
                        for (ReactPackage createViewManagers : this.mPackages) {
                            this.mViewManagers.addAll(createViewManagers.createViewManagers(reactApplicationContext));
                        }
                        list = this.mViewManagers;
                        i = 976339579;
                    }
                }
                AnonymousClass09H.m585C(8192, i);
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                return list;
            }
            list = this.mViewManagers;
            i = -1670965249;
            AnonymousClass09H.m585C(8192, i);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return list;
        } catch (Throwable th) {
            AnonymousClass09H.m585C(8192, 142818296);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
        }
    }

    public final List getViewManagerNames() {
        List arrayList;
        Throwable th;
        AnonymousClass09H.m584B(8192, "ReactInstanceManager.getViewManagerNames", -1538363497);
        synchronized (this.mReactContextLock) {
            try {
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) getCurrentReactContext();
                if (reactApplicationContext != null) {
                    if (reactApplicationContext.hasActiveCatalystInstance()) {
                        synchronized (this.mPackages) {
                            try {
                                Collection hashSet = new HashSet();
                                for (ReactPackage reactPackage : this.mPackages) {
                                    AnonymousClass09A.m576B(8192, "ReactInstanceManager.getViewManagerName").mo163B("Package", reactPackage.getClass().getSimpleName()).mo164C();
                                    if (reactPackage instanceof ViewManagerOnDemandReactPackage) {
                                        Collection viewManagerNames = ((ViewManagerOnDemandReactPackage) reactPackage).getViewManagerNames(reactApplicationContext);
                                        if (viewManagerNames != null) {
                                            hashSet.addAll(viewManagerNames);
                                        }
                                    }
                                    AnonymousClass09A.m577C(8192).mo164C();
                                }
                                AnonymousClass09H.m585C(8192, 23241645);
                                arrayList = new ArrayList(hashSet);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    }
                }
                arrayList = null;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
        return arrayList;
    }

    public final boolean hasStartedCreatingInitialContext() {
        return this.mHasStartedCreatingInitialContext;
    }

    private static void initializeSoLoaderIfNecessary(Context context) {
        AnonymousClass0CF.m854C(context, false);
    }

    public static void invokeDefaultOnBackPressed(ReactInstanceManager reactInstanceManager) {
        UiThreadUtil.assertOnUiThread();
        reactInstanceManager = reactInstanceManager.mDefaultBackButtonImpl;
        if (reactInstanceManager != null) {
            reactInstanceManager.invokeDefaultOnBackPressed();
        }
    }

    private synchronized void moveReactContextToCurrentLifecycleState() {
        if (this.mLifecycleState == LifecycleState.RESUMED) {
            moveToResumedLifecycleState(true);
        }
    }

    private synchronized void moveToBeforeCreateLifecycleState() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (this.mLifecycleState == LifecycleState.RESUMED) {
                currentReactContext.onHostPause();
                this.mLifecycleState = LifecycleState.BEFORE_RESUME;
            }
            if (this.mLifecycleState == LifecycleState.BEFORE_RESUME) {
                currentReactContext.onHostDestroy();
            }
        }
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
    }

    private synchronized void moveToBeforeResumeLifecycleState() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (this.mLifecycleState == LifecycleState.BEFORE_CREATE) {
                currentReactContext.onHostResume(this.mCurrentActivity);
            } else if (this.mLifecycleState == LifecycleState.RESUMED) {
            }
            currentReactContext.onHostPause();
        }
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
    }

    private synchronized void moveToResumedLifecycleState(boolean z) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (z || this.mLifecycleState == LifecycleState.BEFORE_RESUME || this.mLifecycleState == LifecycleState.BEFORE_CREATE)) {
            currentReactContext.onHostResume(this.mCurrentActivity);
        }
        this.mLifecycleState = LifecycleState.RESUMED;
    }

    public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onActivityResult(activity, i, i2, intent);
        }
    }

    public final void onBackPressed() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.mCurrentReactContext;
        if (reactContext == null) {
            AnonymousClass0Df.m1267H("ReactNative", "Instance detached from instance manager");
            invokeDefaultOnBackPressed(this);
            return;
        }
        ((DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class)).emitHardwareBackPressed();
    }

    public final void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
        }
        moveToBeforeCreateLifecycleState();
        this.mCurrentActivity = null;
    }

    public final void onHostDestroy(Activity activity) {
        if (activity == this.mCurrentActivity) {
            onHostDestroy();
        }
    }

    public final void onHostPause() {
        UiThreadUtil.assertOnUiThread();
        this.mDefaultBackButtonImpl = null;
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
        }
        moveToBeforeResumeLifecycleState();
    }

    public final void onHostPause(Activity activity) {
        AnonymousClass0LR.m2961D(this.mCurrentActivity);
        boolean z = activity == this.mCurrentActivity;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pausing an activity that is not the current activity, this is incorrect! Current activity: ");
        stringBuilder.append(this.mCurrentActivity.getClass().getSimpleName());
        stringBuilder.append(" ");
        stringBuilder.append("Paused activity: ");
        stringBuilder.append(activity.getClass().getSimpleName());
        AnonymousClass0LR.m2960C(z, stringBuilder.toString());
        onHostPause();
    }

    public final void onHostResume(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = activity;
        if (this.mUseDeveloperSupport) {
            View decorView = this.mCurrentActivity.getWindow().getDecorView();
            if (AnonymousClass0mE.m7518H(decorView)) {
                this.mDevSupportManager.setDevSupportEnabled(true);
            } else {
                decorView.addOnAttachStateChangeListener(new ReactInstanceManager$4(this, decorView));
            }
        }
        moveToResumedLifecycleState(false);
    }

    public final void onHostResume(Activity activity, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        UiThreadUtil.assertOnUiThread();
        this.mDefaultBackButtonImpl = defaultHardwareBackBtnHandler;
        onHostResume(activity);
    }

    private void onJSBundleLoadedFromServer(NativeDeltaClient nativeDeltaClient) {
        JSBundleLoader createCachedBundleFromNetworkLoader;
        if (nativeDeltaClient == null) {
            createCachedBundleFromNetworkLoader = JSBundleLoader.createCachedBundleFromNetworkLoader(this.mDevSupportManager.getSourceUrl(), this.mDevSupportManager.getDownloadedJSBundleFile());
        } else {
            createCachedBundleFromNetworkLoader = JSBundleLoader.createDeltaFromNetworkLoader(this.mDevSupportManager.getSourceUrl(), nativeDeltaClient);
        }
        recreateReactContextInBackground(this.mJavaScriptExecutorFactory, createCachedBundleFromNetworkLoader);
    }

    private static void processPackage(ReactPackage reactPackage, NativeModuleRegistryBuilder nativeModuleRegistryBuilder) {
        AnonymousClass09A.m576B(8192, "processPackage").mo163B("className", reactPackage.getClass().getSimpleName()).mo164C();
        boolean z = reactPackage instanceof ReactPackageLogger;
        if (z) {
            ((ReactPackageLogger) reactPackage).startProcessPackage();
        }
        nativeModuleRegistryBuilder.processPackage(reactPackage);
        if (z) {
            ((ReactPackageLogger) reactPackage).endProcessPackage();
        }
        AnonymousClass09A.m577C(8192).mo164C();
    }

    private NativeModuleRegistry processPackages(ReactApplicationContext reactApplicationContext, List list, boolean z) {
        NativeModuleRegistryBuilder nativeModuleRegistryBuilder = new NativeModuleRegistryBuilder(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.mPackages) {
            for (ReactPackage reactPackage : list) {
                if (!z || !this.mPackages.contains(reactPackage)) {
                    AnonymousClass09H.m584B(8192, "createAndProcessCustomReactPackage", 1435935425);
                    if (z) {
                        try {
                            this.mPackages.add(reactPackage);
                        } catch (Throwable th) {
                            AnonymousClass09H.m585C(8192, 700045201);
                        }
                    }
                    processPackage(reactPackage, nativeModuleRegistryBuilder);
                    AnonymousClass09H.m585C(8192, 789922124);
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        AnonymousClass09H.m584B(8192, "buildNativeModuleRegistry", -2095109627);
        try {
            NativeModuleRegistry build = nativeModuleRegistryBuilder.build();
            return build;
        } finally {
            AnonymousClass09H.m585C(8192, -1214922542);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    private void recreateReactContextInBackground(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        UiThreadUtil.assertOnUiThread();
        ReactInstanceManager$ReactContextInitParams reactInstanceManager$ReactContextInitParams = new ReactInstanceManager$ReactContextInitParams(this, javaScriptExecutorFactory, jSBundleLoader);
        if (this.mCreateReactContextThread == null) {
            runCreateReactContextOnNewThread(this, reactInstanceManager$ReactContextInitParams);
        } else {
            this.mPendingReactContextInitParams = reactInstanceManager$ReactContextInitParams;
        }
    }

    private void recreateReactContextInBackgroundFromBundleLoader() {
        recreateReactContextInBackground(this.mJavaScriptExecutorFactory, this.mBundleLoader);
    }

    private void recreateReactContextInBackgroundInner() {
        UiThreadUtil.assertOnUiThread();
        if (this.mUseDeveloperSupport && this.mJSMainModulePath != null) {
            DeveloperSettings devSettings = this.mDevSupportManager.getDevSettings();
            if (this.mDevSupportManager.hasUpToDateJSBundleInCache() && !devSettings.isRemoteJSDebugEnabled()) {
                onJSBundleLoadedFromServer(null);
                return;
            } else if (!AnonymousClass0CM.m897N(134348800)) {
                if (this.mBundleLoader == null) {
                    this.mDevSupportManager.handleReloadJS();
                } else {
                    this.mDevSupportManager.isPackagerRunning(new ReactInstanceManager$3(this, devSettings));
                }
                return;
            }
        }
        recreateReactContextInBackgroundFromBundleLoader();
    }

    public final void removeReactInstanceEventListener(ReactInstanceManager$ReactInstanceEventListener reactInstanceManager$ReactInstanceEventListener) {
        this.mReactInstanceEventListeners.remove(reactInstanceManager$ReactInstanceEventListener);
    }

    public static void runCreateReactContextOnNewThread(ReactInstanceManager reactInstanceManager, ReactInstanceManager$ReactContextInitParams reactInstanceManager$ReactContextInitParams) {
        UiThreadUtil.assertOnUiThread();
        synchronized (reactInstanceManager.mReactContextLock) {
            if (reactInstanceManager.mCurrentReactContext != null) {
                reactInstanceManager.tearDownReactContext(reactInstanceManager.mCurrentReactContext);
                reactInstanceManager.mCurrentReactContext = null;
            }
        }
        reactInstanceManager.mCreateReactContextThread = new Thread(null, new ReactInstanceManager$5(reactInstanceManager, reactInstanceManager$ReactContextInitParams), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        reactInstanceManager.mCreateReactContextThread.start();
    }

    public static void setupReactContext(ReactInstanceManager reactInstanceManager, ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        AnonymousClass09H.m584B(8192, "setupReactContext", -1122308870);
        synchronized (reactInstanceManager.mReactContextLock) {
            try {
                reactInstanceManager.mCurrentReactContext = (ReactContext) AnonymousClass0LR.m2961D(reactApplicationContext);
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    break;
                }
            }
        }
        CatalystInstance catalystInstance = (CatalystInstance) AnonymousClass0LR.m2961D(reactApplicationContext.getCatalystInstance());
        catalystInstance.initialize();
        reactInstanceManager.mDevSupportManager.onNewReactContextCreated(reactApplicationContext);
        reactInstanceManager.mMemoryPressureRouter.addMemoryPressureListener(catalystInstance);
        reactInstanceManager.moveReactContextToCurrentLifecycleState();
        ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
        synchronized (reactInstanceManager.mAttachedRootViews) {
            try {
                for (ReactRootView attachRootViewToInstance : reactInstanceManager.mAttachedRootViews) {
                    reactInstanceManager.attachRootViewToInstance(attachRootViewToInstance, catalystInstance);
                }
            } catch (Throwable th3) {
                while (true) {
                    th2 = th3;
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        UiThreadUtil.runOnUiThread(new ReactInstanceManager$6(reactInstanceManager, (ReactInstanceManager$ReactInstanceEventListener[]) reactInstanceManager.mReactInstanceEventListeners.toArray(new ReactInstanceManager$ReactInstanceEventListener[reactInstanceManager.mReactInstanceEventListeners.size()]), reactApplicationContext));
        AnonymousClass09H.m585C(8192, -1133743366);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        reactApplicationContext.runOnJSQueueThread(new ReactInstanceManager$7(reactInstanceManager));
        reactApplicationContext.runOnNativeModulesQueueThread(new ReactInstanceManager$8(reactInstanceManager));
        return;
        throw th2;
    }

    private void tearDownReactContext(ReactContext reactContext) {
        UiThreadUtil.assertOnUiThread();
        if (this.mLifecycleState == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.mAttachedRootViews) {
            for (ReactRootView reactRootView : this.mAttachedRootViews) {
                reactRootView.removeAllViews();
                reactRootView.setId(-1);
            }
        }
        reactContext.destroy();
        this.mDevSupportManager.onReactInstanceDestroyed(reactContext);
        this.mMemoryPressureRouter.removeMemoryPressureListener(reactContext.getCatalystInstance());
    }
}
