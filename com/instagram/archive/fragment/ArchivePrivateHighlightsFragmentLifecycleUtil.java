package com.instagram.archive.fragment;

public final class ArchivePrivateHighlightsFragmentLifecycleUtil {
    public static void cleanupReferences(ArchivePrivateHighlightsFragment archivePrivateHighlightsFragment) {
        archivePrivateHighlightsFragment.mHideAnimationCoordinator = null;
    }
}
