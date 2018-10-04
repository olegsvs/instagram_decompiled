package com.facebook.cameracore.assets.model;

import X.AnonymousClass0LQ;
import X.AnonymousClass2gw;
import X.AnonymousClass2hG;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ARCapabilityMinVersionModeling implements Parcelable, Serializable {
    public static final Creator CREATOR = new AnonymousClass2gw();
    /* renamed from: B */
    public AnonymousClass2hG f32464B;
    /* renamed from: C */
    public int f32465C;

    public final int describeContents() {
        return 0;
    }

    public ARCapabilityMinVersionModeling(Parcel parcel) {
        this.f32464B = AnonymousClass2hG.values()[parcel.readInt()];
        this.f32465C = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling = (ARCapabilityMinVersionModeling) obj;
                    if (!AnonymousClass0LQ.B(this.f32464B, aRCapabilityMinVersionModeling.f32464B) || !AnonymousClass0LQ.B(Integer.valueOf(this.f32465C), Integer.valueOf(aRCapabilityMinVersionModeling.f32465C))) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        return AnonymousClass0LQ.D(new Object[]{this.f32464B, Integer.valueOf(this.f32465C)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f32464B.ordinal());
        parcel.writeInt(this.f32465C);
    }
}
