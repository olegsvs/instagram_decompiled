package com.google.android.exoplayer2.metadata.scte35;

import X.AnonymousClass2wG;
import X.AnonymousClass2wH;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Creator CREATOR = new AnonymousClass2wG();
    /* renamed from: B */
    public final boolean f49265B;
    /* renamed from: C */
    public final int f49266C;
    /* renamed from: D */
    public final int f49267D;
    /* renamed from: E */
    public final long f49268E;
    /* renamed from: F */
    public final List f49269F;
    /* renamed from: G */
    public final boolean f49270G;
    /* renamed from: H */
    public final boolean f49271H;
    /* renamed from: I */
    public final long f49272I;
    /* renamed from: J */
    public final long f49273J;
    /* renamed from: K */
    public final boolean f49274K;
    /* renamed from: L */
    public final long f49275L;
    /* renamed from: M */
    public final boolean f49276M;
    /* renamed from: N */
    public final int f49277N;

    public SpliceInsertCommand(Parcel parcel) {
        this.f49275L = parcel.readLong();
        boolean z = false;
        this.f49274K = parcel.readByte() == (byte) 1;
        this.f49270G = parcel.readByte() == (byte) 1;
        this.f49271H = parcel.readByte() == (byte) 1;
        this.f49276M = parcel.readByte() == (byte) 1;
        this.f49273J = parcel.readLong();
        this.f49272I = parcel.readLong();
        int readInt = parcel.readInt();
        List arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new AnonymousClass2wH(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f49269F = Collections.unmodifiableList(arrayList);
        if (parcel.readByte() == (byte) 1) {
            z = true;
        }
        this.f49265B = z;
        this.f49268E = parcel.readLong();
        this.f49277N = parcel.readInt();
        this.f49266C = parcel.readInt();
        this.f49267D = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f49275L);
        parcel.writeByte((byte) this.f49274K);
        parcel.writeByte((byte) this.f49270G);
        parcel.writeByte((byte) this.f49271H);
        parcel.writeByte((byte) this.f49276M);
        parcel.writeLong(this.f49273J);
        parcel.writeLong(this.f49272I);
        int size = this.f49269F.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass2wH anonymousClass2wH = (AnonymousClass2wH) this.f49269F.get(i2);
            parcel.writeInt(anonymousClass2wH.f36055D);
            parcel.writeLong(anonymousClass2wH.f36054C);
            parcel.writeLong(anonymousClass2wH.f36053B);
        }
        parcel.writeByte((byte) this.f49265B);
        parcel.writeLong(this.f49268E);
        parcel.writeInt(this.f49277N);
        parcel.writeInt(this.f49266C);
        parcel.writeInt(this.f49267D);
    }
}
