package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass17U;
import X.AnonymousClass1Dx;
import X.AnonymousClass1Dz;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class VideoPlayRequest implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1Dx();
    /* renamed from: B */
    public float f15786B;
    /* renamed from: C */
    public boolean f15787C;
    /* renamed from: D */
    public String f15788D;
    /* renamed from: E */
    public final boolean f15789E;
    /* renamed from: F */
    public boolean f15790F;
    /* renamed from: G */
    public boolean f15791G;
    /* renamed from: H */
    public boolean f15792H;
    /* renamed from: I */
    public boolean f15793I;
    /* renamed from: J */
    public AnonymousClass1Dz f15794J;
    /* renamed from: K */
    public int f15795K;
    /* renamed from: L */
    public int f15796L;
    /* renamed from: M */
    public VideoSource f15797M;
    /* renamed from: N */
    public int f15798N;

    public final int describeContents() {
        return 0;
    }

    public VideoPlayRequest(Parcel parcel) {
        this.f15797M = (VideoSource) VideoSource.CREATOR.createFromParcel(parcel);
        this.f15788D = parcel.readString();
        this.f15795K = parcel.readInt();
        boolean z = false;
        this.f15791G = parcel.readInt() == 1;
        this.f15790F = parcel.readInt() == 1;
        this.f15792H = parcel.readInt() == 1;
        this.f15793I = parcel.readInt() == 1;
        this.f15786B = parcel.readFloat();
        this.f15794J = AnonymousClass1Dz.m10137B(parcel.readInt());
        this.f15796L = parcel.readInt();
        this.f15787C = parcel.readInt() == 1;
        this.f15798N = parcel.readInt();
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f15789E = z;
    }

    public VideoPlayRequest(VideoSource videoSource, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, float f, AnonymousClass1Dz anonymousClass1Dz, int i2, boolean z5, int i3, boolean z6) {
        this.f15797M = videoSource;
        this.f15788D = str;
        this.f15795K = i;
        this.f15791G = z;
        this.f15790F = z2;
        this.f15792H = z3;
        this.f15793I = z4;
        this.f15786B = f;
        this.f15794J = anonymousClass1Dz;
        this.f15796L = i2;
        this.f15787C = z5;
        this.f15798N = i3;
        this.f15789E = z6;
    }

    /* renamed from: A */
    public final boolean m10133A() {
        return this.f15797M.f14751P == AnonymousClass17U.PROGRESSIVE;
    }

    /* renamed from: B */
    public final boolean m10134B() {
        return this.f15797M.f14751P == AnonymousClass17U.DASH_VOD;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f15797M.writeToParcel(parcel, i);
        parcel.writeString(this.f15788D);
        parcel.writeInt(this.f15795K);
        parcel.writeInt(this.f15791G);
        parcel.writeInt(this.f15790F);
        parcel.writeInt(this.f15792H);
        parcel.writeInt(this.f15793I);
        parcel.writeFloat(this.f15786B);
        parcel.writeInt(this.f15794J.m10138A());
        parcel.writeInt(this.f15796L);
        parcel.writeInt(this.f15787C);
        parcel.writeInt(this.f15798N);
        parcel.writeInt(this.f15789E);
    }
}
