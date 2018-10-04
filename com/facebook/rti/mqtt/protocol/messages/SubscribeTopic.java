package com.facebook.rti.mqtt.protocol.messages;

import X.AnonymousClass05x;
import X.AnonymousClass08F;
import X.AnonymousClass1DG;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public class SubscribeTopic implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass08F();
    /* renamed from: B */
    public final int f15671B;
    /* renamed from: C */
    public final String f15672C;
    /* renamed from: D */
    private volatile TopicExtraInfo f15673D;

    public final int describeContents() {
        return 0;
    }

    public SubscribeTopic(Parcel parcel) {
        this.f15672C = parcel.readString();
        this.f15671B = parcel.readInt();
        this.f15673D = (TopicExtraInfo) parcel.readParcelable(TopicExtraInfo.class.getClassLoader());
    }

    public SubscribeTopic(String str, int i) {
        this.f15672C = (String) AnonymousClass1DG.m10047C(str);
        this.f15671B = ((Integer) AnonymousClass1DG.m10047C(Integer.valueOf(i))).intValue();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    SubscribeTopic subscribeTopic = (SubscribeTopic) obj;
                    if (!AnonymousClass05x.m351B(this.f15672C, subscribeTopic.f15672C) || this.f15671B != subscribeTopic.f15671B) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15672C, Integer.valueOf(this.f15671B)});
    }

    public final String toString() {
        return String.format("{ name='%s', qos='%s', extra='%s' }", new Object[]{this.f15672C, Integer.valueOf(this.f15671B), this.f15673D});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15672C);
        parcel.writeInt(this.f15671B);
        parcel.writeParcelable(this.f15673D, i);
    }
}
