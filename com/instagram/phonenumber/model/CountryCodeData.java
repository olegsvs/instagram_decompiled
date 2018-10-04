package com.instagram.phonenumber.model;

import X.AnonymousClass0IE;
import X.AnonymousClass2FM;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Locale;

public class CountryCodeData implements Parcelable, Comparable {
    public static final Creator CREATOR = new AnonymousClass2FM();
    /* renamed from: B */
    public String f28032B;
    /* renamed from: C */
    public String f28033C;
    /* renamed from: D */
    public String f28034D;

    public final int describeContents() {
        return 0;
    }

    public CountryCodeData(int i, String str) {
        this(String.valueOf(i), str);
    }

    public CountryCodeData(Parcel parcel) {
        this.f28033C = parcel.readString();
        this.f28034D = parcel.readString();
        this.f28032B = parcel.readString();
    }

    public CountryCodeData(String str, String str2) {
        this(str, new Locale(JsonProperty.USE_DEFAULT_NAME, str2).getDisplayCountry(), str2);
    }

    public CountryCodeData(String str, String str2, String str3) {
        this.f28033C = str;
        this.f28034D = str2;
        this.f28032B = str3;
    }

    /* renamed from: A */
    public final String m14823A() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+");
        stringBuilder.append(this.f28033C);
        return stringBuilder.toString();
    }

    /* renamed from: B */
    public final String m14824B() {
        return AnonymousClass0IE.E("%s (+%s)", new Object[]{this.f28034D, this.f28033C});
    }

    /* renamed from: C */
    public final String m14825C() {
        return AnonymousClass0IE.E("%s +%s", new Object[]{this.f28032B, this.f28033C});
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f28034D.compareTo(((CountryCodeData) obj).f28034D);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28033C);
        parcel.writeString(this.f28034D);
        parcel.writeString(this.f28032B);
    }
}
