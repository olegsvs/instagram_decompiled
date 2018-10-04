package com.instagram.igtv.viewer;

public final class IGTVViewerFragmentLifecycleUtil {
    public static void cleanupReferences(IGTVViewerFragment iGTVViewerFragment) {
        iGTVViewerFragment.mInAppNuxContoller = null;
        iGTVViewerFragment.mRootView = null;
        iGTVViewerFragment.mInnerContainer = null;
        iGTVViewerFragment.mInsightsView = null;
        iGTVViewerFragment.mAudioController = null;
        iGTVViewerFragment.mVolumeIndicator = null;
        iGTVViewerFragment.mVideoPlayerController = null;
        iGTVViewerFragment.mChannelPager = null;
        iGTVViewerFragment.mTVGuideController = null;
        iGTVViewerFragment.mSearchController = null;
        iGTVViewerFragment.mGestureManager = null;
        iGTVViewerFragment.mDragToDismissController = null;
        iGTVViewerFragment.mVideoSeekObserver = null;
        iGTVViewerFragment.mChromeRevealGestureObserver = null;
        iGTVViewerFragment.mModalDrawerController = null;
        iGTVViewerFragment.mDrawerContent = null;
        iGTVViewerFragment.mVideoPlaybackStateManager = null;
        iGTVViewerFragment.mTVGuideImpressionManager = null;
        iGTVViewerFragment.mTVViewerImpressionManager = null;
        iGTVViewerFragment.mWebLinkShimProgressDialog = null;
    }
}
