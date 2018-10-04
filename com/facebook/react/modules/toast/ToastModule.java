package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

@ReactModule(name = "ToastAndroid")
public class ToastModule extends ReactContextBaseJavaModule {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";

    public String getName() {
        return "ToastAndroid";
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public Map getConstants() {
        Map newHashMap = MapBuilder.newHashMap();
        newHashMap.put(DURATION_SHORT_KEY, Integer.valueOf(0));
        newHashMap.put(DURATION_LONG_KEY, Integer.valueOf(1));
        newHashMap.put(GRAVITY_TOP_KEY, Integer.valueOf(49));
        newHashMap.put(GRAVITY_BOTTOM_KEY, Integer.valueOf(81));
        newHashMap.put(GRAVITY_CENTER, Integer.valueOf(17));
        return newHashMap;
    }

    @ReactMethod
    public void show(final String str, final int i) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public final void run() {
                Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i).show();
            }
        });
    }

    @ReactMethod
    public void showWithGravity(final String str, final int i, final int i2) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public final void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, 0, 0);
                makeText.show();
            }
        });
    }

    @ReactMethod
    public void showWithGravityAndOffset(final String str, final int i, final int i2, final int i3, final int i4) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public final void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, i3, i4);
                makeText.show();
            }
        });
    }
}
