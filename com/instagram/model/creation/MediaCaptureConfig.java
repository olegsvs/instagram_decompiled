package com.instagram.model.creation;

import X.AnonymousClass1Ku;
import X.AnonymousClass1Kx;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MediaCaptureConfig implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1Ku();
    /* renamed from: B */
    public final boolean f17258B;
    /* renamed from: C */
    public final boolean f17259C;
    /* renamed from: D */
    public boolean f17260D;
    /* renamed from: E */
    public boolean f17261E;
    /* renamed from: F */
    public boolean f17262F;
    /* renamed from: G */
    public final boolean f17263G;

    public final int describeContents() {
        return 0;
    }

    public MediaCaptureConfig(AnonymousClass1Kx anonymousClass1Kx) {
        this.f17263G = anonymousClass1Kx.f17270G;
        this.f17259C = anonymousClass1Kx.f17266C;
        this.f17262F = anonymousClass1Kx.f17269F;
        this.f17258B = anonymousClass1Kx.f17265B;
        this.f17260D = anonymousClass1Kx.f17267D;
        this.f17261E = anonymousClass1Kx.f17268E;
    }

    public MediaCaptureConfig(Parcel parcel) {
        boolean z = true;
        this.f17263G = parcel.readByte() != (byte) 0;
        this.f17259C = parcel.readByte() != (byte) 0;
        this.f17262F = parcel.readByte() != (byte) 0;
        this.f17258B = parcel.readByte() != (byte) 0;
        this.f17260D = parcel.readByte() != (byte) 0;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.f17261E = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) this.f17263G);
        parcel.writeByte((byte) this.f17259C);
        parcel.writeByte((byte) this.f17262F);
        parcel.writeByte((byte) this.f17258B);
        parcel.writeByte((byte) this.f17260D);
        parcel.writeByte((byte) this.f17261E);
    }
}
