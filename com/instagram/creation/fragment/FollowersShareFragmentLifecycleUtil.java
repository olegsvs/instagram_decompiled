package com.instagram.creation.fragment;

public final class FollowersShareFragmentLifecycleUtil {
    public static void cleanupReferences(FollowersShareFragment followersShareFragment) {
        followersShareFragment.mShareTable = null;
        followersShareFragment.mPeopleTagRow = null;
        followersShareFragment.mProductTagRow = null;
        followersShareFragment.mAddHashtagsRow = null;
        followersShareFragment.mAdvancedSettingRow = null;
        followersShareFragment.mPeopleTextView = null;
        followersShareFragment.mProductTextView = null;
        followersShareFragment.mLocationSuggestionsRow = null;
        followersShareFragment.mCaptionBox = null;
        followersShareFragment.mShareTitleContainer = null;
        followersShareFragment.mFavoritesIcon = null;
        followersShareFragment.mFavoritesSwitch = null;
        followersShareFragment.mUploadButtonTextView = null;
    }
}
