package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass2w7;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ChapterFrame extends Id3Frame {
    public static final Creator CREATOR = new AnonymousClass2w7();
    /* renamed from: B */
    public final String f49238B;
    /* renamed from: C */
    public final long f49239C;
    /* renamed from: D */
    public final int f49240D;
    /* renamed from: E */
    public final long f49241E;
    /* renamed from: F */
    public final int f49242F;
    /* renamed from: G */
    private final Id3Frame[] f49243G;

    public final int describeContents() {
        return 0;
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f49238B = parcel.readString();
        this.f49242F = parcel.readInt();
        this.f49240D = parcel.readInt();
        this.f49241E = parcel.readLong();
        this.f49239C = parcel.readLong();
        int readInt = parcel.readInt();
        this.f49243G = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f49243G[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    ChapterFrame chapterFrame = (ChapterFrame) obj;
                    if (this.f49242F != chapterFrame.f49242F || this.f49240D != chapterFrame.f49240D || this.f49241E != chapterFrame.f49241E || this.f49239C != chapterFrame.f49239C || !AnonymousClass2yi.m18082C(this.f49238B, chapterFrame.f49238B) || !Arrays.equals(this.f49243G, chapterFrame.f49243G)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        int i = (((((((527 + this.f49242F) * 31) + this.f49240D) * 31) + ((int) this.f49241E)) * 31) + ((int) this.f49239C)) * 31;
        String str = this.f49238B;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f49238B);
        parcel.writeInt(this.f49242F);
        parcel.writeInt(this.f49240D);
        parcel.writeLong(this.f49241E);
        parcel.writeLong(this.f49239C);
        parcel.writeInt(this.f49243G.length);
        for (Parcelable writeParcelable : this.f49243G) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
