package com.instagram.creation.photo.util;

import X.AnonymousClass3HU;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map.Entry;

public class ExifImageData implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3HU();
    /* renamed from: B */
    public Double f39811B;
    /* renamed from: C */
    public Double f39812C;
    /* renamed from: D */
    public int f39813D;
    /* renamed from: E */
    public HashMap f39814E = new HashMap();

    public final int describeContents() {
        return 0;
    }

    public ExifImageData(Parcel parcel) {
        Double d;
        double readDouble = parcel.readDouble();
        Double d2 = null;
        if (readDouble > 180.0d) {
            d = null;
        } else {
            d = Double.valueOf(readDouble);
        }
        this.f39811B = d;
        readDouble = parcel.readDouble();
        if (readDouble <= 180.0d) {
            d2 = Double.valueOf(readDouble);
        }
        this.f39812C = d2;
        this.f39813D = parcel.readInt();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f39814E.put(parcel.readString(), parcel.readString());
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Double d = this.f39811B;
        double d2 = 200.0d;
        parcel.writeDouble(d == null ? 200.0d : d.doubleValue());
        d = this.f39812C;
        if (d != null) {
            d2 = d.doubleValue();
        }
        parcel.writeDouble(d2);
        parcel.writeInt(this.f39813D);
        parcel.writeInt(this.f39814E.size());
        for (Entry entry : this.f39814E.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
