package com.instagram.direct.fragment.recipientpicker.controller;

public final class DirectPrivateStoryRecipientControllerLifecycleUtil {
    public static void cleanupReferences(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        directPrivateStoryRecipientController.mSheetActionButton = null;
        directPrivateStoryRecipientController.mListView = null;
        directPrivateStoryRecipientController.mListContainer = null;
        directPrivateStoryRecipientController.mSearchController = null;
        directPrivateStoryRecipientController.mStickySearchBarAnimationHelper = null;
        directPrivateStoryRecipientController.mCustomScrollAwayNavigationController = null;
        directPrivateStoryRecipientController.mFastScrollController = null;
    }
}
