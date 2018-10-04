package com.instagram.business.insights.controller;

public final class InsightsStoryViewerControllerLifecycleUtil {
    public static void cleanupReferences(InsightsStoryViewerController insightsStoryViewerController) {
        insightsStoryViewerController.mHideAnimationCoordinator = null;
    }
}
