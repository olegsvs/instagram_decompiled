package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass2wC;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class PrivFrame extends Id3Frame {
    public static final Creator CREATOR = new AnonymousClass2wC();
    /* renamed from: B */
    public final String f49256B;
    /* renamed from: C */
    public final byte[] f49257C;

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f49256B = parcel.readString();
        this.f49257C = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    PrivFrame privFrame = (PrivFrame) obj;
                    if (!AnonymousClass2yi.m18082C(this.f49256B, privFrame.f49256B) || !Arrays.equals(this.f49257C, privFrame.f49257C)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        String str = this.f49256B;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f49257C);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f46978B);
        stringBuilder.append(": owner=");
        stringBuilder.append(this.f49256B);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f49256B);
        parcel.writeByteArray(this.f49257C);
    }
}
