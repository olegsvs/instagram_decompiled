package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.modal.ReactModalHostView.OnRequestCloseListener;
import java.util.Map;

@ReactModule(name = "RCTModalHostView")
public class ReactModalHostManager extends ViewGroupManager {
    public static final String REACT_CLASS = "RCTModalHostView";

    public String getName() {
        return REACT_CLASS;
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, final ReactModalHostView reactModalHostView) {
        final EventDispatcher eventDispatcher = ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        reactModalHostView.setOnRequestCloseListener(new OnRequestCloseListener() {
            public final void onRequestClose(DialogInterface dialogInterface) {
                eventDispatcher.dispatchEvent(new RequestCloseEvent(reactModalHostView.getId()));
            }
        });
        reactModalHostView.setOnShowListener(new OnShowListener() {
            public final void onShow(DialogInterface dialogInterface) {
                eventDispatcher.dispatchEvent(new ShowEvent(reactModalHostView.getId()));
            }
        });
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new ModalHostShadowNode();
    }

    public ReactModalHostView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactModalHostView(themedReactContext);
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        String str = "registrationName";
        return MapBuilder.builder().put("topRequestClose", MapBuilder.of(str, "onRequestClose")).put("topShow", MapBuilder.of(str, "onShow")).build();
    }

    public Class getShadowNodeClass() {
        return ModalHostShadowNode.class;
    }

    public void onAfterUpdateTransaction(ReactModalHostView reactModalHostView) {
        super.onAfterUpdateTransaction(reactModalHostView);
        reactModalHostView.showOrUpdate();
    }

    public void onDropViewInstance(ReactModalHostView reactModalHostView) {
        super.onDropViewInstance(reactModalHostView);
        reactModalHostView.onDropInstance();
    }

    @ReactProp(name = "animationType")
    public void setAnimationType(ReactModalHostView reactModalHostView, String str) {
        reactModalHostView.setAnimationType(str);
    }

    @ReactProp(name = "hardwareAccelerated")
    public void setHardwareAccelerated(ReactModalHostView reactModalHostView, boolean z) {
        reactModalHostView.setHardwareAccelerated(z);
    }

    @ReactProp(name = "transparent")
    public void setTransparent(ReactModalHostView reactModalHostView, boolean z) {
        reactModalHostView.setTransparent(z);
    }
}
