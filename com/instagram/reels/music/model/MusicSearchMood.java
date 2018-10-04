package com.instagram.reels.music.model;

import X.AnonymousClass2G0;
import X.AnonymousClass2G3;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MusicSearchMood implements Parcelable, AnonymousClass2G0 {
    public static final Creator CREATOR = new AnonymousClass2G3();
    /* renamed from: B */
    public String f31419B;
    /* renamed from: C */
    public String f31420C;
    /* renamed from: D */
    public String f31421D;

    public final int describeContents() {
        return 0;
    }

    public MusicSearchMood(Parcel parcel) {
        this.f31420C = parcel.readString();
        this.f31421D = parcel.readString();
        this.f31419B = parcel.readString();
    }

    public final String fM() {
        return this.f31421D;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31420C);
        parcel.writeString(this.f31421D);
        parcel.writeString(this.f31419B);
    }
}
