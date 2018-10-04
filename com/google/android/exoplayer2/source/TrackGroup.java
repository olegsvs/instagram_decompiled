package com.google.android.exoplayer2.source;

import X.AnonymousClass2ws;
import X.AnonymousClass2yO;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;

public final class TrackGroup implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2ws();
    /* renamed from: B */
    public final Format[] f36141B;
    /* renamed from: C */
    public final int f36142C;
    /* renamed from: D */
    private int f36143D;

    public final int describeContents() {
        return 0;
    }

    public TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f36142C = readInt;
        this.f36141B = new Format[readInt];
        for (int i = 0; i < this.f36142C; i++) {
            this.f36141B[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    public TrackGroup(Format... formatArr) {
        AnonymousClass2yO.m18017F(formatArr.length > 0);
        this.f36141B = formatArr;
        this.f36142C = formatArr.length;
    }

    /* renamed from: A */
    public final Format m17885A(int i) {
        return this.f36141B[i];
    }

    /* renamed from: B */
    public final int m17886B(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.f36141B;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    TrackGroup trackGroup = (TrackGroup) obj;
                    if (this.f36142C != trackGroup.f36142C || !Arrays.equals(this.f36141B, trackGroup.f36141B)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        if (this.f36143D == 0) {
            this.f36143D = 527 + Arrays.hashCode(this.f36141B);
        }
        return this.f36143D;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36142C);
        for (int i2 = 0; i2 < this.f36142C; i2++) {
            parcel.writeParcelable(this.f36141B[i2], 0);
        }
    }
}
