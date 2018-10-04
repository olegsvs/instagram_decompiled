package com.instagram.audience;

public final class FavoritesListFragmentLifecycleUtil {
    public static void cleanupReferences(FavoritesListFragment favoritesListFragment) {
        favoritesListFragment.mList = null;
        favoritesListFragment.mEmptyStateView = null;
        favoritesListFragment.mListRemovalAnimationShimHolder = null;
        favoritesListFragment.mRowRemovalAnimator = null;
    }
}
