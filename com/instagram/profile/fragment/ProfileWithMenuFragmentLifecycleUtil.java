package com.instagram.profile.fragment;

public final class ProfileWithMenuFragmentLifecycleUtil {
    public static void cleanupReferences(ProfileWithMenuFragment profileWithMenuFragment) {
        profileWithMenuFragment.mSlidingPaneLayout = null;
        profileWithMenuFragment.mActionBar = null;
        profileWithMenuFragment.mTabBar = null;
        profileWithMenuFragment.mTabBarShadow = null;
        profileWithMenuFragment.mMainActivity = null;
    }
}
