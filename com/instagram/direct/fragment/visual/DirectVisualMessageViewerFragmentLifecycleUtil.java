package com.instagram.direct.fragment.visual;

public final class DirectVisualMessageViewerFragmentLifecycleUtil {
    public static void cleanupReferences(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        directVisualMessageViewerFragment.mRootView = null;
        directVisualMessageViewerFragment.mContentView = null;
        directVisualMessageViewerFragment.mItemView = null;
        directVisualMessageViewerFragment.mViewerInfoContainer = null;
        directVisualMessageViewerFragment.mProgressBar = null;
        directVisualMessageViewerFragment.mContentHolder = null;
        directVisualMessageViewerFragment.mPhotoTimerController = null;
        directVisualMessageViewerFragment.mVideoPlayer = null;
        directVisualMessageViewerFragment.mVolumeIndicator = null;
        directVisualMessageViewerFragment.mReplyComposerContainer = null;
        directVisualMessageViewerFragment.mComposerEditText = null;
        directVisualMessageViewerFragment.mTextSendButton = null;
        directVisualMessageViewerFragment.mComposerTextWatcher = null;
        directVisualMessageViewerFragment.mKeyboardHeightChangeDetector = null;
        directVisualMessageViewerFragment.mBlurImageViewContainerStubHolder = null;
        directVisualMessageViewerFragment.mSparklerAnimationStubHolder = null;
        directVisualMessageViewerFragment.mBackgroundDimmer = null;
        directVisualMessageViewerFragment.mReelViewerShadowAnimator = null;
    }
}
