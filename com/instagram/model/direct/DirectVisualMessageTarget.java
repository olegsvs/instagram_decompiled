package com.instagram.model.direct;

import X.AnonymousClass2E9;
import X.AnonymousClass2EA;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class DirectVisualMessageTarget implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2EA();
    /* renamed from: F */
    public static final Comparator f6335F = new AnonymousClass2E9();
    /* renamed from: B */
    public boolean f6336B;
    /* renamed from: C */
    public List f6337C;
    /* renamed from: D */
    public String f6338D;
    /* renamed from: E */
    public String f6339E;

    public final int describeContents() {
        return 0;
    }

    public DirectVisualMessageTarget(Parcel parcel) {
        this.f6337C = parcel.createTypedArrayList(PendingRecipient.CREATOR);
        this.f6338D = parcel.readString();
        this.f6339E = parcel.readString();
        this.f6336B = parcel.readByte() != (byte) 0;
    }

    /* renamed from: A */
    public final DirectShareTarget m5366A() {
        Collection collection = this.f6337C;
        return new DirectShareTarget(collection, new DirectThreadKey(this.f6338D, collection), this.f6339E, this.f6336B);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof DirectVisualMessageTarget)) {
                return false;
            }
            DirectVisualMessageTarget directVisualMessageTarget = (DirectVisualMessageTarget) obj;
            String str = directVisualMessageTarget.f6338D;
            String str2 = this.f6338D;
            if (str2 != null && str != null) {
                return str2.equals(str);
            }
            if (directVisualMessageTarget.f6336B == this.f6336B) {
                List list = this.f6337C;
                if (list != null) {
                    if (list.equals(directVisualMessageTarget.f6337C)) {
                    }
                } else if (directVisualMessageTarget.f6337C == null) {
                }
            }
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = (this.f6336B + 0) * 31;
        List list = this.f6337C;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f6337C);
        parcel.writeString(this.f6338D);
        parcel.writeString(this.f6339E);
        parcel.writeByte(this.f6336B);
    }
}
