package com.facebook.react;

import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.Timing;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.Map;

public class CoreModulesPackage$$ReactModuleInfoProvider implements ReactModuleInfoProvider {
    public final Map getReactModuleInfos() {
        Map hashMap = new HashMap();
        hashMap.put("PlatformConstants", new ReactModuleInfo("PlatformConstants", "com.facebook.react.modules.systeminfo.AndroidInfoModule", false, false, true, false));
        hashMap.put("DeviceEventManager", new ReactModuleInfo("DeviceEventManager", "com.facebook.react.modules.core.DeviceEventManagerModule", false, false, false, false));
        hashMap.put(DeviceInfoModule.sModuleName, new ReactModuleInfo(DeviceInfoModule.sModuleName, "com.facebook.react.modules.deviceinfo.DeviceInfoModule", false, false, true, false));
        hashMap.put("ExceptionsManager", new ReactModuleInfo("ExceptionsManager", "com.facebook.react.modules.core.ExceptionsManagerModule", false, false, false, false));
        hashMap.put(HeadlessJsTaskSupportModule.MODULE_NAME, new ReactModuleInfo(HeadlessJsTaskSupportModule.MODULE_NAME, "com.facebook.react.modules.core.HeadlessJsTaskSupportModule", false, false, false, false));
        hashMap.put(SourceCodeModule.NAME, new ReactModuleInfo(SourceCodeModule.NAME, "com.facebook.react.modules.debug.SourceCodeModule", false, false, true, false));
        hashMap.put(Timing.NAME, new ReactModuleInfo(Timing.NAME, "com.facebook.react.modules.core.Timing", false, false, false, false));
        hashMap.put(UIManagerModule.NAME, new ReactModuleInfo(UIManagerModule.NAME, "com.facebook.react.uimanager.UIManagerModule", false, false, true, false));
        return hashMap;
    }
}
