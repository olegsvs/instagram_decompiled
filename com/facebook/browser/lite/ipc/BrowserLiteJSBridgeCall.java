package com.facebook.browser.lite.ipc;

import X.AnonymousClass1qo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BrowserLiteJSBridgeCall implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1qo();
    /* renamed from: B */
    private final Bundle f23346B;
    /* renamed from: C */
    private final String f23347C;
    /* renamed from: D */
    private final String f23348D;
    /* renamed from: E */
    private final Bundle f23349E;
    /* renamed from: F */
    private final String f23350F;

    public final int describeContents() {
        return 0;
    }

    public BrowserLiteJSBridgeCall(Parcel parcel) {
        this.f23347C = parcel.readString();
        this.f23346B = parcel.readBundle();
        this.f23348D = parcel.readString();
        this.f23350F = parcel.readString();
        this.f23349E = parcel.readBundle(getClass().getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23347C);
        parcel.writeBundle(this.f23346B);
        parcel.writeString(this.f23348D);
        parcel.writeString(this.f23350F);
        parcel.writeBundle(this.f23349E);
    }
}
