package com.facebook.react;

import X.AnonymousClass09H;
import X.AnonymousClass0G4;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.Timing;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.UIManagerModule.ViewManagerResolver;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;

public class CoreModulesPackage extends LazyReactPackage implements ReactPackageLogger {
    public final DefaultHardwareBackBtnHandler mHardwareBackBtnHandler;
    private final boolean mLazyViewManagersEnabled;
    private final int mMinTimeLeftInFrameForNonBatchedOperationMs;
    public final ReactInstanceManager mReactInstanceManager;

    /* renamed from: com.facebook.react.CoreModulesPackage$3 */
    public final class C00673 implements AnonymousClass0G4 {
        public final NativeModule get() {
            return new ExceptionsManagerModule(CoreModulesPackage.this.mReactInstanceManager.getDevSupportManager());
        }
    }

    /* renamed from: com.facebook.react.CoreModulesPackage$9 */
    public final class C01249 implements ViewManagerResolver {
        public final ViewManager getViewManager(String str) {
            return CoreModulesPackage.this.mReactInstanceManager.createViewManager(str);
        }

        public final List getViewManagerNames() {
            return CoreModulesPackage.this.mReactInstanceManager.getViewManagerNames();
        }
    }

    public CoreModulesPackage(ReactInstanceManager reactInstanceManager, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler, boolean z, int i) {
        this.mReactInstanceManager = reactInstanceManager;
        this.mHardwareBackBtnHandler = defaultHardwareBackBtnHandler;
        this.mLazyViewManagersEnabled = z;
        this.mMinTimeLeftInFrameForNonBatchedOperationMs = i;
    }

    public static UIManagerModule createUIManager(CoreModulesPackage coreModulesPackage, ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        AnonymousClass09H.B(8192, "createUIManagerModule", -1318039336);
        try {
            if (coreModulesPackage.mLazyViewManagersEnabled) {
                UIManagerModule uIManagerModule = new UIManagerModule(reactApplicationContext, new C01249(), coreModulesPackage.mMinTimeLeftInFrameForNonBatchedOperationMs);
                return uIManagerModule;
            }
            UIManagerModule uIManagerModule2 = new UIManagerModule(reactApplicationContext, coreModulesPackage.mReactInstanceManager.getOrCreateViewManagers(reactApplicationContext), coreModulesPackage.mMinTimeLeftInFrameForNonBatchedOperationMs);
            AnonymousClass09H.C(8192, 1656188881);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
            return uIManagerModule2;
        } finally {
            AnonymousClass09H.C(8192, 1283444191);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    public final void endProcessPackage() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    public final List getNativeModules(final ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ModuleSpec[]{ModuleSpec.nativeModuleSpec(AndroidInfoModule.class, new AnonymousClass0G4() {
            public final NativeModule get() {
                return new AndroidInfoModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(DeviceEventManagerModule.class, new AnonymousClass0G4() {
            public final NativeModule get() {
                return new DeviceEventManagerModule(reactApplicationContext, CoreModulesPackage.this.mHardwareBackBtnHandler);
            }
        }), ModuleSpec.nativeModuleSpec(ExceptionsManagerModule.class, new C00673()), ModuleSpec.nativeModuleSpec(HeadlessJsTaskSupportModule.class, new AnonymousClass0G4() {
            public final NativeModule get() {
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(SourceCodeModule.class, new AnonymousClass0G4() {
            public final NativeModule get() {
                return new SourceCodeModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(Timing.class, new AnonymousClass0G4() {
            public final NativeModule get() {
                return new Timing(reactApplicationContext, CoreModulesPackage.this.mReactInstanceManager.getDevSupportManager());
            }
        }), ModuleSpec.nativeModuleSpec(UIManagerModule.class, new AnonymousClass0G4() {
            public final NativeModule get() {
                return CoreModulesPackage.createUIManager(CoreModulesPackage.this, reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(DeviceInfoModule.class, new AnonymousClass0G4() {
            public final NativeModule get() {
                return new DeviceInfoModule(reactApplicationContext);
            }
        })});
    }

    public final ReactModuleInfoProvider getReactModuleInfoProvider() {
        return LazyReactPackage.getReactModuleInfoProviderViaReflection(this);
    }

    public final void startProcessPackage() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }
}
