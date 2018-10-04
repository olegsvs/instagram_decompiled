package com.google.android.exoplayer2.metadata;

import X.AnonymousClass2w2;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2w2();
    /* renamed from: B */
    public final Entry[] f36050B;

    public interface Entry extends Parcelable {
    }

    public final int describeContents() {
        return 0;
    }

    public Metadata(Parcel parcel) {
        this.f36050B = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f36050B;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public Metadata(List list) {
        if (list != null) {
            Entry[] entryArr = new Entry[list.size()];
            this.f36050B = entryArr;
            list.toArray(entryArr);
            return;
        }
        this.f36050B = new Entry[0];
    }

    public Metadata(Entry... entryArr) {
        if (entryArr == null) {
            entryArr = new Entry[0];
        }
        this.f36050B = entryArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return Arrays.equals(this.f36050B, ((Metadata) obj).f36050B);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36050B);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36050B.length);
        for (Parcelable writeParcelable : this.f36050B) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
