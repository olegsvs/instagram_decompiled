package com.google.android.exoplayer2.metadata.scte35;

import X.AnonymousClass2wJ;
import X.AnonymousClass2wK;
import X.AnonymousClass2wL;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Creator CREATOR = new AnonymousClass2wJ();
    /* renamed from: B */
    public final List f49278B;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        List arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new AnonymousClass2wL(parcel));
        }
        this.f49278B = Collections.unmodifiableList(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f49278B.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass2wL anonymousClass2wL = (AnonymousClass2wL) this.f49278B.get(i2);
            parcel.writeLong(anonymousClass2wL.f36066J);
            parcel.writeByte((byte) anonymousClass2wL.f36065I);
            parcel.writeByte((byte) anonymousClass2wL.f36063G);
            parcel.writeByte((byte) anonymousClass2wL.f36064H);
            int size2 = anonymousClass2wL.f36062F.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                AnonymousClass2wK anonymousClass2wK = (AnonymousClass2wK) anonymousClass2wL.f36062F.get(i3);
                parcel.writeInt(anonymousClass2wK.f36056B);
                parcel.writeLong(anonymousClass2wK.f36057C);
            }
            parcel.writeLong(anonymousClass2wL.f36068L);
            parcel.writeByte((byte) anonymousClass2wL.f36058B);
            parcel.writeLong(anonymousClass2wL.f36061E);
            parcel.writeInt(anonymousClass2wL.f36067K);
            parcel.writeInt(anonymousClass2wL.f36059C);
            parcel.writeInt(anonymousClass2wL.f36060D);
        }
    }
}
