package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass2wA;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame {
    public static final Creator CREATOR = new AnonymousClass2wA();
    /* renamed from: B */
    public final byte[] f49252B;
    /* renamed from: C */
    public final String f49253C;
    /* renamed from: D */
    public final String f49254D;
    /* renamed from: E */
    public final String f49255E;

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f49255E = parcel.readString();
        this.f49254D = parcel.readString();
        this.f49253C = parcel.readString();
        this.f49252B = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    GeobFrame geobFrame = (GeobFrame) obj;
                    if (!AnonymousClass2yi.m18082C(this.f49255E, geobFrame.f49255E) || !AnonymousClass2yi.m18082C(this.f49254D, geobFrame.f49254D) || !AnonymousClass2yi.m18082C(this.f49253C, geobFrame.f49253C) || !Arrays.equals(this.f49252B, geobFrame.f49252B)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        String str = this.f49255E;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f49254D;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f49253C;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.f49252B);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f46978B);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.f49255E);
        stringBuilder.append(", filename=");
        stringBuilder.append(this.f49254D);
        stringBuilder.append(", description=");
        stringBuilder.append(this.f49253C);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f49255E);
        parcel.writeString(this.f49254D);
        parcel.writeString(this.f49253C);
        parcel.writeByteArray(this.f49252B);
    }
}
