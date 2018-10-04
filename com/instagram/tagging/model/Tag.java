package com.instagram.tagging.model;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class Tag implements Parcelable {
    /* renamed from: B */
    public PointF f15363B;

    /* renamed from: B */
    public abstract String mo2198B();

    /* renamed from: C */
    public abstract TaggableModel mo2199C();

    /* renamed from: D */
    public abstract void mo2200D(TaggableModel taggableModel);

    public final int describeContents() {
        return 0;
    }

    public Tag(Parcel parcel, ClassLoader classLoader) {
        mo2200D((TaggableModel) parcel.readParcelable(classLoader));
        PointF pointF = new PointF();
        this.f15363B = pointF;
        pointF.x = parcel.readFloat();
        this.f15363B.y = parcel.readFloat();
    }

    /* renamed from: A */
    public final String m9781A() {
        return mo2199C().getId();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Tag) {
            return ((Tag) obj).m9781A().equals(m9781A());
        }
        return false;
    }

    public int hashCode() {
        return (m9781A().hashCode() * 31) + getClass().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo2199C(), i);
        parcel.writeFloat(this.f15363B.x);
        parcel.writeFloat(this.f15363B.y);
    }
}
