package com.instagram.model.direct;

import X.AnonymousClass1FM;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DirectShareTarget implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1FM();
    /* renamed from: B */
    public String f5601B;
    /* renamed from: C */
    public boolean f5602C;
    /* renamed from: D */
    public List f5603D;
    /* renamed from: E */
    public DirectThreadKey f5604E;

    public final int describeContents() {
        return 0;
    }

    public DirectShareTarget(Parcel parcel) {
        this.f5603D = parcel.createTypedArrayList(PendingRecipient.CREATOR);
        this.f5601B = parcel.readString();
        this.f5604E = (DirectThreadKey) parcel.readParcelable(DirectThreadKey.class.getClassLoader());
        this.f5602C = parcel.readByte() != (byte) 0;
    }

    public DirectShareTarget(List list, DirectThreadKey directThreadKey, String str, boolean z) {
        this.f5603D = list;
        this.f5601B = str;
        this.f5602C = z;
        this.f5604E = directThreadKey;
        m4807E();
    }

    /* renamed from: A */
    public final List m4803A() {
        List arrayList = new ArrayList();
        for (PendingRecipient id : this.f5603D) {
            arrayList.add(id.getId());
        }
        return arrayList;
    }

    /* renamed from: B */
    public final List m4804B() {
        return Collections.unmodifiableList(this.f5603D);
    }

    /* renamed from: C */
    public final String m4805C() {
        return this.f5604E.f5871C;
    }

    /* renamed from: D */
    public final boolean m4806D() {
        return this.f5603D.size() > 1;
    }

    /* renamed from: E */
    public final DirectShareTarget m4807E() {
        if (this.f5604E == null) {
            this.f5604E = new DirectThreadKey(null, this.f5603D);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    DirectShareTarget directShareTarget = (DirectShareTarget) obj;
                    String str = directShareTarget.f5604E.f5871C;
                    String str2 = this.f5604E.f5871C;
                    if (str2 != null && str != null) {
                        return str2.equals(str);
                    }
                    if (directShareTarget.f5602C != this.f5602C || !this.f5603D.containsAll(directShareTarget.f5603D) || !directShareTarget.f5603D.containsAll(this.f5603D)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = this.f5602C + 0;
        for (PendingRecipient hashCode : this.f5603D) {
            i ^= hashCode.hashCode();
        }
        return (i2 * 31) + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f5603D);
        parcel.writeString(this.f5601B);
        parcel.writeParcelable(this.f5604E, i);
        parcel.writeByte(this.f5602C);
    }
}
