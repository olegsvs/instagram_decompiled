package com.instagram.video.videocall.intf;

import X.AnonymousClass0Qr;
import X.AnonymousClass0RX;
import X.AnonymousClass1RO;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VideoCallSource implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1RO();
    /* renamed from: B */
    public final AnonymousClass0Qr f4474B;
    /* renamed from: C */
    public final AnonymousClass0RX f4475C;
    /* renamed from: D */
    public final String f4476D;

    public final int describeContents() {
        return 0;
    }

    public VideoCallSource(AnonymousClass0Qr anonymousClass0Qr, AnonymousClass0RX anonymousClass0RX, String str) {
        this.f4474B = anonymousClass0Qr;
        this.f4475C = anonymousClass0RX;
        this.f4476D = str;
    }

    public VideoCallSource(Parcel parcel) {
        this.f4474B = AnonymousClass0Qr.m4061B(parcel.readString());
        this.f4475C = AnonymousClass0RX.m4201B(parcel.readString());
        this.f4476D = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4474B.m4062A());
        parcel.writeString(this.f4475C.m4202A());
        parcel.writeString(this.f4476D);
    }
}
