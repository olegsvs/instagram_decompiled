package com.google.android.exoplayer2.trackselection;

import X.AnonymousClass2y1;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class DefaultTrackSelector$SelectionOverride implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2y1();
    /* renamed from: B */
    public final int f36468B;
    /* renamed from: C */
    public final int f36469C;
    /* renamed from: D */
    public final int[] f36470D;

    public final int describeContents() {
        return 0;
    }

    public DefaultTrackSelector$SelectionOverride(Parcel parcel) {
        this.f36468B = parcel.readInt();
        byte readByte = parcel.readByte();
        this.f36469C = readByte;
        int[] iArr = new int[readByte];
        this.f36470D = iArr;
        parcel.readIntArray(iArr);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverride = (DefaultTrackSelector$SelectionOverride) obj;
                    if (this.f36468B != defaultTrackSelector$SelectionOverride.f36468B || !Arrays.equals(this.f36470D, defaultTrackSelector$SelectionOverride.f36470D)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        return (this.f36468B * 31) + Arrays.hashCode(this.f36470D);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36468B);
        parcel.writeInt(this.f36470D.length);
        parcel.writeIntArray(this.f36470D);
    }
}
