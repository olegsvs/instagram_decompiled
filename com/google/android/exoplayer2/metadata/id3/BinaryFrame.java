package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass2w6;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Creator CREATOR = new AnonymousClass2w6();
    /* renamed from: B */
    public final byte[] f49237B;

    public BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.f49237B = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    BinaryFrame binaryFrame = (BinaryFrame) obj;
                    if (!this.f46978B.equals(binaryFrame.f46978B) || !Arrays.equals(this.f49237B, binaryFrame.f49237B)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        return ((527 + this.f46978B.hashCode()) * 31) + Arrays.hashCode(this.f49237B);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46978B);
        parcel.writeByteArray(this.f49237B);
    }
}
