package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l6;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VideoPlayerStreamMetadata implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2l6();
    /* renamed from: B */
    private String f33378B;
    /* renamed from: C */
    private int f33379C;
    /* renamed from: D */
    private VideoPlayerStreamFormat f33380D;
    /* renamed from: E */
    private int f33381E;

    public final int describeContents() {
        return 0;
    }

    public VideoPlayerStreamMetadata(int i, int i2, VideoPlayerStreamFormat videoPlayerStreamFormat, String str) {
        this.f33381E = i;
        this.f33379C = i2;
        this.f33380D = videoPlayerStreamFormat;
        this.f33378B = str;
    }

    public VideoPlayerStreamMetadata(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), (VideoPlayerStreamFormat) parcel.readParcelable(VideoPlayerStreamFormat.class.getClassLoader()), parcel.readString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33381E);
        parcel.writeInt(this.f33379C);
        parcel.writeParcelable(this.f33380D, 0);
        parcel.writeString(this.f33378B);
    }
}
