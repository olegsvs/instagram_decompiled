package com.instagram.mainfeed.tooltip;

public final class FavoritesFeedTooltipHelperLifecycleUtil {
    public static void cleanupReferences(FavoritesFeedTooltipHelper favoritesFeedTooltipHelper) {
        favoritesFeedTooltipHelper.mContext = null;
        favoritesFeedTooltipHelper.mListView = null;
        favoritesFeedTooltipHelper.mStickyHeaderListView = null;
    }
}
