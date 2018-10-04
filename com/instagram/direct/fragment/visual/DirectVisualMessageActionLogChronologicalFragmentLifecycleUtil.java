package com.instagram.direct.fragment.visual;

public final class DirectVisualMessageActionLogChronologicalFragmentLifecycleUtil {
    public static void cleanupReferences(DirectVisualMessageActionLogChronologicalFragment directVisualMessageActionLogChronologicalFragment) {
        directVisualMessageActionLogChronologicalFragment.mRecyclerView = null;
        directVisualMessageActionLogChronologicalFragment.mSpinner = null;
    }
}
