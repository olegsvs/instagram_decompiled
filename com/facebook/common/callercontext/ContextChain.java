package com.facebook.common.callercontext;

import X.AnonymousClass2kP;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ContextChain implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2kP();
    /* renamed from: B */
    private final int f33237B;
    /* renamed from: C */
    private final String f33238C;
    /* renamed from: D */
    private final ContextChain f33239D;
    /* renamed from: E */
    private String f33240E;
    /* renamed from: F */
    private final String f33241F;

    public final int describeContents() {
        return 0;
    }

    public ContextChain(Parcel parcel) {
        this.f33241F = parcel.readString();
        this.f33238C = parcel.readString();
        this.f33237B = parcel.readInt();
        this.f33239D = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }

    public final String toString() {
        if (this.f33240E == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f33241F);
            stringBuilder.append(":");
            stringBuilder.append(this.f33238C);
            this.f33240E = stringBuilder.toString();
            if (this.f33239D != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.f33239D.toString());
                stringBuilder.append('/');
                stringBuilder.append(this.f33240E);
                this.f33240E = stringBuilder.toString();
            }
        }
        return this.f33240E;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f33241F);
        parcel.writeString(this.f33238C);
        parcel.writeInt(this.f33237B);
        parcel.writeParcelable(this.f33239D, i);
    }
}
