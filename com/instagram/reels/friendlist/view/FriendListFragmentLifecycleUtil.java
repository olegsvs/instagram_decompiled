package com.instagram.reels.friendlist.view;

public final class FriendListFragmentLifecycleUtil {
    public static void cleanupReferences(FriendListFragment friendListFragment) {
        friendListFragment.mMainContainer = null;
        friendListFragment.mMembersTabViewLabel = null;
        friendListFragment.mMembersTabView = null;
        friendListFragment.mSearchRow = null;
        friendListFragment.mHeader = null;
        friendListFragment.mSearchAdapter = null;
        friendListFragment.mTabbedFragmentController = null;
        friendListFragment.mFriendListNameEditTextContainer = null;
        friendListFragment.mFocusOverlay = null;
        friendListFragment.mDoneButton = null;
        friendListFragment.mCheckButton = null;
        friendListFragment.mFriendListNameEditorController = null;
    }
}
