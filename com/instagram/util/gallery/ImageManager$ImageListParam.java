package com.instagram.util.gallery;

import X.AnonymousClass2My;
import X.AnonymousClass2Mz;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ImageManager$ImageListParam implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2Mz();
    /* renamed from: B */
    public String f29603B;
    /* renamed from: C */
    public int f29604C;
    /* renamed from: D */
    public boolean f29605D;
    /* renamed from: E */
    public AnonymousClass2My f29606E;
    /* renamed from: F */
    public Uri f29607F;
    /* renamed from: G */
    public int f29608G;

    public final int describeContents() {
        return 0;
    }

    public ImageManager$ImageListParam(Parcel parcel) {
        this.f29606E = AnonymousClass2My.values()[parcel.readInt()];
        this.f29604C = parcel.readInt();
        this.f29608G = parcel.readInt();
        this.f29603B = parcel.readString();
        this.f29607F = (Uri) parcel.readParcelable(null);
        this.f29605D = parcel.readInt() != 0;
    }

    public final String toString() {
        return String.format("ImageListParam{loc=%s,inc=%d,sort=%d,bucket=%s,empty=%b,single=%s}", new Object[]{this.f29606E, Integer.valueOf(this.f29604C), Integer.valueOf(this.f29608G), this.f29603B, Boolean.valueOf(this.f29605D), this.f29607F});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29606E.ordinal());
        parcel.writeInt(this.f29604C);
        parcel.writeInt(this.f29608G);
        parcel.writeString(this.f29603B);
        parcel.writeParcelable(this.f29607F, i);
        parcel.writeInt(this.f29605D);
    }
}
