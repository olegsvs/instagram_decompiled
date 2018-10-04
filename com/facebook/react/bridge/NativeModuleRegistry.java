package com.facebook.react.bridge;

import X.AnonymousClass09H;
import X.AnonymousClass0LR;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

public final class NativeModuleRegistry {
    private final Map mModules;
    private final ReactApplicationContext mReactApplicationContext;

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map map) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mModules = map;
    }

    public final Collection getCxxModules() {
        Collection arrayList = new ArrayList();
        for (Entry entry : this.mModules.entrySet()) {
            if (((ModuleHolder) entry.getValue()).isCxxModule()) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public final Collection getJavaModules(JSInstance jSInstance) {
        Collection arrayList = new ArrayList();
        for (Entry entry : this.mModules.entrySet()) {
            if (!((ModuleHolder) entry.getValue()).isCxxModule()) {
                arrayList.add(new JavaModuleWrapper(jSInstance, (ModuleHolder) entry.getValue()));
            }
        }
        return arrayList;
    }

    public final NativeModule getModule(Class cls) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            Object obj = this.mModules.get(reactModule.name());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(reactModule.name());
            stringBuilder.append(" could not be found. Is it defined in ");
            stringBuilder.append(cls.getName());
            return ((ModuleHolder) AnonymousClass0LR.E(obj, stringBuilder.toString())).getModule();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find @ReactModule annotation in class ");
        stringBuilder.append(cls.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void notifyJSInstanceDestroy() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread();
        AnonymousClass09H.B(8192, "NativeModuleRegistry_notifyJSInstanceDestroy", -1996504252);
        try {
            for (ModuleHolder destroy : this.mModules.values()) {
                destroy.destroy();
            }
        } finally {
            AnonymousClass09H.C(8192, -1666469188);
        }
    }

    public final void notifyJSInstanceInitialized() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread. See https://github.com/facebook/react-native/wiki/Breaking-Changes#d4611211-reactnativeandroidbreaking-move-nativemodule-initialization-off-ui-thread---aaachiuuu  for more details.");
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        AnonymousClass09H.B(8192, "NativeModuleRegistry_notifyJSInstanceInitialized", 1763277720);
        try {
            for (ModuleHolder markInitializable : this.mModules.values()) {
                markInitializable.markInitializable();
            }
        } finally {
            AnonymousClass09H.C(8192, -1508065495);
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public final void onBatchComplete() {
        ModuleHolder moduleHolder = (ModuleHolder) this.mModules.get(UIManagerModule.NAME);
        if (moduleHolder != null && moduleHolder.hasInstance()) {
            ((OnBatchCompleteListener) moduleHolder.getModule()).onBatchComplete();
        }
    }
}
