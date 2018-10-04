package com.facebook.login;

import X.AnonymousClass1vg;
import X.AnonymousClass1vh;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.AccessToken;

public class LoginClient$Result implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1vg();
    /* renamed from: B */
    public final AnonymousClass1vh f24268B;
    /* renamed from: C */
    public final String f24269C;
    /* renamed from: D */
    public final String f24270D;
    /* renamed from: E */
    public final LoginClient$Request f24271E;
    /* renamed from: F */
    public final AccessToken f24272F;

    public final int describeContents() {
        return 0;
    }

    public LoginClient$Result(Parcel parcel) {
        this.f24268B = AnonymousClass1vh.valueOf(parcel.readString());
        this.f24272F = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
        this.f24270D = parcel.readString();
        this.f24269C = parcel.readString();
        this.f24271E = (LoginClient$Request) parcel.readParcelable(LoginClient$Request.class.getClassLoader());
    }

    public LoginClient$Result(LoginClient$Request loginClient$Request, AnonymousClass1vh anonymousClass1vh, AccessToken accessToken, String str, String str2) {
        this.f24271E = loginClient$Request;
        this.f24272F = accessToken;
        this.f24270D = str;
        this.f24268B = anonymousClass1vh;
        this.f24269C = str2;
    }

    /* renamed from: B */
    public static LoginClient$Result m13793B(LoginClient$Request loginClient$Request, String str) {
        return new LoginClient$Result(loginClient$Request, AnonymousClass1vh.CANCEL, null, str, null);
    }

    /* renamed from: C */
    public static LoginClient$Result m13794C(LoginClient$Request loginClient$Request, String str, String str2) {
        return m13795D(loginClient$Request, str, str2, null);
    }

    /* renamed from: D */
    public static LoginClient$Result m13795D(LoginClient$Request loginClient$Request, String str, String str2, String str3) {
        AnonymousClass1vh anonymousClass1vh = AnonymousClass1vh.ERROR;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return new LoginClient$Result(loginClient$Request, anonymousClass1vh, null, stringBuilder.toString(), str3);
    }

    /* renamed from: E */
    public static LoginClient$Result m13796E(LoginClient$Request loginClient$Request, AccessToken accessToken) {
        return new LoginClient$Result(loginClient$Request, AnonymousClass1vh.SUCCESS, accessToken, null, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24268B.name());
        parcel.writeParcelable(this.f24272F, i);
        parcel.writeString(this.f24270D);
        parcel.writeString(this.f24269C);
        parcel.writeParcelable(this.f24271E, i);
    }
}
