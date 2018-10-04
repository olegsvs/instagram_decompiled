package com.instagram.simplewebview;

import X.AnonymousClass0Su;
import X.AnonymousClass1S4;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class SimpleWebViewConfig implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1S4();
    /* renamed from: B */
    public final String f5041B;
    /* renamed from: C */
    public final String f5042C;
    /* renamed from: D */
    public final String f5043D;
    /* renamed from: E */
    public final boolean f5044E;
    /* renamed from: F */
    public final boolean f5045F;
    /* renamed from: G */
    public final boolean f5046G;
    /* renamed from: H */
    public final boolean f5047H;
    /* renamed from: I */
    public final boolean f5048I;
    /* renamed from: J */
    public final boolean f5049J;
    /* renamed from: K */
    public final boolean f5050K;
    /* renamed from: L */
    public final boolean f5051L;
    /* renamed from: M */
    public final String f5052M;
    /* renamed from: N */
    public final String f5053N;

    public final int describeContents() {
        return 0;
    }

    public SimpleWebViewConfig(AnonymousClass0Su anonymousClass0Su) {
        this.f5053N = anonymousClass0Su.f5040N;
        this.f5042C = anonymousClass0Su.f5029C;
        this.f5052M = anonymousClass0Su.f5039M;
        this.f5051L = anonymousClass0Su.f5038L;
        this.f5044E = anonymousClass0Su.f5031E;
        this.f5047H = anonymousClass0Su.f5034H;
        this.f5048I = anonymousClass0Su.f5035I;
        this.f5049J = anonymousClass0Su.f5036J;
        this.f5050K = anonymousClass0Su.f5037K;
        this.f5046G = anonymousClass0Su.f5033G;
        this.f5045F = anonymousClass0Su.f5032F;
        this.f5041B = anonymousClass0Su.f5028B;
        this.f5043D = anonymousClass0Su.f5030D;
    }

    public SimpleWebViewConfig(Parcel parcel) {
        this.f5053N = parcel.readString();
        this.f5042C = parcel.readString();
        this.f5052M = parcel.readString();
        boolean z = true;
        this.f5051L = parcel.readByte() != (byte) 0;
        this.f5044E = parcel.readByte() != (byte) 0;
        this.f5047H = parcel.readByte() != (byte) 0;
        this.f5048I = parcel.readByte() != (byte) 0;
        this.f5049J = parcel.readByte() != (byte) 0;
        this.f5050K = parcel.readByte() != (byte) 0;
        this.f5046G = parcel.readByte() != (byte) 0;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.f5045F = z;
        this.f5041B = parcel.readString();
        this.f5043D = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5053N);
        parcel.writeString(this.f5042C);
        parcel.writeString(this.f5052M);
        parcel.writeByte(this.f5051L);
        parcel.writeByte(this.f5044E);
        parcel.writeByte(this.f5047H);
        parcel.writeByte(this.f5048I);
        parcel.writeByte(this.f5049J);
        parcel.writeByte(this.f5050K);
        parcel.writeByte(this.f5046G);
        parcel.writeByte(this.f5045F);
        parcel.writeString(this.f5041B);
        parcel.writeString(this.f5043D);
    }
}
