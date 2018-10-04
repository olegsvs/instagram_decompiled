package com.instagram.graphql.facebook.enums;

import X.AnonymousClass2C0;
import X.AnonymousClass2C1;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GraphQLObjectType implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2C0();
    /* renamed from: B */
    public String f27321B;
    /* renamed from: C */
    public int f27322C = 0;

    public final int describeContents() {
        return 0;
    }

    public GraphQLObjectType(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f27322C = readInt;
        this.f27321B = AnonymousClass2C1.m14635C(readInt);
    }

    public final String toString() {
        if (this.f27322C == 0) {
            String str = this.f27321B;
            if (str != null) {
                this.f27322C = AnonymousClass2C1.m14634B(str);
            }
        }
        return AnonymousClass2C1.m14635C(this.f27322C);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27322C);
    }
}
