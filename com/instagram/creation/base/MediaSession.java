package com.instagram.creation.base;

import X.AnonymousClass3CC;
import X.AnonymousClass3CD;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MediaSession implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3CC();
    /* renamed from: B */
    public PhotoSession f38976B;
    /* renamed from: C */
    public AnonymousClass3CD f38977C;
    /* renamed from: D */
    public VideoSession f38978D;

    public final int describeContents() {
        return 0;
    }

    public MediaSession(Parcel parcel) {
        this.f38977C = AnonymousClass3CD.values()[parcel.readInt()];
        this.f38976B = (PhotoSession) parcel.readParcelable(PhotoSession.class.getClassLoader());
        this.f38978D = (VideoSession) parcel.readParcelable(VideoSession.class.getClassLoader());
    }

    public MediaSession(PhotoSession photoSession) {
        this.f38976B = photoSession;
        this.f38977C = AnonymousClass3CD.PHOTO;
    }

    public MediaSession(VideoSession videoSession) {
        this.f38978D = videoSession;
        this.f38977C = AnonymousClass3CD.VIDEO;
    }

    /* renamed from: A */
    public final String m18990A() {
        if (this.f38977C == AnonymousClass3CD.PHOTO) {
            return this.f38976B.f38986I;
        }
        return this.f38978D.f39002P;
    }

    /* renamed from: B */
    public final String m18991B() {
        if (this.f38977C == AnonymousClass3CD.PHOTO) {
            return this.f38976B.f38985H;
        }
        return this.f38978D.f39000N;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f38977C.ordinal());
        parcel.writeParcelable(this.f38976B, i);
        parcel.writeParcelable(this.f38978D, i);
    }
}
