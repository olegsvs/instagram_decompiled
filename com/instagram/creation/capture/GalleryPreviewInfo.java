package com.instagram.creation.capture;

import X.AnonymousClass4I0;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.util.ExifImageData;

public class GalleryPreviewInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass4I0();
    /* renamed from: B */
    public CropInfo f52424B;
    /* renamed from: C */
    public ExifImageData f52425C;
    /* renamed from: D */
    public String f52426D;
    /* renamed from: E */
    public float[] f52427E;

    public final int describeContents() {
        return 0;
    }

    public GalleryPreviewInfo(Parcel parcel) {
        this.f52427E = parcel.createFloatArray();
        this.f52426D = parcel.readString();
        this.f52424B = (CropInfo) parcel.readParcelable(CropInfo.class.getClassLoader());
        this.f52425C = (ExifImageData) parcel.readParcelable(ExifImageData.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.f52427E);
        parcel.writeString(this.f52426D);
        parcel.writeParcelable(this.f52424B, i);
        parcel.writeParcelable(this.f52425C, i);
    }
}
