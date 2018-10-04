package com.instagram.pendingmedia.model;

import X.AnonymousClass0Ci;
import X.AnonymousClass0LQ;
import X.AnonymousClass2Ep;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BrandedContentTag implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2Ep();
    /* renamed from: B */
    public String f27934B;
    /* renamed from: C */
    public String f27935C;
    /* renamed from: D */
    public String f27936D;

    public final int describeContents() {
        return 0;
    }

    public BrandedContentTag(AnonymousClass0Ci anonymousClass0Ci) {
        this.f27935C = anonymousClass0Ci.getId();
        this.f27936D = anonymousClass0Ci.uT();
    }

    public BrandedContentTag(AnonymousClass0Ci anonymousClass0Ci, boolean z) {
        this.f27935C = anonymousClass0Ci.getId();
        this.f27936D = anonymousClass0Ci.uT();
        this.f27934B = z ? "true" : "false";
    }

    public BrandedContentTag(Parcel parcel) {
        this.f27935C = parcel.readString();
        this.f27936D = parcel.readString();
        this.f27934B = parcel.readString();
    }

    public BrandedContentTag(BrandedContentTag brandedContentTag) {
        this.f27935C = brandedContentTag.f27935C;
        this.f27936D = brandedContentTag.f27936D;
        this.f27934B = brandedContentTag.f27934B;
    }

    /* renamed from: A */
    public final void m14797A(boolean z) {
        this.f27934B = z ? "true" : "false";
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof BrandedContentTag)) {
                return false;
            }
            BrandedContentTag brandedContentTag = (BrandedContentTag) obj;
            if (!this.f27935C.equals(brandedContentTag.f27935C) || !this.f27936D.equals(brandedContentTag.f27936D) || this.f27934B != brandedContentTag.f27934B) {
                z = false;
            }
        }
        return z;
    }

    public final int hashCode() {
        return AnonymousClass0LQ.D(new Object[]{this.f27935C, this.f27936D, this.f27934B});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27935C);
        parcel.writeString(this.f27936D);
        parcel.writeString(this.f27934B);
    }
}
