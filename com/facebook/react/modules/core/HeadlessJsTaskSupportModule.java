package com.facebook.react.modules.core;

import X.AnonymousClass0Df;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "HeadlessJsTaskSupport")
public class HeadlessJsTaskSupportModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "HeadlessJsTaskSupport";

    public String getName() {
        return MODULE_NAME;
    }

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void notifyTaskFinished(int i) {
        HeadlessJsTaskContext instance = HeadlessJsTaskContext.getInstance(getReactApplicationContext());
        if (instance.isTaskRunning(i)) {
            instance.finishTask(i);
            return;
        }
        Class cls = HeadlessJsTaskSupportModule.class;
        String str = "Tried to finish non-active task with id %d. Did it time out?";
        Object[] objArr = new Object[]{Integer.valueOf(i)};
        if (AnonymousClass0Df.f1895B.wX(5)) {
            AnonymousClass0Df.f1895B.wWA(AnonymousClass0Df.F(cls), AnonymousClass0Df.E(str, objArr));
        }
    }
}
