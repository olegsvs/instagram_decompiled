package com.instagram.video.live.ui.streaming;

public final class IgLiveWithInviteFragmentLifecycleUtil {
    public static void cleanupReferences(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        igLiveWithInviteFragment.mMainView = null;
        igLiveWithInviteFragment.mInviteDescription = null;
        igLiveWithInviteFragment.mActionButton = null;
        igLiveWithInviteFragment.mListView = null;
        igLiveWithInviteFragment.mBottomControlsContainer = null;
        igLiveWithInviteFragment.mTypeaheadHeader = null;
        igLiveWithInviteFragment.mNullStateView = null;
        igLiveWithInviteFragment.mSpinner = null;
    }
}
