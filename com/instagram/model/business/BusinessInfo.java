package com.instagram.model.business;

import X.AnonymousClass2Dz;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class BusinessInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2Dz();
    /* renamed from: B */
    public Address f27742B;
    /* renamed from: C */
    public String f27743C;
    /* renamed from: D */
    public boolean f27744D;
    /* renamed from: E */
    public String f27745E;
    /* renamed from: F */
    public String f27746F;
    /* renamed from: G */
    public String f27747G;
    /* renamed from: H */
    public String f27748H;
    /* renamed from: I */
    public String f27749I;
    /* renamed from: J */
    public String f27750J;
    /* renamed from: K */
    public String f27751K;
    /* renamed from: L */
    public PublicPhoneContact f27752L;

    public final int describeContents() {
        return 0;
    }

    public BusinessInfo(Parcel parcel) {
        this.f27749I = parcel.readString();
        this.f27750J = parcel.readString();
        this.f27752L = (PublicPhoneContact) parcel.readParcelable(PublicPhoneContact.class.getClassLoader());
        this.f27751K = parcel.readString();
        this.f27742B = (Address) parcel.readParcelable(Address.class.getClassLoader());
        this.f27745E = parcel.readString();
        this.f27743C = parcel.readString();
        this.f27746F = parcel.readString();
        this.f27747G = parcel.readString();
        this.f27748H = parcel.readString();
        this.f27744D = parcel.readByte() != (byte) 0;
    }

    public BusinessInfo(String str, String str2, PublicPhoneContact publicPhoneContact, Address address, String str3) {
        this.f27749I = str;
        this.f27750J = str2;
        this.f27752L = publicPhoneContact;
        this.f27742B = address;
        this.f27751K = str3;
    }

    public BusinessInfo(String str, String str2, PublicPhoneContact publicPhoneContact, Address address, String str3, boolean z, String str4, String str5, String str6, String str7, String str8) {
        this.f27749I = str;
        this.f27750J = str2;
        this.f27752L = publicPhoneContact;
        this.f27742B = address;
        this.f27751K = str3;
        this.f27744D = z;
        this.f27745E = str4;
        this.f27743C = str5;
        this.f27746F = str6;
        this.f27747G = str7;
        this.f27748H = str8;
    }

    /* renamed from: A */
    public final boolean m14762A() {
        if (TextUtils.isEmpty(this.f27750J) && this.f27742B == null) {
            PublicPhoneContact publicPhoneContact = this.f27752L;
            if (publicPhoneContact == null || TextUtils.isEmpty(publicPhoneContact.f27762D)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27749I);
        parcel.writeString(this.f27750J);
        parcel.writeParcelable(this.f27752L, i);
        parcel.writeString(this.f27751K);
        parcel.writeParcelable(this.f27742B, i);
        parcel.writeString(this.f27745E);
        parcel.writeString(this.f27743C);
        parcel.writeString(this.f27746F);
        parcel.writeString(this.f27747G);
        parcel.writeString(this.f27748H);
        parcel.writeByte((byte) this.f27744D);
    }
}
