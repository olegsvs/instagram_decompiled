package com.facebook.cameracore.assets.model;

import X.AnonymousClass2h4;
import X.AnonymousClass2h5;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class ARRequestEffect implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2h4();
    /* renamed from: B */
    private final ARRequestAsset f32495B;
    /* renamed from: C */
    private final String f32496C;
    /* renamed from: D */
    private String f32497D;
    /* renamed from: E */
    private final List f32498E;
    /* renamed from: F */
    private final String f32499F;
    /* renamed from: G */
    private AnonymousClass2h5 f32500G;

    public final int describeContents() {
        return 0;
    }

    public ARRequestEffect(Parcel parcel) {
        this.f32495B = (ARRequestAsset) parcel.readParcelable(ARRequestAsset.class.getClassLoader());
        this.f32496C = parcel.readString();
        this.f32498E = parcel.createTypedArrayList(ARRequestAsset.CREATOR);
        this.f32499F = parcel.readString();
        this.f32497D = parcel.readString();
        this.f32500G = AnonymousClass2h5.values()[parcel.readInt()];
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f32495B, i);
        parcel.writeString(this.f32496C);
        parcel.writeTypedList(this.f32498E);
        parcel.writeString(this.f32499F);
        parcel.writeString(this.f32497D);
        parcel.writeInt(this.f32500G.ordinal());
    }
}
