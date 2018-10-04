package com.instagram.reels.music.model;

import X.AnonymousClass2Fz;
import X.AnonymousClass2G0;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MusicSearchGenre implements Parcelable, AnonymousClass2G0 {
    public static final Creator CREATOR = new AnonymousClass2Fz();
    /* renamed from: B */
    public String f31416B;
    /* renamed from: C */
    public String f31417C;
    /* renamed from: D */
    public String f31418D;

    public final int describeContents() {
        return 0;
    }

    public final String fM() {
        return this.f31418D;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31417C);
        parcel.writeString(this.f31418D);
        parcel.writeString(this.f31416B);
    }
}
