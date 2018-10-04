package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l1;
import X.AnonymousClass43f;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class VideoPlayerMediaChunk implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2l1();
    /* renamed from: B */
    public final int f33355B;
    /* renamed from: C */
    public final long f33356C;
    /* renamed from: D */
    public VideoPlayerStreamFormat f33357D;
    /* renamed from: E */
    public final long f33358E;
    /* renamed from: F */
    public final int f33359F;

    public final int describeContents() {
        return 0;
    }

    public VideoPlayerMediaChunk() {
        this(0, null, -1, -1, -1);
    }

    public VideoPlayerMediaChunk(int i, VideoPlayerStreamFormat videoPlayerStreamFormat, long j, long j2, int i2) {
        this.f33359F = i;
        this.f33357D = videoPlayerStreamFormat;
        this.f33358E = j;
        this.f33356C = j2;
        this.f33355B = i2;
    }

    public VideoPlayerMediaChunk(AnonymousClass43f anonymousClass43f) {
        this(anonymousClass43f.f46191F, new VideoPlayerStreamFormat(anonymousClass43f.f46189D), anonymousClass43f.f49131D, anonymousClass43f.f49130C, anonymousClass43f.f49129B);
    }

    public VideoPlayerMediaChunk(Parcel parcel) {
        this(parcel.readInt(), (VideoPlayerStreamFormat) parcel.readParcelable(VideoPlayerStreamFormat.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readInt());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33359F);
        parcel.writeParcelable(this.f33357D, i);
        parcel.writeLong(this.f33358E);
        parcel.writeLong(this.f33356C);
        parcel.writeInt(this.f33355B);
    }
}
