package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;
import org.webrtc.audio.WebRtcAudioRecord;

public abstract class zzcrx extends zzee implements zzcrw {
    public zzcrx() {
        int I = AnonymousClass0cQ.I(this, -1394168598);
        attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
        AnonymousClass0cQ.H(this, -561669770, I);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int I = AnonymousClass0cQ.I(this, 308139881);
        if (A(i, parcel, parcel2, i2)) {
            i3 = -453058870;
        } else {
            switch (i) {
                case 1:
                    SXA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR), (zza) AnonymousClass1FC.B(parcel, zza.CREATOR));
                    break;
                case 2:
                    HYA(parcel.readString());
                    break;
                case 3:
                    RXA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR), (SafeBrowsingData) AnonymousClass1FC.B(parcel, SafeBrowsingData.CREATOR));
                    break;
                case 4:
                    WXA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR), AnonymousClass1FC.E(parcel));
                    break;
                case 6:
                    UXA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR), (zzf) AnonymousClass1FC.B(parcel, zzf.CREATOR));
                    break;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    rXA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR), AnonymousClass1FC.E(parcel));
                    break;
                case 8:
                    TXA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR), (zzd) AnonymousClass1FC.B(parcel, zzd.CREATOR));
                    break;
                case 10:
                    yXA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR), AnonymousClass1FC.E(parcel));
                    break;
                case 11:
                    KXA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR));
                    break;
                case 12:
                    EYA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR), AnonymousClass1FC.E(parcel));
                    break;
                default:
                    AnonymousClass0cQ.H(this, -1151024905, I);
                    return false;
            }
            i3 = -1839849985;
        }
        AnonymousClass0cQ.H(this, i3, I);
        return true;
    }
}
