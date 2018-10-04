package com.instagram.graphql.instagram_www.enums;

import X.AnonymousClass2CD;
import X.AnonymousClass2CE;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GraphQLObjectType implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2CD();
    /* renamed from: B */
    public String f27370B;
    /* renamed from: C */
    public int f27371C = 0;

    public final int describeContents() {
        return 0;
    }

    public GraphQLObjectType(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f27371C = readInt;
        this.f27370B = AnonymousClass2CE.m14639C(readInt);
    }

    public final String toString() {
        if (this.f27371C == 0) {
            String str = this.f27370B;
            if (str != null) {
                this.f27371C = AnonymousClass2CE.m14638B(str);
            }
        }
        return AnonymousClass2CE.m14639C(this.f27371C);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27371C);
    }
}
