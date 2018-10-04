package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.5f9 */
public final class AnonymousClass5f9 implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 != JsonMappingException.MAX_REFS_TO_LIST) {
                switch (i2) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) AnonymousClass1zA.I(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = AnonymousClass1zA.N(parcel, readInt);
                        break;
                    case 3:
                        z2 = AnonymousClass1zA.N(parcel, readInt);
                        break;
                    case 4:
                        strArr = AnonymousClass1zA.B(parcel, readInt);
                        break;
                    case 5:
                        z3 = AnonymousClass1zA.N(parcel, readInt);
                        break;
                    case 6:
                        str = AnonymousClass1zA.W(parcel, readInt);
                        break;
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        str2 = AnonymousClass1zA.W(parcel, readInt);
                        break;
                    default:
                        AnonymousClass1zA.K(parcel, readInt);
                        break;
                }
            }
            i = AnonymousClass1zA.P(parcel, readInt);
        }
        AnonymousClass1zA.G(parcel, O);
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }
}
