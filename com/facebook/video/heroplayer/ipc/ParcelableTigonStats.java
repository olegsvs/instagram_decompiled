package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass1xg;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ParcelableTigonStats implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1xg();
    /* renamed from: B */
    private byte[] f24700B;
    /* renamed from: C */
    private int f24701C;
    /* renamed from: D */
    private boolean f24702D;
    /* renamed from: E */
    private int f24703E;
    /* renamed from: F */
    private String f24704F;
    /* renamed from: G */
    private int f24705G;
    /* renamed from: H */
    private int f24706H;
    /* renamed from: I */
    private String f24707I;

    public final int describeContents() {
        return 0;
    }

    public ParcelableTigonStats(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        this.f24700B = createByteArray;
        this.f24701C = createByteArray.length;
        this.f24706H = parcel.readInt();
        this.f24705G = parcel.readInt();
        this.f24704F = parcel.readString();
        this.f24707I = parcel.readString();
        this.f24703E = parcel.readInt();
        this.f24702D = parcel.readInt() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.f24700B;
        if (bArr != null) {
            parcel.writeByteArray(bArr, 0, this.f24701C);
            parcel.writeInt(this.f24706H);
            parcel.writeInt(this.f24705G);
            parcel.writeString(this.f24704F);
            parcel.writeString(this.f24707I);
            parcel.writeInt(this.f24703E);
            parcel.writeInt(this.f24702D);
        }
    }
}
