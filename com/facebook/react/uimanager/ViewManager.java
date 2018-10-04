package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import java.util.Map;

public abstract class ViewManager extends BaseJavaModule {
    public void addEventEmitters(ThemedReactContext themedReactContext, View view) {
    }

    public abstract View createViewInstance(ThemedReactContext themedReactContext);

    public Map getCommandsMap() {
        return null;
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map getExportedViewConstants() {
        return null;
    }

    public abstract String getName();

    public abstract Class getShadowNodeClass();

    public void onAfterUpdateTransaction(View view) {
    }

    public void onDropViewInstance(View view) {
    }

    public void receiveCommand(View view, int i, ReadableArray readableArray) {
    }

    public abstract void updateExtraData(View view, Object obj);

    public ReactShadowNode createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public ReactShadowNode createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }

    public final View createView(ThemedReactContext themedReactContext, JSResponderHandler jSResponderHandler) {
        View createViewInstance = createViewInstance(themedReactContext);
        addEventEmitters(themedReactContext, createViewInstance);
        if (createViewInstance instanceof ReactInterceptingViewGroup) {
            ((ReactInterceptingViewGroup) createViewInstance).setOnInterceptTouchEventListener(jSResponderHandler);
        }
        return createViewInstance;
    }

    public Map getNativeProps() {
        return ViewManagerPropertyUpdater.getNativeProps(getClass(), getShadowNodeClass());
    }

    public final void updateProperties(View view, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerPropertyUpdater.updateProps(this, view, reactStylesDiffMap);
        onAfterUpdateTransaction(view);
    }
}
