package com.google.android.exoplayer2.metadata.scte35;

import X.AnonymousClass2wF;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class PrivateCommand extends SpliceCommand {
    public static final Creator CREATOR = new AnonymousClass2wF();
    /* renamed from: B */
    public final byte[] f49262B;
    /* renamed from: C */
    public final long f49263C;
    /* renamed from: D */
    public final long f49264D;

    public PrivateCommand(Parcel parcel) {
        this.f49264D = parcel.readLong();
        this.f49263C = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f49262B = bArr;
        parcel.readByteArray(bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f49264D);
        parcel.writeLong(this.f49263C);
        parcel.writeInt(this.f49262B.length);
        parcel.writeByteArray(this.f49262B);
    }
}
