package com.google.android.exoplayer2.metadata.scte35;

import X.AnonymousClass2wM;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Creator CREATOR = new AnonymousClass2wM();
    /* renamed from: B */
    public final long f49279B;
    /* renamed from: C */
    public final long f49280C;

    public TimeSignalCommand(long j, long j2) {
        this.f49280C = j;
        this.f49279B = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f49280C);
        parcel.writeLong(this.f49279B);
    }
}
