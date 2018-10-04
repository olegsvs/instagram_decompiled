package com.facebook.exoplayer.ipc;

import X.AnonymousClass2ky;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;

public final class ExoServiceVideoCacheAnalytics implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2ky();
    /* renamed from: B */
    private Map[] f33347B;
    /* renamed from: C */
    private int f33348C;

    public final int describeContents() {
        return 0;
    }

    public ExoServiceVideoCacheAnalytics(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f33348C = readInt;
        this.f33347B = new HashMap[readInt];
        for (int i = 0; i < this.f33348C; i++) {
            int readInt2 = parcel.readInt();
            Map hashMap = new HashMap(readInt2);
            for (int i2 = 0; i2 < readInt2; i2++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
            this.f33347B[i] = hashMap;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33348C);
        if (this.f33347B != null) {
            for (int i2 = 0; i2 < this.f33348C; i2++) {
                Map map = this.f33347B[i2];
                if (map != null) {
                    parcel.writeInt(map.size());
                    for (String str : map.keySet()) {
                        parcel.writeString(str);
                        parcel.writeString((String) map.get(str));
                    }
                } else {
                    parcel.writeInt(0);
                }
            }
        }
    }
}
