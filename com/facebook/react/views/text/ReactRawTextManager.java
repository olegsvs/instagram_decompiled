package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;

@ReactModule(name = "RCTRawText")
public class ReactRawTextManager extends ViewManager {
    public static final String REACT_CLASS = "RCTRawText";

    public String getName() {
        return REACT_CLASS;
    }

    public void updateExtraData(View view, Object obj) {
    }

    public ReactRawTextShadowNode createShadowNodeInstance() {
        return new ReactRawTextShadowNode();
    }

    public ReactTextView createViewInstance(ThemedReactContext themedReactContext) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    public Class getShadowNodeClass() {
        return ReactRawTextShadowNode.class;
    }
}
