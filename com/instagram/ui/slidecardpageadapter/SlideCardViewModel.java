package com.instagram.ui.slidecardpageadapter;

import X.AnonymousClass3j8;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.SpannableString;
import android.text.TextUtils;

public class SlideCardViewModel implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3j8();
    /* renamed from: B */
    public final String f43677B;
    /* renamed from: C */
    public final int f43678C;
    /* renamed from: D */
    public final String f43679D;
    /* renamed from: E */
    public final int f43680E;
    /* renamed from: F */
    public final SpannableString f43681F;
    /* renamed from: G */
    public final String f43682G;
    /* renamed from: H */
    public final String f43683H;

    public final int describeContents() {
        return 0;
    }

    public SlideCardViewModel(int i, int i2, String str, String str2, String str3, String str4, SpannableString spannableString) {
        this.f43678C = i;
        this.f43680E = i2;
        this.f43679D = str;
        this.f43677B = str2;
        this.f43683H = str3;
        this.f43682G = str4;
        this.f43681F = spannableString;
    }

    public SlideCardViewModel(Parcel parcel) {
        this.f43678C = parcel.readInt();
        this.f43680E = parcel.readInt();
        this.f43679D = parcel.readString();
        this.f43677B = parcel.readString();
        this.f43683H = parcel.readString();
        this.f43682G = parcel.readString();
        this.f43681F = (SpannableString) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    /* renamed from: B */
    public static SlideCardViewModel m20499B(int i, String str, String str2) {
        return new SlideCardViewModel(i, 0, null, null, str, str2, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f43678C);
        parcel.writeInt(this.f43680E);
        parcel.writeString(this.f43679D);
        parcel.writeString(this.f43677B);
        parcel.writeString(this.f43683H);
        parcel.writeString(this.f43682G);
        TextUtils.writeToParcel(this.f43681F, parcel, i);
    }
}
