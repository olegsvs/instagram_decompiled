package com.facebook.react;

import com.facebook.react.devsupport.JSDevSupport;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

public class DebugCorePackage$$ReactModuleInfoProvider implements ReactModuleInfoProvider {
    public final Map getReactModuleInfos() {
        Map hashMap = new HashMap();
        hashMap.put("JSCHeapCapture", new ReactModuleInfo("JSCHeapCapture", "com.facebook.react.devsupport.JSCHeapCapture", false, true, false, false));
        hashMap.put("JSCSamplingProfiler", new ReactModuleInfo("JSCSamplingProfiler", "com.facebook.react.devsupport.JSCSamplingProfiler", false, true, false, false));
        hashMap.put(JSDevSupport.MODULE_NAME, new ReactModuleInfo(JSDevSupport.MODULE_NAME, "com.facebook.react.devsupport.JSDevSupport", false, false, true, false));
        return hashMap;
    }
}
