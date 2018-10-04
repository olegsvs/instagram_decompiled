package com.instagram.igtv.uploadflow;

public final class IGTVUploadGalleryFragmentLifecycleUtil {
    public static void cleanupReferences(IGTVUploadGalleryFragment iGTVUploadGalleryFragment) {
        iGTVUploadGalleryFragment.mContainer = null;
        iGTVUploadGalleryFragment.mGalleryGridView = null;
        iGTVUploadGalleryFragment.mLoadingSpinner = null;
        iGTVUploadGalleryFragment.mGalleryPickerView = null;
        iGTVUploadGalleryFragment.mCoverFrameRenderingProgressDialog = null;
        iGTVUploadGalleryFragment.mEmptyGalleryText = null;
        iGTVUploadGalleryFragment.mPermissionEmptyStateController = null;
    }
}
