package com.facebook.cameracore.mediapipeline.services.cameracontrol.interfaces;

import X.AnonymousClass2jK;
import X.AnonymousClass2jL;

public class CameraControlServiceDelegateWrapper {
    private final CameraControlServiceDelegate mDelegate;

    public CameraControlServiceDelegateWrapper(CameraControlServiceDelegate cameraControlServiceDelegate) {
        this.mDelegate = cameraControlServiceDelegate;
    }

    public boolean canUpdateCaptureDevicePosition(int i) {
        return this.mDelegate.canUpdateCaptureDevicePosition(captureDevicePositionForInt(i));
    }

    private static AnonymousClass2jK captureDevicePositionForInt(int i) {
        if (i < 0 || i >= AnonymousClass2jK.values().length) {
            return AnonymousClass2jK.Back;
        }
        return AnonymousClass2jK.values()[i];
    }

    private static AnonymousClass2jL focusModeForInt(int i) {
        if (i < 0 || i >= AnonymousClass2jL.values().length) {
            return AnonymousClass2jL.AutoFocus;
        }
        return AnonymousClass2jL.values()[i];
    }

    public long getExposureTime() {
        return this.mDelegate.getExposureTime();
    }

    public int getIso() {
        return this.mDelegate.getIso();
    }

    public long getMaxExposureTime() {
        return this.mDelegate.getMaxExposureTime();
    }

    public int getMaxIso() {
        return this.mDelegate.getMaxIso();
    }

    public long getMinExposureTime() {
        return this.mDelegate.getMinExposureTime();
    }

    public int getMinIso() {
        return this.mDelegate.getMinIso();
    }

    public boolean isFocusModeSupported(int i) {
        return this.mDelegate.isFocusModeSupported(focusModeForInt(i));
    }

    public boolean isLockExposureAndFocusSupported() {
        return this.mDelegate.isLockExposureAndFocusSupported();
    }

    public void lockExposureAndFocus(long j, int i) {
        this.mDelegate.lockExposureAndFocus(j, i);
    }

    public void unlockExposureAndFocus() {
        this.mDelegate.unlockExposureAndFocus();
    }

    public void updateCaptureDevicePosition(int i) {
        this.mDelegate.updateCaptureDevicePosition(captureDevicePositionForInt(i));
    }

    public void updateFocusMode(int i) {
        this.mDelegate.updateFocusMode(focusModeForInt(i));
    }
}
