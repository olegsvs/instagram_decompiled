package com.facebook.react.bridge;

import X.AnonymousClass09B;
import X.AnonymousClass09H;
import X.AnonymousClass0CM;
import X.AnonymousClass0D2;
import X.AnonymousClass0D3;
import X.AnonymousClass0Df;
import X.AnonymousClass0LR;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class CatalystInstanceImpl implements CatalystInstance {
    private static final AtomicInteger sNextInstanceIdForTrace = new AtomicInteger(1);
    private volatile boolean mAcceptCalls;
    public final CopyOnWriteArrayList mBridgeIdleListeners;
    private volatile boolean mDestroyed;
    public final HybridData mHybridData;
    private boolean mInitialized;
    private boolean mJSBundleHasLoaded;
    private final JSBundleLoader mJSBundleLoader;
    private final ArrayList mJSCallsPendingInit;
    private final Object mJSCallsPendingInitLock;
    public final JSIModuleRegistry mJSIModuleRegistry;
    private final JavaScriptModuleRegistry mJSModuleRegistry;
    public JavaScriptContextHolder mJavaScriptContextHolder;
    private final String mJsPendingCallsTitleForTrace;
    private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    public final NativeModuleRegistry mNativeModuleRegistry;
    private final MessageQueueThread mNativeModulesQueueThread;
    public final AtomicInteger mPendingJSCalls = new AtomicInteger(0);
    private final ReactQueueConfigurationImpl mReactQueueConfiguration;
    private String mSourceURL;
    private final AnonymousClass09B mTraceListener;

    /* renamed from: com.facebook.react.bridge.CatalystInstanceImpl$1 */
    public final class C00851 implements Runnable {

        /* renamed from: com.facebook.react.bridge.CatalystInstanceImpl$1$1 */
        public final class C00841 implements Runnable {
            public final void run() {
                CatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                CatalystInstanceImpl.this.mHybridData.resetNative();
                CatalystInstanceImpl.this.getReactQueueConfiguration().destroy();
                ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
            }
        }

        public final void run() {
            CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceDestroy();
            CatalystInstanceImpl.this.mJSIModuleRegistry.notifyJSInstanceDestroy();
            int i = 0;
            if (CatalystInstanceImpl.this.mPendingJSCalls.getAndSet(0) == 0) {
                i = 1;
            }
            if (!CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty()) {
                Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = (NotThreadSafeBridgeIdleDebugListener) it.next();
                    if (i == 0) {
                        notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle();
                    }
                    notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
                }
            }
            AsyncTask.execute(new C00841());
        }
    }

    /* renamed from: com.facebook.react.bridge.CatalystInstanceImpl$2 */
    public final class C00862 implements Runnable {
        public final void run() {
            CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceInitialized();
        }
    }

    /* renamed from: com.facebook.react.bridge.CatalystInstanceImpl$3 */
    public final class C00873 implements Runnable {
        public final void run() {
            Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
            while (it.hasNext()) {
                ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeBusy();
            }
        }
    }

    /* renamed from: com.facebook.react.bridge.CatalystInstanceImpl$4 */
    public final class C00884 implements Runnable {
        public final void run() {
            Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
            while (it.hasNext()) {
                ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeIdle();
            }
        }
    }

    /* renamed from: com.facebook.react.bridge.CatalystInstanceImpl$5 */
    public final class C00895 implements Runnable {
        public final void run() {
            CatalystInstanceImpl.this.destroy();
        }
    }

    public final class JSProfilerTraceListener implements AnonymousClass09B {
        private final WeakReference mOuter;

        public JSProfilerTraceListener(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference(catalystInstanceImpl);
        }

        public final void onTraceStarted() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
            }
        }

        public final void onTraceStopped() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
            }
        }
    }

    public final class PendingJSCall {
        public NativeArray mArguments;
        public String mMethod;
        public String mModule;

        public PendingJSCall(String str, String str2, NativeArray nativeArray) {
            this.mModule = str;
            this.mMethod = str2;
            this.mArguments = nativeArray;
        }

        public final void call(CatalystInstanceImpl catalystInstanceImpl) {
            NativeArray nativeArray = this.mArguments;
            if (nativeArray == null) {
                nativeArray = new WritableNativeArray();
            }
            catalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, nativeArray);
        }

        public final String toString() {
            String str;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.mModule);
            stringBuilder.append(".");
            stringBuilder.append(this.mMethod);
            stringBuilder.append("(");
            NativeArray nativeArray = this.mArguments;
            if (nativeArray == null) {
                str = JsonProperty.USE_DEFAULT_NAME;
            } else {
                str = nativeArray.toString();
            }
            stringBuilder.append(str);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public final class BridgeCallback implements ReactCallback {
        private final WeakReference mOuter;

        public BridgeCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference(catalystInstanceImpl);
        }

        public final void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                CatalystInstanceImpl.decrementPendingJSCalls(catalystInstanceImpl);
            }
        }

        public final void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                CatalystInstanceImpl.incrementPendingJSCalls(catalystInstanceImpl);
            }
        }

        public final void onBatchComplete() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.mNativeModuleRegistry.onBatchComplete();
            }
        }
    }

    public final class NativeExceptionHandler implements QueueThreadExceptionHandler {
        public final void handleException(Exception exception) {
            CatalystInstanceImpl.onNativeException(CatalystInstanceImpl.this, exception);
        }
    }

    private native long getJavaScriptContext();

    private static native HybridData initHybrid();

    private native void initializeBridge(ReactCallback reactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection collection, Collection collection2);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    private native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection collection, Collection collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    public native void setGlobalVariable(String str, String str2);

    static {
        ReactBridge.staticInit();
    }

    public CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pending_js_calls_instance");
        stringBuilder.append(sNextInstanceIdForTrace.getAndIncrement());
        this.mJsPendingCallsTitleForTrace = stringBuilder.toString();
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList();
        this.mJSCallsPendingInitLock = new Object();
        this.mJSIModuleRegistry = new JSIModuleRegistry();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        AnonymousClass09H.B(8192, "createCatalystInstanceImpl", -2015262536);
        this.mHybridData = initHybrid();
        this.mReactQueueConfiguration = ReactQueueConfigurationImpl.create(reactQueueConfigurationSpec, new NativeExceptionHandler());
        this.mBridgeIdleListeners = new CopyOnWriteArrayList();
        this.mNativeModuleRegistry = nativeModuleRegistry;
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mJSBundleLoader = jSBundleLoader;
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        this.mNativeModulesQueueThread = this.mReactQueueConfiguration.getNativeModulesQueueThread();
        this.mTraceListener = new JSProfilerTraceListener(this);
        AnonymousClass09H.C(8192, 126131701);
        AnonymousClass09H.B(8192, "initializeCxxBridge", -34903556);
        initializeBridge(new BridgeCallback(this), javaScriptExecutor, this.mReactQueueConfiguration.getJSQueueThread(), this.mNativeModulesQueueThread, this.mNativeModuleRegistry.getJavaModules(this), this.mNativeModuleRegistry.getCxxModules());
        AnonymousClass09H.C(8192, -1141501243);
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
    }

    public final void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.add(notThreadSafeBridgeIdleDebugListener);
    }

    public final void addJSIModules(List list) {
        this.mJSIModuleRegistry.registerModules(list);
    }

    public final void callFunction(PendingJSCall pendingJSCall) {
        if (this.mDestroyed) {
            pendingJSCall = pendingJSCall.toString();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Calling JS function after bridge has been destroyed: ");
            stringBuilder.append(pendingJSCall);
            AnonymousClass0Df.H("ReactNative", stringBuilder.toString());
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                if (!this.mAcceptCalls) {
                    this.mJSCallsPendingInit.add(pendingJSCall);
                    return;
                }
            }
        }
        pendingJSCall.call(this);
    }

    public final void callFunction(String str, String str2, NativeArray nativeArray) {
        callFunction(new PendingJSCall(str, str2, nativeArray));
    }

    public static void decrementPendingJSCalls(CatalystInstanceImpl catalystInstanceImpl) {
        int decrementAndGet = catalystInstanceImpl.mPendingJSCalls.decrementAndGet();
        Object obj = decrementAndGet == 0 ? 1 : null;
        AnonymousClass0CM.Q(8192, catalystInstanceImpl.mJsPendingCallsTitleForTrace, decrementAndGet);
        if (obj != null && !catalystInstanceImpl.mBridgeIdleListeners.isEmpty()) {
            catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new C00884());
        }
    }

    public final void destroy() {
        UiThreadUtil.assertOnUiThread();
        if (!this.mDestroyed) {
            ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
            this.mDestroyed = true;
            this.mNativeModulesQueueThread.runOnQueue(new C00851());
            AnonymousClass09B anonymousClass09B = this.mTraceListener;
            AnonymousClass0D3 anonymousClass0D3 = AnonymousClass0D2.f1799C;
            synchronized (anonymousClass0D3.f1803D) {
                anonymousClass0D3.f1802C.remove(anonymousClass09B);
                if (anonymousClass0D3.f1801B) {
                    anonymousClass09B.onTraceStopped();
                }
            }
        }
    }

    public final JSIModule getJSIModule(Class cls) {
        return this.mJSIModuleRegistry.getModule(cls);
    }

    public final JavaScriptModule getJSModule(Class cls) {
        return this.mJSModuleRegistry.getJavaScriptModule(this, cls);
    }

    public final JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    public final NativeModule getNativeModule(Class cls) {
        return this.mNativeModuleRegistry.getModule(cls);
    }

    public final ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    public final String getSourceURL() {
        return this.mSourceURL;
    }

    public final void handleMemoryPressure(int i) {
        if (!this.mDestroyed) {
            jniHandleMemoryPressure(i);
        }
    }

    public static void incrementPendingJSCalls(CatalystInstanceImpl catalystInstanceImpl) {
        int andIncrement = catalystInstanceImpl.mPendingJSCalls.getAndIncrement();
        Object obj = andIncrement == 0 ? 1 : null;
        AnonymousClass0CM.Q(8192, catalystInstanceImpl.mJsPendingCallsTitleForTrace, andIncrement + 1);
        if (obj != null && !catalystInstanceImpl.mBridgeIdleListeners.isEmpty()) {
            catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new C00873());
        }
    }

    public final void initialize() {
        AnonymousClass0LR.C(this.mInitialized ^ true, "This catalyst instance has already been initialized");
        AnonymousClass0LR.C(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new C00862());
    }

    public final void invokeCallback(int i, NativeArrayInterface nativeArrayInterface) {
        if (this.mDestroyed) {
            AnonymousClass0Df.H("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, (NativeArray) nativeArrayInterface);
        }
    }

    public final boolean isDestroyed() {
        return this.mDestroyed;
    }

    public final void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z);
    }

    public final void loadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromDeltaBundle(str, nativeDeltaClient, z);
    }

    public final void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    public static void onNativeException(CatalystInstanceImpl catalystInstanceImpl, Exception exception) {
        catalystInstanceImpl.mNativeModuleCallExceptionHandler.handleException(exception);
        catalystInstanceImpl.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new C00895());
    }

    public final void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.remove(notThreadSafeBridgeIdleDebugListener);
    }

    public final void runJSBundle() {
        AnonymousClass0LR.C(this.mJSBundleHasLoaded ^ true, "JS bundle was already loaded!");
        this.mJSBundleLoader.loadScript(this);
        synchronized (this.mJSCallsPendingInitLock) {
            this.mAcceptCalls = true;
            int size = this.mJSCallsPendingInit.size();
            for (int i = 0; i < size; i++) {
                ((PendingJSCall) this.mJSCallsPendingInit.get(i)).call(this);
            }
            this.mJSCallsPendingInit.clear();
            this.mJSBundleHasLoaded = true;
        }
        AnonymousClass0D2.B(this.mTraceListener);
    }
}
