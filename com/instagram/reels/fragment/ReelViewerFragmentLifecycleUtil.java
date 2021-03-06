package com.instagram.reels.fragment;

public final class ReelViewerFragmentLifecycleUtil {
    public static void cleanupReferences(ReelViewerFragment reelViewerFragment) {
        reelViewerFragment.mBackgroundDimmer = null;
        reelViewerFragment.mViewRoot = null;
        reelViewerFragment.mViewPager = null;
        reelViewerFragment.mPhotoTimerController = null;
        reelViewerFragment.mMessageComposerContainer = null;
        reelViewerFragment.mVisualReplyComposerButtonContainer = null;
        reelViewerFragment.mMessageComposer = null;
        reelViewerFragment.mMessageComposerSendBtn = null;
        reelViewerFragment.mMessageComposerText = null;
        reelViewerFragment.mVideoPlayer = null;
        reelViewerFragment.mVolumeIndicator = null;
        reelViewerFragment.mMessageComposerTextWatcher = null;
        reelViewerFragment.mDragToDismissController = null;
        reelViewerFragment.mLoadingOverlay = null;
        reelViewerFragment.mLoadingOverlaySpinner = null;
        reelViewerFragment.mReelLoadingVisualization = null;
        reelViewerFragment.mReelLoadingVisualizationAdapterObserver = null;
        reelViewerFragment.mViewerBackgroundView = null;
        reelViewerFragment.mAvatarAnimationView = null;
        reelViewerFragment.mReelInteractiveController = null;
        reelViewerFragment.mReelViewerListenerManager = null;
        reelViewerFragment.mBitmapReferenceManager = null;
        reelViewerFragment.mSuggestedHighlightsController = null;
    }
}
