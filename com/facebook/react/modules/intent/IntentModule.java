package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.fasterxml.jackson.annotation.JsonProperty;

@ReactModule(name = "IntentAndroid")
public class IntentModule extends ReactContextBaseJavaModule {
    public String getName() {
        return "IntentAndroid";
    }

    public IntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void canOpenURL(String str, Promise promise) {
        StringBuilder stringBuilder;
        if (str != null) {
            if (!str.isEmpty()) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.addFlags(268435456);
                    promise.resolve(Boolean.valueOf(intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null));
                } catch (Exception e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not check if URL '");
                    stringBuilder.append(str);
                    stringBuilder.append("' can be opened: ");
                    stringBuilder.append(e.getMessage());
                    promise.reject(new JSApplicationIllegalArgumentException(stringBuilder.toString()));
                }
                return;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid URL: ");
        stringBuilder.append(str);
        promise.reject(new JSApplicationIllegalArgumentException(stringBuilder.toString()));
    }

    @ReactMethod
    public void getInitialURL(Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            Object obj = null;
            if (currentActivity != null) {
                Intent intent = currentActivity.getIntent();
                String action = intent.getAction();
                Uri data = intent.getData();
                if ("android.intent.action.VIEW".equals(action) && data != null) {
                    obj = data.toString();
                }
            }
            promise.resolve(obj);
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not get the initial URL : ");
            stringBuilder.append(e.getMessage());
            promise.reject(new JSApplicationIllegalArgumentException(stringBuilder.toString()));
        }
    }

    @ReactMethod
    public void openURL(String str, Promise promise) {
        StringBuilder stringBuilder;
        if (str != null) {
            if (!str.isEmpty()) {
                try {
                    Activity currentActivity = getCurrentActivity();
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    String packageName = getReactApplicationContext().getPackageName();
                    ComponentName resolveActivity = intent.resolveActivity(getReactApplicationContext().getPackageManager());
                    Object packageName2 = resolveActivity != null ? resolveActivity.getPackageName() : JsonProperty.USE_DEFAULT_NAME;
                    if (currentActivity == null || !packageName.equals(packageName2)) {
                        intent.addFlags(268435456);
                    }
                    if (currentActivity != null) {
                        currentActivity.startActivity(intent);
                    } else {
                        getReactApplicationContext().startActivity(intent);
                    }
                    promise.resolve(Boolean.valueOf(true));
                } catch (Exception e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not open URL '");
                    stringBuilder.append(str);
                    stringBuilder.append("': ");
                    stringBuilder.append(e.getMessage());
                    promise.reject(new JSApplicationIllegalArgumentException(stringBuilder.toString()));
                }
                return;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid URL: ");
        stringBuilder.append(str);
        promise.reject(new JSApplicationIllegalArgumentException(stringBuilder.toString()));
    }
}
