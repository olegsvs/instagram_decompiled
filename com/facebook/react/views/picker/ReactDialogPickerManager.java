package com.facebook.react.views.picker;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;

@ReactModule(name = "AndroidDialogPicker")
public class ReactDialogPickerManager extends ReactPickerManager {
    public static final String REACT_CLASS = "AndroidDialogPicker";

    public String getName() {
        return REACT_CLASS;
    }

    public ReactPicker createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactPicker(themedReactContext, 0);
    }
}
