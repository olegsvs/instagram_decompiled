package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass2yO;
import com.google.android.exoplayer2.metadata.Metadata.Entry;

public abstract class Id3Frame implements Entry {
    /* renamed from: B */
    public final String f46978B;

    public int describeContents() {
        return 0;
    }

    public Id3Frame(String str) {
        this.f46978B = (String) AnonymousClass2yO.m18016E(str);
    }

    public String toString() {
        return this.f46978B;
    }
}
