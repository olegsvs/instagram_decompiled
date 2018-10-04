package com.facebook.react.modules.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import java.util.ArrayList;

@ReactModule(name = "PermissionsAndroid")
public class PermissionsModule extends ReactContextBaseJavaModule implements PermissionListener {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    private final String DENIED = "denied";
    private final String GRANTED = "granted";
    private final String NEVER_ASK_AGAIN = "never_ask_again";
    private final SparseArray mCallbacks = new SparseArray();
    private int mRequestCode = 0;

    public String getName() {
        return "PermissionsAndroid";
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void checkPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        boolean z = true;
        if (VERSION.SDK_INT < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                promise.resolve(Boolean.valueOf(z));
            }
        } else if (baseContext.checkSelfPermission(str) == 0) {
            promise.resolve(Boolean.valueOf(z));
        }
        z = false;
        promise.resolve(Boolean.valueOf(z));
    }

    private PermissionAwareActivity getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ((Callback) this.mCallbacks.get(i)).invoke(new Object[]{iArr, getPermissionAwareActivity()});
        this.mCallbacks.remove(i);
        if (this.mCallbacks.size() == 0) {
            return true;
        }
        return false;
    }

    @ReactMethod
    public void requestMultiplePermissions(ReadableArray readableArray, final Promise promise) {
        final WritableMap writableNativeMap = new WritableNativeMap();
        final ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            String string = readableArray.getString(i2);
            if (VERSION.SDK_INT < 23) {
                writableNativeMap.putString(string, baseContext.checkPermission(string, Process.myPid(), Process.myUid()) == 0 ? "granted" : "denied");
                i++;
            } else if (baseContext.checkSelfPermission(string) == 0) {
                writableNativeMap.putString(string, "granted");
                i++;
            } else {
                arrayList.add(string);
            }
        }
        if (readableArray.size() == i) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            PermissionAwareActivity permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new Callback() {
                public final void invoke(Object... objArr) {
                    int i = 0;
                    int[] iArr = (int[]) objArr[0];
                    PermissionAwareActivity permissionAwareActivity = (PermissionAwareActivity) objArr[1];
                    while (i < arrayList.size()) {
                        String str = (String) arrayList.get(i);
                        if (iArr.length > 0 && iArr[i] == 0) {
                            writableNativeMap.putString(str, "granted");
                        } else if (permissionAwareActivity.shouldShowRequestPermissionRationale(str)) {
                            writableNativeMap.putString(str, "denied");
                        } else {
                            writableNativeMap.putString(str, "never_ask_again");
                        }
                        i++;
                    }
                    promise.resolve(writableNativeMap);
                }
            });
            permissionAwareActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (Throwable e) {
            promise.reject(ERROR_INVALID_ACTIVITY, e);
        }
    }

    @ReactMethod
    public void requestPermission(final String str, final Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        if (VERSION.SDK_INT < 23) {
            promise.resolve(baseContext.checkPermission(str, Process.myPid(), Process.myUid()) == 0 ? "granted" : "denied");
        } else if (baseContext.checkSelfPermission(str) == 0) {
            promise.resolve("granted");
        } else {
            try {
                PermissionAwareActivity permissionAwareActivity = getPermissionAwareActivity();
                this.mCallbacks.put(this.mRequestCode, new Callback() {
                    public final void invoke(Object... objArr) {
                        int[] iArr = (int[]) objArr[0];
                        if (iArr.length > 0 && iArr[0] == 0) {
                            promise.resolve("granted");
                        } else if (((PermissionAwareActivity) objArr[1]).shouldShowRequestPermissionRationale(str)) {
                            promise.resolve("denied");
                        } else {
                            promise.resolve("never_ask_again");
                        }
                    }
                });
                permissionAwareActivity.requestPermissions(new String[]{str}, this.mRequestCode, this);
                this.mRequestCode++;
            } catch (Throwable e) {
                promise.reject(ERROR_INVALID_ACTIVITY, e);
            }
        }
    }

    @ReactMethod
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        if (VERSION.SDK_INT < 23) {
            promise.resolve(Boolean.valueOf(false));
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (Throwable e) {
            promise.reject(ERROR_INVALID_ACTIVITY, e);
        }
    }
}
