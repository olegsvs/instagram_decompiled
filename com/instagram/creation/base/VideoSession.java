package com.instagram.creation.base;

import X.AnonymousClass0OA;
import X.AnonymousClass3CE;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VideoSession implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3CE();
    /* renamed from: B */
    public float f38988B = 1.0f;
    /* renamed from: C */
    public int f38989C;
    /* renamed from: D */
    public int f38990D;
    /* renamed from: E */
    public int f38991E;
    /* renamed from: F */
    public boolean f38992F;
    /* renamed from: G */
    public boolean f38993G;
    /* renamed from: H */
    public Location f38994H;
    /* renamed from: I */
    public int f38995I;
    /* renamed from: J */
    public int f38996J;
    /* renamed from: K */
    public int f38997K;
    /* renamed from: L */
    public boolean f38998L;
    /* renamed from: M */
    public int f38999M;
    /* renamed from: N */
    public String f39000N;
    /* renamed from: O */
    public boolean f39001O;
    /* renamed from: P */
    public String f39002P;
    /* renamed from: Q */
    public int f39003Q;

    public final int describeContents() {
        return 0;
    }

    public VideoSession(Parcel parcel) {
        this.f39000N = parcel.readString();
        boolean z = false;
        this.f38992F = parcel.readByte() == (byte) 1;
        this.f39001O = parcel.readByte() == (byte) 1;
        this.f38988B = parcel.readFloat();
        this.f39002P = parcel.readString();
        this.f38994H = (Location) parcel.readParcelable(Location.class.getClassLoader());
        this.f38999M = parcel.readInt();
        this.f38997K = parcel.readInt();
        this.f38996J = parcel.readInt();
        this.f38995I = parcel.readInt();
        this.f38998L = parcel.readByte() == (byte) 1;
        this.f39003Q = parcel.readInt();
        this.f38991E = parcel.readInt();
        this.f38990D = parcel.readInt();
        this.f38989C = parcel.readInt();
        if (parcel.readByte() == (byte) 1) {
            z = true;
        }
        this.f38993G = z;
    }

    /* renamed from: A */
    public final void m18992A(AnonymousClass0OA anonymousClass0OA) {
        this.f38999M = anonymousClass0OA.AD;
        this.f38997K = anonymousClass0OA.f3815c;
        this.f38996J = anonymousClass0OA.bC.f17220Q;
        this.f38995I = anonymousClass0OA.bC.f17209F;
        this.f38998L = anonymousClass0OA.hB;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39000N);
        parcel.writeByte((byte) this.f38992F);
        parcel.writeByte((byte) this.f39001O);
        parcel.writeFloat(this.f38988B);
        parcel.writeString(this.f39002P);
        parcel.writeParcelable(this.f38994H, i);
        parcel.writeInt(this.f38999M);
        parcel.writeInt(this.f38997K);
        parcel.writeInt(this.f38996J);
        parcel.writeInt(this.f38995I);
        parcel.writeByte((byte) this.f38998L);
        parcel.writeInt(this.f39003Q);
        parcel.writeInt(this.f38991E);
        parcel.writeInt(this.f38990D);
        parcel.writeInt(this.f38989C);
        parcel.writeByte((byte) this.f38993G);
    }
}
