package com.instagram.archive.fragment;

public final class ManageHighlightsFragmentLifecycleUtil {
    public static void cleanupReferences(ManageHighlightsFragment manageHighlightsFragment) {
        manageHighlightsFragment.mTabbedFragmentController = null;
    }
}
