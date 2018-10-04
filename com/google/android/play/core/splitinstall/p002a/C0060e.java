package com.google.android.play.core.splitinstall.p002a;

import X.AnonymousClass0cQ;
import X.AnonymousClass1yZ;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p001a.C0053b;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: com.google.android.play.core.splitinstall.a.e */
public abstract class C0060e extends C0053b implements C0055d {
    public C0060e() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
        AnonymousClass0cQ.H(this, 465798865, AnonymousClass0cQ.I(this, -1413407963));
    }

    /* renamed from: A */
    public final boolean mo3144A(int i, Parcel parcel) {
        boolean z;
        int i2;
        int I = AnonymousClass0cQ.I(this, 165379643);
        switch (i) {
            case 2:
                GG(parcel.readInt(), (Bundle) AnonymousClass1yZ.m13969B(parcel, Bundle.CREATOR));
                break;
            case 3:
                iC(parcel.readInt(), (Bundle) AnonymousClass1yZ.m13969B(parcel, Bundle.CREATOR));
                break;
            case 4:
                JB(parcel.readInt(), (Bundle) AnonymousClass1yZ.m13969B(parcel, Bundle.CREATOR));
                break;
            case 5:
                bD(parcel.readInt(), (Bundle) AnonymousClass1yZ.m13969B(parcel, Bundle.CREATOR));
                break;
            case 6:
                wG((Bundle) AnonymousClass1yZ.m13969B(parcel, Bundle.CREATOR));
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                PB(parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 8:
                cD((Bundle) AnonymousClass1yZ.m13969B(parcel, Bundle.CREATOR));
                break;
            case 9:
                jC((Bundle) AnonymousClass1yZ.m13969B(parcel, Bundle.CREATOR));
                break;
            case 10:
                HG((Bundle) AnonymousClass1yZ.m13969B(parcel, Bundle.CREATOR));
                break;
            case 11:
                KB((Bundle) AnonymousClass1yZ.m13969B(parcel, Bundle.CREATOR));
                break;
            default:
                z = false;
                i2 = 1251302184;
                break;
        }
        z = true;
        i2 = 1887610615;
        AnonymousClass0cQ.H(this, i2, I);
        return z;
    }
}
