package com.instagram.react.perf;

import X.AnonymousClass5t5;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

public class IgReactPerformanceLoggerFlagManager extends ViewGroupManager {
    private static final String REACT_CLASS = "ReactPerformanceLoggerFlag";
    private final AnonymousClass5t5 mReactPerformanceFlagListener;

    public String getName() {
        return REACT_CLASS;
    }

    public IgReactPerformanceLoggerFlagManager(AnonymousClass5t5 anonymousClass5t5) {
        this.mReactPerformanceFlagListener = anonymousClass5t5;
    }

    public IgReactPerformanceLoggerFlag createViewInstance(ThemedReactContext themedReactContext) {
        return new IgReactPerformanceLoggerFlag(themedReactContext, this.mReactPerformanceFlagListener);
    }
}
