package com.instagram.igtv.feed;

public final class IGTVFeedTrayControllerImplLifecycleUtil {
    public static void cleanupReferences(IGTVFeedTrayControllerImpl iGTVFeedTrayControllerImpl) {
        iGTVFeedTrayControllerImpl.mContainerView = null;
        iGTVFeedTrayControllerImpl.mRecyclerView = null;
        iGTVFeedTrayControllerImpl.mTrayTitleTextView = null;
        iGTVFeedTrayControllerImpl.mTopDividerView = null;
        iGTVFeedTrayControllerImpl.mBottomDividerView = null;
        iGTVFeedTrayControllerImpl.mPlayButton = null;
    }
}
