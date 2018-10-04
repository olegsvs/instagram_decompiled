package com.facebook.react.bridge;

import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;

public interface UIManager extends JSIModule, PerformanceCounter {
    int addRootView(SizeMonitoringFrameLayout sizeMonitoringFrameLayout);

    void dispatchCommand(int i, int i2, ReadableArray readableArray);

    void updateRootLayoutSpecs(int i, int i2, int i3);
}
