package com.facebook.profilo.ipc;

import X.AnonymousClass01N;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class TraceContext implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass01N();
    /* renamed from: B */
    public int f15510B;
    /* renamed from: C */
    public Object f15511C;
    /* renamed from: D */
    public int f15512D;
    /* renamed from: E */
    public Object f15513E;
    /* renamed from: F */
    public int f15514F;
    /* renamed from: G */
    public int f15515G;
    /* renamed from: H */
    public String f15516H;
    /* renamed from: I */
    public int f15517I;
    /* renamed from: J */
    public int f15518J;
    /* renamed from: K */
    public long f15519K;

    public final int describeContents() {
        return 0;
    }

    public TraceContext(long j, String str, int i, Object obj, Object obj2, int i2, int i3, int i4, int i5) {
        this(j, str, i, obj, obj2, i2, i3, i4, i5, 0);
    }

    public TraceContext(long j, String str, int i, Object obj, Object obj2, int i2, int i3, int i4, int i5, int i6) {
        this.f15519K = j;
        this.f15516H = str;
        this.f15512D = i;
        this.f15513E = obj;
        this.f15511C = obj2;
        this.f15518J = i2;
        this.f15515G = i3;
        this.f15514F = i4;
        this.f15517I = i5;
        this.f15510B = i6;
    }

    public TraceContext(Parcel parcel) {
        this.f15519K = parcel.readLong();
        this.f15516H = parcel.readString();
        this.f15512D = parcel.readInt();
        this.f15513E = null;
        this.f15511C = null;
        this.f15518J = parcel.readInt();
        this.f15515G = parcel.readInt();
        this.f15514F = parcel.readInt();
        this.f15517I = parcel.readInt();
        this.f15510B = parcel.readInt();
    }

    public TraceContext(TraceContext traceContext, int i) {
        this(traceContext.f15519K, traceContext.f15516H, traceContext.f15512D, traceContext.f15513E, traceContext.f15511C, traceContext.f15518J, traceContext.f15515G, traceContext.f15514F, traceContext.f15517I, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f15519K);
        parcel.writeString(this.f15516H);
        parcel.writeInt(this.f15512D);
        parcel.writeInt(this.f15518J);
        parcel.writeInt(this.f15515G);
        parcel.writeInt(this.f15514F);
        parcel.writeInt(this.f15517I);
        parcel.writeInt(this.f15510B);
    }
}
