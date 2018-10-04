package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

@ReactModule(name = "RCTVirtualText")
public class ReactVirtualTextViewManager extends BaseViewManager {
    public static final String REACT_CLASS = "RCTVirtualText";

    public String getName() {
        return REACT_CLASS;
    }

    public void updateExtraData(View view, Object obj) {
    }

    public ReactVirtualTextShadowNode createShadowNodeInstance() {
        return new ReactVirtualTextShadowNode();
    }

    public View createViewInstance(ThemedReactContext themedReactContext) {
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    public Class getShadowNodeClass() {
        return ReactVirtualTextShadowNode.class;
    }
}
