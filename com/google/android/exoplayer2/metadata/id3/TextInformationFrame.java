package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass2wD;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class TextInformationFrame extends Id3Frame {
    public static final Creator CREATOR = new AnonymousClass2wD();
    /* renamed from: B */
    public final String f49258B;
    /* renamed from: C */
    public final String f49259C;

    public TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.f49258B = parcel.readString();
        this.f49259C = parcel.readString();
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f49258B = str2;
        this.f49259C = str3;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
                    if (!this.f46978B.equals(textInformationFrame.f46978B) || !AnonymousClass2yi.m18082C(this.f49258B, textInformationFrame.f49258B) || !AnonymousClass2yi.m18082C(this.f49259C, textInformationFrame.f49259C)) {
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
        String str = this.f49258B;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f49259C;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f46978B);
        stringBuilder.append(": value=");
        stringBuilder.append(this.f49259C);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46978B);
        parcel.writeString(this.f49258B);
        parcel.writeString(this.f49259C);
    }
}
