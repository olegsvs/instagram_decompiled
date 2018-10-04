package com.google.android.exoplayer2.source;

import X.AnonymousClass2wt;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class TrackGroupArray implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2wt();
    /* renamed from: E */
    public static final TrackGroupArray f36144E = new TrackGroupArray(new TrackGroup[0]);
    /* renamed from: B */
    public final int f36145B;
    /* renamed from: C */
    private int f36146C;
    /* renamed from: D */
    private final TrackGroup[] f36147D;

    public final int describeContents() {
        return 0;
    }

    public TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f36145B = readInt;
        this.f36147D = new TrackGroup[readInt];
        for (int i = 0; i < this.f36145B; i++) {
            this.f36147D[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f36147D = trackGroupArr;
        this.f36145B = trackGroupArr.length;
    }

    /* renamed from: A */
    public final TrackGroup m17887A(int i) {
        return this.f36147D[i];
    }

    /* renamed from: B */
    public final int m17888B(TrackGroup trackGroup) {
        for (int i = 0; i < this.f36145B; i++) {
            if (this.f36147D[i] == trackGroup) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
                    if (this.f36145B != trackGroupArray.f36145B || !Arrays.equals(this.f36147D, trackGroupArray.f36147D)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        if (this.f36146C == 0) {
            this.f36146C = Arrays.hashCode(this.f36147D);
        }
        return this.f36146C;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36145B);
        for (int i2 = 0; i2 < this.f36145B; i2++) {
            parcel.writeParcelable(this.f36147D[i2], 0);
        }
    }
}
