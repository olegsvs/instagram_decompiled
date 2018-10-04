package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.zzy;

/* renamed from: X.5g3 */
public final class AnonymousClass5g3 implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        zzy[] zzyArr = null;
        long j = 0;
        int i = JsonMappingException.MAX_REFS_TO_LIST;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = AnonymousClass1zA.P(parcel, readInt);
                    break;
                case 2:
                    i3 = AnonymousClass1zA.P(parcel, readInt);
                    break;
                case 3:
                    j = AnonymousClass1zA.Q(parcel, readInt);
                    break;
                case 4:
                    i = AnonymousClass1zA.P(parcel, readInt);
                    break;
                case 5:
                    zzyArr = (zzy[]) AnonymousClass1zA.L(parcel, readInt, zzy.CREATOR);
                    break;
                default:
                    AnonymousClass1zA.K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.G(parcel, O);
        return new LocationAvailability(i, i2, i3, j, zzyArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
