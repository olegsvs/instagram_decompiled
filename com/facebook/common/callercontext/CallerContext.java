package com.facebook.common.callercontext;

import X.AnonymousClass1t9;
import X.AnonymousClass1tA;
import X.AnonymousClass2kO;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public class CallerContext implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2kO();
    /* renamed from: B */
    public final String f33232B;
    /* renamed from: C */
    public final String f33233C;
    /* renamed from: D */
    public final ContextChain f33234D;
    /* renamed from: E */
    public final String f33235E;
    /* renamed from: F */
    public final String f33236F;

    public final int describeContents() {
        return 0;
    }

    static {
        CallerContext callerContext = new CallerContext();
    }

    private CallerContext() {
        this.f33233C = null;
        this.f33232B = null;
        this.f33236F = null;
        this.f33235E = null;
        this.f33234D = null;
    }

    public CallerContext(Parcel parcel) {
        this.f33233C = parcel.readString();
        this.f33235E = parcel.readString();
        this.f33232B = parcel.readString();
        this.f33236F = parcel.readString();
        this.f33234D = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CallerContext)) {
            return false;
        }
        CallerContext callerContext = (CallerContext) obj;
        if (AnonymousClass1tA.m13605B(this.f33233C, callerContext.f33233C) && AnonymousClass1tA.m13605B(this.f33232B, callerContext.f33232B) && AnonymousClass1tA.m13605B(this.f33235E, callerContext.f33235E) && AnonymousClass1tA.m13605B(this.f33236F, callerContext.f33236F) && AnonymousClass1tA.m13605B(this.f33234D, callerContext.f33234D)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33233C, this.f33232B, this.f33235E, this.f33236F, this.f33234D});
    }

    public final String toString() {
        String replaceAll = getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return new AnonymousClass1t9(replaceAll.substring(lastIndexOf + 1)).m13604A("Calling Class Name", this.f33233C).m13604A("Analytics Tag", this.f33232B).m13604A("Feature tag", this.f33235E).m13604A("Module Analytics Tag", this.f33236F).m13604A("Context Chain", this.f33234D).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f33233C);
        parcel.writeString(this.f33235E);
        parcel.writeString(this.f33232B);
        parcel.writeString(this.f33236F);
        parcel.writeParcelable(this.f33234D, i);
    }
}
