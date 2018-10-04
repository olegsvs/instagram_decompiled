package com.instagram.tagging.model;

import android.os.Parcelable;

public interface TaggableModel extends Parcelable {
    void XOA(String str);

    String getId();
}
