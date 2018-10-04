package com.instagram.igtv.viewer;

public final class InAppNuxContollerLifecycleUtil {
    public static void cleanupReferences(InAppNuxContoller inAppNuxContoller) {
        inAppNuxContoller.mNuxViewStub = null;
        inAppNuxContoller.mNuxView = null;
        inAppNuxContoller.mIconView = null;
        inAppNuxContoller.mDismissButton = null;
    }
}
