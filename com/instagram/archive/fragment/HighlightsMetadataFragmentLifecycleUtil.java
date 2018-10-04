package com.instagram.archive.fragment;

public final class HighlightsMetadataFragmentLifecycleUtil {
    public static void cleanupReferences(HighlightsMetadataFragment highlightsMetadataFragment) {
        highlightsMetadataFragment.mHighlightTitle = null;
        highlightsMetadataFragment.mCoverImageView = null;
        highlightsMetadataFragment.mEditCoverImageButton = null;
        highlightsMetadataFragment.mLaunchStoryCreationWithHighlightStickerSwitch = null;
    }
}
