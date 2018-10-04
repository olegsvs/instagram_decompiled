package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.Metadata.Entry;

public abstract class SpliceCommand implements Entry {
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SCTE-35 splice command: type=");
        stringBuilder.append(getClass().getSimpleName());
        return stringBuilder.toString();
    }
}
