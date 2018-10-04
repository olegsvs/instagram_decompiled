package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;

public final class NativeModuleRegistryBuilder {
    private final Map mModules = new HashMap();
    private final ReactApplicationContext mReactApplicationContext;
    private final ReactInstanceManager mReactInstanceManager;

    public NativeModuleRegistryBuilder(ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mReactInstanceManager = reactInstanceManager;
    }

    public final NativeModuleRegistry build() {
        return new NativeModuleRegistry(this.mReactApplicationContext, this.mModules);
    }

    public final void processPackage(ReactPackage reactPackage) {
        Iterable nativeModuleIterator;
        if (reactPackage instanceof LazyReactPackage) {
            nativeModuleIterator = ((LazyReactPackage) reactPackage).getNativeModuleIterator(this.mReactApplicationContext);
        } else if (reactPackage instanceof TurboReactPackage) {
            nativeModuleIterator = ((TurboReactPackage) reactPackage).getNativeModuleIterator(this.mReactApplicationContext);
        } else {
            nativeModuleIterator = ReactPackageHelper.getNativeModuleIterator(reactPackage, this.mReactApplicationContext, this.mReactInstanceManager);
        }
        for (ModuleHolder moduleHolder : r0) {
            String name = moduleHolder.getName();
            if (this.mModules.containsKey(name)) {
                ModuleHolder moduleHolder2 = (ModuleHolder) this.mModules.get(name);
                if (moduleHolder.getCanOverrideExistingModule()) {
                    this.mModules.remove(moduleHolder2);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Native module ");
                    stringBuilder.append(name);
                    stringBuilder.append(" tried to override ");
                    stringBuilder.append(moduleHolder2.getClassName());
                    stringBuilder.append(" for module name .Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            this.mModules.put(name, moduleHolder);
        }
    }
}
