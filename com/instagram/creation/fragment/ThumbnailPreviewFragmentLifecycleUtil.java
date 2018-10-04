package com.instagram.creation.fragment;

public final class ThumbnailPreviewFragmentLifecycleUtil {
    public static void cleanupReferences(ThumbnailPreviewFragment thumbnailPreviewFragment) {
        thumbnailPreviewFragment.mContainer = null;
        thumbnailPreviewFragment.mThumbnailPreviewContainer = null;
        thumbnailPreviewFragment.mEmptyStateView = null;
    }
}
