package com.instagram.school.fragment;

public final class SchoolDirectoryControllerLifecycleUtil {
    public static void cleanupReferences(SchoolDirectoryController schoolDirectoryController) {
        schoolDirectoryController.mContainer = null;
        schoolDirectoryController.mFixedTabBar = null;
        schoolDirectoryController.mFragmentPager = null;
        schoolDirectoryController.mProgressBar = null;
    }
}
