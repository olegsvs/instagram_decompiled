package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzbr;
import com.google.android.gms.internal.zzctx;

/* renamed from: X.1hs */
public final class AnonymousClass1hs implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        zzbr zzbr = null;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass1zA.P(parcel, readInt);
                    break;
                case 2:
                    connectionResult = (ConnectionResult) AnonymousClass1zA.I(parcel, readInt, ConnectionResult.CREATOR);
                    break;
                case 3:
                    zzbr = (zzbr) AnonymousClass1zA.I(parcel, readInt, zzbr.CREATOR);
                    break;
                default:
                    AnonymousClass1zA.K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.G(parcel, O);
        return new zzctx(i, connectionResult, zzbr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzctx[i];
    }
}
