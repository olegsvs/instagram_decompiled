package com.instagram.reels.fragment;

public final class ReelPollVotersTabbedFragmentLifecycleUtil {
    public static void cleanupReferences(ReelPollVotersTabbedFragment reelPollVotersTabbedFragment) {
        reelPollVotersTabbedFragment.mTabController = null;
        reelPollVotersTabbedFragment.mTabBar = null;
        reelPollVotersTabbedFragment.mViewPager = null;
    }
}
