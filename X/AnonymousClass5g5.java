package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* renamed from: X.5g5 */
public final class AnonymousClass5g5 implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        List list = LocationResult.f68045C;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                AnonymousClass1zA.K(parcel, readInt);
            } else {
                list = AnonymousClass1zA.M(parcel, readInt, Location.CREATOR);
            }
        }
        AnonymousClass1zA.G(parcel, O);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
