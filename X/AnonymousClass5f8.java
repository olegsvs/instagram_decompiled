package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.5f8 */
public final class AnonymousClass5f8 implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 != JsonMappingException.MAX_REFS_TO_LIST) {
                switch (i2) {
                    case 1:
                        z = AnonymousClass1zA.N(parcel, readInt);
                        break;
                    case 2:
                        strArr = AnonymousClass1zA.B(parcel, readInt);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) AnonymousClass1zA.I(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) AnonymousClass1zA.I(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = AnonymousClass1zA.N(parcel, readInt);
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
        return new CredentialRequest(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialRequest[i];
    }
}
