package com.instagram.school.fragment;

public final class UpdateSchoolFragmentLifecycleUtil {
    public static void cleanupReferences(UpdateSchoolFragment updateSchoolFragment) {
        updateSchoolFragment.mSchoolEditText = null;
        updateSchoolFragment.mClassYearPicker = null;
        updateSchoolFragment.mDescriptionEditText = null;
        updateSchoolFragment.mEditableFields = null;
        updateSchoolFragment.mTagPreviewTextView = null;
        updateSchoolFragment.mRemoveSchoolDivider = null;
        updateSchoolFragment.mRemoveSchoolButton = null;
        updateSchoolFragment.mSaveButton = null;
    }
}
