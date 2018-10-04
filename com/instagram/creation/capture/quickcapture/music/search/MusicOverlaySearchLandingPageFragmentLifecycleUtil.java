package com.instagram.creation.capture.quickcapture.music.search;

public final class MusicOverlaySearchLandingPageFragmentLifecycleUtil {
    public static void cleanupReferences(MusicOverlaySearchLandingPageFragment musicOverlaySearchLandingPageFragment) {
        musicOverlaySearchLandingPageFragment.mTabBar = null;
        musicOverlaySearchLandingPageFragment.mViewPager = null;
        musicOverlaySearchLandingPageFragment.mTabbedFragmentController = null;
    }
}
