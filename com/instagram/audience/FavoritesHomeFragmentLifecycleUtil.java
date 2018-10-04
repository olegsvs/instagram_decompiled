package com.instagram.audience;

public final class FavoritesHomeFragmentLifecycleUtil {
    public static void cleanupReferences(FavoritesHomeFragment favoritesHomeFragment) {
        favoritesHomeFragment.mMainContainer = null;
        favoritesHomeFragment.mProgressDialog = null;
        favoritesHomeFragment.mMembersTabViewLabel = null;
        favoritesHomeFragment.mMembersTabView = null;
        favoritesHomeFragment.mSearchRow = null;
        favoritesHomeFragment.mHeader = null;
        favoritesHomeFragment.mHeaderDescription = null;
        favoritesHomeFragment.mSearchAdapter = null;
        favoritesHomeFragment.mTabbedFragmentController = null;
    }
}
