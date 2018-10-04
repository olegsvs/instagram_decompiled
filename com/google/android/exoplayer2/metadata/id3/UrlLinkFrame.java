package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass2wE;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class UrlLinkFrame extends Id3Frame {
    public static final Creator CREATOR = new AnonymousClass2wE();
    /* renamed from: B */
    public final String f49260B;
    /* renamed from: C */
    public final String f49261C;

    public UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.f49260B = parcel.readString();
        this.f49261C = parcel.readString();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
                    if (!this.f46978B.equals(urlLinkFrame.f46978B) || !AnonymousClass2yi.m18082C(this.f49260B, urlLinkFrame.f49260B) || !AnonymousClass2yi.m18082C(this.f49261C, urlLinkFrame.f49261C)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        int hashCode = (527 + this.f46978B.hashCode()) * 31;
        String str = this.f49260B;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f49261C;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f46978B);
        stringBuilder.append(": url=");
        stringBuilder.append(this.f49261C);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46978B);
        parcel.writeString(this.f49260B);
        parcel.writeString(this.f49261C);
    }
}
