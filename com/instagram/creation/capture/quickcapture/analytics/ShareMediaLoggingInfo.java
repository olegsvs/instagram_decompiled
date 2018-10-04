package com.instagram.creation.capture.quickcapture.analytics;

import X.AnonymousClass0O7;
import X.AnonymousClass283;
import X.AnonymousClass284;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShareMediaLoggingInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass283();
    /* renamed from: B */
    public final int f26462B;
    /* renamed from: C */
    public final int f26463C;
    /* renamed from: D */
    public final List f26464D;
    /* renamed from: E */
    public final Map f26465E;
    /* renamed from: F */
    public final int f26466F;
    /* renamed from: G */
    public final int f26467G;
    /* renamed from: H */
    public final Map f26468H;
    /* renamed from: I */
    public final String f26469I;

    public final int describeContents() {
        return 0;
    }

    public ShareMediaLoggingInfo(AnonymousClass284 anonymousClass284) {
        this.f26467G = anonymousClass284.f26459G;
        this.f26462B = anonymousClass284.f26454B;
        this.f26463C = anonymousClass284.f26455C;
        this.f26466F = anonymousClass284.f26458F;
        this.f26464D = anonymousClass284.f26456D;
        this.f26465E = m14532B(anonymousClass284.f26457E);
        this.f26469I = anonymousClass284.f26461I;
        this.f26468H = anonymousClass284.f26460H;
    }

    public ShareMediaLoggingInfo(Parcel parcel) {
        this.f26467G = parcel.readInt();
        this.f26462B = parcel.readInt();
        this.f26463C = parcel.readInt();
        this.f26466F = parcel.readInt();
        List arrayList = new ArrayList();
        this.f26464D = arrayList;
        parcel.readStringList(arrayList);
        this.f26465E = m14532B(parcel.readBundle(getClass().getClassLoader()));
        this.f26469I = parcel.readString();
        this.f26468H = m14532B(parcel.readBundle(getClass().getClassLoader()));
    }

    /* renamed from: B */
    private static Map m14532B(Bundle bundle) {
        Map anonymousClass0O7 = new AnonymousClass0O7(bundle.size());
        for (String str : bundle.keySet()) {
            anonymousClass0O7.put(str, bundle.getString(str));
        }
        return anonymousClass0O7;
    }

    /* renamed from: C */
    private static Bundle m14533C(Map map) {
        Bundle bundle = new Bundle(map.size());
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26467G);
        parcel.writeInt(this.f26462B);
        parcel.writeInt(this.f26463C);
        parcel.writeInt(this.f26466F);
        parcel.writeStringList(this.f26464D);
        parcel.writeBundle(m14533C(this.f26465E));
        parcel.writeString(this.f26469I);
        parcel.writeBundle(m14533C(this.f26468H));
    }
}
