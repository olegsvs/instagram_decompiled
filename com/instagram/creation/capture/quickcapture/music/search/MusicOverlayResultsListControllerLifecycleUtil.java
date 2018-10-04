package com.instagram.creation.capture.quickcapture.music.search;

public final class MusicOverlayResultsListControllerLifecycleUtil {
    public static void cleanupReferences(MusicOverlayResultsListController musicOverlayResultsListController) {
        musicOverlayResultsListController.mParentView = null;
        musicOverlayResultsListController.mRecyclerView = null;
        musicOverlayResultsListController.mLayoutManager = null;
    }
}
