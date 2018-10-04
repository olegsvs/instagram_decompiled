package com.instagram.creation.state;

import X.AnonymousClass3Ha;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum CreationState implements Parcelable {
    ADJUST,
    ADVANCED_SETTINGS,
    ALBUM_EDIT,
    BRANDED_CONTENT_TAG,
    CAPTURE,
    CROP,
    VIDEO_CROP,
    GALLERY_PICKER,
    INIT,
    LIMIT_LOCATIONS,
    LOCATION_TAG,
    MANAGE,
    MANAGE_DRAFTS,
    PHOTO_EDIT,
    SHARE,
    THUMBNAIL_VIEW,
    UPLOAD,
    VIDEO_EDIT;
    
    public static final Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    static {
        CREATOR = new AnonymousClass3Ha();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
