package com.instagram.direct.fragment.inbox;

public final class DirectSearchInboxFragmentLifecycleUtil {
    public static void cleanupReferences(DirectSearchInboxFragment directSearchInboxFragment) {
        directSearchInboxFragment.mTouchInterceptorFrameLayout = null;
    }
}
