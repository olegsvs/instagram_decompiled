package com.instagram.explore.model;

import X.AnonymousClass0P7;
import X.AnonymousClass1MN;
import X.AnonymousClass1e1;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class ExploreTopicCluster implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1e1();
    /* renamed from: B */
    public boolean f17576B;
    /* renamed from: C */
    public AnonymousClass0P7 f17577C;
    /* renamed from: D */
    public String f17578D;
    /* renamed from: E */
    public String f17579E;
    /* renamed from: F */
    public List f17580F;
    /* renamed from: G */
    public String f17581G;
    /* renamed from: H */
    public boolean f17582H;
    /* renamed from: I */
    public List f17583I;
    /* renamed from: J */
    public int f17584J;
    /* renamed from: K */
    public String f17585K;
    /* renamed from: L */
    public int f17586L;
    /* renamed from: M */
    public String f17587M;
    /* renamed from: N */
    public AnonymousClass1MN f17588N;

    public final int describeContents() {
        return 0;
    }

    public ExploreTopicCluster(Parcel parcel) {
        this.f17581G = parcel.readString();
        this.f17587M = parcel.readString();
        this.f17585K = parcel.readString();
        this.f17580F = parcel.createStringArrayList();
        this.f17583I = parcel.createStringArrayList();
        this.f17579E = parcel.readString();
        this.f17578D = parcel.readString();
        this.f17588N = (AnonymousClass1MN) parcel.readSerializable();
        this.f17586L = parcel.readInt();
        boolean z = false;
        this.f17576B = parcel.readByte() == (byte) 1;
        if (parcel.readByte() == (byte) 1) {
            z = true;
        }
        this.f17582H = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17581G);
        parcel.writeString(this.f17587M);
        parcel.writeString(this.f17585K);
        parcel.writeStringList(this.f17580F);
        parcel.writeStringList(this.f17583I);
        parcel.writeString(this.f17579E);
        parcel.writeString(this.f17578D);
        parcel.writeSerializable(this.f17588N);
        parcel.writeInt(this.f17586L);
        parcel.writeByte((byte) this.f17576B);
        parcel.writeByte((byte) this.f17582H);
    }
}
