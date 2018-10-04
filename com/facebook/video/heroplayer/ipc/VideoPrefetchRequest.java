package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass17R;
import X.AnonymousClass17S;
import X.AnonymousClass17W;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class VideoPrefetchRequest implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass17S();
    /* renamed from: B */
    public int f14713B;
    /* renamed from: C */
    public int f14714C;
    /* renamed from: D */
    public String f14715D;
    /* renamed from: E */
    public boolean f14716E;
    /* renamed from: F */
    public boolean f14717F;
    /* renamed from: G */
    public int f14718G;
    /* renamed from: H */
    public AnonymousClass17W f14719H;
    /* renamed from: I */
    public String f14720I;
    /* renamed from: J */
    public String f14721J;
    /* renamed from: K */
    public AnonymousClass17R f14722K;
    /* renamed from: L */
    public int f14723L;
    /* renamed from: M */
    public int f14724M;
    /* renamed from: N */
    public VideoSource f14725N;

    public final int describeContents() {
        return 0;
    }

    public VideoPrefetchRequest(Parcel parcel) {
        this.f14725N = (VideoSource) VideoSource.CREATOR.createFromParcel(parcel);
        this.f14715D = parcel.readString();
        this.f14718G = parcel.readInt();
        this.f14723L = parcel.readInt();
        this.f14713B = parcel.readInt();
        this.f14714C = parcel.readInt();
        this.f14721J = parcel.readString();
        this.f14724M = parcel.readInt();
        boolean z = false;
        this.f14716E = parcel.readInt() == 1;
        this.f14720I = parcel.readString();
        this.f14722K = AnonymousClass17R.valueOf(parcel.readString());
        this.f14719H = AnonymousClass17W.valueOf(parcel.readString());
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f14717F = z;
    }

    public VideoPrefetchRequest(VideoSource videoSource, String str, int i, int i2, int i3, int i4, String str2, int i5, boolean z, String str3, AnonymousClass17R anonymousClass17R, AnonymousClass17W anonymousClass17W, boolean z2) {
        this.f14725N = videoSource;
        this.f14715D = str;
        this.f14718G = i;
        this.f14723L = i2;
        this.f14713B = i3;
        this.f14714C = i4;
        this.f14721J = str2;
        this.f14724M = i5;
        this.f14716E = z;
        this.f14720I = str3;
        this.f14722K = anonymousClass17R;
        this.f14719H = anonymousClass17W;
        this.f14717F = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f14725N.writeToParcel(parcel, i);
        parcel.writeString(this.f14715D);
        parcel.writeInt(this.f14718G);
        parcel.writeInt(this.f14723L);
        parcel.writeInt(this.f14713B);
        parcel.writeInt(this.f14714C);
        parcel.writeString(this.f14721J);
        parcel.writeInt(this.f14724M);
        parcel.writeInt(this.f14716E);
        parcel.writeString(this.f14720I);
        parcel.writeString(this.f14722K.name());
        parcel.writeString(this.f14719H.name());
        parcel.writeInt(this.f14717F);
    }
}
