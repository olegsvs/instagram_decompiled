package com.instagram.avatar;

import X.AnonymousClass32L;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class AddAvatarHelper$LoadedImage$LoadedImageMetadata implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass32L();
    /* renamed from: B */
    public final int f37220B;
    /* renamed from: C */
    public final Uri f37221C;

    public final int describeContents() {
        return 0;
    }

    public AddAvatarHelper$LoadedImage$LoadedImageMetadata(int i, Uri uri) {
        this.f37220B = i;
        this.f37221C = uri;
    }

    public AddAvatarHelper$LoadedImage$LoadedImageMetadata(Parcel parcel) {
        this.f37220B = parcel.readInt();
        this.f37221C = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f37220B);
        parcel.writeParcelable(this.f37221C, 0);
    }
}
