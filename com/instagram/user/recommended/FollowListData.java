package com.instagram.user.recommended;

import X.AnonymousClass3m8;
import X.AnonymousClass3m9;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.UUID;

public class FollowListData implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3m8();
    /* renamed from: B */
    public final String f44273B;
    /* renamed from: C */
    public final boolean f44274C;
    /* renamed from: D */
    public final String f44275D;
    /* renamed from: E */
    public final AnonymousClass3m9 f44276E;

    public final int describeContents() {
        return 0;
    }

    public FollowListData(AnonymousClass3m9 anonymousClass3m9, String str, String str2, boolean z) {
        this.f44276E = anonymousClass3m9;
        this.f44273B = str;
        this.f44275D = str2;
        this.f44274C = z;
    }

    /* renamed from: B */
    public static FollowListData m20625B(AnonymousClass3m9 anonymousClass3m9, String str) {
        return new FollowListData(anonymousClass3m9, str, UUID.randomUUID().toString(), false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f44276E.ordinal());
        parcel.writeString(this.f44273B);
        parcel.writeString(this.f44275D);
        parcel.writeInt(this.f44274C);
    }
}
