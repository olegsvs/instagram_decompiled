package com.instagram.igtv.logging;

import X.AnonymousClass3RG;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IGTVLaunchAnalytics implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3RG();
    /* renamed from: B */
    public Boolean f13865B;
    /* renamed from: C */
    public Boolean f13866C;
    /* renamed from: D */
    public String f13867D;

    public final int describeContents() {
        return 0;
    }

    public IGTVLaunchAnalytics(Parcel parcel) {
        Boolean bool;
        byte readByte = parcel.readByte();
        boolean z = false;
        Boolean bool2 = null;
        if (readByte == (byte) 0) {
            bool = null;
        } else {
            bool = Boolean.valueOf(readByte == (byte) 1);
        }
        this.f13865B = bool;
        readByte = parcel.readByte();
        if (readByte != (byte) 0) {
            if (readByte == (byte) 1) {
                z = true;
            }
            bool2 = Boolean.valueOf(z);
        }
        this.f13866C = bool2;
        this.f13867D = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.f13865B;
        int i2 = 1;
        int i3 = bool == null ? 0 : bool.booleanValue() ? 1 : 2;
        parcel.writeByte((byte) i3);
        bool = this.f13866C;
        if (bool == null) {
            i2 = 0;
        } else if (!bool.booleanValue()) {
            i2 = 2;
        }
        parcel.writeByte((byte) i2);
        parcel.writeString(this.f13867D);
    }
}
