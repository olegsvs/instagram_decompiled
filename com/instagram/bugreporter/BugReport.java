package com.instagram.bugreporter;

import X.AnonymousClass32v;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;

public class BugReport implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass32v();
    /* renamed from: B */
    public String f37278B;
    /* renamed from: C */
    public String f37279C;
    /* renamed from: D */
    public String f37280D;
    /* renamed from: E */
    public String f37281E;
    /* renamed from: F */
    public String f37282F;
    /* renamed from: G */
    public boolean f37283G;
    /* renamed from: H */
    public String f37284H;
    /* renamed from: I */
    public HashMap f37285I;
    /* renamed from: J */
    public ArrayList f37286J = new ArrayList();
    /* renamed from: K */
    public ArrayList f37287K = new ArrayList();
    /* renamed from: L */
    public String f37288L = "user_options";
    /* renamed from: M */
    public String f37289M;

    public final int describeContents() {
        return 0;
    }

    public BugReport(Parcel parcel) {
        this.f37281E = parcel.readString();
        this.f37287K = parcel.createStringArrayList();
        this.f37286J = parcel.createStringArrayList();
        this.f37278B = parcel.readString();
        this.f37280D = parcel.readString();
        this.f37282F = parcel.readString();
        this.f37284H = parcel.readString();
        this.f37289M = parcel.readString();
        this.f37279C = parcel.readString();
        this.f37283G = parcel.readByte() != (byte) 0;
        this.f37288L = parcel.readString();
        this.f37285I = (HashMap) parcel.readSerializable();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37281E);
        parcel.writeStringList(this.f37287K);
        parcel.writeStringList(this.f37286J);
        parcel.writeString(this.f37278B);
        parcel.writeString(this.f37280D);
        parcel.writeString(this.f37282F);
        parcel.writeString(this.f37284H);
        parcel.writeString(this.f37289M);
        parcel.writeString(this.f37279C);
        parcel.writeByte(this.f37283G);
        parcel.writeString(this.f37288L);
        parcel.writeSerializable(this.f37285I);
    }
}
