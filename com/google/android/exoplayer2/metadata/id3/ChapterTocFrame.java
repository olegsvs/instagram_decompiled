package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass2w8;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ChapterTocFrame extends Id3Frame {
    public static final Creator CREATOR = new AnonymousClass2w8();
    /* renamed from: B */
    public final String[] f49244B;
    /* renamed from: C */
    public final String f49245C;
    /* renamed from: D */
    public final boolean f49246D;
    /* renamed from: E */
    public final boolean f49247E;
    /* renamed from: F */
    private final Id3Frame[] f49248F;

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f49245C = parcel.readString();
        boolean z = true;
        this.f49247E = parcel.readByte() != (byte) 0;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.f49246D = z;
        this.f49244B = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f49248F = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f49248F[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
                    if (this.f49247E != chapterTocFrame.f49247E || this.f49246D != chapterTocFrame.f49246D || !AnonymousClass2yi.m18082C(this.f49245C, chapterTocFrame.f49245C) || !Arrays.equals(this.f49244B, chapterTocFrame.f49244B) || !Arrays.equals(this.f49248F, chapterTocFrame.f49248F)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        int i = (((527 + this.f49247E) * 31) + this.f49246D) * 31;
        String str = this.f49245C;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f49245C);
        parcel.writeByte((byte) this.f49247E);
        parcel.writeByte((byte) this.f49246D);
        parcel.writeStringArray(this.f49244B);
        parcel.writeInt(this.f49248F.length);
        for (Parcelable writeParcelable : this.f49248F) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
