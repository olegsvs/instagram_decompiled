package com.facebook.react.uimanager;

import com.facebook.yoga.YogaDirection;

public interface ReactShadowNode {
    void addChildAt(ReactShadowNode reactShadowNode, int i);

    void addNativeChildAt(ReactShadowNode reactShadowNode, int i);

    void calculateLayout();

    void dirty();

    boolean dispatchUpdates(float f, float f2, UIViewOperationQueue uIViewOperationQueue, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer);

    void dispose();

    ReactShadowNode getChildAt(int i);

    int getChildCount();

    float getLayoutX();

    float getLayoutY();

    int getNativeChildCount();

    int getNativeOffsetForChild(ReactShadowNode reactShadowNode);

    ReactShadowNode getNativeParent();

    ReactShadowNode getParent();

    int getReactTag();

    int getRootTag();

    int getScreenHeight();

    int getScreenWidth();

    int getScreenX();

    int getScreenY();

    ThemedReactContext getThemedContext();

    String getViewClass();

    boolean hasUpdates();

    int indexOf(ReactShadowNode reactShadowNode);

    int indexOfNativeChild(ReactShadowNode reactShadowNode);

    boolean isDescendantOf(ReactShadowNode reactShadowNode);

    boolean isLayoutOnly();

    boolean isVirtual();

    boolean isVirtualAnchor();

    void markUpdateSeen();

    void onBeforeLayout();

    void removeAllNativeChildren();

    void removeAndDisposeAllChildren();

    ReactShadowNode removeChildAt(int i);

    ReactShadowNode removeNativeChildAt(int i);

    void setIsLayoutOnly(boolean z);

    void setLayoutDirection(YogaDirection yogaDirection);

    void setLocalData(Object obj);

    void setReactTag(int i);

    void setRootTag(int i);

    void setStyleHeight(float f);

    void setStyleHeightAuto();

    void setStyleMaxHeight(float f);

    void setStyleMaxWidth(float f);

    void setStyleWidth(float f);

    void setStyleWidthAuto();

    void setThemedContext(ThemedReactContext themedReactContext);

    void setViewClassName(String str);

    boolean shouldNotifyOnLayout();

    void updateProperties(ReactStylesDiffMap reactStylesDiffMap);
}
