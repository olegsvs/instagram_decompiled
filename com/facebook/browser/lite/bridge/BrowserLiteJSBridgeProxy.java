package com.facebook.browser.lite.bridge;

import X.AnonymousClass1qA;
import X.AnonymousClass1rN;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BrowserLiteJSBridgeProxy implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1qA();
    /* renamed from: B */
    public final String f23248B;
    /* renamed from: C */
    private Bundle f23249C;
    /* renamed from: D */
    private AnonymousClass1rN f23250D;

    public final int describeContents() {
        return 0;
    }

    public BrowserLiteJSBridgeProxy(Parcel parcel) {
        this.f23248B = parcel.readString();
        this.f23249C = parcel.readBundle();
    }

    /* renamed from: A */
    public final synchronized void m13389A(AnonymousClass1rN anonymousClass1rN) {
        this.f23250D = anonymousClass1rN;
        if (this.f23250D != null) {
            this.f23250D.getUrl();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23248B);
        parcel.writeBundle(this.f23249C);
    }
}
