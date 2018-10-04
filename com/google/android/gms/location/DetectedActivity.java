package com.google.android.gms.location;

import X.AnonymousClass1zC;
import X.AnonymousClass5g0;
import X.AnonymousClass5g1;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import org.webrtc.audio.WebRtcAudioRecord;

public class DetectedActivity extends zza {
    public static final Creator CREATOR = new AnonymousClass5g1();
    /* renamed from: B */
    public int f68027B;
    /* renamed from: C */
    public int f68028C;

    static {
        AnonymousClass5g0 anonymousClass5g0 = new AnonymousClass5g0();
        int[] iArr = new int[]{9, 10};
        iArr = new int[]{0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17};
    }

    public DetectedActivity(int i, int i2) {
        this.f68027B = i;
        this.f68028C = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    DetectedActivity detectedActivity = (DetectedActivity) obj;
                    if (this.f68027B == detectedActivity.f68027B && this.f68028C == detectedActivity.f68028C) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f68027B), Integer.valueOf(this.f68028C)});
    }

    public final String toString() {
        Object obj;
        int i = this.f68027B;
        if (i > 17) {
            i = 4;
        }
        switch (i) {
            case 0:
                obj = "IN_VEHICLE";
                break;
            case 1:
                obj = "ON_BICYCLE";
                break;
            case 2:
                obj = "ON_FOOT";
                break;
            case 3:
                obj = "STILL";
                break;
            case 4:
                obj = "UNKNOWN";
                break;
            case 5:
                obj = "TILTING";
                break;
            default:
                switch (i) {
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        obj = "WALKING";
                        break;
                    case 8:
                        obj = "RUNNING";
                        break;
                    default:
                        switch (i) {
                            case 16:
                                obj = "IN_ROAD_VEHICLE";
                                break;
                            case 17:
                                obj = "IN_RAIL_VEHICLE";
                                break;
                            default:
                                obj = Integer.toString(i);
                                break;
                        }
                }
        }
        String valueOf = String.valueOf(obj);
        int i2 = this.f68028C;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
        stringBuilder.append("DetectedActivity [type=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", confidence=");
        stringBuilder.append(i2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f68027B);
        AnonymousClass1zC.S(parcel, 2, this.f68028C);
        AnonymousClass1zC.B(parcel, U);
    }
}
