package com.instagram.creation.base;

import X.AnonymousClass3CB;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class CropInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3CB();
    /* renamed from: B */
    public Rect f38970B;
    /* renamed from: C */
    public int f38971C;
    /* renamed from: D */
    public int f38972D;

    public final int describeContents() {
        return 0;
    }

    public CropInfo(int i, int i2, Rect rect) {
        this.f38972D = i;
        this.f38971C = i2;
        this.f38970B = rect;
    }

    public CropInfo(Parcel parcel) {
        this.f38972D = parcel.readInt();
        this.f38971C = parcel.readInt();
        this.f38970B = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("CropInfo: Original dims : %d x %d\t", new Object[]{Integer.valueOf(this.f38972D), Integer.valueOf(this.f38971C)}));
        stringBuilder.append(this.f38970B.toString());
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f38972D);
        parcel.writeInt(this.f38971C);
        parcel.writeParcelable(this.f38970B, i);
    }
}
