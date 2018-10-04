package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.DetectedActivity;

/* renamed from: X.5g1 */
public final class AnonymousClass5g1 implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass1zA.P(parcel, readInt);
                    break;
                case 2:
                    i2 = AnonymousClass1zA.P(parcel, readInt);
                    break;
                default:
                    AnonymousClass1zA.K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.G(parcel, O);
        return new DetectedActivity(i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DetectedActivity[i];
    }
}
