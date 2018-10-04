package com.instagram.igtv.viewer.tvguide;

public final class IGTVSearchControllerLifecycleUtil {
    public static void cleanupReferences(IGTVSearchController iGTVSearchController) {
        iGTVSearchController.mCustomLoadingSpinnerView = null;
    }
}
