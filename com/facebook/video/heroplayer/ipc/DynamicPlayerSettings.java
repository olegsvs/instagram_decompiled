package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass1HA;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class DynamicPlayerSettings implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1HA();
    /* renamed from: B */
    public final int f15863B;
    /* renamed from: C */
    public final int f15864C;
    /* renamed from: D */
    public final int f15865D;
    /* renamed from: E */
    public final boolean f15866E;
    /* renamed from: F */
    public final int f15867F;
    /* renamed from: G */
    public final int f15868G;
    /* renamed from: H */
    public final int f15869H;
    /* renamed from: I */
    public final int f15870I;
    /* renamed from: J */
    public final int f15871J;
    /* renamed from: K */
    public final int f15872K;
    /* renamed from: L */
    public final int f15873L;
    /* renamed from: M */
    public final int f15874M;

    /* renamed from: B */
    public static int m10183B(int i, int i2) {
        return i != -1 ? i : i2;
    }

    public final int describeContents() {
        return 0;
    }

    public DynamicPlayerSettings() {
        this.f15870I = -1;
        this.f15864C = -1;
        this.f15867F = -1;
        this.f15871J = -1;
        this.f15872K = -1;
        this.f15863B = -1;
        this.f15865D = -1;
        this.f15873L = -1;
        this.f15874M = -1;
        this.f15868G = -1;
        this.f15869H = -1;
        this.f15866E = false;
    }

    public DynamicPlayerSettings(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z) {
        this.f15870I = i;
        this.f15864C = i2;
        this.f15867F = i3;
        this.f15871J = i4;
        this.f15872K = i5;
        this.f15863B = i6;
        this.f15865D = i7;
        this.f15873L = i8;
        this.f15874M = i9;
        this.f15868G = i10;
        this.f15869H = i11;
        this.f15866E = z;
    }

    public DynamicPlayerSettings(Parcel parcel) {
        this.f15870I = parcel.readInt();
        this.f15864C = parcel.readInt();
        this.f15867F = parcel.readInt();
        this.f15871J = parcel.readInt();
        this.f15872K = parcel.readInt();
        this.f15863B = parcel.readInt();
        this.f15865D = parcel.readInt();
        this.f15873L = parcel.readInt();
        this.f15874M = parcel.readInt();
        this.f15868G = parcel.readInt();
        this.f15869H = parcel.readInt();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f15866E = z;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LivePrefetchSegmentsNum=");
        stringBuilder.append(this.f15870I);
        stringBuilder.append(",DashLiveEdgeLatencyMs=");
        stringBuilder.append(this.f15864C);
        stringBuilder.append(",JumpEdgeLatencyMs=");
        stringBuilder.append(this.f15867F);
        stringBuilder.append(",minBufferMs=");
        stringBuilder.append(this.f15871J);
        stringBuilder.append(",minRebufferMs=");
        stringBuilder.append(this.f15872K);
        stringBuilder.append(",dashHighWaterMarkMs=");
        stringBuilder.append(this.f15863B);
        stringBuilder.append(",dashLowWaterMarkMs=");
        stringBuilder.append(this.f15865D);
        stringBuilder.append(",pausePrefetchTaskQueueMs=");
        stringBuilder.append(this.f15873L);
        stringBuilder.append(",segmentLengthToConcatMs=");
        stringBuilder.append(this.f15874M);
        stringBuilder.append(",liveMinBufferMs=");
        stringBuilder.append(this.f15868G);
        stringBuilder.append(",liveMinRebufferMs=");
        stringBuilder.append(this.f15869H);
        stringBuilder.append(", isDebugHeadersEnabled");
        stringBuilder.append(this.f15866E);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15870I);
        parcel.writeInt(this.f15864C);
        parcel.writeInt(this.f15867F);
        parcel.writeInt(this.f15871J);
        parcel.writeInt(this.f15872K);
        parcel.writeInt(this.f15863B);
        parcel.writeInt(this.f15865D);
        parcel.writeInt(this.f15873L);
        parcel.writeInt(this.f15874M);
        parcel.writeInt(this.f15868G);
        parcel.writeInt(this.f15869H);
        parcel.writeInt(this.f15866E);
    }
}
