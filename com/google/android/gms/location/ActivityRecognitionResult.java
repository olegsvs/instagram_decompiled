package com.google.android.gms.location;

import X.AnonymousClass1Ew;
import X.AnonymousClass1zC;
import X.AnonymousClass1zL;
import X.AnonymousClass5fz;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import java.util.List;

public class ActivityRecognitionResult extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5fz();
    /* renamed from: B */
    private Bundle f68022B;
    /* renamed from: C */
    private List f68023C;
    /* renamed from: D */
    private long f68024D;
    /* renamed from: E */
    private long f68025E;
    /* renamed from: F */
    private int f68026F;

    public ActivityRecognitionResult(List list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        boolean z2 = list != null && list.size() > 0;
        AnonymousClass1Ew.F(z2, "Must have at least 1 detected activity");
        if (j <= 0 || j2 <= 0) {
            z = false;
        }
        AnonymousClass1Ew.F(z, "Must set times");
        this.f68023C = list;
        this.f68024D = j;
        this.f68025E = j2;
        this.f68026F = i;
        this.f68022B = bundle;
    }

    /* renamed from: B */
    private static boolean m28247B(Bundle bundle, Bundle bundle2) {
        if (!(bundle == null && bundle2 == null)) {
            if ((bundle != null || bundle2 == null) && (bundle == null || bundle2 != null)) {
                if (bundle.size() == bundle2.size()) {
                    for (String str : bundle.keySet()) {
                        if (bundle2.containsKey(str)) {
                            if (bundle.get(str) == null) {
                                if (bundle2.get(str) != null) {
                                }
                            } else if (bundle.get(str) instanceof Bundle) {
                                if (m28247B(bundle.getBundle(str), bundle2.getBundle(str))) {
                                }
                            } else if (bundle.get(str).equals(bundle2.get(str))) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
                    if (this.f68024D == activityRecognitionResult.f68024D && this.f68025E == activityRecognitionResult.f68025E && this.f68026F == activityRecognitionResult.f68026F && AnonymousClass1zL.B(this.f68023C, activityRecognitionResult.f68023C) && m28247B(this.f68022B, activityRecognitionResult.f68022B)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f68024D), Long.valueOf(this.f68025E), Integer.valueOf(this.f68026F), this.f68023C, this.f68022B});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f68023C);
        long j = this.f68024D;
        long j2 = this.f68025E;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 124);
        stringBuilder.append("ActivityRecognitionResult [probableActivities=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", timeMillis=");
        stringBuilder.append(j);
        stringBuilder.append(", elapsedRealtimeMillis=");
        stringBuilder.append(j2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.T(parcel, 1, this.f68023C, false);
        AnonymousClass1zC.C(parcel, 2, this.f68024D);
        AnonymousClass1zC.C(parcel, 3, this.f68025E);
        AnonymousClass1zC.S(parcel, 4, this.f68026F);
        AnonymousClass1zC.D(parcel, 5, this.f68022B, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
