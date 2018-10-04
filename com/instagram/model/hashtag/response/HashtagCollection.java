package com.instagram.model.hashtag.response;

import X.AnonymousClass0Pn;
import X.AnonymousClass3UZ;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.List;

public class HashtagCollection extends AnonymousClass0Pn implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3UZ();
    /* renamed from: B */
    public List f41635B;

    public final int describeContents() {
        return 0;
    }

    public HashtagCollection(Parcel parcel) {
        if (parcel.readByte() == (byte) 1) {
            List arrayList = new ArrayList();
            this.f41635B = arrayList;
            parcel.readList(arrayList, Hashtag.class.getClassLoader());
            return;
        }
        this.f41635B = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f41635B == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeList(this.f41635B);
    }
}
