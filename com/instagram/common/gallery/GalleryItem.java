package com.instagram.common.gallery;

import X.AnonymousClass24p;
import X.AnonymousClass24q;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GalleryItem implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass24p();
    /* renamed from: B */
    public final Draft f25664B;
    /* renamed from: C */
    public final Medium f25665C;
    /* renamed from: D */
    public final AnonymousClass24q f25666D;

    public final int describeContents() {
        return 0;
    }

    public GalleryItem(Parcel parcel) {
        this.f25665C = (Medium) parcel.readParcelable(Medium.class.getClassLoader());
        this.f25664B = (Draft) parcel.readParcelable(Draft.class.getClassLoader());
        this.f25666D = AnonymousClass24q.valueOf(parcel.readString());
    }

    public GalleryItem(Draft draft) {
        this.f25664B = draft;
        this.f25665C = null;
        this.f25666D = AnonymousClass24q.DRAFT;
    }

    public GalleryItem(Medium medium) {
        this.f25665C = medium;
        this.f25664B = null;
        this.f25666D = AnonymousClass24q.MEDIUM;
    }

    /* renamed from: A */
    public final String m14350A() {
        return m14353D() ? this.f25665C.SN() : this.f25664B.SN();
    }

    /* renamed from: B */
    public final boolean m14351B() {
        return m14353D() ? this.f25665C.eW() : this.f25664B.eW();
    }

    /* renamed from: C */
    public final boolean m14352C() {
        return this.f25666D == AnonymousClass24q.DRAFT;
    }

    /* renamed from: D */
    public final boolean m14353D() {
        return this.f25666D == AnonymousClass24q.MEDIUM;
    }

    /* renamed from: E */
    public final boolean m14354E() {
        return m14353D() ? this.f25665C.wY() : this.f25664B.wY();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = false;
        if (obj instanceof GalleryItem) {
            GalleryItem galleryItem = (GalleryItem) obj;
            if (galleryItem.m14353D() && m14353D()) {
                z = this.f25665C.equals(galleryItem.f25665C);
            } else if (galleryItem.m14352C() && m14352C()) {
                z = this.f25664B.equals(galleryItem.f25664B);
            }
        }
        return z;
    }

    public final int hashCode() {
        return m14350A().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f25665C, i);
        parcel.writeParcelable(this.f25664B, i);
        parcel.writeString(this.f25666D.name());
    }
}
