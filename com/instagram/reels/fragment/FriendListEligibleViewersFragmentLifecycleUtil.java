package com.instagram.reels.fragment;

public final class FriendListEligibleViewersFragmentLifecycleUtil {
    public static void cleanupReferences(FriendListEligibleViewersFragment friendListEligibleViewersFragment) {
        friendListEligibleViewersFragment.mRecyclerView = null;
        friendListEligibleViewersFragment.mLoadingView = null;
    }
}
