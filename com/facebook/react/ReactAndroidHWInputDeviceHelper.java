package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import java.util.Map;

public final class ReactAndroidHWInputDeviceHelper {
    private static final Map KEY_EVENTS_ACTIONS = MapBuilder.of(Integer.valueOf(23), "select", Integer.valueOf(66), "select", Integer.valueOf(62), "select", Integer.valueOf(85), "playPause", Integer.valueOf(89), "rewind", Integer.valueOf(90), "fastForward");
    private int mLastFocusedViewId = -1;
    private final ReactRootView mReactRootView;

    public ReactAndroidHWInputDeviceHelper(ReactRootView reactRootView) {
        this.mReactRootView = reactRootView;
    }

    public final void clearFocus() {
        int i = this.mLastFocusedViewId;
        if (i != -1) {
            dispatchEvent("blur", i);
        }
        this.mLastFocusedViewId = -1;
    }

    private void dispatchEvent(String str, int i) {
        WritableMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        if (i != -1) {
            writableNativeMap.putInt("tag", i);
        }
        this.mReactRootView.sendEvent("onHWKeyEvent", writableNativeMap);
    }

    public final void handleKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 1) {
            Map map = KEY_EVENTS_ACTIONS;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                dispatchEvent((String) map.get(Integer.valueOf(keyCode)), this.mLastFocusedViewId);
            }
        }
    }

    public final void onFocusChanged(View view) {
        if (this.mLastFocusedViewId != view.getId()) {
            int i = this.mLastFocusedViewId;
            if (i != -1) {
                dispatchEvent("blur", i);
            }
            this.mLastFocusedViewId = view.getId();
            dispatchEvent("focus", view.getId());
        }
    }
}
