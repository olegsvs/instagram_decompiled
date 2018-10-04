package com.instagram.profile.edit.controller;

public final class EditProfileFieldsControllerLifecycleUtil {
    public static void cleanupReferences(EditProfileFieldsController editProfileFieldsController) {
        editProfileFieldsController.mNameField = null;
        editProfileFieldsController.mUsernameField = null;
        editProfileFieldsController.mContext = null;
    }
}
