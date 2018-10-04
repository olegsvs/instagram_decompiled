package com.instagram.igtv.uploadflow;

public final class IGTVUploadPreviewFragmentLifecycleUtil {
    public static void cleanupReferences(IGTVUploadPreviewFragment iGTVUploadPreviewFragment) {
        iGTVUploadPreviewFragment.mVideoPreviewView = null;
        iGTVUploadPreviewFragment.mPauseButton = null;
        iGTVUploadPreviewFragment.mVideoTimer = null;
        iGTVUploadPreviewFragment.mSeekBar = null;
    }
}
