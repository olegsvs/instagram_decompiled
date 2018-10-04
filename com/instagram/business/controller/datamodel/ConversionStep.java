package com.instagram.business.controller.datamodel;

import X.AnonymousClass34R;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum ConversionStep implements Parcelable {
    INTRO("intro"),
    CREATE_PAGE("create_page"),
    CONTACT("review_contact_info"),
    FACEBOOK_CONNECT("fb_account_selection"),
    PAGE_SELECTION("page_selection"),
    CHOOSE_CATEGORY("choose_category"),
    EDIT_CONTACT("edit_contact_info"),
    PAGES_LOADER("page_checker"),
    COMBINED_INTRO("combined_intro"),
    CHOOSE_FLOW("choose_flow"),
    SIGNUP_SPLASH("signup_intro"),
    CONTACT_POINT("contact_point"),
    ACCOUNT_INFO("name_password"),
    BIZ_PHONE_CONFIRMATION("phone_confirmation"),
    SIGNUP_CONFIRMATION("welcome_user"),
    EDIT_USERNAME("edit_username"),
    UNKNOW("unknown");
    
    public static final Creator CREATOR = null;
    /* renamed from: B */
    public final String f37555B;

    public final int describeContents() {
        return 0;
    }

    static {
        CREATOR = new AnonymousClass34R();
    }

    private ConversionStep(String str) {
        this.f37555B = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
