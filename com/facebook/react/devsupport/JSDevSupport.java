package com.facebook.react.devsupport;

import android.view.View;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.devsupport.JSCHeapCapture.CaptureException;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "JSDevSupport")
public class JSDevSupport extends ReactContextBaseJavaModule {
    public static final int ERROR_CODE_EXCEPTION = 0;
    public static final int ERROR_CODE_VIEW_NOT_FOUND = 1;
    public static final String MODULE_NAME = "JSDevSupport";
    private volatile DevSupportCallback mCurrentCallback = null;

    public interface DevSupportCallback {
        void onFailure(int i, Exception exception);

        void onSuccess(String str);
    }

    public interface JSDevSupportModule extends JavaScriptModule {
        void getJSHierarchy(int i);
    }

    public String getName() {
        return MODULE_NAME;
    }

    public JSDevSupport(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public synchronized void computeDeepestJSHierarchy(View view, DevSupportCallback devSupportCallback) {
        getJSHierarchy(Integer.valueOf(((View) ViewHierarchyUtil.getDeepestLeaf(view).first).getId()).intValue(), devSupportCallback);
    }

    public Map getConstants() {
        Map hashMap = new HashMap();
        hashMap.put("ERROR_CODE_EXCEPTION", Integer.valueOf(0));
        hashMap.put("ERROR_CODE_VIEW_NOT_FOUND", Integer.valueOf(1));
        return hashMap;
    }

    public synchronized void getJSHierarchy(int i, DevSupportCallback devSupportCallback) {
        JSDevSupportModule jSDevSupportModule = (JSDevSupportModule) getReactApplicationContext().getJSModule(JSDevSupportModule.class);
        if (jSDevSupportModule == null) {
            devSupportCallback.onFailure(0, new CaptureException("JSDevSupport module not registered."));
        } else {
            this.mCurrentCallback = devSupportCallback;
            jSDevSupportModule.getJSHierarchy(i);
        }
    }

    @ReactMethod
    public synchronized void onFailure(int i, String str) {
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.onFailure(i, new RuntimeException(str));
        }
    }

    @ReactMethod
    public synchronized void onSuccess(String str) {
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.onSuccess(str);
        }
    }
}
