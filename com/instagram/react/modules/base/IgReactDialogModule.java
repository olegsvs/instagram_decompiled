package com.instagram.react.modules.base;

import X.AnonymousClass0Sb;
import X.AnonymousClass5sG;
import android.app.Dialog;
import android.content.Context;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "IgDialog")
public class IgReactDialogModule extends ReactContextBaseJavaModule {
    private static final String CANCELABLE_KEY = "IS_CANCELABLE";
    private static final String CANCELED_ON_TOUCH_OUTSIDE_KEY = "CANCELED_ON_TOUCH_OUTSIDE";
    private static final String GRAVITY_BOTTOM = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP = "TOP";
    private static final String MESSAGE_GRAVITY_KEY = "MESSAGE_GRAVITY";
    public static final String MODULE_NAME = "IgDialog";
    private static final String NEGATIVE_BUTTON_KEY = "NEGATIVE_BUTTON";
    public static final String NEGATIVE_BUTTON_TEXT_KEY = "NEGATIVE_BUTTON_TEXT";
    private static final String POSITIVE_BUTTON_KEY = "POSITIVE_BUTTON";
    public static final String POSITIVE_BUTTON_TEXT_KEY = "POSITIVE_BUTTON_TEXT";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public Map getConstants() {
        Map hashMap = new HashMap();
        String str = CANCELABLE_KEY;
        hashMap.put(str, str);
        str = CANCELED_ON_TOUCH_OUTSIDE_KEY;
        hashMap.put(str, str);
        str = MESSAGE_GRAVITY_KEY;
        hashMap.put(str, str);
        str = NEGATIVE_BUTTON_TEXT_KEY;
        hashMap.put(str, str);
        hashMap.put(NEGATIVE_BUTTON_KEY, Integer.valueOf(-2));
        hashMap.put(POSITIVE_BUTTON_KEY, Integer.valueOf(-1));
        str = POSITIVE_BUTTON_TEXT_KEY;
        hashMap.put(str, str);
        hashMap.put(GRAVITY_TOP, Integer.valueOf(48));
        hashMap.put(GRAVITY_CENTER, Integer.valueOf(17));
        hashMap.put(GRAVITY_BOTTOM, Integer.valueOf(80));
        return hashMap;
    }

    @ReactMethod
    public void showDialog(String str, String str2, ReadableMap readableMap, Callback callback, Callback callback2) {
        showDialogHelper(str, str2, readableMap, callback, callback2);
    }

    public Dialog showDialogHelper(String str, String str2, ReadableMap readableMap, Callback callback, Callback callback2) {
        Context currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(currentActivity);
        if (!(str == null || str.isEmpty())) {
            anonymousClass0Sb.R(str);
        }
        if (!(str2 == null || str2.isEmpty())) {
            anonymousClass0Sb.I(str2);
        }
        if (readableMap.hasKey(MESSAGE_GRAVITY_KEY)) {
            anonymousClass0Sb = anonymousClass0Sb.K(readableMap.getInt(MESSAGE_GRAVITY_KEY));
        }
        if (readableMap.hasKey(CANCELABLE_KEY)) {
            anonymousClass0Sb = anonymousClass0Sb.E(readableMap.getBoolean(CANCELABLE_KEY));
        }
        if (readableMap.hasKey(CANCELED_ON_TOUCH_OUTSIDE_KEY)) {
            anonymousClass0Sb = anonymousClass0Sb.F(readableMap.getBoolean(CANCELED_ON_TOUCH_OUTSIDE_KEY));
        }
        Object anonymousClass5sG = new AnonymousClass5sG(callback2, callback);
        if (readableMap.hasKey(NEGATIVE_BUTTON_TEXT_KEY)) {
            anonymousClass0Sb = anonymousClass0Sb.M(readableMap.getString(NEGATIVE_BUTTON_TEXT_KEY), anonymousClass5sG);
        }
        if (readableMap.hasKey(POSITIVE_BUTTON_TEXT_KEY)) {
            anonymousClass0Sb = anonymousClass0Sb.P(readableMap.getString(POSITIVE_BUTTON_TEXT_KEY), anonymousClass5sG);
        }
        Dialog C = anonymousClass0Sb.N(anonymousClass5sG).C();
        C.show();
        return C;
    }
}
