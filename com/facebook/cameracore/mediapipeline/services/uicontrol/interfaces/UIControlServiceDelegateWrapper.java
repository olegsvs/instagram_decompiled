package com.facebook.cameracore.mediapipeline.services.uicontrol.interfaces;

import X.AnonymousClass2kG;
import X.AnonymousClass2kI;
import com.facebook.native_bridge.NativeDataPromise;

public class UIControlServiceDelegateWrapper {
    /* renamed from: B */
    private final AnonymousClass2kI f45615B;

    public void configurePicker(PickerConfiguration pickerConfiguration) {
    }

    public void hidePicker() {
    }

    public void setPickerSelectedIndex(int i) {
    }

    public void showPicker(OnPickerItemSelectedListener onPickerItemSelectedListener) {
    }

    public void adjust(float f) {
        this.f45615B.onAdjust(f);
    }

    public void enterAdjustableMode(OnAdjustableValueChangedListener onAdjustableValueChangedListener) {
        this.f45615B.onEnterAdjustableMode(onAdjustableValueChangedListener);
    }

    public void enterTextEditMode(String str, boolean z, NativeDataPromise nativeDataPromise) {
        this.f45615B.onEnterTextEditMode(new AnonymousClass2kG(str, z), this);
    }

    public void exitAdjustableMode() {
        this.f45615B.onExitAdjustableMode();
    }
}
