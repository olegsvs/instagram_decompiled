package com.instagram.model.fbfriend;

import X.AnonymousClass0mc;
import X.AnonymousClass1Og;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.instagram.tagging.model.TaggableModel;

public class FbFriend implements AnonymousClass0mc, TaggableModel {
    public static final Creator CREATOR = new AnonymousClass1Og();
    /* renamed from: B */
    public String f9868B;
    /* renamed from: C */
    public String f9869C;
    /* renamed from: D */
    public Boolean f9870D;
    /* renamed from: E */
    public String f9871E;

    public final int describeContents() {
        return 0;
    }

    public FbFriend(Parcel parcel) {
        this.f9868B = parcel.readString();
        this.f9869C = parcel.readString();
        this.f9871E = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f9870D = Boolean.valueOf(z);
    }

    public final boolean ON() {
        Boolean bool = this.f9870D;
        return bool == null ? false : bool.booleanValue();
    }

    public final void XOA(String str) {
        this.f9868B = str;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    FbFriend fbFriend = (FbFriend) obj;
                    if (!TextUtils.equals(this.f9868B, fbFriend.f9868B) || !TextUtils.equals(this.f9869C, fbFriend.f9869C) || !TextUtils.equals(this.f9871E, fbFriend.f9871E)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final String getId() {
        return this.f9868B;
    }

    public final int hashCode() {
        String str = this.f9868B;
        int hashCode = str != null ? str.hashCode() : 0;
        str = this.f9869C;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        str = this.f9871E;
        return str != null ? (hashCode * 31) + str.hashCode() : hashCode;
    }

    public final void oOA(boolean z) {
        this.f9870D = Boolean.valueOf(z);
    }

    public final String toString() {
        String str = this.f9868B;
        if (str != null) {
            return str;
        }
        return super.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9868B);
        parcel.writeString(this.f9869C);
        parcel.writeString(this.f9871E);
        parcel.writeInt(Boolean.TRUE.equals(this.f9870D));
    }
}
