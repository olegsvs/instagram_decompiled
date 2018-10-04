package com.instagram.ui.widget.search;

public final class SearchControllerLifecycleUtil {
    public static void cleanupReferences(SearchController searchController) {
        searchController.mViewHolder = null;
    }
}
