package com.facebook.login;

import X.AnonymousClass1vf;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class LoginClient$Request implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1vf();
    /* renamed from: B */
    public final String f24259B;
    /* renamed from: C */
    public final String f24260C;
    /* renamed from: D */
    public final boolean f24261D;
    /* renamed from: E */
    public final Set f24262E;
    /* renamed from: F */
    public final String f24263F;

    public final int describeContents() {
        return 0;
    }

    public LoginClient$Request(Parcel parcel) {
        Collection arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f24262E = new HashSet(arrayList);
        this.f24259B = parcel.readString();
        this.f24260C = parcel.readString();
        this.f24261D = parcel.readByte() != (byte) 0;
        this.f24263F = parcel.readString();
    }

    public LoginClient$Request(Set set, String str, String str2, boolean z, String str3) {
        if (set == null) {
            set = new HashSet();
        }
        this.f24262E = set;
        this.f24259B = str;
        this.f24260C = str2;
        this.f24261D = z;
        this.f24263F = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(new ArrayList(this.f24262E));
        parcel.writeString(this.f24259B);
        parcel.writeString(this.f24260C);
        parcel.writeByte((byte) this.f24261D);
        parcel.writeString(this.f24263F);
    }
}
