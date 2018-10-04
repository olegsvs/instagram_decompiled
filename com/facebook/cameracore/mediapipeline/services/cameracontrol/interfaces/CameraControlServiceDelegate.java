package com.facebook.cameracore.mediapipeline.services.cameracontrol.interfaces;

import X.AnonymousClass2jK;
import X.AnonymousClass2jL;

public interface CameraControlServiceDelegate {
    boolean canUpdateCaptureDevicePosition(AnonymousClass2jK anonymousClass2jK);

    long getExposureTime();

    int getIso();

    long getMaxExposureTime();

    int getMaxIso();

    long getMinExposureTime();

    int getMinIso();

    boolean isFocusModeSupported(AnonymousClass2jL anonymousClass2jL);

    boolean isLockExposureAndFocusSupported();

    void lockExposureAndFocus(long j, int i);

    void unlockExposureAndFocus();

    void updateCaptureDevicePosition(AnonymousClass2jK anonymousClass2jK);

    void updateFocusMode(AnonymousClass2jL anonymousClass2jL);
}
