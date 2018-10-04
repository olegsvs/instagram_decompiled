package com.facebook.react.uimanager;

import android.view.View;

public abstract class SimpleViewManager extends BaseViewManager {
    public void updateExtraData(View view, Object obj) {
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    public Class getShadowNodeClass() {
        return LayoutShadowNode.class;
    }
}
