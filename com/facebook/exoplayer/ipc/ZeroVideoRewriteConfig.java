package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l7;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class ZeroVideoRewriteConfig implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2l7();
    /* renamed from: B */
    public boolean f33382B;
    /* renamed from: C */
    public float f33383C;
    /* renamed from: D */
    public int f33384D;
    /* renamed from: E */
    public List f33385E;

    public final int describeContents() {
        return 0;
    }

    public ZeroVideoRewriteConfig(Parcel parcel) {
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f33382B = z;
        this.f33385E = parcel.createTypedArrayList(ZeroVideoUrlRewriteRule.CREATOR);
        this.f33384D = parcel.readInt();
        this.f33383C = parcel.readFloat();
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof ZeroVideoRewriteConfig) {
                ZeroVideoRewriteConfig zeroVideoRewriteConfig = (ZeroVideoRewriteConfig) obj;
                if (this.f33382B == zeroVideoRewriteConfig.f33382B) {
                    if (this.f33385E.size() == zeroVideoRewriteConfig.f33385E.size()) {
                        for (int i = 0; i < this.f33385E.size(); i++) {
                            if (!((ZeroVideoUrlRewriteRule) this.f33385E.get(i)).equals(zeroVideoRewriteConfig.f33385E.get(i))) {
                                break;
                            }
                        }
                        if (this.f33384D == zeroVideoRewriteConfig.f33384D) {
                            if (((double) Math.abs(this.f33383C - zeroVideoRewriteConfig.f33383C)) <= 0.001d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) (((float) (((((this.f33382B * 31) + this.f33385E.hashCode()) * 31) + this.f33384D) * 31)) + this.f33383C);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33382B);
        parcel.writeTypedList(this.f33385E);
        parcel.writeInt(this.f33384D);
        parcel.writeFloat(this.f33383C);
    }
}
