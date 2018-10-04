package com.instagram.igtv.uploadflow;

public final class IGTVUploadMetadataFragmentLifecycleUtil {
    public static void cleanupReferences(IGTVUploadMetadataFragment iGTVUploadMetadataFragment) {
        iGTVUploadMetadataFragment.mPostButton = null;
        iGTVUploadMetadataFragment.mMediaPreviewParentContainer = null;
        iGTVUploadMetadataFragment.mMediaPreview = null;
        iGTVUploadMetadataFragment.mEditCoverText = null;
        iGTVUploadMetadataFragment.mFacebookPageNameTextView = null;
        iGTVUploadMetadataFragment.mFacebookPageLabelTextView = null;
        iGTVUploadMetadataFragment.mTitleTextView = null;
        iGTVUploadMetadataFragment.mDescriptionTextView = null;
        iGTVUploadMetadataFragment.mCrosspostToggle = null;
        iGTVUploadMetadataFragment.mProcessingProgressDialog = null;
        iGTVUploadMetadataFragment.mTitleRequiredErrorText = null;
        iGTVUploadMetadataFragment.mTitleRequiredErrorIcon = null;
        iGTVUploadMetadataFragment.mPostButtonBouncyListener = null;
        iGTVUploadMetadataFragment.mPostButtonDisabledStateListener = null;
        iGTVUploadMetadataFragment.mKeyboardHeightChangeDetector = null;
        iGTVUploadMetadataFragment.mScrollView = null;
        iGTVUploadMetadataFragment.mScrollViewContent = null;
        iGTVUploadMetadataFragment.mConnectSpinnerView = null;
        iGTVUploadMetadataFragment.mLoadingSpinnerDrawable = null;
    }
}
