package com.instagram.reels.friendlist.view;

public final class FriendListTabFragmentLifecycleUtil {
    public static void cleanupReferences(FriendListTabFragment friendListTabFragment) {
        friendListTabFragment.mList = null;
        friendListTabFragment.mEmptyStateView = null;
        friendListTabFragment.mListRemovalAnimationShimHolder = null;
        friendListTabFragment.mRowRemovalAnimator = null;
    }
}
