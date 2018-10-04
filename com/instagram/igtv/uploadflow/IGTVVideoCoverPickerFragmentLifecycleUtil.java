package com.instagram.igtv.uploadflow;

public final class IGTVVideoCoverPickerFragmentLifecycleUtil {
    public static void cleanupReferences(IGTVVideoCoverPickerFragment iGTVVideoCoverPickerFragment) {
        iGTVVideoCoverPickerFragment.mPreviewTextureView = null;
        iGTVVideoCoverPickerFragment.mParentContainer = null;
        iGTVVideoCoverPickerFragment.mFilmStripHolderLayout = null;
        iGTVVideoCoverPickerFragment.mSeekBar = null;
        iGTVVideoCoverPickerFragment.mThumb = null;
        iGTVVideoCoverPickerFragment.mCoverFrameExtractionProgressDialog = null;
    }
}
