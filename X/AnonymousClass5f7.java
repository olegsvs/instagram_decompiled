package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;

/* renamed from: X.5f7 */
public final class AnonymousClass5f7 implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 != JsonMappingException.MAX_REFS_TO_LIST) {
                switch (i3) {
                    case 1:
                        z = AnonymousClass1zA.N(parcel, readInt);
                        break;
                    case 2:
                        z2 = AnonymousClass1zA.N(parcel, readInt);
                        break;
                    case 3:
                        z3 = AnonymousClass1zA.N(parcel, readInt);
                        break;
                    case 4:
                        i2 = AnonymousClass1zA.P(parcel, readInt);
                        break;
                    default:
                        AnonymousClass1zA.K(parcel, readInt);
                        break;
                }
            }
            i = AnonymousClass1zA.P(parcel, readInt);
        }
        AnonymousClass1zA.G(parcel, O);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
