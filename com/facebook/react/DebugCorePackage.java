package com.facebook.react;

import X.AnonymousClass0G4;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.JSCSamplingProfiler;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.ArrayList;
import java.util.List;

public class DebugCorePackage extends LazyReactPackage {
    public final List getNativeModules(final ReactApplicationContext reactApplicationContext) {
        List arrayList = new ArrayList();
        arrayList.add(ModuleSpec.nativeModuleSpec(JSCHeapCapture.class, new AnonymousClass0G4() {
            public final NativeModule get() {
                return new JSCHeapCapture(reactApplicationContext);
            }
        }));
        arrayList.add(ModuleSpec.nativeModuleSpec(JSCSamplingProfiler.class, new AnonymousClass0G4() {
            public final NativeModule get() {
                return new JSCSamplingProfiler(reactApplicationContext);
            }
        }));
        return arrayList;
    }

    public final ReactModuleInfoProvider getReactModuleInfoProvider() {
        return LazyReactPackage.getReactModuleInfoProviderViaReflection(this);
    }
}
