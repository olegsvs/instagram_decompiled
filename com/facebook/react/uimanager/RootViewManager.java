package com.facebook.react.uimanager;

import android.view.ViewGroup;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;

public class RootViewManager extends ViewGroupManager {
    public static final String REACT_CLASS = "RootView";

    public String getName() {
        return REACT_CLASS;
    }

    public ViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        return new SizeMonitoringFrameLayout(themedReactContext);
    }
}
