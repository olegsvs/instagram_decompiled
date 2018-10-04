package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l4;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class VideoPlayerStreamEvaluation implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2l4();
    /* renamed from: B */
    public VideoPlayerStreamFormat f33375B;
    /* renamed from: C */
    public int f33376C;
    /* renamed from: D */
    public int f33377D;

    public final int describeContents() {
        return 0;
    }

    public VideoPlayerStreamEvaluation(Parcel parcel) {
        this.f33376C = parcel.readInt();
        this.f33377D = parcel.readInt();
        this.f33375B = (VideoPlayerStreamFormat) parcel.readParcelable(VideoPlayerStreamFormat.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33376C);
        parcel.writeInt(this.f33377D);
        parcel.writeParcelable(this.f33375B, 0);
    }
}
