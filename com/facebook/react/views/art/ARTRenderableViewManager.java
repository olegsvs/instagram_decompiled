package com.facebook.react.views.art;

import android.view.View;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;

public class ARTRenderableViewManager extends ViewManager {
    public static final String CLASS_GROUP = "ARTGroup";
    public static final String CLASS_SHAPE = "ARTShape";
    public static final String CLASS_TEXT = "ARTText";
    private final String mClassName;

    public ARTRenderableViewManager(String str) {
        this.mClassName = str;
    }

    public static ARTRenderableViewManager createARTGroupViewManager() {
        return new ARTGroupViewManager();
    }

    public static ARTRenderableViewManager createARTShapeViewManager() {
        return new ARTShapeViewManager();
    }

    public static ARTRenderableViewManager createARTTextViewManager() {
        return new ARTTextViewManager();
    }

    public ReactShadowNode createShadowNodeInstance() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return new ARTGroupShadowNode();
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return new ARTShapeShadowNode();
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return new ARTTextShadowNode();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected type ");
        stringBuilder.append(this.mClassName);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public View createViewInstance(ThemedReactContext themedReactContext) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }

    public String getName() {
        return this.mClassName;
    }

    public Class getShadowNodeClass() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return ARTGroupShadowNode.class;
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return ARTShapeShadowNode.class;
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return ARTTextShadowNode.class;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected type ");
        stringBuilder.append(this.mClassName);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void updateExtraData(View view, Object obj) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }
}
