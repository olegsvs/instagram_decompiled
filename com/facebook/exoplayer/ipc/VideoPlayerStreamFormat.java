package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l5;
import X.AnonymousClass2rO;
import X.AnonymousClass2td;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class VideoPlayerStreamFormat extends AnonymousClass2rO implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2l5();

    public final int describeContents() {
        return 0;
    }

    public VideoPlayerStreamFormat(AnonymousClass2rO anonymousClass2rO) {
        AnonymousClass2rO anonymousClass2rO2 = anonymousClass2rO;
        this(anonymousClass2rO2.f35068Q, anonymousClass2rO2.f35070S, anonymousClass2rO2.f35071T, anonymousClass2rO2.f35067P, anonymousClass2rO2.f35066O, anonymousClass2rO2.f35053B, anonymousClass2rO2.f35054C, anonymousClass2rO2.f35055D, anonymousClass2rO2.f35069R, anonymousClass2rO2.f35056E, anonymousClass2rO2.f35065N, anonymousClass2rO2.f35062K, anonymousClass2rO2.f35063L, anonymousClass2rO2.f35064M);
    }

    public VideoPlayerStreamFormat(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        float readFloat = parcel.readFloat();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        super(readString, readString2, readInt, readInt2, readFloat, readInt3, readInt4, readInt5, readString3, readString4, readString5, z, parcel.readString(), parcel.readString());
    }

    public VideoPlayerStreamFormat(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4, String str5, boolean z, String str6, String str7) {
        super((String) AnonymousClass2td.m17605D(str), str2, i, i2, f, i3, i4, i5, str3, str4, str5, z, str6, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return ((VideoPlayerStreamFormat) obj).f35068Q.equals(this.f35068Q);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35068Q.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35068Q);
        parcel.writeString(this.f35070S);
        parcel.writeInt(this.f35071T);
        parcel.writeInt(this.f35067P);
        parcel.writeFloat(this.f35066O);
        parcel.writeInt(this.f35053B);
        parcel.writeInt(this.f35054C);
        parcel.writeInt(this.f35055D);
        parcel.writeString(this.f35069R);
        parcel.writeString(this.f35056E);
        parcel.writeString(this.f35065N);
        parcel.writeInt(this.f35062K);
        parcel.writeString(this.f35063L);
        parcel.writeString(this.f35064M);
    }
}
