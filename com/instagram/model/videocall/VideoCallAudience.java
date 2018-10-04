package com.instagram.model.videocall;

import X.AnonymousClass3VA;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class VideoCallAudience implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3VA();
    /* renamed from: B */
    public final List f4469B;
    /* renamed from: C */
    public final String f4470C;
    /* renamed from: D */
    public final String f4471D;
    /* renamed from: E */
    public final String f4472E;
    /* renamed from: F */
    public final boolean f4473F;

    public final int describeContents() {
        return 0;
    }

    public VideoCallAudience(Parcel parcel) {
        this.f4469B = parcel.readArrayList(String.class.getClassLoader());
        this.f4470C = parcel.readString();
        this.f4471D = parcel.readString();
        boolean z = true;
        if (parcel.readByte() != (byte) 1) {
            z = false;
        }
        this.f4473F = z;
        this.f4472E = parcel.readString();
    }

    public VideoCallAudience(List list, boolean z, String str, String str2, String str3) {
        this.f4469B = list;
        this.f4473F = z;
        this.f4470C = str;
        this.f4471D = str2;
        this.f4472E = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f4469B);
        parcel.writeString(this.f4470C);
        parcel.writeString(this.f4471D);
        parcel.writeByte((byte) this.f4473F);
        parcel.writeString(this.f4472E);
    }
}
