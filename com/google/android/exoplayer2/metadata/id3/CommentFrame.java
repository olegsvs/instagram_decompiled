package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass2w9;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class CommentFrame extends Id3Frame {
    public static final Creator CREATOR = new AnonymousClass2w9();
    /* renamed from: B */
    public final String f49249B;
    /* renamed from: C */
    public final String f49250C;
    /* renamed from: D */
    public final String f49251D;

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.f49250C = parcel.readString();
        this.f49249B = parcel.readString();
        this.f49251D = parcel.readString();
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f49250C = str;
        this.f49249B = str2;
        this.f49251D = str3;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    CommentFrame commentFrame = (CommentFrame) obj;
                    if (!AnonymousClass2yi.m18082C(this.f49249B, commentFrame.f49249B) || !AnonymousClass2yi.m18082C(this.f49250C, commentFrame.f49250C) || !AnonymousClass2yi.m18082C(this.f49251D, commentFrame.f49251D)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        String str = this.f49250C;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f49249B;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f49251D;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f46978B);
        stringBuilder.append(": language=");
        stringBuilder.append(this.f49250C);
        stringBuilder.append(", description=");
        stringBuilder.append(this.f49249B);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46978B);
        parcel.writeString(this.f49250C);
        parcel.writeString(this.f49251D);
    }
}
