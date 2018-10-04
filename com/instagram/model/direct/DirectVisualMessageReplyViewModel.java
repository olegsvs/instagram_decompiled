package com.instagram.model.direct;

import X.AnonymousClass2E8;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class DirectVisualMessageReplyViewModel implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2E8();
    /* renamed from: B */
    public final String f27807B;
    /* renamed from: C */
    public final String f27808C;
    /* renamed from: D */
    public final DirectShareTarget f27809D;
    /* renamed from: E */
    public final String f27810E;
    /* renamed from: F */
    public final boolean f27811F;
    /* renamed from: G */
    public final String f27812G;

    public final int describeContents() {
        return 0;
    }

    public DirectVisualMessageReplyViewModel(Parcel parcel) {
        this.f27809D = (DirectShareTarget) parcel.readParcelable(DirectShareTarget.class.getClassLoader());
        this.f27812G = parcel.readString();
        this.f27808C = parcel.readString();
        this.f27810E = parcel.readString();
        this.f27807B = parcel.readString();
        this.f27811F = parcel.readByte() != (byte) 0;
    }

    public DirectVisualMessageReplyViewModel(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, String str4) {
        this.f27809D = directShareTarget;
        this.f27812G = str;
        this.f27808C = str4;
        this.f27810E = str2;
        this.f27807B = str3;
        this.f27811F = z;
    }

    /* renamed from: B */
    public static boolean m14770B(String str) {
        return (str == null || TextUtils.isEmpty(str.trim()) != null) ? null : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f27809D, i);
        parcel.writeString(this.f27812G);
        parcel.writeString(this.f27808C);
        parcel.writeString(this.f27810E);
        parcel.writeString(this.f27807B);
        parcel.writeByte(this.f27811F);
    }
}
