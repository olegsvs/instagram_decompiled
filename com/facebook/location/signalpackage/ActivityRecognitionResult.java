package com.facebook.location.signalpackage;

import X.AnonymousClass47b;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class ActivityRecognitionResult implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass47b();
    /* renamed from: B */
    public final long f50512B;
    /* renamed from: C */
    public final List f50513C;
    /* renamed from: D */
    public final long f50514D;

    public final int describeContents() {
        return 0;
    }

    public ActivityRecognitionResult(List list, long j, long j2) {
        this.f50514D = j;
        this.f50512B = j2;
        if (list != null) {
            this.f50513C = new ArrayList(list);
        } else {
            this.f50513C = null;
        }
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
                    if (this.f50514D == activityRecognitionResult.f50514D) {
                        if (this.f50512B == activityRecognitionResult.f50512B) {
                            List list = this.f50513C;
                            if (list != null) {
                                z = list.equals(activityRecognitionResult.f50513C);
                            } else if (activityRecognitionResult.f50513C != null) {
                                z = false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        long j = this.f50514D;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        j = this.f50512B;
        int i2 = (i + ((int) ((j >>> 32) ^ j))) * 31;
        List list = this.f50513C;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f50514D);
        parcel.writeLong(this.f50512B);
        parcel.writeTypedList(this.f50513C);
    }
}
