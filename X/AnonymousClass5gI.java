package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.safetynet.HarmfulAppsData;

/* renamed from: X.5gI */
public final class AnonymousClass5gI implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        String str = null;
        byte[] bArr = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = AnonymousClass1zA.W(parcel, readInt);
                    break;
                case 3:
                    bArr = AnonymousClass1zA.Z(parcel, readInt);
                    break;
                case 4:
                    i = AnonymousClass1zA.P(parcel, readInt);
                    break;
                default:
                    AnonymousClass1zA.K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.G(parcel, O);
        return new HarmfulAppsData(str, bArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HarmfulAppsData[i];
    }
}
