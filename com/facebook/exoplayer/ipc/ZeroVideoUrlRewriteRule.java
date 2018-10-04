package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l8;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.regex.Pattern;

public class ZeroVideoUrlRewriteRule implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2l8();
    /* renamed from: B */
    public final String f33386B;
    /* renamed from: C */
    public final String f33387C;

    public final int describeContents() {
        return 0;
    }

    public ZeroVideoUrlRewriteRule(Parcel parcel) {
        this.f33386B = parcel.readString();
        this.f33387C = parcel.readString();
        Pattern.compile(this.f33386B);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof ZeroVideoUrlRewriteRule) {
                ZeroVideoUrlRewriteRule zeroVideoUrlRewriteRule = (ZeroVideoUrlRewriteRule) obj;
                if (this.f33386B.equals(zeroVideoUrlRewriteRule.f33386B) && this.f33387C.equals(zeroVideoUrlRewriteRule.f33387C)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33386B.hashCode() * 31) + this.f33387C.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f33386B);
        parcel.writeString(this.f33387C);
    }
}
