package com.facebook.cameracore.mediapipeline.services.captureevent.implementation;

import X.AnonymousClass3rz;
import com.facebook.jni.HybridData;

public class CaptureEventInputWrapper {
    private final AnonymousClass3rz mCaptureEventInput;
    private final HybridData mHybridData = initHybrid(this.mCaptureEventInput.f45584F, this.mCaptureEventInput.f45582D, this.mCaptureEventInput.f45581C, this.mCaptureEventInput.f45583E);

    private static native HybridData initHybrid(int i, int i2, int i3, int i4);

    public native void capturePhoto();

    public native void finishCapturePhoto();

    public native void setCaptureDevicePosition(int i);

    public native void setCaptureDeviceSize(int i, int i2);

    public native void setEffectSafeAreaInsets(int i, int i2, int i3, int i4);

    public native void setPreviewViewInfo(int i, int i2, float f);

    public native void setRotation(int i);

    public native void startRecording();

    public native void stopRecording();

    public CaptureEventInputWrapper(AnonymousClass3rz anonymousClass3rz) {
        this.mCaptureEventInput = anonymousClass3rz;
    }
}
