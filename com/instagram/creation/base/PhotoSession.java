package com.instagram.creation.base;

import X.AnonymousClass1Qh;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.IgFilterGroup;

public class PhotoSession implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1Qh();
    /* renamed from: B */
    public float f38979B;
    /* renamed from: C */
    public CropInfo f38980C;
    /* renamed from: D */
    public int f38981D;
    /* renamed from: E */
    public IgFilterGroup f38982E;
    /* renamed from: F */
    public Location f38983F;
    /* renamed from: G */
    public boolean f38984G;
    /* renamed from: H */
    public String f38985H;
    /* renamed from: I */
    public String f38986I;
    /* renamed from: J */
    public IgFilterGroup f38987J;

    public final int describeContents() {
        return 0;
    }

    public PhotoSession(Parcel parcel) {
        this.f38985H = parcel.readString();
        this.f38981D = parcel.readInt();
        this.f38980C = (CropInfo) parcel.readParcelable(CropInfo.class.getClassLoader());
        this.f38982E = (IgFilterGroup) parcel.readParcelable(IgFilterGroup.class.getClassLoader());
        this.f38987J = (IgFilterGroup) parcel.readParcelable(IgFilterGroup.class.getClassLoader());
        this.f38986I = parcel.readString();
        boolean z = true;
        if (parcel.readByte() != (byte) 1) {
            z = false;
        }
        this.f38984G = z;
        this.f38979B = parcel.readFloat();
        this.f38983F = (Location) parcel.readParcelable(Location.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38985H);
        parcel.writeInt(this.f38981D);
        parcel.writeParcelable(this.f38980C, i);
        parcel.writeParcelable(this.f38982E, i);
        parcel.writeParcelable(this.f38987J, i);
        parcel.writeString(this.f38986I);
        parcel.writeByte((byte) this.f38984G);
        parcel.writeFloat(this.f38979B);
        parcel.writeParcelable(this.f38983F, i);
    }
}
