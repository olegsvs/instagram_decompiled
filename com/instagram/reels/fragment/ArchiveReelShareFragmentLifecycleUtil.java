package com.instagram.reels.fragment;

public final class ArchiveReelShareFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveReelShareFragment archiveReelShareFragment) {
        archiveReelShareFragment.mQuickCaptureController = null;
        archiveReelShareFragment.mLoadingView = null;
    }
}
