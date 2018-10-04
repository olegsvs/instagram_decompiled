package com.instagram.ui.widget.search;

public final class StickySearchBarAnimationHelperLifecycleUtil {
    public static void cleanupReferences(StickySearchBarAnimationHelper stickySearchBarAnimationHelper) {
        stickySearchBarAnimationHelper.mActivity = null;
        stickySearchBarAnimationHelper.mSearchController = null;
        stickySearchBarAnimationHelper.mListView = null;
    }
}
